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
public final class u50 implements Runnable {
    public DispatchQueue B0;
    public int C0;
    public volatile boolean D0;
    public MediaCodec E;
    public MediaCodec F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public final b60 H0;
    public MediaCodec.BufferInfo I;
    public MediaCodec.BufferInfo J;
    public MP4Builder K;
    public long O;
    public boolean Q;
    public volatile g.d T;
    public volatile boolean V;
    public volatile boolean W;
    public volatile int X;
    public volatile p50 Y;
    public long Z;
    public i50 f28578a;
    public boolean f28579a0;
    public File f28580b;
    public long f28581b0;
    public boolean f28582c;
    public int d;
    public long f28584d0;
    public int e;
    public long f28585e0;
    public int f28586f;
    public long f28587f0;
    public boolean f28593l0;
    public int m0;
    public boolean f28594n;
    public int f28595n0;
    public int f28596o0;
    public int f28597p0;
    public int f28598q0;
    public Surface f28599r;
    public int f28600r0;
    public int f28602s0;
    public int f28603t0;
    public int f28604u0;
    public int f28605v0;
    public EGLContext f28606w;
    public EGLConfig f28608x;
    public b50 f28609x0;
    public AudioRecord f28611y0;
    public boolean h = true;
    public EGLDisplay f28601s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f28610y = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long f28583c0 = -1;
    public long f28588g0 = -1;
    public long f28589h0 = -1;
    public long f28590i0 = -1;
    public long f28591j0 = 0;
    public long f28592k0 = -1;
    public Integer f28607w0 = 0;
    public final ArrayBlockingQueue f28612z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final t50 E0 = new t50(this);

    public u50(b60 b60Var) {
        this.H0 = b60Var;
    }

