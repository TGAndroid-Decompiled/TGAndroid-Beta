package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class o60 extends u60 {
    public static final int K0 = 0;
    public int A0;
    public boolean B0;
    public boolean C0;
    public float D0;
    public final LinearLayout E;
    public int E0;
    public final fi.o2 F;
    public long F0;
    public final fi.o2 G;
    public boolean G0;
    public final ImageView H;
    public boolean H0;
    public final fi.q2 I;
    public final j60 I0;
    public final int[] J;
    public final li.e3 J0;
    public final Matrix K;
    public final float[] L;
    public final Paint M;
    public final int N;
    public vi.u0 O;
    public vi.s0 P;
    public vi.t0 Q;
    public vi.m0 R;
    public m11 S;
    public VideoEditedInfo T;
    public n60 U;
    public boolean V;
    public AnimatorSet W;
    public ValueAnimator f31172a0;
    public ValueAnimator f31173b0;
    public final yj0 f31174c0;
    public yj0 f31175d0;
    public final a60 e;
    public yj0 f31176e0;
    public final int f31177f;
    public boolean f31178f0;
    public boolean f31179g0;
    public final int h;
    public boolean f31180h0;
    public boolean f31181i0;
    public boolean f31182j0;
    public boolean f31183k0;
    public boolean f31184l0;
    public boolean m0;
    public final boolean f31185n;
    public boolean f31186n0;
    public boolean f31187o0;
    public boolean f31188p0;
    public boolean f31189q0;
    public final View f31190r;
    public long f31191r0;
    public final m60 f31192s;
    public int f31193s0;
    public Bitmap f31194t0;
    public long f31195u0;
    public final en0 v;
    public float f31196v0;
    public final FrameLayout f31197w;
    public float f31198w0;
    public final l60 f31199x;
    public float f31200x0;
    public final org.telegram.ui.il f31201y;
    public float f31202y0;
    public int f31203z0;

    public o60(Activity activity, a60 a60Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        this.f31177f = UserConfig.selectedAccount;
        this.J = new int[2];
        this.K = new Matrix();
        this.L = new float[9];
        this.M = new Paint(3);
        this.f31203z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new j60(this, 0);
        this.J0 = new li.e3(this, 9);
        this.e = a60Var;
        this.h = a60Var.getClassGuid();
        this.f31185n = a60Var.w();
        this.f31190r = a60Var.getFragmentView();
        setWillNotDraw(false);
        fi.q2 q2Var = new fi.q2(activity, null, this, null);
        this.I = q2Var;
        q2Var.f11475o = 0.5f;
        q2Var.f11474n = fi.q2.f(0.5f);
        q2Var.g();
        addView(q2Var.f11465b, kb1.i(-1, -1, 119));
        m60 m60Var = new m60(this, activity);
        this.f31192s = m60Var;
        en0 en0Var = new en0(activity);
        this.v = en0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f31197w = frameLayout;
        l60 l60Var = new l60(this, activity, 0);
        l60Var.setOpaque(true);
        l60Var.setClickable(true);
        l60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        l60Var.setOutlineProvider(new ag.v0(15));
        l60Var.setClipToOutline(true);
        this.f31199x = l60Var;
        frameLayout.addView(l60Var, kb1.i(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, activity, paint);
        this.f31201y = ilVar;
        ilVar.setOutlineProvider(new ag.v0(14));
        ilVar.setClipToOutline(true);
        frameLayout.addView(ilVar, kb1.i(-1, -1, 119));
        en0Var.addView(frameLayout, kb1.h(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        m60Var.addView(en0Var, kb1.i(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(m60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(q2Var.f11466c, kb1.i(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, kb1.h(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.F = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, kb1.r(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final o60 f29868b;

            {
                this.f29868b = this;
            }

            @Override
            public final void onClick(View view) {
                vi.t0 t0Var;
                vi.m0 m0Var;
                boolean z10;
                vi.t0 t0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        o60 o60Var = this.f29868b;
                        vi.u0 u0Var = o60Var.O;
                        if (u0Var != null && (t0Var = o60Var.Q) != null && (m0Var = o60Var.R) != null && t0Var.f50625a == 3 && !t0Var.f50628f && !o60Var.f31186n0) {
                            vi.n0 n0Var = m0Var.f50551a;
                            vi.n0 n0Var2 = vi.n0.f50557a;
                            if (n0Var == n0Var2) {
                                n0Var2 = vi.n0.f50558b;
                            }
                            u0Var.getClass();
                            vi.u0.u();
                            int i12 = u0Var.Z;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (u0Var.f50648r != n0Var2) {
                                    u0Var.f50643m.b("camera facing requested: " + u0Var.f50648r + " -> " + n0Var2 + ", state=" + b10.x(u0Var.Z));
                                    u0Var.f50648r = n0Var2;
                                    int i13 = u0Var.Z;
                                    if (i13 == 3 || i13 == 2) {
                                        u0Var.e();
                                        vi.j jVar = u0Var.f50642l;
                                        jVar.F = n0Var2;
                                        Handler handler = jVar.f50473n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new s9.g(27, jVar, n0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        u0Var.f50654y = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                o60Var.f31174c0.M(0);
                                o60Var.f31174c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o60 o60Var2 = this.f29868b;
                        vi.u0 u0Var2 = o60Var2.O;
                        if (u0Var2 != null && (t0Var2 = o60Var2.Q) != null && o60Var2.R != null) {
                            boolean z11 = !t0Var2.f50629g;
                            vi.j jVar2 = u0Var2.f50642l;
                            vi.u0.u();
                            if (u0Var2.Z == 3 && !u0Var2.f50654y && (i11 = u0Var2.f50634a0) != 1) {
                                u0Var2.f50652w = z11;
                                if (i11 == 3) {
                                    u0Var2.v(z11);
                                    jVar2.T(false);
                                } else {
                                    u0Var2.v(false);
                                    jVar2.T(z11);
                                }
                                u0Var2.o();
                                o60Var2.C();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(activity);
        this.G = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, kb1.r(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final o60 f29868b;

            {
                this.f29868b = this;
            }

            @Override
            public final void onClick(View view) {
                vi.t0 t0Var;
                vi.m0 m0Var;
                boolean z10;
                vi.t0 t0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        o60 o60Var = this.f29868b;
                        vi.u0 u0Var = o60Var.O;
                        if (u0Var != null && (t0Var = o60Var.Q) != null && (m0Var = o60Var.R) != null && t0Var.f50625a == 3 && !t0Var.f50628f && !o60Var.f31186n0) {
                            vi.n0 n0Var = m0Var.f50551a;
                            vi.n0 n0Var2 = vi.n0.f50557a;
                            if (n0Var == n0Var2) {
                                n0Var2 = vi.n0.f50558b;
                            }
                            u0Var.getClass();
                            vi.u0.u();
                            int i12 = u0Var.Z;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (u0Var.f50648r != n0Var2) {
                                    u0Var.f50643m.b("camera facing requested: " + u0Var.f50648r + " -> " + n0Var2 + ", state=" + b10.x(u0Var.Z));
                                    u0Var.f50648r = n0Var2;
                                    int i13 = u0Var.Z;
                                    if (i13 == 3 || i13 == 2) {
                                        u0Var.e();
                                        vi.j jVar = u0Var.f50642l;
                                        jVar.F = n0Var2;
                                        Handler handler = jVar.f50473n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new s9.g(27, jVar, n0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        u0Var.f50654y = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                o60Var.f31174c0.M(0);
                                o60Var.f31174c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o60 o60Var2 = this.f29868b;
                        vi.u0 u0Var2 = o60Var2.O;
                        if (u0Var2 != null && (t0Var2 = o60Var2.Q) != null && o60Var2.R != null) {
                            boolean z11 = !t0Var2.f50629g;
                            vi.j jVar2 = u0Var2.f50642l;
                            vi.u0.u();
                            if (u0Var2.Z == 3 && !u0Var2.f50654y && (i11 = u0Var2.f50634a0) != 1) {
                                u0Var2.f50652w = z11;
                                if (i11 == 3) {
                                    u0Var2.v(z11);
                                    jVar2.T(false);
                                } else {
                                    u0Var2.v(false);
                                    jVar2.T(z11);
                                }
                                u0Var2.o();
                                o60Var2.C();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.N = dp;
        yj0 yj0Var = new yj0(R.raw.roundcamera_flip, dp, dp);
        this.f31174c0 = yj0Var;
        yj0Var.setCallback(imageView);
        yj0Var.M(yj0Var.e[0] - 1);
        imageView.setImageDrawable(yj0Var);
        C();
        if (u6Var != null && !u6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.H = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, kb1.i(48, 48, 17));
        l60Var.setOnTouchListener(new rk(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f31191r0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f31191r0);
    }

    private long getCurrentDurationMs() {
        vi.t0 t0Var;
        vi.u0 u0Var = this.O;
        if (u0Var != null && (t0Var = this.Q) != null) {
            if (t0Var.f50625a == 3) {
                return u0Var.j();
            }
            return t0Var.f50626b;
        }
        return 0L;
    }

    public static void m(o60 o60Var) {
        if (o60Var.f31186n0 && o60Var.f31189q0 && o60Var.f31187o0 && o60Var.f31188p0) {
            o60Var.f31186n0 = false;
            FileLog.d("RoundVideo camera flip completed: elapsedMs=" + o60Var.getCameraFlipElapsedMs());
            o60Var.B();
        }
    }

    public static void n(o60 o60Var) {
        org.telegram.ui.il ilVar = o60Var.f31201y;
        if (!o60Var.f31184l0) {
            return;
        }
        o60Var.f31184l0 = false;
        ilVar.invalidate();
        ilVar.animate().cancel();
        ilVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.jk jkVar;
        if (z10 != this.G0) {
            this.G0 = z10;
            this.F0 = 0L;
            j60 j60Var = this.I0;
            if (z10) {
                ag.n.d().a(30, j60Var);
            } else {
                ag.n.d().g(j60Var);
            }
            if (this.d != z10) {
                this.d = z10;
                s60 s60Var = this.f33242c;
                if (s60Var != null && (jkVar = ((org.telegram.ui.nj) s60Var).f41813a.Y) != null) {
                    jkVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = AndroidUtilities.findActivity(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        fi.q2 q2Var = this.I;
        if (z10) {
            if (Float.isNaN(this.D0)) {
                this.D0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            q2Var.c(null);
        } else {
            if (!Float.isNaN(this.D0)) {
                attributes.screenBrightness = this.D0;
                this.D0 = Float.NaN;
            }
            q2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        if (!this.C0) {
            return;
        }
        this.C0 = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public final void B() {
        boolean z10;
        vi.m0 m0Var;
        vi.t0 t0Var = this.Q;
        boolean z11 = false;
        if (t0Var != null && t0Var.f50625a == 3 && !t0Var.f50628f && !this.f31186n0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.F.setEnabled(z10);
        if (z10 && (m0Var = this.R) != null && m0Var.f50552b != 1) {
            z11 = true;
        }
        this.G.setEnabled(z11);
        C();
    }

    public final void C() {
        vi.t0 t0Var = this.Q;
        int i10 = this.N;
        fi.o2 o2Var = this.G;
        if (t0Var != null && t0Var.f50629g) {
            if (this.f31176e0 == null) {
                yj0 yj0Var = new yj0(R.raw.roundcamera_flash_off, i10, i10);
                this.f31176e0 = yj0Var;
                yj0Var.setCallback(o2Var);
            }
            o2Var.setImageDrawable(this.f31176e0);
            return;
        }
        if (this.f31175d0 == null) {
            yj0 yj0Var2 = new yj0(R.raw.roundcamera_flash_on, i10, i10);
            this.f31175d0 = yj0Var2;
            yj0Var2.setCallback(o2Var);
        }
        o2Var.setImageDrawable(this.f31175d0);
    }

    public final void D() {
        org.telegram.ui.jk jkVar;
        float f7;
        vi.t0 t0Var = this.Q;
        if (t0Var != null) {
            long j10 = t0Var.d;
            if (t0Var.f50625a == 3) {
                long min = Math.min(j10, (SystemClock.elapsedRealtime() + t0Var.f50626b) - t0Var.f50627c);
                this.f31195u0 = min;
                this.v.setProgress(((float) min) / ((float) j10));
                s60 s60Var = this.f33242c;
                if (s60Var != null && (jkVar = ((org.telegram.ui.nj) s60Var).f41813a.Y) != null && jkVar.f25904j1) {
                    jkVar.f25898i1 = min;
                    xg xgVar = jkVar.Y0;
                    if (xgVar != null && xgVar.f34757r) {
                        xgVar.h = min;
                        xgVar.invalidate();
                    }
                    ug ugVar = jkVar.l1;
                    if (ugVar != null && ugVar.f33390n) {
                        if (!ugVar.h) {
                            long j11 = ugVar.f33391r;
                            if (j11 >= 0) {
                                if (!ugVar.e) {
                                    long max = Math.max(0L, min - j11) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    ugVar.f33386a = f7;
                                }
                                ugVar.invalidate();
                            }
                        }
                        ugVar.f33391r = min;
                        ugVar.f33386a = 1.0f;
                        ugVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = jkVar.f25910k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f26011n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        vi.u0 u0Var = this.O;
        if (u0Var != null && u0Var.a()) {
            this.U = null;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 6;
            }
            x(i10);
            m11 m11Var = this.S;
            if (m11Var != null) {
                m11Var.d(true);
            }
            this.S = null;
            MediaController.getInstance().requestRecordAudioFocus(false);
            z(false, false);
        }
    }

    @Override
    public final void b(float f7, int i10) {
        vi.t0 t0Var;
        if (this.O != null && (t0Var = this.Q) != null && t0Var.f50625a == 5) {
            p();
            if (i10 == 0) {
                this.O.r();
            } else if (i10 == 1) {
                this.O.p();
            } else if (i10 == 2) {
                vi.u0 u0Var = this.O;
                long j10 = f7 * ((float) this.Q.f50626b);
                u0Var.getClass();
                vi.u0.u();
                if (u0Var.Z == 5 && u0Var.V != null) {
                    long j11 = u0Var.J;
                    u0Var.V.Z0(5, Math.max(j11, Math.min(Math.max(j11, u0Var.K - 1), j10)));
                    u0Var.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        r();
        ValueAnimator valueAnimator = this.f31172a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        vi.u0 u0Var = this.O;
        if (u0Var != null) {
            vi.u0.u();
            int i10 = u0Var.Z;
            if (i10 == 10) {
                if (!u0Var.F) {
                    u0Var.i();
                }
            } else if (i10 != 8) {
                u0Var.a();
            } else {
                u0Var.e();
                u0Var.s();
                u0Var.f50642l.M();
                u0Var.F = true;
                u0Var.w(10);
                u0Var.m("released");
                u0Var.f50639i.removeCallbacksAndMessages(null);
                u0Var.f50640j.shutdown();
                u0Var.f50641k.shutdown();
            }
            this.O = null;
        }
        m11 m11Var = this.S;
        if (m11Var != null) {
            m11Var.d(true ^ this.f31182j0);
            this.S = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        A();
        m60 m60Var = this.f31192s;
        m60Var.setTranslationX(0.0f);
        this.f31198w0 = 0.0f;
        m60Var.setTranslationY(0.0f + this.f31196v0);
        m60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean e() {
        vi.t0 t0Var = this.Q;
        if (t0Var != null) {
            int i10 = t0Var.f50625a;
            if (i10 == 4 || i10 == 5 || i10 == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(float f7) {
        float f10 = f7 * 0.5f;
        this.f31196v0 = f10;
        this.f31192s.setTranslationY(this.f31198w0 + f10);
    }

    @Override
    public final void g(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        if (this.O != null && this.Q != null) {
            if (i10 == 3) {
                w();
            } else if ((i10 == 1 || i10 == 4) && this.U == null) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.f31177f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.Q.f50625a == 3) {
                    x(5);
                }
                this.f31179g0 = false;
                this.U = new n60(j10, i11, i12, z10, j11);
                t();
            }
        }
    }

    @Override
    public View getButtonsLayout() {
        return this.E;
    }

    @Override
    public r60 getCameraContainer() {
        return this.f31192s;
    }

    @Override
    public RectF getCameraRect() {
        l60 l60Var = this.f31199x;
        int[] iArr = this.J;
        l60Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], l60Var.getWidth() + i10, l60Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.H;
    }

    @Override
    public Paint getPaint() {
        return this.v.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f31199x;
    }

    @Override
    public final void h(ch.b bVar, org.telegram.ui.fj fjVar) {
        View view = this.E;
        eh.d c10 = bVar.c(view, fjVar, false);
        c10.w(AndroidUtilities.dp(6.0f));
        c10.x(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void i(boolean z10) {
        if (this.O != null) {
            return;
        }
        setVisibility(0);
        this.v.getPaint().setAlpha(255);
        this.f31182j0 = false;
        this.f31181i0 = false;
        this.U = null;
        this.V = false;
        this.f31178f0 = false;
        this.f31180h0 = false;
        this.f31195u0 = 0L;
        this.v.setProgress(0.0f);
        org.telegram.ui.il ilVar = this.f31201y;
        if (!this.f31184l0) {
            if (this.f31194t0 == null) {
                try {
                    this.f31194t0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f31194t0;
            if (bitmap != null) {
                ilVar.setImageBitmap(bitmap);
            } else {
                ilVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f31184l0 = true;
            ilVar.animate().cancel();
            ilVar.setAlpha(1.0f);
            ilVar.invalidate();
        }
        this.S = new m11(this.f31177f, this.f31185n);
        this.P = (vi.s0) wi.e.e.a();
        vi.l0 l0Var = new vi.l0(getContext(), this.f31199x);
        l0Var.f50518c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        l0Var.d = (vi.n0) wi.e.f51340j.a();
        l0Var.e = this.P;
        l0Var.h = wi.e.h.a();
        l0Var.f50519f = (vi.o0) wi.e.f51337f.a();
        l0Var.f50520g = (vi.p0) wi.e.f51338g.a();
        wi.a aVar = wi.e.f51339i;
        aVar.a();
        l0Var.f50521i = aVar.d;
        li.e3 e3Var = this.J0;
        l0Var.f50522j = e3Var;
        m11 m11Var = this.S;
        l0Var.f50523k = m11Var;
        l0Var.f50524l = new tv(this, 6);
        if (l0Var.d != null) {
            if (l0Var.e != null) {
                if (l0Var.h > 0) {
                    if (l0Var.f50519f != null) {
                        if (l0Var.f50520g != null) {
                            if (e3Var != null) {
                                if (m11Var != null) {
                                    this.O = new vi.u0(l0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    vi.u0 u0Var = this.O;
                                    u0Var.getClass();
                                    vi.u0.u();
                                    if (u0Var.Z == 1) {
                                        try {
                                            u0Var.f50643m.b("start requested");
                                            u0Var.c(true);
                                            u0Var.w(2);
                                            u0Var.f50642l.X(u0Var.T, 0L, u0Var.f50648r);
                                        } catch (Exception e) {
                                            u0Var.h(e);
                                        }
                                    }
                                    z(true, false);
                                    return;
                                }
                                throw new IllegalStateException("Output listener is required");
                            }
                            throw new IllegalStateException("Session listener is required");
                        }
                        throw new IllegalStateException("Frame rate is required");
                    }
                    throw new IllegalStateException("Camera resolution is required");
                }
                throw new IllegalStateException("Video bitrate is required");
            }
            throw new IllegalStateException("Output resolution is required");
        }
        throw new IllegalStateException("Initial camera is required");
    }

    @Override
    public final void j() {
        vi.t0 t0Var;
        vi.u0 u0Var = this.O;
        if (u0Var != null && (t0Var = this.Q) != null) {
            int i10 = t0Var.f50625a;
            if (i10 == 3) {
                w();
            } else if (i10 == 5) {
                vi.u0.u();
                if (u0Var.Z == 5 && u0Var.K - u0Var.J < u0Var.f50647q) {
                    u0Var.P++;
                    u0Var.D = false;
                    u0Var.f50643m.b("resume requested: trim=" + u0Var.J + ".." + u0Var.K + ", sourceDurationMs=" + u0Var.H);
                    u0Var.s();
                    u0Var.w(6);
                    u0Var.f50640j.execute(new fi.r1(u0Var, u0Var.l(), u0Var.T, u0Var.S, u0Var.U));
                    this.T = null;
                    this.f31179g0 = true;
                    this.f31180h0 = false;
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setScreenFlashEnabled(false);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (View.MeasureSpec.getSize(i11) - getPaddingBottom() > View.MeasureSpec.getSize(i10) * 1.3f) {
            i12 = AndroidUtilities.roundPlayingMessageSize;
        } else {
            i12 = AndroidUtilities.roundMessageSize;
        }
        if (this.E0 != i12) {
            this.E0 = i12;
            m60 m60Var = this.f31192s;
            m60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            m60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        fi.q2 q2Var = this.I;
        q2Var.f11465b.measure(makeMeasureSpec, makeMeasureSpec2);
        q2Var.f11466c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onWindowVisibilityChanged(int i10) {
        vi.u0 u0Var;
        vi.t0 t0Var;
        super.onWindowVisibilityChanged(i10);
        if (i10 != 0 && (u0Var = this.O) != null && (t0Var = this.Q) != null) {
            if (t0Var.f50625a == 3) {
                w();
            } else if (t0Var.e) {
                u0Var.p();
            }
        }
    }

    public final void p() {
        vi.t0 t0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.O != null && (t0Var = this.Q) != null && (videoEditedInfo = this.T) != null) {
            long j10 = t0Var.f50626b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j11 = this.T.endTime;
            if (j11 >= 0) {
                j10 = Math.min(j10, j11);
            }
            vi.u0 u0Var = this.O;
            u0Var.getClass();
            vi.u0.u();
            if (u0Var.Z == 5) {
                long max2 = Math.max(0L, Math.min(u0Var.H, max));
                long max3 = Math.max(max2, Math.min(u0Var.H, j10));
                if (max3 - max2 >= Math.min(800L, u0Var.H)) {
                    u0Var.J = max2;
                    u0Var.K = max3;
                    i2.j0 j0Var = u0Var.V;
                    if (j0Var != null) {
                        j0Var.Z0(5, max2);
                    }
                    u0Var.d.getClass();
                    u0Var.o();
                }
            }
        }
    }

    public final Bitmap q(Bitmap bitmap) {
        l60 l60Var = this.f31199x;
        if (l60Var.getWidth() > 0 && l60Var.getHeight() > 0) {
            Matrix matrix = this.K;
            l60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.L;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / l60Var.getWidth();
                float height = bitmap.getHeight() / l60Var.getHeight();
                fArr[1] = (width / height) * fArr[1];
                fArr[2] = fArr[2] * width;
                fArr[3] = (height / width) * fArr[3];
                fArr[5] = fArr[5] * height;
                fArr[6] = fArr[6] / width;
                fArr[7] = fArr[7] / height;
                matrix.setValues(fArr);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.M);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void r() {
        if (!this.f31186n0 && this.f31173b0 == null) {
            return;
        }
        this.f31193s0++;
        ValueAnimator valueAnimator = this.f31173b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f31173b0.cancel();
            this.f31173b0 = null;
        }
        FrameLayout frameLayout = this.f31197w;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f31186n0 = false;
        this.f31187o0 = false;
        this.f31188p0 = false;
        this.f31189q0 = false;
        v(false);
    }

    public final VideoEditedInfo s(File file, long j10, l11 l11Var) {
        long j11;
        int i10;
        int i11;
        vi.p0 p0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j10;
        if (l11Var == null) {
            j11 = file.length();
        } else {
            j11 = l11Var.f30092a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j11);
        videoEditedInfo.roundVideo = true;
        vi.u0 u0Var = this.O;
        if (u0Var != null && (p0Var = u0Var.f50651u) != null) {
            i10 = p0Var.f50571a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        vi.s0 s0Var = this.P;
        if (s0Var == null) {
            i11 = 480;
        } else {
            i11 = s0Var.f50624a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (l11Var != null) {
            videoEditedInfo.file = l11Var.f30093b;
            videoEditedInfo.encryptedFile = l11Var.f30094c;
            videoEditedInfo.key = l11Var.d;
            videoEditedInfo.iv = l11Var.e;
        }
        return videoEditedInfo;
    }

    @Override
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
        this.f31192s.getClass();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.E.setAlpha(0.0f);
        m60 m60Var = this.f31192s;
        m60Var.setAlpha(0.0f);
        m60Var.setScaleX(0.1f);
        m60Var.setScaleY(0.1f);
        m60Var.setTranslationX(0.0f);
        ImageView imageView = this.H;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.v.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i10 == 0) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void t() {
        vi.t0 t0Var;
        boolean z10;
        int i10;
        if (this.U != null && !this.V && this.O != null && (t0Var = this.Q) != null) {
            int i11 = t0Var.f50625a;
            if (i11 == 5) {
                p();
            } else if (i11 != 3) {
                return;
            }
            vi.u0 u0Var = this.O;
            boolean z11 = this.f31181i0;
            boolean z12 = !z11;
            u0Var.getClass();
            vi.u0.u();
            int i12 = u0Var.Z;
            boolean z13 = false;
            if (i12 == 3 || i12 == 5) {
                u0Var.f50643m.b("finish requested: state=" + b10.x(u0Var.Z) + ", includeAudio=" + z12 + ", durationMs=" + u0Var.j() + ", trim=" + u0Var.J + ".." + u0Var.K);
                u0Var.B = z12;
                if (u0Var.Z == 3) {
                    u0Var.H = u0Var.j();
                    u0Var.A = true;
                    u0Var.e();
                    u0Var.f50639i.removeCallbacks(u0Var.W);
                    u0Var.w(7);
                    boolean Y = u0Var.f50642l.Y();
                    u0Var.E = Y;
                    if (!Y) {
                        u0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                    }
                } else {
                    u0Var.s();
                    u0Var.w(7);
                    if (!u0Var.l() && !z11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (u0Var.l()) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    u0Var.f50640j.execute(new bi.rb(u0Var, u0Var.T, z10, u0Var.U, z12, i10, u0Var.S));
                }
                z13 = true;
            }
            this.V = z13;
        }
    }

    public final void u() {
        if (this.B0) {
            this.B0 = false;
            this.f31203z0 = -1;
            this.A0 = -1;
            if (this.O == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f31172a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31202y0, 0.0f);
            this.f31172a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f31172a0.addUpdateListener(new i60(this, 1));
            this.f31172a0.start();
        }
    }

    public final void v(boolean z10) {
        if (!this.m0) {
            return;
        }
        this.m0 = false;
        org.telegram.ui.il ilVar = this.f31201y;
        ilVar.animate().cancel();
        if (z10) {
            ilVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            ilVar.setAlpha(0.0f);
        }
    }

    public final void w() {
        vi.t0 t0Var;
        if (this.O != null && (t0Var = this.Q) != null && t0Var.f50625a == 3) {
            x(2);
            this.O.q();
        }
    }

    public final void x(int i10) {
        if (this.f31180h0 && i10 == 2) {
            return;
        }
        this.f31180h0 = true;
        NotificationCenter.getInstance(this.f31177f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.h), Integer.valueOf(i10));
    }

    public final void y(boolean z10) {
        Bitmap bitmap;
        l60 l60Var = this.f31199x;
        if (l60Var.isAvailable() && (bitmap = l60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = q(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f31194t0;
                    this.f31194t0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z10) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            fileOutputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    if (bitmap != this.f31194t0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f31194t0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void z(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        q60 q60Var = this.f33240a;
        if (q60Var != null) {
            ((org.telegram.ui.qe) q60Var).f42685b.Wc.a(z10, true);
        }
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.W.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        m60 m60Var = this.f31192s;
        if (z10 && !this.f31183k0) {
            m60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f31198w0 = measuredHeight;
            m60Var.setTranslationY(measuredHeight + this.f31196v0);
        }
        this.f31183k0 = z10;
        View view = this.f31190r;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f31195u0) > 300) {
            f7 = AndroidUtilities.dp(24.0f) - (getMeasuredWidth() * 0.5f);
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
        ofFloat.addUpdateListener(new i60(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.E;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m60Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(m60Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(m60Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(m60Var, View.TRANSLATION_X, f7);
        if (this.f31181i0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.H, property, f15), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.W.addListener(new i10(this, 1));
        } else {
            setTranslationX(0.0f);
        }
        this.W.start();
    }
}
