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
public final class h60 implements Runnable {
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
    public volatile c60 Y;
    public long Z;
    public u50 f28870a;
    public boolean f28871a0;
    public File f28872b;
    public long f28873b0;
    public boolean f28874c;
    public int d;
    public long f28876d0;
    public int e;
    public long f28877e0;
    public int f28878f;
    public long f28879f0;
    public boolean f28885l0;
    public int m0;
    public boolean f28886n;
    public int f28887n0;
    public int f28888o0;
    public int f28889p0;
    public int f28890q0;
    public Surface f28891r;
    public int f28892r0;
    public int f28894s0;
    public int f28895t0;
    public int f28896u0;
    public int f28897v0;
    public EGLContext f28898w;
    public EGLConfig f28900x;
    public n50 f28901x0;
    public AudioRecord f28903y0;
    public boolean h = true;
    public EGLDisplay f28893s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f28902y = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long f28875c0 = -1;
    public long f28880g0 = -1;
    public long f28881h0 = -1;
    public long f28882i0 = -1;
    public long f28883j0 = 0;
    public long f28884k0 = -1;
    public Integer f28899w0 = 0;
    public final ArrayBlockingQueue f28904z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final g60 E0 = new g60(this, 0);

    public h60(p60 p60Var) {
        this.H0 = p60Var;
    }

