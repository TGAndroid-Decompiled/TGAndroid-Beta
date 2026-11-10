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
import org.telegram.ui.Components.ci;
import org.telegram.ui.cn;
import org.telegram.ui.sb1;
public final class p6 {
    public final ViewGroup f42990a;
    public final View f42991b;
    public final ci f42992c;
    public final x6 d;
    public final cn f42993e;
    public final TL_wallet.walletTransaction f42994f;
    public final Runnable f42995g;
    public final m6 h;
    public final x6 f42996i;
    public final q9 f42997j = new q9();
    public final PathInterpolator f42998k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f42999l;
    public final AnimatorSet f43000m;
    public final RectF f43001n;
    public final RectF f43002o;
    public org.telegram.ui.Cells.t0 f43003p;
    public final n6 f43004q;
    public float f43005r;
    public boolean f43006s;
    public boolean f43007t;
    public boolean f43008u;
    public boolean v;
    public final long f43009w;
    public final l6 f43010x;

    public p6(ViewGroup viewGroup, View view, x6 x6Var, cn cnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ci ciVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43000m = animatorSet;
        this.f43002o = new RectF();
        this.f43009w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final p6 f42793b;

            {
                this.f42793b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        p6 p6Var = this.f42793b;
                        x6 x6Var2 = p6Var.d;
                        float f10 = p6Var.f42999l;
                        ViewGroup viewGroup2 = p6Var.f42990a;
                        n6 n6Var = p6Var.f43004q;
                        AnimatorSet animatorSet2 = p6Var.f43000m;
                        x6 x6Var3 = p6Var.f42996i;
                        RectF rectF = p6Var.f43002o;
                        RectF rectF2 = p6Var.f43001n;
                        if (!p6Var.v && !p6Var.f43008u) {
                            p6Var.e();
                            p6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 J8 = p6Var.f42993e.J8(p6Var.f42994f);
                            if (J8 != null && J8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = p6Var.f43003p;
                                if (t0Var != J8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    p6Var.f43003p = J8;
                                }
                                c4 c4Var = p6Var.f43003p.I0.f42324m;
                                if (p6Var.f43007t && n6Var.f57503n && c4Var != null && c4Var.f57503n && c4Var.getWidth() > 0 && !p6Var.f43003p.isLayoutRequested()) {
                                    rectF.set(p6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        p6Var.f43008u = true;
                                        p6Var.f43003p.I0.i(true);
                                        x6Var3.f(x6Var2);
                                        x6Var3.setAlpha(f10);
                                        x6Var2.setAlpha(0.0f);
                                        p6Var.f42997j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - p6Var.f43009w <= 700 && !p6Var.f43006s && viewGroup2.isAttachedToWindow()) {
                                p6Var.h.postOnAnimation(p6Var.f43010x);
                                return;
                            }
                            p6Var.f43008u = true;
                            x6Var3.setAlpha(0.0f);
                            n6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42793b.d();
                        return;
                    default:
                        this.f42793b.f43007t = true;
                        return;
                }
            }
        };
        this.f43010x = r12;
        this.f42992c = ciVar;
        this.f42990a = viewGroup;
        this.f42991b = view;
        this.d = x6Var;
        this.f42999l = x6Var.getAlpha();
        this.f42993e = cnVar;
        this.f42994f = wallettransaction;
        this.f42995g = runnable;
        RectF a10 = ca.a(x6Var, viewGroup);
        this.f43001n = a10;
        e();
        m6 m6Var = new m6(this, viewGroup.getContext());
        this.h = m6Var;
        m6Var.setClipChildren(false);
        m6Var.setClipToPadding(false);
        m6Var.setClickable(true);
        x6 x6Var2 = new x6(60, viewGroup.getContext(), true);
        this.f42996i = x6Var2;
        x6Var2.setContinuousRotation(540.0f);
        x6Var2.f(x6Var);
        x6Var2.setAlpha(0.0f);
        m6Var.addView(x6Var2, c8.ha.e(60, 60, 51));
        n6 n6Var = new n6(this, viewGroup.getContext(), new Runnable(this) {
            public final p6 f42793b;

            {
                this.f42793b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        p6 p6Var = this.f42793b;
                        x6 x6Var22 = p6Var.d;
                        float f10 = p6Var.f42999l;
                        ViewGroup viewGroup2 = p6Var.f42990a;
                        n6 n6Var2 = p6Var.f43004q;
                        AnimatorSet animatorSet2 = p6Var.f43000m;
                        x6 x6Var3 = p6Var.f42996i;
                        RectF rectF = p6Var.f43002o;
                        RectF rectF2 = p6Var.f43001n;
                        if (!p6Var.v && !p6Var.f43008u) {
                            p6Var.e();
                            p6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 J8 = p6Var.f42993e.J8(p6Var.f42994f);
                            if (J8 != null && J8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = p6Var.f43003p;
                                if (t0Var != J8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    p6Var.f43003p = J8;
                                }
                                c4 c4Var = p6Var.f43003p.I0.f42324m;
                                if (p6Var.f43007t && n6Var2.f57503n && c4Var != null && c4Var.f57503n && c4Var.getWidth() > 0 && !p6Var.f43003p.isLayoutRequested()) {
                                    rectF.set(p6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        p6Var.f43008u = true;
                                        p6Var.f43003p.I0.i(true);
                                        x6Var3.f(x6Var22);
                                        x6Var3.setAlpha(f10);
                                        x6Var22.setAlpha(0.0f);
                                        p6Var.f42997j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - p6Var.f43009w <= 700 && !p6Var.f43006s && viewGroup2.isAttachedToWindow()) {
                                p6Var.h.postOnAnimation(p6Var.f43010x);
                                return;
                            }
                            p6Var.f43008u = true;
                            x6Var3.setAlpha(0.0f);
                            n6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42793b.d();
                        return;
                    default:
                        this.f42793b.f43007t = true;
                        return;
                }
            }
        });
        this.f43004q = n6Var;
        n6Var.setAlpha(0.001f);
        n6Var.setPaused(false);
        m6Var.addView(n6Var, c8.ha.e(60, 60, 51));
        viewGroup.addView(m6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        x6Var2.l(new Runnable(this) {
            public final p6 f42793b;

            {
                this.f42793b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        p6 p6Var = this.f42793b;
                        x6 x6Var22 = p6Var.d;
                        float f10 = p6Var.f42999l;
                        ViewGroup viewGroup2 = p6Var.f42990a;
                        n6 n6Var2 = p6Var.f43004q;
                        AnimatorSet animatorSet2 = p6Var.f43000m;
                        x6 x6Var3 = p6Var.f42996i;
                        RectF rectF = p6Var.f43002o;
                        RectF rectF2 = p6Var.f43001n;
                        if (!p6Var.v && !p6Var.f43008u) {
                            p6Var.e();
                            p6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 J8 = p6Var.f42993e.J8(p6Var.f42994f);
                            if (J8 != null && J8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = p6Var.f43003p;
                                if (t0Var != J8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    p6Var.f43003p = J8;
                                }
                                c4 c4Var = p6Var.f43003p.I0.f42324m;
                                if (p6Var.f43007t && n6Var2.f57503n && c4Var != null && c4Var.f57503n && c4Var.getWidth() > 0 && !p6Var.f43003p.isLayoutRequested()) {
                                    rectF.set(p6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        p6Var.f43008u = true;
                                        p6Var.f43003p.I0.i(true);
                                        x6Var3.f(x6Var22);
                                        x6Var3.setAlpha(f10);
                                        x6Var22.setAlpha(0.0f);
                                        p6Var.f42997j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - p6Var.f43009w <= 700 && !p6Var.f43006s && viewGroup2.isAttachedToWindow()) {
                                p6Var.h.postOnAnimation(p6Var.f43010x);
                                return;
                            }
                            p6Var.f43008u = true;
                            x6Var3.setAlpha(0.0f);
                            n6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42793b.d();
                        return;
                    default:
                        this.f42793b.f43007t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new r3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new o6(this, ciVar, x6Var));
        m6Var.post(r12);
    }

    public final void a(boolean z9) {
        if (this.v) {
            return;
        }
        this.v = true;
        l6 l6Var = this.f43010x;
        m6 m6Var = this.h;
        m6Var.removeCallbacks(l6Var);
        x6 x6Var = this.f42996i;
        x6Var.l(null);
        org.telegram.ui.Cells.t0 t0Var = this.f43003p;
        if (t0Var != null) {
            t0Var.I0.i(false);
            if (z9 && this.f43005r >= 1.0f) {
                RectF rectF = this.f43002o;
                if (!rectF.isEmpty() && this.f43003p.isAttachedToWindow() && l0.I(this.f43003p.getMessageObject(), this.f42994f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f43001n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f22566p;
                    d4 d4Var = this.f43003p.I0;
                    d4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    d4Var.f42305b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.f54279m = hVar;
                    d4Var.f42305b0.f(0.001f);
                    d4Var.f42305b0.f54269a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    d4Var.f42305b0.b(new x3(d4Var, 1));
                    d4Var.f42305b0.h();
                }
            }
        }
        n6 n6Var = this.f43004q;
        n6Var.setPaused(true);
        m6Var.removeView(n6Var);
        x6Var.setPaused(true);
        m6Var.removeView(x6Var);
        m6Var.setClickable(false);
        this.d.setAlpha(this.f42999l);
        ci ciVar = this.f42992c;
        if (ciVar == null) {
            this.f42991b.setTranslationY(0.0f);
        } else {
            ciVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f42990a;
        if (ciVar != null && z9 && this.f42997j.d()) {
            cn cnVar = this.f42993e;
            if (cnVar.getParentLayout() != null) {
                ViewGroup view = cnVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(m6Var);
                    m6Var.setTranslationX(iArr[0] - iArr2[0]);
                    m6Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(m6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f42995g.run();
        org.telegram.messenger.g0.i3(new sb1(18, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        m6 m6Var = this.h;
        float f13 = L / 2.0f;
        x6 x6Var = this.f42996i;
        x6Var.setTranslationX((f10 - m6Var.getLeft()) - f13);
        x6Var.setTranslationY((f11 - m6Var.getTop()) - f13);
        float f14 = f12 / L;
        x6Var.setScaleX(f14);
        x6Var.setScaleY(f14);
        float translationX = x6Var.getTranslationX();
        n6 n6Var = this.f43004q;
        n6Var.setTranslationX(translationX);
        n6Var.setTranslationY(x6Var.getTranslationY());
        n6Var.setScaleX(f14);
        n6Var.setScaleY(f14);
    }

    public final RectF c(c4 c4Var) {
        ci ciVar = this.f42992c;
        ViewGroup viewGroup = this.f42990a;
        if (ciVar == null) {
            return ca.a(c4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) c4Var.getRootView();
        RectF a10 = ca.a(c4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        n6 n6Var = this.f43004q;
        if (n6Var == null) {
            return;
        }
        x6 x6Var = this.f42996i;
        float flightYaw = x6Var.getFlightYaw();
        float flightPitch = x6Var.getFlightPitch();
        if (this.f43003p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f43005r - 0.55f) / 0.45f));
            float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f43003p.I0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.f43003p.I0.f42320k.E * 0.14f) - flightPitch) * C;
        }
        n6Var.f57504r = flightYaw;
        n6Var.f57505s = flightPitch;
        n6Var.f57506w = true;
        n6Var.f57507x = true;
    }

    public final void e() {
        x6 x6Var = this.d;
        if (x6Var.isAttachedToWindow()) {
            View rootView = x6Var.getRootView();
            ViewGroup viewGroup = this.f42990a;
            if (rootView == viewGroup.getRootView()) {
                ci ciVar = this.f42992c;
                RectF rectF = this.f43001n;
                if (ciVar == null) {
                    ca.f(x6Var, this.f42991b, viewGroup, rectF);
                    return;
                }
                rectF.set(ca.a(x6Var, viewGroup));
                rectF.offset(0.0f, ciVar.f32616i4 - ciVar.f32648s2);
            }
        }
    }
}
