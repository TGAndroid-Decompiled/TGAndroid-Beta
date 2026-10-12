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
public final class i60 implements Runnable {
    public DispatchQueue B0;
    public int C0;
    public volatile boolean D0;
    public MediaCodec E;
    public MediaCodec F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public final p60 H0;
    public MediaCodec.BufferInfo I;
    public MediaCodec.BufferInfo J;
    public MP4Builder K;
    public long O;
    public boolean Q;
    public volatile g.c T;
    public volatile boolean V;
    public volatile boolean W;
    public volatile int X;
    public volatile d60 Y;
    public long Z;
    public w50 f25857a;
    public boolean f25858a0;
    public File f25859b;
    public long f25860b0;
    public boolean f25861c;
    public int d;
    public long f25863d0;
    public int e;
    public long f25864e0;
    public int f25865f;
    public long f25866f0;
    public boolean f25872l0;
    public int m0;
    public boolean f25873n;
    public int f25874n0;
    public int f25875o0;
    public int f25876p0;
    public int f25877q0;
    public Surface f25878r;
    public int f25879r0;
    public int f25881s0;
    public int f25882t0;
    public int f25883u0;
    public int f25884v0;
    public EGLContext f25885w;
    public EGLConfig f25887x;
    public p50 f25888x0;
    public AudioRecord f25890y0;
    public boolean h = true;
    public EGLDisplay f25880s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f25889y = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long f25862c0 = -1;
    public long f25867g0 = -1;
    public long f25868h0 = -1;
    public long f25869i0 = -1;
    public long f25870j0 = 0;
    public long f25871k0 = -1;
    public Integer f25886w0 = 0;
    public final ArrayBlockingQueue f25891z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final h60 E0 = new h60(this, 0);

    public i60(p60 p60Var) {
        this.H0 = p60Var;
    }

