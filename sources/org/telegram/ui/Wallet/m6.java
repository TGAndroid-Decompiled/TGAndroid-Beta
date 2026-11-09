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
import org.telegram.ui.cn;
import org.telegram.ui.wb1;
public final class m6 {
    public final ViewGroup f42795a;
    public final View f42796b;
    public final di f42797c;
    public final u6 d;
    public final cn f42798e;
    public final TL_wallet.walletTransaction f42799f;
    public final Runnable f42800g;
    public final j6 h;
    public final u6 f42801i;
    public final n9 f42802j = new n9();
    public final PathInterpolator f42803k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f42804l;
    public final AnimatorSet f42805m;
    public final RectF f42806n;
    public final RectF f42807o;
    public org.telegram.ui.Cells.t0 f42808p;
    public final k6 f42809q;
    public float f42810r;
    public boolean f42811s;
    public boolean f42812t;
    public boolean f42813u;
    public boolean v;
    public final long f42814w;
    public final i6 f42815x;

    public m6(ViewGroup viewGroup, View view, u6 u6Var, cn cnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, di diVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42805m = animatorSet;
        this.f42807o = new RectF();
        this.f42814w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final m6 f42596b;

            {
                this.f42596b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m6 m6Var = this.f42596b;
                        u6 u6Var2 = m6Var.d;
                        float f10 = m6Var.f42804l;
                        ViewGroup viewGroup2 = m6Var.f42795a;
                        k6 k6Var = m6Var.f42809q;
                        AnimatorSet animatorSet2 = m6Var.f42805m;
                        u6 u6Var3 = m6Var.f42801i;
                        RectF rectF = m6Var.f42807o;
                        RectF rectF2 = m6Var.f42806n;
                        if (!m6Var.v && !m6Var.f42813u) {
                            m6Var.e();
                            m6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 J8 = m6Var.f42798e.J8(m6Var.f42799f);
                            if (J8 != null && J8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = m6Var.f42808p;
                                if (t0Var != J8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    m6Var.f42808p = J8;
                                }
                                a4 a4Var = m6Var.f42808p.I0.f42244m;
                                if (m6Var.f42812t && k6Var.f57507n && a4Var != null && a4Var.f57507n && a4Var.getWidth() > 0 && !m6Var.f42808p.isLayoutRequested()) {
                                    rectF.set(m6Var.c(a4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        m6Var.f42813u = true;
                                        m6Var.f42808p.I0.i(true);
                                        u6Var3.f(u6Var2);
                                        u6Var3.setAlpha(f10);
                                        u6Var2.setAlpha(0.0f);
                                        m6Var.f42802j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - m6Var.f42814w <= 700 && !m6Var.f42811s && viewGroup2.isAttachedToWindow()) {
                                m6Var.h.postOnAnimation(m6Var.f42815x);
                                return;
                            }
                            m6Var.f42813u = true;
                            u6Var3.setAlpha(0.0f);
                            k6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42596b.d();
                        return;
                    default:
                        this.f42596b.f42812t = true;
                        return;
                }
            }
        };
        this.f42815x = r12;
        this.f42797c = diVar;
        this.f42795a = viewGroup;
        this.f42796b = view;
        this.d = u6Var;
        this.f42804l = u6Var.getAlpha();
        this.f42798e = cnVar;
        this.f42799f = wallettransaction;
        this.f42800g = runnable;
        RectF a10 = z9.a(u6Var, viewGroup);
        this.f42806n = a10;
        e();
        j6 j6Var = new j6(this, viewGroup.getContext());
        this.h = j6Var;
        j6Var.setClipChildren(false);
        j6Var.setClipToPadding(false);
        j6Var.setClickable(true);
        u6 u6Var2 = new u6(60, viewGroup.getContext(), true);
        this.f42801i = u6Var2;
        u6Var2.setContinuousRotation(540.0f);
        u6Var2.f(u6Var);
        u6Var2.setAlpha(0.0f);
        j6Var.addView(u6Var2, c8.ha.e(60, 60, 51));
        k6 k6Var = new k6(this, viewGroup.getContext(), new Runnable(this) {
            public final m6 f42596b;

            {
                this.f42596b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m6 m6Var = this.f42596b;
                        u6 u6Var22 = m6Var.d;
                        float f10 = m6Var.f42804l;
                        ViewGroup viewGroup2 = m6Var.f42795a;
                        k6 k6Var2 = m6Var.f42809q;
                        AnimatorSet animatorSet2 = m6Var.f42805m;
                        u6 u6Var3 = m6Var.f42801i;
                        RectF rectF = m6Var.f42807o;
                        RectF rectF2 = m6Var.f42806n;
                        if (!m6Var.v && !m6Var.f42813u) {
                            m6Var.e();
                            m6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 J8 = m6Var.f42798e.J8(m6Var.f42799f);
                            if (J8 != null && J8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = m6Var.f42808p;
                                if (t0Var != J8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    m6Var.f42808p = J8;
                                }
                                a4 a4Var = m6Var.f42808p.I0.f42244m;
                                if (m6Var.f42812t && k6Var2.f57507n && a4Var != null && a4Var.f57507n && a4Var.getWidth() > 0 && !m6Var.f42808p.isLayoutRequested()) {
                                    rectF.set(m6Var.c(a4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        m6Var.f42813u = true;
                                        m6Var.f42808p.I0.i(true);
                                        u6Var3.f(u6Var22);
                                        u6Var3.setAlpha(f10);
                                        u6Var22.setAlpha(0.0f);
                                        m6Var.f42802j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - m6Var.f42814w <= 700 && !m6Var.f42811s && viewGroup2.isAttachedToWindow()) {
                                m6Var.h.postOnAnimation(m6Var.f42815x);
                                return;
                            }
                            m6Var.f42813u = true;
                            u6Var3.setAlpha(0.0f);
                            k6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42596b.d();
                        return;
                    default:
                        this.f42596b.f42812t = true;
                        return;
                }
            }
        });
        this.f42809q = k6Var;
        k6Var.setAlpha(0.001f);
        k6Var.setPaused(false);
        j6Var.addView(k6Var, c8.ha.e(60, 60, 51));
        viewGroup.addView(j6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        u6Var2.l(new Runnable(this) {
            public final m6 f42596b;

            {
                this.f42596b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m6 m6Var = this.f42596b;
                        u6 u6Var22 = m6Var.d;
                        float f10 = m6Var.f42804l;
                        ViewGroup viewGroup2 = m6Var.f42795a;
                        k6 k6Var2 = m6Var.f42809q;
                        AnimatorSet animatorSet2 = m6Var.f42805m;
                        u6 u6Var3 = m6Var.f42801i;
                        RectF rectF = m6Var.f42807o;
                        RectF rectF2 = m6Var.f42806n;
                        if (!m6Var.v && !m6Var.f42813u) {
                            m6Var.e();
                            m6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 J8 = m6Var.f42798e.J8(m6Var.f42799f);
                            if (J8 != null && J8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = m6Var.f42808p;
                                if (t0Var != J8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    m6Var.f42808p = J8;
                                }
                                a4 a4Var = m6Var.f42808p.I0.f42244m;
                                if (m6Var.f42812t && k6Var2.f57507n && a4Var != null && a4Var.f57507n && a4Var.getWidth() > 0 && !m6Var.f42808p.isLayoutRequested()) {
                                    rectF.set(m6Var.c(a4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        m6Var.f42813u = true;
                                        m6Var.f42808p.I0.i(true);
                                        u6Var3.f(u6Var22);
                                        u6Var3.setAlpha(f10);
                                        u6Var22.setAlpha(0.0f);
                                        m6Var.f42802j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - m6Var.f42814w <= 700 && !m6Var.f42811s && viewGroup2.isAttachedToWindow()) {
                                m6Var.h.postOnAnimation(m6Var.f42815x);
                                return;
                            }
                            m6Var.f42813u = true;
                            u6Var3.setAlpha(0.0f);
                            k6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42596b.d();
                        return;
                    default:
                        this.f42596b.f42812t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new p3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new l6(this, diVar, u6Var));
        j6Var.post(r12);
    }

    public final void a(boolean z9) {
        if (this.v) {
            return;
        }
        this.v = true;
        i6 i6Var = this.f42815x;
        j6 j6Var = this.h;
        j6Var.removeCallbacks(i6Var);
        u6 u6Var = this.f42801i;
        u6Var.l(null);
        org.telegram.ui.Cells.t0 t0Var = this.f42808p;
        if (t0Var != null) {
            t0Var.I0.i(false);
            if (z9 && this.f42810r >= 1.0f) {
                RectF rectF = this.f42807o;
                if (!rectF.isEmpty() && this.f42808p.isAttachedToWindow() && l0.I(this.f42808p.getMessageObject(), this.f42799f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f42806n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f22562p;
                    b4 b4Var = this.f42808p.I0;
                    b4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    b4Var.f42225b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.f54280m = hVar;
                    b4Var.f42225b0.f(0.001f);
                    b4Var.f42225b0.f54270a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    b4Var.f42225b0.b(new v3(b4Var, 1));
                    b4Var.f42225b0.h();
                }
            }
        }
        k6 k6Var = this.f42809q;
        k6Var.setPaused(true);
        j6Var.removeView(k6Var);
        u6Var.setPaused(true);
        j6Var.removeView(u6Var);
        j6Var.setClickable(false);
        this.d.setAlpha(this.f42804l);
        di diVar = this.f42797c;
        if (diVar == null) {
            this.f42796b.setTranslationY(0.0f);
        } else {
            diVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f42795a;
        if (diVar != null && z9 && this.f42802j.d()) {
            cn cnVar = this.f42798e;
            if (cnVar.getParentLayout() != null) {
                ViewGroup view = cnVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(j6Var);
                    j6Var.setTranslationX(iArr[0] - iArr2[0]);
                    j6Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(j6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f42800g.run();
        org.telegram.messenger.g0.i3(new wb1(18, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        j6 j6Var = this.h;
        float f13 = L / 2.0f;
        u6 u6Var = this.f42801i;
        u6Var.setTranslationX((f10 - j6Var.getLeft()) - f13);
        u6Var.setTranslationY((f11 - j6Var.getTop()) - f13);
        float f14 = f12 / L;
        u6Var.setScaleX(f14);
        u6Var.setScaleY(f14);
        float translationX = u6Var.getTranslationX();
        k6 k6Var = this.f42809q;
        k6Var.setTranslationX(translationX);
        k6Var.setTranslationY(u6Var.getTranslationY());
        k6Var.setScaleX(f14);
        k6Var.setScaleY(f14);
    }

    public final RectF c(a4 a4Var) {
        di diVar = this.f42797c;
        ViewGroup viewGroup = this.f42795a;
        if (diVar == null) {
            return z9.a(a4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) a4Var.getRootView();
        RectF a10 = z9.a(a4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        k6 k6Var = this.f42809q;
        if (k6Var == null) {
            return;
        }
        u6 u6Var = this.f42801i;
        float flightYaw = u6Var.getFlightYaw();
        float flightPitch = u6Var.getFlightPitch();
        if (this.f42808p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f42810r - 0.55f) / 0.45f));
            float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f42808p.I0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.f42808p.I0.f42240k.E * 0.14f) - flightPitch) * C;
        }
        k6Var.f57508r = flightYaw;
        k6Var.f57509s = flightPitch;
        k6Var.f57510w = true;
        k6Var.f57511x = true;
    }

    public final void e() {
        u6 u6Var = this.d;
        if (u6Var.isAttachedToWindow()) {
            View rootView = u6Var.getRootView();
            ViewGroup viewGroup = this.f42795a;
            if (rootView == viewGroup.getRootView()) {
                di diVar = this.f42797c;
                RectF rectF = this.f42806n;
                if (diVar == null) {
                    z9.f(u6Var, this.f42796b, viewGroup, rectF);
                    return;
                }
                rectF.set(z9.a(u6Var, viewGroup));
                rectF.offset(0.0f, diVar.f33003f4 - diVar.f33035p2);
            }
        }
    }
}
