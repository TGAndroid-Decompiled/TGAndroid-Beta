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
public final class l60 implements Runnable {
    public DispatchQueue B0;
    public int C0;
    public volatile boolean D0;
    public MediaCodec E;
    public MediaCodec F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public final t60 H0;
    public MediaCodec.BufferInfo I;
    public MediaCodec.BufferInfo J;
    public MP4Builder K;
    public long O;
    public boolean Q;
    public volatile g.c T;
    public volatile boolean V;
    public volatile boolean W;
    public volatile int X;
    public volatile h60 Y;
    public long Z;
    public a60 f28267a;
    public boolean f28268a0;
    public File f28269b;
    public long f28270b0;
    public boolean f28271c;
    public int d;
    public long f28273d0;
    public int f28274e;
    public long f28275e0;
    public int f28276f;
    public long f28277f0;
    public boolean f28283l0;
    public int m0;
    public boolean f28284n;
    public int f28285n0;
    public int f28286o0;
    public int f28287p0;
    public int f28288q0;
    public Surface f28289r;
    public int f28290r0;
    public int f28292s0;
    public int f28293t0;
    public int f28294u0;
    public int f28295v0;
    public EGLContext f28296w;
    public EGLConfig f28298x;
    public t50 f28299x0;
    public AudioRecord f28301y0;
    public boolean h = true;
    public EGLDisplay f28291s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f28300y = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long f28272c0 = -1;
    public long f28278g0 = -1;
    public long f28279h0 = -1;
    public long f28280i0 = -1;
    public long f28281j0 = 0;
    public long f28282k0 = -1;
    public Integer f28297w0 = 0;
    public final ArrayBlockingQueue f28302z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final k60 E0 = new k60(this, 0);

    public l60(t60 t60Var) {
        this.H0 = t60Var;
    }

