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
import org.telegram.ui.Components.yi;
import org.telegram.ui.ii1;
import org.telegram.ui.zn;
public final class w5 {
    public final ViewGroup f35668a;
    public final View f35669b;
    public final yi f35670c;
    public final d6 d;
    public final zn f35671e;
    public final TL_wallet.walletTransaction f35672f;
    public final Runnable f35673g;
    public final t5 h;
    public final d6 f35674i;
    public final m8 f35675j = new m8();
    public final PathInterpolator f35676k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35677l;
    public final AnimatorSet f35678m;
    public final RectF f35679n;
    public final RectF f35680o;
    public org.telegram.ui.Cells.w0 f35681p;
    public final u5 f35682q;
    public float f35683r;
    public boolean f35684s;
    public boolean f35685t;
    public boolean f35686u;
    public boolean v;
    public final long f35687w;
    public final s5 f35688x;

    public w5(ViewGroup viewGroup, View view, d6 d6Var, zn znVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, yi yiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35678m = animatorSet;
        this.f35680o = new RectF();
        this.f35687w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final w5 f35549b;

            {
                this.f35549b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f35549b;
                        d6 d6Var2 = w5Var.d;
                        float f7 = w5Var.f35677l;
                        ViewGroup viewGroup2 = w5Var.f35668a;
                        u5 u5Var = w5Var.f35682q;
                        AnimatorSet animatorSet2 = w5Var.f35678m;
                        d6 d6Var3 = w5Var.f35674i;
                        RectF rectF = w5Var.f35680o;
                        RectF rectF2 = w5Var.f35679n;
                        if (!w5Var.v && !w5Var.f35686u) {
                            w5Var.e();
                            w5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = w5Var.f35671e.u8(w5Var.f35672f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = w5Var.f35681p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    w5Var.f35681p = u82;
                                }
                                d3 d3Var = w5Var.f35681p.I0.f34886m;
                                if (w5Var.f35685t && u5Var.h && d3Var != null && d3Var.h && d3Var.getWidth() > 0 && !w5Var.f35681p.isLayoutRequested()) {
                                    rectF.set(w5Var.c(d3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        w5Var.f35686u = true;
                                        w5Var.f35681p.I0.i(true);
                                        d6Var3.f(d6Var2);
                                        d6Var3.setAlpha(f7);
                                        d6Var2.setAlpha(0.0f);
                                        w5Var.f35675j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - w5Var.f35687w <= 700 && !w5Var.f35684s && viewGroup2.isAttachedToWindow()) {
                                w5Var.h.postOnAnimation(w5Var.f35688x);
                                return;
                            }
                            w5Var.f35686u = true;
                            d6Var3.setAlpha(0.0f);
                            u5Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35549b.d();
                        return;
                    default:
                        this.f35549b.f35685t = true;
                        return;
                }
            }
        };
        this.f35688x = r12;
        this.f35670c = yiVar;
        this.f35668a = viewGroup;
        this.f35669b = view;
        this.d = d6Var;
        this.f35677l = d6Var.getAlpha();
        this.f35671e = znVar;
        this.f35672f = wallettransaction;
        this.f35673g = runnable;
        RectF a2 = x8.a(viewGroup, d6Var);
        this.f35679n = a2;
        e();
        t5 t5Var = new t5(this, viewGroup.getContext());
        this.h = t5Var;
        t5Var.setClipChildren(false);
        t5Var.setClipToPadding(false);
        t5Var.setClickable(true);
        d6 d6Var2 = new d6(60, viewGroup.getContext(), true);
        this.f35674i = d6Var2;
        d6Var2.setContinuousRotation(540.0f);
        d6Var2.f(d6Var);
        d6Var2.setAlpha(0.0f);
        t5Var.addView(d6Var2, w7.x5.e(60, 60, 51));
        u5 u5Var = new u5(this, viewGroup.getContext(), new Runnable(this) {
            public final w5 f35549b;

            {
                this.f35549b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f35549b;
                        d6 d6Var22 = w5Var.d;
                        float f7 = w5Var.f35677l;
                        ViewGroup viewGroup2 = w5Var.f35668a;
                        u5 u5Var2 = w5Var.f35682q;
                        AnimatorSet animatorSet2 = w5Var.f35678m;
                        d6 d6Var3 = w5Var.f35674i;
                        RectF rectF = w5Var.f35680o;
                        RectF rectF2 = w5Var.f35679n;
                        if (!w5Var.v && !w5Var.f35686u) {
                            w5Var.e();
                            w5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = w5Var.f35671e.u8(w5Var.f35672f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = w5Var.f35681p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    w5Var.f35681p = u82;
                                }
                                d3 d3Var = w5Var.f35681p.I0.f34886m;
                                if (w5Var.f35685t && u5Var2.h && d3Var != null && d3Var.h && d3Var.getWidth() > 0 && !w5Var.f35681p.isLayoutRequested()) {
                                    rectF.set(w5Var.c(d3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        w5Var.f35686u = true;
                                        w5Var.f35681p.I0.i(true);
                                        d6Var3.f(d6Var22);
                                        d6Var3.setAlpha(f7);
                                        d6Var22.setAlpha(0.0f);
                                        w5Var.f35675j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - w5Var.f35687w <= 700 && !w5Var.f35684s && viewGroup2.isAttachedToWindow()) {
                                w5Var.h.postOnAnimation(w5Var.f35688x);
                                return;
                            }
                            w5Var.f35686u = true;
                            d6Var3.setAlpha(0.0f);
                            u5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35549b.d();
                        return;
                    default:
                        this.f35549b.f35685t = true;
                        return;
                }
            }
        });
        this.f35682q = u5Var;
        u5Var.setAlpha(0.001f);
        u5Var.setPaused(false);
        t5Var.addView(u5Var, w7.x5.e(60, 60, 51));
        viewGroup.addView(t5Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        d6Var2.l(new Runnable(this) {
            public final w5 f35549b;

            {
                this.f35549b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f35549b;
                        d6 d6Var22 = w5Var.d;
                        float f7 = w5Var.f35677l;
                        ViewGroup viewGroup2 = w5Var.f35668a;
                        u5 u5Var2 = w5Var.f35682q;
                        AnimatorSet animatorSet2 = w5Var.f35678m;
                        d6 d6Var3 = w5Var.f35674i;
                        RectF rectF = w5Var.f35680o;
                        RectF rectF2 = w5Var.f35679n;
                        if (!w5Var.v && !w5Var.f35686u) {
                            w5Var.e();
                            w5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = w5Var.f35671e.u8(w5Var.f35672f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = w5Var.f35681p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    w5Var.f35681p = u82;
                                }
                                d3 d3Var = w5Var.f35681p.I0.f34886m;
                                if (w5Var.f35685t && u5Var2.h && d3Var != null && d3Var.h && d3Var.getWidth() > 0 && !w5Var.f35681p.isLayoutRequested()) {
                                    rectF.set(w5Var.c(d3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        w5Var.f35686u = true;
                                        w5Var.f35681p.I0.i(true);
                                        d6Var3.f(d6Var22);
                                        d6Var3.setAlpha(f7);
                                        d6Var22.setAlpha(0.0f);
                                        w5Var.f35675j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - w5Var.f35687w <= 700 && !w5Var.f35684s && viewGroup2.isAttachedToWindow()) {
                                w5Var.h.postOnAnimation(w5Var.f35688x);
                                return;
                            }
                            w5Var.f35686u = true;
                            d6Var3.setAlpha(0.0f);
                            u5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35549b.d();
                        return;
                    default:
                        this.f35549b.f35685t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new t2(this, 4));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new v5(this, yiVar, d6Var));
        t5Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        s5 s5Var = this.f35688x;
        t5 t5Var = this.h;
        t5Var.removeCallbacks(s5Var);
        d6 d6Var = this.f35674i;
        d6Var.l(null);
        org.telegram.ui.Cells.w0 w0Var = this.f35681p;
        if (w0Var != null) {
            w0Var.I0.i(false);
            if (z10 && this.f35683r >= 1.0f) {
                RectF rectF = this.f35680o;
                if (!rectF.isEmpty() && this.f35681p.isAttachedToWindow() && k0.F(this.f35681p.getMessageObject(), this.f35672f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f35679n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    e3 e3Var = this.f35681p.I0;
                    e3Var.l();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    e3Var.f34867b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.f16942u = lVar;
                    e3Var.f34867b0.e(0.001f);
                    e3Var.f34867b0.f16931a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    e3Var.f34867b0.b(new z2(e3Var, 1));
                    e3Var.f34867b0.h();
                }
            }
        }
        u5 u5Var = this.f35682q;
        u5Var.setPaused(true);
        t5Var.removeView(u5Var);
        d6Var.setPaused(true);
        t5Var.removeView(d6Var);
        t5Var.setClickable(false);
        this.d.setAlpha(this.f35677l);
        yi yiVar = this.f35670c;
        if (yiVar == null) {
            this.f35669b.setTranslationY(0.0f);
        } else {
            yiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35668a;
        if (yiVar != null && z10 && this.f35675j.d()) {
            zn znVar = this.f35671e;
            if (znVar.getParentLayout() != null) {
                ViewGroup view = znVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(t5Var);
                    t5Var.setTranslationX(iArr[0] - iArr2[0]);
                    t5Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(t5Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f35673g.run();
        AndroidUtilities.runOnUIThread(new ii1(13, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        t5 t5Var = this.h;
        float f12 = dp / 2.0f;
        d6 d6Var = this.f35674i;
        d6Var.setTranslationX((f7 - t5Var.getLeft()) - f12);
        d6Var.setTranslationY((f10 - t5Var.getTop()) - f12);
        float f13 = f11 / dp;
        d6Var.setScaleX(f13);
        d6Var.setScaleY(f13);
        float translationX = d6Var.getTranslationX();
        u5 u5Var = this.f35682q;
        u5Var.setTranslationX(translationX);
        u5Var.setTranslationY(d6Var.getTranslationY());
        u5Var.setScaleX(f13);
        u5Var.setScaleY(f13);
    }

    public final RectF c(d3 d3Var) {
        yi yiVar = this.f35670c;
        ViewGroup viewGroup = this.f35668a;
        if (yiVar == null) {
            return x8.a(viewGroup, d3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) d3Var.getRootView();
        RectF a2 = x8.a(viewGroup2, d3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        u5 u5Var = this.f35682q;
        if (u5Var == null) {
            return;
        }
        d6 d6Var = this.f35674i;
        float flightYaw = d6Var.getFlightYaw();
        float flightPitch = d6Var.getFlightPitch();
        if (this.f35681p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f35683r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.vision.e2.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f35681p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f35681p.I0.f34882k.E * 0.14f) - flightPitch) * B;
        }
        u5Var.f48201n = flightYaw;
        u5Var.f48202r = flightPitch;
        u5Var.f48203s = true;
        u5Var.v = true;
    }

    public final void e() {
        d6 d6Var = this.d;
        if (d6Var.isAttachedToWindow()) {
            View rootView = d6Var.getRootView();
            ViewGroup viewGroup = this.f35668a;
            if (rootView == viewGroup.getRootView()) {
                yi yiVar = this.f35670c;
                RectF rectF = this.f35679n;
                if (yiVar == null) {
                    x8.f(d6Var, this.f35669b, viewGroup, rectF);
                    return;
                }
                rectF.set(x8.a(viewGroup, d6Var));
                rectF.offset(0.0f, yiVar.f33263o2 - yiVar.f33296y0);
            }
        }
    }
}
