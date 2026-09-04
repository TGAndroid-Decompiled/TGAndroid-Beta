package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.bluetooth.BluetoothAdapter;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Looper;
import android.util.Property;
import android.view.Surface;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
public final class v50 implements Runnable {
    public DispatchQueue B0;
    public int C0;
    public volatile boolean D0;
    public MediaCodec E;
    public MediaCodec F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public final w50 H0;
    public MediaCodec.BufferInfo I;
    public MediaCodec.BufferInfo J;
    public MP4Builder K;
    public long O;
    public boolean Q;
    public volatile g.d T;
    public volatile boolean V;
    public volatile boolean W;
    public volatile int X;
    public volatile q50 Y;
    public long Z;
    public i50 f31096a;
    public boolean f31097a0;
    public File f31098b;
    public long f31099b0;
    public boolean f31100c;
    public int d;
    public long f31102d0;
    public int f31103e;
    public long f31104e0;
    public int f31105f;
    public long f31106f0;
    public boolean f31112l0;
    public int m0;
    public boolean f31113n;
    public int f31114n0;
    public int f31115o0;
    public int f31116p0;
    public int f31117q0;
    public Surface f31118r;
    public int f31119r0;
    public int f31121s0;
    public int f31122t0;
    public int f31123u0;
    public int f31124v0;
    public EGLContext f31125w;
    public EGLConfig f31127x;
    public b50 f31128x0;
    public AudioRecord f31130y0;
    public boolean h = true;
    public EGLDisplay f31120s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f31129y = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long f31101c0 = -1;
    public long f31107g0 = -1;
    public long f31108h0 = -1;
    public long f31109i0 = -1;
    public long f31110j0 = 0;
    public long f31111k0 = -1;
    public Integer f31126w0 = 0;
    public final ArrayBlockingQueue f31131z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final u50 E0 = new u50(this);

    public v50(w50 w50Var) {
        this.H0 = w50Var;
    }

