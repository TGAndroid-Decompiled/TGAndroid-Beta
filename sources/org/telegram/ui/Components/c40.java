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
public final class c40 implements Runnable {
    public org.telegram.messenger.q5 C0;
    public int D0;
    public volatile boolean E0;
    public MediaCodec F;
    public MediaCodec G;
    public boolean G0;
    public int H;
    public boolean H0;
    public boolean I;
    public final k40 I0;
    public MediaCodec.BufferInfo J;
    public MediaCodec.BufferInfo K;
    public MP4Builder L;
    public long P;
    public boolean R;
    public volatile g.c U;
    public volatile boolean W;
    public volatile boolean X;
    public volatile int Y;
    public volatile z30 Z;
    public org.telegram.messenger.je f32523a;
    public long f32524a0;
    public File f32525b;
    public boolean f32526b0;
    public boolean f32527c;
    public long f32528c0;
    public int d;
    public int f32530e;
    public long f32531e0;
    public int f32532f;
    public long f32533f0;
    public long f32534g0;
    public boolean m0;
    public boolean f32540n;
    public int f32541n0;
    public int f32542o0;
    public int f32543p0;
    public int f32544q0;
    public Surface f32545r;
    public int f32546r0;
    public int f32548s0;
    public int f32549t0;
    public int f32550u0;
    public int f32551v0;
    public int f32553w0;
    public EGLContext f32554x;
    public EGLConfig f32556y;
    public l30 f32557y0;
    public AudioRecord f32558z0;
    public boolean h = true;
    public EGLDisplay f32547s = EGL14.EGL_NO_DISPLAY;
    public EGLContext f32552w = EGL14.EGL_NO_CONTEXT;
    public EGLSurface E = EGL14.EGL_NO_SURFACE;
    public final ArrayList M = new ArrayList();
    public int N = -5;
    public int O = -5;
    public long Q = -1;
    public long S = 0;
    public long T = -1;
    public final Object V = new Object();
    public long f32529d0 = -1;
    public long f32535h0 = -1;
    public long f32536i0 = -1;
    public long f32537j0 = -1;
    public long f32538k0 = 0;
    public long f32539l0 = -1;
    public Integer f32555x0 = 0;
    public final ArrayBlockingQueue A0 = new ArrayBlockingQueue(10);
    public final ArrayList B0 = new ArrayList();
    public final b40 F0 = new b40(this, 0);

    public c40(k40 k40Var) {
        this.I0 = k40Var;
    }

