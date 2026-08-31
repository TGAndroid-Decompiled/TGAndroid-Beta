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
public final class y50 implements Runnable {
    public volatile boolean A0;
    public MediaCodec B;
    public MediaCodec C;
    public boolean C0;
    public int D;
    public boolean D0;
    public boolean E;
    public final z50 E0;
    public MediaCodec.BufferInfo F;
    public MediaCodec.BufferInfo G;
    public MP4Builder H;
    public long L;
    public boolean N;
    public volatile c2.u0 Q;
    public volatile boolean S;
    public volatile boolean T;
    public volatile int U;
    public volatile u50 V;
    public long W;
    public boolean X;
    public long Y;
    public n50 f33342a;
    public long f33343a0;
    public File f33344b;
    public long f33345b0;
    public boolean f33346c;
    public long f33347c0;
    public int d;
    public int f33349e;
    public int f33351f;
    public boolean f33355i0;
    public int f33356j0;
    public int f33357k0;
    public int f33358l0;
    public int m0;
    public boolean f33359n;
    public int f33360n0;
    public int f33361o0;
    public int f33362p0;
    public int f33363q0;
    public Surface f33364r;
    public int f33365r0;
    public int f33367s0;
    public f50 f33369u0;
    public AudioRecord f33370v0;
    public EGLContext f33371w;
    public EGLConfig f33373x;
    public DispatchQueue f33376y0;
    public int f33377z0;
    public boolean h = true;
    public EGLDisplay f33366s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f33375y = EGL14.EGL_NO_SURFACE;
    public final ArrayList I = new ArrayList();
    public int J = -5;
    public int K = -5;
    public long M = -1;
    public long O = 0;
    public long P = -1;
    public final Object R = new Object();
    public long Z = -1;
    public long f33348d0 = -1;
    public long f33350e0 = -1;
    public long f33352f0 = -1;
    public long f33353g0 = 0;
    public long f33354h0 = -1;
    public Integer f33368t0 = 0;
    public final ArrayBlockingQueue f33372w0 = new ArrayBlockingQueue(10);
    public final ArrayList f33374x0 = new ArrayList();
    public final x50 B0 = new x50(this);

    public y50(z50 z50Var) {
        this.E0 = z50Var;
    }

