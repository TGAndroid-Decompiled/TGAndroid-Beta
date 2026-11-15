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
public final class j40 implements Runnable {
    public org.telegram.messenger.q5 C0;
    public int D0;
    public volatile boolean E0;
    public MediaCodec F;
    public MediaCodec G;
    public boolean G0;
    public int H;
    public boolean H0;
    public boolean I;
    public final r40 I0;
    public MediaCodec.BufferInfo J;
    public MediaCodec.BufferInfo K;
    public MP4Builder L;
    public long P;
    public boolean R;
    public volatile g.c U;
    public volatile boolean W;
    public volatile boolean X;
    public volatile int Y;
    public volatile g40 Z;
    public org.telegram.messenger.oe f35852a;
    public long f35853a0;
    public File f35854b;
    public boolean f35855b0;
    public boolean f35856c;
    public long f35857c0;
    public int d;
    public int f35859e;
    public long f35860e0;
    public int f35861f;
    public long f35862f0;
    public long f35863g0;
    public boolean m0;
    public boolean f35869n;
    public int f35870n0;
    public int f35871o0;
    public int f35872p0;
    public int f35873q0;
    public Surface f35874r;
    public int f35875r0;
    public int f35877s0;
    public int f35878t0;
    public int f35879u0;
    public int f35880v0;
    public int f35882w0;
    public EGLContext f35883x;
    public EGLConfig f35885y;
    public s30 f35886y0;
    public AudioRecord f35887z0;
    public boolean h = true;
    public EGLDisplay f35876s = EGL14.EGL_NO_DISPLAY;
    public EGLContext f35881w = EGL14.EGL_NO_CONTEXT;
    public EGLSurface E = EGL14.EGL_NO_SURFACE;
    public final ArrayList M = new ArrayList();
    public int N = -5;
    public int O = -5;
    public long Q = -1;
    public long S = 0;
    public long T = -1;
    public final Object V = new Object();
    public long f35858d0 = -1;
    public long f35864h0 = -1;
    public long f35865i0 = -1;
    public long f35866j0 = -1;
    public long f35867k0 = 0;
    public long f35868l0 = -1;
    public Integer f35884x0 = 0;
    public final ArrayBlockingQueue A0 = new ArrayBlockingQueue(10);
    public final ArrayList B0 = new ArrayList();
    public final i40 F0 = new i40(this, 0);

    public j40(r40 r40Var) {
        this.I0 = r40Var;
    }

