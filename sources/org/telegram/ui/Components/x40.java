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
import android.text.TextUtils;
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
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
public final class x40 implements Runnable {
    public org.telegram.messenger.s5 B0;
    public int C0;
    public volatile boolean D0;
    public MediaCodec E;
    public MediaCodec F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public final e50 H0;
    public MediaCodec.BufferInfo I;
    public MediaCodec.BufferInfo J;
    public MP4Builder K;
    public long O;
    public boolean Q;
    public volatile g.c T;
    public volatile boolean V;
    public volatile boolean W;
    public volatile int X;
    public volatile u40 Y;
    public long Z;
    public org.telegram.messenger.qe f32376a;
    public boolean f32377a0;
    public File f32378b;
    public long f32379b0;
    public boolean f32380c;
    public int d;
    public long f32382d0;
    public int e;
    public long f32383e0;
    public int f32384f;
    public long f32385f0;
    public boolean f32391l0;
    public int m0;
    public boolean f32392n;
    public int f32393n0;
    public int f32394o0;
    public int f32395p0;
    public int f32396q0;
    public Surface f32397r;
    public int f32398r0;
    public int f32400s0;
    public int f32401t0;
    public int f32402u0;
    public int f32403v0;
    public EGLContext f32406x;
    public h40 f32407x0;
    public EGLConfig f32408y;
    public AudioRecord f32409y0;
    public boolean h = true;
    public EGLDisplay f32399s = EGL14.EGL_NO_DISPLAY;
    public EGLContext f32404w = EGL14.EGL_NO_CONTEXT;
    public EGLSurface D = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long f32381c0 = -1;
    public long f32386g0 = -1;
    public long f32387h0 = -1;
    public long f32388i0 = -1;
    public long f32389j0 = 0;
    public long f32390k0 = -1;
    public Integer f32405w0 = 0;
    public final ArrayBlockingQueue f32410z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final w40 E0 = new w40(this, 0);

    public x40(e50 e50Var) {
        this.H0 = e50Var;
    }

