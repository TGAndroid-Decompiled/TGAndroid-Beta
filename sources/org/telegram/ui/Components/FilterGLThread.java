package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Locale;
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
import org.telegram.messenger.camera.CameraView$CameraGLThread$$ExternalSyntheticOutline0;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda25;
import org.telegram.ui.Stories.recorder.StoryEntry;

public final class FilterGLThread extends DispatchQueue {
    public final BlurringShader.BlurManager blurManager;
    public boolean blurred;
    public Bitmap currentBitmap;
    public final Runnable drawRunnable;
    public EGL10 egl10;
    public EGLContext eglContext;
    public EGLDisplay eglDisplay;
    public EGLSurface eglSurface;
    public final FilterShaders filterShaders;
    public boolean filterTextureAvailable;
    public boolean initied;
    public final boolean isVideo;
    public long lastRenderCallTime;
    public final int orientation;
    public int renderBufferHeight;
    public int renderBufferWidth;
    public boolean renderDataSet;
    public int simpleInputTexCoordHandle;
    public int simpleOESInputTexCoordHandle;
    public int simpleOESMatrixHandle;
    public int simpleOESPositionHandle;
    public int simpleOESShaderProgram;
    public int simpleOESSourceImageHandle;
    public int simplePositionHandle;
    public int simpleShaderProgram;
    public int simpleSourceImageHandle;
    public volatile int surfaceHeight;
    public final SurfaceTexture surfaceTexture;
    public volatile int surfaceWidth;
    public final FloatBuffer textureBuffer;
    public BlurringShader uiBlur;
    public boolean uiBlurEnabled;
    public boolean updateSurface;
    public final VideoEditTextureView$$ExternalSyntheticLambda1 videoDelegate;
    public boolean videoFrameAvailable;
    public int videoHeight;
    public SurfaceTexture videoSurfaceTexture;
    public final int[] videoTexture;
    public final float[] videoTextureMatrix;
    public int videoWidth;

