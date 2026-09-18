package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AutoDeleteMediaTask;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLRPC;
public final class b60 extends f60 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] f22827f1 = {285904780, -1394191079};
    public final float[] A0;
    public FloatBuffer B0;
    public FloatBuffer C0;
    public FloatBuffer D0;
    public final ImageView E;
    public float E0;
    public float F;
    public float F0;
    public CameraInfo G;
    public Size G0;
    public boolean H;
    public boolean H0;
    public volatile boolean I;
    public final View I0;
    public AnimatorSet J;
    public boolean J0;
    public TLRPC.InputFile K;
    public float K0;
    public TLRPC.InputEncryptedFile L;
    public float L0;
    public byte[] M;
    public boolean M0;
    public byte[] N;
    public boolean N0;
    public long O;
    public int O0;
    public final boolean P;
    public int P0;
    public VideoEditedInfo Q;
    public int Q0;
    public u71 R;
    public boolean R0;
    public Bitmap S;
    public final org.telegram.ui.ActionBar.e6 S0;
    public final int T;
    public boolean T0;
    public volatile boolean U;
    public final LinearLayout U0;
    public final int[] V;
    public final int V0;
    public final int[] W;
    public Boolean W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public final int[] f22828a0;
    public Timer f22829a1;
    public float f22830b0;
    public u50 f22831b1;
    public AnimatorSet f22832c0;
    public Bitmap f22833c1;
    public final int d;
    public i50 f22834d0;
    public volatile int f22835d1;
    public final g50 e;
    public File f22836e0;
    public ValueAnimator f22837e1;
    public final n50 f22838f;
    public long f22839f0;
    public long f22840g0;
    public final f50 h;
    public boolean f22841h0;
    public long f22842i0;
    public boolean f22843j0;
    public m50 f22844k0;
    public final Size[] f22845l0;
    public Size m0;
    public final RectF f22846n;
    public final Size f22847n0;
    public TextureView f22848o0;
    public final org.telegram.ui.jl f22849p0;
    public final boolean f22850q0;
    public final ci.w2 f22851r;
    public CameraSession f22852r0;
    public final ci.w2 f22853s;
    public boolean f22854s0;
    public final Camera2Session[] f22855t0;
    public Camera2Session f22856u0;
    public final ci.y2 v;
    public boolean f22857v0;
    public ij0 f22858w;
    public float f22859w0;
    public ij0 f22860x;
    public float f22861x0;
    public ij0 f22862y;
    public final float[] f22863y0;
    public final float[] f22864z0;

    public b60(Context context, n50 n50Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        Size size;
        float f7;
        int i10 = UserConfig.selectedAccount;
        this.d = i10;
        this.H = true;
        this.V = new int[2];
        this.W = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f22828a0 = new int[1];
        this.f22830b0 = 1.0f;
        this.f22845l0 = new Size[2];
        if (SharedConfig.roundCamera16to9) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f22847n0 = size;
        this.f22850q0 = SharedConfig.isUsingCamera2(i10);
        this.f22855t0 = new Camera2Session[2];
        this.f22863y0 = new float[16];
        this.f22864z0 = new float[16];
        this.A0 = new float[16];
        if (z10) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        this.V0 = AndroidUtilities.dp(f7);
        this.S0 = e6Var;
        this.I0 = n50Var.getFragmentView();
        setWillNotDraw(false);
        this.f22838f = n50Var;
        this.T = n50Var.getClassGuid();
        this.P = n50Var.v();
        f50 f50Var = new f50(this, 0);
        this.h = f50Var;
        f50Var.setStyle(Paint.Style.STROKE);
        f50Var.setStrokeCap(Paint.Cap.ROUND);
        f50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        f50Var.setColor(-1);
        this.f22846n = new RectF();
        ci.y2 y2Var = new ci.y2(getContext(), null, this, null);
        this.v = y2Var;
        y2Var.f5817o = 0.5f;
        y2Var.f5816n = ci.y2.f(0.5f);
        y2Var.g();
        addView(y2Var.f5807b, w7.y5.e(-1, -1, 119));
        g50 g50Var = new g50(this, context);
        this.e = g50Var;
        g50Var.setOutlineProvider(new ch.b(this, 2));
        g50Var.setClipToOutline(true);
        g50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(g50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(y2Var.f5808c, w7.y5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.y5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f22851r = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.y5.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final b60 f23204b;

            {
                this.f23204b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b60 b60Var = this.f23204b;
                        if (b60Var.I) {
                            if (b60Var.f22850q0) {
                                Camera2Session camera2Session = b60Var.f22856u0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = b60Var.f22852r0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (b60Var.f22844k0 != null) {
                                if (!b60Var.f22854s0) {
                                    b60Var.u();
                                }
                                ij0 ij0Var = b60Var.f22862y;
                                if (ij0Var != null) {
                                    ij0Var.M(0);
                                    b60Var.f22862y.start();
                                }
                                b60Var.H0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(qr.h);
                                boolean[] zArr = new boolean[1];
                                d50 d50Var = new d50(b60Var, 0);
                                g50 g50Var2 = b60Var.e;
                                g50Var2.setCameraDistance(g50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.jl jlVar = b60Var.f22849p0;
                                jlVar.setCameraDistance(jlVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new h50(b60Var, zArr, d50Var));
                                ofFloat.addListener(new ai.y4(b60Var, zArr, d50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        b60 b60Var2 = this.f23204b;
                        b60Var2.X0 = true ^ b60Var2.X0;
                        b60Var2.v();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.f22853s = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, w7.y5.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final b60 f23204b;

            {
                this.f23204b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b60 b60Var = this.f23204b;
                        if (b60Var.I) {
                            if (b60Var.f22850q0) {
                                Camera2Session camera2Session = b60Var.f22856u0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = b60Var.f22852r0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (b60Var.f22844k0 != null) {
                                if (!b60Var.f22854s0) {
                                    b60Var.u();
                                }
                                ij0 ij0Var = b60Var.f22862y;
                                if (ij0Var != null) {
                                    ij0Var.M(0);
                                    b60Var.f22862y.start();
                                }
                                b60Var.H0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(qr.h);
                                boolean[] zArr = new boolean[1];
                                d50 d50Var = new d50(b60Var, 0);
                                g50 g50Var2 = b60Var.e;
                                g50Var2.setCameraDistance(g50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.jl jlVar = b60Var.f22849p0;
                                jlVar.setCameraDistance(jlVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new h50(b60Var, zArr, d50Var));
                                ofFloat.addListener(new ai.y4(b60Var, zArr, d50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        b60 b60Var2 = this.f23204b;
                        b60Var2.X0 = true ^ b60Var2.X0;
                        b60Var2.v();
                        return;
                }
            }
        });
        v();
        if (!z10) {
            y2Var.a(imageView);
            y2Var.a(imageView2);
        } else if (!e6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.E = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.y5.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.k(-16777216, 40));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, getContext(), paint);
        this.f22849p0 = jlVar;
        int i12 = AndroidUtilities.roundPlayingMessageSize;
        addView(jlVar, new FrameLayout.LayoutParams(i12, i12, 17));
        this.Z0 = false;
        setVisibility(4);
    }

    public static int k(b60 b60Var, int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e(GLES20.glGetShaderInfoLog(glCreateShader));
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static boolean l() {
        if (!SharedConfig.bigCameraForRound && !SharedConfig.deviceIsAboveAverage() && Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) != 2) {
            int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
            for (int i10 = 0; i10 < 2; i10++) {
                if (f22827f1[i10] == hashCode) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean m() {
        if (Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i10 = 0; i10 < 2; i10++) {
            if (f22827f1[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        t();
        u71 u71Var = this.R;
        if (u71Var != null) {
            u71Var.H();
            this.R = null;
        }
        if (this.f22848o0 == null) {
            return;
        }
        this.f22843j0 = true;
        this.f22841h0 = false;
        this.X0 = false;
        v();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.d);
        int i11 = NotificationCenter.recordStopped;
        Integer valueOf = Integer.valueOf(this.T);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, valueOf, Integer.valueOf(i10));
        if (this.f22844k0 != null) {
            q();
            this.f22844k0.b(0L, 0, true, 0, 0);
            this.f22844k0 = null;
        } else {
            u50 u50Var = this.f22831b1;
            if (u50Var != null) {
                u50Var.i(0, new p50(0L, 0, 0, true, 0L));
            }
        }
        if (this.f22834d0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.f22834d0.delete();
            AutoDeleteMediaTask.unlockFile(this.f22834d0);
            this.f22834d0 = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        r(false, false);
        invalidate();
    }

    @Override
    public final void b(float f7, int i10) {
        u71 u71Var = this.R;
        if (u71Var != null) {
            if (i10 == 0) {
                s();
                this.R.C();
            } else if (i10 == 1) {
                t();
                this.R.B();
            } else if (i10 == 2) {
                u71Var.L(f7 * ((float) u71Var.p()), false);
            }
        }
    }

    @Override
    public final void d(boolean z10) {
        CountDownLatch countDownLatch;
        ViewGroup viewGroup;
        if (this.f22850q0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.f22855t0;
                if (i10 >= camera2SessionArr.length) {
                    break;
                }
                Camera2Session camera2Session = camera2SessionArr[i10];
                if (camera2Session != null) {
                    camera2Session.destroy(z10);
                    camera2SessionArr[i10] = null;
                }
                i10++;
            }
        } else {
            CameraSession cameraSession = this.f22852r0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f22852r0;
                if (!z10) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
        g50 g50Var = this.e;
        g50Var.setTranslationX(0.0f);
        this.f22849p0.setTranslationX(0.0f);
        this.f22861x0 = 0.0f;
        w();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.f22848o0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f22848o0);
        }
        this.f22848o0 = null;
        g50Var.setImageReceiver(null);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            i50 i50Var = this.f22834d0;
            if (i50Var != null && i50Var.getAbsolutePath().equals(str)) {
                this.K = (TLRPC.InputFile) objArr[1];
                this.L = (TLRPC.InputEncryptedFile) objArr[2];
                this.O = ((Long) objArr[5]).longValue();
                if (this.L != null) {
                    this.M = (byte[]) objArr[3];
                    this.N = (byte[]) objArr[4];
                }
            }
        }
    }

    @Override
    public final boolean e() {
        return !this.f22841h0;
    }

    @Override
    public final void f(float f7) {
        this.f22859w0 = f7 / 2.0f;
        w();
    }

    @Override
    public final void g(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        boolean z11;
        int i13;
        char c10;
        int i14;
        long j11;
        if (this.f22848o0 != null) {
            t();
            u71 u71Var = this.R;
            if (u71Var != null) {
                u71Var.H();
                this.R = null;
            }
            int i15 = 4;
            int i16 = this.d;
            if (i10 == 4) {
                u50 u50Var = this.f22831b1;
                if (u50Var != null && this.f22842i0 > 800) {
                    u50Var.i(1, new p50(j3, i11, i12, z10, j10));
                    return;
                }
                if (BuildVars.DEBUG_VERSION && !this.f22834d0.exists()) {
                    FileLog.e(new RuntimeException("file not found :( round video"));
                }
                if (this.Q == null) {
                    VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                    this.Q = videoEditedInfo;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                }
                if (this.Q.needConvert()) {
                    this.K = null;
                    this.L = null;
                    this.M = null;
                    this.N = null;
                    VideoEditedInfo videoEditedInfo2 = this.Q;
                    long j12 = videoEditedInfo2.estimatedDuration;
                    double d = j12;
                    long j13 = videoEditedInfo2.startTime;
                    if (j13 >= 0) {
                        j11 = 0;
                    } else {
                        j13 = 0;
                        j11 = 0;
                    }
                    long j14 = videoEditedInfo2.endTime;
                    if (j14 >= j11) {
                        j12 = j14;
                    }
                    long j15 = j12 - j13;
                    videoEditedInfo2.estimatedDuration = j15;
                    videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j15 / d) * this.O));
                    VideoEditedInfo videoEditedInfo3 = this.Q;
                    videoEditedInfo3.bitrate = 1000000;
                    long j16 = videoEditedInfo3.startTime;
                    if (j16 > j11) {
                        videoEditedInfo3.startTime = j16 * 1000;
                    }
                    long j17 = videoEditedInfo3.endTime;
                    if (j17 > j11) {
                        videoEditedInfo3.endTime = j17 * 1000;
                    }
                    FileLoader.getInstance(i16).cancelFileUpload(this.f22834d0.getAbsolutePath(), false);
                } else {
                    this.Q.estimatedSize = Math.max(1L, this.O);
                }
                VideoEditedInfo videoEditedInfo4 = this.Q;
                videoEditedInfo4.file = this.K;
                videoEditedInfo4.encryptedFile = this.L;
                videoEditedInfo4.key = this.M;
                videoEditedInfo4.iv = this.N;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.f22834d0.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = i12;
                photoEntry.effectId = j3;
                this.f22838f.q(photoEntry, this.Q, z10, i11, 0, false, j10);
                if (i11 != 0) {
                    r(false, false);
                }
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            if (this.f22842i0 < 800) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f22843j0 = z11;
            this.f22841h0 = false;
            this.X0 = false;
            v();
            if (!this.f22843j0) {
                if (i10 == 3) {
                    i15 = 2;
                } else {
                    i15 = 5;
                }
            }
            m50 m50Var = this.f22844k0;
            int i17 = this.T;
            if (m50Var != null) {
                c10 = 1;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i17), Integer.valueOf(i15));
                if (this.f22843j0) {
                    i14 = 0;
                } else if (i10 == 3) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                q();
                i13 = i17;
                this.f22844k0.b(j3, i14, z10, i11, i12);
                this.f22844k0 = null;
            } else {
                i13 = i17;
                c10 = 1;
            }
            if (this.f22843j0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i16);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.f22842i0);
                Object[] objArr = new Object[3];
                objArr[0] = valueOf;
                objArr[c10] = Boolean.TRUE;
                objArr[2] = valueOf2;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i18, objArr);
                r(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
            }
        }
    }

    @Override
    public View getButtonsLayout() {
        return this.U0;
    }

    @Override
    public RectF getCameraRect() {
        g50 g50Var = this.e;
        int[] iArr = this.V;
        g50Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], g50Var.getWidth() + i10, g50Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.E;
    }

    @Override
    public Paint getPaint() {
        return this.h;
    }

    @Override
    public TextureView getTextureView() {
        return this.f22848o0;
    }

    @Override
    public final void h(ah.c cVar, org.telegram.ui.ij ijVar) {
        View view = this.U0;
        ch.d c10 = cVar.c(view, ijVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void i(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.f22848o0 == null) {
            if (this.f22862y == null) {
                int i10 = R.raw.roundcamera_flip;
                int i11 = this.V0;
                ij0 ij0Var = new ij0(i10, i11, i11);
                this.f22862y = ij0Var;
                ij0Var.M(0);
                this.f22862y.setCallback(this.f22851r);
            }
            this.f22851r.setImageDrawable(this.f22862y);
            this.f22849p0.setAlpha(1.0f);
            this.f22849p0.invalidate();
            if (this.S == null) {
                try {
                    this.S = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.S;
            if (bitmap != null) {
                this.f22849p0.setImageBitmap(bitmap);
            } else {
                this.f22849p0.setImageResource(R.drawable.icplaceholder);
            }
            this.I = false;
            this.G = null;
            if (!z10) {
                if (!this.f22850q0) {
                    this.H = true;
                }
                v();
                this.f22842i0 = 0L;
                this.F = 0.0f;
            }
            this.f22843j0 = false;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.f22857v0 = true;
            if (p()) {
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    if (!MediaController.getInstance().getPlayingMessageObject().isVideo() && !MediaController.getInstance().getPlayingMessageObject().isRoundVideo()) {
                        if (SharedConfig.pauseMusicOnRecord) {
                            MediaController.getInstance().pauseByRewind();
                        }
                    } else {
                        MediaController.getInstance().cleanupPlayer(true, true);
                    }
                }
                if (!z10) {
                    File directory = FileLoader.getDirectory(3);
                    this.f22834d0 = new File(directory, System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
                }
                SharedConfig.saveConfig();
                AutoDeleteMediaTask.lockFile(this.f22834d0);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera show round camera " + this.f22834d0.getAbsolutePath());
                }
                if (this.f22850q0) {
                    Context context = getContext();
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z13 = globalMainSettings.getBoolean("rounddual_available", z11);
                    this.f22854s0 = z13;
                    if (z13) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            Camera2Session[] camera2SessionArr = this.f22855t0;
                            if (camera2SessionArr[i12] == null) {
                                if (i12 == 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                camera2SessionArr[i12] = Camera2Session.create(z12, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                                Camera2Session camera2Session = this.f22855t0[i12];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.f22845l0[i12] = new Size(this.f22855t0[i12].getPreviewWidth(), this.f22855t0[i12].getPreviewHeight());
                                }
                            }
                        }
                        v();
                        Camera2Session[] camera2SessionArr2 = this.f22855t0;
                        boolean z14 = this.H;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z14 ? 1 : 0];
                        this.f22856u0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z14 ? 1 : 0] == null) {
                            this.f22854s0 = false;
                        }
                        if (camera2Session2 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.f22855t0;
                        boolean z15 = this.H;
                        int i13 = !z15 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z15, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                        camera2SessionArr3[i13] = create;
                        this.f22856u0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.f22845l0[0] = new Size(this.f22856u0.getPreviewWidth(), this.f22856u0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f22848o0 = textureView;
                textureView.setSurfaceTextureListener(new ki.c(this, 1));
                this.e.addView(this.f22848o0, w7.y5.c(-1.0f, -1));
                this.R0 = true;
                this.Z0 = z10;
                setVisibility(0);
                r(true, z10);
                MediaController.getInstance().requestRecordAudioFocus(true);
            }
        }
    }

    @Override
    public final void j() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (this.f22841h0) {
            if (this.f22842i0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f22843j0 = z10;
            this.f22841h0 = false;
            v();
            if (this.f22844k0 != null) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.d);
                int i13 = NotificationCenter.recordStopped;
                Integer valueOf = Integer.valueOf(this.T);
                if (this.f22843j0) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, valueOf, Integer.valueOf(i10));
                q();
                m50 m50Var = this.f22844k0;
                boolean z11 = this.f22843j0;
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                if (z11) {
                    i12 = 0;
                } else {
                    i12 = -2;
                }
                m50Var.b(0L, i11, true, 0, i12);
                this.f22844k0 = null;
            }
            if (this.f22843j0) {
                NotificationCenter.getInstance(this.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.T), Boolean.TRUE, Integer.valueOf((int) this.f22842i0));
                r(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            u50 u50Var = this.f22831b1;
            u50Var.T.sendMessage(u50Var.T.obtainMessage(4));
            return;
        }
        u50 u50Var2 = this.f22831b1;
        if (u50Var2 != null) {
            u50Var2.T.sendMessage(u50Var2.T.obtainMessage(5));
            d(false);
            u71 u71Var = this.R;
            if (u71Var != null) {
                u71Var.H();
                this.R = null;
            }
            i(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.lockOrientation(this.f22838f.getParentActivity());
            invalidate();
            NotificationCenter.getInstance(this.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
        }
    }

    public final Size n(ArrayList arrayList) {
        int i10;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 1200;
        if (l()) {
            i10 = 1440;
        } else {
            i10 = 1200;
        }
        if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung")) {
            i11 = i10;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (Math.max(((Size) arrayList.get(i12)).mHeight, ((Size) arrayList.get(i12)).mWidth) <= i11 && Math.min(((Size) arrayList.get(i12)).mHeight, ((Size) arrayList.get(i12)).mWidth) >= 320) {
                arrayList2.add((Size) arrayList.get(i12));
            }
        }
        if (!arrayList2.isEmpty() && l()) {
            Collections.sort(arrayList2, new org.telegram.ui.df(9));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f22847n0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void o() {
        float min;
        if (this.f22837e1 == null) {
            if (this.f22850q0) {
                Camera2Session camera2Session = this.f22856u0;
                if (camera2Session != null) {
                    min = Utilities.clamp(this.L0, camera2Session.getMaxZoom(), this.f22856u0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.L0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.f22837e1 = ofFloat;
                ofFloat.addUpdateListener(new k6(this, 26));
                this.f22837e1.addListener(new e50(this, 1));
                this.f22837e1.setDuration(350L);
                this.f22837e1.setInterpolator(qr.f27715f);
                this.f22837e1.start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.fileUploaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.d).removeObserver(this, NotificationCenter.fileUploaded);
        ci.y2 y2Var = this.v;
        if (y2Var != null) {
            y2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g50 g50Var = this.e;
        float x10 = g50Var.getX();
        float y3 = g50Var.getY();
        RectF rectF = this.f22846n;
        rectF.set(x10 - AndroidUtilities.dp(8.0f), y3 - AndroidUtilities.dp(8.0f), x10 + g50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y3 + g50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.f22841h0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f22839f0) + this.f22840g0;
            this.f22842i0 = currentTimeMillis;
            this.F = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.F != 0.0f) {
            canvas.save();
            if (!this.H0) {
                canvas.scale(g50Var.getScaleX(), g50Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.F * 360.0f, false, this.h);
            canvas.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.R0) {
            if (View.MeasureSpec.getSize(i11) - getPaddingBottom() > View.MeasureSpec.getSize(i10) * 1.3f) {
                i12 = AndroidUtilities.roundPlayingMessageSize;
            } else {
                i12 = AndroidUtilities.roundMessageSize;
            }
            if (i12 != this.Q0) {
                this.Q0 = i12;
                org.telegram.ui.jl jlVar = this.f22849p0;
                ViewGroup.LayoutParams layoutParams = jlVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = jlVar.getLayoutParams();
                int i13 = this.Q0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                g50 g50Var = this.e;
                ViewGroup.LayoutParams layoutParams3 = g50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = g50Var.getLayoutParams();
                int i14 = this.Q0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.E.getLayoutParams()).topMargin = (this.Q0 / 2) - AndroidUtilities.dp(24.0f);
                jlVar.setRoundRadius(this.Q0 / 2);
                g50Var.invalidateOutline();
            }
            this.R0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ci.y2 y2Var = this.v;
        y2Var.f5807b.measure(makeMeasureSpec, makeMeasureSpec2);
        y2Var.f5808c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.f22861x0 = getMeasuredHeight() / 2.0f;
            w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u71 u71Var;
        float f7;
        float f10;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.f22838f != null && (u71Var = this.R) != null) {
            boolean x10 = u71Var.x();
            this.R.O(!x10);
            AnimatorSet animatorSet = this.J;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J = animatorSet2;
            if (!x10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            ImageView imageView = this.E;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, fArr);
            float f11 = 0.5f;
            if (!x10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f10);
            if (!x10) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f11));
            this.J.addListener(new e50(this, 0));
            this.J.setDuration(180L);
            this.J.setInterpolator(new DecelerateInterpolator());
            this.J.start();
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.M0) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (this.O0 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (this.P0 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.K0;
                    this.L0 = hypot;
                    if (this.f22850q0) {
                        Camera2Session camera2Session = this.f22856u0;
                        if (camera2Session != null) {
                            this.f22856u0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.f22856u0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f22852r0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                        return true;
                    }
                } else {
                    this.M0 = false;
                    o();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.O0 == motionEvent.getPointerId(0) && this.P0 == motionEvent.getPointerId(1)) || (this.O0 == motionEvent.getPointerId(1) && this.P0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.M0) {
                this.M0 = false;
                o();
                return true;
            }
        } else {
            if (this.N0 && !this.M0 && motionEvent.getPointerCount() == 2 && this.f22837e1 == null && this.f22841h0) {
                this.K0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.L0 = 1.0f;
                this.O0 = motionEvent.getPointerId(0);
                this.P0 = motionEvent.getPointerId(1);
                this.M0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                g50 g50Var = this.e;
                rectF.set(g50Var.getX(), g50Var.getY(), g50Var.getX() + g50Var.getMeasuredWidth(), g50Var.getY() + g50Var.getMeasuredHeight());
                this.N0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final boolean p() {
        int i10;
        int i11;
        if (this.f22850q0) {
            return true;
        }
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        if (cameras == null) {
            return false;
        }
        CameraInfo cameraInfo = null;
        int i12 = 0;
        while (i12 < cameras.size()) {
            CameraInfo cameraInfo2 = cameras.get(i12);
            if (!cameraInfo2.isFrontface()) {
                cameraInfo = cameraInfo2;
            }
            if ((this.H && cameraInfo2.isFrontface()) || (!this.H && !cameraInfo2.isFrontface())) {
                this.G = cameraInfo2;
                break;
            }
            i12++;
            cameraInfo = cameraInfo2;
        }
        if (this.G == null) {
            this.G = cameraInfo;
        }
        CameraInfo cameraInfo3 = this.G;
        if (cameraInfo3 == null) {
            return false;
        }
        ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
        ArrayList<Size> pictureSizes = this.G.getPictureSizes();
        Size n10 = n(previewSizes);
        Size[] sizeArr = this.f22845l0;
        sizeArr[0] = n10;
        Size n11 = n(pictureSizes);
        this.m0 = n11;
        if (sizeArr[0].mWidth != n11.mWidth) {
            boolean z10 = false;
            for (int size = previewSizes.size() - 1; size >= 0; size--) {
                Size size2 = previewSizes.get(size);
                int size3 = pictureSizes.size() - 1;
                while (true) {
                    if (size3 < 0) {
                        break;
                    }
                    Size size4 = pictureSizes.get(size3);
                    int i13 = size2.mWidth;
                    Size size5 = this.m0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.m0 = size4;
                        z10 = true;
                        break;
                    }
                    size3--;
                }
                if (z10) {
                    break;
                }
            }
            if (!z10) {
                for (int size6 = previewSizes.size() - 1; size6 >= 0; size6--) {
                    Size size7 = previewSizes.get(size6);
                    int size8 = pictureSizes.size() - 1;
                    while (true) {
                        if (size8 < 0) {
                            break;
                        }
                        Size size9 = pictureSizes.get(size8);
                        int i14 = size7.mWidth;
                        if (i14 >= 360 && (i10 = size7.mHeight) >= 360 && i14 == size9.mWidth && i10 == size9.mHeight) {
                            sizeArr[0] = size7;
                            this.m0 = size9;
                            z10 = true;
                            break;
                        }
                        size8--;
                    }
                    if (z10) {
                        break;
                    }
                }
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("InstantCamera preview w = ");
            sb2.append(sizeArr[0].mWidth);
            sb2.append(" h = ");
            org.telegram.messenger.q.o(sizeArr[0].mHeight, sb2);
        }
        return true;
    }

    public final void q() {
        Bitmap bitmap = this.f22848o0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f22848o0.getBitmap(), 50, 50, true);
            this.S = createScaledBitmap;
            if (createScaledBitmap != null) {
                Utilities.blurBitmap(createScaledBitmap, 7);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                    this.S.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float measuredHeight;
        c60 c60Var = this.f24028a;
        if (c60Var != null) {
            ((org.telegram.ui.qe) c60Var).f36798b.f40461uc.a(z10, true);
        }
        AnimatorSet animatorSet = this.f22832c0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f22832c0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.jl jlVar = this.f22849p0;
        g50 g50Var = this.e;
        if (z10 && !this.J0) {
            g50Var.setTranslationX(0.0f);
            jlVar.setTranslationX(0.0f);
            if (z11) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = getMeasuredHeight() / 2.0f;
            }
            this.f22861x0 = measuredHeight;
            w();
        }
        this.J0 = z10;
        View view = this.I0;
        if (view != null) {
            view.invalidate();
        }
        this.f22832c0 = new AnimatorSet();
        if (!z10 && this.f22842i0 > 300) {
            f7 = AndroidUtilities.dp(24.0f) - (getMeasuredWidth() / 2.0f);
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.addUpdateListener(new ai.bb(6, this, z11));
        AnimatorSet animatorSet2 = this.f22832c0;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.U0;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.E, property, 0.0f);
        q6 q6Var = s6.f28064b;
        if (z10) {
            i10 = 255;
        } else {
            i10 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.h, q6Var, i10);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(g50Var, property, f13);
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(g50Var, property2, f14);
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(g50Var, property3, f15);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(g50Var, property4, f7);
        if (z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(jlVar, property, f16);
        if (z10) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(jlVar, property2, f17);
        if (z10) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(jlVar, property3, f18), ObjectAnimator.ofFloat(jlVar, property4, f7), ofFloat);
        if (!z10) {
            this.f22832c0.addListener(new e50(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.f22832c0.setDuration(180L);
        this.f22832c0.setInterpolator(new DecelerateInterpolator());
        this.f22832c0.start();
    }

    public final void s() {
        Timer timer = this.f22829a1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f22829a1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        Timer timer2 = new Timer();
        this.f22829a1 = timer2;
        timer2.schedule(new ci.p2(this, 2), 0L, 17L);
    }

    @Override
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override
    public void setVisibility(int i10) {
        float f7;
        float f10;
        float f11;
        super.setVisibility(i10);
        this.U0.setAlpha(0.0f);
        g50 g50Var = this.e;
        g50Var.setAlpha(0.0f);
        org.telegram.ui.jl jlVar = this.f22849p0;
        jlVar.setAlpha(0.0f);
        ImageView imageView = this.E;
        imageView.setAlpha(0.0f);
        float f12 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.Z0) {
            f7 = 1.0f;
        } else {
            f7 = 0.1f;
        }
        g50Var.setScaleX(f7);
        if (this.Z0) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        g50Var.setScaleY(f10);
        if (this.Z0) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        jlVar.setScaleX(f11);
        if (!this.Z0) {
            f12 = 0.1f;
        }
        jlVar.setScaleY(f12);
        if (g50Var.getMeasuredWidth() != 0) {
            g50Var.setPivotX(g50Var.getMeasuredWidth() / 2);
            g50Var.setPivotY(g50Var.getMeasuredHeight() / 2);
            jlVar.setPivotX(jlVar.getMeasuredWidth() / 2);
            jlVar.setPivotY(jlVar.getMeasuredHeight() / 2);
        }
        try {
            if (i10 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void t() {
        Timer timer = this.f22829a1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f22829a1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void u() {
        if (!this.f22850q0 || !this.f22854s0) {
            q();
            Bitmap bitmap = this.S;
            if (bitmap != null) {
                this.f22857v0 = false;
                this.f22849p0.setImageBitmap(bitmap);
                this.f22849p0.setAlpha(1.0f);
            }
        }
        this.H = !this.H;
        v();
        if (this.f22850q0) {
            if (this.f22854s0) {
                this.f22856u0 = this.f22855t0[!this.H ? 1 : 0];
                m50 m50Var = this.f22844k0;
                Handler handler = m50Var.getHandler();
                if (handler != null) {
                    m50Var.sendMessage(handler.obtainMessage(4), 0);
                    m50Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f22856u0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f22856u0 = null;
                this.f22855t0[this.H ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.f22855t0;
            boolean z10 = this.H;
            int i10 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i10] = create;
            this.f22856u0 = create;
            if (create != null) {
                create.setRecordingVideo(true);
                this.f22845l0[0] = new Size(this.f22856u0.getPreviewWidth(), this.f22856u0.getPreviewHeight());
                m50 m50Var2 = this.f22844k0;
                Camera2Session camera2Session2 = this.f22856u0;
                Handler handler2 = m50Var2.getHandler();
                if (handler2 != null) {
                    m50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
            } else {
                return;
            }
        } else {
            CameraSession cameraSession = this.f22852r0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f22852r0, null, null);
                this.f22852r0 = null;
            }
        }
        p();
        this.I = false;
        m50 m50Var3 = this.f22844k0;
        Handler handler3 = m50Var3.getHandler();
        if (handler3 != null) {
            m50Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void v() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        if (this.X0 && this.f22841h0 && this.H) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.Y0 != z10) {
            this.Y0 = z10;
            ci.y2 y2Var = this.v;
            if (z10) {
                y2Var.c(null);
            } else {
                y2Var.d();
            }
        }
        if (this.f22850q0) {
            Camera2Session camera2Session = this.f22855t0[1];
            if (camera2Session != null) {
                if (this.X0 && !this.H && this.f22841h0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                camera2Session.setFlash(z12);
            }
        } else {
            CameraSession cameraSession = this.f22852r0;
            if (cameraSession != null) {
                if (this.X0 && !this.H && this.f22841h0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cameraSession.setTorchEnabled(z11);
            }
        }
        ci.w2 w2Var = this.f22853s;
        if (w2Var != null) {
            Boolean bool = this.W0;
            if (bool == null || bool.booleanValue() != this.X0) {
                if (this.X0) {
                    i10 = R.string.AccDescrCameraFlashOff;
                } else {
                    i10 = R.string.AccDescrCameraFlashOn;
                }
                w2Var.setContentDescription(LocaleController.getString(i10));
                boolean z13 = this.X0;
                int i11 = this.V0;
                if (!z13) {
                    if (this.f22858w == null) {
                        ij0 ij0Var = new ij0(R.raw.roundcamera_flash_on, i11, i11);
                        this.f22858w = ij0Var;
                        ij0Var.setCallback(w2Var);
                    }
                    w2Var.setImageDrawable(this.f22858w);
                    if (this.W0 == null) {
                        ij0 ij0Var2 = this.f22858w;
                        ij0Var2.M(ij0Var2.e[0] - 1);
                    } else {
                        this.f22858w.M(0);
                        this.f22858w.start();
                    }
                } else {
                    if (this.f22860x == null) {
                        ij0 ij0Var3 = new ij0(R.raw.roundcamera_flash_off, i11, i11);
                        this.f22860x = ij0Var3;
                        ij0Var3.setCallback(w2Var);
                    }
                    w2Var.setImageDrawable(this.f22860x);
                    if (this.W0 == null) {
                        ij0 ij0Var4 = this.f22860x;
                        ij0Var4.M(ij0Var4.e[0] - 1);
                    } else {
                        this.f22860x.M(0);
                        this.f22860x.start();
                    }
                }
                this.W0 = Boolean.valueOf(this.X0);
            }
        }
    }

    public final void w() {
        this.f22849p0.setTranslationY(this.f22861x0 + this.f22859w0);
        this.e.setTranslationY(this.f22861x0 + this.f22859w0);
    }

    @Override
    public o50 getCameraContainer() {
        return this.e;
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
    }
}