    public static void a(v50 v50Var, boolean z10) {
        int i10;
        long j3;
        int i11;
        String str;
        g(true);
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 3584;
            }
            if (49152 < minBufferSize) {
                i10 = ((minBufferSize / 2048) + 1) * 4096;
            } else {
                i10 = 49152;
            }
            v50Var.f31131z0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                v50Var.f31131z0.add(new k50());
            }
            if (z10) {
                v50Var.f31107g0 = v50Var.f31102d0 + v50Var.f31104e0;
                v50Var.f31111k0 = v50Var.f31109i0 + v50Var.f31110j0;
                v50Var.Q = true;
                j3 = 0;
            } else {
                v50Var.f31107g0 = -1L;
                v50Var.f31111k0 = -1L;
                j3 = 0;
                v50Var.R = 0L;
            }
            v50Var.S = -1L;
            v50Var.O = j3;
            v50Var.P = -1L;
            v50Var.f31108h0 = -1L;
            v50Var.f31101c0 = -1L;
            v50Var.f31102d0 = -1L;
            v50Var.f31106f0 = -1L;
            v50Var.f31109i0 = -1L;
            v50Var.f31097a0 = false;
            v50Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i10);
            v50Var.f31130y0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + v50Var.f31130y0.getChannelCount() + " sample rate = " + v50Var.f31130y0.getSampleRate() + " bufferSize = " + i10);
            }
            v50Var.D0 = false;
            Thread thread = new Thread(v50Var.E0);
            thread.setPriority(10);
            thread.start();
            v50Var.J = new MediaCodec.BufferInfo();
            v50Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(v50Var.H0.f32124a).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            v50Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            v50Var.F.start();
            v50Var.E = MediaCodec.createEncoderByType("video/avc");
            v50Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", v50Var.d, v50Var.f31103e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", v50Var.f31105f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            v50Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            v50Var.f31118r = v50Var.E.createInputSurface();
            v50Var.E.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(v50Var.f31096a);
                v50Var.f31098b = v50Var.f31096a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    v50Var.f31098b = file;
                    if (file.exists()) {
                        v50Var.f31098b.delete();
                    }
                    v50Var.f31100c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(v50Var.f31098b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(v50Var.d, v50Var.f31103e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, v50Var.H0.M, false);
                v50Var.K = createMovie;
                w50 w50Var = v50Var.H0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                w50Var.Q0 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new ah.u(26, v50Var, z10));
            if (v50Var.f31120s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                v50Var.f31120s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (v50Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(v50Var.f31120s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i11 = 0;
                                v50Var.v = EGL14.eglCreateContext(v50Var.f31120s, eGLConfigArr[0], v50Var.f31125w, new int[]{12440, 2, 12344}, 0);
                                v50Var.f31127x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i11 = 0;
                        }
                        EGL14.eglQueryContext(v50Var.f31120s, v50Var.v, 12440, new int[1], i11);
                        if (v50Var.f31129y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(v50Var.f31120s, v50Var.f31127x, v50Var.f31118r, new int[]{12344}, i11);
                            v50Var.f31129y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(v50Var.f31120s, eglCreateWindowSurface, eglCreateWindowSurface, v50Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                b50 b50Var = v50Var.f31128x0;
                                if (b50Var != null) {
                                    b50Var.b();
                                    v50Var.f31128x0 = null;
                                }
                                v50Var.f31128x0 = new b50(v50Var.d, v50Var.f31103e);
                                w50 w50Var2 = v50Var.H0;
                                Size size = w50Var2.f32139i0[0];
                                if (!SharedConfig.deviceIsLow() && w50.b() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(w50Var2.f32124a).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int a2 = w50.a(v50Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int a10 = w50.a(v50Var.H0, 35632, str);
                                if (a2 != 0 && a10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    v50Var.m0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, a2);
                                    GLES20.glAttachShader(v50Var.m0, a10);
                                    GLES20.glLinkProgram(v50Var.m0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(v50Var.m0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(v50Var.m0);
                                        v50Var.m0 = 0;
                                        return;
                                    }
                                    v50Var.f31116p0 = GLES20.glGetAttribLocation(v50Var.m0, "aPosition");
                                    v50Var.f31117q0 = GLES20.glGetAttribLocation(v50Var.m0, "aTextureCoord");
                                    v50Var.f31121s0 = GLES20.glGetUniformLocation(v50Var.m0, "preview");
                                    v50Var.f31119r0 = GLES20.glGetUniformLocation(v50Var.m0, "resolution");
                                    v50Var.f31123u0 = GLES20.glGetUniformLocation(v50Var.m0, "alpha");
                                    v50Var.f31114n0 = GLES20.glGetUniformLocation(v50Var.m0, "uMVPMatrix");
                                    v50Var.f31115o0 = GLES20.glGetUniformLocation(v50Var.m0, "uSTMatrix");
                                    v50Var.f31122t0 = GLES20.glGetUniformLocation(v50Var.m0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    v50Var.f31120s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void b(v50 v50Var, int i10, q50 q50Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = v50Var.H0.N) == null || !videoEditedInfo.needConvert()) && !v50Var.H0.f32130c.c())) {
            if (!v50Var.G0) {
                v50Var.G0 = true;
                AndroidUtilities.runOnUIThread(new zu(13, v50Var, q50Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (v50Var.W && !v50Var.D0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            v50Var.X = i10;
            v50Var.Y = q50Var;
            v50Var.W = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            v50Var.e(true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        MediaCodec mediaCodec = v50Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                v50Var.E.release();
                v50Var.E = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        MediaCodec mediaCodec2 = v50Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                v50Var.F.release();
                v50Var.F = null;
                g(false);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        File file = v50Var.H0.f32128b0;
        if (file != null) {
            file.delete();
            v50Var.H0.f32128b0 = null;
        }
        MP4Builder mP4Builder = v50Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (v50Var.f31100c) {
                if (v50Var.f31096a.exists()) {
                    try {
                        v50Var.f31096a.delete();
                    } catch (Exception e13) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + v50Var.f31096a);
                        FileLog.e(e13);
                    }
                }
                if (!v50Var.f31098b.renameTo(v50Var.f31096a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(v50Var.f31098b, v50Var.f31096a);
                        v50Var.f31098b.delete();
                    } catch (IOException e14) {
                        FileLog.e(e14);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = v50Var.B0) != null) {
            dispatchQueue.cleanupQueue();
            v50Var.B0.recycle();
            v50Var.B0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(v50Var.H0.f32124a).cancelFileUpload(v50Var.f31096a.getAbsolutePath(), false);
            try {
                v50Var.f31098b.delete();
            } catch (Throwable unused) {
            }
            try {
                v50Var.f31096a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !v50Var.G0)) {
                v50Var.G0 = true;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.dm(v50Var, i10, q50Var, 8));
            }
            AndroidUtilities.runOnUIThread(new r50(v50Var, 3));
        }
        EGL14.eglDestroySurface(v50Var.f31120s, v50Var.f31129y);
        v50Var.f31129y = EGL14.EGL_NO_SURFACE;
        Surface surface = v50Var.f31118r;
        if (surface != null) {
            surface.release();
            v50Var.f31118r = null;
        }
        EGLDisplay eGLDisplay = v50Var.f31120s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(v50Var.f31120s, v50Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(v50Var.f31120s);
        }
        v50Var.f31120s = EGL14.EGL_NO_DISPLAY;
        v50Var.v = EGL14.EGL_NO_CONTEXT;
        v50Var.f31127x = null;
        v50Var.T.getClass();
        Looper.myLooper().quit();
        b50 b50Var = v50Var.f31128x0;
        if (b50Var != null) {
            b50Var.b();
            v50Var.f31128x0 = null;
        }
        AndroidUtilities.runOnUIThread(new r50(v50Var, 4));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !de0.f("android.permission.BLUETOOTH_CONNECT")) {
            SharedConfig.recordViaSco = false;
            SharedConfig.saveConfig();
        }
        if ((audioManager.isBluetoothScoAvailableOffCall() && SharedConfig.recordViaSco) || !z10) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                try {
                    if (defaultAdapter.getProfileConnectionState(1) != 2) {
                    }
                    if (!z10 && !audioManager.isBluetoothScoOn()) {
                        audioManager.startBluetoothSco();
                        return;
                    } else if (z10 && audioManager.isBluetoothScoOn()) {
                        audioManager.stopBluetoothSco();
                        return;
                    }
                } catch (SecurityException unused) {
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    if (!z10) {
                        try {
                            if (audioManager.isBluetoothScoOn()) {
                                audioManager.stopBluetoothSco();
                                return;
                            }
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    return;
                }
            }
            if (z10) {
                return;
            }
            if (!z10) {
            }
            if (z10) {
            }
        }
    }

    public final void c(i50 i50Var, long j3, boolean z10) {
        w50 w50Var = this.H0;
        int i10 = w50Var.f32124a;
        long j10 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(i50Var.toString(), w50Var.M, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = i50Var.toString();
                boolean z11 = w50Var.M;
                if (z10) {
                    j10 = i50Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z11, j3, j10);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = i50Var.toString();
        boolean z12 = w50Var.M;
        if (z10) {
            j10 = i50Var.length();
        }
        fileLoader2.checkUploadNewDataAvailable(file2, z12, j3, j10);
    }

    public final void e(boolean z10) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (z10) {
            this.E.signalEndOfInputStream();
        }
        while (true) {
            int dequeueOutputBuffer = this.E.dequeueOutputBuffer(this.I, 10000L);
            byte b10 = 1;
            if (dequeueOutputBuffer == -1) {
                if (!z10 || this.D0) {
                    break;
                }
            } else if (dequeueOutputBuffer == -3) {
                continue;
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.E.getOutputFormat();
                if (this.M == -5) {
                    this.M = this.K.addTrack(outputFormat, false);
                    if (outputFormat.containsKey("prepend-sps-pps-to-idr-frames") && outputFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                        this.G = outputFormat.getByteBuffer("csd-1").limit() + outputFormat.getByteBuffer("csd-0").limit();
                    }
                }
            } else if (dequeueOutputBuffer < 0) {
                continue;
            } else {
                ByteBuffer outputBuffer = this.E.getOutputBuffer(dequeueOutputBuffer);
                if (outputBuffer != null) {
                    MediaCodec.BufferInfo bufferInfo = this.I;
                    int i10 = bufferInfo.size;
                    if (i10 > 1) {
                        int i11 = bufferInfo.flags;
                        if ((i11 & 2) == 0) {
                            int i12 = this.G;
                            if (i12 != 0 && (i11 & 1) != 0) {
                                bufferInfo.offset += i12;
                                bufferInfo.size = i10 - i12;
                            }
                            if (this.H && (i11 & 1) != 0) {
                                if (bufferInfo.size > 100) {
                                    outputBuffer.position(bufferInfo.offset);
                                    byte[] bArr = new byte[100];
                                    outputBuffer.get(bArr);
                                    int i13 = 0;
                                    int i14 = 0;
                                    while (true) {
                                        if (i13 < 96) {
                                            if (bArr[i13] == 0 && bArr[i13 + 1] == 0 && bArr[i13 + 2] == 0 && bArr[i13 + 3] == 1 && (i14 = i14 + 1) > 1) {
                                                MediaCodec.BufferInfo bufferInfo2 = this.I;
                                                bufferInfo2.offset += i13;
                                                bufferInfo2.size -= i13;
                                                break;
                                            }
                                            i13++;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                this.H = false;
                            }
                            long writeSampleData = this.K.writeSampleData(this.M, outputBuffer, this.I, true);
                            if (writeSampleData != 0 && !this.f31100c && this.H0.Q0) {
                                c(this.f31096a, writeSampleData, false);
                            }
                        } else if (this.M == -5) {
                            byte[] bArr2 = new byte[i10];
                            outputBuffer.limit(bufferInfo.offset + i10);
                            outputBuffer.position(this.I.offset);
                            outputBuffer.get(bArr2);
                            int i15 = this.I.size - 1;
                            while (i15 >= 0 && i15 > 3) {
                                if (bArr2[i15] == b10 && bArr2[i15 - 1] == 0 && bArr2[i15 - 2] == 0) {
                                    int i16 = i15 - 3;
                                    if (bArr2[i16] == 0) {
                                        byteBuffer = ByteBuffer.allocate(i16);
                                        byteBuffer2 = ByteBuffer.allocate(this.I.size - i16);
                                        byteBuffer.put(bArr2, 0, i16).position(0);
                                        byteBuffer2.put(bArr2, i16, this.I.size - i16).position(0);
                                        break;
                                    }
                                }
                                i15--;
                                b10 = 1;
                            }
                            byteBuffer = null;
                            byteBuffer2 = null;
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.d, this.f31103e);
                            if (byteBuffer != null && byteBuffer2 != null) {
                                createVideoFormat.setByteBuffer("csd-0", byteBuffer);
                                createVideoFormat.setByteBuffer("csd-1", byteBuffer2);
                            }
                            this.M = this.K.addTrack(createVideoFormat, false);
                        }
                    }
                    this.E.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.I.flags & 4) != 0) {
                        break;
                    }
                } else {
                    throw new RuntimeException(i2.g.j(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
            }
        }
        while (true) {
            int dequeueOutputBuffer2 = this.F.dequeueOutputBuffer(this.J, 0L);
            if (dequeueOutputBuffer2 == -1) {
                if (z10) {
                    if ((!this.W && this.X == 0) || this.D0) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (dequeueOutputBuffer2 != -3) {
                if (dequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat2 = this.F.getOutputFormat();
                    if (this.N == -5) {
                        this.N = this.K.addTrack(outputFormat2, true);
                    }
                } else if (dequeueOutputBuffer2 < 0) {
                    continue;
                } else {
                    ByteBuffer outputBuffer2 = this.F.getOutputBuffer(dequeueOutputBuffer2);
                    if (outputBuffer2 != null) {
                        MediaCodec.BufferInfo bufferInfo3 = this.J;
                        if ((bufferInfo3.flags & 2) != 0) {
                            bufferInfo3.size = 0;
                        }
                        if (bufferInfo3.size != 0) {
                            long writeSampleData2 = this.K.writeSampleData(this.N, outputBuffer2, bufferInfo3, false);
                            if (writeSampleData2 != 0 && !this.f31100c && this.H0.Q0) {
                                c(this.f31096a, writeSampleData2, false);
                            }
                            MediaCodec mediaCodec = this.F;
                            if (mediaCodec != null) {
                                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer2, false);
                            }
                        } else {
                            MediaCodec mediaCodec2 = this.F;
                            if (mediaCodec2 != null) {
                                mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer2, false);
                            }
                        }
                        if ((this.J.flags & 4) != 0) {
                            return;
                        }
                    } else {
                        throw new RuntimeException(i2.g.j(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
                    }
                }
            }
        }
    }

    public final void f(SurfaceTexture surfaceTexture, Integer num, long j3) {
        synchronized (this.U) {
            try {
                if (!this.V) {
                    return;
                }
                long timestamp = surfaceTexture.getTimestamp();
                if (timestamp == 0) {
                    int i10 = this.f31124v0 + 1;
                    this.f31124v0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f31124v0 = 0;
                    j3 = timestamp;
                }
                this.T.sendMessage(this.T.obtainMessage(2, (int) (j3 >> 32), (int) j3, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        b50 b50Var = this.f31128x0;
        if (b50Var != null) {
            b50Var.b();
            this.f31128x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f31120s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f31120s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f31120s);
                this.f31120s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f31127x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        g71 g71Var = new g71();
        w50 w50Var = this.H0;
        w50Var.O = g71Var;
        g71Var.J = new k2.g0(this, 10);
        g71Var.V(w50Var.f32142l0);
        w50Var.O.D(Uri.fromFile(file), "other");
        w50Var.O.C();
        w50Var.O.O(true);
        w50Var.n();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = w50Var.R0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(w50Var.d, t6.f30536b, 0), ObjectAnimator.ofFloat(w50Var.f32155w, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f31120s, this.f31129y);
        this.f31129y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f31118r;
        if (surface != null) {
            surface.release();
            this.f31118r = null;
        }
        EGLDisplay eGLDisplay = this.f31120s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f31120s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f31120s);
        }
        this.f31120s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f31127x = null;
    }

    public final void i(int i10, q50 q50Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, q50Var));
        AndroidUtilities.runOnUIThread(new r50(this, 5));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.d dVar = new g.d(1);
            dVar.f10175b = new WeakReference(this);
            this.T = dVar;
            this.V = true;
            this.U.notify();
        }
        Looper.loop();
        synchronized (this.U) {
            this.V = false;
        }
    }
}
