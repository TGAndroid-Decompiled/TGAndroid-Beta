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
public final class p60 implements Runnable {
    public DispatchQueue B0;
    public int C0;
    public volatile boolean D0;
    public MediaCodec E;
    public MediaCodec F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public final w60 H0;
    public MediaCodec.BufferInfo I;
    public MediaCodec.BufferInfo J;
    public MP4Builder K;
    public long O;
    public boolean Q;
    public volatile g.c T;
    public volatile boolean V;
    public volatile boolean W;
    public volatile int X;
    public volatile l60 Y;
    public long Z;
    public d60 f29394a;
    public boolean f29395a0;
    public File f29396b;
    public long f29397b0;
    public boolean f29398c;
    public int d;
    public long f29400d0;
    public int f29401e;
    public long f29402e0;
    public int f29403f;
    public long f29404f0;
    public boolean f29410l0;
    public int m0;
    public boolean f29411n;
    public int f29412n0;
    public int f29413o0;
    public int f29414p0;
    public int f29415q0;
    public Surface f29416r;
    public int f29417r0;
    public int f29419s0;
    public int f29420t0;
    public int f29421u0;
    public int f29422v0;
    public EGLContext f29423w;
    public EGLConfig f29425x;
    public w50 f29426x0;
    public AudioRecord f29428y0;
    public boolean h = true;
    public EGLDisplay f29418s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f29427y = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long f29399c0 = -1;
    public long f29405g0 = -1;
    public long f29406h0 = -1;
    public long f29407i0 = -1;
    public long f29408j0 = 0;
    public long f29409k0 = -1;
    public Integer f29424w0 = 0;
    public final ArrayBlockingQueue f29429z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final o60 E0 = new o60(this, 0);

    public p60(w60 w60Var) {
        this.H0 = w60Var;
    }

