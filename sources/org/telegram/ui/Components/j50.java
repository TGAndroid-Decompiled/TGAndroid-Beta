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
import android.widget.ImageView;
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

public final class j50 implements Runnable {
    public MediaCodec A;
    public MediaCodec B;
    public boolean B0;
    public int C;
    public boolean C0;
    public boolean D;
    public final k50 D0;
    public MediaCodec.BufferInfo E;
    public MediaCodec.BufferInfo F;
    public MP4Builder G;
    public long K;
    public boolean M;
    public volatile c2.u0 P;
    public volatile boolean R;
    public volatile boolean S;
    public volatile int T;
    public volatile e50 U;
    public long V;
    public boolean W;
    public long X;
    public long Z;

    public x40 f29594a;

    public long f29595a0;

    public File f29596b;

    public long f29597b0;

    public boolean f29598c;
    public int d;

    public int f29601e;

    public int f29603f;

    public boolean f29606h0;

    public int f29607i0;

    public int f29608j0;

    public int f29609k0;

    public int f29610l0;
    public int m0;

    public boolean f29611n;

    public int f29612n0;

    public int f29613o0;

    public int f29614p0;

    public int f29615q0;

    public Surface f29616r;

    public int f29617r0;

    public q40 f29620t0;

    public AudioRecord f29621u0;

    public EGLContext f29623w;

    public EGLConfig f29625x;

    public DispatchQueue f29626x0;

    public int f29628y0;

    public volatile boolean f29629z0;
    public boolean h = true;

    public EGLDisplay f29618s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;

    public EGLSurface f29627y = EGL14.EGL_NO_SURFACE;
    public final ArrayList H = new ArrayList();
    public int I = -5;
    public int J = -5;
    public long L = -1;
    public long N = 0;
    public long O = -1;
    public final Object Q = new Object();
    public long Y = -1;

    public long f29599c0 = -1;

    public long f29600d0 = -1;

    public long f29602e0 = -1;

    public long f29604f0 = 0;

    public long f29605g0 = -1;

    public Integer f29619s0 = 0;

    public final ArrayBlockingQueue f29622v0 = new ArrayBlockingQueue(10);

    public final ArrayList f29624w0 = new ArrayList();
    public final i50 A0 = new i50(this);

    public j50(k50 k50Var) {
        this.D0 = k50Var;
    }

