package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Looper;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.FilterShaders;
import org.telegram.ui.Stories.recorder.StoryEntry;
public class FilterGLThread extends DispatchQueue {
    private boolean blurred;
    private Bitmap currentBitmap;
    private Runnable drawRunnable;
    private EGL10 egl10;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;
    private FilterShaders filterShaders;
    private boolean filterTextureAvailable;
    private boolean initied;
    private long lastRenderCallTime;
    private int orientation;
    private int renderBufferHeight;
    private int renderBufferWidth;
    private boolean renderDataSet;
    private int simpleInputTexCoordHandle;
    private int simplePositionHandle;
    private int simpleShaderProgram;
    private int simpleSourceImageHandle;
    private volatile int surfaceHeight;
    private SurfaceTexture surfaceTexture;
    private volatile int surfaceWidth;
    private FloatBuffer textureBuffer;
    private boolean updateSurface;
    private FilterGLThreadVideoDelegate videoDelegate;
    private boolean videoFrameAvailable;
    private int videoHeight;
    private SurfaceTexture videoSurfaceTexture;
    private int[] videoTexture;
    private float[] videoTextureMatrix;
    private int videoWidth;

    public interface FilterGLThreadVideoDelegate {
        void onVideoSurfaceCreated(SurfaceTexture surfaceTexture);
    }

    public FilterGLThread(SurfaceTexture surfaceTexture, Bitmap bitmap, int i, boolean z, StoryEntry.HDRInfo hDRInfo, boolean z2) {
        super("PhotoFilterGLThread", false);
        this.videoTextureMatrix = new float[16];
        this.videoTexture = new int[1];
        this.drawRunnable = new Runnable() {
            @Override
            public void run() {
                if (FilterGLThread.this.initied) {
                    FilterGLThread.this.makeCurrentContext();
                    if (FilterGLThread.this.updateSurface) {
                        FilterGLThread.this.videoSurfaceTexture.updateTexImage();
                        FilterGLThread.this.videoSurfaceTexture.getTransformMatrix(FilterGLThread.this.videoTextureMatrix);
                        FilterGLThread.this.setRenderData();
                        FilterGLThread.this.updateSurface = false;
                        FilterGLThread.this.filterShaders.onVideoFrameUpdate(FilterGLThread.this.videoTextureMatrix);
                        FilterGLThread.this.videoFrameAvailable = true;
                    }
                    if (FilterGLThread.this.renderDataSet) {
                        if (FilterGLThread.this.videoDelegate == null || FilterGLThread.this.videoFrameAvailable) {
                            GLES20.glViewport(0, 0, FilterGLThread.this.renderBufferWidth, FilterGLThread.this.renderBufferHeight);
                            FilterGLThread.this.filterShaders.drawSkinSmoothPass();
                            FilterGLThread.this.filterShaders.drawEnhancePass();
                            if (FilterGLThread.this.videoDelegate == null) {
                                FilterGLThread.this.filterShaders.drawSharpenPass();
                            }
                            FilterGLThread.this.filterShaders.drawCustomParamsPass();
                            FilterGLThread filterGLThread = FilterGLThread.this;
                            filterGLThread.blurred = filterGLThread.filterShaders.drawBlurPass();
                            FilterGLThread.this.filterTextureAvailable = true;
                        }
                        if (FilterGLThread.this.filterTextureAvailable) {
                            GLES20.glViewport(0, 0, FilterGLThread.this.surfaceWidth, FilterGLThread.this.surfaceHeight);
                            GLES20.glBindFramebuffer(36160, 0);
                            GLES20.glUseProgram(FilterGLThread.this.simpleShaderProgram);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, FilterGLThread.this.filterShaders.getRenderTexture(1 ^ (FilterGLThread.this.blurred ? 1 : 0)));
                            GLES20.glUniform1i(FilterGLThread.this.simpleSourceImageHandle, 0);
                            GLES20.glEnableVertexAttribArray(FilterGLThread.this.simpleInputTexCoordHandle);
                            GLES20.glVertexAttribPointer(FilterGLThread.this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (FilterGLThread.this.textureBuffer != null ? FilterGLThread.this.textureBuffer : FilterGLThread.this.filterShaders.getTextureBuffer()));
                            GLES20.glEnableVertexAttribArray(FilterGLThread.this.simplePositionHandle);
                            GLES20.glVertexAttribPointer(FilterGLThread.this.simplePositionHandle, 2, 5126, false, 8, (Buffer) FilterGLThread.this.filterShaders.getVertexBuffer());
                            GLES20.glDrawArrays(5, 0, 4);
                            FilterGLThread.this.egl10.eglSwapBuffers(FilterGLThread.this.eglDisplay, FilterGLThread.this.eglSurface);
                        }
                    }
                }
            }
        };
        this.surfaceTexture = surfaceTexture;
        this.currentBitmap = bitmap;
        this.orientation = i;
        FilterShaders filterShaders = new FilterShaders(false, hDRInfo);
        this.filterShaders = filterShaders;
        filterShaders.setScaleBitmap(z2);
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (z) {
            float f = fArr[2];
            fArr[2] = fArr[0];
            fArr[0] = f;
            float f2 = fArr[6];
            fArr[6] = fArr[4];
            fArr[4] = f2;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.textureBuffer = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.textureBuffer.position(0);
        start();
    }

