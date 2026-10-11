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
public final class t60 extends y60 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] f31081m1 = {285904780, -1394191079};
    public volatile int A0;
    public volatile boolean B0;
    public volatile String C0;
    public float D0;
    public dk0 E;
    public float E0;
    public dk0 F;
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
    public l81 T;
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
    public final int[] f31082a0;
    public boolean f31083a1;
    public final int[] f31084b0;
    public final LinearLayout f31085b1;
    public final int[] f31086c0;
    public final int f31087c1;
    public float f31088d0;
    public Boolean f31089d1;
    public AnimatorSet f31090e0;
    public boolean f31091e1;
    public final int f31092f;
    public b60 f31093f0;
    public boolean f31094f1;
    public File f31095g0;
    public boolean f31096g1;
    public final z50 h;
    public long f31097h0;
    public Timer f31098h1;
    public long f31099i0;
    public m60 f31100i1;
    public boolean f31101j0;
    public Bitmap f31102j1;
    public long f31103k0;
    public volatile int f31104k1;
    public boolean f31105l0;
    public ValueAnimator l1;
    public f60 m0;
    public final g60 f31106n;
    public final Size[] f31107n0;
    public Size f31108o0;
    public final Size f31109p0;
    public TextureView f31110q0;
    public final y50 f31111r;
    public final org.telegram.ui.nl f31112r0;
    public final RectF f31113s;
    public final boolean f31114s0;
    public CameraSession f31115t0;
    public boolean f31116u0;
    public final ci.u2 v;
    public final Camera2Session[] f31117v0;
    public final ci.u2 f31118w;
    public Camera2Session f31119w0;
    public final ci.w2 f31120x;
    public boolean f31121x0;
    public dk0 f31122y;
    public volatile long f31123y0;
    public volatile int f31124z0;

    public t60(Context context, g60 g60Var, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        Size size;
        float f7;
        int i10 = UserConfig.selectedAccount;
        this.f31092f = i10;
        this.J = true;
        this.f31082a0 = new int[2];
        this.f31084b0 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f31086c0 = new int[1];
        this.f31088d0 = 1.0f;
        this.f31107n0 = new Size[2];
        if (SharedConfig.roundCamera16to9) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f31109p0 = size;
        this.f31114s0 = SharedConfig.isUsingCamera2(i10);
        this.f31117v0 = new Camera2Session[2];
        this.F0 = new float[16];
        this.G0 = new float[16];
        this.H0 = new float[16];
        if (z10) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        this.f31087c1 = AndroidUtilities.dp(f7);
        this.Z0 = d6Var;
        this.P0 = g60Var.getFragmentView();
        setWillNotDraw(false);
        this.f31106n = g60Var;
        this.V = g60Var.getClassGuid();
        this.R = g60Var.v();
        y50 y50Var = new y50(this, 0);
        this.f31111r = y50Var;
        y50Var.setStyle(Paint.Style.STROKE);
        y50Var.setStrokeCap(Paint.Cap.ROUND);
        y50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        y50Var.setColor(-1);
        this.f31113s = new RectF();
        ci.w2 w2Var = new ci.w2(getContext(), null, this, null);
        this.f31120x = w2Var;
        w2Var.f6194o = 0.5f;
        w2Var.f6193n = ci.w2.f(0.5f);
        w2Var.g();
        addView(w2Var.f6183b, w7.x5.e(-1, -1, 119));
        z50 z50Var = new z50(this, context);
        this.h = z50Var;
        z50Var.setOutlineProvider(new ch.b(this, 2));
        z50Var.setClipToOutline(true);
        z50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(z50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(w2Var.f6184c, w7.x5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31085b1 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.a(56.0f, 1.0f, 0.0f, 0.0f, 0.0f, -2, 83));
        ?? imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.x5.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t60 f31821b;

            {
                this.f31821b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t60 t60Var = this.f31821b;
                        if (t60Var.K) {
                            if (t60Var.f31114s0) {
                                Camera2Session camera2Session = t60Var.f31119w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = t60Var.f31115t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (t60Var.m0 != null) {
                                if (!t60Var.f31116u0) {
                                    t60Var.u();
                                }
                                dk0 dk0Var = t60Var.F;
                                if (dk0Var != null) {
                                    dk0Var.M(0);
                                    t60Var.F.start();
                                }
                                t60Var.O0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(is.h);
                                boolean[] zArr = new boolean[1];
                                w50 w50Var = new w50(t60Var, 0);
                                z50 z50Var2 = t60Var.h;
                                z50Var2.setCameraDistance(z50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.nl nlVar = t60Var.f31112r0;
                                nlVar.setCameraDistance(nlVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new a60(t60Var, zArr, w50Var));
                                ofFloat.addListener(new ai.z4(t60Var, zArr, w50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        t60 t60Var2 = this.f31821b;
                        t60Var2.f31091e1 = true ^ t60Var2.f31091e1;
                        t60Var2.v();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.f31118w = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, w7.x5.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final t60 f31821b;

            {
                this.f31821b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t60 t60Var = this.f31821b;
                        if (t60Var.K) {
                            if (t60Var.f31114s0) {
                                Camera2Session camera2Session = t60Var.f31119w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = t60Var.f31115t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (t60Var.m0 != null) {
                                if (!t60Var.f31116u0) {
                                    t60Var.u();
                                }
                                dk0 dk0Var = t60Var.F;
                                if (dk0Var != null) {
                                    dk0Var.M(0);
                                    t60Var.F.start();
                                }
                                t60Var.O0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(is.h);
                                boolean[] zArr = new boolean[1];
                                w50 w50Var = new w50(t60Var, 0);
                                z50 z50Var2 = t60Var.h;
                                z50Var2.setCameraDistance(z50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.nl nlVar = t60Var.f31112r0;
                                nlVar.setCameraDistance(nlVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new a60(t60Var, zArr, w50Var));
                                ofFloat.addListener(new ai.z4(t60Var, zArr, w50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        t60 t60Var2 = this.f31821b;
                        t60Var2.f31091e1 = true ^ t60Var2.f31091e1;
                        t60Var2.v();
                        return;
                }
            }
        });
        v();
        if (!z10) {
            w2Var.a(imageView);
            w2Var.a(imageView2);
        } else if (!d6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.x5.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.k(-16777216, 40));
        org.telegram.ui.nl nlVar = new org.telegram.ui.nl(this, getContext(), paint);
        this.f31112r0 = nlVar;
        int i12 = AndroidUtilities.roundPlayingMessageSize;
        addView(nlVar, new FrameLayout.LayoutParams(i12, i12, 17));
        this.f31096g1 = false;
        setVisibility(4);
    }

    public static int j(t60 t60Var, int i10, String str) {
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
                if (f31081m1[i10] == hashCode) {
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
            if (f31081m1[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        t();
        l81 l81Var = this.T;
        if (l81Var != null) {
            l81Var.H();
            this.T = null;
        }
        if (this.f31110q0 == null) {
            return;
        }
        this.f31105l0 = true;
        this.f31101j0 = false;
        this.f31091e1 = false;
        v();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f31092f);
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
            m60 m60Var = this.f31100i1;
            if (m60Var != null) {
                m60Var.i(0, new i60(0L, 0, 0, true, 0L));
            }
        }
        if (this.f31093f0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.f31093f0.delete();
            AutoDeleteMediaTask.unlockFile(this.f31093f0);
            this.f31093f0 = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        r(false, false);
        invalidate();
    }

    @Override
    public final void b(float f7, int i10) {
        l81 l81Var = this.T;
        if (l81Var != null) {
            if (i10 == 0) {
                s();
                this.T.C();
            } else if (i10 == 1) {
                t();
                this.T.B();
            } else if (i10 == 2) {
                l81Var.L(f7 * ((float) l81Var.p()), false);
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        CountDownLatch countDownLatch;
        ViewGroup viewGroup;
        if (this.f31114s0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.f31117v0;
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
            CameraSession cameraSession = this.f31115t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f31115t0;
                if (!z10) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
        z50 z50Var = this.h;
        z50Var.setTranslationX(0.0f);
        this.f31112r0.setTranslationX(0.0f);
        this.E0 = 0.0f;
        w();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.f31110q0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f31110q0);
        }
        this.f31110q0 = null;
        z50Var.setImageReceiver(null);
    }

    @Override
    public final boolean d() {
        return !this.f31101j0;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            b60 b60Var = this.f31093f0;
            if (b60Var != null && b60Var.getAbsolutePath().equals(str)) {
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
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        boolean z11;
        char c10;
        int i13;
        int i14;
        long j11;
        if (this.f31110q0 != null) {
            t();
            l81 l81Var = this.T;
            if (l81Var != null) {
                l81Var.H();
                this.T = null;
            }
            int i15 = 4;
            int i16 = this.f31092f;
            if (i10 == 4) {
                m60 m60Var = this.f31100i1;
                if (m60Var != null && this.f31103k0 > 800) {
                    m60Var.i(1, new i60(j3, i11, i12, z10, j10));
                    return;
                }
                if (BuildVars.DEBUG_VERSION && !this.f31093f0.exists()) {
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
                    FileLoader.getInstance(i16).cancelFileUpload(this.f31093f0.getAbsolutePath(), false);
                } else {
                    this.S.estimatedSize = Math.max(1L, this.Q);
                }
                VideoEditedInfo videoEditedInfo4 = this.S;
                videoEditedInfo4.file = this.M;
                videoEditedInfo4.encryptedFile = this.N;
                videoEditedInfo4.key = this.O;
                videoEditedInfo4.iv = this.P;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.f31093f0.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = i12;
                photoEntry.effectId = j3;
                this.f31106n.r(photoEntry, this.S, z10, i11, 0, false, j10);
                if (i11 != 0) {
                    r(false, false);
                }
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            if (this.f31103k0 < 800) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f31105l0 = z11;
            this.f31101j0 = false;
            this.f31091e1 = false;
            v();
            if (!this.f31105l0) {
                if (i10 == 3) {
                    i15 = 2;
                } else {
                    i15 = 5;
                }
            }
            f60 f60Var = this.m0;
            int i17 = this.V;
            if (f60Var != null) {
                c10 = 1;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i17), Integer.valueOf(i15));
                if (this.f31105l0) {
                    i14 = 0;
                } else if (i10 == 3) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                q();
                i13 = i17;
                this.m0.b(j3, i14, z10, i11, i12);
                this.m0 = null;
            } else {
                c10 = 1;
                i13 = i17;
            }
            if (this.f31105l0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i16);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.f31103k0);
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
    public final void g(ah.c cVar, org.telegram.ui.kj kjVar) {
        View view = this.f31085b1;
        ch.d c10 = cVar.c(view, kjVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public View getButtonsLayout() {
        return this.f31085b1;
    }

    @Override
    public RectF getCameraRect() {
        z50 z50Var = this.h;
        int[] iArr = this.f31082a0;
        z50Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], z50Var.getWidth() + i10, z50Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.G;
    }

    @Override
    public Paint getPaint() {
        return this.f31111r;
    }

    @Override
    public TextureView getTextureView() {
        return this.f31110q0;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.f31110q0 == null) {
            if (this.F == null) {
                int i10 = R.raw.roundcamera_flip;
                int i11 = this.f31087c1;
                dk0 dk0Var = new dk0(i10, i11, i11);
                this.F = dk0Var;
                dk0Var.M(0);
                this.F.setCallback(this.v);
            }
            this.v.setImageDrawable(this.F);
            this.f31112r0.setAlpha(1.0f);
            this.f31112r0.invalidate();
            if (this.U == null) {
                try {
                    this.U = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.U;
            if (bitmap != null) {
                this.f31112r0.setImageBitmap(bitmap);
            } else {
                this.f31112r0.setImageResource(R.drawable.icplaceholder);
            }
            this.K = false;
            this.I = null;
            if (!z10) {
                if (!this.f31114s0) {
                    this.J = true;
                }
                v();
                this.f31103k0 = 0L;
                this.H = 0.0f;
            }
            this.f31105l0 = false;
            this.M = null;
            this.N = null;
            this.O = null;
            this.P = null;
            this.f31121x0 = true;
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
                    this.f31093f0 = new File(FileLoader.getDirectory(3), System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
                }
                SharedConfig.saveConfig();
                AutoDeleteMediaTask.lockFile(this.f31093f0);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera show round camera " + this.f31093f0.getAbsolutePath());
                }
                if (this.f31114s0) {
                    Context context = getContext();
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z15 = globalMainSettings.getBoolean("rounddual_available", z11);
                    this.f31116u0 = z15;
                    if (z15) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            Camera2Session[] camera2SessionArr = this.f31117v0;
                            if (camera2SessionArr[i12] == null) {
                                if (i12 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                camera2SessionArr[i12] = Camera2Session.create(z14, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                                Camera2Session camera2Session = this.f31117v0[i12];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.f31107n0[i12] = new Size(this.f31117v0[i12].getPreviewWidth(), this.f31117v0[i12].getPreviewHeight());
                                }
                            }
                        }
                        v();
                        Camera2Session[] camera2SessionArr2 = this.f31117v0;
                        boolean z16 = this.J;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z16 ? 1 : 0];
                        this.f31119w0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z16 ? 1 : 0] == null) {
                            this.f31116u0 = false;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                            sb2.append(this.f31116u0);
                            sb2.append(", initialFacing=");
                            if (this.J) {
                                str = "FRONT";
                            } else {
                                str = "BACK";
                            }
                            sb2.append(str);
                            sb2.append(", frontSession=");
                            if (this.f31117v0[0] != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            sb2.append(z12);
                            sb2.append(", backSession=");
                            if (this.f31117v0[1] != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            sb2.append(z13);
                            FileLog.d(sb2.toString());
                        }
                        if (this.f31119w0 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.f31117v0;
                        boolean z17 = this.J;
                        int i13 = !z17 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z17, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                        camera2SessionArr3[i13] = create;
                        this.f31119w0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.f31107n0[0] = new Size(this.f31119w0.getPreviewWidth(), this.f31119w0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f31110q0 = textureView;
                textureView.setSurfaceTextureListener(new ki.e(this, 1));
                this.h.addView(this.f31110q0, w7.x5.d(-1.0f, -1));
                this.Y0 = true;
                this.f31096g1 = z10;
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
        if (this.f31101j0) {
            if (this.f31103k0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f31105l0 = z10;
            this.f31101j0 = false;
            v();
            if (this.m0 != null) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f31092f);
                int i13 = NotificationCenter.recordStopped;
                Integer valueOf = Integer.valueOf(this.V);
                if (this.f31105l0) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, valueOf, Integer.valueOf(i10));
                q();
                f60 f60Var = this.m0;
                boolean z11 = this.f31105l0;
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
                f60Var.b(0L, i11, true, 0, i12);
                this.m0 = null;
            }
            if (this.f31105l0) {
                NotificationCenter.getInstance(this.f31092f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.V), Boolean.TRUE, Integer.valueOf((int) this.f31103k0));
                r(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            m60 m60Var = this.f31100i1;
            m60Var.T.sendMessage(m60Var.T.obtainMessage(4));
            return;
        }
        m60 m60Var2 = this.f31100i1;
        if (m60Var2 != null) {
            m60Var2.T.sendMessage(m60Var2.T.obtainMessage(5));
            c(false);
            l81 l81Var = this.T;
            if (l81Var != null) {
                l81Var.H();
                this.T = null;
            }
            h(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.lockOrientation(this.f31106n.getParentActivity());
            invalidate();
            NotificationCenter.getInstance(this.f31092f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
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
            Collections.sort(arrayList2, new org.telegram.ui.ff(9));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f31109p0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void n() {
        float min;
        if (this.l1 == null) {
            if (this.f31114s0) {
                Camera2Session camera2Session = this.f31119w0;
                if (camera2Session != null) {
                    min = Utilities.clamp(this.S0, camera2Session.getMaxZoom(), this.f31119w0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.S0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.l1 = ofFloat;
                ofFloat.addUpdateListener(new m6(this, 27));
                this.l1.addListener(new x50(this, 1));
                this.l1.setDuration(350L);
                this.l1.setInterpolator(is.f27500f);
                this.l1.start();
            }
        }
    }

    public final boolean o() {
        int i10;
        int i11;
        if (this.f31114s0) {
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
        Size[] sizeArr = this.f31107n0;
        sizeArr[0] = m10;
        Size m11 = m(pictureSizes);
        this.f31108o0 = m11;
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
                    Size size5 = this.f31108o0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.f31108o0 = size4;
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
                            this.f31108o0 = size9;
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

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f31092f).addObserver(this, NotificationCenter.fileUploaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f31092f).removeObserver(this, NotificationCenter.fileUploaded);
        ci.w2 w2Var = this.f31120x;
        if (w2Var != null) {
            w2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        z50 z50Var = this.h;
        float x10 = z50Var.getX();
        float y3 = z50Var.getY();
        RectF rectF = this.f31113s;
        rectF.set(x10 - AndroidUtilities.dp(8.0f), y3 - AndroidUtilities.dp(8.0f), x10 + z50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y3 + z50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.f31101j0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f31097h0) + this.f31099i0;
            this.f31103k0 = currentTimeMillis;
            this.H = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.H != 0.0f) {
            canvas.save();
            if (!this.O0) {
                canvas.scale(z50Var.getScaleX(), z50Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.H * 360.0f, false, this.f31111r);
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
                org.telegram.ui.nl nlVar = this.f31112r0;
                ViewGroup.LayoutParams layoutParams = nlVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = nlVar.getLayoutParams();
                int i13 = this.X0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                z50 z50Var = this.h;
                ViewGroup.LayoutParams layoutParams3 = z50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = z50Var.getLayoutParams();
                int i14 = this.X0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.G.getLayoutParams()).topMargin = (this.X0 / 2) - AndroidUtilities.dp(24.0f);
                nlVar.setRoundRadius(this.X0 / 2);
                z50Var.invalidateOutline();
            }
            this.Y0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ci.w2 w2Var = this.f31120x;
        w2Var.f6183b.measure(makeMeasureSpec, makeMeasureSpec2);
        w2Var.f6184c.measure(makeMeasureSpec, makeMeasureSpec2);
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
        l81 l81Var;
        float f7;
        float f10;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.f31106n != null && (l81Var = this.T) != null) {
            boolean x10 = l81Var.x();
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
            this.L.addListener(new x50(this, 0));
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
                    if (this.f31114s0) {
                        Camera2Session camera2Session = this.f31119w0;
                        if (camera2Session != null) {
                            this.f31119w0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.f31119w0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f31115t0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
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
            if (this.U0 && !this.T0 && motionEvent.getPointerCount() == 2 && this.l1 == null && this.f31101j0) {
                this.R0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.S0 = 1.0f;
                this.V0 = motionEvent.getPointerId(0);
                this.W0 = motionEvent.getPointerId(1);
                this.T0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                z50 z50Var = this.h;
                rectF.set(z50Var.getX(), z50Var.getY(), z50Var.getX() + z50Var.getMeasuredWidth(), z50Var.getY() + z50Var.getMeasuredHeight());
                this.U0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final void p(String str) {
        if (!BuildVars.LOGS_ENABLED) {
            return;
        }
        long j3 = this.f31123y0;
        long j10 = 0;
        if (j3 != 0) {
            j10 = (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
        }
        FileLog.d("InstantCamera legacy switch[" + this.f31124z0 + "] " + str + ", path=" + this.C0 + ", elapsedMs=" + j10 + ", thread=" + Thread.currentThread().getName());
    }

    public final void q() {
        Bitmap bitmap = this.f31110q0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f31110q0.getBitmap(), 50, 50, true);
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
        u60 u60Var = this.f33156a;
        if (u60Var != null) {
            ((org.telegram.ui.qe) u60Var).f41190b.f45007vc.a(z10, true);
        }
        AnimatorSet animatorSet = this.f31090e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f31090e0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.nl nlVar = this.f31112r0;
        z50 z50Var = this.h;
        if (z10 && !this.Q0) {
            z50Var.setTranslationX(0.0f);
            nlVar.setTranslationX(0.0f);
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
        this.f31090e0 = new AnimatorSet();
        if (!z10 && this.f31103k0 > 300) {
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
        ofFloat.addUpdateListener(new ai.cb(6, this, z11));
        AnimatorSet animatorSet2 = this.f31090e0;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.f31085b1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.G, property, 0.0f);
        s6 s6Var = u6.f31449b;
        if (z10) {
            i10 = 255;
        } else {
            i10 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f31111r, s6Var, i10);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(z50Var, property, f13);
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(z50Var, property2, f14);
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(z50Var, property3, f15);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(z50Var, property4, f7);
        if (z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(nlVar, property, f16);
        if (z10) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(nlVar, property2, f17);
        if (z10) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(nlVar, property3, f18), ObjectAnimator.ofFloat(nlVar, property4, f7), ofFloat);
        if (!z10) {
            this.f31090e0.addListener(new x50(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.f31090e0.setDuration(180L);
        this.f31090e0.setInterpolator(new DecelerateInterpolator());
        this.f31090e0.start();
    }

    public final void s() {
        Timer timer = this.f31098h1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f31098h1 = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        Timer timer2 = new Timer();
        this.f31098h1 = timer2;
        timer2.schedule(new ci.n2(this, 2), 0L, 17L);
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
        this.f31085b1.setAlpha(0.0f);
        z50 z50Var = this.h;
        z50Var.setAlpha(0.0f);
        org.telegram.ui.nl nlVar = this.f31112r0;
        nlVar.setAlpha(0.0f);
        ImageView imageView = this.G;
        imageView.setAlpha(0.0f);
        float f12 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.f31096g1) {
            f7 = 1.0f;
        } else {
            f7 = 0.1f;
        }
        z50Var.setScaleX(f7);
        if (this.f31096g1) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        z50Var.setScaleY(f10);
        if (this.f31096g1) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        nlVar.setScaleX(f11);
        if (!this.f31096g1) {
            f12 = 0.1f;
        }
        nlVar.setScaleY(f12);
        if (z50Var.getMeasuredWidth() != 0) {
            z50Var.setPivotX(z50Var.getMeasuredWidth() / 2);
            z50Var.setPivotY(z50Var.getMeasuredHeight() / 2);
            nlVar.setPivotX(nlVar.getMeasuredWidth() / 2);
            nlVar.setPivotY(nlVar.getMeasuredHeight() / 2);
        }
        try {
            if (i10 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void t() {
        Timer timer = this.f31098h1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f31098h1 = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void u() {
        int i10;
        String str;
        String str2;
        this.f31123y0 = SystemClock.elapsedRealtimeNanos();
        this.f31124z0++;
        if (this.f31114s0 && this.f31116u0) {
            i10 = 1 - this.f31104k1;
        } else {
            i10 = 0;
        }
        this.A0 = i10;
        this.B0 = true;
        if (this.f31114s0) {
            if (this.f31116u0) {
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
        sb2.append(this.f31104k1);
        sb2.append(", targetSurface=");
        sb2.append(this.A0);
        p(sb2.toString());
        if (!this.f31114s0 || !this.f31116u0) {
            q();
            Bitmap bitmap = this.U;
            if (bitmap != null) {
                this.f31121x0 = false;
                this.f31112r0.setImageBitmap(bitmap);
                this.f31112r0.setAlpha(1.0f);
            }
        }
        this.J = !this.J;
        v();
        if (this.f31114s0) {
            if (this.f31116u0) {
                this.f31119w0 = this.f31117v0[!this.J ? 1 : 0];
                f60 f60Var = this.m0;
                Handler handler = f60Var.getHandler();
                if (handler != null) {
                    f60Var.sendMessage(handler.obtainMessage(4), 0);
                    f60Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f31119w0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f31119w0 = null;
                this.f31117v0[this.J ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.f31117v0;
            boolean z10 = this.J;
            int i11 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i11] = create;
            this.f31119w0 = create;
            if (create == null) {
                this.B0 = false;
                p("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.f31107n0[0] = new Size(this.f31119w0.getPreviewWidth(), this.f31119w0.getPreviewHeight());
            f60 f60Var2 = this.m0;
            Camera2Session camera2Session2 = this.f31119w0;
            Handler handler2 = f60Var2.getHandler();
            if (handler2 != null) {
                f60Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        } else {
            CameraSession cameraSession = this.f31115t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f31115t0, null, null);
                this.f31115t0 = null;
            }
        }
        o();
        this.K = false;
        f60 f60Var3 = this.m0;
        Handler handler3 = f60Var3.getHandler();
        if (handler3 != null) {
            f60Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void v() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        if (this.f31091e1 && this.f31101j0 && this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f31094f1 != z10) {
            this.f31094f1 = z10;
            ci.w2 w2Var = this.f31120x;
            if (z10) {
                w2Var.c(null);
            } else {
                w2Var.d();
            }
        }
        if (this.f31114s0) {
            Camera2Session camera2Session = this.f31117v0[1];
            if (camera2Session != null) {
                if (this.f31091e1 && !this.J && this.f31101j0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                camera2Session.setFlash(z12);
            }
        } else {
            CameraSession cameraSession = this.f31115t0;
            if (cameraSession != null) {
                if (this.f31091e1 && !this.J && this.f31101j0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cameraSession.setTorchEnabled(z11);
            }
        }
        ci.u2 u2Var = this.f31118w;
        if (u2Var != null) {
            Boolean bool = this.f31089d1;
            if (bool == null || bool.booleanValue() != this.f31091e1) {
                if (this.f31091e1) {
                    i10 = R.string.AccDescrCameraFlashOff;
                } else {
                    i10 = R.string.AccDescrCameraFlashOn;
                }
                u2Var.setContentDescription(LocaleController.getString(i10));
                boolean z13 = this.f31091e1;
                int i11 = this.f31087c1;
                if (!z13) {
                    if (this.f31122y == null) {
                        dk0 dk0Var = new dk0(R.raw.roundcamera_flash_on, i11, i11);
                        this.f31122y = dk0Var;
                        dk0Var.setCallback(u2Var);
                    }
                    u2Var.setImageDrawable(this.f31122y);
                    if (this.f31089d1 == null) {
                        dk0 dk0Var2 = this.f31122y;
                        dk0Var2.M(dk0Var2.f25810e[0] - 1);
                    } else {
                        this.f31122y.M(0);
                        this.f31122y.start();
                    }
                } else {
                    if (this.E == null) {
                        dk0 dk0Var3 = new dk0(R.raw.roundcamera_flash_off, i11, i11);
                        this.E = dk0Var3;
                        dk0Var3.setCallback(u2Var);
                    }
                    u2Var.setImageDrawable(this.E);
                    if (this.f31089d1 == null) {
                        dk0 dk0Var4 = this.E;
                        dk0Var4.M(dk0Var4.f25810e[0] - 1);
                    } else {
                        this.E.M(0);
                        this.E.start();
                    }
                }
                this.f31089d1 = Boolean.valueOf(this.f31091e1);
            }
        }
    }

    public final void w() {
        this.f31112r0.setTranslationY(this.E0 + this.D0);
        this.h.setTranslationY(this.E0 + this.D0);
    }

    @Override
    public h60 getCameraContainer() {
        return this.h;
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
    }
}