    public static void a(j50 j50Var, boolean z10) {
        long j10;
        int i10;
        g(true);
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 3584;
            }
            int i11 = 49152 < minBufferSize ? ((minBufferSize / 2048) + 1) * 4096 : 49152;
            j50Var.f29622v0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                j50Var.f29622v0.add(new y40());
            }
            if (z10) {
                j50Var.f29599c0 = j50Var.Z + j50Var.f29595a0;
                j50Var.f29605g0 = j50Var.f29602e0 + j50Var.f29604f0;
                j50Var.M = true;
                j10 = 0;
            } else {
                j50Var.f29599c0 = -1L;
                j50Var.f29605g0 = -1L;
                j10 = 0;
                j50Var.N = 0L;
            }
            j50Var.O = -1L;
            j50Var.K = j10;
            j50Var.L = -1L;
            j50Var.f29600d0 = -1L;
            j50Var.Y = -1L;
            j50Var.Z = -1L;
            j50Var.f29597b0 = -1L;
            j50Var.f29602e0 = -1L;
            j50Var.W = false;
            j50Var.V = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i11);
            j50Var.f29621u0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + j50Var.f29621u0.getChannelCount() + " sample rate = " + j50Var.f29621u0.getSampleRate() + " bufferSize = " + i11);
            }
            j50Var.f29629z0 = false;
            Thread thread = new Thread(j50Var.A0);
            thread.setPriority(10);
            thread.start();
            j50Var.F = new MediaCodec.BufferInfo();
            j50Var.E = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(j50Var.D0.f29967a).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            j50Var.B = mediaCodecCreateEncoderByType;
            mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            j50Var.B.start();
            j50Var.A = MediaCodec.createEncoderByType("video/avc");
            j50Var.D = true;
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", j50Var.d, j50Var.f29601e);
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger("bitrate", j50Var.f29603f);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
            j50Var.A.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            j50Var.f29616r = j50Var.A.createInputSurface();
            j50Var.A.start();
            if (!z10) {
                boolean zIsSdCardPath = ImageLoader.isSdCardPath(j50Var.f29594a);
                j50Var.f29596b = j50Var.f29594a;
                if (zIsSdCardPath) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                        j50Var.f29596b = file;
                        if (file.exists()) {
                            j50Var.f29596b.delete();
                        }
                        j50Var.f29598c = true;
                    } catch (Throwable th) {
                        FileLog.e(th);
                        j50Var.f29596b = j50Var.f29594a;
                        j50Var.f29598c = false;
                    }
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(j50Var.f29596b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(j50Var.d, j50Var.f29601e);
                MP4Builder mP4BuilderCreateMovie = new MP4Builder().createMovie(mp4Movie, j50Var.D0.I, false);
                j50Var.G = mP4BuilderCreateMovie;
                k50 k50Var = j50Var.D0;
                boolean zDeviceIsHigh = SharedConfig.deviceIsHigh();
                k50Var.M0 = zDeviceIsHigh;
                mP4BuilderCreateMovie.setAllowSyncFiles(zDeviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new f50(0, j50Var, z10));
            if (j50Var.f29618s != EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("EGL already set up");
            }
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            j50Var.f29618s = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                j50Var.f29618s = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            if (j50Var.v == EGL14.EGL_NO_CONTEXT) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(j50Var.f29618s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                i10 = 0;
                j50Var.v = EGL14.eglCreateContext(j50Var.f29618s, eGLConfigArr[0], j50Var.f29623w, new int[]{12440, 2, 12344}, 0);
                j50Var.f29625x = eGLConfigArr[0];
            } else {
                i10 = 0;
            }
            EGL14.eglQueryContext(j50Var.f29618s, j50Var.v, 12440, new int[1], i10);
            if (j50Var.f29627y != EGL14.EGL_NO_SURFACE) {
                throw new IllegalStateException("surface already created");
            }
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(j50Var.f29618s, j50Var.f29625x, j50Var.f29616r, new int[]{12344}, i10);
            j50Var.f29627y = eGLSurfaceEglCreateWindowSurface;
            if (eGLSurfaceEglCreateWindowSurface == null) {
                throw new RuntimeException("surface was null");
            }
            if (!EGL14.eglMakeCurrent(j50Var.f29618s, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, j50Var.v)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                throw new RuntimeException("eglMakeCurrent failed");
            }
            GLES20.glBlendFunc(770, 771);
            q40 q40Var = j50Var.f29620t0;
            if (q40Var != null) {
                q40Var.b();
                j50Var.f29620t0 = null;
            }
            j50Var.f29620t0 = new q40(j50Var.d, j50Var.f29601e);
            k50 k50Var2 = j50Var.D0;
            Size size = k50Var2.f29975e0[0];
            String str = (SharedConfig.deviceIsLow() || !k50.b() || (size != null && ((float) Math.max(size.getHeight(), size.getWidth())) * 0.7f < ((float) MessagesController.getInstance(k50Var2.f29967a).roundVideoSize))) ? "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n" : "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
            int iA = k50.a(j50Var.D0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
            int iA2 = k50.a(j50Var.D0, 35632, str);
            if (iA == 0 || iA2 == 0) {
                return;
            }
            int iGlCreateProgram = GLES20.glCreateProgram();
            j50Var.f29607i0 = iGlCreateProgram;
            GLES20.glAttachShader(iGlCreateProgram, iA);
            GLES20.glAttachShader(j50Var.f29607i0, iA2);
            GLES20.glLinkProgram(j50Var.f29607i0);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(j50Var.f29607i0, 35714, iArr2, 0);
            if (iArr2[0] == 0) {
                GLES20.glDeleteProgram(j50Var.f29607i0);
                j50Var.f29607i0 = 0;
                return;
            }
            j50Var.f29610l0 = GLES20.glGetAttribLocation(j50Var.f29607i0, "aPosition");
            j50Var.m0 = GLES20.glGetAttribLocation(j50Var.f29607i0, "aTextureCoord");
            j50Var.f29613o0 = GLES20.glGetUniformLocation(j50Var.f29607i0, "preview");
            j50Var.f29612n0 = GLES20.glGetUniformLocation(j50Var.f29607i0, "resolution");
            j50Var.f29615q0 = GLES20.glGetUniformLocation(j50Var.f29607i0, "alpha");
            j50Var.f29608j0 = GLES20.glGetUniformLocation(j50Var.f29607i0, "uMVPMatrix");
            j50Var.f29609k0 = GLES20.glGetUniformLocation(j50Var.f29607i0, "uSTMatrix");
            j50Var.f29614p0 = GLES20.glGetUniformLocation(j50Var.f29607i0, "texelSize");
        } catch (Exception e9) {
            throw new RuntimeException(e9);
        }
    }

    public static void b(j50 j50Var, int i10, e50 e50Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 != 1 || (((videoEditedInfo = j50Var.D0.J) != null && videoEditedInfo.needConvert()) || j50Var.D0.f29971c.c())) {
            z10 = true;
        } else {
            if (!j50Var.C0) {
                j50Var.C0 = true;
                AndroidUtilities.runOnUIThread(new xq(19, j50Var, e50Var));
            }
            z10 = false;
        }
        if (j50Var.S && !j50Var.f29629z0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            j50Var.T = i10;
            j50Var.U = e50Var;
            j50Var.S = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            j50Var.e(true);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        MediaCodec mediaCodec = j50Var.A;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                j50Var.A.release();
                j50Var.A = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        MediaCodec mediaCodec2 = j50Var.B;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                j50Var.B.release();
                j50Var.B = null;
                g(false);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        File file = j50Var.D0.U;
        if (file != null) {
            file.delete();
            j50Var.D0.U = null;
        }
        MP4Builder mP4Builder = j50Var.G;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (j50Var.f29598c) {
                if (j50Var.f29594a.exists()) {
                    try {
                        j50Var.f29594a.delete();
                    } catch (Exception e13) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + j50Var.f29594a);
                        FileLog.e(e13);
                    }
                }
                if (!j50Var.f29596b.renameTo(j50Var.f29594a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(j50Var.f29596b, j50Var.f29594a);
                        j50Var.f29596b.delete();
                    } catch (IOException e14) {
                        FileLog.e(e14);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = j50Var.f29626x0) != null) {
            dispatchQueue.cleanupQueue();
            j50Var.f29626x0.recycle();
            j50Var.f29626x0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(j50Var.D0.f29967a).cancelFileUpload(j50Var.f29594a.getAbsolutePath(), false);
            try {
                j50Var.f29596b.delete();
            } catch (Throwable unused) {
            }
            try {
                j50Var.f29594a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !j50Var.C0)) {
                j50Var.C0 = true;
                AndroidUtilities.runOnUIThread(new km(j50Var, i10, e50Var, 7));
            }
            AndroidUtilities.runOnUIThread(new g50(j50Var, 3));
        }
        EGL14.eglDestroySurface(j50Var.f29618s, j50Var.f29627y);
        j50Var.f29627y = EGL14.EGL_NO_SURFACE;
        Surface surface = j50Var.f29616r;
        if (surface != null) {
            surface.release();
            j50Var.f29616r = null;
        }
        EGLDisplay eGLDisplay = j50Var.f29618s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(j50Var.f29618s, j50Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(j50Var.f29618s);
        }
        j50Var.f29618s = EGL14.EGL_NO_DISPLAY;
        j50Var.v = EGL14.EGL_NO_CONTEXT;
        j50Var.f29625x = null;
        j50Var.P.getClass();
        Looper.myLooper().quit();
        q40 q40Var = j50Var.f29620t0;
        if (q40Var != null) {
            q40Var.b();
            j50Var.f29620t0 = null;
        }
        AndroidUtilities.runOnUIThread(new g50(j50Var, 4));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !pd0.f("android.permission.BLUETOOTH_CONNECT")) {
            SharedConfig.recordViaSco = false;
            SharedConfig.saveConfig();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && SharedConfig.recordViaSco) && z10) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                if (defaultAdapter.getProfileConnectionState(1) != 2) {
                    if (z10) {
                        return;
                    }
                }
            } catch (SecurityException unused) {
                return;
            } catch (Throwable th) {
                FileLog.e(th);
                if (z10) {
                    return;
                }
                try {
                    if (audioManager.isBluetoothScoOn()) {
                        audioManager.stopBluetoothSco();
                        return;
                    }
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            }
        } else if (z10) {
            return;
        }
        if (z10 && !audioManager.isBluetoothScoOn()) {
            audioManager.startBluetoothSco();
        } else {
            if (z10 || !audioManager.isBluetoothScoOn()) {
                return;
            }
            audioManager.stopBluetoothSco();
        }
    }

    public final void c(x40 x40Var, long j10, boolean z10) {
        k50 k50Var = this.D0;
        int i10 = k50Var.f29967a;
        if (!this.h) {
            FileLoader.getInstance(i10).checkUploadNewDataAvailable(x40Var.toString(), k50Var.I, j10, z10 ? x40Var.length() : 0L);
            return;
        }
        FileLoader.getInstance(i10).uploadFile(x40Var.toString(), k50Var.I, false, 1L, 33554432, false);
        this.h = false;
        if (z10) {
            FileLoader.getInstance(i10).checkUploadNewDataAvailable(x40Var.toString(), k50Var.I, j10, z10 ? x40Var.length() : 0L);
        }
    }

    public final void e(boolean z10) {
        ByteBuffer byteBufferAllocate;
        ByteBuffer byteBufferAllocate2;
        if (z10) {
            this.A.signalEndOfInputStream();
        }
        while (true) {
            int iDequeueOutputBuffer = this.A.dequeueOutputBuffer(this.E, 10000L);
            byte b10 = 1;
            if (iDequeueOutputBuffer != -1) {
                if (iDequeueOutputBuffer != -3) {
                    if (iDequeueOutputBuffer != -2) {
                        if (iDequeueOutputBuffer >= 0) {
                            ByteBuffer outputBuffer = this.A.getOutputBuffer(iDequeueOutputBuffer);
                            if (outputBuffer == null) {
                                throw new RuntimeException(i0.a.l(iDequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                            }
                            MediaCodec.BufferInfo bufferInfo = this.E;
                            int i10 = bufferInfo.size;
                            if (i10 > 1) {
                                int i11 = bufferInfo.flags;
                                if ((i11 & 2) == 0) {
                                    int i12 = this.C;
                                    if (i12 != 0 && (i11 & 1) != 0) {
                                        bufferInfo.offset += i12;
                                        bufferInfo.size = i10 - i12;
                                    }
                                    if (this.D && (i11 & 1) != 0) {
                                        if (bufferInfo.size > 100) {
                                            outputBuffer.position(bufferInfo.offset);
                                            byte[] bArr = new byte[100];
                                            outputBuffer.get(bArr);
                                            int i13 = 0;
                                            for (int i14 = 0; i14 < 96; i14++) {
                                                if (bArr[i14] == 0 && bArr[i14 + 1] == 0 && bArr[i14 + 2] == 0 && bArr[i14 + 3] == 1 && (i13 = i13 + 1) > 1) {
                                                    MediaCodec.BufferInfo bufferInfo2 = this.E;
                                                    bufferInfo2.offset += i14;
                                                    bufferInfo2.size -= i14;
                                                    break;
                                                }
                                            }
                                        }
                                        this.D = false;
                                    }
                                    long jWriteSampleData = this.G.writeSampleData(this.I, outputBuffer, this.E, true);
                                    if (jWriteSampleData != 0 && !this.f29598c && this.D0.M0) {
                                        c(this.f29594a, jWriteSampleData, false);
                                    }
                                } else if (this.I == -5) {
                                    byte[] bArr2 = new byte[i10];
                                    outputBuffer.limit(bufferInfo.offset + i10);
                                    outputBuffer.position(this.E.offset);
                                    outputBuffer.get(bArr2);
                                    int i15 = this.E.size - 1;
                                    while (true) {
                                        if (i15 < 0 || i15 <= 3) {
                                            byteBufferAllocate = null;
                                            byteBufferAllocate2 = null;
                                            break;
                                        }
                                        if (bArr2[i15] == b10 && bArr2[i15 - 1] == 0 && bArr2[i15 - 2] == 0) {
                                            int i16 = i15 - 3;
                                            if (bArr2[i16] == 0) {
                                                byteBufferAllocate = ByteBuffer.allocate(i16);
                                                byteBufferAllocate2 = ByteBuffer.allocate(this.E.size - i16);
                                                byteBufferAllocate.put(bArr2, 0, i16).position(0);
                                                byteBufferAllocate2.put(bArr2, i16, this.E.size - i16).position(0);
                                                break;
                                            }
                                        }
                                        i15--;
                                        b10 = 1;
                                    }
                                    MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.d, this.f29601e);
                                    if (byteBufferAllocate != null && byteBufferAllocate2 != null) {
                                        mediaFormatCreateVideoFormat.setByteBuffer("csd-0", byteBufferAllocate);
                                        mediaFormatCreateVideoFormat.setByteBuffer("csd-1", byteBufferAllocate2);
                                    }
                                    this.I = this.G.addTrack(mediaFormatCreateVideoFormat, false);
                                }
                            }
                            this.A.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            if ((this.E.flags & 4) != 0) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        MediaFormat outputFormat = this.A.getOutputFormat();
                        if (this.I == -5) {
                            this.I = this.G.addTrack(outputFormat, false);
                            if (outputFormat.containsKey("prepend-sps-pps-to-idr-frames") && outputFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                                this.C = outputFormat.getByteBuffer("csd-1").limit() + outputFormat.getByteBuffer("csd-0").limit();
                            }
                        }
                    }
                } else {
                    continue;
                }
            } else {
                if (!z10 || this.f29629z0) {
                    break;
                }
            }
        }
        while (true) {
            int iDequeueOutputBuffer2 = this.B.dequeueOutputBuffer(this.F, 0L);
            if (iDequeueOutputBuffer2 == -1) {
                if (!z10) {
                    return;
                }
                if ((!this.S && this.T == 0) || this.f29629z0) {
                    return;
                }
            } else if (iDequeueOutputBuffer2 != -3) {
                if (iDequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat2 = this.B.getOutputFormat();
                    if (this.J == -5) {
                        this.J = this.G.addTrack(outputFormat2, true);
                    }
                } else if (iDequeueOutputBuffer2 < 0) {
                    continue;
                } else {
                    ByteBuffer outputBuffer2 = this.B.getOutputBuffer(iDequeueOutputBuffer2);
                    if (outputBuffer2 == null) {
                        throw new RuntimeException(i0.a.l(iDequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
                    }
                    MediaCodec.BufferInfo bufferInfo3 = this.F;
                    if ((bufferInfo3.flags & 2) != 0) {
                        bufferInfo3.size = 0;
                    }
                    if (bufferInfo3.size != 0) {
                        long jWriteSampleData2 = this.G.writeSampleData(this.J, outputBuffer2, bufferInfo3, false);
                        if (jWriteSampleData2 != 0 && !this.f29598c && this.D0.M0) {
                            c(this.f29594a, jWriteSampleData2, false);
                        }
                        MediaCodec mediaCodec = this.B;
                        if (mediaCodec != null) {
                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer2, false);
                        }
                    } else {
                        MediaCodec mediaCodec2 = this.B;
                        if (mediaCodec2 != null) {
                            mediaCodec2.releaseOutputBuffer(iDequeueOutputBuffer2, false);
                        }
                    }
                    if ((this.F.flags & 4) != 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void f(SurfaceTexture surfaceTexture, Integer num, long j10) {
        synchronized (this.Q) {
            try {
                if (this.R) {
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp == 0) {
                        int i10 = this.f29617r0 + 1;
                        this.f29617r0 = i10;
                        if (i10 <= 1) {
                            return;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        this.f29617r0 = 0;
                        j10 = timestamp;
                    }
                    this.P.sendMessage(this.P.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        q40 q40Var = this.f29620t0;
        if (q40Var != null) {
            q40Var.b();
            this.f29620t0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.f29618s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f29618s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f29618s);
                this.f29618s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.f29625x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        m61 m61Var = new m61();
        k50 k50Var = this.D0;
        k50Var.K = m61Var;
        m61Var.F = new m5.o(this, 10);
        m61Var.W(k50Var.f29979h0);
        k50Var.K.E(Uri.fromFile(file), "other");
        k50Var.K.D();
        k50Var.K.P(true);
        k50Var.n();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = k50Var.N0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(k50Var.d, m6.f30579b, 0), ObjectAnimator.ofFloat(k50Var.f29996w, (Property<ImageView, Float>) property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.f29618s, this.f29627y);
        this.f29627y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f29616r;
        if (surface != null) {
            surface.release();
            this.f29616r = null;
        }
        EGLDisplay eGLDisplay = this.f29618s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f29618s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f29618s);
        }
        this.f29618s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.f29625x = null;
    }

    public final void i(int i10, e50 e50Var) {
        this.P.sendMessage(this.P.obtainMessage(1, i10, 0, e50Var));
        AndroidUtilities.runOnUIThread(new g50(this, 5));
    }

    @Override
    public final void run() {
        Looper.prepare();
        synchronized (this.Q) {
            c2.u0 u0Var = new c2.u0(2);
            u0Var.f2352b = new WeakReference(this);
            this.P = u0Var;
            this.R = true;
            this.Q.notify();
        }
        Looper.loop();
        synchronized (this.Q) {
            this.R = false;
        }
    }
}
