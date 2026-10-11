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
public final class t60 extends z60 {
    public final o60 A0;
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
    public final o60 I0;
    public final ci.w2 J;
    public final m2.t J0;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public ki.t0 P;
    public ki.r0 Q;
    public ki.s0 R;
    public ki.l0 S;
    public i11 T;
    public VideoEditedInfo U;
    public s60 V;
    public AnimatorSet W;
    public ValueAnimator f31006a0;
    public final ek0 f31007b0;
    public ek0 f31008c0;
    public ek0 f31009d0;
    public boolean f31010e0;
    public final g60 f31011f;
    public boolean f31012f0;
    public boolean f31013g0;
    public final int h;
    public boolean f31014h0;
    public boolean f31015i0;
    public boolean f31016j0;
    public boolean f31017k0;
    public boolean f31018l0;
    public boolean m0;
    public final int f31019n;
    public boolean f31020n0;
    public boolean f31021o0;
    public boolean f31022p0;
    public long f31023q0;
    public final boolean f31024r;
    public int f31025r0;
    public final View f31026s;
    public Bitmap f31027s0;
    public long f31028t0;
    public float f31029u0;
    public final r60 v;
    public float f31030v0;
    public final en0 f31031w;
    public float f31032w0;
    public final FrameLayout f31033x;
    public float f31034x0;
    public final q60 f31035y;
    public int f31036y0;
    public int f31037z0;