    public static void a(y50 y50Var, boolean z4) {
        int i10;
        long j10;
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
            y50Var.f33372w0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                y50Var.f33372w0.add(new o50());
            }
            if (z4) {
                y50Var.f33348d0 = y50Var.f33343a0 + y50Var.f33345b0;
                y50Var.f33354h0 = y50Var.f33352f0 + y50Var.f33353g0;
                y50Var.N = true;
                j10 = 0;
            } else {
                y50Var.f33348d0 = -1L;
                y50Var.f33354h0 = -1L;
                j10 = 0;
                y50Var.O = 0L;
            }
            y50Var.P = -1L;
            y50Var.L = j10;
            y50Var.M = -1L;
            y50Var.f33350e0 = -1L;
            y50Var.Z = -1L;
            y50Var.f33343a0 = -1L;
            y50Var.f33347c0 = -1L;
            y50Var.f33352f0 = -1L;
            y50Var.X = false;
            y50Var.W = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i10);
            y50Var.f33370v0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + y50Var.f33370v0.getChannelCount() + " sample rate = " + y50Var.f33370v0.getSampleRate() + " bufferSize = " + i10);
            }
            y50Var.A0 = false;
            Thread thread = new Thread(y50Var.B0);
            thread.setPriority(10);
            thread.start();
            y50Var.G = new MediaCodec.BufferInfo();
            y50Var.F = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(y50Var.E0.f33732a).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            y50Var.C = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            y50Var.C.start();
            y50Var.B = MediaCodec.createEncoderByType("video/avc");
            y50Var.E = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", y50Var.d, y50Var.f33349e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", y50Var.f33351f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            y50Var.B.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            y50Var.f33364r = y50Var.B.createInputSurface();
            y50Var.B.start();
            if (!z4) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(y50Var.f33342a);
                y50Var.f33344b = y50Var.f33342a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    y50Var.f33344b = file;
                    if (file.exists()) {
                        y50Var.f33344b.delete();
                    }
                    y50Var.f33346c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(y50Var.f33344b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(y50Var.d, y50Var.f33349e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, y50Var.E0.J, false);
                y50Var.H = createMovie;
                z50 z50Var = y50Var.E0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                z50Var.N0 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new kh.f(23, y50Var, z4));
            if (y50Var.f33366s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                y50Var.f33366s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (y50Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(y50Var.f33366s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i11 = 0;
                                y50Var.v = EGL14.eglCreateContext(y50Var.f33366s, eGLConfigArr[0], y50Var.f33371w, new int[]{12440, 2, 12344}, 0);
                                y50Var.f33373x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i11 = 0;
                        }
                        EGL14.eglQueryContext(y50Var.f33366s, y50Var.v, 12440, new int[1], i11);
                        if (y50Var.f33375y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(y50Var.f33366s, y50Var.f33373x, y50Var.f33364r, new int[]{12344}, i11);
                            y50Var.f33375y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(y50Var.f33366s, eglCreateWindowSurface, eglCreateWindowSurface, y50Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                f50 f50Var = y50Var.f33369u0;
                                if (f50Var != null) {
                                    f50Var.b();
                                    y50Var.f33369u0 = null;
                                }
                                y50Var.f33369u0 = new f50(y50Var.d, y50Var.f33349e);
                                z50 z50Var2 = y50Var.E0;
                                Size size = z50Var2.f33742f0[0];
                                if (!SharedConfig.deviceIsLow() && z50.b() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(z50Var2.f33732a).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int a2 = z50.a(y50Var.E0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int a10 = z50.a(y50Var.E0, 35632, str);
                                if (a2 != 0 && a10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    y50Var.f33356j0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, a2);
                                    GLES20.glAttachShader(y50Var.f33356j0, a10);
                                    GLES20.glLinkProgram(y50Var.f33356j0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(y50Var.f33356j0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(y50Var.f33356j0);
                                        y50Var.f33356j0 = 0;
                                        return;
                                    }
                                    y50Var.m0 = GLES20.glGetAttribLocation(y50Var.f33356j0, "aPosition");
                                    y50Var.f33360n0 = GLES20.glGetAttribLocation(y50Var.f33356j0, "aTextureCoord");
                                    y50Var.f33362p0 = GLES20.glGetUniformLocation(y50Var.f33356j0, "preview");
                                    y50Var.f33361o0 = GLES20.glGetUniformLocation(y50Var.f33356j0, "resolution");
                                    y50Var.f33365r0 = GLES20.glGetUniformLocation(y50Var.f33356j0, "alpha");
                                    y50Var.f33357k0 = GLES20.glGetUniformLocation(y50Var.f33356j0, "uMVPMatrix");
                                    y50Var.f33358l0 = GLES20.glGetUniformLocation(y50Var.f33356j0, "uSTMatrix");
                                    y50Var.f33363q0 = GLES20.glGetUniformLocation(y50Var.f33356j0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    y50Var.f33366s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void b(y50 y50Var, int i10, u50 u50Var) {
        boolean z4;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = y50Var.E0.K) == null || !videoEditedInfo.needConvert()) && !y50Var.E0.f33736c.c())) {
            if (!y50Var.D0) {
                y50Var.D0 = true;
                AndroidUtilities.runOnUIThread(new gm(24, y50Var, u50Var));
            }
            z4 = false;
        } else {
            z4 = true;
        }
        if (y50Var.T && !y50Var.A0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            y50Var.U = i10;
            y50Var.V = u50Var;
            y50Var.T = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            y50Var.e(true);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        MediaCodec mediaCodec = y50Var.B;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                y50Var.B.release();
                y50Var.B = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        MediaCodec mediaCodec2 = y50Var.C;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                y50Var.C.release();
                y50Var.C = null;
                g(false);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        File file = y50Var.E0.V;
        if (file != null) {
            file.delete();
            y50Var.E0.V = null;
        }
        MP4Builder mP4Builder = y50Var.H;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (y50Var.f33346c) {
                if (y50Var.f33342a.exists()) {
                    try {
                        y50Var.f33342a.delete();
                    } catch (Exception e13) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + y50Var.f33342a);
                        FileLog.e(e13);
                    }
                }
                if (!y50Var.f33344b.renameTo(y50Var.f33342a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(y50Var.f33344b, y50Var.f33342a);
                        y50Var.f33344b.delete();
                    } catch (IOException e14) {
                        FileLog.e(e14);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = y50Var.f33376y0) != null) {
            dispatchQueue.cleanupQueue();
            y50Var.f33376y0.recycle();
            y50Var.f33376y0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(y50Var.E0.f33732a).cancelFileUpload(y50Var.f33342a.getAbsolutePath(), false);
            try {
                y50Var.f33344b.delete();
            } catch (Throwable unused) {
            }
            try {
                y50Var.f33342a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z4 && (i10 != 1 || !y50Var.D0)) {
                y50Var.D0 = true;
                AndroidUtilities.runOnUIThread(new gy(y50Var, i10, u50Var, 5));
            }
            AndroidUtilities.runOnUIThread(new v50(y50Var, 3));
        }
        EGL14.eglDestroySurface(y50Var.f33366s, y50Var.f33375y);
        y50Var.f33375y = EGL14.EGL_NO_SURFACE;
        Surface surface = y50Var.f33364r;
        if (surface != null) {
            surface.release();
            y50Var.f33364r = null;
        }
        EGLDisplay eGLDisplay = y50Var.f33366s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(y50Var.f33366s, y50Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(y50Var.f33366s);
        }
        y50Var.f33366s = EGL14.EGL_NO_DISPLAY;
        y50Var.v = EGL14.EGL_NO_CONTEXT;
        y50Var.f33373x = null;
        y50Var.Q.getClass();
        Looper.myLooper().quit();
        f50 f50Var = y50Var.f33369u0;
        if (f50Var != null) {
            f50Var.b();
            y50Var.f33369u0 = null;
        }
        AndroidUtilities.runOnUIThread(new v50(y50Var, 4));
    }

    public static void g(boolean z4) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !ie0.f("android.permission.BLUETOOTH_CONNECT")) {
            SharedConfig.recordViaSco = false;
            SharedConfig.saveConfig();
        }
        if ((audioManager.isBluetoothScoAvailableOffCall() && SharedConfig.recordViaSco) || !z4) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                try {
                    if (defaultAdapter.getProfileConnectionState(1) != 2) {
                    }
                    if (!z4 && !audioManager.isBluetoothScoOn()) {
                        audioManager.startBluetoothSco();
                        return;
                    } else if (z4 && audioManager.isBluetoothScoOn()) {
                        audioManager.stopBluetoothSco();
                        return;
                    }
                } catch (SecurityException unused) {
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    if (!z4) {
                        try {
                            if (audioManager.isBluetoothScoOn()) {
                                audioManager.stopBluetoothSco();
                                return;
                            }
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    }
                    return;
                }
            }
            if (z4) {
                return;
            }
            if (!z4) {
            }
            if (z4) {
            }
        }
    }

    public final void c(n50 n50Var, long j10, boolean z4) {
        z50 z50Var = this.E0;
        int i10 = z50Var.f33732a;
        long j11 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(n50Var.toString(), z50Var.J, false, 1L, 33554432, false);
            this.h = false;
            if (z4) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = n50Var.toString();
                boolean z10 = z50Var.J;
                if (z4) {
                    j11 = n50Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z10, j10, j11);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = n50Var.toString();
        boolean z11 = z50Var.J;
        if (z4) {
            j11 = n50Var.length();
        }
        fileLoader2.checkUploadNewDataAvailable(file2, z11, j10, j11);
    }

    public final void e(boolean z4) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (z4) {
            this.B.signalEndOfInputStream();
        }
        while (true) {
            int dequeueOutputBuffer = this.B.dequeueOutputBuffer(this.F, 10000L);
            byte b10 = 1;
            if (dequeueOutputBuffer == -1) {
                if (!z4 || this.A0) {
                    break;
                }
            } else if (dequeueOutputBuffer == -3) {
                continue;
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.B.getOutputFormat();
                if (this.J == -5) {
                    this.J = this.H.addTrack(outputFormat, false);
                    if (outputFormat.containsKey("prepend-sps-pps-to-idr-frames") && outputFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                        this.D = outputFormat.getByteBuffer("csd-1").limit() + outputFormat.getByteBuffer("csd-0").limit();
                    }
                }
            } else if (dequeueOutputBuffer < 0) {
                continue;
            } else {
                ByteBuffer outputBuffer = this.B.getOutputBuffer(dequeueOutputBuffer);
                if (outputBuffer != null) {
                    MediaCodec.BufferInfo bufferInfo = this.F;
                    int i10 = bufferInfo.size;
                    if (i10 > 1) {
                        int i11 = bufferInfo.flags;
                        if ((i11 & 2) == 0) {
                            int i12 = this.D;
                            if (i12 != 0 && (i11 & 1) != 0) {
                                bufferInfo.offset += i12;
                                bufferInfo.size = i10 - i12;
                            }
                            if (this.E && (i11 & 1) != 0) {
                                if (bufferInfo.size > 100) {
                                    outputBuffer.position(bufferInfo.offset);
                                    byte[] bArr = new byte[100];
                                    outputBuffer.get(bArr);
                                    int i13 = 0;
                                    int i14 = 0;
                                    while (true) {
                                        if (i13 < 96) {
                                            if (bArr[i13] == 0 && bArr[i13 + 1] == 0 && bArr[i13 + 2] == 0 && bArr[i13 + 3] == 1 && (i14 = i14 + 1) > 1) {
                                                MediaCodec.BufferInfo bufferInfo2 = this.F;
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
                                this.E = false;
                            }
                            long writeSampleData = this.H.writeSampleData(this.J, outputBuffer, this.F, true);
                            if (writeSampleData != 0 && !this.f33346c && this.E0.N0) {
                                c(this.f33342a, writeSampleData, false);
                            }
                        } else if (this.J == -5) {
                            byte[] bArr2 = new byte[i10];
                            outputBuffer.limit(bufferInfo.offset + i10);
                            outputBuffer.position(this.F.offset);
                            outputBuffer.get(bArr2);
                            int i15 = this.F.size - 1;
                            while (i15 >= 0 && i15 > 3) {
                                if (bArr2[i15] == b10 && bArr2[i15 - 1] == 0 && bArr2[i15 - 2] == 0) {
                                    int i16 = i15 - 3;
                                    if (bArr2[i16] == 0) {
                                        byteBuffer = ByteBuffer.allocate(i16);
                                        byteBuffer2 = ByteBuffer.allocate(this.F.size - i16);
                                        byteBuffer.put(bArr2, 0, i16).position(0);
                                        byteBuffer2.put(bArr2, i16, this.F.size - i16).position(0);
                                        break;
                                    }
                                }
                                i15--;
                                b10 = 1;
                            }
                            byteBuffer = null;
                            byteBuffer2 = null;
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.d, this.f33349e);
                            if (byteBuffer != null && byteBuffer2 != null) {
                                createVideoFormat.setByteBuffer("csd-0", byteBuffer);
                                createVideoFormat.setByteBuffer("csd-1", byteBuffer2);
                            }
                            this.J = this.H.addTrack(createVideoFormat, false);
                        }
                    }
                    this.B.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.F.flags & 4) != 0) {
                        break;
                    }
                } else {
                    throw new RuntimeException(l.d.k(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
            }
        }
        while (true) {
            int dequeueOutputBuffer2 = this.C.dequeueOutputBuffer(this.G, 0L);
            if (dequeueOutputBuffer2 == -1) {
                if (z4) {
                    if ((!this.T && this.U == 0) || this.A0) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (dequeueOutputBuffer2 != -3) {
                if (dequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat2 = this.C.getOutputFormat();
                    if (this.K == -5) {
                        this.K = this.H.addTrack(outputFormat2, true);
                    }
                } else if (dequeueOutputBuffer2 < 0) {
                    continue;
                } else {
                    ByteBuffer outputBuffer2 = this.C.getOutputBuffer(dequeueOutputBuffer2);
                    if (outputBuffer2 != null) {
                        MediaCodec.BufferInfo bufferInfo3 = this.G;
                        if ((bufferInfo3.flags & 2) != 0) {
                            bufferInfo3.size = 0;
                        }
                        if (bufferInfo3.size != 0) {
                            long writeSampleData2 = this.H.writeSampleData(this.K, outputBuffer2, bufferInfo3, false);
                            if (writeSampleData2 != 0 && !this.f33346c && this.E0.N0) {
                                c(this.f33342a, writeSampleData2, false);
                            }
                            MediaCodec mediaCodec = this.C;
                            if (mediaCodec != null) {
                                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer2, false);
                            }
                        } else {
                            MediaCodec mediaCodec2 = this.C;
                            if (mediaCodec2 != null) {
                                mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer2, false);
                            }
                        }
                        if ((this.G.flags & 4) != 0) {
                            return;
                        }
                    } else {
                        throw new RuntimeException(l.d.k(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
                    }
                }
            }
        }
    }

    public final void f(SurfaceTexture surfaceTexture, Integer num, long j10) {
        synchronized (this.R) {
            try {
                if (!this.S) {
                    return;
                }
                long timestamp = surfaceTexture.getTimestamp();
                if (timestamp == 0) {
                    int i10 = this.f33367s0 + 1;
                    this.f33367s0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f33367s0 = 0;
                    j10 = timestamp;
                }
                this.Q.sendMessage(this.Q.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        f50 f50Var = this.f33369u0;
        if (f50Var != null) {
            f50Var.b();
            this.f33369u0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f33366s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f33366s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f33366s);
                this.f33366s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f33373x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        k71 k71Var = new k71();
        z50 z50Var = this.E0;
        z50Var.L = k71Var;
        k71Var.G = new oh.h4(this, 3);
        k71Var.V(z50Var.f33745i0);
        z50Var.L.D(Uri.fromFile(file), "other");
        z50Var.L.C();
        z50Var.L.O(true);
        z50Var.n();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = z50Var.O0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(z50Var.d, n6.f29412b, 0), ObjectAnimator.ofFloat(z50Var.f33761w, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f33366s, this.f33375y);
        this.f33375y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f33364r;
        if (surface != null) {
            surface.release();
            this.f33364r = null;
        }
        EGLDisplay eGLDisplay = this.f33366s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f33366s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f33366s);
        }
        this.f33366s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f33373x = null;
    }

    public final void i(int i10, u50 u50Var) {
        this.Q.sendMessage(this.Q.obtainMessage(1, i10, 0, u50Var));
        AndroidUtilities.runOnUIThread(new v50(this, 5));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.R) {
            c2.u0 u0Var = new c2.u0(2);
            u0Var.f2182b = new WeakReference(this);
            this.Q = u0Var;
            this.S = true;
            this.R.notify();
        }
        Looper.loop();
        synchronized (this.R) {
            this.S = false;
        }
    }
}
