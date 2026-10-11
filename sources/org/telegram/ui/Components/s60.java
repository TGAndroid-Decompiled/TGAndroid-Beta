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
public final class s60 extends y60 {
    public int A0;
    public boolean B0;
    public boolean C0;
    public float D0;
    public final org.telegram.ui.nl E;
    public int E0;
    public final LinearLayout F;
    public long F0;
    public final ci.u2 G;
    public boolean G0;
    public final ci.u2 H;
    public boolean H0;
    public final ImageView I;
    public final nq I0;
    public final ci.w2 J;
    public final m2.t J0;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public ki.v0 P;
    public ki.t0 Q;
    public ki.u0 R;
    public ki.n0 S;
    public h11 T;
    public VideoEditedInfo U;
    public r60 V;
    public AnimatorSet W;
    public ValueAnimator f30750a0;
    public ValueAnimator f30751b0;
    public final dk0 f30752c0;
    public dk0 f30753d0;
    public dk0 f30754e0;
    public final g60 f30755f;
    public boolean f30756f0;
    public boolean f30757g0;
    public final int h;
    public boolean f30758h0;
    public boolean f30759i0;
    public boolean f30760j0;
    public boolean f30761k0;
    public boolean f30762l0;
    public boolean m0;
    public final int f30763n;
    public boolean f30764n0;
    public boolean f30765o0;
    public boolean f30766p0;
    public boolean f30767q0;
    public final boolean f30768r;
    public long f30769r0;
    public final View f30770s;
    public int f30771s0;
    public Bitmap f30772t0;
    public long f30773u0;
    public final q60 v;
    public float f30774v0;
    public final dn0 f30775w;
    public float f30776w0;
    public final FrameLayout f30777x;
    public float f30778x0;
    public final p60 f30779y;
    public float f30780y0;
    public int f30781z0;

