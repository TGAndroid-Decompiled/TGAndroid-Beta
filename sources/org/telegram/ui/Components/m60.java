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
import android.os.SystemClock;
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
public final class m60 extends r60 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] f28400m1 = {285904780, -1394191079};
    public volatile int A0;
    public volatile boolean B0;
    public volatile String C0;
    public float D0;
    public vj0 E;
    public float E0;
    public vj0 F;
    public final float[] F0;
    public final ImageView G;
    public final float[] G0;
    public float H;
    public final float[] H0;
    public CameraInfo I;
    public FloatBuffer I0;
    public boolean J;
    public FloatBuffer J0;
    public volatile boolean K;
    public FloatBuffer K0;
    public AnimatorSet L;
    public float L0;
    public TLRPC.InputFile M;
    public float M0;
    public TLRPC.InputEncryptedFile N;
    public Size N0;
    public byte[] O;
    public boolean O0;
    public byte[] P;
    public final View P0;
    public long Q;
    public boolean Q0;
    public final boolean R;
    public float R0;
    public VideoEditedInfo S;
    public float S0;
    public c81 T;
    public boolean T0;
    public Bitmap U;
    public boolean U0;
    public final int V;
    public int V0;
    public volatile boolean W;
    public int W0;
    public int X0;
    public boolean Y0;
    public final org.telegram.ui.ActionBar.d6 Z0;
    public final int[] f28401a0;
    public boolean f28402a1;
    public final int[] f28403b0;
    public final LinearLayout f28404b1;
    public final int[] f28405c0;
    public final int f28406c1;
    public float f28407d0;
    public Boolean f28408d1;
    public AnimatorSet f28409e0;
    public boolean f28410e1;
    public final int f28411f;
    public s50 f28412f0;
    public boolean f28413f1;
    public File f28414g0;
    public boolean f28415g1;
    public final q50 h;
    public long f28416h0;
    public Timer f28417h1;
    public long f28418i0;
    public f60 f28419i1;
    public boolean f28420j0;
    public Bitmap f28421j1;
    public long f28422k0;
    public volatile int f28423k1;
    public boolean f28424l0;
    public ValueAnimator l1;
    public x50 m0;
    public final y50 f28425n;
    public final Size[] f28426n0;
    public Size f28427o0;
    public final Size f28428p0;
    public TextureView f28429q0;
    public final p50 f28430r;
    public final org.telegram.ui.el f28431r0;
    public final RectF f28432s;
    public final boolean f28433s0;
    public CameraSession f28434t0;
    public boolean f28435u0;
    public final ei.q2 v;
    public final Camera2Session[] f28436v0;
    public final ei.q2 f28437w;
    public Camera2Session f28438w0;
    public final ei.s2 f28439x;
    public boolean f28440x0;
    public vj0 f28441y;
    public volatile long f28442y0;
    public volatile int f28443z0;

    public m60(Context context, y50 y50Var, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        Size size;
        float f7;
        int i10 = UserConfig.selectedAccount;
        this.f28411f = i10;
        this.J = true;
        this.f28401a0 = new int[2];
        this.f28403b0 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f28405c0 = new int[1];
        this.f28407d0 = 1.0f;
        this.f28426n0 = new Size[2];
        if (SharedConfig.roundCamera16to9) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f28428p0 = size;
        this.f28433s0 = SharedConfig.isUsingCamera2(i10);
        this.f28436v0 = new Camera2Session[2];
        this.F0 = new float[16];
        this.G0 = new float[16];
        this.H0 = new float[16];
        if (z10) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        this.f28406c1 = AndroidUtilities.dp(f7);
        this.Z0 = d6Var;
        this.P0 = y50Var.getFragmentView();
        setWillNotDraw(false);
        this.f28425n = y50Var;
        this.V = y50Var.getClassGuid();
        this.R = y50Var.x();
        p50 p50Var = new p50(this, 0);
        this.f28430r = p50Var;
        p50Var.setStyle(Paint.Style.STROKE);
        p50Var.setStrokeCap(Paint.Cap.ROUND);
        p50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        p50Var.setColor(-1);
        this.f28432s = new RectF();
        ei.s2 s2Var = new ei.s2(getContext(), null, this, null);
        this.f28439x = s2Var;
        s2Var.f9777o = 0.5f;
        s2Var.f9776n = ei.s2.f(0.5f);
        s2Var.g();
        addView(s2Var.f9767b, w7.z5.e(-1, -1, 119));
        q50 q50Var = new q50(this, context);
        this.h = q50Var;
        q50Var.setOutlineProvider(new dh.b(this, 2));
        q50Var.setClipToOutline(true);
        q50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(q50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(s2Var.f9768c, w7.z5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f28404b1 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.z5.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final m60 f28391b;

            {
                this.f28391b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m60 m60Var = this.f28391b;
                        if (m60Var.K) {
                            if (m60Var.f28433s0) {
                                Camera2Session camera2Session = m60Var.f28438w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = m60Var.f28434t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (m60Var.m0 != null) {
                                if (!m60Var.f28435u0) {
                                    m60Var.u();
                                }
                                vj0 vj0Var = m60Var.F;
                                if (vj0Var != null) {
                                    vj0Var.M(0);
                                    m60Var.F.start();
                                }
                                m60Var.O0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(bs.h);
                                boolean[] zArr = new boolean[1];
                                n50 n50Var = new n50(m60Var, 0);
                                q50 q50Var2 = m60Var.h;
                                q50Var2.setCameraDistance(q50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.el elVar = m60Var.f28431r0;
                                elVar.setCameraDistance(elVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new r50(m60Var, zArr, n50Var));
                                ofFloat.addListener(new ci.p3(m60Var, zArr, n50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        m60 m60Var2 = this.f28391b;
                        m60Var2.f28410e1 = true ^ m60Var2.f28410e1;
                        m60Var2.v();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.f28437w = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, w7.z5.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final m60 f28391b;

            {
                this.f28391b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m60 m60Var = this.f28391b;
                        if (m60Var.K) {
                            if (m60Var.f28433s0) {
                                Camera2Session camera2Session = m60Var.f28438w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = m60Var.f28434t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (m60Var.m0 != null) {
                                if (!m60Var.f28435u0) {
                                    m60Var.u();
                                }
                                vj0 vj0Var = m60Var.F;
                                if (vj0Var != null) {
                                    vj0Var.M(0);
                                    m60Var.F.start();
                                }
                                m60Var.O0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(bs.h);
                                boolean[] zArr = new boolean[1];
                                n50 n50Var = new n50(m60Var, 0);
                                q50 q50Var2 = m60Var.h;
                                q50Var2.setCameraDistance(q50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.el elVar = m60Var.f28431r0;
                                elVar.setCameraDistance(elVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new r50(m60Var, zArr, n50Var));
                                ofFloat.addListener(new ci.p3(m60Var, zArr, n50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        m60 m60Var2 = this.f28391b;
                        m60Var2.f28410e1 = true ^ m60Var2.f28410e1;
                        m60Var2.v();
                        return;
                }
            }
        });
        v();
        if (!z10) {
            s2Var.a(imageView);
            s2Var.a(imageView2);
        } else if (!d6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.z5.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.o(-16777216, 40));
        org.telegram.ui.el elVar = new org.telegram.ui.el(this, getContext(), paint);
        this.f28431r0 = elVar;
        int i12 = AndroidUtilities.roundPlayingMessageSize;
        addView(elVar, new FrameLayout.LayoutParams(i12, i12, 17));
        this.f28415g1 = false;
        setVisibility(4);
    }

    public static int j(m60 m60Var, int i10, String str) {
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
                if (f28400m1[i10] == hashCode) {
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
            if (f28400m1[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        t();
        c81 c81Var = this.T;
        if (c81Var != null) {
            c81Var.H();
            this.T = null;
        }
        if (this.f28429q0 == null) {
            return;
        }
        this.f28424l0 = true;
        this.f28420j0 = false;
        this.f28410e1 = false;
        v();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f28411f);
        int i11 = NotificationCenter.recordStopped;
        Integer valueOf = Integer.valueOf(this.V);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, valueOf, Integer.valueOf(i10));
        if (this.m0 != null) {
            q();
            this.m0.b(0L, 0, true, 0, 0);
            this.m0 = null;
        } else {
            f60 f60Var = this.f28419i1;
            if (f60Var != null) {
                f60Var.i(0, new a60(0L, 0, 0, true, 0L));
            }
        }
        if (this.f28412f0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.f28412f0.delete();
            AutoDeleteMediaTask.unlockFile(this.f28412f0);
            this.f28412f0 = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        r(false, false);
        invalidate();
    }

    @Override
    public final void b(float f7, int i10) {
        c81 c81Var = this.T;
        if (c81Var != null) {
            if (i10 == 0) {
                s();
                this.T.C();
            } else if (i10 == 1) {
                t();
                this.T.B();
            } else if (i10 == 2) {
                c81Var.L(f7 * ((float) c81Var.p()), false);
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        CountDownLatch countDownLatch;
        ViewGroup viewGroup;
        if (this.f28433s0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.f28436v0;
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
            CameraSession cameraSession = this.f28434t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f28434t0;
                if (!z10) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
        q50 q50Var = this.h;
        q50Var.setTranslationX(0.0f);
        this.f28431r0.setTranslationX(0.0f);
        this.E0 = 0.0f;
        w();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.f28429q0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f28429q0);
        }
        this.f28429q0 = null;
        q50Var.setImageReceiver(null);
    }

    @Override
    public final boolean d() {
        return !this.f28420j0;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            s50 s50Var = this.f28412f0;
            if (s50Var != null && s50Var.getAbsolutePath().equals(str)) {
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
        this.D0 = f7 / 2.0f;
        w();
    }

    @Override
    public final void f(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        boolean z11;
        char c10;
        int i13;
        int i14;
        long j12;
        if (this.f28429q0 != null) {
            t();
            c81 c81Var = this.T;
            if (c81Var != null) {
                c81Var.H();
                this.T = null;
            }
            int i15 = 4;
            int i16 = this.f28411f;
            if (i10 == 4) {
                f60 f60Var = this.f28419i1;
                if (f60Var != null && this.f28422k0 > 800) {
                    f60Var.i(1, new a60(j10, i11, i12, z10, j11));
                    return;
                }
                if (BuildVars.DEBUG_VERSION && !this.f28412f0.exists()) {
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
                    long j13 = videoEditedInfo2.estimatedDuration;
                    double d = j13;
                    long j14 = videoEditedInfo2.startTime;
                    if (j14 >= 0) {
                        j12 = 0;
                    } else {
                        j14 = 0;
                        j12 = 0;
                    }
                    long j15 = videoEditedInfo2.endTime;
                    if (j15 >= j12) {
                        j13 = j15;
                    }
                    long j16 = j13 - j14;
                    videoEditedInfo2.estimatedDuration = j16;
                    videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j16 / d) * this.Q));
                    VideoEditedInfo videoEditedInfo3 = this.S;
                    videoEditedInfo3.bitrate = 1000000;
                    long j17 = videoEditedInfo3.startTime;
                    if (j17 > j12) {
                        videoEditedInfo3.startTime = j17 * 1000;
                    }
                    long j18 = videoEditedInfo3.endTime;
                    if (j18 > j12) {
                        videoEditedInfo3.endTime = j18 * 1000;
                    }
                    FileLoader.getInstance(i16).cancelFileUpload(this.f28412f0.getAbsolutePath(), false);
                } else {
                    this.S.estimatedSize = Math.max(1L, this.Q);
                }
                VideoEditedInfo videoEditedInfo4 = this.S;
                videoEditedInfo4.file = this.M;
                videoEditedInfo4.encryptedFile = this.N;
                videoEditedInfo4.key = this.O;
                videoEditedInfo4.iv = this.P;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.f28412f0.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = i12;
                photoEntry.effectId = j10;
                this.f28425n.s(photoEntry, this.S, z10, i11, 0, false, j11);
                if (i11 != 0) {
                    r(false, false);
                }
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            if (this.f28422k0 < 800) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f28424l0 = z11;
            this.f28420j0 = false;
            this.f28410e1 = false;
            v();
            if (!this.f28424l0) {
                if (i10 == 3) {
                    i15 = 2;
                } else {
                    i15 = 5;
                }
            }
            x50 x50Var = this.m0;
            int i17 = this.V;
            if (x50Var != null) {
                c10 = 1;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i17), Integer.valueOf(i15));
                if (this.f28424l0) {
                    i14 = 0;
                } else if (i10 == 3) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                q();
                i13 = i17;
                this.m0.b(j10, i14, z10, i11, i12);
                this.m0 = null;
            } else {
                c10 = 1;
                i13 = i17;
            }
            if (this.f28424l0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i16);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.f28422k0);
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
    public final void g(bh.b bVar, org.telegram.ui.bj bjVar) {
        View view = this.f28404b1;
        dh.d c10 = bVar.c(view, bjVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public View getButtonsLayout() {
        return this.f28404b1;
    }

    @Override
    public RectF getCameraRect() {
        q50 q50Var = this.h;
        int[] iArr = this.f28401a0;
        q50Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], q50Var.getWidth() + i10, q50Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.G;
    }

    @Override
    public Paint getPaint() {
        return this.f28430r;
    }

    @Override
    public TextureView getTextureView() {
        return this.f28429q0;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.f28429q0 == null) {
            if (this.F == null) {
                int i10 = R.raw.roundcamera_flip;
                int i11 = this.f28406c1;
                vj0 vj0Var = new vj0(i10, i11, i11);
                this.F = vj0Var;
                vj0Var.M(0);
                this.F.setCallback(this.v);
            }
            this.v.setImageDrawable(this.F);
            this.f28431r0.setAlpha(1.0f);
            this.f28431r0.invalidate();
            if (this.U == null) {
                try {
                    this.U = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.U;
            if (bitmap != null) {
                this.f28431r0.setImageBitmap(bitmap);
            } else {
                this.f28431r0.setImageResource(R.drawable.icplaceholder);
            }
            this.K = false;
            this.I = null;
            if (!z10) {
                if (!this.f28433s0) {
                    this.J = true;
                }
                v();
                this.f28422k0 = 0L;
                this.H = 0.0f;
            }
            this.f28424l0 = false;
            this.M = null;
            this.N = null;
            this.O = null;
            this.P = null;
            this.f28440x0 = true;
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
                    this.f28412f0 = new File(FileLoader.getDirectory(3), System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
                }
                SharedConfig.saveConfig();
                AutoDeleteMediaTask.lockFile(this.f28412f0);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera show round camera " + this.f28412f0.getAbsolutePath());
                }
                if (this.f28433s0) {
                    Context context = getContext();
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z15 = globalMainSettings.getBoolean("rounddual_available", z11);
                    this.f28435u0 = z15;
                    if (z15) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            Camera2Session[] camera2SessionArr = this.f28436v0;
                            if (camera2SessionArr[i12] == null) {
                                if (i12 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                camera2SessionArr[i12] = Camera2Session.create(z14, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                                Camera2Session camera2Session = this.f28436v0[i12];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.f28426n0[i12] = new Size(this.f28436v0[i12].getPreviewWidth(), this.f28436v0[i12].getPreviewHeight());
                                }
                            }
                        }
                        v();
                        Camera2Session[] camera2SessionArr2 = this.f28436v0;
                        boolean z16 = this.J;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z16 ? 1 : 0];
                        this.f28438w0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z16 ? 1 : 0] == null) {
                            this.f28435u0 = false;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                            sb2.append(this.f28435u0);
                            sb2.append(", initialFacing=");
                            if (this.J) {
                                str = "FRONT";
                            } else {
                                str = "BACK";
                            }
                            sb2.append(str);
                            sb2.append(", frontSession=");
                            if (this.f28436v0[0] != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            sb2.append(z12);
                            sb2.append(", backSession=");
                            if (this.f28436v0[1] != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            sb2.append(z13);
                            FileLog.d(sb2.toString());
                        }
                        if (this.f28438w0 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.f28436v0;
                        boolean z17 = this.J;
                        int i13 = !z17 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z17, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                        camera2SessionArr3[i13] = create;
                        this.f28438w0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.f28426n0[0] = new Size(this.f28438w0.getPreviewWidth(), this.f28438w0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f28429q0 = textureView;
                textureView.setSurfaceTextureListener(new t50(this, 0));
                this.h.addView(this.f28429q0, w7.z5.c(-1.0f, -1));
                this.Y0 = true;
                this.f28415g1 = z10;
                setVisibility(0);
                r(true, z10);
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
        if (this.f28420j0) {
            if (this.f28422k0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f28424l0 = z10;
            this.f28420j0 = false;
            v();
            if (this.m0 != null) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f28411f);
                int i13 = NotificationCenter.recordStopped;
                Integer valueOf = Integer.valueOf(this.V);
                if (this.f28424l0) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, valueOf, Integer.valueOf(i10));
                q();
                x50 x50Var = this.m0;
                boolean z11 = this.f28424l0;
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
                x50Var.b(0L, i11, true, 0, i12);
                this.m0 = null;
            }
            if (this.f28424l0) {
                NotificationCenter.getInstance(this.f28411f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.V), Boolean.TRUE, Integer.valueOf((int) this.f28422k0));
                r(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            f60 f60Var = this.f28419i1;
            f60Var.T.sendMessage(f60Var.T.obtainMessage(4));
            return;
        }
        f60 f60Var2 = this.f28419i1;
        if (f60Var2 != null) {
            f60Var2.T.sendMessage(f60Var2.T.obtainMessage(5));
            c(false);
            c81 c81Var = this.T;
            if (c81Var != null) {
                c81Var.H();
                this.T = null;
            }
            h(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.lockOrientation(this.f28425n.getParentActivity());
            invalidate();
            NotificationCenter.getInstance(this.f28411f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
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
            Collections.sort(arrayList2, new org.telegram.ui.ActionBar.i4(16));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f28428p0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void n() {
        float min;
        if (this.l1 == null) {
            if (this.f28433s0) {
                Camera2Session camera2Session = this.f28438w0;
                if (camera2Session != null) {
                    min = Utilities.clamp(this.S0, camera2Session.getMaxZoom(), this.f28438w0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.S0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.l1 = ofFloat;
                ofFloat.addUpdateListener(new l6(this, 27));
                this.l1.addListener(new o50(this, 1));
                this.l1.setDuration(350L);
                this.l1.setInterpolator(bs.f25025f);
                this.l1.start();
            }
        }
    }

    public final boolean o() {
        int i10;
        int i11;
        if (this.f28433s0) {
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
        Size[] sizeArr = this.f28426n0;
        sizeArr[0] = m10;
        Size m11 = m(pictureSizes);
        this.f28427o0 = m11;
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
                    Size size5 = this.f28427o0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.f28427o0 = size4;
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
                            this.f28427o0 = size9;
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
            org.telegram.messenger.g0.o(sizeArr[0].mHeight, sb2);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f28411f).addObserver(this, NotificationCenter.fileUploaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f28411f).removeObserver(this, NotificationCenter.fileUploaded);
        ei.s2 s2Var = this.f28439x;
        if (s2Var != null) {
            s2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        q50 q50Var = this.h;
        float x10 = q50Var.getX();
        float y3 = q50Var.getY();
        RectF rectF = this.f28432s;
        rectF.set(x10 - AndroidUtilities.dp(8.0f), y3 - AndroidUtilities.dp(8.0f), x10 + q50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y3 + q50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.f28420j0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f28416h0) + this.f28418i0;
            this.f28422k0 = currentTimeMillis;
            this.H = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.H != 0.0f) {
            canvas.save();
            if (!this.O0) {
                canvas.scale(q50Var.getScaleX(), q50Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.H * 360.0f, false, this.f28430r);
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
        if (this.Y0) {
            if (View.MeasureSpec.getSize(i11) - getPaddingBottom() > View.MeasureSpec.getSize(i10) * 1.3f) {
                i12 = AndroidUtilities.roundPlayingMessageSize;
            } else {
                i12 = AndroidUtilities.roundMessageSize;
            }
            if (i12 != this.X0) {
                this.X0 = i12;
                org.telegram.ui.el elVar = this.f28431r0;
                ViewGroup.LayoutParams layoutParams = elVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = elVar.getLayoutParams();
                int i13 = this.X0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                q50 q50Var = this.h;
                ViewGroup.LayoutParams layoutParams3 = q50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = q50Var.getLayoutParams();
                int i14 = this.X0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.G.getLayoutParams()).topMargin = (this.X0 / 2) - AndroidUtilities.dp(24.0f);
                elVar.setRoundRadius(this.X0 / 2);
                q50Var.invalidateOutline();
            }
            this.Y0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ei.s2 s2Var = this.f28439x;
        s2Var.f9767b.measure(makeMeasureSpec, makeMeasureSpec2);
        s2Var.f9768c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.E0 = getMeasuredHeight() / 2.0f;
            w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c81 c81Var;
        float f7;
        float f10;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.f28425n != null && (c81Var = this.T) != null) {
            boolean x10 = c81Var.x();
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
            this.L.addListener(new o50(this, 0));
            this.L.setDuration(180L);
            this.L.setInterpolator(new DecelerateInterpolator());
            this.L.start();
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.T0) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (this.V0 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (this.W0 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.R0;
                    this.S0 = hypot;
                    if (this.f28433s0) {
                        Camera2Session camera2Session = this.f28438w0;
                        if (camera2Session != null) {
                            this.f28438w0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.f28438w0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f28434t0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                        return true;
                    }
                } else {
                    this.T0 = false;
                    n();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.V0 == motionEvent.getPointerId(0) && this.W0 == motionEvent.getPointerId(1)) || (this.V0 == motionEvent.getPointerId(1) && this.W0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.T0) {
                this.T0 = false;
                n();
                return true;
            }
        } else {
            if (this.U0 && !this.T0 && motionEvent.getPointerCount() == 2 && this.l1 == null && this.f28420j0) {
                this.R0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.S0 = 1.0f;
                this.V0 = motionEvent.getPointerId(0);
                this.W0 = motionEvent.getPointerId(1);
                this.T0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                q50 q50Var = this.h;
                rectF.set(q50Var.getX(), q50Var.getY(), q50Var.getX() + q50Var.getMeasuredWidth(), q50Var.getY() + q50Var.getMeasuredHeight());
                this.U0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final void p(String str) {
        if (!BuildVars.LOGS_ENABLED) {
            return;
        }
        long j10 = this.f28442y0;
        long j11 = 0;
        if (j10 != 0) {
            j11 = (SystemClock.elapsedRealtimeNanos() - j10) / 1000000;
        }
        FileLog.d("InstantCamera legacy switch[" + this.f28443z0 + "] " + str + ", path=" + this.C0 + ", elapsedMs=" + j11 + ", thread=" + Thread.currentThread().getName());
    }

    public final void q() {
        Bitmap bitmap = this.f28429q0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f28429q0.getBitmap(), 50, 50, true);
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
        n60 n60Var = this.f29854a;
        if (n60Var != null) {
            ((org.telegram.ui.pe) n60Var).f40203b.f40903wc.a(z10, true);
        }
        AnimatorSet animatorSet = this.f28409e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f28409e0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.el elVar = this.f28431r0;
        q50 q50Var = this.h;
        if (z10 && !this.Q0) {
            q50Var.setTranslationX(0.0f);
            elVar.setTranslationX(0.0f);
            if (z11) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = getMeasuredHeight() / 2.0f;
            }
            this.E0 = measuredHeight;
            w();
        }
        this.Q0 = z10;
        View view = this.P0;
        if (view != null) {
            view.invalidate();
        }
        this.f28409e0 = new AnimatorSet();
        if (!z10 && this.f28422k0 > 300) {
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
        ofFloat.addUpdateListener(new ah.k0(7, this, z11));
        AnimatorSet animatorSet2 = this.f28409e0;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.f28404b1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.G, property, 0.0f);
        r6 r6Var = t6.f30449b;
        if (z10) {
            i10 = 255;
        } else {
            i10 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f28430r, r6Var, i10);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(q50Var, property, f13);
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(q50Var, property2, f14);
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(q50Var, property3, f15);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(q50Var, property4, f7);
        if (z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(elVar, property, f16);
        if (z10) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(elVar, property2, f17);
        if (z10) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(elVar, property3, f18), ObjectAnimator.ofFloat(elVar, property4, f7), ofFloat);
        if (!z10) {
            this.f28409e0.addListener(new o50(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.f28409e0.setDuration(180L);
        this.f28409e0.setInterpolator(new DecelerateInterpolator());
        this.f28409e0.start();
    }

    public final void s() {
        Timer timer = this.f28417h1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f28417h1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        Timer timer2 = new Timer();
        this.f28417h1 = timer2;
        timer2.schedule(new e6.r(this, 2), 0L, 17L);
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
        this.f28404b1.setAlpha(0.0f);
        q50 q50Var = this.h;
        q50Var.setAlpha(0.0f);
        org.telegram.ui.el elVar = this.f28431r0;
        elVar.setAlpha(0.0f);
        ImageView imageView = this.G;
        imageView.setAlpha(0.0f);
        float f12 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.f28415g1) {
            f7 = 1.0f;
        } else {
            f7 = 0.1f;
        }
        q50Var.setScaleX(f7);
        if (this.f28415g1) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        q50Var.setScaleY(f10);
        if (this.f28415g1) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        elVar.setScaleX(f11);
        if (!this.f28415g1) {
            f12 = 0.1f;
        }
        elVar.setScaleY(f12);
        if (q50Var.getMeasuredWidth() != 0) {
            q50Var.setPivotX(q50Var.getMeasuredWidth() / 2);
            q50Var.setPivotY(q50Var.getMeasuredHeight() / 2);
            elVar.setPivotX(elVar.getMeasuredWidth() / 2);
            elVar.setPivotY(elVar.getMeasuredHeight() / 2);
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
        Timer timer = this.f28417h1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f28417h1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void u() {
        int i10;
        String str;
        String str2;
        this.f28442y0 = SystemClock.elapsedRealtimeNanos();
        this.f28443z0++;
        if (this.f28433s0 && this.f28435u0) {
            i10 = 1 - this.f28423k1;
        } else {
            i10 = 0;
        }
        this.A0 = i10;
        this.B0 = true;
        if (this.f28433s0) {
            if (this.f28435u0) {
                str = "DUAL_PREOPENED";
            } else {
                str = "SEQUENTIAL_CAMERA2";
            }
        } else {
            str = "SEQUENTIAL_CAMERA1";
        }
        this.C0 = str;
        StringBuilder sb2 = new StringBuilder("requested: from=");
        String str3 = "BACK";
        if (!this.J) {
            str2 = "BACK";
        } else {
            str2 = "FRONT";
        }
        sb2.append(str2);
        sb2.append(", to=");
        if (!this.J) {
            str3 = "FRONT";
        }
        sb2.append(str3);
        sb2.append(", currentSurface=");
        sb2.append(this.f28423k1);
        sb2.append(", targetSurface=");
        sb2.append(this.A0);
        p(sb2.toString());
        if (!this.f28433s0 || !this.f28435u0) {
            q();
            Bitmap bitmap = this.U;
            if (bitmap != null) {
                this.f28440x0 = false;
                this.f28431r0.setImageBitmap(bitmap);
                this.f28431r0.setAlpha(1.0f);
            }
        }
        this.J = !this.J;
        v();
        if (this.f28433s0) {
            if (this.f28435u0) {
                this.f28438w0 = this.f28436v0[!this.J ? 1 : 0];
                x50 x50Var = this.m0;
                Handler handler = x50Var.getHandler();
                if (handler != null) {
                    x50Var.sendMessage(handler.obtainMessage(4), 0);
                    x50Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f28438w0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f28438w0 = null;
                this.f28436v0[this.J ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.f28436v0;
            boolean z10 = this.J;
            int i11 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i11] = create;
            this.f28438w0 = create;
            if (create == null) {
                this.B0 = false;
                p("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.f28426n0[0] = new Size(this.f28438w0.getPreviewWidth(), this.f28438w0.getPreviewHeight());
            x50 x50Var2 = this.m0;
            Camera2Session camera2Session2 = this.f28438w0;
            Handler handler2 = x50Var2.getHandler();
            if (handler2 != null) {
                x50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        } else {
            CameraSession cameraSession = this.f28434t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f28434t0, null, null);
                this.f28434t0 = null;
            }
        }
        o();
        this.K = false;
        x50 x50Var3 = this.m0;
        Handler handler3 = x50Var3.getHandler();
        if (handler3 != null) {
            x50Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void v() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        if (this.f28410e1 && this.f28420j0 && this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f28413f1 != z10) {
            this.f28413f1 = z10;
            ei.s2 s2Var = this.f28439x;
            if (z10) {
                s2Var.c(null);
            } else {
                s2Var.d();
            }
        }
        if (this.f28433s0) {
            Camera2Session camera2Session = this.f28436v0[1];
            if (camera2Session != null) {
                if (this.f28410e1 && !this.J && this.f28420j0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                camera2Session.setFlash(z12);
            }
        } else {
            CameraSession cameraSession = this.f28434t0;
            if (cameraSession != null) {
                if (this.f28410e1 && !this.J && this.f28420j0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cameraSession.setTorchEnabled(z11);
            }
        }
        ei.q2 q2Var = this.f28437w;
        if (q2Var != null) {
            Boolean bool = this.f28408d1;
            if (bool == null || bool.booleanValue() != this.f28410e1) {
                if (this.f28410e1) {
                    i10 = R.string.AccDescrCameraFlashOff;
                } else {
                    i10 = R.string.AccDescrCameraFlashOn;
                }
                q2Var.setContentDescription(LocaleController.getString(i10));
                boolean z13 = this.f28410e1;
                int i11 = this.f28406c1;
                if (!z13) {
                    if (this.f28441y == null) {
                        vj0 vj0Var = new vj0(R.raw.roundcamera_flash_on, i11, i11);
                        this.f28441y = vj0Var;
                        vj0Var.setCallback(q2Var);
                    }
                    q2Var.setImageDrawable(this.f28441y);
                    if (this.f28408d1 == null) {
                        vj0 vj0Var2 = this.f28441y;
                        vj0Var2.M(vj0Var2.e[0] - 1);
                    } else {
                        this.f28441y.M(0);
                        this.f28441y.start();
                    }
                } else {
                    if (this.E == null) {
                        vj0 vj0Var3 = new vj0(R.raw.roundcamera_flash_off, i11, i11);
                        this.E = vj0Var3;
                        vj0Var3.setCallback(q2Var);
                    }
                    q2Var.setImageDrawable(this.E);
                    if (this.f28408d1 == null) {
                        vj0 vj0Var4 = this.E;
                        vj0Var4.M(vj0Var4.e[0] - 1);
                    } else {
                        this.E.M(0);
                        this.E.start();
                    }
                }
                this.f28408d1 = Boolean.valueOf(this.f28410e1);
            }
        }
    }

    public final void w() {
        this.f28431r0.setTranslationY(this.E0 + this.D0);
        this.h.setTranslationY(this.E0 + this.D0);
    }

    @Override
    public z50 getCameraContainer() {
        return this.h;
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
    }
}
