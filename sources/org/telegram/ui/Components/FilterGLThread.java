package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Looper;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Locale;
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
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.CameraView$CameraGLThread$$ExternalSyntheticOutline0;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda40;
import org.telegram.ui.Stories.recorder.StoryEntry;

public class FilterGLThread extends DispatchQueue {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private final BlurringShader.BlurManager blurManager;
    private boolean blurred;
    private Bitmap currentBitmap;
    private final Runnable drawRunnable;
    private EGL10 egl10;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;
    private FilterShaders filterShaders;
    private boolean filterTextureAvailable;
    private boolean initied;
    private boolean isVideo;
    private long lastRenderCallTime;
    private int orientation;
    private int renderBufferHeight;
    private int renderBufferWidth;
    private boolean renderDataSet;
    private int simpleInputTexCoordHandle;
    private int simpleOESInputTexCoordHandle;
    private int simpleOESMatrixHandle;
    private int simpleOESPositionHandle;
    private int simpleOESShaderProgram;
    private int simpleOESSourceImageHandle;
    private int simplePositionHandle;
    private int simpleShaderProgram;
    private int simpleSourceImageHandle;
    private volatile int surfaceHeight;
    private SurfaceTexture surfaceTexture;
    private volatile int surfaceWidth;
    private FloatBuffer textureBuffer;
    private BlurringShader uiBlur;
    private boolean uiBlurEnabled;
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

