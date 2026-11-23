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
    public final ViewGroup f44158a;
    public final View f44159b;
    public final ui f44160c;
    public final m7 d;
    public final bn f44161e;
    public final TL_wallet.walletTransaction f44162f;
    public final Runnable f44163g;
    public final b7 h;
    public final m7 f44164i;
    public final fa f44165j = new fa();
    public final PathInterpolator f44166k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f44167l;
    public final AnimatorSet f44168m;
    public final RectF f44169n;
    public final RectF f44170o;
    public org.telegram.ui.Cells.v0 f44171p;
    public final c7 f44172q;
    public float f44173r;
    public boolean f44174s;
    public boolean f44175t;
    public boolean f44176u;
    public boolean v;
    public final long f44177w;
    public final a7 f44178x;

    public e7(ViewGroup viewGroup, View view, m7 m7Var, bn bnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ui uiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f44168m = animatorSet;
        this.f44170o = new RectF();
        this.f44177w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final e7 f43978b;

            {
                this.f43978b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e7 e7Var = this.f43978b;
                        m7 m7Var2 = e7Var.d;
                        float f10 = e7Var.f44167l;
                        ViewGroup viewGroup2 = e7Var.f44158a;
                        c7 c7Var = e7Var.f44172q;
                        AnimatorSet animatorSet2 = e7Var.f44168m;
                        m7 m7Var3 = e7Var.f44164i;
                        RectF rectF = e7Var.f44170o;
                        RectF rectF2 = e7Var.f44169n;
                        if (!e7Var.v && !e7Var.f44176u) {
                            e7Var.e();
                            e7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = e7Var.f44161e.K8(e7Var.f44162f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e7Var.f44171p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    e7Var.f44171p = K8;
                                }
                                l4 l4Var = e7Var.f44171p.J0.f44581m;
                                if (e7Var.f44175t && c7Var.f59589n && l4Var != null && l4Var.f59589n && l4Var.getWidth() > 0 && !e7Var.f44171p.isLayoutRequested()) {
                                    rectF.set(e7Var.c(l4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        e7Var.f44176u = true;
                                        e7Var.f44171p.J0.i(true);
                                        m7Var3.f(m7Var2);
                                        m7Var3.setAlpha(f10);
                                        m7Var2.setAlpha(0.0f);
                                        e7Var.f44165j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e7Var.f44177w <= 700 && !e7Var.f44174s && viewGroup2.isAttachedToWindow()) {
                                e7Var.h.postOnAnimation(e7Var.f44178x);
                                return;
                            }
                            e7Var.f44176u = true;
                            m7Var3.setAlpha(0.0f);
                            c7Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f43978b.d();
                        return;
                    default:
                        this.f43978b.f44175t = true;
                        return;
                }
            }
        };
        this.f44178x = r12;
        this.f44160c = uiVar;
        this.f44158a = viewGroup;
        this.f44159b = view;
        this.d = m7Var;
        this.f44167l = m7Var.getAlpha();
        this.f44161e = bnVar;
        this.f44162f = wallettransaction;
        this.f44163g = runnable;
        RectF a10 = ra.a(m7Var, viewGroup);
        this.f44169n = a10;
        e();
        b7 b7Var = new b7(this, viewGroup.getContext());
        this.h = b7Var;
        b7Var.setClipChildren(false);
        b7Var.setClipToPadding(false);
        b7Var.setClickable(true);
        m7 m7Var2 = new m7(60, viewGroup.getContext(), true);
        this.f44164i = m7Var2;
        m7Var2.setContinuousRotation(540.0f);
        m7Var2.f(m7Var);
        m7Var2.setAlpha(0.0f);
        b7Var.addView(m7Var2, c8.ma.e(60, 60, 51));
        c7 c7Var = new c7(this, viewGroup.getContext(), new Runnable(this) {
            public final e7 f43978b;

            {
                this.f43978b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e7 e7Var = this.f43978b;
                        m7 m7Var22 = e7Var.d;
                        float f10 = e7Var.f44167l;
                        ViewGroup viewGroup2 = e7Var.f44158a;
                        c7 c7Var2 = e7Var.f44172q;
                        AnimatorSet animatorSet2 = e7Var.f44168m;
                        m7 m7Var3 = e7Var.f44164i;
                        RectF rectF = e7Var.f44170o;
                        RectF rectF2 = e7Var.f44169n;
                        if (!e7Var.v && !e7Var.f44176u) {
                            e7Var.e();
                            e7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = e7Var.f44161e.K8(e7Var.f44162f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e7Var.f44171p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    e7Var.f44171p = K8;
                                }
                                l4 l4Var = e7Var.f44171p.J0.f44581m;
                                if (e7Var.f44175t && c7Var2.f59589n && l4Var != null && l4Var.f59589n && l4Var.getWidth() > 0 && !e7Var.f44171p.isLayoutRequested()) {
                                    rectF.set(e7Var.c(l4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        e7Var.f44176u = true;
                                        e7Var.f44171p.J0.i(true);
                                        m7Var3.f(m7Var22);
                                        m7Var3.setAlpha(f10);
                                        m7Var22.setAlpha(0.0f);
                                        e7Var.f44165j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e7Var.f44177w <= 700 && !e7Var.f44174s && viewGroup2.isAttachedToWindow()) {
                                e7Var.h.postOnAnimation(e7Var.f44178x);
                                return;
                            }
                            e7Var.f44176u = true;
                            m7Var3.setAlpha(0.0f);
                            c7Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f43978b.d();
                        return;
                    default:
                        this.f43978b.f44175t = true;
                        return;
                }
            }
        });
        this.f44172q = c7Var;
        c7Var.setAlpha(0.001f);
        c7Var.setPaused(false);
        b7Var.addView(c7Var, c8.ma.e(60, 60, 51));
        viewGroup.addView(b7Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        m7Var2.l(new Runnable(this) {
            public final e7 f43978b;

            {
                this.f43978b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e7 e7Var = this.f43978b;
                        m7 m7Var22 = e7Var.d;
                        float f10 = e7Var.f44167l;
                        ViewGroup viewGroup2 = e7Var.f44158a;
                        c7 c7Var2 = e7Var.f44172q;
                        AnimatorSet animatorSet2 = e7Var.f44168m;
                        m7 m7Var3 = e7Var.f44164i;
                        RectF rectF = e7Var.f44170o;
                        RectF rectF2 = e7Var.f44169n;
                        if (!e7Var.v && !e7Var.f44176u) {
                            e7Var.e();
                            e7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = e7Var.f44161e.K8(e7Var.f44162f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e7Var.f44171p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    e7Var.f44171p = K8;
                                }
                                l4 l4Var = e7Var.f44171p.J0.f44581m;
                                if (e7Var.f44175t && c7Var2.f59589n && l4Var != null && l4Var.f59589n && l4Var.getWidth() > 0 && !e7Var.f44171p.isLayoutRequested()) {
                                    rectF.set(e7Var.c(l4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        e7Var.f44176u = true;
                                        e7Var.f44171p.J0.i(true);
                                        m7Var3.f(m7Var22);
                                        m7Var3.setAlpha(f10);
                                        m7Var22.setAlpha(0.0f);
                                        e7Var.f44165j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e7Var.f44177w <= 700 && !e7Var.f44174s && viewGroup2.isAttachedToWindow()) {
                                e7Var.h.postOnAnimation(e7Var.f44178x);
                                return;
                            }
                            e7Var.f44176u = true;
                            m7Var3.setAlpha(0.0f);
                            c7Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f43978b.d();
                        return;
                    default:
                        this.f43978b.f44175t = true;
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
        a7 a7Var = this.f44178x;
        b7 b7Var = this.h;
        b7Var.removeCallbacks(a7Var);
        m7 m7Var = this.f44164i;
        m7Var.l(null);
        org.telegram.ui.Cells.v0 v0Var = this.f44171p;
        if (v0Var != null) {
            v0Var.J0.i(false);
            if (z10 && this.f44173r >= 1.0f) {
                RectF rectF = this.f44170o;
                if (!rectF.isEmpty() && this.f44171p.isAttachedToWindow() && u0.Q(this.f44171p.getMessageObject(), this.f44162f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f44169n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f24045p;
                    m4 m4Var = this.f44171p.J0;
                    m4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    m4Var.f44562b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.f56368m = hVar;
                    m4Var.f44562b0.f(0.001f);
                    m4Var.f44562b0.f56358a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    m4Var.f44562b0.b(new g4(m4Var, 1));
                    m4Var.f44562b0.h();
                }
            }
        }
        c7 c7Var = this.f44172q;
        c7Var.setPaused(true);
        b7Var.removeView(c7Var);
        m7Var.setPaused(true);
        b7Var.removeView(m7Var);
        b7Var.setClickable(false);
        this.d.setAlpha(this.f44167l);
        ui uiVar = this.f44160c;
        if (uiVar == null) {
            this.f44159b.setTranslationY(0.0f);
        } else {
            uiVar.y1(1.0f);
        }
        ViewGroup viewGroup = this.f44158a;
        if (uiVar != null && z10 && this.f44165j.d()) {
            bn bnVar = this.f44161e;
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
        this.f44163g.run();
        org.telegram.messenger.g0.h3(new u4(7, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        b7 b7Var = this.h;
        float f13 = L / 2.0f;
        m7 m7Var = this.f44164i;
        m7Var.setTranslationX((f10 - b7Var.getLeft()) - f13);
        m7Var.setTranslationY((f11 - b7Var.getTop()) - f13);
        float f14 = f12 / L;
        m7Var.setScaleX(f14);
        m7Var.setScaleY(f14);
        float translationX = m7Var.getTranslationX();
        c7 c7Var = this.f44172q;
        c7Var.setTranslationX(translationX);
        c7Var.setTranslationY(m7Var.getTranslationY());
        c7Var.setScaleX(f14);
        c7Var.setScaleY(f14);
    }

    public final RectF c(l4 l4Var) {
        ui uiVar = this.f44160c;
        ViewGroup viewGroup = this.f44158a;
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
        c7 c7Var = this.f44172q;
        if (c7Var == null) {
            return;
        }
        m7 m7Var = this.f44164i;
        float flightYaw = m7Var.getFlightYaw();
        float flightPitch = m7Var.getFlightPitch();
        if (this.f44171p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f44173r - 0.55f) / 0.45f));
            float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f44171p.J0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.f44171p.J0.f44577k.F * 0.14f) - flightPitch) * C;
        }
        c7Var.f59590r = flightYaw;
        c7Var.f59591s = flightPitch;
        c7Var.f59592w = true;
        c7Var.f59593x = true;
    }

    public final void e() {
        m7 m7Var = this.d;
        if (m7Var.isAttachedToWindow()) {
            View rootView = m7Var.getRootView();
            ViewGroup viewGroup = this.f44158a;
            if (rootView == viewGroup.getRootView()) {
                ui uiVar = this.f44160c;
                RectF rectF = this.f44169n;
                if (uiVar == null) {
                    ra.f(m7Var, this.f44159b, viewGroup, rectF);
                    return;
                }
                rectF.set(ra.a(m7Var, viewGroup));
                rectF.offset(0.0f, uiVar.f40395j4 - uiVar.f40429t2);
            }
        }
    }
}
