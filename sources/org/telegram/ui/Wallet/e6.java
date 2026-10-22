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
import org.telegram.ui.Components.ti;
import org.telegram.ui.qn;
public final class e6 {
    public final ViewGroup f34157a;
    public final View f34158b;
    public final ti f34159c;
    public final m6 d;
    public final qn e;
    public final TL_wallet.walletTransaction f34160f;
    public final Runnable f34161g;
    public final b6 h;
    public final m6 f34162i;
    public final k9 f34163j = new k9();
    public final PathInterpolator f34164k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f34165l;
    public final AnimatorSet f34166m;
    public final RectF f34167n;
    public final RectF f34168o;
    public org.telegram.ui.Cells.w0 f34169p;
    public final c6 f34170q;
    public float f34171r;
    public boolean f34172s;
    public boolean f34173t;
    public boolean f34174u;
    public boolean v;
    public final long f34175w;
    public final a6 f34176x;

    public e6(ViewGroup viewGroup, View view, m6 m6Var, qn qnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34166m = animatorSet;
        this.f34168o = new RectF();
        this.f34175w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final e6 f34003b;

            {
                this.f34003b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f34003b;
                        m6 m6Var2 = e6Var.d;
                        float f7 = e6Var.f34165l;
                        ViewGroup viewGroup2 = e6Var.f34157a;
                        c6 c6Var = e6Var.f34170q;
                        AnimatorSet animatorSet2 = e6Var.f34166m;
                        m6 m6Var3 = e6Var.f34162i;
                        RectF rectF = e6Var.f34168o;
                        RectF rectF2 = e6Var.f34167n;
                        if (!e6Var.v && !e6Var.f34174u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = e6Var.e.u8(e6Var.f34160f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = e6Var.f34169p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    e6Var.f34169p = u82;
                                }
                                m3 m3Var = e6Var.f34169p.I0.f34579m;
                                if (e6Var.f34173t && c6Var.f47191n && m3Var != null && m3Var.f47191n && m3Var.getWidth() > 0 && !e6Var.f34169p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(m3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.f34174u = true;
                                        e6Var.f34169p.I0.i(true);
                                        m6Var3.f(m6Var2);
                                        m6Var3.setAlpha(f7);
                                        m6Var2.setAlpha(0.0f);
                                        e6Var.f34163j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.f34175w <= 700 && !e6Var.f34172s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.f34176x);
                                return;
                            }
                            e6Var.f34174u = true;
                            m6Var3.setAlpha(0.0f);
                            c6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34003b.d();
                        return;
                    default:
                        this.f34003b.f34173t = true;
                        return;
                }
            }
        };
        this.f34176x = r12;
        this.f34159c = tiVar;
        this.f34157a = viewGroup;
        this.f34158b = view;
        this.d = m6Var;
        this.f34165l = m6Var.getAlpha();
        this.e = qnVar;
        this.f34160f = wallettransaction;
        this.f34161g = runnable;
        RectF a2 = v9.a(viewGroup, m6Var);
        this.f34167n = a2;
        e();
        b6 b6Var = new b6(this, viewGroup.getContext());
        this.h = b6Var;
        b6Var.setClipChildren(false);
        b6Var.setClipToPadding(false);
        b6Var.setClickable(true);
        m6 m6Var2 = new m6(60, viewGroup.getContext(), true);
        this.f34162i = m6Var2;
        m6Var2.setContinuousRotation(540.0f);
        m6Var2.f(m6Var);
        m6Var2.setAlpha(0.0f);
        b6Var.addView(m6Var2, w7.z5.e(60, 60, 51));
        c6 c6Var = new c6(this, viewGroup.getContext(), new Runnable(this) {
            public final e6 f34003b;

            {
                this.f34003b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f34003b;
                        m6 m6Var22 = e6Var.d;
                        float f7 = e6Var.f34165l;
                        ViewGroup viewGroup2 = e6Var.f34157a;
                        c6 c6Var2 = e6Var.f34170q;
                        AnimatorSet animatorSet2 = e6Var.f34166m;
                        m6 m6Var3 = e6Var.f34162i;
                        RectF rectF = e6Var.f34168o;
                        RectF rectF2 = e6Var.f34167n;
                        if (!e6Var.v && !e6Var.f34174u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = e6Var.e.u8(e6Var.f34160f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = e6Var.f34169p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    e6Var.f34169p = u82;
                                }
                                m3 m3Var = e6Var.f34169p.I0.f34579m;
                                if (e6Var.f34173t && c6Var2.f47191n && m3Var != null && m3Var.f47191n && m3Var.getWidth() > 0 && !e6Var.f34169p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(m3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.f34174u = true;
                                        e6Var.f34169p.I0.i(true);
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(f7);
                                        m6Var22.setAlpha(0.0f);
                                        e6Var.f34163j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.f34175w <= 700 && !e6Var.f34172s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.f34176x);
                                return;
                            }
                            e6Var.f34174u = true;
                            m6Var3.setAlpha(0.0f);
                            c6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34003b.d();
                        return;
                    default:
                        this.f34003b.f34173t = true;
                        return;
                }
            }
        });
        this.f34170q = c6Var;
        c6Var.setAlpha(0.001f);
        c6Var.setPaused(false);
        b6Var.addView(c6Var, w7.z5.e(60, 60, 51));
        viewGroup.addView(b6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        m6Var2.l(new Runnable(this) {
            public final e6 f34003b;

            {
                this.f34003b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f34003b;
                        m6 m6Var22 = e6Var.d;
                        float f7 = e6Var.f34165l;
                        ViewGroup viewGroup2 = e6Var.f34157a;
                        c6 c6Var2 = e6Var.f34170q;
                        AnimatorSet animatorSet2 = e6Var.f34166m;
                        m6 m6Var3 = e6Var.f34162i;
                        RectF rectF = e6Var.f34168o;
                        RectF rectF2 = e6Var.f34167n;
                        if (!e6Var.v && !e6Var.f34174u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = e6Var.e.u8(e6Var.f34160f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = e6Var.f34169p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    e6Var.f34169p = u82;
                                }
                                m3 m3Var = e6Var.f34169p.I0.f34579m;
                                if (e6Var.f34173t && c6Var2.f47191n && m3Var != null && m3Var.f47191n && m3Var.getWidth() > 0 && !e6Var.f34169p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(m3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.f34174u = true;
                                        e6Var.f34169p.I0.i(true);
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(f7);
                                        m6Var22.setAlpha(0.0f);
                                        e6Var.f34163j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.f34175w <= 700 && !e6Var.f34172s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.f34176x);
                                return;
                            }
                            e6Var.f34174u = true;
                            m6Var3.setAlpha(0.0f);
                            c6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34003b.d();
                        return;
                    default:
                        this.f34003b.f34173t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new b3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new d6(this, tiVar, m6Var));
        b6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        a6 a6Var = this.f34176x;
        b6 b6Var = this.h;
        b6Var.removeCallbacks(a6Var);
        m6 m6Var = this.f34162i;
        m6Var.l(null);
        org.telegram.ui.Cells.w0 w0Var = this.f34169p;
        if (w0Var != null) {
            w0Var.I0.i(false);
            if (z10 && this.f34171r >= 1.0f) {
                RectF rectF = this.f34168o;
                if (!rectF.isEmpty() && this.f34169p.isAttachedToWindow() && m0.G(this.f34169p.getMessageObject(), this.f34160f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f34167n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    n3 n3Var = this.f34169p.I0;
                    n3Var.l();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    n3Var.f34561b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.f17559u = lVar;
                    n3Var.f34561b0.e(0.001f);
                    n3Var.f34561b0.f17549a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    n3Var.f34561b0.b(new h3(n3Var, 1));
                    n3Var.f34561b0.h();
                }
            }
        }
        c6 c6Var = this.f34170q;
        c6Var.setPaused(true);
        b6Var.removeView(c6Var);
        m6Var.setPaused(true);
        b6Var.removeView(m6Var);
        b6Var.setClickable(false);
        this.d.setAlpha(this.f34165l);
        ti tiVar = this.f34159c;
        if (tiVar == null) {
            this.f34158b.setTranslationY(0.0f);
        } else {
            tiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f34157a;
        if (tiVar != null && z10 && this.f34163j.d()) {
            qn qnVar = this.e;
            if (qnVar.getParentLayout() != null) {
                ViewGroup view = qnVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(b6Var);
                    b6Var.setTranslationX(iArr[0] - iArr2[0]);
                    b6Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(b6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f34161g.run();
        AndroidUtilities.runOnUIThread(new z3(9, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        b6 b6Var = this.h;
        float f12 = dp / 2.0f;
        m6 m6Var = this.f34162i;
        m6Var.setTranslationX((f7 - b6Var.getLeft()) - f12);
        m6Var.setTranslationY((f10 - b6Var.getTop()) - f12);
        float f13 = f11 / dp;
        m6Var.setScaleX(f13);
        m6Var.setScaleY(f13);
        float translationX = m6Var.getTranslationX();
        c6 c6Var = this.f34170q;
        c6Var.setTranslationX(translationX);
        c6Var.setTranslationY(m6Var.getTranslationY());
        c6Var.setScaleX(f13);
        c6Var.setScaleY(f13);
    }

    public final RectF c(m3 m3Var) {
        ti tiVar = this.f34159c;
        ViewGroup viewGroup = this.f34157a;
        if (tiVar == null) {
            return v9.a(viewGroup, m3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) m3Var.getRootView();
        RectF a2 = v9.a(viewGroup2, m3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        c6 c6Var = this.f34170q;
        if (c6Var == null) {
            return;
        }
        m6 m6Var = this.f34162i;
        float flightYaw = m6Var.getFlightYaw();
        float flightPitch = m6Var.getFlightPitch();
        if (this.f34169p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f34171r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f34169p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f34169p.I0.f34575k.E * 0.14f) - flightPitch) * B;
        }
        c6Var.f47192r = flightYaw;
        c6Var.f47193s = flightPitch;
        c6Var.v = true;
        c6Var.f47194w = true;
    }

    public final void e() {
        m6 m6Var = this.d;
        if (m6Var.isAttachedToWindow()) {
            View rootView = m6Var.getRootView();
            ViewGroup viewGroup = this.f34157a;
            if (rootView == viewGroup.getRootView()) {
                ti tiVar = this.f34159c;
                RectF rectF = this.f34167n;
                if (tiVar == null) {
                    v9.f(m6Var, this.f34158b, viewGroup, rectF);
                    return;
                }
                rectF.set(v9.a(viewGroup, m6Var));
                rectF.offset(0.0f, tiVar.f30577o2 - tiVar.f30610y0);
            }
        }
    }
}