    public static void a(u50 u50Var, boolean z10) {
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
            u50Var.f28612z0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                u50Var.f28612z0.add(new j50());
            }
            if (z10) {
                u50Var.f28588g0 = u50Var.f28584d0 + u50Var.f28585e0;
                u50Var.f28592k0 = u50Var.f28590i0 + u50Var.f28591j0;
                u50Var.Q = true;
                j3 = 0;
            } else {
                u50Var.f28588g0 = -1L;
                u50Var.f28592k0 = -1L;
                j3 = 0;
                u50Var.R = 0L;
            }
            u50Var.S = -1L;
            u50Var.O = j3;
            u50Var.P = -1L;
            u50Var.f28589h0 = -1L;
            u50Var.f28583c0 = -1L;
            u50Var.f28584d0 = -1L;
            u50Var.f28587f0 = -1L;
            u50Var.f28590i0 = -1L;
            u50Var.f28579a0 = false;
            u50Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i10);
            u50Var.f28611y0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + u50Var.f28611y0.getChannelCount() + " sample rate = " + u50Var.f28611y0.getSampleRate() + " bufferSize = " + i10);
            }
            u50Var.D0 = false;
            Thread thread = new Thread(u50Var.E0);
            thread.setPriority(10);
            thread.start();
            u50Var.J = new MediaCodec.BufferInfo();
            u50Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(u50Var.H0.d).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            u50Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            u50Var.F.start();
            u50Var.E = MediaCodec.createEncoderByType("video/avc");
            u50Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", u50Var.d, u50Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", u50Var.f28586f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            u50Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            u50Var.f28599r = u50Var.E.createInputSurface();
            u50Var.E.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(u50Var.f28578a);
                u50Var.f28580b = u50Var.f28578a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    u50Var.f28580b = file;
                    if (file.exists()) {
                        u50Var.f28580b.delete();
                    }
                    u50Var.f28582c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(u50Var.f28580b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(u50Var.d, u50Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, u50Var.H0.P, false);
                u50Var.K = createMovie;
                b60 b60Var = u50Var.H0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                b60Var.T0 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new bi.f(25, u50Var, z10));
            if (u50Var.f28601s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                u50Var.f28601s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (u50Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(u50Var.f28601s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i11 = 0;
                                u50Var.v = EGL14.eglCreateContext(u50Var.f28601s, eGLConfigArr[0], u50Var.f28606w, new int[]{12440, 2, 12344}, 0);
                                u50Var.f28608x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i11 = 0;
                        }
                        EGL14.eglQueryContext(u50Var.f28601s, u50Var.v, 12440, new int[1], i11);
                        if (u50Var.f28610y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(u50Var.f28601s, u50Var.f28608x, u50Var.f28599r, new int[]{12344}, i11);
                            u50Var.f28610y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(u50Var.f28601s, eglCreateWindowSurface, eglCreateWindowSurface, u50Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                b50 b50Var = u50Var.f28609x0;
                                if (b50Var != null) {
                                    b50Var.b();
                                    u50Var.f28609x0 = null;
                                }
                                u50Var.f28609x0 = new b50(u50Var.d, u50Var.e);
                                b60 b60Var2 = u50Var.H0;
                                Size size = b60Var2.f22845l0[0];
                                if (!SharedConfig.deviceIsLow() && b60.l() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(b60Var2.d).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int k10 = b60.k(u50Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int k11 = b60.k(u50Var.H0, 35632, str);
                                if (k10 != 0 && k11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    u50Var.m0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, k10);
                                    GLES20.glAttachShader(u50Var.m0, k11);
                                    GLES20.glLinkProgram(u50Var.m0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(u50Var.m0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(u50Var.m0);
                                        u50Var.m0 = 0;
                                        return;
                                    }
                                    u50Var.f28597p0 = GLES20.glGetAttribLocation(u50Var.m0, "aPosition");
                                    u50Var.f28598q0 = GLES20.glGetAttribLocation(u50Var.m0, "aTextureCoord");
                                    u50Var.f28602s0 = GLES20.glGetUniformLocation(u50Var.m0, "preview");
                                    u50Var.f28600r0 = GLES20.glGetUniformLocation(u50Var.m0, "resolution");
                                    u50Var.f28604u0 = GLES20.glGetUniformLocation(u50Var.m0, "alpha");
                                    u50Var.f28595n0 = GLES20.glGetUniformLocation(u50Var.m0, "uMVPMatrix");
                                    u50Var.f28596o0 = GLES20.glGetUniformLocation(u50Var.m0, "uSTMatrix");
                                    u50Var.f28603t0 = GLES20.glGetUniformLocation(u50Var.m0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    u50Var.f28601s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(u50 u50Var, int i10, p50 p50Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = u50Var.H0.Q) == null || !videoEditedInfo.needConvert()) && !u50Var.H0.f22838f.c())) {
            if (!u50Var.G0) {
                u50Var.G0 = true;
                AndroidUtilities.runOnUIThread(new uw(11, u50Var, p50Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (u50Var.W && !u50Var.D0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            u50Var.X = i10;
            u50Var.Y = p50Var;
            u50Var.W = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            u50Var.e(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaCodec mediaCodec = u50Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                u50Var.E.release();
                u50Var.E = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        MediaCodec mediaCodec2 = u50Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                u50Var.F.release();
                u50Var.F = null;
                g(false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        File file = u50Var.H0.f22836e0;
        if (file != null) {
            file.delete();
            u50Var.H0.f22836e0 = null;
        }
        MP4Builder mP4Builder = u50Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (u50Var.f28582c) {
                if (u50Var.f28578a.exists()) {
                    try {
                        u50Var.f28578a.delete();
                    } catch (Exception e12) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + u50Var.f28578a);
                        FileLog.e(e12);
                    }
                }
                if (!u50Var.f28580b.renameTo(u50Var.f28578a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(u50Var.f28580b, u50Var.f28578a);
                        u50Var.f28580b.delete();
                    } catch (IOException e13) {
                        FileLog.e(e13);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = u50Var.B0) != null) {
            dispatchQueue.cleanupQueue();
            u50Var.B0.recycle();
            u50Var.B0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(u50Var.H0.d).cancelFileUpload(u50Var.f28578a.getAbsolutePath(), false);
            try {
                u50Var.f28580b.delete();
            } catch (Throwable unused) {
            }
            try {
                u50Var.f28578a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !u50Var.G0)) {
                u50Var.G0 = true;
                AndroidUtilities.runOnUIThread(new wm(u50Var, i10, p50Var, 7));
            }
            AndroidUtilities.runOnUIThread(new q50(u50Var, 3));
        }
        EGL14.eglDestroySurface(u50Var.f28601s, u50Var.f28610y);
        u50Var.f28610y = EGL14.EGL_NO_SURFACE;
        Surface surface = u50Var.f28599r;
        if (surface != null) {
            surface.release();
            u50Var.f28599r = null;
        }
        EGLDisplay eGLDisplay = u50Var.f28601s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(u50Var.f28601s, u50Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(u50Var.f28601s);
        }
        u50Var.f28601s = EGL14.EGL_NO_DISPLAY;
        u50Var.v = EGL14.EGL_NO_CONTEXT;
        u50Var.f28608x = null;
        u50Var.T.getClass();
        Looper.myLooper().quit();
        b50 b50Var = u50Var.f28609x0;
        if (b50Var != null) {
            b50Var.b();
            u50Var.f28609x0 = null;
        }
        AndroidUtilities.runOnUIThread(new q50(u50Var, 4));
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

    public final void c(i50 i50Var, long j3, boolean z10) {
        b60 b60Var = this.H0;
        int i10 = b60Var.d;
        long j10 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(i50Var.toString(), b60Var.P, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = i50Var.toString();
                boolean z11 = b60Var.P;
                if (z10) {
                    j10 = i50Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z11, j3, j10);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = i50Var.toString();
        boolean z12 = b60Var.P;
        if (z10) {
            j10 = i50Var.length();
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
                            if (writeSampleData != 0 && !this.f28582c && this.H0.T0) {
                                c(this.f28578a, writeSampleData, false);
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
                    throw new RuntimeException(hg.k0.i(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
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
                            if (writeSampleData2 != 0 && !this.f28582c && this.H0.T0) {
                                c(this.f28578a, writeSampleData2, false);
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
                        throw new RuntimeException(hg.k0.i(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
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
                    int i10 = this.f28605v0 + 1;
                    this.f28605v0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f28605v0 = 0;
                    j3 = timestamp;
                }
                this.T.sendMessage(this.T.obtainMessage(2, (int) (j3 >> 32), (int) j3, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        b50 b50Var = this.f28609x0;
        if (b50Var != null) {
            b50Var.b();
            this.f28609x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f28601s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f28601s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f28601s);
                this.f28601s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f28608x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        u71 u71Var = new u71();
        b60 b60Var = this.H0;
        b60Var.R = u71Var;
        u71Var.J = new k2.u(this, 13);
        u71Var.V(b60Var.f22848o0);
        b60Var.R.D(Uri.fromFile(file), "other");
        b60Var.R.C();
        b60Var.R.O(true);
        b60Var.s();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = b60Var.U0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(b60Var.h, s6.f28064b, 0), ObjectAnimator.ofFloat(b60Var.E, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f28601s, this.f28610y);
        this.f28610y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f28599r;
        if (surface != null) {
            surface.release();
            this.f28599r = null;
        }
        EGLDisplay eGLDisplay = this.f28601s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f28601s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f28601s);
        }
        this.f28601s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f28608x = null;
    }

    public final void i(int i10, p50 p50Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, p50Var));
        AndroidUtilities.runOnUIThread(new q50(this, 5));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.d dVar = new g.d(1);
            dVar.f9238b = new WeakReference(this);
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
