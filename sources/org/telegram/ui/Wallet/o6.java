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
import org.telegram.ui.Components.ki;
import org.telegram.ui.an;
public final class o6 {
    public final ViewGroup f44248a;
    public final View f44249b;
    public final ki f44250c;
    public final w6 d;
    public final an f44251e;
    public final TL_wallet.walletTransaction f44252f;
    public final Runnable f44253g;
    public final l6 h;
    public final w6 f44254i;
    public final r9 f44255j = new r9();
    public final PathInterpolator f44256k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f44257l;
    public final AnimatorSet f44258m;
    public final RectF f44259n;
    public final RectF f44260o;
    public org.telegram.ui.Cells.t0 f44261p;
    public final m6 f44262q;
    public float f44263r;
    public boolean f44264s;
    public boolean f44265t;
    public boolean f44266u;
    public boolean v;
    public final long f44267w;
    public final k6 f44268x;

    public o6(ViewGroup viewGroup, View view, w6 w6Var, an anVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ki kiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f44258m = animatorSet;
        this.f44260o = new RectF();
        this.f44267w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final o6 f44069b;

            {
                this.f44069b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o6 o6Var = this.f44069b;
                        w6 w6Var2 = o6Var.d;
                        float f10 = o6Var.f44257l;
                        ViewGroup viewGroup2 = o6Var.f44248a;
                        m6 m6Var = o6Var.f44262q;
                        AnimatorSet animatorSet2 = o6Var.f44258m;
                        w6 w6Var3 = o6Var.f44254i;
                        RectF rectF = o6Var.f44260o;
                        RectF rectF2 = o6Var.f44259n;
                        if (!o6Var.v && !o6Var.f44266u) {
                            o6Var.e();
                            o6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 K8 = o6Var.f44251e.K8(o6Var.f44252f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = o6Var.f44261p;
                                if (t0Var != K8) {
                                    if (t0Var != null) {
                                        t0Var.J0.i(false);
                                    }
                                    o6Var.f44261p = K8;
                                }
                                b4 b4Var = o6Var.f44261p.J0.f43593m;
                                if (o6Var.f44265t && m6Var.f58979n && b4Var != null && b4Var.f58979n && b4Var.getWidth() > 0 && !o6Var.f44261p.isLayoutRequested()) {
                                    rectF.set(o6Var.c(b4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        o6Var.f44266u = true;
                                        o6Var.f44261p.J0.i(true);
                                        w6Var3.f(w6Var2);
                                        w6Var3.setAlpha(f10);
                                        w6Var2.setAlpha(0.0f);
                                        o6Var.f44255j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - o6Var.f44267w <= 700 && !o6Var.f44264s && viewGroup2.isAttachedToWindow()) {
                                o6Var.h.postOnAnimation(o6Var.f44268x);
                                return;
                            }
                            o6Var.f44266u = true;
                            w6Var3.setAlpha(0.0f);
                            m6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f44069b.d();
                        return;
                    default:
                        this.f44069b.f44265t = true;
                        return;
                }
            }
        };
        this.f44268x = r12;
        this.f44250c = kiVar;
        this.f44248a = viewGroup;
        this.f44249b = view;
        this.d = w6Var;
        this.f44257l = w6Var.getAlpha();
        this.f44251e = anVar;
        this.f44252f = wallettransaction;
        this.f44253g = runnable;
        RectF a10 = da.a(w6Var, viewGroup);
        this.f44259n = a10;
        e();
        l6 l6Var = new l6(this, viewGroup.getContext());
        this.h = l6Var;
        l6Var.setClipChildren(false);
        l6Var.setClipToPadding(false);
        l6Var.setClickable(true);
        w6 w6Var2 = new w6(60, viewGroup.getContext(), true);
        this.f44254i = w6Var2;
        w6Var2.setContinuousRotation(540.0f);
        w6Var2.f(w6Var);
        w6Var2.setAlpha(0.0f);
        l6Var.addView(w6Var2, c8.ja.e(60, 60, 51));
        m6 m6Var = new m6(this, viewGroup.getContext(), new Runnable(this) {
            public final o6 f44069b;

            {
                this.f44069b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o6 o6Var = this.f44069b;
                        w6 w6Var22 = o6Var.d;
                        float f10 = o6Var.f44257l;
                        ViewGroup viewGroup2 = o6Var.f44248a;
                        m6 m6Var2 = o6Var.f44262q;
                        AnimatorSet animatorSet2 = o6Var.f44258m;
                        w6 w6Var3 = o6Var.f44254i;
                        RectF rectF = o6Var.f44260o;
                        RectF rectF2 = o6Var.f44259n;
                        if (!o6Var.v && !o6Var.f44266u) {
                            o6Var.e();
                            o6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 K8 = o6Var.f44251e.K8(o6Var.f44252f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = o6Var.f44261p;
                                if (t0Var != K8) {
                                    if (t0Var != null) {
                                        t0Var.J0.i(false);
                                    }
                                    o6Var.f44261p = K8;
                                }
                                b4 b4Var = o6Var.f44261p.J0.f43593m;
                                if (o6Var.f44265t && m6Var2.f58979n && b4Var != null && b4Var.f58979n && b4Var.getWidth() > 0 && !o6Var.f44261p.isLayoutRequested()) {
                                    rectF.set(o6Var.c(b4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        o6Var.f44266u = true;
                                        o6Var.f44261p.J0.i(true);
                                        w6Var3.f(w6Var22);
                                        w6Var3.setAlpha(f10);
                                        w6Var22.setAlpha(0.0f);
                                        o6Var.f44255j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - o6Var.f44267w <= 700 && !o6Var.f44264s && viewGroup2.isAttachedToWindow()) {
                                o6Var.h.postOnAnimation(o6Var.f44268x);
                                return;
                            }
                            o6Var.f44266u = true;
                            w6Var3.setAlpha(0.0f);
                            m6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f44069b.d();
                        return;
                    default:
                        this.f44069b.f44265t = true;
                        return;
                }
            }
        });
        this.f44262q = m6Var;
        m6Var.setAlpha(0.001f);
        m6Var.setPaused(false);
        l6Var.addView(m6Var, c8.ja.e(60, 60, 51));
        viewGroup.addView(l6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        w6Var2.l(new Runnable(this) {
            public final o6 f44069b;

            {
                this.f44069b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o6 o6Var = this.f44069b;
                        w6 w6Var22 = o6Var.d;
                        float f10 = o6Var.f44257l;
                        ViewGroup viewGroup2 = o6Var.f44248a;
                        m6 m6Var2 = o6Var.f44262q;
                        AnimatorSet animatorSet2 = o6Var.f44258m;
                        w6 w6Var3 = o6Var.f44254i;
                        RectF rectF = o6Var.f44260o;
                        RectF rectF2 = o6Var.f44259n;
                        if (!o6Var.v && !o6Var.f44266u) {
                            o6Var.e();
                            o6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 K8 = o6Var.f44251e.K8(o6Var.f44252f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = o6Var.f44261p;
                                if (t0Var != K8) {
                                    if (t0Var != null) {
                                        t0Var.J0.i(false);
                                    }
                                    o6Var.f44261p = K8;
                                }
                                b4 b4Var = o6Var.f44261p.J0.f43593m;
                                if (o6Var.f44265t && m6Var2.f58979n && b4Var != null && b4Var.f58979n && b4Var.getWidth() > 0 && !o6Var.f44261p.isLayoutRequested()) {
                                    rectF.set(o6Var.c(b4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        o6Var.f44266u = true;
                                        o6Var.f44261p.J0.i(true);
                                        w6Var3.f(w6Var22);
                                        w6Var3.setAlpha(f10);
                                        w6Var22.setAlpha(0.0f);
                                        o6Var.f44255j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - o6Var.f44267w <= 700 && !o6Var.f44264s && viewGroup2.isAttachedToWindow()) {
                                o6Var.h.postOnAnimation(o6Var.f44268x);
                                return;
                            }
                            o6Var.f44266u = true;
                            w6Var3.setAlpha(0.0f);
                            m6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f44069b.d();
                        return;
                    default:
                        this.f44069b.f44265t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new q3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new n6(this, kiVar, w6Var));
        l6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        k6 k6Var = this.f44268x;
        l6 l6Var = this.h;
        l6Var.removeCallbacks(k6Var);
        w6 w6Var = this.f44254i;
        w6Var.l(null);
        org.telegram.ui.Cells.t0 t0Var = this.f44261p;
        if (t0Var != null) {
            t0Var.J0.i(false);
            if (z10 && this.f44263r >= 1.0f) {
                RectF rectF = this.f44260o;
                if (!rectF.isEmpty() && this.f44261p.isAttachedToWindow() && l0.I(this.f44261p.getMessageObject(), this.f44252f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f44259n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f23608p;
                    c4 c4Var = this.f44261p.J0;
                    c4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    c4Var.f43574b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.f55748m = hVar;
                    c4Var.f43574b0.f(0.001f);
                    c4Var.f43574b0.f55738a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    c4Var.f43574b0.b(new w3(c4Var, 1));
                    c4Var.f43574b0.h();
                }
            }
        }
        m6 m6Var = this.f44262q;
        m6Var.setPaused(true);
        l6Var.removeView(m6Var);
        w6Var.setPaused(true);
        l6Var.removeView(w6Var);
        l6Var.setClickable(false);
        this.d.setAlpha(this.f44257l);
        ki kiVar = this.f44250c;
        if (kiVar == null) {
            this.f44249b.setTranslationY(0.0f);
        } else {
            kiVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f44248a;
        if (kiVar != null && z10 && this.f44255j.d()) {
            an anVar = this.f44251e;
            if (anVar.getParentLayout() != null) {
                ViewGroup view = anVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(l6Var);
                    l6Var.setTranslationX(iArr[0] - iArr2[0]);
                    l6Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(l6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f44253g.run();
        org.telegram.messenger.g0.i3(new r(13, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        l6 l6Var = this.h;
        float f13 = L / 2.0f;
        w6 w6Var = this.f44254i;
        w6Var.setTranslationX((f10 - l6Var.getLeft()) - f13);
        w6Var.setTranslationY((f11 - l6Var.getTop()) - f13);
        float f14 = f12 / L;
        w6Var.setScaleX(f14);
        w6Var.setScaleY(f14);
        float translationX = w6Var.getTranslationX();
        m6 m6Var = this.f44262q;
        m6Var.setTranslationX(translationX);
        m6Var.setTranslationY(w6Var.getTranslationY());
        m6Var.setScaleX(f14);
        m6Var.setScaleY(f14);
    }

    public final RectF c(b4 b4Var) {
        ki kiVar = this.f44250c;
        ViewGroup viewGroup = this.f44248a;
        if (kiVar == null) {
            return da.a(b4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) b4Var.getRootView();
        RectF a10 = da.a(b4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        m6 m6Var = this.f44262q;
        if (m6Var == null) {
            return;
        }
        w6 w6Var = this.f44254i;
        float flightYaw = w6Var.getFlightYaw();
        float flightPitch = w6Var.getFlightPitch();
        if (this.f44261p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f44263r - 0.55f) / 0.45f));
            float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f44261p.J0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.f44261p.J0.f43589k.F * 0.14f) - flightPitch) * C;
        }
        m6Var.f58980r = flightYaw;
        m6Var.f58981s = flightPitch;
        m6Var.f58982w = true;
        m6Var.f58983x = true;
    }

    public final void e() {
        w6 w6Var = this.d;
        if (w6Var.isAttachedToWindow()) {
            View rootView = w6Var.getRootView();
            ViewGroup viewGroup = this.f44248a;
            if (rootView == viewGroup.getRootView()) {
                ki kiVar = this.f44250c;
                RectF rectF = this.f44259n;
                if (kiVar == null) {
                    da.f(w6Var, this.f44249b, viewGroup, rectF);
                    return;
                }
                rectF.set(da.a(w6Var, viewGroup));
                rectF.offset(0.0f, kiVar.f36463j4 - kiVar.f36497t2);
            }
        }
    }
}
