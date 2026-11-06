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
import org.telegram.ui.Components.di;
import org.telegram.ui.an;
public final class o6 {
    public final ViewGroup f42908a;
    public final View f42909b;
    public final di f42910c;
    public final w6 d;
    public final an f42911e;
    public final TL_wallet.walletTransaction f42912f;
    public final Runnable f42913g;
    public final l6 h;
    public final w6 f42914i;
    public final p9 f42915j = new p9();
    public final PathInterpolator f42916k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f42917l;
    public final AnimatorSet f42918m;
    public final RectF f42919n;
    public final RectF f42920o;
    public org.telegram.ui.Cells.t0 f42921p;
    public final m6 f42922q;
    public float f42923r;
    public boolean f42924s;
    public boolean f42925t;
    public boolean f42926u;
    public boolean v;
    public final long f42927w;
    public final k6 f42928x;

    public o6(ViewGroup viewGroup, View view, w6 w6Var, an anVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, di diVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42918m = animatorSet;
        this.f42920o = new RectF();
        this.f42927w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final o6 f42708b;

            {
                this.f42708b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o6 o6Var = this.f42708b;
                        w6 w6Var2 = o6Var.d;
                        float f10 = o6Var.f42917l;
                        ViewGroup viewGroup2 = o6Var.f42908a;
                        m6 m6Var = o6Var.f42922q;
                        AnimatorSet animatorSet2 = o6Var.f42918m;
                        w6 w6Var3 = o6Var.f42914i;
                        RectF rectF = o6Var.f42920o;
                        RectF rectF2 = o6Var.f42919n;
                        if (!o6Var.v && !o6Var.f42926u) {
                            o6Var.e();
                            o6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = o6Var.f42911e.I8(o6Var.f42912f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = o6Var.f42921p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    o6Var.f42921p = I8;
                                }
                                c4 c4Var = o6Var.f42921p.I0.f42360m;
                                if (o6Var.f42925t && m6Var.f57403n && c4Var != null && c4Var.f57403n && c4Var.getWidth() > 0 && !o6Var.f42921p.isLayoutRequested()) {
                                    rectF.set(o6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        o6Var.f42926u = true;
                                        o6Var.f42921p.I0.i(true);
                                        w6Var3.f(w6Var2);
                                        w6Var3.setAlpha(f10);
                                        w6Var2.setAlpha(0.0f);
                                        o6Var.f42915j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - o6Var.f42927w <= 700 && !o6Var.f42924s && viewGroup2.isAttachedToWindow()) {
                                o6Var.h.postOnAnimation(o6Var.f42928x);
                                return;
                            }
                            o6Var.f42926u = true;
                            w6Var3.setAlpha(0.0f);
                            m6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42708b.d();
                        return;
                    default:
                        this.f42708b.f42925t = true;
                        return;
                }
            }
        };
        this.f42928x = r12;
        this.f42910c = diVar;
        this.f42908a = viewGroup;
        this.f42909b = view;
        this.d = w6Var;
        this.f42917l = w6Var.getAlpha();
        this.f42911e = anVar;
        this.f42912f = wallettransaction;
        this.f42913g = runnable;
        RectF a10 = ba.a(w6Var, viewGroup);
        this.f42919n = a10;
        e();
        l6 l6Var = new l6(this, viewGroup.getContext());
        this.h = l6Var;
        l6Var.setClipChildren(false);
        l6Var.setClipToPadding(false);
        l6Var.setClickable(true);
        w6 w6Var2 = new w6(60, viewGroup.getContext(), true);
        this.f42914i = w6Var2;
        w6Var2.setContinuousRotation(540.0f);
        w6Var2.f(w6Var);
        w6Var2.setAlpha(0.0f);
        l6Var.addView(w6Var2, c8.ha.e(60, 60, 51));
        m6 m6Var = new m6(this, viewGroup.getContext(), new Runnable(this) {
            public final o6 f42708b;

            {
                this.f42708b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o6 o6Var = this.f42708b;
                        w6 w6Var22 = o6Var.d;
                        float f10 = o6Var.f42917l;
                        ViewGroup viewGroup2 = o6Var.f42908a;
                        m6 m6Var2 = o6Var.f42922q;
                        AnimatorSet animatorSet2 = o6Var.f42918m;
                        w6 w6Var3 = o6Var.f42914i;
                        RectF rectF = o6Var.f42920o;
                        RectF rectF2 = o6Var.f42919n;
                        if (!o6Var.v && !o6Var.f42926u) {
                            o6Var.e();
                            o6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = o6Var.f42911e.I8(o6Var.f42912f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = o6Var.f42921p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    o6Var.f42921p = I8;
                                }
                                c4 c4Var = o6Var.f42921p.I0.f42360m;
                                if (o6Var.f42925t && m6Var2.f57403n && c4Var != null && c4Var.f57403n && c4Var.getWidth() > 0 && !o6Var.f42921p.isLayoutRequested()) {
                                    rectF.set(o6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        o6Var.f42926u = true;
                                        o6Var.f42921p.I0.i(true);
                                        w6Var3.f(w6Var22);
                                        w6Var3.setAlpha(f10);
                                        w6Var22.setAlpha(0.0f);
                                        o6Var.f42915j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - o6Var.f42927w <= 700 && !o6Var.f42924s && viewGroup2.isAttachedToWindow()) {
                                o6Var.h.postOnAnimation(o6Var.f42928x);
                                return;
                            }
                            o6Var.f42926u = true;
                            w6Var3.setAlpha(0.0f);
                            m6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42708b.d();
                        return;
                    default:
                        this.f42708b.f42925t = true;
                        return;
                }
            }
        });
        this.f42922q = m6Var;
        m6Var.setAlpha(0.001f);
        m6Var.setPaused(false);
        l6Var.addView(m6Var, c8.ha.e(60, 60, 51));
        viewGroup.addView(l6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        w6Var2.l(new Runnable(this) {
            public final o6 f42708b;

            {
                this.f42708b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o6 o6Var = this.f42708b;
                        w6 w6Var22 = o6Var.d;
                        float f10 = o6Var.f42917l;
                        ViewGroup viewGroup2 = o6Var.f42908a;
                        m6 m6Var2 = o6Var.f42922q;
                        AnimatorSet animatorSet2 = o6Var.f42918m;
                        w6 w6Var3 = o6Var.f42914i;
                        RectF rectF = o6Var.f42920o;
                        RectF rectF2 = o6Var.f42919n;
                        if (!o6Var.v && !o6Var.f42926u) {
                            o6Var.e();
                            o6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = o6Var.f42911e.I8(o6Var.f42912f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = o6Var.f42921p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    o6Var.f42921p = I8;
                                }
                                c4 c4Var = o6Var.f42921p.I0.f42360m;
                                if (o6Var.f42925t && m6Var2.f57403n && c4Var != null && c4Var.f57403n && c4Var.getWidth() > 0 && !o6Var.f42921p.isLayoutRequested()) {
                                    rectF.set(o6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        o6Var.f42926u = true;
                                        o6Var.f42921p.I0.i(true);
                                        w6Var3.f(w6Var22);
                                        w6Var3.setAlpha(f10);
                                        w6Var22.setAlpha(0.0f);
                                        o6Var.f42915j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - o6Var.f42927w <= 700 && !o6Var.f42924s && viewGroup2.isAttachedToWindow()) {
                                o6Var.h.postOnAnimation(o6Var.f42928x);
                                return;
                            }
                            o6Var.f42926u = true;
                            w6Var3.setAlpha(0.0f);
                            m6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42708b.d();
                        return;
                    default:
                        this.f42708b.f42925t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new r3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new n6(this, diVar, w6Var));
        l6Var.post(r12);
    }

    public final void a(boolean z9) {
        if (this.v) {
            return;
        }
        this.v = true;
        k6 k6Var = this.f42928x;
        l6 l6Var = this.h;
        l6Var.removeCallbacks(k6Var);
        w6 w6Var = this.f42914i;
        w6Var.l(null);
        org.telegram.ui.Cells.t0 t0Var = this.f42921p;
        if (t0Var != null) {
            t0Var.I0.i(false);
            if (z9 && this.f42923r >= 1.0f) {
                RectF rectF = this.f42920o;
                if (!rectF.isEmpty() && this.f42921p.isAttachedToWindow() && n0.I(this.f42921p.getMessageObject(), this.f42912f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f42919n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f22536p;
                    d4 d4Var = this.f42921p.I0;
                    d4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    d4Var.f42341b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.f54175m = hVar;
                    d4Var.f42341b0.f(0.001f);
                    d4Var.f42341b0.f54165a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    d4Var.f42341b0.b(new x3(d4Var, 1));
                    d4Var.f42341b0.h();
                }
            }
        }
        m6 m6Var = this.f42922q;
        m6Var.setPaused(true);
        l6Var.removeView(m6Var);
        w6Var.setPaused(true);
        l6Var.removeView(w6Var);
        l6Var.setClickable(false);
        this.d.setAlpha(this.f42917l);
        di diVar = this.f42910c;
        if (diVar == null) {
            this.f42909b.setTranslationY(0.0f);
        } else {
            diVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f42908a;
        if (diVar != null && z9 && this.f42915j.d()) {
            an anVar = this.f42911e;
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
        this.f42913g.run();
        org.telegram.messenger.g0.i3(new n(17, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        l6 l6Var = this.h;
        float f13 = L / 2.0f;
        w6 w6Var = this.f42914i;
        w6Var.setTranslationX((f10 - l6Var.getLeft()) - f13);
        w6Var.setTranslationY((f11 - l6Var.getTop()) - f13);
        float f14 = f12 / L;
        w6Var.setScaleX(f14);
        w6Var.setScaleY(f14);
        float translationX = w6Var.getTranslationX();
        m6 m6Var = this.f42922q;
        m6Var.setTranslationX(translationX);
        m6Var.setTranslationY(w6Var.getTranslationY());
        m6Var.setScaleX(f14);
        m6Var.setScaleY(f14);
    }

    public final RectF c(c4 c4Var) {
        di diVar = this.f42910c;
        ViewGroup viewGroup = this.f42908a;
        if (diVar == null) {
            return ba.a(c4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) c4Var.getRootView();
        RectF a10 = ba.a(c4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        m6 m6Var = this.f42922q;
        if (m6Var == null) {
            return;
        }
        w6 w6Var = this.f42914i;
        float flightYaw = w6Var.getFlightYaw();
        float flightPitch = w6Var.getFlightPitch();
        if (this.f42921p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f42923r - 0.55f) / 0.45f));
            float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f42921p.I0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.f42921p.I0.f42356k.E * 0.14f) - flightPitch) * C;
        }
        m6Var.f57404r = flightYaw;
        m6Var.f57405s = flightPitch;
        m6Var.f57406w = true;
        m6Var.f57407x = true;
    }

    public final void e() {
        w6 w6Var = this.d;
        if (w6Var.isAttachedToWindow()) {
            View rootView = w6Var.getRootView();
            ViewGroup viewGroup = this.f42908a;
            if (rootView == viewGroup.getRootView()) {
                di diVar = this.f42910c;
                RectF rectF = this.f42919n;
                if (diVar == null) {
                    ba.f(w6Var, this.f42909b, viewGroup, rectF);
                    return;
                }
                rectF.set(ba.a(w6Var, viewGroup));
                rectF.offset(0.0f, diVar.f32911f4 - diVar.f32943p2);
            }
        }
    }
}