    public static void a(i60 i60Var, boolean z10) {
        long j10;
        int i10;
        String str;
        g(true);
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 3584;
            }
            int i11 = 49152;
            if (49152 < minBufferSize) {
                i11 = ((minBufferSize / 2048) + 1) * 4096;
            }
            int i12 = i11;
            i60Var.f25891z0.clear();
            for (int i13 = 0; i13 < 3; i13++) {
                i60Var.f25891z0.add(new x50());
            }
            if (z10) {
                i60Var.f25867g0 = i60Var.f25863d0 + i60Var.f25864e0;
                i60Var.f25871k0 = i60Var.f25869i0 + i60Var.f25870j0;
                i60Var.Q = true;
                j10 = 0;
            } else {
                i60Var.f25867g0 = -1L;
                i60Var.f25871k0 = -1L;
                j10 = 0;
                i60Var.R = 0L;
            }
            i60Var.S = -1L;
            i60Var.O = j10;
            i60Var.P = -1L;
            i60Var.f25868h0 = -1L;
            i60Var.f25862c0 = -1L;
            i60Var.f25863d0 = -1L;
            i60Var.f25866f0 = -1L;
            i60Var.f25869i0 = -1L;
            i60Var.f25858a0 = false;
            i60Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i12);
            i60Var.f25890y0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + i60Var.f25890y0.getChannelCount() + " sample rate = " + i60Var.f25890y0.getSampleRate() + " bufferSize = " + i12);
            }
            i60Var.D0 = false;
            Thread thread = new Thread(i60Var.E0);
            thread.setPriority(10);
            thread.start();
            i60Var.J = new MediaCodec.BufferInfo();
            i60Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(i60Var.H0.f28168f).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            i60Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            i60Var.F.start();
            i60Var.E = MediaCodec.createEncoderByType("video/avc");
            i60Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i60Var.d, i60Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", i60Var.f25865f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            i60Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            i60Var.f25878r = i60Var.E.createInputSurface();
            i60Var.E.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(i60Var.f25857a);
                i60Var.f25859b = i60Var.f25857a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    i60Var.f25859b = file;
                    if (file.exists()) {
                        i60Var.f25859b.delete();
                    }
                    i60Var.f25861c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(i60Var.f25859b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(i60Var.d, i60Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, i60Var.H0.R, false);
                i60Var.K = createMovie;
                p60 p60Var = i60Var.H0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                p60Var.f28159a1 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new ah.t(28, i60Var, z10));
            if (i60Var.f25880s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                i60Var.f25880s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (i60Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(i60Var.f25880s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i10 = 0;
                                i60Var.v = EGL14.eglCreateContext(i60Var.f25880s, eGLConfigArr[0], i60Var.f25885w, new int[]{12440, 2, 12344}, 0);
                                i60Var.f25887x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i10 = 0;
                        }
                        EGL14.eglQueryContext(i60Var.f25880s, i60Var.v, 12440, new int[1], i10);
                        if (i60Var.f25889y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(i60Var.f25880s, i60Var.f25887x, i60Var.f25878r, new int[]{12344}, i10);
                            i60Var.f25889y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(i60Var.f25880s, eglCreateWindowSurface, eglCreateWindowSurface, i60Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                p50 p50Var = i60Var.f25888x0;
                                if (p50Var != null) {
                                    p50Var.b();
                                    i60Var.f25888x0 = null;
                                }
                                i60Var.f25888x0 = new p50(i60Var.d, i60Var.e);
                                p60 p60Var2 = i60Var.H0;
                                Size size = p60Var2.f28183n0[0];
                                if (!SharedConfig.deviceIsLow() && p60.k() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(p60Var2.f28168f).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int j11 = p60.j(i60Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j12 = p60.j(i60Var.H0, 35632, str);
                                if (j11 != 0 && j12 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    i60Var.m0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j11);
                                    GLES20.glAttachShader(i60Var.m0, j12);
                                    GLES20.glLinkProgram(i60Var.m0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(i60Var.m0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(i60Var.m0);
                                        i60Var.m0 = 0;
                                        return;
                                    }
                                    i60Var.f25876p0 = GLES20.glGetAttribLocation(i60Var.m0, "aPosition");
                                    i60Var.f25877q0 = GLES20.glGetAttribLocation(i60Var.m0, "aTextureCoord");
                                    i60Var.f25881s0 = GLES20.glGetUniformLocation(i60Var.m0, "preview");
                                    i60Var.f25879r0 = GLES20.glGetUniformLocation(i60Var.m0, "resolution");
                                    i60Var.f25883u0 = GLES20.glGetUniformLocation(i60Var.m0, "alpha");
                                    i60Var.f25874n0 = GLES20.glGetUniformLocation(i60Var.m0, "uMVPMatrix");
                                    i60Var.f25875o0 = GLES20.glGetUniformLocation(i60Var.m0, "uSTMatrix");
                                    i60Var.f25882t0 = GLES20.glGetUniformLocation(i60Var.m0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    i60Var.f25880s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(i60 i60Var, int i10, d60 d60Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = i60Var.H0.S) == null || !videoEditedInfo.needConvert()) && !i60Var.H0.f28182n.c())) {
            if (!i60Var.G0) {
                i60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new f60(0, i60Var, d60Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (i60Var.W && !i60Var.D0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            i60Var.X = i10;
            i60Var.Y = d60Var;
            i60Var.W = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            i60Var.d(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaCodec mediaCodec = i60Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                i60Var.E.release();
                i60Var.E = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        MediaCodec mediaCodec2 = i60Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                i60Var.F.release();
                i60Var.F = null;
                g(false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        File file = i60Var.H0.f28171g0;
        if (file != null) {
            file.delete();
            i60Var.H0.f28171g0 = null;
        }
        MP4Builder mP4Builder = i60Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (i60Var.f25861c) {
                if (i60Var.f25857a.exists()) {
                    try {
                        i60Var.f25857a.delete();
                    } catch (Exception e12) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + i60Var.f25857a);
                        FileLog.e(e12);
                    }
                }
                if (!i60Var.f25859b.renameTo(i60Var.f25857a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(i60Var.f25859b, i60Var.f25857a);
                        i60Var.f25859b.delete();
                    } catch (IOException e13) {
                        FileLog.e(e13);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = i60Var.B0) != null) {
            dispatchQueue.cleanupQueue();
            i60Var.B0.recycle();
            i60Var.B0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(i60Var.H0.f28168f).cancelFileUpload(i60Var.f25857a.getAbsolutePath(), false);
            try {
                i60Var.f25859b.delete();
            } catch (Throwable unused) {
            }
            try {
                i60Var.f25857a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !i60Var.G0)) {
                i60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.gm(i60Var, i10, d60Var, 9));
            }
            AndroidUtilities.runOnUIThread(new e60(i60Var, 2));
        }
        EGL14.eglDestroySurface(i60Var.f25880s, i60Var.f25889y);
        i60Var.f25889y = EGL14.EGL_NO_SURFACE;
        Surface surface = i60Var.f25878r;
        if (surface != null) {
            surface.release();
            i60Var.f25878r = null;
        }
        EGLDisplay eGLDisplay = i60Var.f25880s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(i60Var.f25880s, i60Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(i60Var.f25880s);
        }
        i60Var.f25880s = EGL14.EGL_NO_DISPLAY;
        i60Var.v = EGL14.EGL_NO_CONTEXT;
        i60Var.f25887x = null;
        i60Var.T.getClass();
        Looper.myLooper().quit();
        p50 p50Var = i60Var.f25888x0;
        if (p50Var != null) {
            p50Var.b();
            i60Var.f25888x0 = null;
        }
        AndroidUtilities.runOnUIThread(new e60(i60Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !cf0.d("android.permission.BLUETOOTH_CONNECT")) {
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
                        } catch (Exception e) {
                            FileLog.e(e);
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

    public final void c(w50 w50Var, long j10, boolean z10) {
        p60 p60Var = this.H0;
        int i10 = p60Var.f28168f;
        long j11 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(w50Var.toString(), p60Var.R, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = w50Var.toString();
                boolean z11 = p60Var.R;
                if (z10) {
                    j11 = w50Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z11, j10, j11);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = w50Var.toString();
        boolean z12 = p60Var.R;
        if (z10) {
            j11 = w50Var.length();
        }
        fileLoader2.checkUploadNewDataAvailable(file2, z12, j10, j11);
    }

    public final void d(boolean z10) {
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
                            if (writeSampleData != 0 && !this.f25861c && this.H0.f28159a1) {
                                c(this.f25857a, writeSampleData, false);
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
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.d, this.e);
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
                    throw new RuntimeException(i2.d.j(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
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
                            if (writeSampleData2 != 0 && !this.f25861c && this.H0.f28159a1) {
                                c(this.f25857a, writeSampleData2, false);
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
                        throw new RuntimeException(i2.d.j(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
                    }
                }
            }
        }
    }

    public final void f(SurfaceTexture surfaceTexture, Integer num, long j10) {
        synchronized (this.U) {
            try {
                if (!this.V) {
                    return;
                }
                long timestamp = surfaceTexture.getTimestamp();
                if (timestamp == 0) {
                    int i10 = this.f25884v0 + 1;
                    this.f25884v0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f25884v0 = 0;
                    j10 = timestamp;
                }
                this.T.sendMessage(this.T.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        p50 p50Var = this.f25888x0;
        if (p50Var != null) {
            p50Var.b();
            this.f25888x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f25880s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f25880s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f25880s);
                this.f25880s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f25887x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        h81 h81Var = new h81();
        p60 p60Var = this.H0;
        p60Var.T = h81Var;
        h81Var.J = new ji.d4(this, 12);
        h81Var.V(p60Var.f28186q0);
        p60Var.T.D(Uri.fromFile(file), "other");
        p60Var.T.C();
        p60Var.T.O(true);
        p60Var.s();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = p60Var.f28161b1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(p60Var.f28187r, v6.f29900b, 0), ObjectAnimator.ofFloat(p60Var.G, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f25880s, this.f25889y);
        this.f25889y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f25878r;
        if (surface != null) {
            surface.release();
            this.f25878r = null;
        }
        EGLDisplay eGLDisplay = this.f25880s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f25880s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f25880s);
        }
        this.f25880s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f25887x = null;
    }

    public final void i(int i10, d60 d60Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, d60Var));
        AndroidUtilities.runOnUIThread(new ve(9));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.c cVar = new g.c(1);
            cVar.f9741b = new WeakReference(this);
            this.T = cVar;
            this.V = true;
            this.U.notify();
        }
        Looper.loop();
        synchronized (this.U) {
            this.V = false;
        }
    }
}
