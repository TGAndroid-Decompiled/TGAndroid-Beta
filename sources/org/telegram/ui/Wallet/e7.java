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
    public final ViewGroup f44154a;
    public final View f44155b;
    public final ui f44156c;
    public final m7 d;
    public final bn f44157e;
    public final TL_wallet.walletTransaction f44158f;
    public final Runnable f44159g;
    public final b7 h;
    public final m7 f44160i;
    public final fa f44161j = new fa();
    public final PathInterpolator f44162k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f44163l;
    public final AnimatorSet f44164m;
    public final RectF f44165n;
    public final RectF f44166o;
    public org.telegram.ui.Cells.v0 f44167p;
    public final c7 f44168q;
    public float f44169r;
    public boolean f44170s;
    public boolean f44171t;
    public boolean f44172u;
    public boolean v;
    public final long f44173w;
    public final a7 f44174x;

    public e7(ViewGroup viewGroup, View view, m7 m7Var, bn bnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ui uiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f44164m = animatorSet;
        this.f44166o = new RectF();
        this.f44173w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final e7 f43974b;

            {
                this.f43974b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e7 e7Var = this.f43974b;
                        m7 m7Var2 = e7Var.d;
                        float f10 = e7Var.f44163l;
                        ViewGroup viewGroup2 = e7Var.f44154a;
                        c7 c7Var = e7Var.f44168q;
                        AnimatorSet animatorSet2 = e7Var.f44164m;
                        m7 m7Var3 = e7Var.f44160i;
                        RectF rectF = e7Var.f44166o;
                        RectF rectF2 = e7Var.f44165n;
                        if (!e7Var.v && !e7Var.f44172u) {
                            e7Var.e();
                            e7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = e7Var.f44157e.K8(e7Var.f44158f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e7Var.f44167p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    e7Var.f44167p = K8;
                                }
                                l4 l4Var = e7Var.f44167p.J0.f44577m;
                                if (e7Var.f44171t && c7Var.f59585n && l4Var != null && l4Var.f59585n && l4Var.getWidth() > 0 && !e7Var.f44167p.isLayoutRequested()) {
                                    rectF.set(e7Var.c(l4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        e7Var.f44172u = true;
                                        e7Var.f44167p.J0.i(true);
                                        m7Var3.f(m7Var2);
                                        m7Var3.setAlpha(f10);
                                        m7Var2.setAlpha(0.0f);
                                        e7Var.f44161j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e7Var.f44173w <= 700 && !e7Var.f44170s && viewGroup2.isAttachedToWindow()) {
                                e7Var.h.postOnAnimation(e7Var.f44174x);
                                return;
                            }
                            e7Var.f44172u = true;
                            m7Var3.setAlpha(0.0f);
                            c7Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f43974b.d();
                        return;
                    default:
                        this.f43974b.f44171t = true;
                        return;
                }
            }
        };
        this.f44174x = r12;
        this.f44156c = uiVar;
        this.f44154a = viewGroup;
        this.f44155b = view;
        this.d = m7Var;
        this.f44163l = m7Var.getAlpha();
        this.f44157e = bnVar;
        this.f44158f = wallettransaction;
        this.f44159g = runnable;
        RectF a10 = ra.a(m7Var, viewGroup);
        this.f44165n = a10;
        e();
        b7 b7Var = new b7(this, viewGroup.getContext());
        this.h = b7Var;
        b7Var.setClipChildren(false);
        b7Var.setClipToPadding(false);
        b7Var.setClickable(true);
        m7 m7Var2 = new m7(60, viewGroup.getContext(), true);
        this.f44160i = m7Var2;
        m7Var2.setContinuousRotation(540.0f);
        m7Var2.f(m7Var);
        m7Var2.setAlpha(0.0f);
        b7Var.addView(m7Var2, c8.ma.e(60, 60, 51));
        c7 c7Var = new c7(this, viewGroup.getContext(), new Runnable(this) {
            public final e7 f43974b;

            {
                this.f43974b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e7 e7Var = this.f43974b;
                        m7 m7Var22 = e7Var.d;
                        float f10 = e7Var.f44163l;
                        ViewGroup viewGroup2 = e7Var.f44154a;
                        c7 c7Var2 = e7Var.f44168q;
                        AnimatorSet animatorSet2 = e7Var.f44164m;
                        m7 m7Var3 = e7Var.f44160i;
                        RectF rectF = e7Var.f44166o;
                        RectF rectF2 = e7Var.f44165n;
                        if (!e7Var.v && !e7Var.f44172u) {
                            e7Var.e();
                            e7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = e7Var.f44157e.K8(e7Var.f44158f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e7Var.f44167p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    e7Var.f44167p = K8;
                                }
                                l4 l4Var = e7Var.f44167p.J0.f44577m;
                                if (e7Var.f44171t && c7Var2.f59585n && l4Var != null && l4Var.f59585n && l4Var.getWidth() > 0 && !e7Var.f44167p.isLayoutRequested()) {
                                    rectF.set(e7Var.c(l4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        e7Var.f44172u = true;
                                        e7Var.f44167p.J0.i(true);
                                        m7Var3.f(m7Var22);
                                        m7Var3.setAlpha(f10);
                                        m7Var22.setAlpha(0.0f);
                                        e7Var.f44161j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e7Var.f44173w <= 700 && !e7Var.f44170s && viewGroup2.isAttachedToWindow()) {
                                e7Var.h.postOnAnimation(e7Var.f44174x);
                                return;
                            }
                            e7Var.f44172u = true;
                            m7Var3.setAlpha(0.0f);
                            c7Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f43974b.d();
                        return;
                    default:
                        this.f43974b.f44171t = true;
                        return;
                }
            }
        });
        this.f44168q = c7Var;
        c7Var.setAlpha(0.001f);
        c7Var.setPaused(false);
        b7Var.addView(c7Var, c8.ma.e(60, 60, 51));
        viewGroup.addView(b7Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        m7Var2.l(new Runnable(this) {
            public final e7 f43974b;

            {
                this.f43974b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e7 e7Var = this.f43974b;
                        m7 m7Var22 = e7Var.d;
                        float f10 = e7Var.f44163l;
                        ViewGroup viewGroup2 = e7Var.f44154a;
                        c7 c7Var2 = e7Var.f44168q;
                        AnimatorSet animatorSet2 = e7Var.f44164m;
                        m7 m7Var3 = e7Var.f44160i;
                        RectF rectF = e7Var.f44166o;
                        RectF rectF2 = e7Var.f44165n;
                        if (!e7Var.v && !e7Var.f44172u) {
                            e7Var.e();
                            e7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = e7Var.f44157e.K8(e7Var.f44158f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e7Var.f44167p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    e7Var.f44167p = K8;
                                }
                                l4 l4Var = e7Var.f44167p.J0.f44577m;
                                if (e7Var.f44171t && c7Var2.f59585n && l4Var != null && l4Var.f59585n && l4Var.getWidth() > 0 && !e7Var.f44167p.isLayoutRequested()) {
                                    rectF.set(e7Var.c(l4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        e7Var.f44172u = true;
                                        e7Var.f44167p.J0.i(true);
                                        m7Var3.f(m7Var22);
                                        m7Var3.setAlpha(f10);
                                        m7Var22.setAlpha(0.0f);
                                        e7Var.f44161j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e7Var.f44173w <= 700 && !e7Var.f44170s && viewGroup2.isAttachedToWindow()) {
                                e7Var.h.postOnAnimation(e7Var.f44174x);
                                return;
                            }
                            e7Var.f44172u = true;
                            m7Var3.setAlpha(0.0f);
                            c7Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f43974b.d();
                        return;
                    default:
                        this.f43974b.f44171t = true;
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
        a7 a7Var = this.f44174x;
        b7 b7Var = this.h;
        b7Var.removeCallbacks(a7Var);
        m7 m7Var = this.f44160i;
        m7Var.l(null);
        org.telegram.ui.Cells.v0 v0Var = this.f44167p;
        if (v0Var != null) {
            v0Var.J0.i(false);
            if (z10 && this.f44169r >= 1.0f) {
                RectF rectF = this.f44166o;
                if (!rectF.isEmpty() && this.f44167p.isAttachedToWindow() && u0.Q(this.f44167p.getMessageObject(), this.f44158f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f44165n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f24145p;
                    m4 m4Var = this.f44167p.J0;
                    m4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    m4Var.f44558b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.f56364m = hVar;
                    m4Var.f44558b0.f(0.001f);
                    m4Var.f44558b0.f56354a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    m4Var.f44558b0.b(new g4(m4Var, 1));
                    m4Var.f44558b0.h();
                }
            }
        }
        c7 c7Var = this.f44168q;
        c7Var.setPaused(true);
        b7Var.removeView(c7Var);
        m7Var.setPaused(true);
        b7Var.removeView(m7Var);
        b7Var.setClickable(false);
        this.d.setAlpha(this.f44163l);
        ui uiVar = this.f44156c;
        if (uiVar == null) {
            this.f44155b.setTranslationY(0.0f);
        } else {
            uiVar.y1(1.0f);
        }
        ViewGroup viewGroup = this.f44154a;
        if (uiVar != null && z10 && this.f44161j.d()) {
            bn bnVar = this.f44157e;
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
        this.f44159g.run();
        org.telegram.messenger.g0.h3(new u4(7, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        b7 b7Var = this.h;
        float f13 = L / 2.0f;
        m7 m7Var = this.f44160i;
        m7Var.setTranslationX((f10 - b7Var.getLeft()) - f13);
        m7Var.setTranslationY((f11 - b7Var.getTop()) - f13);
        float f14 = f12 / L;
        m7Var.setScaleX(f14);
        m7Var.setScaleY(f14);
        float translationX = m7Var.getTranslationX();
        c7 c7Var = this.f44168q;
        c7Var.setTranslationX(translationX);
        c7Var.setTranslationY(m7Var.getTranslationY());
        c7Var.setScaleX(f14);
        c7Var.setScaleY(f14);
    }

    public final RectF c(l4 l4Var) {
        ui uiVar = this.f44156c;
        ViewGroup viewGroup = this.f44154a;
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
        c7 c7Var = this.f44168q;
        if (c7Var == null) {
            return;
        }
        m7 m7Var = this.f44160i;
        float flightYaw = m7Var.getFlightYaw();
        float flightPitch = m7Var.getFlightPitch();
        if (this.f44167p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f44169r - 0.55f) / 0.45f));
            float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f44167p.J0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.f44167p.J0.f44573k.F * 0.14f) - flightPitch) * C;
        }
        c7Var.f59586r = flightYaw;
        c7Var.f59587s = flightPitch;
        c7Var.f59588w = true;
        c7Var.f59589x = true;
    }

    public final void e() {
        m7 m7Var = this.d;
        if (m7Var.isAttachedToWindow()) {
            View rootView = m7Var.getRootView();
            ViewGroup viewGroup = this.f44154a;
            if (rootView == viewGroup.getRootView()) {
                ui uiVar = this.f44156c;
                RectF rectF = this.f44165n;
                if (uiVar == null) {
                    ra.f(m7Var, this.f44155b, viewGroup, rectF);
                    return;
                }
                rectF.set(ra.a(m7Var, viewGroup));
                rectF.offset(0.0f, uiVar.f40402j4 - uiVar.f40436t2);
            }
        }
    }
}