    public static void a(h60 h60Var, boolean z10) {
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
            h60Var.f28904z0.clear();
            for (int i13 = 0; i13 < 3; i13++) {
                h60Var.f28904z0.add(new w50());
            }
            if (z10) {
                h60Var.f28880g0 = h60Var.f28876d0 + h60Var.f28877e0;
                h60Var.f28884k0 = h60Var.f28882i0 + h60Var.f28883j0;
                h60Var.Q = true;
                j10 = 0;
            } else {
                h60Var.f28880g0 = -1L;
                h60Var.f28884k0 = -1L;
                j10 = 0;
                h60Var.R = 0L;
            }
            h60Var.S = -1L;
            h60Var.O = j10;
            h60Var.P = -1L;
            h60Var.f28881h0 = -1L;
            h60Var.f28875c0 = -1L;
            h60Var.f28876d0 = -1L;
            h60Var.f28879f0 = -1L;
            h60Var.f28882i0 = -1L;
            h60Var.f28871a0 = false;
            h60Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i12);
            h60Var.f28903y0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + h60Var.f28903y0.getChannelCount() + " sample rate = " + h60Var.f28903y0.getSampleRate() + " bufferSize = " + i12);
            }
            h60Var.D0 = false;
            Thread thread = new Thread(h60Var.E0);
            thread.setPriority(10);
            thread.start();
            h60Var.J = new MediaCodec.BufferInfo();
            h60Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(h60Var.H0.e).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            h60Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            h60Var.F.start();
            h60Var.E = MediaCodec.createEncoderByType("video/avc");
            h60Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", h60Var.d, h60Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", h60Var.f28878f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            h60Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            h60Var.f28891r = h60Var.E.createInputSurface();
            h60Var.E.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(h60Var.f28870a);
                h60Var.f28872b = h60Var.f28870a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    h60Var.f28872b = file;
                    if (file.exists()) {
                        h60Var.f28872b.delete();
                    }
                    h60Var.f28874c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(h60Var.f28872b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(h60Var.d, h60Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, h60Var.H0.Q, false);
                h60Var.K = createMovie;
                p60 p60Var = h60Var.H0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                p60Var.Z0 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new d60(0, h60Var, z10));
            if (h60Var.f28893s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                h60Var.f28893s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (h60Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(h60Var.f28893s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i10 = 0;
                                h60Var.v = EGL14.eglCreateContext(h60Var.f28893s, eGLConfigArr[0], h60Var.f28898w, new int[]{12440, 2, 12344}, 0);
                                h60Var.f28900x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i10 = 0;
                        }
                        EGL14.eglQueryContext(h60Var.f28893s, h60Var.v, 12440, new int[1], i10);
                        if (h60Var.f28902y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(h60Var.f28893s, h60Var.f28900x, h60Var.f28891r, new int[]{12344}, i10);
                            h60Var.f28902y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(h60Var.f28893s, eglCreateWindowSurface, eglCreateWindowSurface, h60Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                n50 n50Var = h60Var.f28901x0;
                                if (n50Var != null) {
                                    n50Var.b();
                                    h60Var.f28901x0 = null;
                                }
                                h60Var.f28901x0 = new n50(h60Var.d, h60Var.e);
                                p60 p60Var2 = h60Var.H0;
                                Size size = p60Var2.m0[0];
                                if (!SharedConfig.deviceIsLow() && p60.l() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(p60Var2.e).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int k10 = p60.k(h60Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int k11 = p60.k(h60Var.H0, 35632, str);
                                if (k10 != 0 && k11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    h60Var.m0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, k10);
                                    GLES20.glAttachShader(h60Var.m0, k11);
                                    GLES20.glLinkProgram(h60Var.m0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(h60Var.m0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(h60Var.m0);
                                        h60Var.m0 = 0;
                                        return;
                                    }
                                    h60Var.f28889p0 = GLES20.glGetAttribLocation(h60Var.m0, "aPosition");
                                    h60Var.f28890q0 = GLES20.glGetAttribLocation(h60Var.m0, "aTextureCoord");
                                    h60Var.f28894s0 = GLES20.glGetUniformLocation(h60Var.m0, "preview");
                                    h60Var.f28892r0 = GLES20.glGetUniformLocation(h60Var.m0, "resolution");
                                    h60Var.f28896u0 = GLES20.glGetUniformLocation(h60Var.m0, "alpha");
                                    h60Var.f28887n0 = GLES20.glGetUniformLocation(h60Var.m0, "uMVPMatrix");
                                    h60Var.f28888o0 = GLES20.glGetUniformLocation(h60Var.m0, "uSTMatrix");
                                    h60Var.f28895t0 = GLES20.glGetUniformLocation(h60Var.m0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    h60Var.f28893s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(h60 h60Var, int i10, c60 c60Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = h60Var.H0.R) == null || !videoEditedInfo.needConvert()) && !h60Var.H0.h.c())) {
            if (!h60Var.G0) {
                h60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new so(24, h60Var, c60Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (h60Var.W && !h60Var.D0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            h60Var.X = i10;
            h60Var.Y = c60Var;
            h60Var.W = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            h60Var.d(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaCodec mediaCodec = h60Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                h60Var.E.release();
                h60Var.E = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        MediaCodec mediaCodec2 = h60Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                h60Var.F.release();
                h60Var.F = null;
                g(false);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        File file = h60Var.H0.f31478f0;
        if (file != null) {
            file.delete();
            h60Var.H0.f31478f0 = null;
        }
        MP4Builder mP4Builder = h60Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (h60Var.f28874c) {
                if (h60Var.f28870a.exists()) {
                    try {
                        h60Var.f28870a.delete();
                    } catch (Exception e13) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + h60Var.f28870a);
                        FileLog.e(e13);
                    }
                }
                if (!h60Var.f28872b.renameTo(h60Var.f28870a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(h60Var.f28872b, h60Var.f28870a);
                        h60Var.f28872b.delete();
                    } catch (IOException e14) {
                        FileLog.e(e14);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = h60Var.B0) != null) {
            dispatchQueue.cleanupQueue();
            h60Var.B0.recycle();
            h60Var.B0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(h60Var.H0.e).cancelFileUpload(h60Var.f28870a.getAbsolutePath(), false);
            try {
                h60Var.f28872b.delete();
            } catch (Throwable unused) {
            }
            try {
                h60Var.f28870a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !h60Var.G0)) {
                h60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(h60Var, i10, c60Var, 13));
            }
            AndroidUtilities.runOnUIThread(new e60(h60Var, 2));
        }
        EGL14.eglDestroySurface(h60Var.f28893s, h60Var.f28902y);
        h60Var.f28902y = EGL14.EGL_NO_SURFACE;
        Surface surface = h60Var.f28891r;
        if (surface != null) {
            surface.release();
            h60Var.f28891r = null;
        }
        EGLDisplay eGLDisplay = h60Var.f28893s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(h60Var.f28893s, h60Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(h60Var.f28893s);
        }
        h60Var.f28893s = EGL14.EGL_NO_DISPLAY;
        h60Var.v = EGL14.EGL_NO_CONTEXT;
        h60Var.f28900x = null;
        h60Var.T.getClass();
        Looper.myLooper().quit();
        n50 n50Var = h60Var.f28901x0;
        if (n50Var != null) {
            n50Var.b();
            h60Var.f28901x0 = null;
        }
        AndroidUtilities.runOnUIThread(new e60(h60Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !ye0.d("android.permission.BLUETOOTH_CONNECT")) {
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

    public final void c(u50 u50Var, long j10, boolean z10) {
        p60 p60Var = this.H0;
        int i10 = p60Var.e;
        long j11 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(u50Var.toString(), p60Var.Q, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = u50Var.toString();
                boolean z11 = p60Var.Q;
                if (z10) {
                    j11 = u50Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z11, j10, j11);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = u50Var.toString();
        boolean z12 = p60Var.Q;
        if (z10) {
            j11 = u50Var.length();
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
                            if (writeSampleData != 0 && !this.f28874c && this.H0.Z0) {
                                c(this.f28870a, writeSampleData, false);
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
                    throw new RuntimeException(ic.a.j(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
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
                            if (writeSampleData2 != 0 && !this.f28874c && this.H0.Z0) {
                                c(this.f28870a, writeSampleData2, false);
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
                        throw new RuntimeException(ic.a.j(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
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
                    int i10 = this.f28897v0 + 1;
                    this.f28897v0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f28897v0 = 0;
                    j10 = timestamp;
                }
                this.T.sendMessage(this.T.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        n50 n50Var = this.f28901x0;
        if (n50Var != null) {
            n50Var.b();
            this.f28901x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f28893s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f28893s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f28893s);
                this.f28893s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f28900x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        t81 t81Var = new t81();
        p60 p60Var = this.H0;
        p60Var.S = t81Var;
        t81Var.J = new jg.s0(this, 19);
        t81Var.V(p60Var.f31494p0);
        p60Var.S.D(Uri.fromFile(file), "other");
        p60Var.S.C();
        p60Var.S.O(true);
        p60Var.t();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = p60Var.f31468a1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(p60Var.f31491n, v6.f33570b, 0), ObjectAnimator.ofFloat(p60Var.F, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f28893s, this.f28902y);
        this.f28902y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f28891r;
        if (surface != null) {
            surface.release();
            this.f28891r = null;
        }
        EGLDisplay eGLDisplay = this.f28893s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f28893s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f28893s);
        }
        this.f28893s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f28900x = null;
    }

    public final void i(int i10, c60 c60Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, c60Var));
        AndroidUtilities.runOnUIThread(new k5(15));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.c cVar = new g.c(1);
            cVar.f12115b = new WeakReference(this);
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