    public FilterGLThread(SurfaceTexture surfaceTexture, Bitmap bitmap, int i, boolean z, StoryEntry.HDRInfo hDRInfo, boolean z2, BlurringShader.BlurManager blurManager, int i2, int i3) {
        super("PhotoFilterGLThread", false);
        this.videoTextureMatrix = new float[16];
        this.videoTexture = new int[1];
        this.drawRunnable = new FilterGLThread$$ExternalSyntheticLambda2(this, 1);
        this.surfaceTexture = surfaceTexture;
        this.surfaceWidth = i2;
        this.surfaceHeight = i3;
        this.currentBitmap = bitmap;
        this.orientation = i;
        this.blurManager = blurManager;
        boolean z3 = blurManager != null;
        this.uiBlurEnabled = z3;
        if (z3) {
            BlurringShader blurringShader = new BlurringShader(this);
            this.uiBlur = blurringShader;
            blurringShader.setBlurManager(blurManager);
        }
        this.isVideo = false;
        FilterShaders filterShaders = new FilterShaders(false, hDRInfo);
        this.filterShaders = filterShaders;
        filterShaders.setScaleBitmap(z2);
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (z) {
            fArr[2] = 0.0f;
            fArr[0] = 1.0f;
            fArr[6] = 0.0f;
            fArr[4] = 1.0f;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.textureBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.textureBuffer.position(0);
        start();
    }

    private Bitmap getRenderBufferBitmap() {
        int i;
        int i2 = this.renderBufferWidth;
        if (i2 == 0 || (i = this.renderBufferHeight) == 0) {
            return null;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2 * i * 4);
        GLES20.glReadPixels(0, 0, this.renderBufferWidth, this.renderBufferHeight, 6408, 5121, byteBufferAllocateDirect);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.renderBufferWidth, this.renderBufferHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
        return bitmapCreateBitmap;
    }

    private boolean initGL() {
        int width;
        int height;
        BlurringShader blurringShader;
        int i = 2;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.egl10 = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.eglDisplay = eGLDisplayEglGetDisplay;
        int i2 = 0;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
            return false;
        }
        if (!this.egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglInitialize failed "));
            }
            finish();
            return false;
        }
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
            if (BuildVars.LOGS_ENABLED) {
                CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglChooseConfig failed "));
            }
            finish();
            return false;
        }
        if (iArr[0] <= 0) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("eglConfig not initialized");
            }
            finish();
            return false;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        int[] iArr2 = {12440, 2, 12344};
        BlurringShader.BlurManager blurManager = this.blurManager;
        EGLContext eGLContextEglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, eGLConfig, blurManager != null ? blurManager.getParentContext() : EGL10.EGL_NO_CONTEXT, iArr2);
        this.eglContext = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == null) {
            if (BuildVars.LOGS_ENABLED) {
                CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglCreateContext failed "));
            }
            finish();
            return false;
        }
        BlurringShader.BlurManager blurManager2 = this.blurManager;
        if (blurManager2 != null) {
            blurManager2.acquiredContext(eGLContextEglCreateContext);
        }
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture == null) {
            finish();
            return false;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, eGLConfig, surfaceTexture, null);
        this.eglSurface = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
            if (BuildVars.LOGS_ENABLED) {
                CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("createWindowSurface failed "));
            }
            finish();
            return false;
        }
        if (!this.egl10.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.eglContext)) {
            if (BuildVars.LOGS_ENABLED) {
                CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglMakeCurrent failed "));
            }
            finish();
            return false;
        }
        int iLoadShader = FilterShaders.loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
        int iLoadShader2 = FilterShaders.loadShader(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
        if (iLoadShader != 0 && iLoadShader2 != 0) {
            int iGlCreateProgram = GLES20.glCreateProgram();
            this.simpleShaderProgram = iGlCreateProgram;
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
            GLES20.glAttachShader(this.simpleShaderProgram, iLoadShader2);
            GLES20.glBindAttribLocation(this.simpleShaderProgram, 0, "position");
            GLES20.glBindAttribLocation(this.simpleShaderProgram, 1, "inputTexCoord");
            GLES20.glLinkProgram(this.simpleShaderProgram);
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(this.simpleShaderProgram, 35714, iArr3, 0);
            if (iArr3[0] == 0) {
                GLES20.glDeleteProgram(this.simpleShaderProgram);
                this.simpleShaderProgram = 0;
            } else {
                this.simplePositionHandle = GLES20.glGetAttribLocation(this.simpleShaderProgram, "position");
                this.simpleInputTexCoordHandle = GLES20.glGetAttribLocation(this.simpleShaderProgram, "inputTexCoord");
                this.simpleSourceImageHandle = GLES20.glGetUniformLocation(this.simpleShaderProgram, "sourceImage");
            }
            if (setupVideoShader(null)) {
                Bitmap bitmap = this.currentBitmap;
                if (bitmap != null) {
                    width = bitmap.getWidth();
                    height = this.currentBitmap.getHeight();
                } else {
                    width = this.videoWidth;
                    height = this.videoHeight;
                }
                int i3 = width;
                int i4 = height;
                if (this.videoDelegate != null) {
                    GLES20.glGenTextures(1, this.videoTexture, 0);
                    Matrix.setIdentityM(this.videoTextureMatrix, 0);
                    SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.videoTexture[0]);
                    this.videoSurfaceTexture = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(new FilterGLThread$$ExternalSyntheticLambda8(this, i2));
                    GLES20.glBindTexture(36197, this.videoTexture[0]);
                    GLES20.glTexParameterf(36197, 10240, 9729.0f);
                    GLES20.glTexParameterf(36197, 10241, 9728.0f);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda2(this, i));
                }
                if (this.uiBlurEnabled && (blurringShader = this.uiBlur) != null && !blurringShader.setup(this.surfaceWidth / this.surfaceHeight, true, this.blurManager.padding)) {
                    FileLog.e("Failed to create uiBlurFramebuffer");
                    this.uiBlurEnabled = false;
                    this.uiBlur = null;
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
        return false;
    }

    public void lambda$getTexture$7(Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        GLES20.glBindFramebuffer(36160, this.filterShaders.getRenderFrameBuffer());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.filterShaders.getRenderTexture(!this.blurred ? 1 : 0), 0);
        GLES20.glClear(0);
        bitmapArr[0] = getRenderBufferBitmap();
        countDownLatch.countDown();
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClear(0);
    }

    public void lambda$initGL$2(SurfaceTexture surfaceTexture) {
        requestRender(false, true, true);
    }

    public void lambda$initGL$3() {
        this.videoDelegate.onVideoSurfaceCreated(this.videoSurfaceTexture);
    }

    public void lambda$new$5() {
        if (this.initied) {
            makeCurrentContext();
            if (this.updateSurface) {
                this.videoSurfaceTexture.updateTexImage();
                this.videoSurfaceTexture.getTransformMatrix(this.videoTextureMatrix);
                setRenderData();
                this.updateSurface = false;
                this.filterShaders.onVideoFrameUpdate(this.videoTextureMatrix);
                this.videoFrameAvailable = true;
            }
            if (this.renderDataSet) {
                if (this.isVideo && this.filterShaders.drawOriginal()) {
                    GLES20.glViewport(0, 0, this.surfaceWidth, this.surfaceHeight);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(this.simpleOESShaderProgram);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, this.videoTexture[0]);
                    GLES20.glUniform1i(this.simpleOESSourceImageHandle, 0);
                    GLES20.glEnableVertexAttribArray(this.simpleOESInputTexCoordHandle);
                    int i = this.simpleOESInputTexCoordHandle;
                    FloatBuffer textureBuffer = this.textureBuffer;
                    if (textureBuffer == null) {
                        textureBuffer = this.filterShaders.getTextureBuffer();
                    }
                    GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, (Buffer) textureBuffer);
                    GLES20.glEnableVertexAttribArray(this.simpleOESPositionHandle);
                    GLES20.glVertexAttribPointer(this.simpleOESPositionHandle, 2, 5126, false, 8, (Buffer) this.filterShaders.getVertexInvertBuffer());
                    GLES20.glUniformMatrix4fv(this.simpleOESMatrixHandle, 1, false, this.videoTextureMatrix, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    this.egl10.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                    BlurringShader blurringShader = this.uiBlur;
                    if (blurringShader != null) {
                        blurringShader.draw(this.videoTextureMatrix, this.videoTexture[0], this.videoWidth, this.videoHeight);
                        return;
                    }
                    return;
                }
                if (this.videoDelegate == null || this.videoFrameAvailable) {
                    GLES20.glViewport(0, 0, this.renderBufferWidth, this.renderBufferHeight);
                    this.filterShaders.drawSkinSmoothPass();
                    this.filterShaders.drawEnhancePass();
                    if (this.videoDelegate == null) {
                        this.filterShaders.drawSharpenPass();
                    }
                    this.filterShaders.drawCustomParamsPass();
                    this.blurred = this.filterShaders.drawBlurPass();
                    this.filterTextureAvailable = true;
                }
                if (this.filterTextureAvailable) {
                    GLES20.glViewport(0, 0, this.surfaceWidth, this.surfaceHeight);
                    GLES20.glBindFramebuffer(36160, 0);
                    int renderTexture = this.filterShaders.getRenderTexture(1 ^ (this.blurred ? 1 : 0));
                    GLES20.glUseProgram(this.simpleShaderProgram);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, renderTexture);
                    GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
                    GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
                    int i2 = this.simpleInputTexCoordHandle;
                    FloatBuffer textureBuffer2 = this.textureBuffer;
                    if (textureBuffer2 == null) {
                        textureBuffer2 = this.filterShaders.getTextureBuffer();
                    }
                    GLES20.glVertexAttribPointer(i2, 2, 5126, false, 8, (Buffer) textureBuffer2);
                    GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
                    GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) this.filterShaders.getVertexBuffer());
                    GLES20.glDrawArrays(5, 0, 4);
                    this.egl10.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                    BlurringShader blurringShader2 = this.uiBlur;
                    if (blurringShader2 != null) {
                        blurringShader2.draw(null, renderTexture, this.renderBufferWidth, this.renderBufferHeight);
                    }
                }
            }
        }
    }

    public void lambda$requestRender$10(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.filterShaders.requestUpdateBlurTexture();
        }
        if (z2) {
            this.updateSurface = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z3 || Math.abs(this.lastRenderCallTime - jCurrentTimeMillis) > 30) {
            this.lastRenderCallTime = jCurrentTimeMillis;
            this.drawRunnable.run();
        }
    }

    public void lambda$setFilterGLThreadDelegate$1(FilterShaders.FilterShadersDelegate filterShadersDelegate) {
        this.filterShaders.setDelegate(filterShadersDelegate);
    }

    public void lambda$setSurfaceTextureSize$9(int i, int i2) {
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
    }

    public void lambda$setVideoSize$4(int i, int i2) {
        int i3;
        if (this.videoWidth == i && this.videoHeight == i2) {
            return;
        }
        this.videoWidth = i;
        this.videoHeight = i2;
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        int iMin = 1920;
        if (devicePerformanceClass != 1) {
            if (devicePerformanceClass != 2) {
                iMin = 720;
            } else {
                Point point = AndroidUtilities.displaySize;
                iMin = Math.min(1920, Math.max(point.x, point.y));
            }
        }
        if (SharedConfig.getDevicePerformanceClass() == 0 && ((i3 = this.videoWidth) > 1280 || this.videoHeight > 1280)) {
            this.videoWidth = i3 / 2;
            this.videoHeight /= 2;
        }
        int i4 = this.videoWidth;
        if (i4 > iMin || this.videoHeight > iMin) {
            int i5 = this.videoHeight;
            if (i4 > i5) {
                this.videoHeight = (int) (i5 / (iMin / i4));
                this.videoWidth = iMin;
            } else {
                this.videoWidth = (int) (i4 / (iMin / i5));
                this.videoHeight = iMin;
            }
        }
        this.renderDataSet = false;
        setRenderData();
        this.drawRunnable.run();
    }

    public void lambda$shutdown$8() {
        finish();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            looperMyLooper.quit();
        }
    }

    public void lambda$updateHDRInfo$0(StoryEntry.HDRInfo hDRInfo) {
        makeCurrentContext();
        setupVideoShader(hDRInfo);
        this.filterShaders.updateHDRInfo(hDRInfo);
    }

    public void lambda$updateUiBlurGradient$6(int i, int i2) {
        this.uiBlur.updateGradient(i, i2);
    }

    private void makeCurrentContext() {
        if (this.eglContext.equals(this.egl10.eglGetCurrentContext()) && this.eglSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = this.egl10;
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = this.eglSurface;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext) || !BuildVars.LOGS_ENABLED) {
            return;
        }
        CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglMakeCurrent failed "));
    }

    private void setRenderData() {
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

    private boolean setupVideoShader(StoryEntry.HDRInfo hDRInfo) {
        String res;
        int iLoadShader;
        int iLoadShader2;
        int hDRType = hDRInfo != null ? hDRInfo.getHDRType() : 0;
        if (hDRType == 1) {
            res = AndroidUtilities.readRes(R.raw.hdr2sdr_hlg);
        } else {
            res = hDRType == 2 ? AndroidUtilities.readRes(R.raw.hdr2sdr_pq) : "";
        }
        if (hDRType != 0) {
            iLoadShader = FilterShaders.loadShader(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            iLoadShader2 = FilterShaders.loadShader(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", res));
        } else {
            iLoadShader = FilterShaders.loadShader(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            iLoadShader2 = FilterShaders.loadShader(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
        }
        if (iLoadShader == 0 || iLoadShader2 == 0) {
            return false;
        }
        int i = this.simpleOESShaderProgram;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.simpleOESShaderProgram = iGlCreateProgram;
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        GLES20.glAttachShader(this.simpleOESShaderProgram, iLoadShader2);
        GLES20.glBindAttribLocation(this.simpleOESShaderProgram, 0, "position");
        GLES20.glBindAttribLocation(this.simpleOESShaderProgram, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.simpleOESShaderProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.simpleOESShaderProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.simpleOESShaderProgram);
            this.simpleOESShaderProgram = 0;
        } else {
            this.simpleOESPositionHandle = GLES20.glGetAttribLocation(this.simpleOESShaderProgram, "position");
            this.simpleOESInputTexCoordHandle = GLES20.glGetAttribLocation(this.simpleOESShaderProgram, "inputTexCoord");
            this.simpleOESSourceImageHandle = GLES20.glGetUniformLocation(this.simpleOESShaderProgram, "sourceImage");
            this.simpleOESMatrixHandle = GLES20.glGetUniformLocation(this.simpleOESShaderProgram, "videoMatrix");
        }
        return true;
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
            BlurringShader.BlurManager blurManager = this.blurManager;
            if (blurManager != null) {
                blurManager.destroyedContext(eGLContext);
            }
            this.egl10.eglDestroyContext(this.eglDisplay, this.eglContext);
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

    public Bitmap getTexture() {
        if (!this.initied || !isAlive()) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            if (postRunnable(new ImageUpdater$$ExternalSyntheticLambda1(this, bitmapArr, countDownLatch, 22))) {
                countDownLatch.await();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return bitmapArr[0];
    }

    public Bitmap getUiBlurBitmap() {
        BlurringShader blurringShader = this.uiBlur;
        if (blurringShader == null) {
            return null;
        }
        return blurringShader.getBitmap();
    }

    public void requestRender(boolean z) {
        requestRender(z, false, false);
    }

    @Override
    public void run() {
        this.initied = initGL();
        super.run();
    }

    public void setFilterGLThreadDelegate(FilterShaders.FilterShadersDelegate filterShadersDelegate) {
        postRunnable(new FilterGLThread$$ExternalSyntheticLambda7(0, this, filterShadersDelegate));
    }

    public void setSurfaceTextureSize(int i, int i2) {
        postRunnable(new FilterGLThread$$ExternalSyntheticLambda0(this, i, i2, 1));
    }

    public void setVideoSize(int i, int i2) {
        postRunnable(new FilterGLThread$$ExternalSyntheticLambda0(this, i, i2, 0));
    }

    public void shutdown() {
        postRunnable(new FilterGLThread$$ExternalSyntheticLambda2(this, 0));
    }

    public void updateHDRInfo(StoryEntry.HDRInfo hDRInfo) {
        postRunnable(new FilterGLThread$$ExternalSyntheticLambda7(24, this, hDRInfo));
    }

    public void updateUiBlurGradient(int i, int i2) {
        if (this.uiBlur == null) {
            return;
        }
        postRunnable(new FilterGLThread$$ExternalSyntheticLambda0(this, i, i2, 2));
    }

    public void updateUiBlurManager(BlurringShader.BlurManager blurManager) {
        BlurringShader blurringShader = this.uiBlur;
        if (blurringShader == null) {
            return;
        }
        blurringShader.setBlurManager(blurManager);
    }

    public void updateUiBlurTransform(android.graphics.Matrix matrix, int i, int i2) {
        BlurringShader blurringShader = this.uiBlur;
        if (blurringShader == null) {
            return;
        }
        blurringShader.updateTransform(matrix, i, i2);
        requestRender(false);
    }

    public void requestRender(boolean z, boolean z2, boolean z3) {
        postRunnable(new LoginActivity$$ExternalSyntheticLambda40(this, z, z3, z2, 1));
    }

    public FilterGLThread(SurfaceTexture surfaceTexture, FilterGLThreadVideoDelegate filterGLThreadVideoDelegate, StoryEntry.HDRInfo hDRInfo, BlurringShader.BlurManager blurManager, int i, int i2) {
        super("VideoFilterGLThread", false);
        this.videoTextureMatrix = new float[16];
        this.videoTexture = new int[1];
        this.drawRunnable = new FilterGLThread$$ExternalSyntheticLambda2(this, 1);
        this.surfaceTexture = surfaceTexture;
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
        this.videoDelegate = filterGLThreadVideoDelegate;
        this.blurManager = blurManager;
        boolean z = blurManager != null;
        this.uiBlurEnabled = z;
        if (z) {
            BlurringShader blurringShader = new BlurringShader(this);
            this.uiBlur = blurringShader;
            blurringShader.setBlurManager(blurManager);
        }
        this.isVideo = true;
        this.filterShaders = new FilterShaders(true, hDRInfo);
        start();
    }
}
