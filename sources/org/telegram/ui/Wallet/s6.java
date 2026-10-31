package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bi;
import org.telegram.ui.un;
public final class s6 {
    public final ViewGroup f35181a;
    public final View f35182b;
    public final bi f35183c;
    public final a7 d;
    public final un e;
    public final TL_wallet.walletTransaction f35184f;
    public final Runnable f35185g;
    public final p6 h;
    public final a7 f35186i;
    public final t9 f35187j = new t9();
    public final PathInterpolator f35188k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35189l;
    public final AnimatorSet f35190m;
    public final RectF f35191n;
    public final RectF f35192o;
    public org.telegram.ui.Cells.s0 f35193p;
    public final q6 f35194q;
    public float f35195r;
    public boolean f35196s;
    public boolean f35197t;
    public boolean f35198u;
    public boolean v;
    public final long f35199w;
    public final o6 f35200x;

    public s6(ViewGroup viewGroup, View view, a7 a7Var, un unVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, bi biVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35190m = animatorSet;
        this.f35192o = new RectF();
        this.f35199w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final s6 f34985b;

            {
                this.f34985b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        s6 s6Var = this.f34985b;
                        a7 a7Var2 = s6Var.d;
                        float f7 = s6Var.f35189l;
                        ViewGroup viewGroup2 = s6Var.f35181a;
                        q6 q6Var = s6Var.f35194q;
                        AnimatorSet animatorSet2 = s6Var.f35190m;
                        a7 a7Var3 = s6Var.f35186i;
                        RectF rectF = s6Var.f35192o;
                        RectF rectF2 = s6Var.f35191n;
                        if (!s6Var.v && !s6Var.f35198u) {
                            s6Var.e();
                            s6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.s0 B8 = s6Var.e.B8(s6Var.f35184f);
                            if (B8 != null && B8.getWidth() > 0) {
                                org.telegram.ui.Cells.s0 s0Var = s6Var.f35193p;
                                if (s0Var != B8) {
                                    if (s0Var != null) {
                                        s0Var.I0.i(false);
                                    }
                                    s6Var.f35193p = B8;
                                }
                                c4 c4Var = s6Var.f35193p.I0.f34398m;
                                if (s6Var.f35197t && q6Var.f11999n && c4Var != null && c4Var.f11999n && c4Var.getWidth() > 0 && !s6Var.f35193p.isLayoutRequested()) {
                                    rectF.set(s6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        s6Var.f35198u = true;
                                        s6Var.f35193p.I0.i(true);
                                        a7Var3.f(a7Var2);
                                        a7Var3.setAlpha(f7);
                                        a7Var2.setAlpha(0.0f);
                                        s6Var.f35187j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - s6Var.f35199w <= 700 && !s6Var.f35196s && viewGroup2.isAttachedToWindow()) {
                                s6Var.h.postOnAnimation(s6Var.f35200x);
                                return;
                            }
                            s6Var.f35198u = true;
                            a7Var3.setAlpha(0.0f);
                            q6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34985b.d();
                        return;
                    default:
                        this.f34985b.f35197t = true;
                        return;
                }
            }
        };
        this.f35200x = r12;
        this.f35183c = biVar;
        this.f35181a = viewGroup;
        this.f35182b = view;
        this.d = a7Var;
        this.f35189l = a7Var.getAlpha();
        this.e = unVar;
        this.f35184f = wallettransaction;
        this.f35185g = runnable;
        RectF a2 = fa.a(a7Var, viewGroup);
        this.f35191n = a2;
        e();
        p6 p6Var = new p6(this, viewGroup.getContext());
        this.h = p6Var;
        p6Var.setClipChildren(false);
        p6Var.setClipToPadding(false);
        p6Var.setClickable(true);
        a7 a7Var2 = new a7(60, viewGroup.getContext(), true);
        this.f35186i = a7Var2;
        a7Var2.setContinuousRotation(540.0f);
        a7Var2.f(a7Var);
        a7Var2.setAlpha(0.0f);
        p6Var.addView(a7Var2, w7.b6.e(60, 60, 51));
        q6 q6Var = new q6(this, viewGroup.getContext(), new Runnable(this) {
            public final s6 f34985b;

            {
                this.f34985b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        s6 s6Var = this.f34985b;
                        a7 a7Var22 = s6Var.d;
                        float f7 = s6Var.f35189l;
                        ViewGroup viewGroup2 = s6Var.f35181a;
                        q6 q6Var2 = s6Var.f35194q;
                        AnimatorSet animatorSet2 = s6Var.f35190m;
                        a7 a7Var3 = s6Var.f35186i;
                        RectF rectF = s6Var.f35192o;
                        RectF rectF2 = s6Var.f35191n;
                        if (!s6Var.v && !s6Var.f35198u) {
                            s6Var.e();
                            s6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.s0 B8 = s6Var.e.B8(s6Var.f35184f);
                            if (B8 != null && B8.getWidth() > 0) {
                                org.telegram.ui.Cells.s0 s0Var = s6Var.f35193p;
                                if (s0Var != B8) {
                                    if (s0Var != null) {
                                        s0Var.I0.i(false);
                                    }
                                    s6Var.f35193p = B8;
                                }
                                c4 c4Var = s6Var.f35193p.I0.f34398m;
                                if (s6Var.f35197t && q6Var2.f11999n && c4Var != null && c4Var.f11999n && c4Var.getWidth() > 0 && !s6Var.f35193p.isLayoutRequested()) {
                                    rectF.set(s6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        s6Var.f35198u = true;
                                        s6Var.f35193p.I0.i(true);
                                        a7Var3.f(a7Var22);
                                        a7Var3.setAlpha(f7);
                                        a7Var22.setAlpha(0.0f);
                                        s6Var.f35187j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - s6Var.f35199w <= 700 && !s6Var.f35196s && viewGroup2.isAttachedToWindow()) {
                                s6Var.h.postOnAnimation(s6Var.f35200x);
                                return;
                            }
                            s6Var.f35198u = true;
                            a7Var3.setAlpha(0.0f);
                            q6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34985b.d();
                        return;
                    default:
                        this.f34985b.f35197t = true;
                        return;
                }
            }
        });
        this.f35194q = q6Var;
        q6Var.setAlpha(0.001f);
        q6Var.setPaused(false);
        p6Var.addView(q6Var, w7.b6.e(60, 60, 51));
        viewGroup.addView(p6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        a7Var2.l(new Runnable(this) {
            public final s6 f34985b;

            {
                this.f34985b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        s6 s6Var = this.f34985b;
                        a7 a7Var22 = s6Var.d;
                        float f7 = s6Var.f35189l;
                        ViewGroup viewGroup2 = s6Var.f35181a;
                        q6 q6Var2 = s6Var.f35194q;
                        AnimatorSet animatorSet2 = s6Var.f35190m;
                        a7 a7Var3 = s6Var.f35186i;
                        RectF rectF = s6Var.f35192o;
                        RectF rectF2 = s6Var.f35191n;
                        if (!s6Var.v && !s6Var.f35198u) {
                            s6Var.e();
                            s6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.s0 B8 = s6Var.e.B8(s6Var.f35184f);
                            if (B8 != null && B8.getWidth() > 0) {
                                org.telegram.ui.Cells.s0 s0Var = s6Var.f35193p;
                                if (s0Var != B8) {
                                    if (s0Var != null) {
                                        s0Var.I0.i(false);
                                    }
                                    s6Var.f35193p = B8;
                                }
                                c4 c4Var = s6Var.f35193p.I0.f34398m;
                                if (s6Var.f35197t && q6Var2.f11999n && c4Var != null && c4Var.f11999n && c4Var.getWidth() > 0 && !s6Var.f35193p.isLayoutRequested()) {
                                    rectF.set(s6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        s6Var.f35198u = true;
                                        s6Var.f35193p.I0.i(true);
                                        a7Var3.f(a7Var22);
                                        a7Var3.setAlpha(f7);
                                        a7Var22.setAlpha(0.0f);
                                        s6Var.f35187j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - s6Var.f35199w <= 700 && !s6Var.f35196s && viewGroup2.isAttachedToWindow()) {
                                s6Var.h.postOnAnimation(s6Var.f35200x);
                                return;
                            }
                            s6Var.f35198u = true;
                            a7Var3.setAlpha(0.0f);
                            q6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34985b.d();
                        return;
                    default:
                        this.f34985b.f35197t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new r3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new r6(this, biVar, a7Var));
        p6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        o6 o6Var = this.f35200x;
        p6 p6Var = this.h;
        p6Var.removeCallbacks(o6Var);
        a7 a7Var = this.f35186i;
        a7Var.l(null);
        org.telegram.ui.Cells.s0 s0Var = this.f35193p;
        if (s0Var != null) {
            s0Var.I0.i(false);
            if (z10 && this.f35195r >= 1.0f) {
                RectF rectF = this.f35192o;
                if (!rectF.isEmpty() && this.f35193p.isAttachedToWindow() && k0.I(this.f35193p.getMessageObject(), this.f35184f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f35191n.centerY(), rectF.centerY()) - org.telegram.messenger.i0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.i0.f16025p;
                    d4 d4Var = this.f35193p.I0;
                    d4Var.l();
                    o1.j jVar = new o1.j(new o1.i(0.0f));
                    d4Var.f34380b0 = jVar;
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.65f);
                    kVar.b(200.0f);
                    jVar.f13957m = kVar;
                    d4Var.f34380b0.f(0.001f);
                    d4Var.f34380b0.f13948a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    d4Var.f34380b0.b(new x3(d4Var, 1));
                    d4Var.f34380b0.h();
                }
            }
        }
        q6 q6Var = this.f35194q;
        q6Var.setPaused(true);
        p6Var.removeView(q6Var);
        a7Var.setPaused(true);
        p6Var.removeView(a7Var);
        p6Var.setClickable(false);
        this.d.setAlpha(this.f35189l);
        bi biVar = this.f35183c;
        if (biVar == null) {
            this.f35182b.setTranslationY(0.0f);
        } else {
            biVar.w1(1.0f);
        }
        ViewGroup viewGroup = this.f35181a;
        if (biVar != null && z10 && this.f35187j.d()) {
            un unVar = this.e;
            if (unVar.getParentLayout() != null) {
                ViewGroup view = unVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(p6Var);
                    p6Var.setTranslationX(iArr[0] - iArr2[0]);
                    p6Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(p6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f35185g.run();
        org.telegram.messenger.i0.h3(new k3(10, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float L = org.telegram.messenger.i0.L(60.0f);
        p6 p6Var = this.h;
        float f12 = L / 2.0f;
        a7 a7Var = this.f35186i;
        a7Var.setTranslationX((f7 - p6Var.getLeft()) - f12);
        a7Var.setTranslationY((f10 - p6Var.getTop()) - f12);
        float f13 = f11 / L;
        a7Var.setScaleX(f13);
        a7Var.setScaleY(f13);
        float translationX = a7Var.getTranslationX();
        q6 q6Var = this.f35194q;
        q6Var.setTranslationX(translationX);
        q6Var.setTranslationY(a7Var.getTranslationY());
        q6Var.setScaleX(f13);
        q6Var.setScaleY(f13);
    }

    public final RectF c(c4 c4Var) {
        bi biVar = this.f35183c;
        ViewGroup viewGroup = this.f35181a;
        if (biVar == null) {
            return fa.a(c4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) c4Var.getRootView();
        RectF a2 = fa.a(c4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        q6 q6Var = this.f35194q;
        if (q6Var == null) {
            return;
        }
        a7 a7Var = this.f35186i;
        float flightYaw = a7Var.getFlightYaw();
        float flightPitch = a7Var.getFlightPitch();
        if (this.f35193p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f35195r - 0.55f) / 0.45f));
            float D = c3.i0.D(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f35193p.I0.g() - flightYaw, 6.283185307179586d)) * D;
            flightPitch += ((this.f35193p.I0.f34394k.E * 0.14f) - flightPitch) * D;
        }
        q6Var.f12000r = flightYaw;
        q6Var.f12001s = flightPitch;
        q6Var.f12002w = true;
        q6Var.f12003x = true;
    }

    public final void e() {
        a7 a7Var = this.d;
        if (a7Var.isAttachedToWindow()) {
            View rootView = a7Var.getRootView();
            ViewGroup viewGroup = this.f35181a;
            if (rootView == viewGroup.getRootView()) {
                bi biVar = this.f35183c;
                RectF rectF = this.f35191n;
                if (biVar == null) {
                    fa.f(a7Var, this.f35182b, viewGroup, rectF);
                    return;
                }
                rectF.set(fa.a(a7Var, viewGroup));
                rectF.offset(0.0f, biVar.f24675f4 - biVar.f24709p2);
            }
        }
    }
}
