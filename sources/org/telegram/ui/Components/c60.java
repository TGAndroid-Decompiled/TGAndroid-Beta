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
public final class c60 extends h60 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] f23211h1 = {285904780, -1394191079};
    public final float[] A0;
    public final float[] B0;
    public final float[] C0;
    public FloatBuffer D0;
    public ij0 E;
    public FloatBuffer E0;
    public ij0 F;
    public FloatBuffer F0;
    public final ImageView G;
    public float G0;
    public float H;
    public float H0;
    public CameraInfo I;
    public Size I0;
    public boolean J;
    public boolean J0;
    public volatile boolean K;
    public final View K0;
    public AnimatorSet L;
    public boolean L0;
    public TLRPC.InputFile M;
    public float M0;
    public TLRPC.InputEncryptedFile N;
    public float N0;
    public byte[] O;
    public boolean O0;
    public byte[] P;
    public boolean P0;
    public long Q;
    public int Q0;
    public final boolean R;
    public int R0;
    public VideoEditedInfo S;
    public int S0;
    public s71 T;
    public boolean T0;
    public Bitmap U;
    public final org.telegram.ui.ActionBar.d6 U0;
    public final int V;
    public boolean V0;
    public volatile boolean W;
    public final LinearLayout W0;
    public final int X0;
    public Boolean Y0;
    public boolean Z0;
    public final int[] f23212a0;
    public boolean f23213a1;
    public final int[] f23214b0;
    public boolean f23215b1;
    public final int[] f23216c0;
    public Timer f23217c1;
    public float f23218d0;
    public v50 f23219d1;
    public AnimatorSet f23220e0;
    public Bitmap f23221e1;
    public final int f23222f;
    public j50 f23223f0;
    public volatile int f23224f1;
    public File f23225g0;
    public ValueAnimator f23226g1;
    public final h50 h;
    public long f23227h0;
    public long f23228i0;
    public boolean f23229j0;
    public long f23230k0;
    public boolean f23231l0;
    public n50 m0;
    public final o50 f23232n;
    public final Size[] f23233n0;
    public Size f23234o0;
    public final Size f23235p0;
    public TextureView f23236q0;
    public final g50 f23237r;
    public final org.telegram.ui.il f23238r0;
    public final RectF f23239s;
    public final boolean f23240s0;
    public CameraSession f23241t0;
    public boolean f23242u0;
    public final ci.v2 v;
    public final Camera2Session[] f23243v0;
    public final ci.v2 f23244w;
    public Camera2Session f23245w0;
    public final ci.x2 f23246x;
    public boolean f23247x0;
    public ij0 f23248y;
    public float f23249y0;
    public float f23250z0;

    public c60(Context context, o50 o50Var, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        Size size;
        float f7;
        int i10 = UserConfig.selectedAccount;
        this.f23222f = i10;
        this.J = true;
        this.f23212a0 = new int[2];
        this.f23214b0 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f23216c0 = new int[1];
        this.f23218d0 = 1.0f;
        this.f23233n0 = new Size[2];
        if (SharedConfig.roundCamera16to9) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f23235p0 = size;
        this.f23240s0 = SharedConfig.isUsingCamera2(i10);
        this.f23243v0 = new Camera2Session[2];
        this.A0 = new float[16];
        this.B0 = new float[16];
        this.C0 = new float[16];
        if (z10) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        this.X0 = AndroidUtilities.dp(f7);
        this.U0 = d6Var;
        this.K0 = o50Var.getFragmentView();
        setWillNotDraw(false);
        this.f23232n = o50Var;
        this.V = o50Var.getClassGuid();
        this.R = o50Var.v();
        g50 g50Var = new g50(this, 0);
        this.f23237r = g50Var;
        g50Var.setStyle(Paint.Style.STROKE);
        g50Var.setStrokeCap(Paint.Cap.ROUND);
        g50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        g50Var.setColor(-1);
        this.f23239s = new RectF();
        ci.x2 x2Var = new ci.x2(getContext(), null, this, null);
        this.f23246x = x2Var;
        x2Var.f5818o = 0.5f;
        x2Var.f5817n = ci.x2.f(0.5f);
        x2Var.g();
        addView(x2Var.f5808b, w7.y5.e(-1, -1, 119));
        h50 h50Var = new h50(this, context);
        this.h = h50Var;
        h50Var.setOutlineProvider(new ch.b(this, 2));
        h50Var.setClipToOutline(true);
        h50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(h50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(x2Var.f5809c, w7.y5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.W0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.y5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.y5.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final c60 f23470b;

            {
                this.f23470b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c60 c60Var = this.f23470b;
                        if (c60Var.K) {
                            if (c60Var.f23240s0) {
                                Camera2Session camera2Session = c60Var.f23245w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = c60Var.f23241t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (c60Var.m0 != null) {
                                if (!c60Var.f23242u0) {
                                    c60Var.t();
                                }
                                ij0 ij0Var = c60Var.F;
                                if (ij0Var != null) {
                                    ij0Var.M(0);
                                    c60Var.F.start();
                                }
                                c60Var.J0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(rr.h);
                                boolean[] zArr = new boolean[1];
                                e50 e50Var = new e50(c60Var, 0);
                                h50 h50Var2 = c60Var.h;
                                h50Var2.setCameraDistance(h50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.il ilVar = c60Var.f23238r0;
                                ilVar.setCameraDistance(ilVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new i50(c60Var, zArr, e50Var));
                                ofFloat.addListener(new ai.y4(c60Var, zArr, e50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        c60 c60Var2 = this.f23470b;
                        c60Var2.Z0 = true ^ c60Var2.Z0;
                        c60Var2.u();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.f23244w = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, w7.y5.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final c60 f23470b;

            {
                this.f23470b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c60 c60Var = this.f23470b;
                        if (c60Var.K) {
                            if (c60Var.f23240s0) {
                                Camera2Session camera2Session = c60Var.f23245w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = c60Var.f23241t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (c60Var.m0 != null) {
                                if (!c60Var.f23242u0) {
                                    c60Var.t();
                                }
                                ij0 ij0Var = c60Var.F;
                                if (ij0Var != null) {
                                    ij0Var.M(0);
                                    c60Var.F.start();
                                }
                                c60Var.J0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(rr.h);
                                boolean[] zArr = new boolean[1];
                                e50 e50Var = new e50(c60Var, 0);
                                h50 h50Var2 = c60Var.h;
                                h50Var2.setCameraDistance(h50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.il ilVar = c60Var.f23238r0;
                                ilVar.setCameraDistance(ilVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new i50(c60Var, zArr, e50Var));
                                ofFloat.addListener(new ai.y4(c60Var, zArr, e50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        c60 c60Var2 = this.f23470b;
                        c60Var2.Z0 = true ^ c60Var2.Z0;
                        c60Var2.u();
                        return;
                }
            }
        });
        u();
        if (!z10) {
            x2Var.a(imageView);
            x2Var.a(imageView2);
        } else if (!d6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.y5.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.k(-16777216, 40));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, getContext(), paint);
        this.f23238r0 = ilVar;
        int i12 = AndroidUtilities.roundPlayingMessageSize;
        addView(ilVar, new FrameLayout.LayoutParams(i12, i12, 17));
        this.f23215b1 = false;
        setVisibility(4);
    }

    public static int j(c60 c60Var, int i10, String str) {
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

    public static boolean k() {
        if (!SharedConfig.bigCameraForRound && !SharedConfig.deviceIsAboveAverage() && Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) != 2) {
            int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
            for (int i10 = 0; i10 < 2; i10++) {
                if (f23211h1[i10] == hashCode) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean l() {
        if (Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i10 = 0; i10 < 2; i10++) {
            if (f23211h1[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        s();
        s71 s71Var = this.T;
        if (s71Var != null) {
            s71Var.H();
            this.T = null;
        }
        if (this.f23236q0 == null) {
            return;
        }
        this.f23231l0 = true;
        this.f23229j0 = false;
        this.Z0 = false;
        u();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f23222f);
        int i11 = NotificationCenter.recordStopped;
        Integer valueOf = Integer.valueOf(this.V);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, valueOf, Integer.valueOf(i10));
        if (this.m0 != null) {
            p();
            this.m0.b(0L, 0, true, 0, 0);
            this.m0 = null;
        } else {
            v50 v50Var = this.f23219d1;
            if (v50Var != null) {
                v50Var.i(0, new q50(0L, 0, 0, true, 0L));
            }
        }
        if (this.f23223f0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.f23223f0.delete();
            AutoDeleteMediaTask.unlockFile(this.f23223f0);
            this.f23223f0 = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        q(false, false);
        invalidate();
    }

    @Override
    public final void b(float f7, int i10) {
        s71 s71Var = this.T;
        if (s71Var != null) {
            if (i10 == 0) {
                r();
                this.T.C();
            } else if (i10 == 1) {
                s();
                this.T.B();
            } else if (i10 == 2) {
                s71Var.L(f7 * ((float) s71Var.p()), false);
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        CountDownLatch countDownLatch;
        ViewGroup viewGroup;
        if (this.f23240s0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.f23243v0;
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
            CameraSession cameraSession = this.f23241t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f23241t0;
                if (!z10) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
        h50 h50Var = this.h;
        h50Var.setTranslationX(0.0f);
        this.f23238r0.setTranslationX(0.0f);
        this.f23250z0 = 0.0f;
        v();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.f23236q0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f23236q0);
        }
        this.f23236q0 = null;
        h50Var.setImageReceiver(null);
    }

    @Override
    public final boolean d() {
        return !this.f23229j0;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            j50 j50Var = this.f23223f0;
            if (j50Var != null && j50Var.getAbsolutePath().equals(str)) {
                this.M = (TLRPC.InputFile) objArr[1];
                this.N = (TLRPC.InputEncryptedFile) objArr[2];
                this.Q = ((Long) objArr[5]).longValue();
                if (this.N != null) {
                    this.O = (byte[]) objArr[3];
                    this.P = (byte[]) objArr[4];
                }
            }
        }
    }

    @Override
    public final void e(float f7) {
        this.f23249y0 = f7 / 2.0f;
        v();
    }

    @Override
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        boolean z11;
        int i13;
        char c10;
        int i14;
        long j11;
        if (this.f23236q0 != null) {
            s();
            s71 s71Var = this.T;
            if (s71Var != null) {
                s71Var.H();
                this.T = null;
            }
            int i15 = 4;
            int i16 = this.f23222f;
            if (i10 == 4) {
                v50 v50Var = this.f23219d1;
                if (v50Var != null && this.f23230k0 > 800) {
                    v50Var.i(1, new q50(j3, i11, i12, z10, j10));
                    return;
                }
                if (BuildVars.DEBUG_VERSION && !this.f23223f0.exists()) {
                    FileLog.e(new RuntimeException("file not found :( round video"));
                }
                if (this.S == null) {
                    VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                    this.S = videoEditedInfo;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                }
                if (this.S.needConvert()) {
                    this.M = null;
                    this.N = null;
                    this.O = null;
                    this.P = null;
                    VideoEditedInfo videoEditedInfo2 = this.S;
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
                    videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j15 / d) * this.Q));
                    VideoEditedInfo videoEditedInfo3 = this.S;
                    videoEditedInfo3.bitrate = 1000000;
                    long j16 = videoEditedInfo3.startTime;
                    if (j16 > j11) {
                        videoEditedInfo3.startTime = j16 * 1000;
                    }
                    long j17 = videoEditedInfo3.endTime;
                    if (j17 > j11) {
                        videoEditedInfo3.endTime = j17 * 1000;
                    }
                    FileLoader.getInstance(i16).cancelFileUpload(this.f23223f0.getAbsolutePath(), false);
                } else {
                    this.S.estimatedSize = Math.max(1L, this.Q);
                }
                VideoEditedInfo videoEditedInfo4 = this.S;
                videoEditedInfo4.file = this.M;
                videoEditedInfo4.encryptedFile = this.N;
                videoEditedInfo4.key = this.O;
                videoEditedInfo4.iv = this.P;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.f23223f0.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = i12;
                photoEntry.effectId = j3;
                this.f23232n.q(photoEntry, this.S, z10, i11, 0, false, j10);
                if (i11 != 0) {
                    q(false, false);
                }
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            if (this.f23230k0 < 800) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f23231l0 = z11;
            this.f23229j0 = false;
            this.Z0 = false;
            u();
            if (!this.f23231l0) {
                if (i10 == 3) {
                    i15 = 2;
                } else {
                    i15 = 5;
                }
            }
            n50 n50Var = this.m0;
            int i17 = this.V;
            if (n50Var != null) {
                c10 = 1;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i17), Integer.valueOf(i15));
                if (this.f23231l0) {
                    i14 = 0;
                } else if (i10 == 3) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                p();
                i13 = i17;
                this.m0.b(j3, i14, z10, i11, i12);
                this.m0 = null;
            } else {
                i13 = i17;
                c10 = 1;
            }
            if (this.f23231l0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i16);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.f23230k0);
                Object[] objArr = new Object[3];
                objArr[0] = valueOf;
                objArr[c10] = Boolean.TRUE;
                objArr[2] = valueOf2;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i18, objArr);
                q(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
            }
        }
    }

    @Override
    public final void g(ah.c cVar, org.telegram.ui.gj gjVar) {
        View view = this.W0;
        ch.d c10 = cVar.c(view, gjVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public View getButtonsLayout() {
        return this.W0;
    }

    @Override
    public RectF getCameraRect() {
        h50 h50Var = this.h;
        int[] iArr = this.f23212a0;
        h50Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], h50Var.getWidth() + i10, h50Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.G;
    }

    @Override
    public Paint getPaint() {
        return this.f23237r;
    }

    @Override
    public TextureView getTextureView() {
        return this.f23236q0;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.f23236q0 == null) {
            if (this.F == null) {
                int i10 = R.raw.roundcamera_flip;
                int i11 = this.X0;
                ij0 ij0Var = new ij0(i10, i11, i11);
                this.F = ij0Var;
                ij0Var.M(0);
                this.F.setCallback(this.v);
            }
            this.v.setImageDrawable(this.F);
            this.f23238r0.setAlpha(1.0f);
            this.f23238r0.invalidate();
            if (this.U == null) {
                try {
                    this.U = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.U;
            if (bitmap != null) {
                this.f23238r0.setImageBitmap(bitmap);
            } else {
                this.f23238r0.setImageResource(R.drawable.icplaceholder);
            }
            this.K = false;
            this.I = null;
            if (!z10) {
                if (!this.f23240s0) {
                    this.J = true;
                }
                u();
                this.f23230k0 = 0L;
                this.H = 0.0f;
            }
            this.f23231l0 = false;
            this.M = null;
            this.N = null;
            this.O = null;
            this.P = null;
            this.f23247x0 = true;
            if (o()) {
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
                    this.f23223f0 = new File(directory, System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
                }
                SharedConfig.saveConfig();
                AutoDeleteMediaTask.lockFile(this.f23223f0);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera show round camera " + this.f23223f0.getAbsolutePath());
                }
                if (this.f23240s0) {
                    Context context = getContext();
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z13 = globalMainSettings.getBoolean("rounddual_available", z11);
                    this.f23242u0 = z13;
                    if (z13) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            Camera2Session[] camera2SessionArr = this.f23243v0;
                            if (camera2SessionArr[i12] == null) {
                                if (i12 == 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                camera2SessionArr[i12] = Camera2Session.create(z12, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                                Camera2Session camera2Session = this.f23243v0[i12];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.f23233n0[i12] = new Size(this.f23243v0[i12].getPreviewWidth(), this.f23243v0[i12].getPreviewHeight());
                                }
                            }
                        }
                        u();
                        Camera2Session[] camera2SessionArr2 = this.f23243v0;
                        boolean z14 = this.J;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z14 ? 1 : 0];
                        this.f23245w0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z14 ? 1 : 0] == null) {
                            this.f23242u0 = false;
                        }
                        if (camera2Session2 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.f23243v0;
                        boolean z15 = this.J;
                        int i13 = !z15 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z15, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                        camera2SessionArr3[i13] = create;
                        this.f23245w0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.f23233n0[0] = new Size(this.f23245w0.getPreviewWidth(), this.f23245w0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f23236q0 = textureView;
                textureView.setSurfaceTextureListener(new ki.d(this, 1));
                this.h.addView(this.f23236q0, w7.y5.c(-1.0f, -1));
                this.T0 = true;
                this.f23215b1 = z10;
                setVisibility(0);
                q(true, z10);
                MediaController.getInstance().requestRecordAudioFocus(true);
            }
        }
    }

    @Override
    public final void i() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (this.f23229j0) {
            if (this.f23230k0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f23231l0 = z10;
            this.f23229j0 = false;
            u();
            if (this.m0 != null) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f23222f);
                int i13 = NotificationCenter.recordStopped;
                Integer valueOf = Integer.valueOf(this.V);
                if (this.f23231l0) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, valueOf, Integer.valueOf(i10));
                p();
                n50 n50Var = this.m0;
                boolean z11 = this.f23231l0;
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
                n50Var.b(0L, i11, true, 0, i12);
                this.m0 = null;
            }
            if (this.f23231l0) {
                NotificationCenter.getInstance(this.f23222f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.V), Boolean.TRUE, Integer.valueOf((int) this.f23230k0));
                q(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            v50 v50Var = this.f23219d1;
            v50Var.T.sendMessage(v50Var.T.obtainMessage(4));
            return;
        }
        v50 v50Var2 = this.f23219d1;
        if (v50Var2 != null) {
            v50Var2.T.sendMessage(v50Var2.T.obtainMessage(5));
            c(false);
            s71 s71Var = this.T;
            if (s71Var != null) {
                s71Var.H();
                this.T = null;
            }
            h(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.lockOrientation(this.f23232n.getParentActivity());
            invalidate();
            NotificationCenter.getInstance(this.f23222f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
        }
    }

    public final Size m(ArrayList arrayList) {
        int i10;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 1200;
        if (k()) {
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
        if (!arrayList2.isEmpty() && k()) {
            Collections.sort(arrayList2, new org.telegram.ui.cf(9));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f23235p0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void n() {
        float min;
        if (this.f23226g1 == null) {
            if (this.f23240s0) {
                Camera2Session camera2Session = this.f23245w0;
                if (camera2Session != null) {
                    min = Utilities.clamp(this.N0, camera2Session.getMaxZoom(), this.f23245w0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.N0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.f23226g1 = ofFloat;
                ofFloat.addUpdateListener(new k6(this, 26));
                this.f23226g1.addListener(new f50(this, 1));
                this.f23226g1.setDuration(350L);
                this.f23226g1.setInterpolator(rr.f28031f);
                this.f23226g1.start();
            }
        }
    }

    public final boolean o() {
        int i10;
        int i11;
        if (this.f23240s0) {
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
            if ((this.J && cameraInfo2.isFrontface()) || (!this.J && !cameraInfo2.isFrontface())) {
                this.I = cameraInfo2;
                break;
            }
            i12++;
            cameraInfo = cameraInfo2;
        }
        if (this.I == null) {
            this.I = cameraInfo;
        }
        CameraInfo cameraInfo3 = this.I;
        if (cameraInfo3 == null) {
            return false;
        }
        ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
        ArrayList<Size> pictureSizes = this.I.getPictureSizes();
        Size m10 = m(previewSizes);
        Size[] sizeArr = this.f23233n0;
        sizeArr[0] = m10;
        Size m11 = m(pictureSizes);
        this.f23234o0 = m11;
        if (sizeArr[0].mWidth != m11.mWidth) {
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
                    Size size5 = this.f23234o0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.f23234o0 = size4;
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
                            this.f23234o0 = size9;
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
            org.telegram.messenger.f0.n(sizeArr[0].mHeight, sb2);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f23222f).addObserver(this, NotificationCenter.fileUploaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f23222f).removeObserver(this, NotificationCenter.fileUploaded);
        ci.x2 x2Var = this.f23246x;
        if (x2Var != null) {
            x2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        h50 h50Var = this.h;
        float x10 = h50Var.getX();
        float y3 = h50Var.getY();
        RectF rectF = this.f23239s;
        rectF.set(x10 - AndroidUtilities.dp(8.0f), y3 - AndroidUtilities.dp(8.0f), x10 + h50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y3 + h50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.f23229j0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f23227h0) + this.f23228i0;
            this.f23230k0 = currentTimeMillis;
            this.H = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.H != 0.0f) {
            canvas.save();
            if (!this.J0) {
                canvas.scale(h50Var.getScaleX(), h50Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.H * 360.0f, false, this.f23237r);
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
        if (this.T0) {
            if (View.MeasureSpec.getSize(i11) - getPaddingBottom() > View.MeasureSpec.getSize(i10) * 1.3f) {
                i12 = AndroidUtilities.roundPlayingMessageSize;
            } else {
                i12 = AndroidUtilities.roundMessageSize;
            }
            if (i12 != this.S0) {
                this.S0 = i12;
                org.telegram.ui.il ilVar = this.f23238r0;
                ViewGroup.LayoutParams layoutParams = ilVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = ilVar.getLayoutParams();
                int i13 = this.S0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                h50 h50Var = this.h;
                ViewGroup.LayoutParams layoutParams3 = h50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = h50Var.getLayoutParams();
                int i14 = this.S0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.G.getLayoutParams()).topMargin = (this.S0 / 2) - AndroidUtilities.dp(24.0f);
                ilVar.setRoundRadius(this.S0 / 2);
                h50Var.invalidateOutline();
            }
            this.T0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ci.x2 x2Var = this.f23246x;
        x2Var.f5808b.measure(makeMeasureSpec, makeMeasureSpec2);
        x2Var.f5809c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.f23250z0 = getMeasuredHeight() / 2.0f;
            v();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s71 s71Var;
        float f7;
        float f10;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.f23232n != null && (s71Var = this.T) != null) {
            boolean x10 = s71Var.x();
            this.T.O(!x10);
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.L = animatorSet2;
            if (!x10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            ImageView imageView = this.G;
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
            this.L.addListener(new f50(this, 0));
            this.L.setDuration(180L);
            this.L.setInterpolator(new DecelerateInterpolator());
            this.L.start();
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.O0) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (this.Q0 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (this.R0 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.M0;
                    this.N0 = hypot;
                    if (this.f23240s0) {
                        Camera2Session camera2Session = this.f23245w0;
                        if (camera2Session != null) {
                            this.f23245w0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.f23245w0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f23241t0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                        return true;
                    }
                } else {
                    this.O0 = false;
                    n();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.Q0 == motionEvent.getPointerId(0) && this.R0 == motionEvent.getPointerId(1)) || (this.Q0 == motionEvent.getPointerId(1) && this.R0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.O0) {
                this.O0 = false;
                n();
                return true;
            }
        } else {
            if (this.P0 && !this.O0 && motionEvent.getPointerCount() == 2 && this.f23226g1 == null && this.f23229j0) {
                this.M0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.N0 = 1.0f;
                this.Q0 = motionEvent.getPointerId(0);
                this.R0 = motionEvent.getPointerId(1);
                this.O0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                h50 h50Var = this.h;
                rectF.set(h50Var.getX(), h50Var.getY(), h50Var.getX() + h50Var.getMeasuredWidth(), h50Var.getY() + h50Var.getMeasuredHeight());
                this.P0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final void p() {
        Bitmap bitmap = this.f23236q0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f23236q0.getBitmap(), 50, 50, true);
            this.U = createScaledBitmap;
            if (createScaledBitmap != null) {
                Utilities.blurBitmap(createScaledBitmap, 7);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                    this.U.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void q(boolean z10, boolean z11) {
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
        d60 d60Var = this.f24647a;
        if (d60Var != null) {
            ((org.telegram.ui.pe) d60Var).f36508b.f39669uc.a(z10, true);
        }
        AnimatorSet animatorSet = this.f23220e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f23220e0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.il ilVar = this.f23238r0;
        h50 h50Var = this.h;
        if (z10 && !this.L0) {
            h50Var.setTranslationX(0.0f);
            ilVar.setTranslationX(0.0f);
            if (z11) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = getMeasuredHeight() / 2.0f;
            }
            this.f23250z0 = measuredHeight;
            v();
        }
        this.L0 = z10;
        View view = this.K0;
        if (view != null) {
            view.invalidate();
        }
        this.f23220e0 = new AnimatorSet();
        if (!z10 && this.f23230k0 > 300) {
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
        AnimatorSet animatorSet2 = this.f23220e0;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.W0;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.G, property, 0.0f);
        q6 q6Var = s6.f28162b;
        if (z10) {
            i10 = 255;
        } else {
            i10 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f23237r, q6Var, i10);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(h50Var, property, f13);
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(h50Var, property2, f14);
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h50Var, property3, f15);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(h50Var, property4, f7);
        if (z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(ilVar, property, f16);
        if (z10) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(ilVar, property2, f17);
        if (z10) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(ilVar, property3, f18), ObjectAnimator.ofFloat(ilVar, property4, f7), ofFloat);
        if (!z10) {
            this.f23220e0.addListener(new f50(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.f23220e0.setDuration(180L);
        this.f23220e0.setInterpolator(new DecelerateInterpolator());
        this.f23220e0.start();
    }

    public final void r() {
        Timer timer = this.f23217c1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f23217c1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        Timer timer2 = new Timer();
        this.f23217c1 = timer2;
        timer2.schedule(new ci.o2(this, 2), 0L, 17L);
    }

    public final void s() {
        Timer timer = this.f23217c1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f23217c1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
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
        this.W0.setAlpha(0.0f);
        h50 h50Var = this.h;
        h50Var.setAlpha(0.0f);
        org.telegram.ui.il ilVar = this.f23238r0;
        ilVar.setAlpha(0.0f);
        ImageView imageView = this.G;
        imageView.setAlpha(0.0f);
        float f12 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.f23215b1) {
            f7 = 1.0f;
        } else {
            f7 = 0.1f;
        }
        h50Var.setScaleX(f7);
        if (this.f23215b1) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        h50Var.setScaleY(f10);
        if (this.f23215b1) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        ilVar.setScaleX(f11);
        if (!this.f23215b1) {
            f12 = 0.1f;
        }
        ilVar.setScaleY(f12);
        if (h50Var.getMeasuredWidth() != 0) {
            h50Var.setPivotX(h50Var.getMeasuredWidth() / 2);
            h50Var.setPivotY(h50Var.getMeasuredHeight() / 2);
            ilVar.setPivotX(ilVar.getMeasuredWidth() / 2);
            ilVar.setPivotY(ilVar.getMeasuredHeight() / 2);
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
        if (!this.f23240s0 || !this.f23242u0) {
            p();
            Bitmap bitmap = this.U;
            if (bitmap != null) {
                this.f23247x0 = false;
                this.f23238r0.setImageBitmap(bitmap);
                this.f23238r0.setAlpha(1.0f);
            }
        }
        this.J = !this.J;
        u();
        if (this.f23240s0) {
            if (this.f23242u0) {
                this.f23245w0 = this.f23243v0[!this.J ? 1 : 0];
                n50 n50Var = this.m0;
                Handler handler = n50Var.getHandler();
                if (handler != null) {
                    n50Var.sendMessage(handler.obtainMessage(4), 0);
                    n50Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f23245w0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f23245w0 = null;
                this.f23243v0[this.J ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.f23243v0;
            boolean z10 = this.J;
            int i10 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i10] = create;
            this.f23245w0 = create;
            if (create != null) {
                create.setRecordingVideo(true);
                this.f23233n0[0] = new Size(this.f23245w0.getPreviewWidth(), this.f23245w0.getPreviewHeight());
                n50 n50Var2 = this.m0;
                Camera2Session camera2Session2 = this.f23245w0;
                Handler handler2 = n50Var2.getHandler();
                if (handler2 != null) {
                    n50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
            } else {
                return;
            }
        } else {
            CameraSession cameraSession = this.f23241t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f23241t0, null, null);
                this.f23241t0 = null;
            }
        }
        o();
        this.K = false;
        n50 n50Var3 = this.m0;
        Handler handler3 = n50Var3.getHandler();
        if (handler3 != null) {
            n50Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void u() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        if (this.Z0 && this.f23229j0 && this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f23213a1 != z10) {
            this.f23213a1 = z10;
            ci.x2 x2Var = this.f23246x;
            if (z10) {
                x2Var.c(null);
            } else {
                x2Var.d();
            }
        }
        if (this.f23240s0) {
            Camera2Session camera2Session = this.f23243v0[1];
            if (camera2Session != null) {
                if (this.Z0 && !this.J && this.f23229j0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                camera2Session.setFlash(z12);
            }
        } else {
            CameraSession cameraSession = this.f23241t0;
            if (cameraSession != null) {
                if (this.Z0 && !this.J && this.f23229j0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cameraSession.setTorchEnabled(z11);
            }
        }
        ci.v2 v2Var = this.f23244w;
        if (v2Var != null) {
            Boolean bool = this.Y0;
            if (bool == null || bool.booleanValue() != this.Z0) {
                if (this.Z0) {
                    i10 = R.string.AccDescrCameraFlashOff;
                } else {
                    i10 = R.string.AccDescrCameraFlashOn;
                }
                v2Var.setContentDescription(LocaleController.getString(i10));
                boolean z13 = this.Z0;
                int i11 = this.X0;
                if (!z13) {
                    if (this.f23248y == null) {
                        ij0 ij0Var = new ij0(R.raw.roundcamera_flash_on, i11, i11);
                        this.f23248y = ij0Var;
                        ij0Var.setCallback(v2Var);
                    }
                    v2Var.setImageDrawable(this.f23248y);
                    if (this.Y0 == null) {
                        ij0 ij0Var2 = this.f23248y;
                        ij0Var2.M(ij0Var2.e[0] - 1);
                    } else {
                        this.f23248y.M(0);
                        this.f23248y.start();
                    }
                } else {
                    if (this.E == null) {
                        ij0 ij0Var3 = new ij0(R.raw.roundcamera_flash_off, i11, i11);
                        this.E = ij0Var3;
                        ij0Var3.setCallback(v2Var);
                    }
                    v2Var.setImageDrawable(this.E);
                    if (this.Y0 == null) {
                        ij0 ij0Var4 = this.E;
                        ij0Var4.M(ij0Var4.e[0] - 1);
                    } else {
                        this.E.M(0);
                        this.E.start();
                    }
                }
                this.Y0 = Boolean.valueOf(this.Z0);
            }
        }
    }

    public final void v() {
        this.f23238r0.setTranslationY(this.f23250z0 + this.f23249y0);
        this.h.setTranslationY(this.f23250z0 + this.f23249y0);
    }

    @Override
    public p50 getCameraContainer() {
        return this.h;
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
    }
}
