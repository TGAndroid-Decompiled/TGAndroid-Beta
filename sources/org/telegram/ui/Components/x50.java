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
    public volatile boolean A0;
    public MediaCodec B;
    public MediaCodec C;
    public boolean C0;
    public int D;
    public boolean D0;
    public boolean E;
    public final y50 E0;
    public MediaCodec.BufferInfo F;
    public MediaCodec.BufferInfo G;
    public MP4Builder H;
    public long L;
    public boolean N;
    public volatile c2.v0 Q;
    public volatile boolean S;
    public volatile boolean T;
    public volatile int U;
    public volatile t50 V;
    public long W;
    public boolean X;
    public long Y;
    public m50 f30479a;
    public long f30480a0;
    public File f30481b;
    public long f30482b0;
    public boolean f30483c;
    public long f30484c0;
    public int d;
    public int e;
    public int f30487f;
    public boolean f30491i0;
    public int f30492j0;
    public int f30493k0;
    public int f30494l0;
    public int m0;
    public boolean f30495n;
    public int f30496n0;
    public int f30497o0;
    public int f30498p0;
    public int f30499q0;
    public Surface f30500r;
    public int f30501r0;
    public int f30503s0;
    public e50 f30505u0;
    public AudioRecord f30506v0;
    public EGLContext f30507w;
    public EGLConfig f30509x;
    public DispatchQueue f30512y0;
    public int f30513z0;
    public boolean h = true;
    public EGLDisplay f30502s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f30511y = EGL14.EGL_NO_SURFACE;
    public final ArrayList I = new ArrayList();
    public int J = -5;
    public int K = -5;
    public long M = -1;
    public long O = 0;
    public long P = -1;
    public final Object R = new Object();
    public long Z = -1;
    public long f30485d0 = -1;
    public long f30486e0 = -1;
    public long f30488f0 = -1;
    public long f30489g0 = 0;
    public long f30490h0 = -1;
    public Integer f30504t0 = 0;
    public final ArrayBlockingQueue f30508w0 = new ArrayBlockingQueue(10);
    public final ArrayList f30510x0 = new ArrayList();
    public final w50 B0 = new w50(this);

    public x50(y50 y50Var) {
        this.E0 = y50Var;
    }

    public static void a(x50 x50Var, boolean z4) {
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
            x50Var.f30508w0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                x50Var.f30508w0.add(new n50());
            }
            if (z4) {
                x50Var.f30485d0 = x50Var.f30480a0 + x50Var.f30482b0;
                x50Var.f30490h0 = x50Var.f30488f0 + x50Var.f30489g0;
                x50Var.N = true;
                j10 = 0;
            } else {
                x50Var.f30485d0 = -1L;
                x50Var.f30490h0 = -1L;
                j10 = 0;
                x50Var.O = 0L;
            }
            x50Var.P = -1L;
            x50Var.L = j10;
            x50Var.M = -1L;
            x50Var.f30486e0 = -1L;
            x50Var.Z = -1L;
            x50Var.f30480a0 = -1L;
            x50Var.f30484c0 = -1L;
            x50Var.f30488f0 = -1L;
            x50Var.X = false;
            x50Var.W = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i10);
            x50Var.f30506v0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + x50Var.f30506v0.getChannelCount() + " sample rate = " + x50Var.f30506v0.getSampleRate() + " bufferSize = " + i10);
            }
            x50Var.A0 = false;
            Thread thread = new Thread(x50Var.B0);
            thread.setPriority(10);
            thread.start();
            x50Var.G = new MediaCodec.BufferInfo();
            x50Var.F = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(x50Var.E0.f30871a).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            x50Var.C = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            x50Var.C.start();
            x50Var.B = MediaCodec.createEncoderByType("video/avc");
            x50Var.E = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", x50Var.d, x50Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", x50Var.f30487f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            x50Var.B.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            x50Var.f30500r = x50Var.B.createInputSurface();
            x50Var.B.start();
            if (!z4) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(x50Var.f30479a);
                x50Var.f30481b = x50Var.f30479a;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    x50Var.f30481b = file;
                    if (file.exists()) {
                        x50Var.f30481b.delete();
                    }
                    x50Var.f30483c = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(x50Var.f30481b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(x50Var.d, x50Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, x50Var.E0.J, false);
                x50Var.H = createMovie;
                y50 y50Var = x50Var.E0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                y50Var.N0 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new jh.f(24, x50Var, z4));
            if (x50Var.f30502s == EGL14.EGL_NO_DISPLAY) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                x50Var.f30502s = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        if (x50Var.v == EGL14.EGL_NO_CONTEXT) {
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            if (EGL14.eglChooseConfig(x50Var.f30502s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                i11 = 0;
                                x50Var.v = EGL14.eglCreateContext(x50Var.f30502s, eGLConfigArr[0], x50Var.f30507w, new int[]{12440, 2, 12344}, 0);
                                x50Var.f30509x = eGLConfigArr[0];
                            } else {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                        } else {
                            i11 = 0;
                        }
                        EGL14.eglQueryContext(x50Var.f30502s, x50Var.v, 12440, new int[1], i11);
                        if (x50Var.f30511y == EGL14.EGL_NO_SURFACE) {
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(x50Var.f30502s, x50Var.f30509x, x50Var.f30500r, new int[]{12344}, i11);
                            x50Var.f30511y = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null) {
                                if (!EGL14.eglMakeCurrent(x50Var.f30502s, eglCreateWindowSurface, eglCreateWindowSurface, x50Var.v)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                                GLES20.glBlendFunc(770, 771);
                                e50 e50Var = x50Var.f30505u0;
                                if (e50Var != null) {
                                    e50Var.b();
                                    x50Var.f30505u0 = null;
                                }
                                x50Var.f30505u0 = new e50(x50Var.d, x50Var.e);
                                y50 y50Var2 = x50Var.E0;
                                Size size = y50Var2.f30880f0[0];
                                if (!SharedConfig.deviceIsLow() && y50.b() && (size == null || Math.max(size.getHeight(), size.getWidth()) * 0.7f >= MessagesController.getInstance(y50Var2.f30871a).roundVideoSize)) {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                                } else {
                                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
                                }
                                int a2 = y50.a(x50Var.E0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int a10 = y50.a(x50Var.E0, 35632, str);
                                if (a2 != 0 && a10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    x50Var.f30492j0 = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, a2);
                                    GLES20.glAttachShader(x50Var.f30492j0, a10);
                                    GLES20.glLinkProgram(x50Var.f30492j0);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(x50Var.f30492j0, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        GLES20.glDeleteProgram(x50Var.f30492j0);
                                        x50Var.f30492j0 = 0;
                                        return;
                                    }
                                    x50Var.m0 = GLES20.glGetAttribLocation(x50Var.f30492j0, "aPosition");
                                    x50Var.f30496n0 = GLES20.glGetAttribLocation(x50Var.f30492j0, "aTextureCoord");
                                    x50Var.f30498p0 = GLES20.glGetUniformLocation(x50Var.f30492j0, "preview");
                                    x50Var.f30497o0 = GLES20.glGetUniformLocation(x50Var.f30492j0, "resolution");
                                    x50Var.f30501r0 = GLES20.glGetUniformLocation(x50Var.f30492j0, "alpha");
                                    x50Var.f30493k0 = GLES20.glGetUniformLocation(x50Var.f30492j0, "uMVPMatrix");
                                    x50Var.f30494l0 = GLES20.glGetUniformLocation(x50Var.f30492j0, "uSTMatrix");
                                    x50Var.f30499q0 = GLES20.glGetUniformLocation(x50Var.f30492j0, "texelSize");
                                    return;
                                }
                                return;
                            }
                            throw new RuntimeException("surface was null");
                        }
                        throw new IllegalStateException("surface already created");
                    }
                    x50Var.f30502s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new RuntimeException("EGL already set up");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(x50 x50Var, int i10, t50 t50Var) {
        boolean z4;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 == 1 && (((videoEditedInfo = x50Var.E0.K) == null || !videoEditedInfo.needConvert()) && !x50Var.E0.f30875c.c())) {
            if (!x50Var.D0) {
                x50Var.D0 = true;
                AndroidUtilities.runOnUIThread(new em(24, x50Var, t50Var));
            }
            z4 = false;
        } else {
            z4 = true;
        }
        if (x50Var.T && !x50Var.A0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            x50Var.U = i10;
            x50Var.V = t50Var;
            x50Var.T = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            x50Var.e(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaCodec mediaCodec = x50Var.B;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                x50Var.B.release();
                x50Var.B = null;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        MediaCodec mediaCodec2 = x50Var.C;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                x50Var.C.release();
                x50Var.C = null;
                g(false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        File file = x50Var.E0.V;
        if (file != null) {
            file.delete();
            x50Var.E0.V = null;
        }
        MP4Builder mP4Builder = x50Var.H;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (x50Var.f30483c) {
                if (x50Var.f30479a.exists()) {
                    try {
                        x50Var.f30479a.delete();
                    } catch (Exception e12) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + x50Var.f30479a);
                        FileLog.e(e12);
                    }
                }
                if (!x50Var.f30481b.renameTo(x50Var.f30479a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(x50Var.f30481b, x50Var.f30479a);
                        x50Var.f30481b.delete();
                    } catch (IOException e13) {
                        FileLog.e(e13);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = x50Var.f30512y0) != null) {
            dispatchQueue.cleanupQueue();
            x50Var.f30512y0.recycle();
            x50Var.f30512y0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(x50Var.E0.f30871a).cancelFileUpload(x50Var.f30479a.getAbsolutePath(), false);
            try {
                x50Var.f30481b.delete();
            } catch (Throwable unused) {
            }
            try {
                x50Var.f30479a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z4 && (i10 != 1 || !x50Var.D0)) {
                x50Var.D0 = true;
                AndroidUtilities.runOnUIThread(new ey(x50Var, i10, t50Var, 5));
            }
            AndroidUtilities.runOnUIThread(new u50(x50Var, 3));
        }
        EGL14.eglDestroySurface(x50Var.f30502s, x50Var.f30511y);
        x50Var.f30511y = EGL14.EGL_NO_SURFACE;
        Surface surface = x50Var.f30500r;
        if (surface != null) {
            surface.release();
            x50Var.f30500r = null;
        }
        EGLDisplay eGLDisplay = x50Var.f30502s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(x50Var.f30502s, x50Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(x50Var.f30502s);
        }
        x50Var.f30502s = EGL14.EGL_NO_DISPLAY;
        x50Var.v = EGL14.EGL_NO_CONTEXT;
        x50Var.f30509x = null;
        x50Var.Q.getClass();
        Looper.myLooper().quit();
        e50 e50Var = x50Var.f30505u0;
        if (e50Var != null) {
            e50Var.b();
            x50Var.f30505u0 = null;
        }
        AndroidUtilities.runOnUIThread(new u50(x50Var, 4));
    }

    public static void g(boolean z4) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !he0.f("android.permission.BLUETOOTH_CONNECT")) {
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
                        } catch (Exception e) {
                            FileLog.e(e);
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

    public final void c(m50 m50Var, long j10, boolean z4) {
        y50 y50Var = this.E0;
        int i10 = y50Var.f30871a;
        long j11 = 0;
        if (this.h) {
            FileLoader.getInstance(i10).uploadFile(m50Var.toString(), y50Var.J, false, 1L, 33554432, false);
            this.h = false;
            if (z4) {
                FileLoader fileLoader = FileLoader.getInstance(i10);
                String file = m50Var.toString();
                boolean z10 = y50Var.J;
                if (z4) {
                    j11 = m50Var.length();
                }
                fileLoader.checkUploadNewDataAvailable(file, z10, j10, j11);
                return;
            }
            return;
        }
        FileLoader fileLoader2 = FileLoader.getInstance(i10);
        String file2 = m50Var.toString();
        boolean z11 = y50Var.J;
        if (z4) {
            j11 = m50Var.length();
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
                            if (writeSampleData != 0 && !this.f30483c && this.E0.N0) {
                                c(this.f30479a, writeSampleData, false);
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
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.d, this.e);
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
                    throw new RuntimeException(kf.k0.k(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
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
                            if (writeSampleData2 != 0 && !this.f30483c && this.E0.N0) {
                                c(this.f30479a, writeSampleData2, false);
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
                        throw new RuntimeException(kf.k0.k(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
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
                    int i10 = this.f30503s0 + 1;
                    this.f30503s0 = i10;
                    if (i10 > 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f30503s0 = 0;
                    j10 = timestamp;
                }
                this.Q.sendMessage(this.Q.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        e50 e50Var = this.f30505u0;
        if (e50Var != null) {
            e50Var.b();
            this.f30505u0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f30502s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f30502s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f30502s);
                this.f30502s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f30509x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        i71 i71Var = new i71();
        y50 y50Var = this.E0;
        y50Var.L = i71Var;
        i71Var.G = new androidx.biometric.e0(this, 28);
        i71Var.V(y50Var.f30883i0);
        y50Var.L.D(Uri.fromFile(file), "other");
        y50Var.L.C();
        y50Var.L.O(true);
        y50Var.n();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = y50Var.O0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, property, 0.0f), ObjectAnimator.ofInt(y50Var.d, n6.f27196b, 0), ObjectAnimator.ofFloat(y50Var.f30899w, property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f30502s, this.f30511y);
        this.f30511y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f30500r;
        if (surface != null) {
            surface.release();
            this.f30500r = null;
        }
        EGLDisplay eGLDisplay = this.f30502s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f30502s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f30502s);
        }
        this.f30502s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f30509x = null;
    }

    public final void i(int i10, t50 t50Var) {
        this.Q.sendMessage(this.Q.obtainMessage(1, i10, 0, t50Var));
        AndroidUtilities.runOnUIThread(new u50(this, 5));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.R) {
            c2.v0 v0Var = new c2.v0(2);
            v0Var.f2040b = new WeakReference(this);
            this.Q = v0Var;
            this.S = true;
            this.R.notify();
        }
        Looper.loop();
        synchronized (this.R) {
            this.S = false;
        }
    }
}