    public static void a(x40 x40Var, boolean z10) {
        long j10;
        e50 e50Var;
        String str;
        boolean z11;
        g(true);
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 3584;
            }
            int i10 = 49152;
            if (49152 < minBufferSize) {
                i10 = ((minBufferSize / 2048) + 1) * 4096;
            }
            int i11 = i10;
            x40Var.f32410z0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                x40Var.f32410z0.add(new o40());
            }
            if (z10) {
                x40Var.f32386g0 = x40Var.f32382d0 + x40Var.f32383e0;
                x40Var.f32390k0 = x40Var.f32388i0 + x40Var.f32389j0;
                x40Var.Q = true;
                j10 = 0;
            } else {
                x40Var.f32386g0 = -1L;
                x40Var.f32390k0 = -1L;
                j10 = 0;
                x40Var.R = 0L;
            }
            x40Var.S = -1L;
            x40Var.O = j10;
            x40Var.P = -1L;
            x40Var.f32387h0 = -1L;
            x40Var.f32381c0 = -1L;
            x40Var.f32382d0 = -1L;
            x40Var.f32385f0 = -1L;
            x40Var.f32388i0 = -1L;
            x40Var.f32377a0 = false;
            x40Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i11);
            x40Var.f32409y0 = audioRecord;
            audioRecord.startRecording();
            if (org.telegram.messenger.v2.f18578a) {
                org.telegram.messenger.f8.b("InstantCamera initied audio record with channels " + x40Var.f32409y0.getChannelCount() + " sample rate = " + x40Var.f32409y0.getSampleRate() + " bufferSize = " + i11);
            }
            x40Var.D0 = false;
            Thread thread = new Thread(x40Var.E0);
            thread.setPriority(10);
            thread.start();
            x40Var.J = new MediaCodec.BufferInfo();
            x40Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", org.telegram.messenger.wp.r1(x40Var.H0.e).f19287x3 * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            x40Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            x40Var.F.start();
            x40Var.E = MediaCodec.createEncoderByType("video/avc");
            x40Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", x40Var.d, x40Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", x40Var.f32384f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            x40Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            x40Var.f32397r = x40Var.E.createInputSurface();
            x40Var.E.start();
            if (!z10) {
                org.telegram.messenger.qe qeVar = x40Var.f32376a;
                ThreadLocal threadLocal = org.telegram.messenger.ic.I;
                if (!TextUtils.isEmpty(org.telegram.messenger.uz.f18519h0) && qeVar.getAbsolutePath().startsWith(org.telegram.messenger.uz.f18519h0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                x40Var.f32378b = x40Var.f32376a;
                if (z11) {
                    File file = new File(org.telegram.messenger.w0.h(), "camera_tmp.mp4");
                    x40Var.f32378b = file;
                    if (file.exists()) {
                        x40Var.f32378b.delete();
                    }
                    x40Var.f32380c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(x40Var.f32378b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(x40Var.d, x40Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, x40Var.H0.Q, false);
                x40Var.K = createMovie;
                e50 e50Var2 = x40Var.H0;
                boolean j11 = org.telegram.messenger.uz.j();
                e50Var2.Z0 = j11;
                createMovie.setAllowSyncFiles(j11);
            }
            org.telegram.messenger.i0.g3(new k2.v(16, x40Var, z10));
            if (x40Var.f32399s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                x40Var.f32399s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (x40Var.f32404w == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(x40Var.f32399s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                x40Var.f32404w = EGL14.eglCreateContext(x40Var.f32399s, eGLConfigArr[0], x40Var.f32406x, new int[]{12440, 2, 12344}, 0);
                                x40Var.f32408y = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        }
                        EGL14.eglQueryContext(x40Var.f32399s, x40Var.f32404w, 12440, new int[1], 0);
                        if (x40Var.D == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(x40Var.f32399s, x40Var.f32408y, x40Var.f32397r, new int[]{12344}, 0);
                            x40Var.D = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(x40Var.f32399s, eglCreateWindowSurface, eglCreateWindowSurface, x40Var.f32404w)) {
                                    if (org.telegram.messenger.v2.f18578a) {
                                        org.telegram.messenger.f8.d("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                h40 h40Var = x40Var.f32407x0;
                                if (h40Var != null) {
                                    h40Var.b();
                                    x40Var.f32407x0 = null;
                                }
                                x40Var.f32407x0 = new h40(x40Var.d, x40Var.e);
                                Size size = x40Var.H0.m0[0];
                                if (org.telegram.messenger.uz.o() != 0 && e50.l() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= org.telegram.messenger.wp.r1(e50Var.e).f19267v3)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int k10 = e50.k(x40Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int k11 = e50.k(x40Var.H0, 35632, str);
                                if (k10 != 0 && k11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    x40Var.m0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, k10);
                                    GLES20.glAttachShader(x40Var.m0, k11);
                                    GLES20.glLinkProgram(x40Var.m0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(x40Var.m0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(x40Var.m0);
                                        x40Var.m0 = 0;
                                        return;
                                    }
                                    x40Var.f32395p0 = GLES20.glGetAttribLocation(x40Var.m0, "aPosition");
                                    x40Var.f32396q0 = GLES20.glGetAttribLocation(x40Var.m0, "aTextureCoord");
                                    x40Var.f32400s0 = GLES20.glGetUniformLocation(x40Var.m0, "preview");
                                    x40Var.f32398r0 = GLES20.glGetUniformLocation(x40Var.m0, "resolution");
                                    x40Var.f32402u0 = GLES20.glGetUniformLocation(x40Var.m0, "alpha");
                                    x40Var.f32393n0 = GLES20.glGetUniformLocation(x40Var.m0, "uMVPMatrix");
                                    x40Var.f32394o0 = GLES20.glGetUniformLocation(x40Var.m0, "uSTMatrix");
                                    x40Var.f32401t0 = GLES20.glGetUniformLocation(x40Var.m0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    x40Var.f32399s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(x40 x40Var, int i10, u40 u40Var) {
        boolean z10;
        org.telegram.messenger.s5 s5Var;
        org.telegram.messenger.y20 y20Var;
        if (i10 == 1 && (((y20Var = x40Var.H0.R) == null || !y20Var.c()) && !x40Var.H0.h.c())) {
            if (!x40Var.G0) {
                x40Var.G0 = true;
                org.telegram.messenger.i0.g3(new at(15, x40Var, u40Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (x40Var.W && !x40Var.D0) {
            org.telegram.messenger.f8.b("InstantCamera handleStopRecording running=false");
            x40Var.X = i10;
            x40Var.Y = u40Var;
            x40Var.W = false;
            return;
        }
        try {
            org.telegram.messenger.f8.b("InstantCamera handleStopRecording drain encoders");
            x40Var.d(true);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        MediaCodec mediaCodec = x40Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                x40Var.E.release();
                x40Var.E = null;
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        MediaCodec mediaCodec2 = x40Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                x40Var.F.release();
                x40Var.F = null;
                g(false);
            } catch (Exception e10) {
                org.telegram.messenger.f8.g(e10, true);
            }
        }
        File file = x40Var.H0.f25706f0;
        if (file != null) {
            file.delete();
            x40Var.H0.f25706f0 = null;
        }
        MP4Builder mP4Builder = x40Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e11) {
                org.telegram.messenger.f8.g(e11, true);
            }
            org.telegram.messenger.f8.b("InstantCamera handleStopRecording finish muxer");
            if (x40Var.f32380c) {
                if (x40Var.f32376a.exists()) {
                    try {
                        x40Var.f32376a.delete();
                    } catch (Exception e12) {
                        org.telegram.messenger.f8.d("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + x40Var.f32376a);
                        org.telegram.messenger.f8.g(e12, true);
                    }
                }
                if (!x40Var.f32378b.renameTo(x40Var.f32376a)) {
                    org.telegram.messenger.f8.d("InstantCamera unable to rename file, try move file");
                    try {
                        org.telegram.messenger.i0.E(x40Var.f32378b, x40Var.f32376a);
                        x40Var.f32378b.delete();
                    } catch (IOException e13) {
                        org.telegram.messenger.f8.g(e13, true);
                        org.telegram.messenger.f8.d("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (s5Var = x40Var.B0) != null) {
            s5Var.cleanupQueue();
            x40Var.B0.recycle();
            x40Var.B0 = null;
        }
        org.telegram.messenger.f8.b("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            org.telegram.messenger.b8.G(x40Var.H0.e).b(x40Var.f32376a.getAbsolutePath(), false);
            try {
                x40Var.f32378b.delete();
            } catch (Throwable unused) {
            }
            try {
                x40Var.f32376a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !x40Var.G0)) {
                x40Var.G0 = true;
                org.telegram.messenger.i0.g3(new ag.o0(x40Var, i10, u40Var, 29));
            }
            org.telegram.messenger.i0.g3(new v40(x40Var, 2));
        }
        EGL14.eglDestroySurface(x40Var.f32399s, x40Var.D);
        x40Var.D = EGL14.EGL_NO_SURFACE;
        Surface surface = x40Var.f32397r;
        if (surface != null) {
            surface.release();
            x40Var.f32397r = null;
        }
        EGLDisplay eGLDisplay = x40Var.f32399s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(x40Var.f32399s, x40Var.f32404w);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(x40Var.f32399s);
        }
        x40Var.f32399s = EGL14.EGL_NO_DISPLAY;
        x40Var.f32404w = EGL14.EGL_NO_CONTEXT;
        x40Var.f32408y = null;
        x40Var.T.getClass();
        Looper.myLooper().quit();
        h40 h40Var = x40Var.f32407x0;
        if (h40Var != null) {
            h40Var.b();
            x40Var.f32407x0 = null;
        }
        org.telegram.messenger.i0.g3(new v40(x40Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) org.telegram.messenger.w0.f18945b.getSystemService("audio");
        if (org.telegram.messenger.uz.f18556u0 && !w7.c6.d("android.permission.BLUETOOTH_CONNECT")) {
            org.telegram.messenger.uz.f18556u0 = false;
            org.telegram.messenger.uz.y();
        }
        if ((audioManager.isBluetoothScoAvailableOffCall() && org.telegram.messenger.uz.f18556u0) || !z10) {
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
                    org.telegram.messenger.f8.g(th2, true);
                    if (!z10) {
                        try {
                            if (audioManager.isBluetoothScoOn()) {
                                audioManager.stopBluetoothSco();
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
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

    public final void c(org.telegram.messenger.qe qeVar, long j10, boolean z10) {
        e50 e50Var = this.H0;
        int i10 = e50Var.e;
        long j11 = 0;
        if (this.h) {
            org.telegram.messenger.b8.G(i10).h0(qeVar.toString(), e50Var.Q, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(i10);
                String file = qeVar.toString();
                boolean z11 = e50Var.Q;
                if (z10) {
                    j11 = qeVar.length();
                }
                G.n(file, z11, j10, j11, null);
                return;
            }
            return;
        }
        org.telegram.messenger.b8 G2 = org.telegram.messenger.b8.G(i10);
        String file2 = qeVar.toString();
        boolean z12 = e50Var.Q;
        if (z10) {
            j11 = qeVar.length();
        }
        G2.n(file2, z12, j10, j11, null);
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
                            if (writeSampleData != 0 && !this.f32380c && this.H0.Z0) {
                                c(this.f32376a, writeSampleData, false);
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
                    throw new RuntimeException(i0.a.j(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
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
                            if (writeSampleData2 != 0 && !this.f32380c && this.H0.Z0) {
                                c(this.f32376a, writeSampleData2, false);
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
                        throw new RuntimeException(i0.a.j(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
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
                    int i10 = this.f32403v0 + 1;
                    this.f32403v0 = i10;
                    if (i10 > 1) {
                        if (org.telegram.messenger.v2.f18578a) {
                            org.telegram.messenger.f8.b("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f32403v0 = 0;
                    j10 = timestamp;
                }
                this.T.sendMessage(this.T.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        h40 h40Var = this.f32407x0;
        if (h40Var != null) {
            h40Var.b();
            this.f32407x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f32399s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f32399s, this.f32404w);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f32399s);
                this.f32399s = EGL14.EGL_NO_DISPLAY;
                this.f32404w = EGL14.EGL_NO_CONTEXT;
                this.f32408y = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        v61 v61Var = new v61();
        e50 e50Var = this.H0;
        e50Var.S = v61Var;
        v61Var.J = new n2.u(this, 11);
        v61Var.A0(e50Var.f25722p0);
        e50Var.S.j0(Uri.fromFile(file), "other");
        e50Var.S.h0();
        e50Var.S.t0(true);
        e50Var.s();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = e50Var.f25696a1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(e50Var.f25719n, i6.f27007b, 0), ObjectAnimator.ofFloat(e50Var.F, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f32399s, this.D);
        this.D = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f32397r;
        if (surface != null) {
            surface.release();
            this.f32397r = null;
        }
        EGLDisplay eGLDisplay = this.f32399s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f32399s, this.f32404w);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f32399s);
        }
        this.f32399s = EGL14.EGL_NO_DISPLAY;
        this.f32404w = EGL14.EGL_NO_CONTEXT;
        this.f32408y = null;
    }

    public final void i(int i10, u40 u40Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, u40Var));
        org.telegram.messenger.i0.g3(new org.telegram.messenger.sz(23));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.c cVar = new g.c(1);
            cVar.f7170b = new WeakReference(this);
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
