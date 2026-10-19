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
public final class f60 implements Runnable {
    public DispatchQueue B0;
    public int C0;
    public volatile boolean D0;
    public MediaCodec E;
    public MediaCodec F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public final m60 H0;
    public MediaCodec.BufferInfo I;
    public MediaCodec.BufferInfo J;
    public MP4Builder K;
    public long O;
    public boolean Q;
    public volatile g.c T;
    public volatile boolean V;
    public volatile boolean W;
    public volatile int X;
    public volatile a60 Y;
    public long Z;
    public s50 f26114a;
    public boolean f26115a0;
    public File f26116b;
    public long f26117b0;
    public boolean f26118c;
    public int d;
    public long f26120d0;
    public int e;
    public long f26121e0;
    public int f26122f;
    public long f26123f0;
    public boolean f26129l0;
    public int m0;
    public boolean f26130n;
    public int f26131n0;
    public int f26132o0;
    public int f26133p0;
    public int f26134q0;
    public Surface f26135r;
    public int f26136r0;
    public int f26138s0;
    public int f26139t0;
    public int f26140u0;
    public int f26141v0;
    public EGLContext f26142w;
    public EGLConfig f26144x;
    public l50 f26145x0;
    public AudioRecord f26147y0;
    public boolean h = true;
    public EGLDisplay f26137s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f26146y = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long f26119c0 = -1;
    public long f26124g0 = -1;
    public long f26125h0 = -1;
    public long f26126i0 = -1;
    public long f26127j0 = 0;
    public long f26128k0 = -1;
    public Integer f26143w0 = 0;
    public final ArrayBlockingQueue f26148z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final e60 E0 = new e60(this, 0);

    public f60(m60 m60Var) {
        this.H0 = m60Var;
    }

