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
public final class e60 implements Runnable {
    public DispatchQueue B0;
    public int C0;
    public volatile boolean D0;
    public MediaCodec E;
    public MediaCodec F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public final f60 H0;
    public MediaCodec.BufferInfo I;
    public MediaCodec.BufferInfo J;
    public MP4Builder K;
    public long O;
    public boolean Q;
    public volatile g.d T;
    public volatile boolean V;
    public volatile boolean W;
    public volatile int X;
    public volatile a60 Y;
    public long Z;
    public s50 f22568a;
    public boolean f22569a0;
    public File f22570b;
    public long f22571b0;
    public boolean f22572c;
    public int d;
    public long f22574d0;
    public int e;
    public long f22575e0;
    public int f22576f;
    public long f22577f0;
    public boolean f22583l0;
    public int m0;
    public boolean f22584n;
    public int f22585n0;
    public int f22586o0;
    public int f22587p0;
    public int f22588q0;
    public Surface f22589r;
    public int f22590r0;
    public int f22592s0;
    public int f22593t0;
    public int f22594u0;
    public int f22595v0;
    public EGLContext f22596w;
    public EGLConfig f22598x;
    public l50 f22599x0;
    public AudioRecord f22601y0;
    public boolean h = true;
    public EGLDisplay f22591s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f22600y = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long f22573c0 = -1;
    public long f22578g0 = -1;
    public long f22579h0 = -1;
    public long f22580i0 = -1;
    public long f22581j0 = 0;
    public long f22582k0 = -1;
    public Integer f22597w0 = 0;
    public final ArrayBlockingQueue f22602z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final d60 E0 = new d60(this);

    public e60(f60 f60Var) {
        this.H0 = f60Var;
    }

