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
public final class u40 implements Runnable {
    public org.telegram.messenger.r5 C0;
    public int D0;
    public volatile boolean E0;
    public MediaCodec F;
    public MediaCodec G;
    public boolean G0;
    public int H;
    public boolean H0;
    public boolean I;
    public final c50 I0;
    public MediaCodec.BufferInfo J;
    public MediaCodec.BufferInfo K;
    public MP4Builder L;
    public long P;
    public boolean R;
    public volatile g.c U;
    public volatile boolean W;
    public volatile boolean X;
    public volatile int Y;
    public volatile r40 Z;
    public org.telegram.messenger.oe f40223a;
    public long f40224a0;
    public File f40225b;
    public boolean f40226b0;
    public boolean f40227c;
    public long f40228c0;
    public int d;
    public int f40230e;
    public long f40231e0;
    public int f40232f;
    public long f40233f0;
    public long f40234g0;
    public boolean m0;
    public boolean f40240n;
    public int f40241n0;
    public int f40242o0;
    public int f40243p0;
    public int f40244q0;
    public Surface f40245r;
    public int f40246r0;
    public int f40248s0;
    public int f40249t0;
    public int f40250u0;
    public int f40251v0;
    public int f40253w0;
    public EGLContext f40254x;
    public EGLConfig f40256y;
    public d40 f40257y0;
    public AudioRecord f40258z0;
    public boolean h = true;
    public EGLDisplay f40247s = EGL14.EGL_NO_DISPLAY;
    public EGLContext f40252w = EGL14.EGL_NO_CONTEXT;
    public EGLSurface E = EGL14.EGL_NO_SURFACE;
    public final ArrayList M = new ArrayList();
    public int N = -5;
    public int O = -5;
    public long Q = -1;
    public long S = 0;
    public long T = -1;
    public final Object V = new Object();
    public long f40229d0 = -1;
    public long f40235h0 = -1;
    public long f40236i0 = -1;
    public long f40237j0 = -1;
    public long f40238k0 = 0;
    public long f40239l0 = -1;
    public Integer f40255x0 = 0;
    public final ArrayBlockingQueue A0 = new ArrayBlockingQueue(10);
    public final ArrayList B0 = new ArrayList();
    public final t40 F0 = new t40(this, 0);

    public u40(c50 c50Var) {
        this.I0 = c50Var;
    }