    public FilterGLThread(SurfaceTexture surfaceTexture, FilterGLThreadVideoDelegate filterGLThreadVideoDelegate, StoryEntry.HDRInfo hDRInfo) {
        super("VideoFilterGLThread", false);
        this.videoTextureMatrix = new float[16];
        this.videoTexture = new int[1];
        this.drawRunnable = new Runnable() {
            @Override
            public void run() {
                if (FilterGLThread.this.initied) {
                    FilterGLThread.this.makeCurrentContext();
                    if (FilterGLThread.this.updateSurface) {
                        FilterGLThread.this.videoSurfaceTexture.updateTexImage();
                        FilterGLThread.this.videoSurfaceTexture.getTransformMatrix(FilterGLThread.this.videoTextureMatrix);
                        FilterGLThread.this.setRenderData();
                        FilterGLThread.this.updateSurface = false;
                        FilterGLThread.this.filterShaders.onVideoFrameUpdate(FilterGLThread.this.videoTextureMatrix);
                        FilterGLThread.this.videoFrameAvailable = true;
                    }
                    if (FilterGLThread.this.renderDataSet) {
                        if (FilterGLThread.this.videoDelegate == null || FilterGLThread.this.videoFrameAvailable) {
                            GLES20.glViewport(0, 0, FilterGLThread.this.renderBufferWidth, FilterGLThread.this.renderBufferHeight);
                            FilterGLThread.this.filterShaders.drawSkinSmoothPass();
                            FilterGLThread.this.filterShaders.drawEnhancePass();
                            if (FilterGLThread.this.videoDelegate == null) {
                                FilterGLThread.this.filterShaders.drawSharpenPass();
                            }
                            FilterGLThread.this.filterShaders.drawCustomParamsPass();
                            FilterGLThread filterGLThread = FilterGLThread.this;
                            filterGLThread.blurred = filterGLThread.filterShaders.drawBlurPass();
                            FilterGLThread.this.filterTextureAvailable = true;
                        }
                        if (FilterGLThread.this.filterTextureAvailable) {
                            GLES20.glViewport(0, 0, FilterGLThread.this.surfaceWidth, FilterGLThread.this.surfaceHeight);
                            GLES20.glBindFramebuffer(36160, 0);
                            GLES20.glUseProgram(FilterGLThread.this.simpleShaderProgram);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, FilterGLThread.this.filterShaders.getRenderTexture(1 ^ (FilterGLThread.this.blurred ? 1 : 0)));
                            GLES20.glUniform1i(FilterGLThread.this.simpleSourceImageHandle, 0);
                            GLES20.glEnableVertexAttribArray(FilterGLThread.this.simpleInputTexCoordHandle);
                            GLES20.glVertexAttribPointer(FilterGLThread.this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (FilterGLThread.this.textureBuffer != null ? FilterGLThread.this.textureBuffer : FilterGLThread.this.filterShaders.getTextureBuffer()));
                            GLES20.glEnableVertexAttribArray(FilterGLThread.this.simplePositionHandle);
                            GLES20.glVertexAttribPointer(FilterGLThread.this.simplePositionHandle, 2, 5126, false, 8, (Buffer) FilterGLThread.this.filterShaders.getVertexBuffer());
                            GLES20.glDrawArrays(5, 0, 4);
                            FilterGLThread.this.egl10.eglSwapBuffers(FilterGLThread.this.eglDisplay, FilterGLThread.this.eglSurface);
                        }
                    }
                }
            }
        };
        this.surfaceTexture = surfaceTexture;
        this.videoDelegate = filterGLThreadVideoDelegate;
        this.filterShaders = new FilterShaders(true, hDRInfo);
        start();
    }

    public void updateHDRInfo(final StoryEntry.HDRInfo hDRInfo) {
        postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilterGLThread.this.lambda$updateHDRInfo$0(hDRInfo);
            }
        });
    }

    public void lambda$updateHDRInfo$0(StoryEntry.HDRInfo hDRInfo) {
        makeCurrentContext();
        this.filterShaders.updateHDRInfo(hDRInfo);
    }

    public void lambda$setFilterGLThreadDelegate$1(FilterShaders.FilterShadersDelegate filterShadersDelegate) {
        this.filterShaders.setDelegate(filterShadersDelegate);
    }

    public void setFilterGLThreadDelegate(final FilterShaders.FilterShadersDelegate filterShadersDelegate) {
        postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilterGLThread.this.lambda$setFilterGLThreadDelegate$1(filterShadersDelegate);
            }
        });
    }

    private boolean initGL() {
        int i;
        int i2;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.egl10 = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.eglDisplay = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("eglGetDisplay failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
            }
            finish();
            return false;
        }
        if (!this.egl10.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("eglInitialize failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
            }
            finish();
            return false;
        }
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("eglChooseConfig failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
            }
            finish();
            return false;
        } else if (iArr[0] > 0) {
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            this.eglContext = eglCreateContext;
            if (eglCreateContext == null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglCreateContext failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                finish();
                return false;
            }
            SurfaceTexture surfaceTexture = this.surfaceTexture;
            if (surfaceTexture instanceof SurfaceTexture) {
                EGLSurface eglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, eGLConfig, surfaceTexture, null);
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("createWindowSurface failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                    }
                    finish();
                    return false;
                } else if (!this.egl10.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                    }
                    finish();
                    return false;
                } else {
                    int loadShader = FilterShaders.loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                    int loadShader2 = FilterShaders.loadShader(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
                    if (loadShader == 0 || loadShader2 == 0) {
                        return false;
                    }
                    int glCreateProgram = GLES20.glCreateProgram();
                    this.simpleShaderProgram = glCreateProgram;
                    GLES20.glAttachShader(glCreateProgram, loadShader);
                    GLES20.glAttachShader(this.simpleShaderProgram, loadShader2);
                    GLES20.glBindAttribLocation(this.simpleShaderProgram, 0, "position");
                    GLES20.glBindAttribLocation(this.simpleShaderProgram, 1, "inputTexCoord");
                    GLES20.glLinkProgram(this.simpleShaderProgram);
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(this.simpleShaderProgram, 35714, iArr2, 0);
                    if (iArr2[0] == 0) {
                        GLES20.glDeleteProgram(this.simpleShaderProgram);
                        this.simpleShaderProgram = 0;
                    } else {
                        this.simplePositionHandle = GLES20.glGetAttribLocation(this.simpleShaderProgram, "position");
                        this.simpleInputTexCoordHandle = GLES20.glGetAttribLocation(this.simpleShaderProgram, "inputTexCoord");
                        this.simpleSourceImageHandle = GLES20.glGetUniformLocation(this.simpleShaderProgram, "sourceImage");
                    }
                    Bitmap bitmap = this.currentBitmap;
                    if (bitmap != null) {
                        i = bitmap.getWidth();
                        i2 = this.currentBitmap.getHeight();
                    } else {
                        i = this.videoWidth;
                        i2 = this.videoHeight;
                    }
                    int i3 = i;
                    int i4 = i2;
                    if (this.videoDelegate != null) {
                        GLES20.glGenTextures(1, this.videoTexture, 0);
                        Matrix.setIdentityM(this.videoTextureMatrix, 0);
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.videoTexture[0]);
                        this.videoSurfaceTexture = surfaceTexture2;
                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                            @Override
                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                FilterGLThread.this.lambda$initGL$2(surfaceTexture3);
                            }
                        });
                        GLES20.glBindTexture(36197, this.videoTexture[0]);
                        GLES20.glTexParameterf(36197, 10240, 9729.0f);
                        GLES20.glTexParameterf(36197, 10241, 9728.0f);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                FilterGLThread.this.lambda$initGL$3();
                            }
                        });
                    }
                    if (!this.filterShaders.create()) {
                        finish();
                        return false;
                    }
                    if (i3 != 0 && i4 != 0) {
                        this.filterShaders.setRenderData(this.currentBitmap, this.orientation, this.videoTexture[0], i3, i4);
                        this.renderDataSet = true;
                        this.renderBufferWidth = this.filterShaders.getRenderBufferWidth();
                        this.renderBufferHeight = this.filterShaders.getRenderBufferHeight();
                    }
                    return true;
                }
            }
            finish();
            return false;
        } else {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("eglConfig not initialized");
            }
            finish();
            return false;
        }
    }

    public void lambda$initGL$2(SurfaceTexture surfaceTexture) {
        requestRender(false, true, true);
    }

    public void lambda$initGL$3() {
        this.videoDelegate.onVideoSurfaceCreated(this.videoSurfaceTexture);
    }

    public void setVideoSize(final int i, final int i2) {
        postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilterGLThread.this.lambda$setVideoSize$4(i, i2);
            }
        });
    }

    public void lambda$setVideoSize$4(int i, int i2) {
        if (this.videoWidth == i && this.videoHeight == i2) {
            return;
        }
        this.videoWidth = i;
        this.videoHeight = i2;
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        int i3 = 1920;
        if (devicePerformanceClass != 1) {
            if (devicePerformanceClass != 2) {
                i3 = 1280;
            } else {
                android.graphics.Point point = AndroidUtilities.displaySize;
                i3 = Math.min(1920, Math.max(point.x, point.y));
            }
        }
        int i4 = this.videoWidth;
        if (i4 > i3 || this.videoHeight > i3) {
            int i5 = this.videoHeight;
            if (i4 > i5) {
                this.videoHeight = (int) (i5 / (i3 / i4));
                this.videoWidth = i3;
            } else {
                this.videoWidth = (int) (i4 / (i3 / i5));
                this.videoHeight = i3;
            }
        }
        this.renderDataSet = false;
        setRenderData();
        this.drawRunnable.run();
    }

    public void finish() {
        this.currentBitmap = null;
        if (this.eglSurface != null) {
            EGL10 egl10 = this.egl10;
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.eglSurface = null;
        }
        EGLContext eGLContext = this.eglContext;
        if (eGLContext != null) {
            this.egl10.eglDestroyContext(this.eglDisplay, eGLContext);
            this.eglContext = null;
        }
        EGLDisplay eGLDisplay2 = this.eglDisplay;
        if (eGLDisplay2 != null) {
            this.egl10.eglTerminate(eGLDisplay2);
            this.eglDisplay = null;
        }
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public void setRenderData() {
        int i;
        int i2;
        if (this.renderDataSet || (i = this.videoWidth) <= 0 || (i2 = this.videoHeight) <= 0) {
            return;
        }
        this.filterShaders.setRenderData(this.currentBitmap, this.orientation, this.videoTexture[0], i, i2);
        this.renderDataSet = true;
        this.renderBufferWidth = this.filterShaders.getRenderBufferWidth();
        this.renderBufferHeight = this.filterShaders.getRenderBufferHeight();
    }

    public void makeCurrentContext() {
        if (this.eglContext.equals(this.egl10.eglGetCurrentContext()) && this.eglSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = this.egl10;
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = this.eglSurface;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext) || !BuildVars.LOGS_ENABLED) {
            return;
        }
        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
    }

    private Bitmap getRenderBufferBitmap() {
        int i;
        int i2 = this.renderBufferWidth;
        if (i2 == 0 || (i = this.renderBufferHeight) == 0) {
            return null;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * i * 4);
        GLES20.glReadPixels(0, 0, this.renderBufferWidth, this.renderBufferHeight, 6408, 5121, allocateDirect);
        Bitmap createBitmap = Bitmap.createBitmap(this.renderBufferWidth, this.renderBufferHeight, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        return createBitmap;
    }

    public Bitmap getTexture() {
        if (this.initied && isAlive()) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final Bitmap[] bitmapArr = new Bitmap[1];
            try {
                if (postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        FilterGLThread.this.lambda$getTexture$5(bitmapArr, countDownLatch);
                    }
                })) {
                    countDownLatch.await();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public void lambda$getTexture$5(Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        GLES20.glBindFramebuffer(36160, this.filterShaders.getRenderFrameBuffer());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.filterShaders.getRenderTexture(!this.blurred ? 1 : 0), 0);
        GLES20.glClear(0);
        bitmapArr[0] = getRenderBufferBitmap();
        countDownLatch.countDown();
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClear(0);
    }

    public void shutdown() {
        postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilterGLThread.this.lambda$shutdown$6();
            }
        });
    }

    public void lambda$shutdown$6() {
        finish();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    public void setSurfaceTextureSize(final int i, final int i2) {
        postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilterGLThread.this.lambda$setSurfaceTextureSize$7(i, i2);
            }
        });
    }

    public void lambda$setSurfaceTextureSize$7(int i, int i2) {
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
    }

    @Override
    public void run() {
        this.initied = initGL();
        super.run();
    }

    public void requestRender(boolean z) {
        requestRender(z, false, false);
    }

    public void requestRender(final boolean z, final boolean z2, final boolean z3) {
        postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilterGLThread.this.lambda$requestRender$8(z, z3, z2);
            }
        });
    }

    public void lambda$requestRender$8(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.filterShaders.requestUpdateBlurTexture();
        }
        if (z2) {
            this.updateSurface = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z3 || Math.abs(this.lastRenderCallTime - currentTimeMillis) > 30) {
            this.lastRenderCallTime = currentTimeMillis;
            this.drawRunnable.run();
        }
    }
}