    public s60(Activity activity, g60 g60Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.f30781z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new nq(this, 25);
        this.J0 = new m2.t(this, 8);
        this.f30755f = g60Var;
        this.f30763n = g60Var.getClassGuid();
        this.f30768r = g60Var.v();
        this.f30770s = g60Var.getFragmentView();
        setWillNotDraw(false);
        ci.w2 w2Var = new ci.w2(activity, null, this, null);
        this.J = w2Var;
        w2Var.f6194o = 0.5f;
        w2Var.f6193n = ci.w2.f(0.5f);
        w2Var.g();
        addView(w2Var.f6183b, w7.x5.e(-1, -1, 119));
        q60 q60Var = new q60(this, activity);
        this.v = q60Var;
        dn0 dn0Var = new dn0(activity);
        this.f30775w = dn0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f30777x = frameLayout;
        p60 p60Var = new p60(this, activity, 0);
        p60Var.setOpaque(true);
        p60Var.setClickable(true);
        p60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        p60Var.setOutlineProvider(new ai.l2(13));
        p60Var.setClipToOutline(true);
        this.f30779y = p60Var;
        frameLayout.addView(p60Var, w7.x5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.nl nlVar = new org.telegram.ui.nl(this, activity, paint);
        this.E = nlVar;
        nlVar.setOutlineProvider(new ai.l2(12));
        nlVar.setClipToOutline(true);
        frameLayout.addView(nlVar, w7.x5.e(-1, -1, 119));
        dn0Var.addView(frameLayout, w7.x5.a(-1.0f, 14.0f, 14.0f, 14.0f, 14.0f, -1, 119));
        q60Var.addView(dn0Var, w7.x5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(q60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(w2Var.f6184c, w7.x5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.x5.a(56.0f, 1.0f, 0.0f, 0.0f, 0.0f, -2, 83));
        ?? imageView = new ImageView(activity);
        this.G = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.x5.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final s60 f29395b;

            {
                this.f29395b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.u0 u0Var;
                ki.n0 n0Var;
                boolean z10;
                ki.u0 u0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        s60 s60Var = this.f29395b;
                        ki.v0 v0Var = s60Var.P;
                        if (v0Var != null && (u0Var = s60Var.R) != null && (n0Var = s60Var.S) != null && u0Var.f15150a == 3 && !u0Var.f15153e && !s60Var.f30764n0) {
                            ki.o0 o0Var = n0Var.f15070a;
                            ki.o0 o0Var2 = ki.o0.f15076a;
                            if (o0Var == o0Var2) {
                                o0Var2 = ki.o0.f15077b;
                            }
                            v0Var.getClass();
                            ki.v0.t();
                            int i12 = v0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (v0Var.f15171p != o0Var2) {
                                    v0Var.f15168m.b("camera facing requested: " + v0Var.f15171p + " -> " + o0Var2 + ", state=" + hg.c.C(v0Var.W));
                                    v0Var.f15171p = o0Var2;
                                    int i13 = v0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        v0Var.e();
                                        ki.k kVar = v0Var.f15167l;
                                        kVar.F = o0Var2;
                                        Handler handler = kVar.f14996n;
                                        if (kVar.V && handler != null) {
                                            handler.post(new gg.w1(27, kVar, o0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        v0Var.f15177w = z10;
                                    }
                                    v0Var.n();
                                    v0Var.o();
                                }
                                s60Var.f30752c0.M(0);
                                s60Var.f30752c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        s60 s60Var2 = this.f29395b;
                        ki.v0 v0Var2 = s60Var2.P;
                        if (v0Var2 != null && (u0Var2 = s60Var2.R) != null && s60Var2.S != null) {
                            boolean z11 = !u0Var2.f15154f;
                            ki.k kVar2 = v0Var2.f15167l;
                            ki.v0.t();
                            if (v0Var2.W == 3 && !v0Var2.f15177w && (i11 = v0Var2.X) != 1) {
                                v0Var2.f15176u = z11;
                                if (i11 == 3) {
                                    v0Var2.u(z11);
                                    kVar2.T(false);
                                } else {
                                    v0Var2.u(false);
                                    kVar2.T(z11);
                                }
                                v0Var2.o();
                                s60Var2.z();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(activity);
        this.H = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, w7.x5.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final s60 f29395b;

            {
                this.f29395b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.u0 u0Var;
                ki.n0 n0Var;
                boolean z10;
                ki.u0 u0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        s60 s60Var = this.f29395b;
                        ki.v0 v0Var = s60Var.P;
                        if (v0Var != null && (u0Var = s60Var.R) != null && (n0Var = s60Var.S) != null && u0Var.f15150a == 3 && !u0Var.f15153e && !s60Var.f30764n0) {
                            ki.o0 o0Var = n0Var.f15070a;
                            ki.o0 o0Var2 = ki.o0.f15076a;
                            if (o0Var == o0Var2) {
                                o0Var2 = ki.o0.f15077b;
                            }
                            v0Var.getClass();
                            ki.v0.t();
                            int i12 = v0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (v0Var.f15171p != o0Var2) {
                                    v0Var.f15168m.b("camera facing requested: " + v0Var.f15171p + " -> " + o0Var2 + ", state=" + hg.c.C(v0Var.W));
                                    v0Var.f15171p = o0Var2;
                                    int i13 = v0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        v0Var.e();
                                        ki.k kVar = v0Var.f15167l;
                                        kVar.F = o0Var2;
                                        Handler handler = kVar.f14996n;
                                        if (kVar.V && handler != null) {
                                            handler.post(new gg.w1(27, kVar, o0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        v0Var.f15177w = z10;
                                    }
                                    v0Var.n();
                                    v0Var.o();
                                }
                                s60Var.f30752c0.M(0);
                                s60Var.f30752c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        s60 s60Var2 = this.f29395b;
                        ki.v0 v0Var2 = s60Var2.P;
                        if (v0Var2 != null && (u0Var2 = s60Var2.R) != null && s60Var2.S != null) {
                            boolean z11 = !u0Var2.f15154f;
                            ki.k kVar2 = v0Var2.f15167l;
                            ki.v0.t();
                            if (v0Var2.W == 3 && !v0Var2.f15177w && (i11 = v0Var2.X) != 1) {
                                v0Var2.f15176u = z11;
                                if (i11 == 3) {
                                    v0Var2.u(z11);
                                    kVar2.T(false);
                                } else {
                                    v0Var2.u(false);
                                    kVar2.T(z11);
                                }
                                v0Var2.o();
                                s60Var2.z();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.O = dp;
        dk0 dk0Var = new dk0(R.raw.roundcamera_flip, dp, dp);
        this.f30752c0 = dk0Var;
        dk0Var.setCallback(imageView);
        dk0Var.M(dk0Var.f25810e[0] - 1);
        imageView.setImageDrawable(dk0Var);
        z();
        if (d6Var != null && !d6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.I = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.x5.e(48, 48, 17));
        p60Var.setOnTouchListener(new wk(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f30769r0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f30769r0);
    }

    private long getCurrentDurationMs() {
        ki.u0 u0Var;
        ki.v0 v0Var = this.P;
        if (v0Var != null && (u0Var = this.R) != null) {
            if (u0Var.f15150a == 3) {
                return v0Var.j();
            }
            return u0Var.f15151b;
        }
        return 0L;
    }

    public static void l(s60 s60Var) {
        if (s60Var.f30764n0 && s60Var.f30767q0 && s60Var.f30765o0 && s60Var.f30766p0) {
            s60Var.f30764n0 = false;
            FileLog.d("RoundVideo camera flip completed: elapsedMs=" + s60Var.getCameraFlipElapsedMs());
            s60Var.y();
        }
    }

    public static void m(s60 s60Var) {
        org.telegram.ui.nl nlVar = s60Var.E;
        if (!s60Var.f30762l0) {
            return;
        }
        s60Var.f30762l0 = false;
        nlVar.invalidate();
        nlVar.animate().cancel();
        nlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.ok okVar;
        if (z10 != this.G0) {
            this.G0 = z10;
            this.F0 = 0L;
            nq nqVar = this.I0;
            if (z10) {
                yf.h.d().a(30, nqVar);
            } else {
                yf.h.d().f(nqVar);
            }
            if (this.d != z10) {
                this.d = z10;
                w60 w60Var = this.f33158c;
                if (w60Var != null && (okVar = ((org.telegram.ui.sj) w60Var).f41791a.Y) != null) {
                    okVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f30755f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.w2 w2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.D0)) {
                this.D0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            w2Var.c(null);
        } else {
            if (!Float.isNaN(this.D0)) {
                attributes.screenBrightness = this.D0;
                this.D0 = Float.NaN;
            }
            w2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        org.telegram.ui.ok okVar;
        float f7;
        ki.u0 u0Var = this.R;
        if (u0Var != null) {
            long j3 = u0Var.d;
            if (u0Var.f15150a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + u0Var.f15151b) - u0Var.f15152c);
                this.f30773u0 = min;
                this.f30775w.setProgress(((float) min) / ((float) j3));
                w60 w60Var = this.f33158c;
                if (w60Var != null && (okVar = ((org.telegram.ui.sj) w60Var).f41791a.Y) != null && okVar.f23938j1) {
                    okVar.f23932i1 = min;
                    zg zgVar = okVar.Y0;
                    if (zgVar != null && zgVar.f33622r) {
                        zgVar.h = min;
                        zgVar.invalidate();
                    }
                    wg wgVar = okVar.l1;
                    if (wgVar != null && wgVar.f32697n) {
                        if (!wgVar.h) {
                            long j10 = wgVar.f32698r;
                            if (j10 >= 0) {
                                if (!wgVar.f32695e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    wgVar.f32692a = f7;
                                }
                                wgVar.invalidate();
                            }
                        }
                        wgVar.f32698r = min;
                        wgVar.f32692a = 1.0f;
                        wgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = okVar.f23943k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f24043n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        if (this.P == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        u(i10);
        this.P.a();
        h11 h11Var = this.T;
        if (h11Var != null) {
            h11Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        w(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        ki.u0 u0Var;
        i2.f0 f0Var;
        if (this.P != null && (u0Var = this.R) != null && u0Var.f15150a == 5) {
            o();
            if (i10 == 0) {
                this.P.q();
            } else if (i10 == 1) {
                ki.v0 v0Var = this.P;
                v0Var.getClass();
                ki.v0.t();
                if (v0Var.W == 5 && (f0Var = v0Var.S) != null) {
                    f0Var.e();
                    v0Var.x(false);
                    m2.t tVar = v0Var.d;
                    v0Var.S.J0();
                    tVar.getClass();
                }
            } else if (i10 == 2) {
                ki.v0 v0Var2 = this.P;
                long j3 = f7 * ((float) this.R.f15151b);
                v0Var2.getClass();
                ki.v0.t();
                if (v0Var2.W == 5 && v0Var2.S != null) {
                    long j10 = v0Var2.G;
                    v0Var2.S.W0(5, Math.max(j10, Math.min(Math.max(j10, v0Var2.H - 1), j3)));
                    v0Var2.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        q();
        ValueAnimator valueAnimator = this.f30750a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.v0 v0Var = this.P;
        if (v0Var != null) {
            ki.v0.t();
            int i10 = v0Var.W;
            if (i10 == 10) {
                if (!v0Var.C) {
                    v0Var.i();
                }
            } else if (i10 != 8) {
                v0Var.a();
            } else {
                v0Var.e();
                v0Var.r();
                v0Var.f15167l.M();
                v0Var.C = true;
                v0Var.v(10);
                v0Var.m("released");
                v0Var.f15164i.removeCallbacksAndMessages(null);
                v0Var.f15165j.shutdown();
                v0Var.f15166k.shutdown();
            }
            this.P = null;
        }
        h11 h11Var = this.T;
        if (h11Var != null) {
            h11Var.d(true ^ this.f30760j0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        x();
        q60 q60Var = this.v;
        q60Var.setTranslationX(0.0f);
        this.f30776w0 = 0.0f;
        q60Var.setTranslationY(0.0f + this.f30774v0);
        q60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        ki.u0 u0Var = this.R;
        if (u0Var != null) {
            int i10 = u0Var.f15150a;
            if (i10 == 4 || i10 == 5 || i10 == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f7) {
        float f10 = f7 * 0.5f;
        this.f30774v0 = f10;
        this.v.setTranslationY(this.f30776w0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.u0 u0Var;
        ki.v0 v0Var = this.P;
        if (v0Var != null && (u0Var = this.R) != null) {
            int i13 = 2;
            if (i10 == 3) {
                if (v0Var != null && u0Var != null && u0Var.f15150a == 3) {
                    u(2);
                    this.P.p();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                boolean z11 = false;
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f30763n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f15150a == 3) {
                    u(5);
                } else {
                    o();
                }
                this.V = new r60(j3, i11, i12, z10, j10);
                ki.v0 v0Var2 = this.P;
                boolean z12 = this.f30759i0;
                boolean z13 = !z12;
                v0Var2.getClass();
                ki.v0.t();
                int i14 = v0Var2.W;
                if (i14 == 3 || i14 == 5) {
                    v0Var2.f15168m.b("finish requested: state=" + hg.c.C(v0Var2.W) + ", includeAudio=" + z13 + ", durationMs=" + v0Var2.j() + ", trim=" + v0Var2.G + ".." + v0Var2.H);
                    v0Var2.f15180z = z13;
                    if (v0Var2.W == 3) {
                        v0Var2.E = v0Var2.j();
                        v0Var2.f15179y = true;
                        v0Var2.e();
                        v0Var2.f15164i.removeCallbacks(v0Var2.T);
                        v0Var2.v(7);
                        boolean Y = v0Var2.f15167l.Y();
                        v0Var2.B = Y;
                        if (!Y) {
                            v0Var2.h(new IllegalStateException("Unable to stop the camera segment"));
                            return;
                        }
                        return;
                    }
                    v0Var2.r();
                    v0Var2.v(7);
                    if (v0Var2.l() || z12) {
                        z11 = true;
                    }
                    if (v0Var2.l()) {
                        i13 = 1;
                    }
                    v0Var2.f15165j.execute(new ki.j0(v0Var2, v0Var2.Q, z11, v0Var2.R, z13, i13, v0Var2.P));
                }
            }
        }
    }

    @Override
    public final void g(ah.c cVar, org.telegram.ui.kj kjVar) {
        View view = this.F;
        ch.d c10 = cVar.c(view, kjVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public View getButtonsLayout() {
        return this.F;
    }

    @Override
    public v60 getCameraContainer() {
        return this.v;
    }

    @Override
    public RectF getCameraRect() {
        p60 p60Var = this.f30779y;
        int[] iArr = this.K;
        p60Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], p60Var.getWidth() + i10, p60Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f30775w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f30779y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f30775w.getPaint().setAlpha(255);
        this.f30760j0 = false;
        this.f30759i0 = false;
        this.f30756f0 = false;
        this.f30758h0 = false;
        this.f30773u0 = 0L;
        this.f30775w.setProgress(0.0f);
        org.telegram.ui.nl nlVar = this.E;
        if (!this.f30762l0) {
            if (this.f30772t0 == null) {
                try {
                    this.f30772t0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f30772t0;
            if (bitmap != null) {
                nlVar.setImageBitmap(bitmap);
            } else {
                nlVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f30762l0 = true;
            nlVar.animate().cancel();
            nlVar.setAlpha(1.0f);
            nlVar.invalidate();
        }
        this.T = new h11(this.h, this.f30768r);
        this.Q = (ki.t0) qi.e.f46847c.a();
        ki.m0 m0Var = new ki.m0(getContext(), this.f30779y);
        m0Var.f15039c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        m0Var.d = (ki.o0) qi.e.h.a();
        m0Var.f15040e = this.Q;
        m0Var.h = qi.e.f46849f.a();
        m0Var.f15041f = (ki.p0) qi.e.d.a();
        m0Var.f15042g = (ki.q0) qi.e.f46848e.a();
        qi.a aVar = qi.e.f46850g;
        aVar.a();
        m0Var.f15043i = aVar.d;
        m2.t tVar = this.J0;
        m0Var.f15044j = tVar;
        h11 h11Var = this.T;
        m0Var.f15045k = h11Var;
        m0Var.f15046l = new cw(this, 6);
        if (m0Var.d != null) {
            if (m0Var.f15040e != null) {
                if (m0Var.h > 0) {
                    if (m0Var.f15041f != null) {
                        if (m0Var.f15042g != null) {
                            if (tVar != null) {
                                if (h11Var != null) {
                                    this.P = new ki.v0(m0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    ki.v0 v0Var = this.P;
                                    v0Var.getClass();
                                    ki.v0.t();
                                    if (v0Var.W == 1) {
                                        try {
                                            v0Var.f15168m.b("start requested");
                                            v0Var.c(true);
                                            v0Var.v(2);
                                            v0Var.f15167l.X(v0Var.Q, 0L, v0Var.f15171p);
                                        } catch (Exception e7) {
                                            v0Var.h(e7);
                                        }
                                    }
                                    w(true, false);
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
    public final void i() {
        ki.u0 u0Var;
        ki.v0 v0Var = this.P;
        if (v0Var != null && (u0Var = this.R) != null) {
            int i10 = u0Var.f15150a;
            if (i10 == 3) {
                if (v0Var != null && u0Var != null && i10 == 3) {
                    u(2);
                    this.P.p();
                }
            } else if (i10 == 5) {
                this.U = null;
                this.f30757g0 = true;
                this.f30758h0 = false;
                ki.v0.t();
                if (v0Var.W == 5 && v0Var.H - v0Var.G < v0Var.f15170o) {
                    v0Var.M++;
                    v0Var.f15168m.b("resume requested: trim=" + v0Var.G + ".." + v0Var.H + ", sourceDurationMs=" + v0Var.E);
                    v0Var.r();
                    v0Var.v(6);
                    v0Var.f15165j.execute(new ci.t1(v0Var, v0Var.l(), v0Var.Q, v0Var.P, v0Var.R));
                }
            }
        }
    }

    public final void o() {
        ki.u0 u0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P != null && (u0Var = this.R) != null && (videoEditedInfo = this.U) != null) {
            long j3 = u0Var.f15151b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j10 = this.U.endTime;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            ki.v0 v0Var = this.P;
            v0Var.getClass();
            ki.v0.t();
            if (v0Var.W == 5) {
                long max2 = Math.max(0L, Math.min(v0Var.E, max));
                long max3 = Math.max(max2, Math.min(v0Var.E, j3));
                if (max3 - max2 >= Math.min(800L, v0Var.E)) {
                    v0Var.G = max2;
                    v0Var.H = max3;
                    i2.f0 f0Var = v0Var.S;
                    if (f0Var != null) {
                        f0Var.W0(5, max2);
                    }
                    v0Var.d.getClass();
                    v0Var.o();
                }
            }
        }
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
            q60 q60Var = this.v;
            q60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            q60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ci.w2 w2Var = this.J;
        w2Var.f6183b.measure(makeMeasureSpec, makeMeasureSpec2);
        w2Var.f6184c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final Bitmap p(Bitmap bitmap) {
        p60 p60Var = this.f30779y;
        if (p60Var.getWidth() > 0 && p60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            p60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / p60Var.getWidth();
                float height = bitmap.getHeight() / p60Var.getHeight();
                fArr[1] = (width / height) * fArr[1];
                fArr[2] = fArr[2] * width;
                fArr[3] = (height / width) * fArr[3];
                fArr[5] = fArr[5] * height;
                fArr[6] = fArr[6] / width;
                fArr[7] = fArr[7] / height;
                matrix.setValues(fArr);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.N);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void q() {
        if (!this.f30764n0 && this.f30751b0 == null) {
            return;
        }
        this.f30771s0++;
        ValueAnimator valueAnimator = this.f30751b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f30751b0.cancel();
            this.f30751b0 = null;
        }
        FrameLayout frameLayout = this.f30777x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f30764n0 = false;
        this.f30765o0 = false;
        this.f30766p0 = false;
        this.f30767q0 = false;
        t(false);
    }

    public final VideoEditedInfo r(File file, long j3, g11 g11Var) {
        long j10;
        int i10;
        int i11;
        ki.q0 q0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        if (g11Var == null) {
            j10 = file.length();
        } else {
            j10 = g11Var.f26622a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j10);
        videoEditedInfo.roundVideo = true;
        ki.v0 v0Var = this.P;
        if (v0Var != null && (q0Var = v0Var.f15174s) != null) {
            i10 = q0Var.f15091a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        ki.t0 t0Var = this.Q;
        if (t0Var == null) {
            i11 = 480;
        } else {
            i11 = t0Var.f15146a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (g11Var != null) {
            videoEditedInfo.file = g11Var.f26623b;
            videoEditedInfo.encryptedFile = g11Var.f26624c;
            videoEditedInfo.key = g11Var.d;
            videoEditedInfo.iv = g11Var.f26625e;
        }
        return videoEditedInfo;
    }

    public final void s() {
        if (this.B0) {
            this.B0 = false;
            this.f30781z0 = -1;
            this.A0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f30750a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f30780y0, 0.0f);
            this.f30750a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f30750a0.addUpdateListener(new n60(this, 1));
            this.f30750a0.start();
        }
    }

    @Override
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
        this.v.getClass();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.F.setAlpha(0.0f);
        q60 q60Var = this.v;
        q60Var.setAlpha(0.0f);
        q60Var.setScaleX(0.1f);
        q60Var.setScaleY(0.1f);
        q60Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f30775w.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i10 == 0) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void t(boolean z10) {
        if (!this.m0) {
            return;
        }
        this.m0 = false;
        org.telegram.ui.nl nlVar = this.E;
        nlVar.animate().cancel();
        if (z10) {
            nlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            nlVar.setAlpha(0.0f);
        }
    }

    public final void u(int i10) {
        if (this.f30758h0 && i10 == 2) {
            return;
        }
        this.f30758h0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f30763n), Integer.valueOf(i10));
    }

    public final void v(boolean z10) {
        Bitmap bitmap;
        p60 p60Var = this.f30779y;
        if (p60Var.isAvailable() && (bitmap = p60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = p(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f30772t0;
                    this.f30772t0 = bitmap;
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
                    if (bitmap != this.f30772t0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f30772t0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void w(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        u60 u60Var = this.f33156a;
        if (u60Var != null) {
            ((org.telegram.ui.qe) u60Var).f41190b.f45007vc.a(z10, true);
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
        q60 q60Var = this.v;
        if (z10 && !this.f30761k0) {
            q60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f30776w0 = measuredHeight;
            q60Var.setTranslationY(measuredHeight + this.f30774v0);
        }
        this.f30761k0 = z10;
        View view = this.f30770s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f30773u0) > 300) {
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
        ofFloat.addUpdateListener(new n60(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(q60Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(q60Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(q60Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(q60Var, View.TRANSLATION_X, f7);
        if (this.f30759i0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.I, property, f15), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.W.addListener(new t8(this, 24));
        } else {
            setTranslationX(0.0f);
        }
        this.W.start();
    }

    public final void x() {
        if (!this.C0) {
            return;
        }
        this.C0 = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public final void y() {
        boolean z10;
        ki.n0 n0Var;
        ki.u0 u0Var = this.R;
        boolean z11 = false;
        if (u0Var != null && u0Var.f15150a == 3 && !u0Var.f15153e && !this.f30764n0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G.setEnabled(z10);
        if (z10 && (n0Var = this.S) != null && n0Var.f15071b != 1) {
            z11 = true;
        }
        this.H.setEnabled(z11);
        z();
    }

    public final void z() {
        ki.u0 u0Var = this.R;
        int i10 = this.O;
        ci.u2 u2Var = this.H;
        if (u0Var != null && u0Var.f15154f) {
            if (this.f30754e0 == null) {
                dk0 dk0Var = new dk0(R.raw.roundcamera_flash_off, i10, i10);
                this.f30754e0 = dk0Var;
                dk0Var.setCallback(u2Var);
            }
            u2Var.setImageDrawable(this.f30754e0);
            return;
        }
        if (this.f30753d0 == null) {
            dk0 dk0Var2 = new dk0(R.raw.roundcamera_flash_on, i10, i10);
            this.f30753d0 = dk0Var2;
            dk0Var2.setCallback(u2Var);
        }
        u2Var.setImageDrawable(this.f30753d0);
    }
}
