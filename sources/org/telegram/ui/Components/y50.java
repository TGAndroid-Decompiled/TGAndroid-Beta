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
    public volatile t50 Y;
    public long Z;
    public m50 f33056a;
    public boolean f33057a0;
    public File f33058b;
    public long f33059b0;
    public boolean f33060c;
    public int d;
    public long f33062d0;
    public int f33063e;
    public long f33064e0;
    public int f33065f;
    public long f33066f0;
    public boolean f33072l0;
    public int m0;
    public boolean f33073n;
    public int f33074n0;
    public int f33075o0;
    public int f33076p0;
    public int f33077q0;
    public Surface f33078r;
    public int f33079r0;
    public int f33081s0;
    public int f33082t0;
    public int f33083u0;
    public int f33084v0;
    public EGLContext f33085w;
    public EGLConfig f33087x;
    public f50 f33088x0;
    public AudioRecord f33090y0;
    public boolean h = true;
    public EGLDisplay f33080s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f33089y = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long f33061c0 = -1;
    public long f33067g0 = -1;
    public long f33068h0 = -1;
    public long f33069i0 = -1;
    public long f33070j0 = 0;
    public long f33071k0 = -1;
    public Integer f33086w0 = 0;
    public final ArrayBlockingQueue f33091z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final x50 E0 = new x50(this);

    public y50(f60 f60Var) {
        this.H0 = f60Var;
    }

    public static void a(y50 y50Var, boolean z10) {
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
            y50Var.f33091z0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                y50Var.f33091z0.add(new n50());
            }
            if (z10) {
                y50Var.f33067g0 = y50Var.f33062d0 + y50Var.f33064e0;
                y50Var.f33071k0 = y50Var.f33069i0 + y50Var.f33070j0;
                y50Var.Q = true;
                j3 = 0;
            } else {
                y50Var.f33067g0 = -1L;
                y50Var.f33071k0 = -1L;
                j3 = 0;
                y50Var.R = 0L;
            }
            y50Var.S = -1L;
            y50Var.O = j3;
            y50Var.P = -1L;
            y50Var.f33068h0 = -1L;
            y50Var.f33061c0 = -1L;
            y50Var.f33062d0 = -1L;
            y50Var.f33066f0 = -1L;
            y50Var.f33069i0 = -1L;
            y50Var.f33057a0 = false;
            y50Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i10);
            y50Var.f33090y0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + y50Var.f33090y0.getChannelCount() + " sample rate = " + y50Var.f33090y0.getSampleRate() + " bufferSize = " + i10);
            }
            y50Var.D0 = false;
            Thread thread = new Thread(y50Var.E0);
            thread.setPriority(10);
            thread.start();
            y50Var.J = new MediaCodec.BufferInfo();
            y50Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(y50Var.H0.f26305f).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            y50Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            y50Var.F.start();
            y50Var.E = MediaCodec.createEncoderByType("video/avc");
            y50Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", y50Var.d, y50Var.f33063e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", y50Var.f33065f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            y50Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            y50Var.f33078r = y50Var.E.createInputSurface();
            y50Var.E.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(y50Var.f33056a);
                y50Var.f33058b = y50Var.f33056a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    y50Var.f33058b = file;
                    if (file.exists()) {
                        y50Var.f33058b.delete();
                    }
                    y50Var.f33060c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(y50Var.f33058b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(y50Var.d, y50Var.f33063e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, y50Var.H0.R, false);
                y50Var.K = createMovie;
                f60 f60Var = y50Var.H0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                f60Var.V0 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new bi.f(26, y50Var, z10));
            if (y50Var.f33080s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                y50Var.f33080s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (y50Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(y50Var.f33080s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i11 = 0;
                                y50Var.v = EGL14.eglCreateContext(y50Var.f33080s, eGLConfigArr[0], y50Var.f33085w, new int[]{12440, 2, 12344}, 0);
                                y50Var.f33087x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i11 = 0;
                        }
                        EGL14.eglQueryContext(y50Var.f33080s, y50Var.v, 12440, new int[1], i11);
                        if (y50Var.f33089y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(y50Var.f33080s, y50Var.f33087x, y50Var.f33078r, new int[]{12344}, i11);
                            y50Var.f33089y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(y50Var.f33080s, eglCreateWindowSurface, eglCreateWindowSurface, y50Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                f50 f50Var = y50Var.f33088x0;
                                if (f50Var != null) {
                                    f50Var.b();
                                    y50Var.f33088x0 = null;
                                }
                                y50Var.f33088x0 = new f50(y50Var.d, y50Var.f33063e);
                                f60 f60Var2 = y50Var.H0;
                                Size size = f60Var2.f26316n0[0];
                                if (!SharedConfig.deviceIsLow() && f60.k() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(f60Var2.f26305f).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int j10 = f60.j(y50Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j11 = f60.j(y50Var.H0, 35632, str);
                                if (j10 != 0 && j11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    y50Var.m0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j10);
                                    GLES20.glAttachShader(y50Var.m0, j11);
                                    GLES20.glLinkProgram(y50Var.m0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(y50Var.m0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(y50Var.m0);
                                        y50Var.m0 = 0;
                                        return;
                                    }
                                    y50Var.f33076p0 = GLES20.glGetAttribLocation(y50Var.m0, "aPosition");
                                    y50Var.f33077q0 = GLES20.glGetAttribLocation(y50Var.m0, "aTextureCoord");
                                    y50Var.f33081s0 = GLES20.glGetUniformLocation(y50Var.m0, "preview");
                                    y50Var.f33079r0 = GLES20.glGetUniformLocation(y50Var.m0, "resolution");
                                    y50Var.f33083u0 = GLES20.glGetUniformLocation(y50Var.m0, "alpha");
                                    y50Var.f33074n0 = GLES20.glGetUniformLocation(y50Var.m0, "uMVPMatrix");
                                    y50Var.f33075o0 = GLES20.glGetUniformLocation(y50Var.m0, "uSTMatrix");
                                    y50Var.f33082t0 = GLES20.glGetUniformLocation(y50Var.m0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    y50Var.f33080s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void b(y50 y50Var, int i10, t50 t50Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = y50Var.H0.S) == null || !videoEditedInfo.needConvert()) && !y50Var.H0.f26315n.c())) {
            if (!y50Var.G0) {
                y50Var.G0 = true;
                AndroidUtilities.runOnUIThread(new yw(11, y50Var, t50Var));
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (y50Var.W && !y50Var.D0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            y50Var.X = i10;
            y50Var.Y = t50Var;
            y50Var.W = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            y50Var.e(true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        MediaCodec mediaCodec = y50Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                y50Var.E.release();
                y50Var.E = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        MediaCodec mediaCodec2 = y50Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                y50Var.F.release();
                y50Var.F = null;
                g(false);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        File file = y50Var.H0.f26308g0;
        if (file != null) {
            file.delete();
            y50Var.H0.f26308g0 = null;
        }
        MP4Builder mP4Builder = y50Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (y50Var.f33060c) {
                if (y50Var.f33056a.exists()) {
                    try {
                        y50Var.f33056a.delete();
                    } catch (Exception e13) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + y50Var.f33056a);
                        FileLog.e(e13);
                    }
                }
                if (!y50Var.f33058b.renameTo(y50Var.f33056a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(y50Var.f33058b, y50Var.f33056a);
                        y50Var.f33058b.delete();
                    } catch (IOException e14) {
                        FileLog.e(e14);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = y50Var.B0) != null) {
            dispatchQueue.cleanupQueue();
            y50Var.B0.recycle();
            y50Var.B0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(y50Var.H0.f26305f).cancelFileUpload(y50Var.f33056a.getAbsolutePath(), false);
            try {
                y50Var.f33058b.delete();
            } catch (Throwable unused) {
            }
            try {
                y50Var.f33056a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !y50Var.G0)) {
                y50Var.G0 = true;
                AndroidUtilities.runOnUIThread(new zm(y50Var, i10, t50Var, 7));
            }
            AndroidUtilities.runOnUIThread(new u50(y50Var, 2));
        }
        EGL14.eglDestroySurface(y50Var.f33080s, y50Var.f33089y);
        y50Var.f33089y = EGL14.EGL_NO_SURFACE;
        Surface surface = y50Var.f33078r;
        if (surface != null) {
            surface.release();
            y50Var.f33078r = null;
        }
        EGLDisplay eGLDisplay = y50Var.f33080s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(y50Var.f33080s, y50Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(y50Var.f33080s);
        }
        y50Var.f33080s = EGL14.EGL_NO_DISPLAY;
        y50Var.v = EGL14.EGL_NO_CONTEXT;
        y50Var.f33087x = null;
        y50Var.T.getClass();
        Looper.myLooper().quit();
        f50 f50Var = y50Var.f33088x0;
        if (f50Var != null) {
            f50Var.b();
            y50Var.f33088x0 = null;
        }
        AndroidUtilities.runOnUIThread(new u50(y50Var, 3));
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

    public final void c(m50 m50Var, long j3, boolean z10) {
        f60 f60Var = this.H0;
        int i10 = f60Var.f26305f;
        long j10 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(m50Var.toString(), f60Var.R, false, 1L, 33554432, false);
            this.h = false;
            if (z10) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = m50Var.toString();
                boolean z11 = f60Var.R;
                if (z10) {
                    j10 = m50Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z11, j3, j10);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = m50Var.toString();
        boolean z12 = f60Var.R;
        if (z10) {
            j10 = m50Var.length();
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
                            if (writeSampleData != 0 && !this.f33060c && this.H0.V0) {
                                c(this.f33056a, writeSampleData, false);
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
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.d, this.f33063e);
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
                            if (writeSampleData2 != 0 && !this.f33060c && this.H0.V0) {
                                c(this.f33056a, writeSampleData2, false);
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
                    int i10 = this.f33084v0 + 1;
                    this.f33084v0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f33084v0 = 0;
                    j3 = timestamp;
                }
                this.T.sendMessage(this.T.obtainMessage(2, (int) (j3 >> 32), (int) j3, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        f50 f50Var = this.f33088x0;
        if (f50Var != null) {
            f50Var.b();
            this.f33088x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f33080s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f33080s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f33080s);
                this.f33080s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f33087x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        d81 d81Var = new d81();
        f60 f60Var = this.H0;
        f60Var.T = d81Var;
        d81Var.J = new n2.c(this, 7);
        d81Var.V(f60Var.f26319q0);
        f60Var.T.D(Uri.fromFile(file), "other");
        f60Var.T.C();
        f60Var.T.O(true);
        f60Var.r();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = f60Var.W0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(f60Var.f26320r, s6.f30631b, 0), ObjectAnimator.ofFloat(f60Var.G, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f33080s, this.f33089y);
        this.f33089y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f33078r;
        if (surface != null) {
            surface.release();
            this.f33078r = null;
        }
        EGLDisplay eGLDisplay = this.f33080s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f33080s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f33080s);
        }
        this.f33080s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f33087x = null;
    }

    public final void i(int i10, t50 t50Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, t50Var));
        AndroidUtilities.runOnUIThread(new uh(8));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.d dVar = new g.d(1);
            dVar.f10038b = new WeakReference(this);
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