    public static void a(f60 f60Var, boolean z10) {
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
            f60Var.f26148z0.clear();
            for (int i13 = 0; i13 < 3; i13++) {
                f60Var.f26148z0.add(new u50());
            }
            if (z10) {
                f60Var.f26124g0 = f60Var.f26120d0 + f60Var.f26121e0;
                f60Var.f26128k0 = f60Var.f26126i0 + f60Var.f26127j0;
                f60Var.Q = true;
                j10 = 0;
            } else {
                f60Var.f26124g0 = -1L;
                f60Var.f26128k0 = -1L;
                j10 = 0;
                f60Var.R = 0L;
            }
            f60Var.S = -1L;
            f60Var.O = j10;
            f60Var.P = -1L;
            f60Var.f26125h0 = -1L;
            f60Var.f26119c0 = -1L;
            f60Var.f26120d0 = -1L;
            f60Var.f26123f0 = -1L;
            f60Var.f26126i0 = -1L;
            f60Var.f26115a0 = false;
            f60Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i12);
            f60Var.f26147y0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + f60Var.f26147y0.getChannelCount() + " sample rate = " + f60Var.f26147y0.getSampleRate() + " bufferSize = " + i12);
            }
            f60Var.D0 = false;
            Thread thread = new Thread(f60Var.E0);
            thread.setPriority(10);
            thread.start();
            f60Var.J = new MediaCodec.BufferInfo();
            f60Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(f60Var.H0.f28413f).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            f60Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            f60Var.F.start();
            f60Var.E = MediaCodec.createEncoderByType("video/avc");
            f60Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", f60Var.d, f60Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", f60Var.f26122f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            f60Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            f60Var.f26135r = f60Var.E.createInputSurface();
            f60Var.E.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(f60Var.f26114a);
                f60Var.f26116b = f60Var.f26114a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    f60Var.f26116b = file;
                    if (file.exists()) {
                        f60Var.f26116b.delete();
                    }
                    f60Var.f26118c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(f60Var.f26116b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(f60Var.d, f60Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, f60Var.H0.R, false);
                f60Var.K = createMovie;
                m60 m60Var = f60Var.H0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                m60Var.f28404a1 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new b60(0, f60Var, z10));
            if (f60Var.f26137s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                f60Var.f26137s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (f60Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(f60Var.f26137s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i10 = 0;
                                f60Var.v = EGL14.eglCreateContext(f60Var.f26137s, eGLConfigArr[0], f60Var.f26142w, new int[]{12440, 2, 12344}, 0);
                                f60Var.f26144x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i10 = 0;
                        }
                        EGL14.eglQueryContext(f60Var.f26137s, f60Var.v, 12440, new int[1], i10);
                        if (f60Var.f26146y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(f60Var.f26137s, f60Var.f26144x, f60Var.f26135r, new int[]{12344}, i10);
                            f60Var.f26146y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(f60Var.f26137s, eglCreateWindowSurface, eglCreateWindowSurface, f60Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                l50 l50Var = f60Var.f26145x0;
                                if (l50Var != null) {
                                    l50Var.b();
                                    f60Var.f26145x0 = null;
                                }
                                f60Var.f26145x0 = new l50(f60Var.d, f60Var.e);
                                m60 m60Var2 = f60Var.H0;
                                Size size = m60Var2.f28428n0[0];
                                if (!SharedConfig.deviceIsLow() && m60.k() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(m60Var2.f28413f).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int j11 = m60.j(f60Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j12 = m60.j(f60Var.H0, 35632, str);
                                if (j11 != 0 && j12 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    f60Var.m0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j11);
                                    GLES20.glAttachShader(f60Var.m0, j12);
                                    GLES20.glLinkProgram(f60Var.m0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(f60Var.m0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(f60Var.m0);
                                        f60Var.m0 = 0;
                                        return;
                                    }
                                    f60Var.f26133p0 = GLES20.glGetAttribLocation(f60Var.m0, "aPosition");
                                    f60Var.f26134q0 = GLES20.glGetAttribLocation(f60Var.m0, "aTextureCoord");
                                    f60Var.f26138s0 = GLES20.glGetUniformLocation(f60Var.m0, "preview");
                                    f60Var.f26136r0 = GLES20.glGetUniformLocation(f60Var.m0, "resolution");
                                    f60Var.f26140u0 = GLES20.glGetUniformLocation(f60Var.m0, "alpha");
                                    f60Var.f26131n0 = GLES20.glGetUniformLocation(f60Var.m0, "uMVPMatrix");
                                    f60Var.f26132o0 = GLES20.glGetUniformLocation(f60Var.m0, "uSTMatrix");
                                    f60Var.f26139t0 = GLES20.glGetUniformLocation(f60Var.m0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    f60Var.f26137s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(f60 f60Var, int i10, a60 a60Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = f60Var.H0.S) == null || !videoEditedInfo.needConvert()) && !f60Var.H0.f28427n.c())) {
            if (!f60Var.G0) {
                f60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new yt(14, f60Var, a60Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (f60Var.W && !f60Var.D0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            f60Var.X = i10;
            f60Var.Y = a60Var;
            f60Var.W = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            f60Var.d(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaCodec mediaCodec = f60Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                f60Var.E.release();
                f60Var.E = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        MediaCodec mediaCodec2 = f60Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                f60Var.F.release();
                f60Var.F = null;
                g(false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        File file = f60Var.H0.f28416g0;
        if (file != null) {
            file.delete();
            f60Var.H0.f28416g0 = null;
        }
        MP4Builder mP4Builder = f60Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (f60Var.f26118c) {
                if (f60Var.f26114a.exists()) {
                    try {
                        f60Var.f26114a.delete();
                    } catch (Exception e12) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + f60Var.f26114a);
                        FileLog.e(e12);
                    }
                }
                if (!f60Var.f26116b.renameTo(f60Var.f26114a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(f60Var.f26116b, f60Var.f26114a);
                        f60Var.f26116b.delete();
                    } catch (IOException e13) {
                        FileLog.e(e13);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = f60Var.B0) != null) {
            dispatchQueue.cleanupQueue();
            f60Var.B0.recycle();
            f60Var.B0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(f60Var.H0.f28413f).cancelFileUpload(f60Var.f26114a.getAbsolutePath(), false);
            try {
                f60Var.f26116b.delete();
            } catch (Throwable unused) {
            }
            try {
                f60Var.f26114a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !f60Var.G0)) {
                f60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(f60Var, i10, a60Var, 13));
            }
            AndroidUtilities.runOnUIThread(new c60(f60Var, 2));
        }
        EGL14.eglDestroySurface(f60Var.f26137s, f60Var.f26146y);
        f60Var.f26146y = EGL14.EGL_NO_SURFACE;
        Surface surface = f60Var.f26135r;
        if (surface != null) {
            surface.release();
            f60Var.f26135r = null;
        }
        EGLDisplay eGLDisplay = f60Var.f26137s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(f60Var.f26137s, f60Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(f60Var.f26137s);
        }
        f60Var.f26137s = EGL14.EGL_NO_DISPLAY;
        f60Var.v = EGL14.EGL_NO_CONTEXT;
        f60Var.f26144x = null;
        f60Var.T.getClass();
        Looper.myLooper().quit();
        l50 l50Var = f60Var.f26145x0;
        if (l50Var != null) {
            l50Var.b();
            f60Var.f26145x0 = null;
        }
        AndroidUtilities.runOnUIThread(new c60(f60Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !we0.d("android.permission.BLUETOOTH_CONNECT")) {
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

    public final void c(s50 s50Var, long j10, boolean z10) {
        m60 m60Var = this.H0;
        int i10 = m60Var.f28413f;
        long j11 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(s50Var.toString(), m60Var.R, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = s50Var.toString();
                boolean z11 = m60Var.R;
                if (z10) {
                    j11 = s50Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z11, j10, j11);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = s50Var.toString();
        boolean z12 = m60Var.R;
        if (z10) {
            j11 = s50Var.length();
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
                            if (writeSampleData != 0 && !this.f26118c && this.H0.f28404a1) {
                                c(this.f26114a, writeSampleData, false);
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
                    throw new RuntimeException(i2.e.k(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
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
                            if (writeSampleData2 != 0 && !this.f26118c && this.H0.f28404a1) {
                                c(this.f26114a, writeSampleData2, false);
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
                        throw new RuntimeException(i2.e.k(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
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
                    int i10 = this.f26141v0 + 1;
                    this.f26141v0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f26141v0 = 0;
                    j10 = timestamp;
                }
                this.T.sendMessage(this.T.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        l50 l50Var = this.f26145x0;
        if (l50Var != null) {
            l50Var.b();
            this.f26145x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f26137s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f26137s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f26137s);
                this.f26137s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f26144x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        b81 b81Var = new b81();
        m60 m60Var = this.H0;
        m60Var.T = b81Var;
        b81Var.J = new k2.w0(this, 12);
        b81Var.V(m60Var.f28431q0);
        m60Var.T.D(Uri.fromFile(file), "other");
        m60Var.T.C();
        m60Var.T.O(true);
        m60Var.s();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = m60Var.f28406b1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(m60Var.f28432r, t6.f30428b, 0), ObjectAnimator.ofFloat(m60Var.G, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f26137s, this.f26146y);
        this.f26146y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f26135r;
        if (surface != null) {
            surface.release();
            this.f26135r = null;
        }
        EGLDisplay eGLDisplay = this.f26137s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f26137s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f26137s);
        }
        this.f26137s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f26144x = null;
    }

    public final void i(int i10, a60 a60Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, a60Var));
        AndroidUtilities.runOnUIThread(new rc(13));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.c cVar = new g.c(1);
            cVar.f10649b = new WeakReference(this);
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