    public static void a(j40 j40Var, boolean z10) {
        long j3;
        int i7;
        r40 r40Var;
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
            j40Var.A0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                j40Var.A0.add(new a40());
            }
            if (z10) {
                j40Var.f35864h0 = j40Var.f35860e0 + j40Var.f35862f0;
                j40Var.f35868l0 = j40Var.f35866j0 + j40Var.f35867k0;
                j40Var.R = true;
                j3 = 0;
            } else {
                j40Var.f35864h0 = -1L;
                j40Var.f35868l0 = -1L;
                j3 = 0;
                j40Var.S = 0L;
            }
            j40Var.T = -1L;
            j40Var.P = j3;
            j40Var.Q = -1L;
            j40Var.f35865i0 = -1L;
            j40Var.f35858d0 = -1L;
            j40Var.f35860e0 = -1L;
            j40Var.f35863g0 = -1L;
            j40Var.f35866j0 = -1L;
            j40Var.f35855b0 = false;
            j40Var.f35853a0 = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i11);
            j40Var.f35887z0 = audioRecord;
            audioRecord.startRecording();
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.a8.b("InstantCamera initied audio record with channels " + j40Var.f35887z0.getChannelCount() + " sample rate = " + j40Var.f35887z0.getSampleRate() + " bufferSize = " + i11);
            }
            j40Var.E0 = false;
            Thread thread = new Thread(j40Var.F0);
            thread.setPriority(10);
            thread.start();
            j40Var.K = new MediaCodec.BufferInfo();
            j40Var.J = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", org.telegram.messenger.np.s1(j40Var.I0.f38846e).f25444y3 * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            j40Var.G = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            j40Var.G.start();
            j40Var.F = MediaCodec.createEncoderByType("video/avc");
            j40Var.I = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", j40Var.d, j40Var.f35859e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", j40Var.f35861f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            j40Var.F.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            j40Var.f35874r = j40Var.F.createInputSurface();
            j40Var.F.start();
            if (!z10) {
                org.telegram.messenger.oe oeVar = j40Var.f35852a;
                ThreadLocal threadLocal = org.telegram.messenger.fc.I;
                if (!TextUtils.isEmpty(org.telegram.messenger.gz.f23949h0) && oeVar.getAbsolutePath().startsWith(org.telegram.messenger.gz.f23949h0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j40Var.f35854b = j40Var.f35852a;
                if (z11) {
                    File file = new File(org.telegram.messenger.t0.h(), "camera_tmp.mp4");
                    j40Var.f35854b = file;
                    if (file.exists()) {
                        j40Var.f35854b.delete();
                    }
                    j40Var.f35856c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(j40Var.f35854b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(j40Var.d, j40Var.f35859e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, j40Var.I0.R, false);
                j40Var.L = createMovie;
                r40 r40Var2 = j40Var.I0;
                boolean j10 = org.telegram.messenger.gz.j();
                r40Var2.f38839a1 = j10;
                createMovie.setAllowSyncFiles(j10);
            }
            org.telegram.messenger.g0.h3(new ai.q(27, j40Var, z10));
            if (j40Var.f35876s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                j40Var.f35876s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (j40Var.f35881w == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(j40Var.f35876s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i7 = 0;
                                j40Var.f35881w = EGL14.eglCreateContext(j40Var.f35876s, eGLConfigArr[0], j40Var.f35883x, new int[]{12440, 2, 12344}, 0);
                                j40Var.f35885y = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i7 = 0;
                        }
                        EGL14.eglQueryContext(j40Var.f35876s, j40Var.f35881w, 12440, new int[1], i7);
                        if (j40Var.E == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(j40Var.f35876s, j40Var.f35885y, j40Var.f35874r, new int[]{12344}, i7);
                            j40Var.E = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(j40Var.f35876s, eglCreateWindowSurface, eglCreateWindowSurface, j40Var.f35881w)) {
                                    if (org.telegram.messenger.r2.f26198a) {
                                        org.telegram.messenger.a8.d("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                s30 s30Var = j40Var.f35886y0;
                                if (s30Var != null) {
                                    s30Var.b();
                                    j40Var.f35886y0 = null;
                                }
                                j40Var.f35886y0 = new s30(j40Var.d, j40Var.f35859e);
                                Size size = j40Var.I0.f38864n0[0];
                                if (org.telegram.messenger.gz.o() != 0 && r40.m() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= org.telegram.messenger.np.s1(r40Var.f38846e).f25424w3)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int l10 = r40.l(j40Var.I0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int l11 = r40.l(j40Var.I0, 35632, str);
                                if (l10 != 0 && l11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    j40Var.f35870n0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, l10);
                                    GLES20.glAttachShader(j40Var.f35870n0, l11);
                                    GLES20.glLinkProgram(j40Var.f35870n0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(j40Var.f35870n0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(j40Var.f35870n0);
                                        j40Var.f35870n0 = 0;
                                        return;
                                    }
                                    j40Var.f35873q0 = GLES20.glGetAttribLocation(j40Var.f35870n0, "aPosition");
                                    j40Var.f35875r0 = GLES20.glGetAttribLocation(j40Var.f35870n0, "aTextureCoord");
                                    j40Var.f35878t0 = GLES20.glGetUniformLocation(j40Var.f35870n0, "preview");
                                    j40Var.f35877s0 = GLES20.glGetUniformLocation(j40Var.f35870n0, "resolution");
                                    j40Var.f35880v0 = GLES20.glGetUniformLocation(j40Var.f35870n0, "alpha");
                                    j40Var.f35871o0 = GLES20.glGetUniformLocation(j40Var.f35870n0, "uMVPMatrix");
                                    j40Var.f35872p0 = GLES20.glGetUniformLocation(j40Var.f35870n0, "uSTMatrix");
                                    j40Var.f35879u0 = GLES20.glGetUniformLocation(j40Var.f35870n0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    j40Var.f35876s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void b(j40 j40Var, int i7, g40 g40Var) {
        boolean z10;
        org.telegram.messenger.q5 q5Var;
        org.telegram.messenger.g20 g20Var;
        if (i7 == 1 && (((g20Var = j40Var.I0.S) == null || !g20Var.c()) && !j40Var.I0.h.c())) {
            if (!j40Var.H0) {
                j40Var.H0 = true;
                org.telegram.messenger.g0.h3(new vs(15, j40Var, g40Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (j40Var.X && !j40Var.E0) {
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording running=false");
            j40Var.Y = i7;
            j40Var.Z = g40Var;
            j40Var.X = false;
            return;
        }
        try {
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording drain encoders");
            j40Var.d(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        MediaCodec mediaCodec = j40Var.F;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                j40Var.F.release();
                j40Var.F = null;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        MediaCodec mediaCodec2 = j40Var.G;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                j40Var.G.release();
                j40Var.G = null;
                g(false);
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        File file = j40Var.I0.f38852g0;
        if (file != null) {
            file.delete();
            j40Var.I0.f38852g0 = null;
        }
        MP4Builder mP4Builder = j40Var.L;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e13) {
                org.telegram.messenger.a8.g(e13, true);
            }
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording finish muxer");
            if (j40Var.f35856c) {
                if (j40Var.f35852a.exists()) {
                    try {
                        j40Var.f35852a.delete();
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.d("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + j40Var.f35852a);
                        org.telegram.messenger.a8.g(e14, true);
                    }
                }
                if (!j40Var.f35854b.renameTo(j40Var.f35852a)) {
                    org.telegram.messenger.a8.d("InstantCamera unable to rename file, try move file");
                    try {
                        org.telegram.messenger.g0.E(j40Var.f35854b, j40Var.f35852a);
                        j40Var.f35854b.delete();
                    } catch (IOException e15) {
                        org.telegram.messenger.a8.g(e15, true);
                        org.telegram.messenger.a8.d("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i7 != 2 && (q5Var = j40Var.C0) != null) {
            q5Var.cleanupQueue();
            j40Var.C0.recycle();
            j40Var.C0 = null;
        }
        org.telegram.messenger.a8.b("InstantCamera handleStopRecording send " + i7);
        if (i7 == 0) {
            org.telegram.messenger.w7.G(j40Var.I0.f38846e).b(j40Var.f35852a.getAbsolutePath(), false);
            try {
                j40Var.f35854b.delete();
            } catch (Throwable unused) {
            }
            try {
                j40Var.f35852a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i7 != 1 || !j40Var.H0)) {
                j40Var.H0 = true;
                org.telegram.messenger.g0.h3(new org.telegram.ui.f0(j40Var, i7, g40Var, 15));
            }
            org.telegram.messenger.g0.h3(new h40(j40Var, 2));
        }
        EGL14.eglDestroySurface(j40Var.f35876s, j40Var.E);
        j40Var.E = EGL14.EGL_NO_SURFACE;
        Surface surface = j40Var.f35874r;
        if (surface != null) {
            surface.release();
            j40Var.f35874r = null;
        }
        EGLDisplay eGLDisplay = j40Var.f35876s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(j40Var.f35876s, j40Var.f35881w);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(j40Var.f35876s);
        }
        j40Var.f35876s = EGL14.EGL_NO_DISPLAY;
        j40Var.f35881w = EGL14.EGL_NO_CONTEXT;
        j40Var.f35885y = null;
        j40Var.U.getClass();
        Looper.myLooper().quit();
        s30 s30Var = j40Var.f35886y0;
        if (s30Var != null) {
            s30Var.b();
            j40Var.f35886y0 = null;
        }
        org.telegram.messenger.g0.h3(new h40(j40Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.f26600b.getSystemService("audio");
        if (org.telegram.messenger.gz.f23985u0 && !c8.ka.d("android.permission.BLUETOOTH_CONNECT")) {
            org.telegram.messenger.gz.f23985u0 = false;
            org.telegram.messenger.gz.y();
        }
        if ((audioManager.isBluetoothScoAvailableOffCall() && org.telegram.messenger.gz.f23985u0) || !z10) {
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
                    org.telegram.messenger.a8.g(th2, true);
                    if (!z10) {
                        try {
                            if (audioManager.isBluetoothScoOn()) {
                                audioManager.stopBluetoothSco();
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
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

    public final void c(org.telegram.messenger.oe oeVar, long j3, boolean z10) {
        r40 r40Var = this.I0;
        int i7 = r40Var.f38846e;
        long j10 = 0;
        if (this.h) {
            org.telegram.messenger.w7.G(i7).g0(oeVar.toString(), r40Var.R, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i7);
                String file = oeVar.toString();
                boolean z11 = r40Var.R;
                if (z10) {
                    j10 = oeVar.length();
                }
                G.n(file, z11, j3, j10, null);
                return;
            }
            return;
        }
        org.telegram.messenger.w7 G2 = org.telegram.messenger.w7.G(i7);
        String file2 = oeVar.toString();
        boolean z12 = r40Var.R;
        if (z10) {
            j10 = oeVar.length();
        }
        G2.n(file2, z12, j3, j10, null);
    }

    public final void d(boolean z10) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (z10) {
            this.F.signalEndOfInputStream();
        }
        while (true) {
            int dequeueOutputBuffer = this.F.dequeueOutputBuffer(this.J, 10000L);
            byte b10 = 1;
            if (dequeueOutputBuffer == -1) {
                if (!z10 || this.E0) {
                    break;
                }
            } else if (dequeueOutputBuffer == -3) {
                continue;
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.F.getOutputFormat();
                if (this.N == -5) {
                    this.N = this.L.addTrack(outputFormat, false);
                    if (outputFormat.containsKey("prepend-sps-pps-to-idr-frames") && outputFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                        this.H = outputFormat.getByteBuffer("csd-1").limit() + outputFormat.getByteBuffer("csd-0").limit();
                    }
                }
            } else if (dequeueOutputBuffer < 0) {
                continue;
            } else {
                ByteBuffer outputBuffer = this.F.getOutputBuffer(dequeueOutputBuffer);
                if (outputBuffer != null) {
                    MediaCodec.BufferInfo bufferInfo = this.J;
                    int i7 = bufferInfo.size;
                    if (i7 > 1) {
                        int i10 = bufferInfo.flags;
                        if ((i10 & 2) == 0) {
                            int i11 = this.H;
                            if (i11 != 0 && (i10 & 1) != 0) {
                                bufferInfo.offset += i11;
                                bufferInfo.size = i7 - i11;
                            }
                            if (this.I && (i10 & 1) != 0) {
                                if (bufferInfo.size > 100) {
                                    outputBuffer.position(bufferInfo.offset);
                                    byte[] bArr = new byte[100];
                                    outputBuffer.get(bArr);
                                    int i12 = 0;
                                    int i13 = 0;
                                    while (true) {
                                        if (i12 < 96) {
                                            if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 0 && bArr[i12 + 3] == 1 && (i13 = i13 + 1) > 1) {
                                                MediaCodec.BufferInfo bufferInfo2 = this.J;
                                                bufferInfo2.offset += i12;
                                                bufferInfo2.size -= i12;
                                                break;
                                            }
                                            i12++;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                this.I = false;
                            }
                            long writeSampleData = this.L.writeSampleData(this.N, outputBuffer, this.J, true);
                            if (writeSampleData != 0 && !this.f35856c && this.I0.f38839a1) {
                                c(this.f35852a, writeSampleData, false);
                            }
                        } else if (this.N == -5) {
                            byte[] bArr2 = new byte[i7];
                            outputBuffer.limit(bufferInfo.offset + i7);
                            outputBuffer.position(this.J.offset);
                            outputBuffer.get(bArr2);
                            int i14 = this.J.size - 1;
                            while (i14 >= 0 && i14 > 3) {
                                if (bArr2[i14] == b10 && bArr2[i14 - 1] == 0 && bArr2[i14 - 2] == 0) {
                                    int i15 = i14 - 3;
                                    if (bArr2[i15] == 0) {
                                        byteBuffer = ByteBuffer.allocate(i15);
                                        byteBuffer2 = ByteBuffer.allocate(this.J.size - i15);
                                        byteBuffer.put(bArr2, 0, i15).position(0);
                                        byteBuffer2.put(bArr2, i15, this.J.size - i15).position(0);
                                        break;
                                    }
                                }
                                i14--;
                                b10 = 1;
                            }
                            byteBuffer = null;
                            byteBuffer2 = null;
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.d, this.f35859e);
                            if (byteBuffer != null && byteBuffer2 != null) {
                                createVideoFormat.setByteBuffer("csd-0", byteBuffer);
                                createVideoFormat.setByteBuffer("csd-1", byteBuffer2);
                            }
                            this.N = this.L.addTrack(createVideoFormat, false);
                        }
                    }
                    this.F.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.J.flags & 4) != 0) {
                        break;
                    }
                } else {
                    throw new RuntimeException(i5.c.j(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
            }
        }
        while (true) {
            int dequeueOutputBuffer2 = this.G.dequeueOutputBuffer(this.K, 0L);
            if (dequeueOutputBuffer2 == -1) {
                if (z10) {
                    if ((!this.X && this.Y == 0) || this.E0) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (dequeueOutputBuffer2 != -3) {
                if (dequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat2 = this.G.getOutputFormat();
                    if (this.O == -5) {
                        this.O = this.L.addTrack(outputFormat2, true);
                    }
                } else if (dequeueOutputBuffer2 < 0) {
                    continue;
                } else {
                    ByteBuffer outputBuffer2 = this.G.getOutputBuffer(dequeueOutputBuffer2);
                    if (outputBuffer2 != null) {
                        MediaCodec.BufferInfo bufferInfo3 = this.K;
                        if ((bufferInfo3.flags & 2) != 0) {
                            bufferInfo3.size = 0;
                        }
                        if (bufferInfo3.size != 0) {
                            long writeSampleData2 = this.L.writeSampleData(this.O, outputBuffer2, bufferInfo3, false);
                            if (writeSampleData2 != 0 && !this.f35856c && this.I0.f38839a1) {
                                c(this.f35852a, writeSampleData2, false);
                            }
                            MediaCodec mediaCodec = this.G;
                            if (mediaCodec != null) {
                                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer2, false);
                            }
                        } else {
                            MediaCodec mediaCodec2 = this.G;
                            if (mediaCodec2 != null) {
                                mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer2, false);
                            }
                        }
                        if ((this.K.flags & 4) != 0) {
                            return;
                        }
                    } else {
                        throw new RuntimeException(i5.c.j(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
                    }
                }
            }
        }
    }

    public final void f(SurfaceTexture surfaceTexture, Integer num, long j3) {
        synchronized (this.V) {
            try {
                if (!this.W) {
                    return;
                }
                long timestamp = surfaceTexture.getTimestamp();
                if (timestamp == 0) {
                    int i7 = this.f35882w0 + 1;
                    this.f35882w0 = i7;
                    if (i7 > 1) {
                        if (org.telegram.messenger.r2.f26198a) {
                            org.telegram.messenger.a8.b("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f35882w0 = 0;
                    j3 = timestamp;
                }
                this.U.sendMessage(this.U.obtainMessage(2, (int) (j3 >> 32), (int) j3, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        s30 s30Var = this.f35886y0;
        if (s30Var != null) {
            s30Var.b();
            this.f35886y0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f35876s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f35876s, this.f35881w);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f35876s);
                this.f35876s = EGL14.EGL_NO_DISPLAY;
                this.f35881w = EGL14.EGL_NO_CONTEXT;
                this.f35885y = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        u51 u51Var = new u51();
        r40 r40Var = this.I0;
        r40Var.T = u51Var;
        u51Var.K = new org.telegram.messenger.ou(this, 8);
        u51Var.A0(r40Var.f38867q0);
        r40Var.T.j0(Uri.fromFile(file), "other");
        r40Var.T.h0();
        r40Var.T.t0(true);
        r40Var.t();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = r40Var.f38841b1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(r40Var.f38863n, k6.f36298b, 0), ObjectAnimator.ofFloat(r40Var.G, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f35876s, this.E);
        this.E = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f35874r;
        if (surface != null) {
            surface.release();
            this.f35874r = null;
        }
        EGLDisplay eGLDisplay = this.f35876s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f35876s, this.f35881w);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f35876s);
        }
        this.f35876s = EGL14.EGL_NO_DISPLAY;
        this.f35881w = EGL14.EGL_NO_CONTEXT;
        this.f35885y = null;
    }

    public final void i(int i7, g40 g40Var) {
        this.U.sendMessage(this.U.obtainMessage(1, i7, 0, g40Var));
        org.telegram.messenger.g0.h3(new ih(8));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.V) {
            g.c cVar = new g.c(1);
            cVar.f12647b = new WeakReference(this);
            this.U = cVar;
            this.W = true;
            this.V.notify();
        }
        Looper.loop();
        synchronized (this.V) {
            this.W = false;
        }
    }
}
