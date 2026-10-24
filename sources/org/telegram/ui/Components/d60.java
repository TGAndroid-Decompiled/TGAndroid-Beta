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
public final class d60 implements Runnable {
    public DispatchQueue B0;
    public int C0;
    public volatile boolean D0;
    public MediaCodec E;
    public MediaCodec F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public final l60 H0;
    public MediaCodec.BufferInfo I;
    public MediaCodec.BufferInfo J;
    public MP4Builder K;
    public long O;
    public boolean Q;
    public volatile g.c T;
    public volatile boolean V;
    public volatile boolean W;
    public volatile int X;
    public volatile y50 Y;
    public long Z;
    public q50 f25574a;
    public boolean f25575a0;
    public File f25576b;
    public long f25577b0;
    public boolean f25578c;
    public int d;
    public long f25580d0;
    public int e;
    public long f25581e0;
    public int f25582f;
    public long f25583f0;
    public boolean f25589l0;
    public int m0;
    public boolean f25590n;
    public int f25591n0;
    public int f25592o0;
    public int f25593p0;
    public int f25594q0;
    public Surface f25595r;
    public int f25596r0;
    public int f25598s0;
    public int f25599t0;
    public int f25600u0;
    public int f25601v0;
    public EGLContext f25602w;
    public EGLConfig f25604x;
    public j50 f25605x0;
    public AudioRecord f25607y0;
    public boolean h = true;
    public EGLDisplay f25597s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f25606y = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long f25579c0 = -1;
    public long f25584g0 = -1;
    public long f25585h0 = -1;
    public long f25586i0 = -1;
    public long f25587j0 = 0;
    public long f25588k0 = -1;
    public Integer f25603w0 = 0;
    public final ArrayBlockingQueue f25608z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final c60 E0 = new c60(this, 0);

    public d60(l60 l60Var) {
        this.H0 = l60Var;
    }