    public FilterGLThread(SurfaceTexture surfaceTexture, Bitmap bitmap, int i, boolean z, boolean z2, BlurringShader.BlurManager blurManager, int i2, int i3) {
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
            BlurringShader blurringShader = new BlurringShader();
            this.uiBlur = blurringShader;
            blurringShader.setBlurManager(blurManager);
        }
        this.isVideo = false;
        FilterShaders filterShaders = new FilterShaders(false, null);
        this.filterShaders = filterShaders;
        filterShaders.scaleBitmap = z2;
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
        floatBufferAsFloatBuffer.position(0);
        start();
    }

    public final void finish() {
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
                synchronized (blurManager.contextLock) {
                    try {
                        if (blurManager.context == eGLContext) {
                            blurManager.context = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
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

    public final void makeCurrentContext() {
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

    public final void requestRender(boolean z, boolean z2, boolean z3) {
        postRunnable(new LoginActivity$$ExternalSyntheticLambda25(this, z, z3, z2, 1));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int width;
        int height;
        BlurringShader blurringShader;
        int i = 2;
        boolean z = false;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.egl10 = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.eglDisplay = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (this.egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                BlurringShader.BlurManager blurManager = this.blurManager;
                if (blurManager != null) {
                    synchronized (blurManager.contextLock) {
                        try {
                            eGLContext = blurManager.context;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eGLContextEglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, eGLConfig, eGLContext, iArr2);
                this.eglContext = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    BlurringShader.BlurManager blurManager2 = this.blurManager;
                    if (blurManager2 != null) {
                        blurManager2.acquiredContext(eGLContextEglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.surfaceTexture;
                    if (surfaceTexture != null) {
                        EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, eGLConfig, surfaceTexture, null);
                        this.eglSurface = eGLSurfaceEglCreateWindowSurface;
                        if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (BuildVars.LOGS_ENABLED) {
                                CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.egl10.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.eglContext)) {
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
                                    int i2 = width;
                                    int i3 = height;
                                    if (this.videoDelegate != null) {
                                        GLES20.glGenTextures(1, this.videoTexture, 0);
                                        Matrix.setIdentityM(this.videoTextureMatrix, 0);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.videoTexture[0]);
                                        this.videoSurfaceTexture = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new FilterGLThread$$ExternalSyntheticLambda8(this, 0));
                                        GLES20.glBindTexture(36197, this.videoTexture[0]);
                                        GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                        GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda2(this, i));
                                    }
                                    if (this.uiBlurEnabled && (blurringShader = this.uiBlur) != null && !blurringShader.setup(this.surfaceWidth / this.surfaceHeight, this.blurManager.padding)) {
                                        FileLog.e("Failed to create uiBlurFramebuffer");
                                        this.uiBlurEnabled = false;
                                        this.uiBlur = null;
                                    }
                                    if (this.filterShaders.create()) {
                                        if (i2 != 0 && i3 != 0) {
                                            this.filterShaders.setRenderData(this.currentBitmap, this.orientation, this.videoTexture[0], i2, i3);
                                            this.renderDataSet = true;
                                            FilterShaders filterShaders = this.filterShaders;
                                            this.renderBufferWidth = filterShaders.renderBufferWidth;
                                            this.renderBufferHeight = filterShaders.renderBufferHeight;
                                        }
                                        z = true;
                                    } else {
                                        finish();
                                    }
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglConfig not initialized");
                }
                finish();
            }
        } else {
            if (BuildVars.LOGS_ENABLED) {
                CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglInitialize failed "));
            }
            finish();
        }
        this.initied = z;
        super.run();
    }

    public final void setFilterGLThreadDelegate(FilterShaders.FilterShadersDelegate filterShadersDelegate) {
        postRunnable(new EmojiView$2$$ExternalSyntheticLambda1(27, this, filterShadersDelegate));
    }

    public final void setRenderData() {
        int i;
        int i2;
        if (this.renderDataSet || (i = this.videoWidth) <= 0 || (i2 = this.videoHeight) <= 0) {
            return;
        }
        this.filterShaders.setRenderData(this.currentBitmap, this.orientation, this.videoTexture[0], i, i2);
        this.renderDataSet = true;
        FilterShaders filterShaders = this.filterShaders;
        this.renderBufferWidth = filterShaders.renderBufferWidth;
        this.renderBufferHeight = filterShaders.renderBufferHeight;
    }

    public final boolean setupVideoShader(StoryEntry.HDRInfo hDRInfo) {
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

    public final void shutdown() {
        postRunnable(new FilterGLThread$$ExternalSyntheticLambda2(this, 0));
    }

    public final void updateUiBlurGradient(int i, int i2) {
        if (this.uiBlur == null) {
            return;
        }
        postRunnable(new FilterGLThread$$ExternalSyntheticLambda0(this, i, i2, 2));
    }

    public FilterGLThread(SurfaceTexture surfaceTexture, VideoEditTextureView$$ExternalSyntheticLambda1 videoEditTextureView$$ExternalSyntheticLambda1, StoryEntry.HDRInfo hDRInfo, BlurringShader.BlurManager blurManager, int i, int i2) {
        super("VideoFilterGLThread", false);
        this.videoTextureMatrix = new float[16];
        this.videoTexture = new int[1];
        this.drawRunnable = new FilterGLThread$$ExternalSyntheticLambda2(this, 1);
        this.surfaceTexture = surfaceTexture;
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
        this.videoDelegate = videoEditTextureView$$ExternalSyntheticLambda1;
        this.blurManager = blurManager;
        boolean z = blurManager != null;
        this.uiBlurEnabled = z;
        if (z) {
            BlurringShader blurringShader = new BlurringShader();
            this.uiBlur = blurringShader;
            blurringShader.setBlurManager(blurManager);
        }
        this.isVideo = true;
        this.filterShaders = new FilterShaders(true, hDRInfo);
        start();
    }
}