    public t60(Activity activity, g60 g60Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.f31036y0 = -1;
        this.f31037z0 = -1;
        this.A0 = new Runnable(this) {
            public final t60 f29274b;

            {
                this.f29274b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f29274b.s();
                        return;
                    default:
                        t60 t60Var = this.f29274b;
                        ki.s0 s0Var = t60Var.R;
                        if (s0Var != null && s0Var.f15108a == 3) {
                            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            long j3 = t60Var.F0;
                            if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                                t60Var.z();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.D0 = Float.NaN;
        this.I0 = new Runnable(this) {
            public final t60 f29274b;

            {
                this.f29274b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f29274b.s();
                        return;
                    default:
                        t60 t60Var = this.f29274b;
                        ki.s0 s0Var = t60Var.R;
                        if (s0Var != null && s0Var.f15108a == 3) {
                            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            long j3 = t60Var.F0;
                            if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                                t60Var.z();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.J0 = new m2.t(this, 8);
        this.f31011f = g60Var;
        this.f31019n = g60Var.getClassGuid();
        this.f31024r = g60Var.v();
        this.f31026s = g60Var.getFragmentView();
        setWillNotDraw(false);
        ci.w2 w2Var = new ci.w2(activity, null, this, null);
        this.J = w2Var;
        w2Var.f6194o = 0.5f;
        w2Var.f6193n = ci.w2.f(0.5f);
        w2Var.g();
        addView(w2Var.f6183b, w7.x5.e(-1, -1, 119));
        r60 r60Var = new r60(this, activity);
        this.v = r60Var;
        en0 en0Var = new en0(activity);
        this.f31031w = en0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f31033x = frameLayout;
        q60 q60Var = new q60(this, activity, 0);
        q60Var.setOpaque(true);
        q60Var.setClickable(true);
        q60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        q60Var.setOutlineProvider(new ai.l2(13));
        q60Var.setClipToOutline(true);
        this.f31035y = q60Var;
        frameLayout.addView(q60Var, w7.x5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.nl nlVar = new org.telegram.ui.nl(this, activity, paint);
        this.E = nlVar;
        nlVar.setOutlineProvider(new ai.l2(12));
        nlVar.setClipToOutline(true);
        frameLayout.addView(nlVar, w7.x5.e(-1, -1, 119));
        en0Var.addView(frameLayout, w7.x5.a(-1.0f, 14.0f, 14.0f, 14.0f, 14.0f, -1, 119));
        r60Var.addView(en0Var, w7.x5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(r60Var, new FrameLayout.LayoutParams(i10, i10, 17));
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
            public final t60 f29625b;

            {
                this.f29625b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.s0 s0Var;
                ki.l0 l0Var;
                boolean z10;
                ki.s0 s0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        t60 t60Var = this.f29625b;
                        ki.t0 t0Var = t60Var.P;
                        if (t0Var != null && (s0Var = t60Var.R) != null && (l0Var = t60Var.S) != null && s0Var.f15108a == 3 && !s0Var.f15111e && !t60Var.m0) {
                            ki.m0 m0Var = l0Var.f15029a;
                            ki.m0 m0Var2 = ki.m0.f15055a;
                            if (m0Var == m0Var2) {
                                m0Var2 = ki.m0.f15056b;
                            }
                            t0Var.getClass();
                            ki.t0.t();
                            int i12 = t0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (t0Var.f15129p != m0Var2) {
                                    t0Var.f15126m.b("camera facing requested: " + t0Var.f15129p + " -> " + m0Var2 + ", state=" + hg.c.C(t0Var.W));
                                    t0Var.f15129p = m0Var2;
                                    int i13 = t0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        t0Var.e();
                                        ki.j jVar = t0Var.f15125l;
                                        jVar.C = m0Var2;
                                        Handler handler = jVar.f14988n;
                                        if (jVar.S && handler != null) {
                                            handler.post(new gg.w1(27, jVar, m0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        t0Var.f15135w = z10;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                t60Var.f31007b0.M(0);
                                t60Var.f31007b0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        t60 t60Var2 = this.f29625b;
                        ki.t0 t0Var2 = t60Var2.P;
                        if (t0Var2 != null && (s0Var2 = t60Var2.R) != null && t60Var2.S != null) {
                            boolean z11 = !s0Var2.f15112f;
                            ki.j jVar2 = t0Var2.f15125l;
                            ki.t0.t();
                            if (t0Var2.W == 3 && !t0Var2.f15135w && (i11 = t0Var2.X) != 1) {
                                t0Var2.f15134u = z11;
                                if (i11 == 3) {
                                    t0Var2.u(z11);
                                    jVar2.N(false);
                                } else {
                                    t0Var2.u(false);
                                    jVar2.N(z11);
                                }
                                t0Var2.o();
                                t60Var2.y();
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
            public final t60 f29625b;

            {
                this.f29625b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.s0 s0Var;
                ki.l0 l0Var;
                boolean z10;
                ki.s0 s0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        t60 t60Var = this.f29625b;
                        ki.t0 t0Var = t60Var.P;
                        if (t0Var != null && (s0Var = t60Var.R) != null && (l0Var = t60Var.S) != null && s0Var.f15108a == 3 && !s0Var.f15111e && !t60Var.m0) {
                            ki.m0 m0Var = l0Var.f15029a;
                            ki.m0 m0Var2 = ki.m0.f15055a;
                            if (m0Var == m0Var2) {
                                m0Var2 = ki.m0.f15056b;
                            }
                            t0Var.getClass();
                            ki.t0.t();
                            int i12 = t0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (t0Var.f15129p != m0Var2) {
                                    t0Var.f15126m.b("camera facing requested: " + t0Var.f15129p + " -> " + m0Var2 + ", state=" + hg.c.C(t0Var.W));
                                    t0Var.f15129p = m0Var2;
                                    int i13 = t0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        t0Var.e();
                                        ki.j jVar = t0Var.f15125l;
                                        jVar.C = m0Var2;
                                        Handler handler = jVar.f14988n;
                                        if (jVar.S && handler != null) {
                                            handler.post(new gg.w1(27, jVar, m0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        t0Var.f15135w = z10;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                t60Var.f31007b0.M(0);
                                t60Var.f31007b0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        t60 t60Var2 = this.f29625b;
                        ki.t0 t0Var2 = t60Var2.P;
                        if (t0Var2 != null && (s0Var2 = t60Var2.R) != null && t60Var2.S != null) {
                            boolean z11 = !s0Var2.f15112f;
                            ki.j jVar2 = t0Var2.f15125l;
                            ki.t0.t();
                            if (t0Var2.W == 3 && !t0Var2.f15135w && (i11 = t0Var2.X) != 1) {
                                t0Var2.f15134u = z11;
                                if (i11 == 3) {
                                    t0Var2.u(z11);
                                    jVar2.N(false);
                                } else {
                                    t0Var2.u(false);
                                    jVar2.N(z11);
                                }
                                t0Var2.o();
                                t60Var2.y();
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
        ek0 ek0Var = new ek0(R.raw.roundcamera_flip, dp, dp);
        this.f31007b0 = ek0Var;
        ek0Var.setCallback(imageView);
        ek0Var.M(ek0Var.f26043e[0] - 1);
        imageView.setImageDrawable(ek0Var);
        y();
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
        q60Var.setOnTouchListener(new wk(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f31023q0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f31023q0);
    }

    private long getCurrentDurationMs() {
        ki.s0 s0Var;
        ki.t0 t0Var = this.P;
        if (t0Var != null && (s0Var = this.R) != null) {
            if (s0Var.f15108a == 3) {
                return t0Var.j();
            }
            return s0Var.f15109b;
        }
        return 0L;
    }

    public static void l(t60 t60Var) {
        org.telegram.ui.nl nlVar = t60Var.E;
        if (!t60Var.f31017k0) {
            return;
        }
        t60Var.f31017k0 = false;
        nlVar.invalidate();
        nlVar.animate().cancel();
        nlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.ok okVar;
        if (z10 != this.G0) {
            this.G0 = z10;
            this.F0 = 0L;
            o60 o60Var = this.I0;
            if (z10) {
                yf.h.d().a(30, o60Var);
            } else {
                yf.h.d().f(o60Var);
            }
            if (this.d != z10) {
                this.d = z10;
                x60 x60Var = this.f33422c;
                if (x60Var != null && (okVar = ((org.telegram.ui.sj) x60Var).f41757a.Y) != null) {
                    okVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f31011f.getParentActivity();
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
        t(i10);
        this.P.a();
        i11 i11Var = this.T;
        if (i11Var != null) {
            i11Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        v(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        ki.s0 s0Var;
        i2.f0 f0Var;
        if (this.P != null && (s0Var = this.R) != null && s0Var.f15108a == 5) {
            n();
            if (i10 == 0) {
                this.P.q();
            } else if (i10 == 1) {
                ki.t0 t0Var = this.P;
                t0Var.getClass();
                ki.t0.t();
                if (t0Var.W == 5 && (f0Var = t0Var.S) != null) {
                    f0Var.e();
                    t0Var.x(false);
                    m2.t tVar = t0Var.d;
                    t0Var.S.J0();
                    tVar.getClass();
                }
            } else if (i10 == 2) {
                ki.t0 t0Var2 = this.P;
                long j3 = f7 * ((float) this.R.f15109b);
                t0Var2.getClass();
                ki.t0.t();
                if (t0Var2.W == 5 && t0Var2.S != null) {
                    long j10 = t0Var2.G;
                    t0Var2.S.W0(5, Math.max(j10, Math.min(Math.max(j10, t0Var2.H - 1), j3)));
                    t0Var2.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        p();
        ValueAnimator valueAnimator = this.f31006a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.t0 t0Var = this.P;
        if (t0Var != null) {
            ki.t0.t();
            int i10 = t0Var.W;
            if (i10 == 10) {
                if (!t0Var.C) {
                    t0Var.i();
                }
            } else if (i10 != 8) {
                t0Var.a();
            } else {
                t0Var.e();
                t0Var.r();
                t0Var.f15125l.G();
                t0Var.C = true;
                t0Var.v(10);
                t0Var.m("released");
                t0Var.f15122i.removeCallbacksAndMessages(null);
                t0Var.f15123j.shutdown();
                t0Var.f15124k.shutdown();
            }
            this.P = null;
        }
        i11 i11Var = this.T;
        if (i11Var != null) {
            i11Var.d(true ^ this.f31015i0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        w();
        r60 r60Var = this.v;
        r60Var.setTranslationX(0.0f);
        this.f31030v0 = 0.0f;
        r60Var.setTranslationY(0.0f + this.f31029u0);
        r60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        ki.s0 s0Var = this.R;
        if (s0Var != null) {
            int i10 = s0Var.f15108a;
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
        this.f31029u0 = f10;
        this.v.setTranslationY(this.f31030v0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.s0 s0Var;
        ki.t0 t0Var = this.P;
        if (t0Var != null && (s0Var = this.R) != null) {
            int i13 = 2;
            if (i10 == 3) {
                if (t0Var != null && s0Var != null && s0Var.f15108a == 3) {
                    t(2);
                    this.P.p();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                boolean z11 = false;
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f31019n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f15108a == 3) {
                    t(5);
                } else {
                    n();
                }
                this.V = new s60(j3, i11, i12, z10, j10);
                ki.t0 t0Var2 = this.P;
                boolean z12 = this.f31014h0;
                boolean z13 = !z12;
                t0Var2.getClass();
                ki.t0.t();
                int i14 = t0Var2.W;
                if (i14 == 3 || i14 == 5) {
                    t0Var2.f15126m.b("finish requested: state=" + hg.c.C(t0Var2.W) + ", includeAudio=" + z13 + ", durationMs=" + t0Var2.j() + ", trim=" + t0Var2.G + ".." + t0Var2.H);
                    t0Var2.f15138z = z13;
                    if (t0Var2.W == 3) {
                        t0Var2.E = t0Var2.j();
                        t0Var2.f15137y = true;
                        t0Var2.e();
                        t0Var2.f15122i.removeCallbacks(t0Var2.T);
                        t0Var2.v(7);
                        boolean S = t0Var2.f15125l.S();
                        t0Var2.B = S;
                        if (!S) {
                            t0Var2.h(new IllegalStateException("Unable to stop the camera segment"));
                            return;
                        }
                        return;
                    }
                    t0Var2.r();
                    t0Var2.v(7);
                    if (t0Var2.l() || z12) {
                        z11 = true;
                    }
                    if (t0Var2.l()) {
                        i13 = 1;
                    }
                    t0Var2.f15123j.execute(new ki.h0(t0Var2, t0Var2.Q, z11, t0Var2.R, z13, i13, t0Var2.P));
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
    public w60 getCameraContainer() {
        return this.v;
    }

    @Override
    public RectF getCameraRect() {
        q60 q60Var = this.f31035y;
        int[] iArr = this.K;
        q60Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], q60Var.getWidth() + i10, q60Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f31031w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f31035y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f31031w.getPaint().setAlpha(255);
        this.f31015i0 = false;
        this.f31014h0 = false;
        this.f31010e0 = false;
        this.f31013g0 = false;
        this.f31028t0 = 0L;
        this.f31031w.setProgress(0.0f);
        org.telegram.ui.nl nlVar = this.E;
        if (!this.f31017k0) {
            if (this.f31027s0 == null) {
                try {
                    this.f31027s0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f31027s0;
            if (bitmap != null) {
                nlVar.setImageBitmap(bitmap);
            } else {
                nlVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f31017k0 = true;
            nlVar.animate().cancel();
            nlVar.setAlpha(1.0f);
            nlVar.invalidate();
        }
        this.T = new i11(this.h, this.f31024r);
        this.Q = (ki.r0) qi.e.f46813c.a();
        ki.k0 k0Var = new ki.k0(getContext(), this.f31035y);
        k0Var.f15019c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        k0Var.d = (ki.m0) qi.e.h.a();
        k0Var.f15020e = this.Q;
        k0Var.h = qi.e.f46815f.a();
        k0Var.f15021f = (ki.n0) qi.e.d.a();
        k0Var.f15022g = (ki.o0) qi.e.f46814e.a();
        qi.a aVar = qi.e.f46816g;
        aVar.a();
        k0Var.f15023i = aVar.d;
        m2.t tVar = this.J0;
        k0Var.f15024j = tVar;
        i11 i11Var = this.T;
        k0Var.f15025k = i11Var;
        k0Var.f15026l = new cw(this, 6);
        if (k0Var.d != null) {
            if (k0Var.f15020e != null) {
                if (k0Var.h > 0) {
                    if (k0Var.f15021f != null) {
                        if (k0Var.f15022g != null) {
                            if (tVar != null) {
                                if (i11Var != null) {
                                    this.P = new ki.t0(k0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    ki.t0 t0Var = this.P;
                                    t0Var.getClass();
                                    ki.t0.t();
                                    if (t0Var.W == 1) {
                                        try {
                                            t0Var.f15126m.b("start requested");
                                            t0Var.c(true);
                                            t0Var.v(2);
                                            t0Var.f15125l.R(t0Var.Q, 0L, t0Var.f15129p);
                                        } catch (Exception e7) {
                                            t0Var.h(e7);
                                        }
                                    }
                                    v(true, false);
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
        ki.s0 s0Var;
        ki.t0 t0Var = this.P;
        if (t0Var != null && (s0Var = this.R) != null) {
            int i10 = s0Var.f15108a;
            if (i10 == 3) {
                if (t0Var != null && s0Var != null && i10 == 3) {
                    t(2);
                    this.P.p();
                }
            } else if (i10 == 5) {
                this.U = null;
                this.f31012f0 = true;
                this.f31013g0 = false;
                ki.t0.t();
                if (t0Var.W == 5 && t0Var.H - t0Var.G < t0Var.f15128o) {
                    t0Var.M++;
                    t0Var.f15126m.b("resume requested: trim=" + t0Var.G + ".." + t0Var.H + ", sourceDurationMs=" + t0Var.E);
                    t0Var.r();
                    t0Var.v(6);
                    t0Var.f15123j.execute(new ci.t1(t0Var, t0Var.l(), t0Var.Q, t0Var.P, t0Var.R));
                }
            }
        }
    }

    public final void n() {
        ki.s0 s0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P != null && (s0Var = this.R) != null && (videoEditedInfo = this.U) != null) {
            long j3 = s0Var.f15109b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j10 = this.U.endTime;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            ki.t0 t0Var = this.P;
            t0Var.getClass();
            ki.t0.t();
            if (t0Var.W == 5) {
                long max2 = Math.max(0L, Math.min(t0Var.E, max));
                long max3 = Math.max(max2, Math.min(t0Var.E, j3));
                if (max3 - max2 >= Math.min(800L, t0Var.E)) {
                    t0Var.G = max2;
                    t0Var.H = max3;
                    i2.f0 f0Var = t0Var.S;
                    if (f0Var != null) {
                        f0Var.W0(5, max2);
                    }
                    t0Var.d.getClass();
                    t0Var.o();
                }
            }
        }
    }

    public final Bitmap o(Bitmap bitmap) {
        q60 q60Var = this.f31035y;
        if (q60Var.getWidth() > 0 && q60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            q60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / q60Var.getWidth();
                float height = bitmap.getHeight() / q60Var.getHeight();
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
            r60 r60Var = this.v;
            r60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            r60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
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

    public final void p() {
        if (this.m0 || this.f31022p0) {
            this.f31025r0++;
            removeCallbacks(this.A0);
            FrameLayout frameLayout = this.f31033x;
            frameLayout.animate().cancel();
            frameLayout.animate().setListener(null);
            frameLayout.setRotationY(0.0f);
            this.m0 = false;
            this.f31020n0 = false;
            this.f31021o0 = false;
            this.f31022p0 = false;
            if (!this.f31018l0) {
                return;
            }
            this.f31018l0 = false;
            org.telegram.ui.nl nlVar = this.E;
            nlVar.animate().cancel();
            nlVar.setAlpha(0.0f);
        }
    }

    public final VideoEditedInfo q(File file, long j3, h11 h11Var) {
        long j10;
        int i10;
        int i11;
        ki.o0 o0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        if (h11Var == null) {
            j10 = file.length();
        } else {
            j10 = h11Var.f26882a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j10);
        videoEditedInfo.roundVideo = true;
        ki.t0 t0Var = this.P;
        if (t0Var != null && (o0Var = t0Var.f15132s) != null) {
            i10 = o0Var.f15068a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        ki.r0 r0Var = this.Q;
        if (r0Var == null) {
            i11 = 480;
        } else {
            i11 = r0Var.f15104a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (h11Var != null) {
            videoEditedInfo.file = h11Var.f26883b;
            videoEditedInfo.encryptedFile = h11Var.f26884c;
            videoEditedInfo.key = h11Var.d;
            videoEditedInfo.iv = h11Var.f26885e;
        }
        return videoEditedInfo;
    }

    public final void r() {
        if (this.B0) {
            this.B0 = false;
            this.f31036y0 = -1;
            this.f31037z0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f31006a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31034x0, 0.0f);
            this.f31006a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f31006a0.addUpdateListener(new n60(this, 1));
            this.f31006a0.start();
        }
    }

    public final void s() {
        if (this.m0 && !this.f31022p0 && this.f31020n0 && this.f31021o0) {
            long cameraFlipElapsedMs = getCameraFlipElapsedMs();
            long j3 = 120 - cameraFlipElapsedMs;
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            o60 o60Var = this.A0;
            if (i10 > 0) {
                removeCallbacks(o60Var);
                postDelayed(o60Var, j3);
                return;
            }
            this.f31022p0 = true;
            removeCallbacks(o60Var);
            if (this.f31018l0) {
                this.f31018l0 = false;
                org.telegram.ui.nl nlVar = this.E;
                nlVar.animate().cancel();
                nlVar.setAlpha(0.0f);
            }
            FrameLayout frameLayout = this.f31033x;
            frameLayout.animate().cancel();
            frameLayout.setRotationY(-90.0f);
            long max = Math.max(300L, 580 - cameraFlipElapsedMs);
            int i11 = this.f31025r0;
            StringBuilder u10 = a1.g.u(cameraFlipElapsedMs, "RoundVideo camera flip reveal started: elapsedMs=", ", durationMs=");
            u10.append(max);
            FileLog.d(u10.toString());
            frameLayout.animate().rotationY(0.0f).setDuration(max).setInterpolator(is.h).setListener(new ei.v2(this, i11, 8)).start();
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
        r60 r60Var = this.v;
        r60Var.setAlpha(0.0f);
        r60Var.setScaleX(0.1f);
        r60Var.setScaleY(0.1f);
        r60Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f31031w.getPaint().setAlpha(0);
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

    public final void t(int i10) {
        if (this.f31013g0 && i10 == 2) {
            return;
        }
        this.f31013g0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f31019n), Integer.valueOf(i10));
    }

    public final void u(boolean z10) {
        Bitmap bitmap;
        q60 q60Var = this.f31035y;
        if (q60Var.isAvailable() && (bitmap = q60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = o(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f31027s0;
                    this.f31027s0 = bitmap;
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
                    if (bitmap != this.f31027s0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f31027s0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void v(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        v60 v60Var = this.f33420a;
        if (v60Var != null) {
            ((org.telegram.ui.qe) v60Var).f41156b.f44973vc.a(z10, true);
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
        r60 r60Var = this.v;
        if (z10 && !this.f31016j0) {
            r60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f31030v0 = measuredHeight;
            r60Var.setTranslationY(measuredHeight + this.f31029u0);
        }
        this.f31016j0 = z10;
        View view = this.f31026s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f31028t0) > 300) {
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r60Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r60Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(r60Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(r60Var, View.TRANSLATION_X, f7);
        if (this.f31014h0 && z10) {
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

    public final void w() {
        if (!this.C0) {
            return;
        }
        this.C0 = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public final void x() {
        boolean z10;
        ki.l0 l0Var;
        ki.s0 s0Var = this.R;
        boolean z11 = false;
        if (s0Var != null && s0Var.f15108a == 3 && !s0Var.f15111e && !this.m0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G.setEnabled(z10);
        if (z10 && (l0Var = this.S) != null && l0Var.f15030b != 1) {
            z11 = true;
        }
        this.H.setEnabled(z11);
        y();
    }

    public final void y() {
        ki.s0 s0Var = this.R;
        int i10 = this.O;
        ci.u2 u2Var = this.H;
        if (s0Var != null && s0Var.f15112f) {
            if (this.f31009d0 == null) {
                ek0 ek0Var = new ek0(R.raw.roundcamera_flash_off, i10, i10);
                this.f31009d0 = ek0Var;
                ek0Var.setCallback(u2Var);
            }
            u2Var.setImageDrawable(this.f31009d0);
            return;
        }
        if (this.f31008c0 == null) {
            ek0 ek0Var2 = new ek0(R.raw.roundcamera_flash_on, i10, i10);
            this.f31008c0 = ek0Var2;
            ek0Var2.setCallback(u2Var);
        }
        u2Var.setImageDrawable(this.f31008c0);
    }

    public final void z() {
        org.telegram.ui.ok okVar;
        float f7;
        ki.s0 s0Var = this.R;
        if (s0Var != null) {
            long j3 = s0Var.d;
            if (s0Var.f15108a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + s0Var.f15109b) - s0Var.f15110c);
                this.f31028t0 = min;
                this.f31031w.setProgress(((float) min) / ((float) j3));
                x60 x60Var = this.f33422c;
                if (x60Var != null && (okVar = ((org.telegram.ui.sj) x60Var).f41757a.Y) != null && okVar.f23902j1) {
                    okVar.f23896i1 = min;
                    zg zgVar = okVar.Y0;
                    if (zgVar != null && zgVar.f33510r) {
                        zgVar.h = min;
                        zgVar.invalidate();
                    }
                    wg wgVar = okVar.l1;
                    if (wgVar != null && wgVar.f32636n) {
                        if (!wgVar.h) {
                            long j10 = wgVar.f32637r;
                            if (j10 >= 0) {
                                if (!wgVar.f32634e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    wgVar.f32631a = f7;
                                }
                                wgVar.invalidate();
                            }
                        }
                        wgVar.f32637r = min;
                        wgVar.f32631a = 1.0f;
                        wgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = okVar.f23907k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f24007n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }
}