    public static void a(d60 d60Var, boolean z10) {
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
            d60Var.f25608z0.clear();
            for (int i13 = 0; i13 < 3; i13++) {
                d60Var.f25608z0.add(new s50());
            }
            if (z10) {
                d60Var.f25584g0 = d60Var.f25580d0 + d60Var.f25581e0;
                d60Var.f25588k0 = d60Var.f25586i0 + d60Var.f25587j0;
                d60Var.Q = true;
                j10 = 0;
            } else {
                d60Var.f25584g0 = -1L;
                d60Var.f25588k0 = -1L;
                j10 = 0;
                d60Var.R = 0L;
            }
            d60Var.S = -1L;
            d60Var.O = j10;
            d60Var.P = -1L;
            d60Var.f25585h0 = -1L;
            d60Var.f25579c0 = -1L;
            d60Var.f25580d0 = -1L;
            d60Var.f25583f0 = -1L;
            d60Var.f25586i0 = -1L;
            d60Var.f25575a0 = false;
            d60Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i12);
            d60Var.f25607y0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + d60Var.f25607y0.getChannelCount() + " sample rate = " + d60Var.f25607y0.getSampleRate() + " bufferSize = " + i12);
            }
            d60Var.D0 = false;
            Thread thread = new Thread(d60Var.E0);
            thread.setPriority(10);
            thread.start();
            d60Var.J = new MediaCodec.BufferInfo();
            d60Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(d60Var.H0.f28188f).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            d60Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            d60Var.F.start();
            d60Var.E = MediaCodec.createEncoderByType("video/avc");
            d60Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", d60Var.d, d60Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", d60Var.f25582f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            d60Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            d60Var.f25595r = d60Var.E.createInputSurface();
            d60Var.E.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(d60Var.f25574a);
                d60Var.f25576b = d60Var.f25574a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    d60Var.f25576b = file;
                    if (file.exists()) {
                        d60Var.f25576b.delete();
                    }
                    d60Var.f25578c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(d60Var.f25576b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(d60Var.d, d60Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, d60Var.H0.R, false);
                d60Var.K = createMovie;
                l60 l60Var = d60Var.H0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                l60Var.f28179a1 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new z50(0, d60Var, z10));
            if (d60Var.f25597s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                d60Var.f25597s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (d60Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(d60Var.f25597s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i10 = 0;
                                d60Var.v = EGL14.eglCreateContext(d60Var.f25597s, eGLConfigArr[0], d60Var.f25602w, new int[]{12440, 2, 12344}, 0);
                                d60Var.f25604x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i10 = 0;
                        }
                        EGL14.eglQueryContext(d60Var.f25597s, d60Var.v, 12440, new int[1], i10);
                        if (d60Var.f25606y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(d60Var.f25597s, d60Var.f25604x, d60Var.f25595r, new int[]{12344}, i10);
                            d60Var.f25606y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(d60Var.f25597s, eglCreateWindowSurface, eglCreateWindowSurface, d60Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                j50 j50Var = d60Var.f25605x0;
                                if (j50Var != null) {
                                    j50Var.b();
                                    d60Var.f25605x0 = null;
                                }
                                d60Var.f25605x0 = new j50(d60Var.d, d60Var.e);
                                l60 l60Var2 = d60Var.H0;
                                Size size = l60Var2.f28203n0[0];
                                if (!SharedConfig.deviceIsLow() && l60.k() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(l60Var2.f28188f).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int j11 = l60.j(d60Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j12 = l60.j(d60Var.H0, 35632, str);
                                if (j11 != 0 && j12 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    d60Var.m0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j11);
                                    GLES20.glAttachShader(d60Var.m0, j12);
                                    GLES20.glLinkProgram(d60Var.m0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(d60Var.m0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(d60Var.m0);
                                        d60Var.m0 = 0;
                                        return;
                                    }
                                    d60Var.f25593p0 = GLES20.glGetAttribLocation(d60Var.m0, "aPosition");
                                    d60Var.f25594q0 = GLES20.glGetAttribLocation(d60Var.m0, "aTextureCoord");
                                    d60Var.f25598s0 = GLES20.glGetUniformLocation(d60Var.m0, "preview");
                                    d60Var.f25596r0 = GLES20.glGetUniformLocation(d60Var.m0, "resolution");
                                    d60Var.f25600u0 = GLES20.glGetUniformLocation(d60Var.m0, "alpha");
                                    d60Var.f25591n0 = GLES20.glGetUniformLocation(d60Var.m0, "uMVPMatrix");
                                    d60Var.f25592o0 = GLES20.glGetUniformLocation(d60Var.m0, "uSTMatrix");
                                    d60Var.f25599t0 = GLES20.glGetUniformLocation(d60Var.m0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    d60Var.f25597s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(d60 d60Var, int i10, y50 y50Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = d60Var.H0.S) == null || !videoEditedInfo.needConvert()) && !d60Var.H0.f28202n.c())) {
            if (!d60Var.G0) {
                d60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new wt(14, d60Var, y50Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (d60Var.W && !d60Var.D0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            d60Var.X = i10;
            d60Var.Y = y50Var;
            d60Var.W = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            d60Var.d(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaCodec mediaCodec = d60Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                d60Var.E.release();
                d60Var.E = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        MediaCodec mediaCodec2 = d60Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                d60Var.F.release();
                d60Var.F = null;
                g(false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        File file = d60Var.H0.f28191g0;
        if (file != null) {
            file.delete();
            d60Var.H0.f28191g0 = null;
        }
        MP4Builder mP4Builder = d60Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (d60Var.f25578c) {
                if (d60Var.f25574a.exists()) {
                    try {
                        d60Var.f25574a.delete();
                    } catch (Exception e12) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + d60Var.f25574a);
                        FileLog.e(e12);
                    }
                }
                if (!d60Var.f25576b.renameTo(d60Var.f25574a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(d60Var.f25576b, d60Var.f25574a);
                        d60Var.f25576b.delete();
                    } catch (IOException e13) {
                        FileLog.e(e13);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = d60Var.B0) != null) {
            dispatchQueue.cleanupQueue();
            d60Var.B0.recycle();
            d60Var.B0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(d60Var.H0.f28188f).cancelFileUpload(d60Var.f25574a.getAbsolutePath(), false);
            try {
                d60Var.f25576b.delete();
            } catch (Throwable unused) {
            }
            try {
                d60Var.f25574a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !d60Var.G0)) {
                d60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.h4(d60Var, i10, y50Var, 13));
            }
            AndroidUtilities.runOnUIThread(new a60(d60Var, 2));
        }
        EGL14.eglDestroySurface(d60Var.f25597s, d60Var.f25606y);
        d60Var.f25606y = EGL14.EGL_NO_SURFACE;
        Surface surface = d60Var.f25595r;
        if (surface != null) {
            surface.release();
            d60Var.f25595r = null;
        }
        EGLDisplay eGLDisplay = d60Var.f25597s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(d60Var.f25597s, d60Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(d60Var.f25597s);
        }
        d60Var.f25597s = EGL14.EGL_NO_DISPLAY;
        d60Var.v = EGL14.EGL_NO_CONTEXT;
        d60Var.f25604x = null;
        d60Var.T.getClass();
        Looper.myLooper().quit();
        j50 j50Var = d60Var.f25605x0;
        if (j50Var != null) {
            j50Var.b();
            d60Var.f25605x0 = null;
        }
        AndroidUtilities.runOnUIThread(new a60(d60Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !ze0.d("android.permission.BLUETOOTH_CONNECT")) {
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

    public final void c(q50 q50Var, long j10, boolean z10) {
        l60 l60Var = this.H0;
        int i10 = l60Var.f28188f;
        long j11 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(q50Var.toString(), l60Var.R, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = q50Var.toString();
                boolean z11 = l60Var.R;
                if (z10) {
                    j11 = q50Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z11, j10, j11);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = q50Var.toString();
        boolean z12 = l60Var.R;
        if (z10) {
            j11 = q50Var.length();
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
                            if (writeSampleData != 0 && !this.f25578c && this.H0.f28179a1) {
                                c(this.f25574a, writeSampleData, false);
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
                    throw new RuntimeException(i2.o1.l(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
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
                            if (writeSampleData2 != 0 && !this.f25578c && this.H0.f28179a1) {
                                c(this.f25574a, writeSampleData2, false);
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
                        throw new RuntimeException(i2.o1.l(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
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
                    int i10 = this.f25601v0 + 1;
                    this.f25601v0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f25601v0 = 0;
                    j10 = timestamp;
                }
                this.T.sendMessage(this.T.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        j50 j50Var = this.f25605x0;
        if (j50Var != null) {
            j50Var.b();
            this.f25605x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f25597s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f25597s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f25597s);
                this.f25597s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f25604x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        j81 j81Var = new j81();
        l60 l60Var = this.H0;
        l60Var.T = j81Var;
        j81Var.J = new k2.w0(this, 12);
        j81Var.V(l60Var.f28206q0);
        l60Var.T.D(Uri.fromFile(file), "other");
        l60Var.T.C();
        l60Var.T.O(true);
        l60Var.s();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = l60Var.f28181b1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(l60Var.f28207r, r6.f30074b, 0), ObjectAnimator.ofFloat(l60Var.G, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f25597s, this.f25606y);
        this.f25606y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f25595r;
        if (surface != null) {
            surface.release();
            this.f25595r = null;
        }
        EGLDisplay eGLDisplay = this.f25597s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f25597s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f25597s);
        }
        this.f25597s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f25604x = null;
    }

    public final void i(int i10, y50 y50Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, y50Var));
        AndroidUtilities.runOnUIThread(new pc(13));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.c cVar = new g.c(1);
            cVar.f10668b = new WeakReference(this);
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