    public static void a(l60 l60Var, boolean z10) {
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
            l60Var.f28302z0.clear();
            for (int i13 = 0; i13 < 3; i13++) {
                l60Var.f28302z0.add(new b60());
            }
            if (z10) {
                l60Var.f28278g0 = l60Var.f28273d0 + l60Var.f28275e0;
                l60Var.f28282k0 = l60Var.f28280i0 + l60Var.f28281j0;
                l60Var.Q = true;
                j3 = 0;
            } else {
                l60Var.f28278g0 = -1L;
                l60Var.f28282k0 = -1L;
                j3 = 0;
                l60Var.R = 0L;
            }
            l60Var.S = -1L;
            l60Var.O = j3;
            l60Var.P = -1L;
            l60Var.f28279h0 = -1L;
            l60Var.f28272c0 = -1L;
            l60Var.f28273d0 = -1L;
            l60Var.f28277f0 = -1L;
            l60Var.f28280i0 = -1L;
            l60Var.f28268a0 = false;
            l60Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i12);
            l60Var.f28301y0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + l60Var.f28301y0.getChannelCount() + " sample rate = " + l60Var.f28301y0.getSampleRate() + " bufferSize = " + i12);
            }
            l60Var.D0 = false;
            Thread thread = new Thread(l60Var.E0);
            thread.setPriority(10);
            thread.start();
            l60Var.J = new MediaCodec.BufferInfo();
            l60Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(l60Var.H0.f31012f).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            l60Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            l60Var.F.start();
            l60Var.E = MediaCodec.createEncoderByType("video/avc");
            l60Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", l60Var.d, l60Var.f28274e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", l60Var.f28276f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            l60Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            l60Var.f28289r = l60Var.E.createInputSurface();
            l60Var.E.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(l60Var.f28267a);
                l60Var.f28269b = l60Var.f28267a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    l60Var.f28269b = file;
                    if (file.exists()) {
                        l60Var.f28269b.delete();
                    }
                    l60Var.f28271c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(l60Var.f28269b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(l60Var.d, l60Var.f28274e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, l60Var.H0.R, false);
                l60Var.K = createMovie;
                t60 t60Var = l60Var.H0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                t60Var.f31003a1 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new bi.f(27, l60Var, z10));
            if (l60Var.f28291s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                l60Var.f28291s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (l60Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(l60Var.f28291s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i10 = 0;
                                l60Var.v = EGL14.eglCreateContext(l60Var.f28291s, eGLConfigArr[0], l60Var.f28296w, new int[]{12440, 2, 12344}, 0);
                                l60Var.f28298x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i10 = 0;
                        }
                        EGL14.eglQueryContext(l60Var.f28291s, l60Var.v, 12440, new int[1], i10);
                        if (l60Var.f28300y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(l60Var.f28291s, l60Var.f28298x, l60Var.f28289r, new int[]{12344}, i10);
                            l60Var.f28300y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(l60Var.f28291s, eglCreateWindowSurface, eglCreateWindowSurface, l60Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                t50 t50Var = l60Var.f28299x0;
                                if (t50Var != null) {
                                    t50Var.b();
                                    l60Var.f28299x0 = null;
                                }
                                l60Var.f28299x0 = new t50(l60Var.d, l60Var.f28274e);
                                t60 t60Var2 = l60Var.H0;
                                Size size = t60Var2.f31027n0[0];
                                if (!SharedConfig.deviceIsLow() && t60.k() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(t60Var2.f31012f).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int j10 = t60.j(l60Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j11 = t60.j(l60Var.H0, 35632, str);
                                if (j10 != 0 && j11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    l60Var.m0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j10);
                                    GLES20.glAttachShader(l60Var.m0, j11);
                                    GLES20.glLinkProgram(l60Var.m0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(l60Var.m0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(l60Var.m0);
                                        l60Var.m0 = 0;
                                        return;
                                    }
                                    l60Var.f28287p0 = GLES20.glGetAttribLocation(l60Var.m0, "aPosition");
                                    l60Var.f28288q0 = GLES20.glGetAttribLocation(l60Var.m0, "aTextureCoord");
                                    l60Var.f28292s0 = GLES20.glGetUniformLocation(l60Var.m0, "preview");
                                    l60Var.f28290r0 = GLES20.glGetUniformLocation(l60Var.m0, "resolution");
                                    l60Var.f28294u0 = GLES20.glGetUniformLocation(l60Var.m0, "alpha");
                                    l60Var.f28285n0 = GLES20.glGetUniformLocation(l60Var.m0, "uMVPMatrix");
                                    l60Var.f28286o0 = GLES20.glGetUniformLocation(l60Var.m0, "uSTMatrix");
                                    l60Var.f28293t0 = GLES20.glGetUniformLocation(l60Var.m0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    l60Var.f28291s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void b(l60 l60Var, int i10, h60 h60Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = l60Var.H0.S) == null || !videoEditedInfo.needConvert()) && !l60Var.H0.f31026n.c())) {
            if (!l60Var.G0) {
                l60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new zr(19, l60Var, h60Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (l60Var.W && !l60Var.D0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            l60Var.X = i10;
            l60Var.Y = h60Var;
            l60Var.W = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            l60Var.e(true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        MediaCodec mediaCodec = l60Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                l60Var.E.release();
                l60Var.E = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        MediaCodec mediaCodec2 = l60Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                l60Var.F.release();
                l60Var.F = null;
                g(false);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        File file = l60Var.H0.f31015g0;
        if (file != null) {
            file.delete();
            l60Var.H0.f31015g0 = null;
        }
        MP4Builder mP4Builder = l60Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (l60Var.f28271c) {
                if (l60Var.f28267a.exists()) {
                    try {
                        l60Var.f28267a.delete();
                    } catch (Exception e13) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + l60Var.f28267a);
                        FileLog.e(e13);
                    }
                }
                if (!l60Var.f28269b.renameTo(l60Var.f28267a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(l60Var.f28269b, l60Var.f28267a);
                        l60Var.f28269b.delete();
                    } catch (IOException e14) {
                        FileLog.e(e14);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = l60Var.B0) != null) {
            dispatchQueue.cleanupQueue();
            l60Var.B0.recycle();
            l60Var.B0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(l60Var.H0.f31012f).cancelFileUpload(l60Var.f28267a.getAbsolutePath(), false);
            try {
                l60Var.f28269b.delete();
            } catch (Throwable unused) {
            }
            try {
                l60Var.f28267a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !l60Var.G0)) {
                l60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new zk(l60Var, i10, h60Var, 8));
            }
            AndroidUtilities.runOnUIThread(new i60(l60Var, 2));
        }
        EGL14.eglDestroySurface(l60Var.f28291s, l60Var.f28300y);
        l60Var.f28300y = EGL14.EGL_NO_SURFACE;
        Surface surface = l60Var.f28289r;
        if (surface != null) {
            surface.release();
            l60Var.f28289r = null;
        }
        EGLDisplay eGLDisplay = l60Var.f28291s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(l60Var.f28291s, l60Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(l60Var.f28291s);
        }
        l60Var.f28291s = EGL14.EGL_NO_DISPLAY;
        l60Var.v = EGL14.EGL_NO_CONTEXT;
        l60Var.f28298x = null;
        l60Var.T.getClass();
        Looper.myLooper().quit();
        t50 t50Var = l60Var.f28299x0;
        if (t50Var != null) {
            t50Var.b();
            l60Var.f28299x0 = null;
        }
        AndroidUtilities.runOnUIThread(new i60(l60Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !ef0.d("android.permission.BLUETOOTH_CONNECT")) {
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

    public final void c(a60 a60Var, long j3, boolean z10) {
        t60 t60Var = this.H0;
        int i10 = t60Var.f31012f;
        long j10 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(a60Var.toString(), t60Var.R, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = a60Var.toString();
                boolean z11 = t60Var.R;
                if (z10) {
                    j10 = a60Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z11, j3, j10);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = a60Var.toString();
        boolean z12 = t60Var.R;
        if (z10) {
            j10 = a60Var.length();
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
                            if (writeSampleData != 0 && !this.f28271c && this.H0.f31003a1) {
                                c(this.f28267a, writeSampleData, false);
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
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.d, this.f28274e);
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
                            if (writeSampleData2 != 0 && !this.f28271c && this.H0.f31003a1) {
                                c(this.f28267a, writeSampleData2, false);
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
                    int i10 = this.f28295v0 + 1;
                    this.f28295v0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f28295v0 = 0;
                    j3 = timestamp;
                }
                this.T.sendMessage(this.T.obtainMessage(2, (int) (j3 >> 32), (int) j3, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        t50 t50Var = this.f28299x0;
        if (t50Var != null) {
            t50Var.b();
            this.f28299x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f28291s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f28291s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f28291s);
                this.f28291s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f28298x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        k81 k81Var = new k81();
        t60 t60Var = this.H0;
        t60Var.T = k81Var;
        k81Var.J = new m.f3(this, 7);
        k81Var.V(t60Var.f31030q0);
        t60Var.T.D(Uri.fromFile(file), "other");
        t60Var.T.C();
        t60Var.T.O(true);
        t60Var.s();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = t60Var.f31005b1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(t60Var.f31031r, u6.f31379b, 0), ObjectAnimator.ofFloat(t60Var.G, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f28291s, this.f28300y);
        this.f28300y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f28289r;
        if (surface != null) {
            surface.release();
            this.f28289r = null;
        }
        EGLDisplay eGLDisplay = this.f28291s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f28291s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f28291s);
        }
        this.f28291s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f28298x = null;
    }

    public final void i(int i10, h60 h60Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, h60Var));
        AndroidUtilities.runOnUIThread(new vh(8));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.c cVar = new g.c(1);
            cVar.f10109b = new WeakReference(this);
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