    public static void a(u40 u40Var, boolean z10) {
        long j3;
        int i7;
        c50 c50Var;
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
            u40Var.A0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                u40Var.A0.add(new l40());
            }
            if (z10) {
                u40Var.f40235h0 = u40Var.f40231e0 + u40Var.f40233f0;
                u40Var.f40239l0 = u40Var.f40237j0 + u40Var.f40238k0;
                u40Var.R = true;
                j3 = 0;
            } else {
                u40Var.f40235h0 = -1L;
                u40Var.f40239l0 = -1L;
                j3 = 0;
                u40Var.S = 0L;
            }
            u40Var.T = -1L;
            u40Var.P = j3;
            u40Var.Q = -1L;
            u40Var.f40236i0 = -1L;
            u40Var.f40229d0 = -1L;
            u40Var.f40231e0 = -1L;
            u40Var.f40234g0 = -1L;
            u40Var.f40237j0 = -1L;
            u40Var.f40226b0 = false;
            u40Var.f40224a0 = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i11);
            u40Var.f40258z0 = audioRecord;
            audioRecord.startRecording();
            if (org.telegram.messenger.s2.f26730a) {
                org.telegram.messenger.a8.b("InstantCamera initied audio record with channels " + u40Var.f40258z0.getChannelCount() + " sample rate = " + u40Var.f40258z0.getSampleRate() + " bufferSize = " + i11);
            }
            u40Var.E0 = false;
            Thread thread = new Thread(u40Var.F0);
            thread.setPriority(10);
            thread.start();
            u40Var.K = new MediaCodec.BufferInfo();
            u40Var.J = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", org.telegram.messenger.np.u1(u40Var.I0.f34023e).A3 * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            u40Var.G = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            u40Var.G.start();
            u40Var.F = MediaCodec.createEncoderByType("video/avc");
            u40Var.I = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", u40Var.d, u40Var.f40230e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", u40Var.f40232f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            u40Var.F.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            u40Var.f40245r = u40Var.F.createInputSurface();
            u40Var.F.start();
            if (!z10) {
                org.telegram.messenger.oe oeVar = u40Var.f40223a;
                ThreadLocal threadLocal = org.telegram.messenger.fc.I;
                if (!TextUtils.isEmpty(org.telegram.messenger.cz.f23410h0) && oeVar.getAbsolutePath().startsWith(org.telegram.messenger.cz.f23410h0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u40Var.f40225b = u40Var.f40223a;
                if (z11) {
                    File file = new File(org.telegram.messenger.t0.h(), "camera_tmp.mp4");
                    u40Var.f40225b = file;
                    if (file.exists()) {
                        u40Var.f40225b.delete();
                    }
                    u40Var.f40227c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(u40Var.f40225b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(u40Var.d, u40Var.f40230e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, u40Var.I0.R, false);
                u40Var.L = createMovie;
                c50 c50Var2 = u40Var.I0;
                boolean j10 = org.telegram.messenger.cz.j();
                c50Var2.f34016a1 = j10;
                createMovie.setAllowSyncFiles(j10);
            }
            org.telegram.messenger.g0.g3(new ch.k(27, u40Var, z10));
            if (u40Var.f40247s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                u40Var.f40247s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (u40Var.f40252w == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(u40Var.f40247s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i7 = 0;
                                u40Var.f40252w = EGL14.eglCreateContext(u40Var.f40247s, eGLConfigArr[0], u40Var.f40254x, new int[]{12440, 2, 12344}, 0);
                                u40Var.f40256y = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i7 = 0;
                        }
                        EGL14.eglQueryContext(u40Var.f40247s, u40Var.f40252w, 12440, new int[1], i7);
                        if (u40Var.E == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(u40Var.f40247s, u40Var.f40256y, u40Var.f40245r, new int[]{12344}, i7);
                            u40Var.E = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(u40Var.f40247s, eglCreateWindowSurface, eglCreateWindowSurface, u40Var.f40252w)) {
                                    if (org.telegram.messenger.s2.f26730a) {
                                        org.telegram.messenger.a8.d("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                d40 d40Var = u40Var.f40257y0;
                                if (d40Var != null) {
                                    d40Var.b();
                                    u40Var.f40257y0 = null;
                                }
                                u40Var.f40257y0 = new d40(u40Var.d, u40Var.f40230e);
                                Size size = u40Var.I0.f34041n0[0];
                                if (org.telegram.messenger.cz.o() != 0 && c50.m() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= org.telegram.messenger.np.u1(c50Var.f34023e).f26012y3)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int l10 = c50.l(u40Var.I0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int l11 = c50.l(u40Var.I0, 35632, str);
                                if (l10 != 0 && l11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    u40Var.f40241n0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, l10);
                                    GLES20.glAttachShader(u40Var.f40241n0, l11);
                                    GLES20.glLinkProgram(u40Var.f40241n0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(u40Var.f40241n0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(u40Var.f40241n0);
                                        u40Var.f40241n0 = 0;
                                        return;
                                    }
                                    u40Var.f40244q0 = GLES20.glGetAttribLocation(u40Var.f40241n0, "aPosition");
                                    u40Var.f40246r0 = GLES20.glGetAttribLocation(u40Var.f40241n0, "aTextureCoord");
                                    u40Var.f40249t0 = GLES20.glGetUniformLocation(u40Var.f40241n0, "preview");
                                    u40Var.f40248s0 = GLES20.glGetUniformLocation(u40Var.f40241n0, "resolution");
                                    u40Var.f40251v0 = GLES20.glGetUniformLocation(u40Var.f40241n0, "alpha");
                                    u40Var.f40242o0 = GLES20.glGetUniformLocation(u40Var.f40241n0, "uMVPMatrix");
                                    u40Var.f40243p0 = GLES20.glGetUniformLocation(u40Var.f40241n0, "uSTMatrix");
                                    u40Var.f40250u0 = GLES20.glGetUniformLocation(u40Var.f40241n0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    u40Var.f40247s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void b(u40 u40Var, int i7, r40 r40Var) {
        boolean z10;
        org.telegram.messenger.r5 r5Var;
        org.telegram.messenger.f20 f20Var;
        if (i7 == 1 && (((f20Var = u40Var.I0.S) == null || !f20Var.c()) && !u40Var.I0.h.c())) {
            if (!u40Var.H0) {
                u40Var.H0 = true;
                org.telegram.messenger.g0.g3(new ou(13, u40Var, r40Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (u40Var.X && !u40Var.E0) {
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording running=false");
            u40Var.Y = i7;
            u40Var.Z = r40Var;
            u40Var.X = false;
            return;
        }
        try {
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording drain encoders");
            u40Var.d(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        MediaCodec mediaCodec = u40Var.F;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                u40Var.F.release();
                u40Var.F = null;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        MediaCodec mediaCodec2 = u40Var.G;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                u40Var.G.release();
                u40Var.G = null;
                g(false);
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        File file = u40Var.I0.f34029g0;
        if (file != null) {
            file.delete();
            u40Var.I0.f34029g0 = null;
        }
        MP4Builder mP4Builder = u40Var.L;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e13) {
                org.telegram.messenger.a8.g(e13, true);
            }
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording finish muxer");
            if (u40Var.f40227c) {
                if (u40Var.f40223a.exists()) {
                    try {
                        u40Var.f40223a.delete();
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.d("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + u40Var.f40223a);
                        org.telegram.messenger.a8.g(e14, true);
                    }
                }
                if (!u40Var.f40225b.renameTo(u40Var.f40223a)) {
                    org.telegram.messenger.a8.d("InstantCamera unable to rename file, try move file");
                    try {
                        org.telegram.messenger.g0.E(u40Var.f40225b, u40Var.f40223a);
                        u40Var.f40225b.delete();
                    } catch (IOException e15) {
                        org.telegram.messenger.a8.g(e15, true);
                        org.telegram.messenger.a8.d("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i7 != 2 && (r5Var = u40Var.C0) != null) {
            r5Var.cleanupQueue();
            u40Var.C0.recycle();
            u40Var.C0 = null;
        }
        org.telegram.messenger.a8.b("InstantCamera handleStopRecording send " + i7);
        if (i7 == 0) {
            org.telegram.messenger.w7.G(u40Var.I0.f34023e).b(u40Var.f40223a.getAbsolutePath(), false);
            try {
                u40Var.f40225b.delete();
            } catch (Throwable unused) {
            }
            try {
                u40Var.f40223a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i7 != 1 || !u40Var.H0)) {
                u40Var.H0 = true;
                org.telegram.messenger.g0.g3(new org.telegram.ui.f0(u40Var, i7, r40Var, 15));
            }
            org.telegram.messenger.g0.g3(new s40(u40Var, 2));
        }
        EGL14.eglDestroySurface(u40Var.f40247s, u40Var.E);
        u40Var.E = EGL14.EGL_NO_SURFACE;
        Surface surface = u40Var.f40245r;
        if (surface != null) {
            surface.release();
            u40Var.f40245r = null;
        }
        EGLDisplay eGLDisplay = u40Var.f40247s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(u40Var.f40247s, u40Var.f40252w);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(u40Var.f40247s);
        }
        u40Var.f40247s = EGL14.EGL_NO_DISPLAY;
        u40Var.f40252w = EGL14.EGL_NO_CONTEXT;
        u40Var.f40256y = null;
        u40Var.U.getClass();
        Looper.myLooper().quit();
        d40 d40Var = u40Var.f40257y0;
        if (d40Var != null) {
            d40Var.b();
            u40Var.f40257y0 = null;
        }
        org.telegram.messenger.g0.g3(new s40(u40Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.f26931b.getSystemService("audio");
        if (org.telegram.messenger.cz.f23446u0 && !c8.na.d("android.permission.BLUETOOTH_CONNECT")) {
            org.telegram.messenger.cz.f23446u0 = false;
            org.telegram.messenger.cz.y();
        }
        if ((audioManager.isBluetoothScoAvailableOffCall() && org.telegram.messenger.cz.f23446u0) || !z10) {
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
        c50 c50Var = this.I0;
        int i7 = c50Var.f34023e;
        long j10 = 0;
        if (this.h) {
            org.telegram.messenger.w7.G(i7).g0(oeVar.toString(), c50Var.R, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i7);
                String file = oeVar.toString();
                boolean z11 = c50Var.R;
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
        boolean z12 = c50Var.R;
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
                            if (writeSampleData != 0 && !this.f40227c && this.I0.f34016a1) {
                                c(this.f40223a, writeSampleData, false);
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
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.d, this.f40230e);
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
                            if (writeSampleData2 != 0 && !this.f40227c && this.I0.f34016a1) {
                                c(this.f40223a, writeSampleData2, false);
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
                    int i7 = this.f40253w0 + 1;
                    this.f40253w0 = i7;
                    if (i7 > 1) {
                        if (org.telegram.messenger.s2.f26730a) {
                            org.telegram.messenger.a8.b("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f40253w0 = 0;
                    j3 = timestamp;
                }
                this.U.sendMessage(this.U.obtainMessage(2, (int) (j3 >> 32), (int) j3, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        d40 d40Var = this.f40257y0;
        if (d40Var != null) {
            d40Var.b();
            this.f40257y0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f40247s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f40247s, this.f40252w);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f40247s);
                this.f40247s = EGL14.EGL_NO_DISPLAY;
                this.f40252w = EGL14.EGL_NO_CONTEXT;
                this.f40256y = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        i61 i61Var = new i61();
        c50 c50Var = this.I0;
        c50Var.T = i61Var;
        i61Var.K = new jn(this, 2);
        i61Var.A0(c50Var.f34044q0);
        c50Var.T.j0(Uri.fromFile(file), "other");
        c50Var.T.h0();
        c50Var.T.t0(true);
        c50Var.t();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = c50Var.f34018b1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(c50Var.f34040n, r6.f39094b, 0), ObjectAnimator.ofFloat(c50Var.G, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f40247s, this.E);
        this.E = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f40245r;
        if (surface != null) {
            surface.release();
            this.f40245r = null;
        }
        EGLDisplay eGLDisplay = this.f40247s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f40247s, this.f40252w);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f40247s);
        }
        this.f40247s = EGL14.EGL_NO_DISPLAY;
        this.f40252w = EGL14.EGL_NO_CONTEXT;
        this.f40256y = null;
    }

    public final void i(int i7, r40 r40Var) {
        this.U.sendMessage(this.U.obtainMessage(1, i7, 0, r40Var));
        org.telegram.messenger.g0.g3(new me(10));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.V) {
            g.c cVar = new g.c(1);
            cVar.f12993b = new WeakReference(this);
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