    public static void a(p60 p60Var, boolean z10) {
        long j3;
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
            p60Var.f29429z0.clear();
            for (int i13 = 0; i13 < 3; i13++) {
                p60Var.f29429z0.add(new f60());
            }
            if (z10) {
                p60Var.f29405g0 = p60Var.f29400d0 + p60Var.f29402e0;
                p60Var.f29409k0 = p60Var.f29407i0 + p60Var.f29408j0;
                p60Var.Q = true;
                j3 = 0;
            } else {
                p60Var.f29405g0 = -1L;
                p60Var.f29409k0 = -1L;
                j3 = 0;
                p60Var.R = 0L;
            }
            p60Var.S = -1L;
            p60Var.O = j3;
            p60Var.P = -1L;
            p60Var.f29406h0 = -1L;
            p60Var.f29399c0 = -1L;
            p60Var.f29400d0 = -1L;
            p60Var.f29404f0 = -1L;
            p60Var.f29407i0 = -1L;
            p60Var.f29395a0 = false;
            p60Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i12);
            p60Var.f29428y0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + p60Var.f29428y0.getChannelCount() + " sample rate = " + p60Var.f29428y0.getSampleRate() + " bufferSize = " + i12);
            }
            p60Var.D0 = false;
            Thread thread = new Thread(p60Var.E0);
            thread.setPriority(10);
            thread.start();
            p60Var.J = new MediaCodec.BufferInfo();
            p60Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(p60Var.H0.f32283f).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            p60Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            p60Var.F.start();
            p60Var.E = MediaCodec.createEncoderByType("video/avc");
            p60Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", p60Var.d, p60Var.f29401e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", p60Var.f29403f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            p60Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            p60Var.f29416r = p60Var.E.createInputSurface();
            p60Var.E.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(p60Var.f29394a);
                p60Var.f29396b = p60Var.f29394a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    p60Var.f29396b = file;
                    if (file.exists()) {
                        p60Var.f29396b.delete();
                    }
                    p60Var.f29398c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(p60Var.f29396b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(p60Var.d, p60Var.f29401e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, p60Var.H0.R, false);
                p60Var.K = createMovie;
                w60 w60Var = p60Var.H0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                w60Var.f32274a1 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new bi.f(27, p60Var, z10));
            if (p60Var.f29418s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                p60Var.f29418s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (p60Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(p60Var.f29418s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i10 = 0;
                                p60Var.v = EGL14.eglCreateContext(p60Var.f29418s, eGLConfigArr[0], p60Var.f29423w, new int[]{12440, 2, 12344}, 0);
                                p60Var.f29425x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i10 = 0;
                        }
                        EGL14.eglQueryContext(p60Var.f29418s, p60Var.v, 12440, new int[1], i10);
                        if (p60Var.f29427y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(p60Var.f29418s, p60Var.f29425x, p60Var.f29416r, new int[]{12344}, i10);
                            p60Var.f29427y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(p60Var.f29418s, eglCreateWindowSurface, eglCreateWindowSurface, p60Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                w50 w50Var = p60Var.f29426x0;
                                if (w50Var != null) {
                                    w50Var.b();
                                    p60Var.f29426x0 = null;
                                }
                                p60Var.f29426x0 = new w50(p60Var.d, p60Var.f29401e);
                                w60 w60Var2 = p60Var.H0;
                                Size size = w60Var2.f32298n0[0];
                                if (!SharedConfig.deviceIsLow() && w60.k() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(w60Var2.f32283f).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int j10 = w60.j(p60Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j11 = w60.j(p60Var.H0, 35632, str);
                                if (j10 != 0 && j11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    p60Var.m0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j10);
                                    GLES20.glAttachShader(p60Var.m0, j11);
                                    GLES20.glLinkProgram(p60Var.m0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(p60Var.m0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(p60Var.m0);
                                        p60Var.m0 = 0;
                                        return;
                                    }
                                    p60Var.f29414p0 = GLES20.glGetAttribLocation(p60Var.m0, "aPosition");
                                    p60Var.f29415q0 = GLES20.glGetAttribLocation(p60Var.m0, "aTextureCoord");
                                    p60Var.f29419s0 = GLES20.glGetUniformLocation(p60Var.m0, "preview");
                                    p60Var.f29417r0 = GLES20.glGetUniformLocation(p60Var.m0, "resolution");
                                    p60Var.f29421u0 = GLES20.glGetUniformLocation(p60Var.m0, "alpha");
                                    p60Var.f29412n0 = GLES20.glGetUniformLocation(p60Var.m0, "uMVPMatrix");
                                    p60Var.f29413o0 = GLES20.glGetUniformLocation(p60Var.m0, "uSTMatrix");
                                    p60Var.f29420t0 = GLES20.glGetUniformLocation(p60Var.m0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    p60Var.f29418s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void b(p60 p60Var, int i10, l60 l60Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = p60Var.H0.S) == null || !videoEditedInfo.needConvert()) && !p60Var.H0.f32297n.c())) {
            if (!p60Var.G0) {
                p60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new jt(17, p60Var, l60Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (p60Var.W && !p60Var.D0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            p60Var.X = i10;
            p60Var.Y = l60Var;
            p60Var.W = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            p60Var.e(true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        MediaCodec mediaCodec = p60Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                p60Var.E.release();
                p60Var.E = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        MediaCodec mediaCodec2 = p60Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                p60Var.F.release();
                p60Var.F = null;
                g(false);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        File file = p60Var.H0.f32286g0;
        if (file != null) {
            file.delete();
            p60Var.H0.f32286g0 = null;
        }
        MP4Builder mP4Builder = p60Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (p60Var.f29398c) {
                if (p60Var.f29394a.exists()) {
                    try {
                        p60Var.f29394a.delete();
                    } catch (Exception e13) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + p60Var.f29394a);
                        FileLog.e(e13);
                    }
                }
                if (!p60Var.f29396b.renameTo(p60Var.f29394a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(p60Var.f29396b, p60Var.f29394a);
                        p60Var.f29396b.delete();
                    } catch (IOException e14) {
                        FileLog.e(e14);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = p60Var.B0) != null) {
            dispatchQueue.cleanupQueue();
            p60Var.B0.recycle();
            p60Var.B0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(p60Var.H0.f32283f).cancelFileUpload(p60Var.f29394a.getAbsolutePath(), false);
            try {
                p60Var.f29396b.delete();
            } catch (Throwable unused) {
            }
            try {
                p60Var.f29394a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !p60Var.G0)) {
                p60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new bl(p60Var, i10, l60Var, 8));
            }
            AndroidUtilities.runOnUIThread(new m60(p60Var, 2));
        }
        EGL14.eglDestroySurface(p60Var.f29418s, p60Var.f29427y);
        p60Var.f29427y = EGL14.EGL_NO_SURFACE;
        Surface surface = p60Var.f29416r;
        if (surface != null) {
            surface.release();
            p60Var.f29416r = null;
        }
        EGLDisplay eGLDisplay = p60Var.f29418s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(p60Var.f29418s, p60Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(p60Var.f29418s);
        }
        p60Var.f29418s = EGL14.EGL_NO_DISPLAY;
        p60Var.v = EGL14.EGL_NO_CONTEXT;
        p60Var.f29425x = null;
        p60Var.T.getClass();
        Looper.myLooper().quit();
        w50 w50Var = p60Var.f29426x0;
        if (w50Var != null) {
            w50Var.b();
            p60Var.f29426x0 = null;
        }
        AndroidUtilities.runOnUIThread(new m60(p60Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !if0.d("android.permission.BLUETOOTH_CONNECT")) {
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
                        } catch (Exception e7) {
                            FileLog.e(e7);
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

    public final void c(d60 d60Var, long j3, boolean z10) {
        w60 w60Var = this.H0;
        int i10 = w60Var.f32283f;
        long j10 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(d60Var.toString(), w60Var.R, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = d60Var.toString();
                boolean z11 = w60Var.R;
                if (z10) {
                    j10 = d60Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z11, j3, j10);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = d60Var.toString();
        boolean z12 = w60Var.R;
        if (z10) {
            j10 = d60Var.length();
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
                            if (writeSampleData != 0 && !this.f29398c && this.H0.f32274a1) {
                                c(this.f29394a, writeSampleData, false);
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
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.d, this.f29401e);
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
                    throw new RuntimeException(hg.c.j(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
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
                            if (writeSampleData2 != 0 && !this.f29398c && this.H0.f32274a1) {
                                c(this.f29394a, writeSampleData2, false);
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
                        throw new RuntimeException(hg.c.j(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
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
                    int i10 = this.f29422v0 + 1;
                    this.f29422v0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f29422v0 = 0;
                    j3 = timestamp;
                }
                this.T.sendMessage(this.T.obtainMessage(2, (int) (j3 >> 32), (int) j3, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        w50 w50Var = this.f29426x0;
        if (w50Var != null) {
            w50Var.b();
            this.f29426x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f29418s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f29418s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f29418s);
                this.f29418s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f29425x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        q81 q81Var = new q81();
        w60 w60Var = this.H0;
        w60Var.T = q81Var;
        q81Var.J = new k2.g0(this, 12);
        q81Var.V(w60Var.f32301q0);
        w60Var.T.D(Uri.fromFile(file), "other");
        w60Var.T.C();
        w60Var.T.O(true);
        w60Var.s();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = w60Var.f32276b1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(w60Var.f32302r, u6.f31055b, 0), ObjectAnimator.ofFloat(w60Var.G, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f29418s, this.f29427y);
        this.f29427y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f29416r;
        if (surface != null) {
            surface.release();
            this.f29416r = null;
        }
        EGLDisplay eGLDisplay = this.f29418s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f29418s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f29418s);
        }
        this.f29418s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f29425x = null;
    }

    public final void i(int i10, l60 l60Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, l60Var));
        AndroidUtilities.runOnUIThread(new xh(8));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.c cVar = new g.c(1);
            cVar.f10107b = new WeakReference(this);
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
