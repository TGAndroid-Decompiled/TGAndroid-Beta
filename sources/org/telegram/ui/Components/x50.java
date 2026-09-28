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
public final class x50 implements Runnable {
    public DispatchQueue B0;
    public int C0;
    public volatile boolean D0;
    public MediaCodec E;
    public MediaCodec F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public final e60 H0;
    public MediaCodec.BufferInfo I;
    public MediaCodec.BufferInfo J;
    public MP4Builder K;
    public long O;
    public boolean Q;
    public volatile g.d T;
    public volatile boolean V;
    public volatile boolean W;
    public volatile int X;
    public volatile s50 Y;
    public long Z;
    public l50 f30251a;
    public boolean f30252a0;
    public File f30253b;
    public long f30254b0;
    public boolean f30255c;
    public int d;
    public long f30257d0;
    public int e;
    public long f30258e0;
    public int f30259f;
    public long f30260f0;
    public boolean f30266l0;
    public int m0;
    public boolean f30267n;
    public int f30268n0;
    public int f30269o0;
    public int f30270p0;
    public int f30271q0;
    public Surface f30272r;
    public int f30273r0;
    public int f30275s0;
    public int f30276t0;
    public int f30277u0;
    public int f30278v0;
    public EGLContext f30279w;
    public EGLConfig f30281x;
    public e50 f30282x0;
    public AudioRecord f30284y0;
    public boolean h = true;
    public EGLDisplay f30274s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f30283y = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long f30256c0 = -1;
    public long f30261g0 = -1;
    public long f30262h0 = -1;
    public long f30263i0 = -1;
    public long f30264j0 = 0;
    public long f30265k0 = -1;
    public Integer f30280w0 = 0;
    public final ArrayBlockingQueue f30285z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final w50 E0 = new w50(this);

    public x50(e60 e60Var) {
        this.H0 = e60Var;
    }