    public static void a(e60 e60Var, boolean z10) {
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
            e60Var.f22602z0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                e60Var.f22602z0.add(new u50());
            }
            if (z10) {
                e60Var.f22578g0 = e60Var.f22574d0 + e60Var.f22575e0;
                e60Var.f22582k0 = e60Var.f22580i0 + e60Var.f22581j0;
                e60Var.Q = true;
                j3 = 0;
            } else {
                e60Var.f22578g0 = -1L;
                e60Var.f22582k0 = -1L;
                j3 = 0;
                e60Var.R = 0L;
            }
            e60Var.S = -1L;
            e60Var.O = j3;
            e60Var.P = -1L;
            e60Var.f22579h0 = -1L;
            e60Var.f22573c0 = -1L;
            e60Var.f22574d0 = -1L;
            e60Var.f22577f0 = -1L;
            e60Var.f22580i0 = -1L;
            e60Var.f22569a0 = false;
            e60Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i10);
            e60Var.f22601y0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + e60Var.f22601y0.getChannelCount() + " sample rate = " + e60Var.f22601y0.getSampleRate() + " bufferSize = " + i10);
            }
            e60Var.D0 = false;
            Thread thread = new Thread(e60Var.E0);
            thread.setPriority(10);
            thread.start();
            e60Var.J = new MediaCodec.BufferInfo();
            e60Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(e60Var.H0.f22873a).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            e60Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            e60Var.F.start();
            e60Var.E = MediaCodec.createEncoderByType("video/avc");
            e60Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", e60Var.d, e60Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", e60Var.f22576f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            e60Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            e60Var.f22589r = e60Var.E.createInputSurface();
            e60Var.E.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(e60Var.f22568a);
                e60Var.f22570b = e60Var.f22568a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    e60Var.f22570b = file;
                    if (file.exists()) {
                        e60Var.f22570b.delete();
                    }
                    e60Var.f22572c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(e60Var.f22570b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(e60Var.d, e60Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, e60Var.H0.M, false);
                e60Var.K = createMovie;
                f60 f60Var = e60Var.H0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                f60Var.Q0 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new ai.j(25, e60Var, z10));
            if (e60Var.f22591s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                e60Var.f22591s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (e60Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(e60Var.f22591s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i11 = 0;
                                e60Var.v = EGL14.eglCreateContext(e60Var.f22591s, eGLConfigArr[0], e60Var.f22596w, new int[]{12440, 2, 12344}, 0);
                                e60Var.f22598x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i11 = 0;
                        }
                        EGL14.eglQueryContext(e60Var.f22591s, e60Var.v, 12440, new int[1], i11);
                        if (e60Var.f22600y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(e60Var.f22591s, e60Var.f22598x, e60Var.f22589r, new int[]{12344}, i11);
                            e60Var.f22600y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(e60Var.f22591s, eglCreateWindowSurface, eglCreateWindowSurface, e60Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                l50 l50Var = e60Var.f22599x0;
                                if (l50Var != null) {
                                    l50Var.b();
                                    e60Var.f22599x0 = null;
                                }
                                e60Var.f22599x0 = new l50(e60Var.d, e60Var.e);
                                f60 f60Var2 = e60Var.H0;
                                Size size = f60Var2.f22887i0[0];
                                if (!SharedConfig.deviceIsLow() && f60.b() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(f60Var2.f22873a).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int a2 = f60.a(e60Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int a10 = f60.a(e60Var.H0, 35632, str);
                                if (a2 != 0 && a10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    e60Var.m0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, a2);
                                    GLES20.glAttachShader(e60Var.m0, a10);
                                    GLES20.glLinkProgram(e60Var.m0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(e60Var.m0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(e60Var.m0);
                                        e60Var.m0 = 0;
                                        return;
                                    }
                                    e60Var.f22587p0 = GLES20.glGetAttribLocation(e60Var.m0, "aPosition");
                                    e60Var.f22588q0 = GLES20.glGetAttribLocation(e60Var.m0, "aTextureCoord");
                                    e60Var.f22592s0 = GLES20.glGetUniformLocation(e60Var.m0, "preview");
                                    e60Var.f22590r0 = GLES20.glGetUniformLocation(e60Var.m0, "resolution");
                                    e60Var.f22594u0 = GLES20.glGetUniformLocation(e60Var.m0, "alpha");
                                    e60Var.f22585n0 = GLES20.glGetUniformLocation(e60Var.m0, "uMVPMatrix");
                                    e60Var.f22586o0 = GLES20.glGetUniformLocation(e60Var.m0, "uSTMatrix");
                                    e60Var.f22593t0 = GLES20.glGetUniformLocation(e60Var.m0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    e60Var.f22591s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(e60 e60Var, int i10, a60 a60Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = e60Var.H0.N) == null || !videoEditedInfo.needConvert()) && !e60Var.H0.f22879c.c())) {
            if (!e60Var.G0) {
                e60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new hy(10, e60Var, a60Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (e60Var.W && !e60Var.D0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            e60Var.X = i10;
            e60Var.Y = a60Var;
            e60Var.W = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            e60Var.e(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaCodec mediaCodec = e60Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                e60Var.E.release();
                e60Var.E = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        MediaCodec mediaCodec2 = e60Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                e60Var.F.release();
                e60Var.F = null;
                g(false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        File file = e60Var.H0.f22877b0;
        if (file != null) {
            file.delete();
            e60Var.H0.f22877b0 = null;
        }
        MP4Builder mP4Builder = e60Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (e60Var.f22572c) {
                if (e60Var.f22568a.exists()) {
                    try {
                        e60Var.f22568a.delete();
                    } catch (Exception e12) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + e60Var.f22568a);
                        FileLog.e(e12);
                    }
                }
                if (!e60Var.f22570b.renameTo(e60Var.f22568a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(e60Var.f22570b, e60Var.f22568a);
                        e60Var.f22570b.delete();
                    } catch (IOException e13) {
                        FileLog.e(e13);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = e60Var.B0) != null) {
            dispatchQueue.cleanupQueue();
            e60Var.B0.recycle();
            e60Var.B0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(e60Var.H0.f22873a).cancelFileUpload(e60Var.f22568a.getAbsolutePath(), false);
            try {
                e60Var.f22570b.delete();
            } catch (Throwable unused) {
            }
            try {
                e60Var.f22568a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !e60Var.G0)) {
                e60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new my(e60Var, i10, a60Var, 5));
            }
            AndroidUtilities.runOnUIThread(new b60(e60Var, 3));
        }
        EGL14.eglDestroySurface(e60Var.f22591s, e60Var.f22600y);
        e60Var.f22600y = EGL14.EGL_NO_SURFACE;
        Surface surface = e60Var.f22589r;
        if (surface != null) {
            surface.release();
            e60Var.f22589r = null;
        }
        EGLDisplay eGLDisplay = e60Var.f22591s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(e60Var.f22591s, e60Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(e60Var.f22591s);
        }
        e60Var.f22591s = EGL14.EGL_NO_DISPLAY;
        e60Var.v = EGL14.EGL_NO_CONTEXT;
        e60Var.f22598x = null;
        e60Var.T.getClass();
        Looper.myLooper().quit();
        l50 l50Var = e60Var.f22599x0;
        if (l50Var != null) {
            l50Var.b();
            e60Var.f22599x0 = null;
        }
        AndroidUtilities.runOnUIThread(new b60(e60Var, 4));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !me0.f("android.permission.BLUETOOTH_CONNECT")) {
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

    public final void c(s50 s50Var, long j3, boolean z10) {
        f60 f60Var = this.H0;
        int i10 = f60Var.f22873a;
        long j10 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(s50Var.toString(), f60Var.M, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = s50Var.toString();
                boolean z11 = f60Var.M;
                if (z10) {
                    j10 = s50Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z11, j3, j10);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = s50Var.toString();
        boolean z12 = f60Var.M;
        if (z10) {
            j10 = s50Var.length();
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
                            if (writeSampleData != 0 && !this.f22572c && this.H0.Q0) {
                                c(this.f22568a, writeSampleData, false);
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
                    throw new RuntimeException(hc.b.k(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
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
                            if (writeSampleData2 != 0 && !this.f22572c && this.H0.Q0) {
                                c(this.f22568a, writeSampleData2, false);
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
                        throw new RuntimeException(hc.b.k(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
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
                    int i10 = this.f22595v0 + 1;
                    this.f22595v0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f22595v0 = 0;
                    j3 = timestamp;
                }
                this.T.sendMessage(this.T.obtainMessage(2, (int) (j3 >> 32), (int) j3, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        l50 l50Var = this.f22599x0;
        if (l50Var != null) {
            l50Var.b();
            this.f22599x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f22591s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f22591s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f22591s);
                this.f22591s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f22598x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        t71 t71Var = new t71();
        f60 f60Var = this.H0;
        f60Var.O = t71Var;
        t71Var.J = new l2.h(this, 10);
        t71Var.V(f60Var.f22890l0);
        f60Var.O.D(Uri.fromFile(file), "other");
        f60Var.O.C();
        f60Var.O.O(true);
        f60Var.n();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = f60Var.R0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(f60Var.d, r6.f26600b, 0), ObjectAnimator.ofFloat(f60Var.f22903w, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f22591s, this.f22600y);
        this.f22600y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f22589r;
        if (surface != null) {
            surface.release();
            this.f22589r = null;
        }
        EGLDisplay eGLDisplay = this.f22591s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f22591s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f22591s);
        }
        this.f22591s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f22598x = null;
    }

    public final void i(int i10, a60 a60Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, a60Var));
        AndroidUtilities.runOnUIThread(new b60(this, 5));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.d dVar = new g.d(1);
            dVar.f8367b = new WeakReference(this);
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