    public static void a(c40 c40Var, boolean z10) {
        long j10;
        int i3;
        k40 k40Var;
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
            c40Var.A0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                c40Var.A0.add(new t30());
            }
            if (z10) {
                c40Var.f32535h0 = c40Var.f32531e0 + c40Var.f32533f0;
                c40Var.f32539l0 = c40Var.f32537j0 + c40Var.f32538k0;
                c40Var.R = true;
                j10 = 0;
            } else {
                c40Var.f32535h0 = -1L;
                c40Var.f32539l0 = -1L;
                j10 = 0;
                c40Var.S = 0L;
            }
            c40Var.T = -1L;
            c40Var.P = j10;
            c40Var.Q = -1L;
            c40Var.f32536i0 = -1L;
            c40Var.f32529d0 = -1L;
            c40Var.f32531e0 = -1L;
            c40Var.f32534g0 = -1L;
            c40Var.f32537j0 = -1L;
            c40Var.f32526b0 = false;
            c40Var.f32524a0 = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i11);
            c40Var.f32558z0 = audioRecord;
            audioRecord.startRecording();
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.a8.b("InstantCamera initied audio record with channels " + c40Var.f32558z0.getChannelCount() + " sample rate = " + c40Var.f32558z0.getSampleRate() + " bufferSize = " + i11);
            }
            c40Var.E0 = false;
            Thread thread = new Thread(c40Var.F0);
            thread.setPriority(10);
            thread.start();
            c40Var.K = new MediaCodec.BufferInfo();
            c40Var.J = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", org.telegram.messenger.hp.s1(c40Var.I0.f35272e).f23173y3 * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            c40Var.G = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            c40Var.G.start();
            c40Var.F = MediaCodec.createEncoderByType("video/avc");
            c40Var.I = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", c40Var.d, c40Var.f32530e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", c40Var.f32532f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            c40Var.F.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            c40Var.f32545r = c40Var.F.createInputSurface();
            c40Var.F.start();
            if (!z10) {
                org.telegram.messenger.je jeVar = c40Var.f32523a;
                ThreadLocal threadLocal = org.telegram.messenger.zb.I;
                if (!TextUtils.isEmpty(org.telegram.messenger.az.f21632h0) && jeVar.getAbsolutePath().startsWith(org.telegram.messenger.az.f21632h0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c40Var.f32525b = c40Var.f32523a;
                if (z11) {
                    File file = new File(org.telegram.messenger.t0.h(), "camera_tmp.mp4");
                    c40Var.f32525b = file;
                    if (file.exists()) {
                        c40Var.f32525b.delete();
                    }
                    c40Var.f32527c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(c40Var.f32525b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(c40Var.d, c40Var.f32530e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, c40Var.I0.R, false);
                c40Var.L = createMovie;
                k40 k40Var2 = c40Var.I0;
                boolean j11 = org.telegram.messenger.az.j();
                k40Var2.f35265a1 = j11;
                createMovie.setAllowSyncFiles(j11);
            }
            org.telegram.messenger.g0.h3(new ci.e1(26, c40Var, z10));
            if (c40Var.f32547s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                c40Var.f32547s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (c40Var.f32552w == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(c40Var.f32547s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i3 = 0;
                                c40Var.f32552w = EGL14.eglCreateContext(c40Var.f32547s, eGLConfigArr[0], c40Var.f32554x, new int[]{12440, 2, 12344}, 0);
                                c40Var.f32556y = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i3 = 0;
                        }
                        EGL14.eglQueryContext(c40Var.f32547s, c40Var.f32552w, 12440, new int[1], i3);
                        if (c40Var.E == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(c40Var.f32547s, c40Var.f32556y, c40Var.f32545r, new int[]{12344}, i3);
                            c40Var.E = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(c40Var.f32547s, eglCreateWindowSurface, eglCreateWindowSurface, c40Var.f32552w)) {
                                    if (org.telegram.messenger.r2.f25040a) {
                                        org.telegram.messenger.a8.d("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                l30 l30Var = c40Var.f32557y0;
                                if (l30Var != null) {
                                    l30Var.b();
                                    c40Var.f32557y0 = null;
                                }
                                c40Var.f32557y0 = new l30(c40Var.d, c40Var.f32530e);
                                Size size = c40Var.I0.f35290n0[0];
                                if (org.telegram.messenger.az.o() != 0 && k40.l() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= org.telegram.messenger.hp.s1(k40Var.f35272e).f23153w3)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int k10 = k40.k(c40Var.I0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int k11 = k40.k(c40Var.I0, 35632, str);
                                if (k10 != 0 && k11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    c40Var.f32541n0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, k10);
                                    GLES20.glAttachShader(c40Var.f32541n0, k11);
                                    GLES20.glLinkProgram(c40Var.f32541n0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(c40Var.f32541n0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(c40Var.f32541n0);
                                        c40Var.f32541n0 = 0;
                                        return;
                                    }
                                    c40Var.f32544q0 = GLES20.glGetAttribLocation(c40Var.f32541n0, "aPosition");
                                    c40Var.f32546r0 = GLES20.glGetAttribLocation(c40Var.f32541n0, "aTextureCoord");
                                    c40Var.f32549t0 = GLES20.glGetUniformLocation(c40Var.f32541n0, "preview");
                                    c40Var.f32548s0 = GLES20.glGetUniformLocation(c40Var.f32541n0, "resolution");
                                    c40Var.f32551v0 = GLES20.glGetUniformLocation(c40Var.f32541n0, "alpha");
                                    c40Var.f32542o0 = GLES20.glGetUniformLocation(c40Var.f32541n0, "uMVPMatrix");
                                    c40Var.f32543p0 = GLES20.glGetUniformLocation(c40Var.f32541n0, "uSTMatrix");
                                    c40Var.f32550u0 = GLES20.glGetUniformLocation(c40Var.f32541n0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    c40Var.f32547s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void b(c40 c40Var, int i3, z30 z30Var) {
        boolean z10;
        org.telegram.messenger.q5 q5Var;
        org.telegram.messenger.b20 b20Var;
        if (i3 == 1 && (((b20Var = c40Var.I0.S) == null || !b20Var.c()) && !c40Var.I0.h.c())) {
            if (!c40Var.H0) {
                c40Var.H0 = true;
                org.telegram.messenger.g0.h3(new cl(26, c40Var, z30Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (c40Var.X && !c40Var.E0) {
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording running=false");
            c40Var.Y = i3;
            c40Var.Z = z30Var;
            c40Var.X = false;
            return;
        }
        try {
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording drain encoders");
            c40Var.e(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        MediaCodec mediaCodec = c40Var.F;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                c40Var.F.release();
                c40Var.F = null;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        MediaCodec mediaCodec2 = c40Var.G;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                c40Var.G.release();
                c40Var.G = null;
                g(false);
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        File file = c40Var.I0.f35278g0;
        if (file != null) {
            file.delete();
            c40Var.I0.f35278g0 = null;
        }
        MP4Builder mP4Builder = c40Var.L;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e13) {
                org.telegram.messenger.a8.g(e13, true);
            }
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording finish muxer");
            if (c40Var.f32527c) {
                if (c40Var.f32523a.exists()) {
                    try {
                        c40Var.f32523a.delete();
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.d("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + c40Var.f32523a);
                        org.telegram.messenger.a8.g(e14, true);
                    }
                }
                if (!c40Var.f32525b.renameTo(c40Var.f32523a)) {
                    org.telegram.messenger.a8.d("InstantCamera unable to rename file, try move file");
                    try {
                        org.telegram.messenger.g0.E(c40Var.f32525b, c40Var.f32523a);
                        c40Var.f32525b.delete();
                    } catch (IOException e15) {
                        org.telegram.messenger.a8.g(e15, true);
                        org.telegram.messenger.a8.d("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i3 != 2 && (q5Var = c40Var.C0) != null) {
            q5Var.cleanupQueue();
            c40Var.C0.recycle();
            c40Var.C0 = null;
        }
        org.telegram.messenger.a8.b("InstantCamera handleStopRecording send " + i3);
        if (i3 == 0) {
            org.telegram.messenger.w7.G(c40Var.I0.f35272e).b(c40Var.f32523a.getAbsolutePath(), false);
            try {
                c40Var.f32525b.delete();
            } catch (Throwable unused) {
            }
            try {
                c40Var.f32523a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i3 != 1 || !c40Var.H0)) {
                c40Var.H0 = true;
                org.telegram.messenger.g0.h3(new org.telegram.ui.f4(c40Var, i3, z30Var, 13));
            }
            org.telegram.messenger.g0.h3(new a40(c40Var, 2));
        }
        EGL14.eglDestroySurface(c40Var.f32547s, c40Var.E);
        c40Var.E = EGL14.EGL_NO_SURFACE;
        Surface surface = c40Var.f32545r;
        if (surface != null) {
            surface.release();
            c40Var.f32545r = null;
        }
        EGLDisplay eGLDisplay = c40Var.f32547s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(c40Var.f32547s, c40Var.f32552w);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(c40Var.f32547s);
        }
        c40Var.f32547s = EGL14.EGL_NO_DISPLAY;
        c40Var.f32552w = EGL14.EGL_NO_CONTEXT;
        c40Var.f32556y = null;
        c40Var.U.getClass();
        Looper.myLooper().quit();
        l30 l30Var = c40Var.f32557y0;
        if (l30Var != null) {
            l30Var.b();
            c40Var.f32557y0 = null;
        }
        org.telegram.messenger.g0.h3(new a40(c40Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.f25457b.getSystemService("audio");
        if (org.telegram.messenger.az.f21668u0 && !b8.nf.d("android.permission.BLUETOOTH_CONNECT")) {
            org.telegram.messenger.az.f21668u0 = false;
            org.telegram.messenger.az.y();
        }
        if ((audioManager.isBluetoothScoAvailableOffCall() && org.telegram.messenger.az.f21668u0) || !z10) {
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

    public final void c(org.telegram.messenger.je jeVar, long j10, boolean z10) {
        k40 k40Var = this.I0;
        int i3 = k40Var.f35272e;
        long j11 = 0;
        if (this.h) {
            org.telegram.messenger.w7.G(i3).h0(jeVar.toString(), k40Var.R, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i3);
                String file = jeVar.toString();
                boolean z11 = k40Var.R;
                if (z10) {
                    j11 = jeVar.length();
                }
                G.n(file, z11, j10, j11, null);
                return;
            }
            return;
        }
        org.telegram.messenger.w7 G2 = org.telegram.messenger.w7.G(i3);
        String file2 = jeVar.toString();
        boolean z12 = k40Var.R;
        if (z10) {
            j11 = jeVar.length();
        }
        G2.n(file2, z12, j10, j11, null);
    }

    public final void e(boolean z10) {
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
                    int i3 = bufferInfo.size;
                    if (i3 > 1) {
                        int i10 = bufferInfo.flags;
                        if ((i10 & 2) == 0) {
                            int i11 = this.H;
                            if (i11 != 0 && (i10 & 1) != 0) {
                                bufferInfo.offset += i11;
                                bufferInfo.size = i3 - i11;
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
                            if (writeSampleData != 0 && !this.f32527c && this.I0.f35265a1) {
                                c(this.f32523a, writeSampleData, false);
                            }
                        } else if (this.N == -5) {
                            byte[] bArr2 = new byte[i3];
                            outputBuffer.limit(bufferInfo.offset + i3);
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
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.d, this.f32530e);
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
                    throw new RuntimeException(k2.p1.j(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
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
                            if (writeSampleData2 != 0 && !this.f32527c && this.I0.f35265a1) {
                                c(this.f32523a, writeSampleData2, false);
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
                        throw new RuntimeException(k2.p1.j(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
                    }
                }
            }
        }
    }

    public final void f(SurfaceTexture surfaceTexture, Integer num, long j10) {
        synchronized (this.V) {
            try {
                if (!this.W) {
                    return;
                }
                long timestamp = surfaceTexture.getTimestamp();
                if (timestamp == 0) {
                    int i3 = this.f32553w0 + 1;
                    this.f32553w0 = i3;
                    if (i3 > 1) {
                        if (org.telegram.messenger.r2.f25040a) {
                            org.telegram.messenger.a8.b("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f32553w0 = 0;
                    j10 = timestamp;
                }
                this.U.sendMessage(this.U.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        l30 l30Var = this.f32557y0;
        if (l30Var != null) {
            l30Var.b();
            this.f32557y0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f32547s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f32547s, this.f32552w);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f32547s);
                this.f32547s = EGL14.EGL_NO_DISPLAY;
                this.f32552w = EGL14.EGL_NO_CONTEXT;
                this.f32556y = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        m51 m51Var = new m51();
        k40 k40Var = this.I0;
        k40Var.T = m51Var;
        m51Var.K = new i9(this, 3);
        m51Var.A0(k40Var.f35293q0);
        k40Var.T.j0(Uri.fromFile(file), "other");
        k40Var.T.h0();
        k40Var.T.t0(true);
        k40Var.s();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = k40Var.f35267b1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(k40Var.f35289n, k6.f35323b, 0), ObjectAnimator.ofFloat(k40Var.G, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f32547s, this.E);
        this.E = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f32545r;
        if (surface != null) {
            surface.release();
            this.f32545r = null;
        }
        EGLDisplay eGLDisplay = this.f32547s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f32547s, this.f32552w);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f32547s);
        }
        this.f32547s = EGL14.EGL_NO_DISPLAY;
        this.f32552w = EGL14.EGL_NO_CONTEXT;
        this.f32556y = null;
    }

    public final void i(int i3, z30 z30Var) {
        this.U.sendMessage(this.U.obtainMessage(1, i3, 0, z30Var));
        org.telegram.messenger.g0.h3(new go(6));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.V) {
            g.c cVar = new g.c(1);
            cVar.f11681b = new WeakReference(this);
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
