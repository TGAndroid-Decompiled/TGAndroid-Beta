package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.vi;
import org.telegram.ui.fo;
import org.telegram.ui.wg1;
public final class v5 {
    public final ViewGroup f33506a;
    public final View f33507b;
    public final vi f33508c;
    public final c6 d;
    public final fo e;
    public final TL_wallet.walletTransaction f33509f;
    public final Runnable f33510g;
    public final s5 h;
    public final c6 f33511i;
    public final l8 f33512j = new l8();
    public final PathInterpolator f33513k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f33514l;
    public final AnimatorSet f33515m;
    public final RectF f33516n;
    public final RectF f33517o;
    public org.telegram.ui.Cells.w0 f33518p;
    public final t5 f33519q;
    public float f33520r;
    public boolean f33521s;
    public boolean f33522t;
    public boolean f33523u;
    public boolean v;
    public final long f33524w;
    public final r5 f33525x;

    public v5(ViewGroup viewGroup, View view, c6 c6Var, fo foVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, vi viVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33515m = animatorSet;
        this.f33517o = new RectF();
        this.f33524w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final v5 f33399b;

            {
                this.f33399b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        v5 v5Var = this.f33399b;
                        c6 c6Var2 = v5Var.d;
                        float f7 = v5Var.f33514l;
                        ViewGroup viewGroup2 = v5Var.f33506a;
                        t5 t5Var = v5Var.f33519q;
                        AnimatorSet animatorSet2 = v5Var.f33515m;
                        c6 c6Var3 = v5Var.f33511i;
                        RectF rectF = v5Var.f33517o;
                        RectF rectF2 = v5Var.f33516n;
                        if (!v5Var.v && !v5Var.f33523u) {
                            v5Var.e();
                            v5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = v5Var.e.u8(v5Var.f33509f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = v5Var.f33518p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    v5Var.f33518p = u82;
                                }
                                d3 d3Var = v5Var.f33518p.I0.f32843m;
                                if (v5Var.f33522t && t5Var.h && d3Var != null && d3Var.h && d3Var.getWidth() > 0 && !v5Var.f33518p.isLayoutRequested()) {
                                    rectF.set(v5Var.c(d3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        v5Var.f33523u = true;
                                        v5Var.f33518p.I0.i(true);
                                        c6Var3.f(c6Var2);
                                        c6Var3.setAlpha(f7);
                                        c6Var2.setAlpha(0.0f);
                                        v5Var.f33512j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - v5Var.f33524w <= 700 && !v5Var.f33521s && viewGroup2.isAttachedToWindow()) {
                                v5Var.h.postOnAnimation(v5Var.f33525x);
                                return;
                            }
                            v5Var.f33523u = true;
                            c6Var3.setAlpha(0.0f);
                            t5Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f33399b.d();
                        return;
                    default:
                        this.f33399b.f33522t = true;
                        return;
                }
            }
        };
        this.f33525x = r12;
        this.f33508c = viVar;
        this.f33506a = viewGroup;
        this.f33507b = view;
        this.d = c6Var;
        this.f33514l = c6Var.getAlpha();
        this.e = foVar;
        this.f33509f = wallettransaction;
        this.f33510g = runnable;
        RectF a2 = w8.a(viewGroup, c6Var);
        this.f33516n = a2;
        e();
        s5 s5Var = new s5(this, viewGroup.getContext());
        this.h = s5Var;
        s5Var.setClipChildren(false);
        s5Var.setClipToPadding(false);
        s5Var.setClickable(true);
        c6 c6Var2 = new c6(60, viewGroup.getContext(), true);
        this.f33511i = c6Var2;
        c6Var2.setContinuousRotation(540.0f);
        c6Var2.f(c6Var);
        c6Var2.setAlpha(0.0f);
        s5Var.addView(c6Var2, w7.z5.e(60, 60, 51));
        t5 t5Var = new t5(this, viewGroup.getContext(), new Runnable(this) {
            public final v5 f33399b;

            {
                this.f33399b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        v5 v5Var = this.f33399b;
                        c6 c6Var22 = v5Var.d;
                        float f7 = v5Var.f33514l;
                        ViewGroup viewGroup2 = v5Var.f33506a;
                        t5 t5Var2 = v5Var.f33519q;
                        AnimatorSet animatorSet2 = v5Var.f33515m;
                        c6 c6Var3 = v5Var.f33511i;
                        RectF rectF = v5Var.f33517o;
                        RectF rectF2 = v5Var.f33516n;
                        if (!v5Var.v && !v5Var.f33523u) {
                            v5Var.e();
                            v5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = v5Var.e.u8(v5Var.f33509f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = v5Var.f33518p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    v5Var.f33518p = u82;
                                }
                                d3 d3Var = v5Var.f33518p.I0.f32843m;
                                if (v5Var.f33522t && t5Var2.h && d3Var != null && d3Var.h && d3Var.getWidth() > 0 && !v5Var.f33518p.isLayoutRequested()) {
                                    rectF.set(v5Var.c(d3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        v5Var.f33523u = true;
                                        v5Var.f33518p.I0.i(true);
                                        c6Var3.f(c6Var22);
                                        c6Var3.setAlpha(f7);
                                        c6Var22.setAlpha(0.0f);
                                        v5Var.f33512j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - v5Var.f33524w <= 700 && !v5Var.f33521s && viewGroup2.isAttachedToWindow()) {
                                v5Var.h.postOnAnimation(v5Var.f33525x);
                                return;
                            }
                            v5Var.f33523u = true;
                            c6Var3.setAlpha(0.0f);
                            t5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f33399b.d();
                        return;
                    default:
                        this.f33399b.f33522t = true;
                        return;
                }
            }
        });
        this.f33519q = t5Var;
        t5Var.setAlpha(0.001f);
        t5Var.setPaused(false);
        s5Var.addView(t5Var, w7.z5.e(60, 60, 51));
        viewGroup.addView(s5Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        c6Var2.l(new Runnable(this) {
            public final v5 f33399b;

            {
                this.f33399b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        v5 v5Var = this.f33399b;
                        c6 c6Var22 = v5Var.d;
                        float f7 = v5Var.f33514l;
                        ViewGroup viewGroup2 = v5Var.f33506a;
                        t5 t5Var2 = v5Var.f33519q;
                        AnimatorSet animatorSet2 = v5Var.f33515m;
                        c6 c6Var3 = v5Var.f33511i;
                        RectF rectF = v5Var.f33517o;
                        RectF rectF2 = v5Var.f33516n;
                        if (!v5Var.v && !v5Var.f33523u) {
                            v5Var.e();
                            v5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = v5Var.e.u8(v5Var.f33509f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = v5Var.f33518p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    v5Var.f33518p = u82;
                                }
                                d3 d3Var = v5Var.f33518p.I0.f32843m;
                                if (v5Var.f33522t && t5Var2.h && d3Var != null && d3Var.h && d3Var.getWidth() > 0 && !v5Var.f33518p.isLayoutRequested()) {
                                    rectF.set(v5Var.c(d3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        v5Var.f33523u = true;
                                        v5Var.f33518p.I0.i(true);
                                        c6Var3.f(c6Var22);
                                        c6Var3.setAlpha(f7);
                                        c6Var22.setAlpha(0.0f);
                                        v5Var.f33512j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - v5Var.f33524w <= 700 && !v5Var.f33521s && viewGroup2.isAttachedToWindow()) {
                                v5Var.h.postOnAnimation(v5Var.f33525x);
                                return;
                            }
                            v5Var.f33523u = true;
                            c6Var3.setAlpha(0.0f);
                            t5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f33399b.d();
                        return;
                    default:
                        this.f33399b.f33522t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new t2(this, 4));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new u5(this, viVar, c6Var));
        s5Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        r5 r5Var = this.f33525x;
        s5 s5Var = this.h;
        s5Var.removeCallbacks(r5Var);
        c6 c6Var = this.f33511i;
        c6Var.l(null);
        org.telegram.ui.Cells.w0 w0Var = this.f33518p;
        if (w0Var != null) {
            w0Var.I0.i(false);
            if (z10 && this.f33520r >= 1.0f) {
                RectF rectF = this.f33517o;
                if (!rectF.isEmpty() && this.f33518p.isAttachedToWindow() && k0.F(this.f33518p.getMessageObject(), this.f33509f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f33516n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    e3 e3Var = this.f33518p.I0;
                    e3Var.l();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    e3Var.f32825b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.f16161u = lVar;
                    e3Var.f32825b0.e(0.001f);
                    e3Var.f32825b0.f16151a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    e3Var.f32825b0.b(new z2(e3Var, 1));
                    e3Var.f32825b0.h();
                }
            }
        }
        t5 t5Var = this.f33519q;
        t5Var.setPaused(true);
        s5Var.removeView(t5Var);
        c6Var.setPaused(true);
        s5Var.removeView(c6Var);
        s5Var.setClickable(false);
        this.d.setAlpha(this.f33514l);
        vi viVar = this.f33508c;
        if (viVar == null) {
            this.f33507b.setTranslationY(0.0f);
        } else {
            viVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f33506a;
        if (viVar != null && z10 && this.f33512j.d()) {
            fo foVar = this.e;
            if (foVar.getParentLayout() != null) {
                ViewGroup view = foVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(s5Var);
                    s5Var.setTranslationX(iArr[0] - iArr2[0]);
                    s5Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(s5Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f33510g.run();
        AndroidUtilities.runOnUIThread(new wg1(19, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        s5 s5Var = this.h;
        float f12 = dp / 2.0f;
        c6 c6Var = this.f33511i;
        c6Var.setTranslationX((f7 - s5Var.getLeft()) - f12);
        c6Var.setTranslationY((f10 - s5Var.getTop()) - f12);
        float f13 = f11 / dp;
        c6Var.setScaleX(f13);
        c6Var.setScaleY(f13);
        float translationX = c6Var.getTranslationX();
        t5 t5Var = this.f33519q;
        t5Var.setTranslationX(translationX);
        t5Var.setTranslationY(c6Var.getTranslationY());
        t5Var.setScaleX(f13);
        t5Var.setScaleY(f13);
    }

    public final RectF c(d3 d3Var) {
        vi viVar = this.f33508c;
        ViewGroup viewGroup = this.f33506a;
        if (viVar == null) {
            return w8.a(viewGroup, d3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) d3Var.getRootView();
        RectF a2 = w8.a(viewGroup2, d3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        t5 t5Var = this.f33519q;
        if (t5Var == null) {
            return;
        }
        c6 c6Var = this.f33511i;
        float flightYaw = c6Var.getFlightYaw();
        float flightPitch = c6Var.getFlightPitch();
        if (this.f33518p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f33520r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f33518p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f33518p.I0.f32839k.E * 0.14f) - flightPitch) * B;
        }
        t5Var.f45814n = flightYaw;
        t5Var.f45815r = flightPitch;
        t5Var.f45816s = true;
        t5Var.v = true;
    }

    public final void e() {
        c6 c6Var = this.d;
        if (c6Var.isAttachedToWindow()) {
            View rootView = c6Var.getRootView();
            ViewGroup viewGroup = this.f33506a;
            if (rootView == viewGroup.getRootView()) {
                vi viVar = this.f33508c;
                RectF rectF = this.f33516n;
                if (viVar == null) {
                    w8.f(c6Var, this.f33507b, viewGroup, rectF);
                    return;
                }
                rectF.set(w8.a(viewGroup, c6Var));
                rectF.offset(0.0f, viVar.f29700o2 - viVar.f29733y0);
            }
        }
    }
}
