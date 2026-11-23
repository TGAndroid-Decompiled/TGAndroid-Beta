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
import org.telegram.ui.Components.ui;
import org.telegram.ui.bn;
public final class e7 {
    public final ViewGroup f44124a;
    public final View f44125b;
    public final ui f44126c;
    public final m7 d;
    public final bn f44127e;
    public final TL_wallet.walletTransaction f44128f;
    public final Runnable f44129g;
    public final b7 h;
    public final m7 f44130i;
    public final fa f44131j = new fa();
    public final PathInterpolator f44132k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f44133l;
    public final AnimatorSet f44134m;
    public final RectF f44135n;
    public final RectF f44136o;
    public org.telegram.ui.Cells.v0 f44137p;
    public final c7 f44138q;
    public float f44139r;
    public boolean f44140s;
    public boolean f44141t;
    public boolean f44142u;
    public boolean v;
    public final long f44143w;
    public final a7 f44144x;

    public e7(ViewGroup viewGroup, View view, m7 m7Var, bn bnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ui uiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f44134m = animatorSet;
        this.f44136o = new RectF();
        this.f44143w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final e7 f43943b;

            {
                this.f43943b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e7 e7Var = this.f43943b;
                        m7 m7Var2 = e7Var.d;
                        float f10 = e7Var.f44133l;
                        ViewGroup viewGroup2 = e7Var.f44124a;
                        c7 c7Var = e7Var.f44138q;
                        AnimatorSet animatorSet2 = e7Var.f44134m;
                        m7 m7Var3 = e7Var.f44130i;
                        RectF rectF = e7Var.f44136o;
                        RectF rectF2 = e7Var.f44135n;
                        if (!e7Var.v && !e7Var.f44142u) {
                            e7Var.e();
                            e7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = e7Var.f44127e.K8(e7Var.f44128f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e7Var.f44137p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    e7Var.f44137p = K8;
                                }
                                l4 l4Var = e7Var.f44137p.J0.f44547m;
                                if (e7Var.f44141t && c7Var.f59554n && l4Var != null && l4Var.f59554n && l4Var.getWidth() > 0 && !e7Var.f44137p.isLayoutRequested()) {
                                    rectF.set(e7Var.c(l4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        e7Var.f44142u = true;
                                        e7Var.f44137p.J0.i(true);
                                        m7Var3.f(m7Var2);
                                        m7Var3.setAlpha(f10);
                                        m7Var2.setAlpha(0.0f);
                                        e7Var.f44131j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e7Var.f44143w <= 700 && !e7Var.f44140s && viewGroup2.isAttachedToWindow()) {
                                e7Var.h.postOnAnimation(e7Var.f44144x);
                                return;
                            }
                            e7Var.f44142u = true;
                            m7Var3.setAlpha(0.0f);
                            c7Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f43943b.d();
                        return;
                    default:
                        this.f43943b.f44141t = true;
                        return;
                }
            }
        };
        this.f44144x = r12;
        this.f44126c = uiVar;
        this.f44124a = viewGroup;
        this.f44125b = view;
        this.d = m7Var;
        this.f44133l = m7Var.getAlpha();
        this.f44127e = bnVar;
        this.f44128f = wallettransaction;
        this.f44129g = runnable;
        RectF a10 = ra.a(m7Var, viewGroup);
        this.f44135n = a10;
        e();
        b7 b7Var = new b7(this, viewGroup.getContext());
        this.h = b7Var;
        b7Var.setClipChildren(false);
        b7Var.setClipToPadding(false);
        b7Var.setClickable(true);
        m7 m7Var2 = new m7(60, viewGroup.getContext(), true);
        this.f44130i = m7Var2;
        m7Var2.setContinuousRotation(540.0f);
        m7Var2.f(m7Var);
        m7Var2.setAlpha(0.0f);
        b7Var.addView(m7Var2, c8.na.e(60, 60, 51));
        c7 c7Var = new c7(this, viewGroup.getContext(), new Runnable(this) {
            public final e7 f43943b;

            {
                this.f43943b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e7 e7Var = this.f43943b;
                        m7 m7Var22 = e7Var.d;
                        float f10 = e7Var.f44133l;
                        ViewGroup viewGroup2 = e7Var.f44124a;
                        c7 c7Var2 = e7Var.f44138q;
                        AnimatorSet animatorSet2 = e7Var.f44134m;
                        m7 m7Var3 = e7Var.f44130i;
                        RectF rectF = e7Var.f44136o;
                        RectF rectF2 = e7Var.f44135n;
                        if (!e7Var.v && !e7Var.f44142u) {
                            e7Var.e();
                            e7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = e7Var.f44127e.K8(e7Var.f44128f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e7Var.f44137p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    e7Var.f44137p = K8;
                                }
                                l4 l4Var = e7Var.f44137p.J0.f44547m;
                                if (e7Var.f44141t && c7Var2.f59554n && l4Var != null && l4Var.f59554n && l4Var.getWidth() > 0 && !e7Var.f44137p.isLayoutRequested()) {
                                    rectF.set(e7Var.c(l4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        e7Var.f44142u = true;
                                        e7Var.f44137p.J0.i(true);
                                        m7Var3.f(m7Var22);
                                        m7Var3.setAlpha(f10);
                                        m7Var22.setAlpha(0.0f);
                                        e7Var.f44131j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e7Var.f44143w <= 700 && !e7Var.f44140s && viewGroup2.isAttachedToWindow()) {
                                e7Var.h.postOnAnimation(e7Var.f44144x);
                                return;
                            }
                            e7Var.f44142u = true;
                            m7Var3.setAlpha(0.0f);
                            c7Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f43943b.d();
                        return;
                    default:
                        this.f43943b.f44141t = true;
                        return;
                }
            }
        });
        this.f44138q = c7Var;
        c7Var.setAlpha(0.001f);
        c7Var.setPaused(false);
        b7Var.addView(c7Var, c8.na.e(60, 60, 51));
        viewGroup.addView(b7Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        m7Var2.l(new Runnable(this) {
            public final e7 f43943b;

            {
                this.f43943b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e7 e7Var = this.f43943b;
                        m7 m7Var22 = e7Var.d;
                        float f10 = e7Var.f44133l;
                        ViewGroup viewGroup2 = e7Var.f44124a;
                        c7 c7Var2 = e7Var.f44138q;
                        AnimatorSet animatorSet2 = e7Var.f44134m;
                        m7 m7Var3 = e7Var.f44130i;
                        RectF rectF = e7Var.f44136o;
                        RectF rectF2 = e7Var.f44135n;
                        if (!e7Var.v && !e7Var.f44142u) {
                            e7Var.e();
                            e7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = e7Var.f44127e.K8(e7Var.f44128f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e7Var.f44137p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    e7Var.f44137p = K8;
                                }
                                l4 l4Var = e7Var.f44137p.J0.f44547m;
                                if (e7Var.f44141t && c7Var2.f59554n && l4Var != null && l4Var.f59554n && l4Var.getWidth() > 0 && !e7Var.f44137p.isLayoutRequested()) {
                                    rectF.set(e7Var.c(l4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        e7Var.f44142u = true;
                                        e7Var.f44137p.J0.i(true);
                                        m7Var3.f(m7Var22);
                                        m7Var3.setAlpha(f10);
                                        m7Var22.setAlpha(0.0f);
                                        e7Var.f44131j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e7Var.f44143w <= 700 && !e7Var.f44140s && viewGroup2.isAttachedToWindow()) {
                                e7Var.h.postOnAnimation(e7Var.f44144x);
                                return;
                            }
                            e7Var.f44142u = true;
                            m7Var3.setAlpha(0.0f);
                            c7Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f43943b.d();
                        return;
                    default:
                        this.f43943b.f44141t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new z3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new d7(this, uiVar, m7Var));
        b7Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        a7 a7Var = this.f44144x;
        b7 b7Var = this.h;
        b7Var.removeCallbacks(a7Var);
        m7 m7Var = this.f44130i;
        m7Var.l(null);
        org.telegram.ui.Cells.v0 v0Var = this.f44137p;
        if (v0Var != null) {
            v0Var.J0.i(false);
            if (z10 && this.f44139r >= 1.0f) {
                RectF rectF = this.f44136o;
                if (!rectF.isEmpty() && this.f44137p.isAttachedToWindow() && u0.Q(this.f44137p.getMessageObject(), this.f44128f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f44135n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f24009p;
                    m4 m4Var = this.f44137p.J0;
                    m4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    m4Var.f44528b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.f56333m = hVar;
                    m4Var.f44528b0.f(0.001f);
                    m4Var.f44528b0.f56323a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    m4Var.f44528b0.b(new g4(m4Var, 1));
                    m4Var.f44528b0.h();
                }
            }
        }
        c7 c7Var = this.f44138q;
        c7Var.setPaused(true);
        b7Var.removeView(c7Var);
        m7Var.setPaused(true);
        b7Var.removeView(m7Var);
        b7Var.setClickable(false);
        this.d.setAlpha(this.f44133l);
        ui uiVar = this.f44126c;
        if (uiVar == null) {
            this.f44125b.setTranslationY(0.0f);
        } else {
            uiVar.y1(1.0f);
        }
        ViewGroup viewGroup = this.f44124a;
        if (uiVar != null && z10 && this.f44131j.d()) {
            bn bnVar = this.f44127e;
            if (bnVar.getParentLayout() != null) {
                ViewGroup view = bnVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(b7Var);
                    b7Var.setTranslationX(iArr[0] - iArr2[0]);
                    b7Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(b7Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f44129g.run();
        org.telegram.messenger.g0.h3(new c5(5, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        b7 b7Var = this.h;
        float f13 = L / 2.0f;
        m7 m7Var = this.f44130i;
        m7Var.setTranslationX((f10 - b7Var.getLeft()) - f13);
        m7Var.setTranslationY((f11 - b7Var.getTop()) - f13);
        float f14 = f12 / L;
        m7Var.setScaleX(f14);
        m7Var.setScaleY(f14);
        float translationX = m7Var.getTranslationX();
        c7 c7Var = this.f44138q;
        c7Var.setTranslationX(translationX);
        c7Var.setTranslationY(m7Var.getTranslationY());
        c7Var.setScaleX(f14);
        c7Var.setScaleY(f14);
    }

    public final RectF c(l4 l4Var) {
        ui uiVar = this.f44126c;
        ViewGroup viewGroup = this.f44124a;
        if (uiVar == null) {
            return ra.a(l4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) l4Var.getRootView();
        RectF a10 = ra.a(l4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        c7 c7Var = this.f44138q;
        if (c7Var == null) {
            return;
        }
        m7 m7Var = this.f44130i;
        float flightYaw = m7Var.getFlightYaw();
        float flightPitch = m7Var.getFlightPitch();
        if (this.f44137p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f44139r - 0.55f) / 0.45f));
            float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f44137p.J0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.f44137p.J0.f44543k.F * 0.14f) - flightPitch) * C;
        }
        c7Var.f59555r = flightYaw;
        c7Var.f59556s = flightPitch;
        c7Var.f59557w = true;
        c7Var.f59558x = true;
    }

    public final void e() {
        m7 m7Var = this.d;
        if (m7Var.isAttachedToWindow()) {
            View rootView = m7Var.getRootView();
            ViewGroup viewGroup = this.f44124a;
            if (rootView == viewGroup.getRootView()) {
                ui uiVar = this.f44126c;
                RectF rectF = this.f44135n;
                if (uiVar == null) {
                    ra.f(m7Var, this.f44125b, viewGroup, rectF);
                    return;
                }
                rectF.set(ra.a(m7Var, viewGroup));
                rectF.offset(0.0f, uiVar.f40379j4 - uiVar.f40413t2);
            }
        }
    }
}