    public static void a(x50 x50Var, boolean z10) {
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
            x50Var.f30285z0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                x50Var.f30285z0.add(new m50());
            }
            if (z10) {
                x50Var.f30261g0 = x50Var.f30257d0 + x50Var.f30258e0;
                x50Var.f30265k0 = x50Var.f30263i0 + x50Var.f30264j0;
                x50Var.Q = true;
                j3 = 0;
            } else {
                x50Var.f30261g0 = -1L;
                x50Var.f30265k0 = -1L;
                j3 = 0;
                x50Var.R = 0L;
            }
            x50Var.S = -1L;
            x50Var.O = j3;
            x50Var.P = -1L;
            x50Var.f30262h0 = -1L;
            x50Var.f30256c0 = -1L;
            x50Var.f30257d0 = -1L;
            x50Var.f30260f0 = -1L;
            x50Var.f30263i0 = -1L;
            x50Var.f30252a0 = false;
            x50Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i10);
            x50Var.f30284y0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + x50Var.f30284y0.getChannelCount() + " sample rate = " + x50Var.f30284y0.getSampleRate() + " bufferSize = " + i10);
            }
            x50Var.D0 = false;
            Thread thread = new Thread(x50Var.E0);
            thread.setPriority(10);
            thread.start();
            x50Var.J = new MediaCodec.BufferInfo();
            x50Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(x50Var.H0.f23892f).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            x50Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            x50Var.F.start();
            x50Var.E = MediaCodec.createEncoderByType("video/avc");
            x50Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", x50Var.d, x50Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", x50Var.f30259f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            x50Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            x50Var.f30272r = x50Var.E.createInputSurface();
            x50Var.E.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(x50Var.f30251a);
                x50Var.f30253b = x50Var.f30251a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    x50Var.f30253b = file;
                    if (file.exists()) {
                        x50Var.f30253b.delete();
                    }
                    x50Var.f30255c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(x50Var.f30253b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(x50Var.d, x50Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, x50Var.H0.R, false);
                x50Var.K = createMovie;
                e60 e60Var = x50Var.H0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                e60Var.V0 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new bi.f(26, x50Var, z10));
            if (x50Var.f30274s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                x50Var.f30274s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (x50Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(x50Var.f30274s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i11 = 0;
                                x50Var.v = EGL14.eglCreateContext(x50Var.f30274s, eGLConfigArr[0], x50Var.f30279w, new int[]{12440, 2, 12344}, 0);
                                x50Var.f30281x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i11 = 0;
                        }
                        EGL14.eglQueryContext(x50Var.f30274s, x50Var.v, 12440, new int[1], i11);
                        if (x50Var.f30283y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(x50Var.f30274s, x50Var.f30281x, x50Var.f30272r, new int[]{12344}, i11);
                            x50Var.f30283y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(x50Var.f30274s, eglCreateWindowSurface, eglCreateWindowSurface, x50Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                e50 e50Var = x50Var.f30282x0;
                                if (e50Var != null) {
                                    e50Var.b();
                                    x50Var.f30282x0 = null;
                                }
                                x50Var.f30282x0 = new e50(x50Var.d, x50Var.e);
                                e60 e60Var2 = x50Var.H0;
                                Size size = e60Var2.f23903n0[0];
                                if (!SharedConfig.deviceIsLow() && e60.k() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(e60Var2.f23892f).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int j10 = e60.j(x50Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j11 = e60.j(x50Var.H0, 35632, str);
                                if (j10 != 0 && j11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    x50Var.m0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j10);
                                    GLES20.glAttachShader(x50Var.m0, j11);
                                    GLES20.glLinkProgram(x50Var.m0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(x50Var.m0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(x50Var.m0);
                                        x50Var.m0 = 0;
                                        return;
                                    }
                                    x50Var.f30270p0 = GLES20.glGetAttribLocation(x50Var.m0, "aPosition");
                                    x50Var.f30271q0 = GLES20.glGetAttribLocation(x50Var.m0, "aTextureCoord");
                                    x50Var.f30275s0 = GLES20.glGetUniformLocation(x50Var.m0, "preview");
                                    x50Var.f30273r0 = GLES20.glGetUniformLocation(x50Var.m0, "resolution");
                                    x50Var.f30277u0 = GLES20.glGetUniformLocation(x50Var.m0, "alpha");
                                    x50Var.f30268n0 = GLES20.glGetUniformLocation(x50Var.m0, "uMVPMatrix");
                                    x50Var.f30269o0 = GLES20.glGetUniformLocation(x50Var.m0, "uSTMatrix");
                                    x50Var.f30276t0 = GLES20.glGetUniformLocation(x50Var.m0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    x50Var.f30274s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(x50 x50Var, int i10, s50 s50Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = x50Var.H0.S) == null || !videoEditedInfo.needConvert()) && !x50Var.H0.f23902n.c())) {
            if (!x50Var.G0) {
                x50Var.G0 = true;
                AndroidUtilities.runOnUIThread(new ww(12, x50Var, s50Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (x50Var.W && !x50Var.D0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            x50Var.X = i10;
            x50Var.Y = s50Var;
            x50Var.W = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            x50Var.e(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaCodec mediaCodec = x50Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                x50Var.E.release();
                x50Var.E = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        MediaCodec mediaCodec2 = x50Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                x50Var.F.release();
                x50Var.F = null;
                g(false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        File file = x50Var.H0.f23895g0;
        if (file != null) {
            file.delete();
            x50Var.H0.f23895g0 = null;
        }
        MP4Builder mP4Builder = x50Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (x50Var.f30255c) {
                if (x50Var.f30251a.exists()) {
                    try {
                        x50Var.f30251a.delete();
                    } catch (Exception e12) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + x50Var.f30251a);
                        FileLog.e(e12);
                    }
                }
                if (!x50Var.f30253b.renameTo(x50Var.f30251a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(x50Var.f30253b, x50Var.f30251a);
                        x50Var.f30253b.delete();
                    } catch (IOException e13) {
                        FileLog.e(e13);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = x50Var.B0) != null) {
            dispatchQueue.cleanupQueue();
            x50Var.B0.recycle();
            x50Var.B0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(x50Var.H0.f23892f).cancelFileUpload(x50Var.f30251a.getAbsolutePath(), false);
            try {
                x50Var.f30253b.delete();
            } catch (Throwable unused) {
            }
            try {
                x50Var.f30251a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !x50Var.G0)) {
                x50Var.G0 = true;
                AndroidUtilities.runOnUIThread(new ym(x50Var, i10, s50Var, 7));
            }
            AndroidUtilities.runOnUIThread(new t50(x50Var, 2));
        }
        EGL14.eglDestroySurface(x50Var.f30274s, x50Var.f30283y);
        x50Var.f30283y = EGL14.EGL_NO_SURFACE;
        Surface surface = x50Var.f30272r;
        if (surface != null) {
            surface.release();
            x50Var.f30272r = null;
        }
        EGLDisplay eGLDisplay = x50Var.f30274s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(x50Var.f30274s, x50Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(x50Var.f30274s);
        }
        x50Var.f30274s = EGL14.EGL_NO_DISPLAY;
        x50Var.v = EGL14.EGL_NO_CONTEXT;
        x50Var.f30281x = null;
        x50Var.T.getClass();
        Looper.myLooper().quit();
        e50 e50Var = x50Var.f30282x0;
        if (e50Var != null) {
            e50Var.b();
            x50Var.f30282x0 = null;
        }
        AndroidUtilities.runOnUIThread(new t50(x50Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !pe0.f("android.permission.BLUETOOTH_CONNECT")) {
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

    public final void c(l50 l50Var, long j3, boolean z10) {
        e60 e60Var = this.H0;
        int i10 = e60Var.f23892f;
        long j10 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(l50Var.toString(), e60Var.R, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = l50Var.toString();
                boolean z11 = e60Var.R;
                if (z10) {
                    j10 = l50Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z11, j3, j10);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = l50Var.toString();
        boolean z12 = e60Var.R;
        if (z10) {
            j10 = l50Var.length();
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
                            if (writeSampleData != 0 && !this.f30255c && this.H0.V0) {
                                c(this.f30251a, writeSampleData, false);
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
                    throw new RuntimeException(hg.c.i(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
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
                            if (writeSampleData2 != 0 && !this.f30255c && this.H0.V0) {
                                c(this.f30251a, writeSampleData2, false);
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
                        throw new RuntimeException(hg.c.i(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
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
                    int i10 = this.f30278v0 + 1;
                    this.f30278v0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f30278v0 = 0;
                    j3 = timestamp;
                }
                this.T.sendMessage(this.T.obtainMessage(2, (int) (j3 >> 32), (int) j3, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        e50 e50Var = this.f30282x0;
        if (e50Var != null) {
            e50Var.b();
            this.f30282x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f30274s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f30274s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f30274s);
                this.f30274s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f30281x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        u71 u71Var = new u71();
        e60 e60Var = this.H0;
        e60Var.T = u71Var;
        u71Var.J = new k2.u(this, 13);
        u71Var.V(e60Var.f23906q0);
        e60Var.T.D(Uri.fromFile(file), "other");
        e60Var.T.C();
        e60Var.T.O(true);
        e60Var.r();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = e60Var.W0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(e60Var.f23907r, s6.f28137b, 0), ObjectAnimator.ofFloat(e60Var.G, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f30274s, this.f30283y);
        this.f30283y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f30272r;
        if (surface != null) {
            surface.release();
            this.f30272r = null;
        }
        EGLDisplay eGLDisplay = this.f30274s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f30274s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f30274s);
        }
        this.f30274s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f30281x = null;
    }

    public final void i(int i10, s50 s50Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, s50Var));
        AndroidUtilities.runOnUIThread(new th(8));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.d dVar = new g.d(1);
            dVar.f9221b = new WeakReference(this);
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
