package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import b8.mf;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bi;
import org.telegram.ui.ma1;
import org.telegram.ui.wm;
public final class m6 {
    public final ViewGroup f42844a;
    public final View f42845b;
    public final bi f42846c;
    public final u6 d;
    public final wm f42847e;
    public final TL_wallet.walletTransaction f42848f;
    public final Runnable f42849g;
    public final j6 h;
    public final u6 f42850i;
    public final o9 f42851j = new o9();
    public final PathInterpolator f42852k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f42853l;
    public final AnimatorSet f42854m;
    public final RectF f42855n;
    public final RectF f42856o;
    public org.telegram.ui.Cells.t0 f42857p;
    public final k6 f42858q;
    public float f42859r;
    public boolean f42860s;
    public boolean f42861t;
    public boolean f42862u;
    public boolean v;
    public final long f42863w;
    public final i6 f42864x;

    public m6(ViewGroup viewGroup, View view, u6 u6Var, wm wmVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, bi biVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42854m = animatorSet;
        this.f42856o = new RectF();
        this.f42863w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final m6 f42654b;

            {
                this.f42654b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m6 m6Var = this.f42654b;
                        u6 u6Var2 = m6Var.d;
                        float f10 = m6Var.f42853l;
                        ViewGroup viewGroup2 = m6Var.f42844a;
                        k6 k6Var = m6Var.f42858q;
                        AnimatorSet animatorSet2 = m6Var.f42854m;
                        u6 u6Var3 = m6Var.f42850i;
                        RectF rectF = m6Var.f42856o;
                        RectF rectF2 = m6Var.f42855n;
                        if (!m6Var.v && !m6Var.f42862u) {
                            m6Var.e();
                            m6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = m6Var.f42847e.I8(m6Var.f42848f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = m6Var.f42857p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.J0.i(false);
                                    }
                                    m6Var.f42857p = I8;
                                }
                                a4 a4Var = m6Var.f42857p.J0.f42254m;
                                if (m6Var.f42861t && k6Var.f57750n && a4Var != null && a4Var.f57750n && a4Var.getWidth() > 0 && !m6Var.f42857p.isLayoutRequested()) {
                                    rectF.set(m6Var.c(a4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        m6Var.f42862u = true;
                                        m6Var.f42857p.J0.i(true);
                                        u6Var3.f(u6Var2);
                                        u6Var3.setAlpha(f10);
                                        u6Var2.setAlpha(0.0f);
                                        m6Var.f42851j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - m6Var.f42863w <= 700 && !m6Var.f42860s && viewGroup2.isAttachedToWindow()) {
                                m6Var.h.postOnAnimation(m6Var.f42864x);
                                return;
                            }
                            m6Var.f42862u = true;
                            u6Var3.setAlpha(0.0f);
                            k6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42654b.d();
                        return;
                    default:
                        this.f42654b.f42861t = true;
                        return;
                }
            }
        };
        this.f42864x = r12;
        this.f42846c = biVar;
        this.f42844a = viewGroup;
        this.f42845b = view;
        this.d = u6Var;
        this.f42853l = u6Var.getAlpha();
        this.f42847e = wmVar;
        this.f42848f = wallettransaction;
        this.f42849g = runnable;
        RectF a10 = aa.a(u6Var, viewGroup);
        this.f42855n = a10;
        e();
        j6 j6Var = new j6(this, viewGroup.getContext());
        this.h = j6Var;
        j6Var.setClipChildren(false);
        j6Var.setClipToPadding(false);
        j6Var.setClickable(true);
        u6 u6Var2 = new u6(60, viewGroup.getContext(), true);
        this.f42850i = u6Var2;
        u6Var2.setContinuousRotation(540.0f);
        u6Var2.f(u6Var);
        u6Var2.setAlpha(0.0f);
        j6Var.addView(u6Var2, mf.e(60, 60, 51));
        k6 k6Var = new k6(this, viewGroup.getContext(), new Runnable(this) {
            public final m6 f42654b;

            {
                this.f42654b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m6 m6Var = this.f42654b;
                        u6 u6Var22 = m6Var.d;
                        float f10 = m6Var.f42853l;
                        ViewGroup viewGroup2 = m6Var.f42844a;
                        k6 k6Var2 = m6Var.f42858q;
                        AnimatorSet animatorSet2 = m6Var.f42854m;
                        u6 u6Var3 = m6Var.f42850i;
                        RectF rectF = m6Var.f42856o;
                        RectF rectF2 = m6Var.f42855n;
                        if (!m6Var.v && !m6Var.f42862u) {
                            m6Var.e();
                            m6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = m6Var.f42847e.I8(m6Var.f42848f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = m6Var.f42857p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.J0.i(false);
                                    }
                                    m6Var.f42857p = I8;
                                }
                                a4 a4Var = m6Var.f42857p.J0.f42254m;
                                if (m6Var.f42861t && k6Var2.f57750n && a4Var != null && a4Var.f57750n && a4Var.getWidth() > 0 && !m6Var.f42857p.isLayoutRequested()) {
                                    rectF.set(m6Var.c(a4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        m6Var.f42862u = true;
                                        m6Var.f42857p.J0.i(true);
                                        u6Var3.f(u6Var22);
                                        u6Var3.setAlpha(f10);
                                        u6Var22.setAlpha(0.0f);
                                        m6Var.f42851j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - m6Var.f42863w <= 700 && !m6Var.f42860s && viewGroup2.isAttachedToWindow()) {
                                m6Var.h.postOnAnimation(m6Var.f42864x);
                                return;
                            }
                            m6Var.f42862u = true;
                            u6Var3.setAlpha(0.0f);
                            k6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42654b.d();
                        return;
                    default:
                        this.f42654b.f42861t = true;
                        return;
                }
            }
        });
        this.f42858q = k6Var;
        k6Var.setAlpha(0.001f);
        k6Var.setPaused(false);
        j6Var.addView(k6Var, mf.e(60, 60, 51));
        viewGroup.addView(j6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        u6Var2.l(new Runnable(this) {
            public final m6 f42654b;

            {
                this.f42654b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m6 m6Var = this.f42654b;
                        u6 u6Var22 = m6Var.d;
                        float f10 = m6Var.f42853l;
                        ViewGroup viewGroup2 = m6Var.f42844a;
                        k6 k6Var2 = m6Var.f42858q;
                        AnimatorSet animatorSet2 = m6Var.f42854m;
                        u6 u6Var3 = m6Var.f42850i;
                        RectF rectF = m6Var.f42856o;
                        RectF rectF2 = m6Var.f42855n;
                        if (!m6Var.v && !m6Var.f42862u) {
                            m6Var.e();
                            m6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = m6Var.f42847e.I8(m6Var.f42848f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = m6Var.f42857p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.J0.i(false);
                                    }
                                    m6Var.f42857p = I8;
                                }
                                a4 a4Var = m6Var.f42857p.J0.f42254m;
                                if (m6Var.f42861t && k6Var2.f57750n && a4Var != null && a4Var.f57750n && a4Var.getWidth() > 0 && !m6Var.f42857p.isLayoutRequested()) {
                                    rectF.set(m6Var.c(a4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        m6Var.f42862u = true;
                                        m6Var.f42857p.J0.i(true);
                                        u6Var3.f(u6Var22);
                                        u6Var3.setAlpha(f10);
                                        u6Var22.setAlpha(0.0f);
                                        m6Var.f42851j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - m6Var.f42863w <= 700 && !m6Var.f42860s && viewGroup2.isAttachedToWindow()) {
                                m6Var.h.postOnAnimation(m6Var.f42864x);
                                return;
                            }
                            m6Var.f42862u = true;
                            u6Var3.setAlpha(0.0f);
                            k6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42654b.d();
                        return;
                    default:
                        this.f42654b.f42861t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new p3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new l6(this, biVar, u6Var));
        j6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        i6 i6Var = this.f42864x;
        j6 j6Var = this.h;
        j6Var.removeCallbacks(i6Var);
        u6 u6Var = this.f42850i;
        u6Var.l(null);
        org.telegram.ui.Cells.t0 t0Var = this.f42857p;
        if (t0Var != null) {
            t0Var.J0.i(false);
            if (z10 && this.f42859r >= 1.0f) {
                RectF rectF = this.f42856o;
                if (!rectF.isEmpty() && this.f42857p.isAttachedToWindow() && k0.I(this.f42857p.getMessageObject(), this.f42848f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f42855n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f22607p;
                    b4 b4Var = this.f42857p.J0;
                    b4Var.l();
                    q1.g gVar = new q1.g(new q1.f(0.0f));
                    b4Var.f42235b0 = gVar;
                    q1.h hVar = new q1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.f53653m = hVar;
                    b4Var.f42235b0.f(0.001f);
                    b4Var.f42235b0.f53643a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    b4Var.f42235b0.b(new v3(b4Var, 1));
                    b4Var.f42235b0.h();
                }
            }
        }
        k6 k6Var = this.f42858q;
        k6Var.setPaused(true);
        j6Var.removeView(k6Var);
        u6Var.setPaused(true);
        j6Var.removeView(u6Var);
        j6Var.setClickable(false);
        this.d.setAlpha(this.f42853l);
        bi biVar = this.f42846c;
        if (biVar == null) {
            this.f42845b.setTranslationY(0.0f);
        } else {
            biVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f42844a;
        if (biVar != null && z10 && this.f42851j.d()) {
            wm wmVar = this.f42847e;
            if (wmVar.getParentLayout() != null) {
                ViewGroup view = wmVar.getParentLayout().getView();
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
        this.f42849g.run();
        org.telegram.messenger.g0.i3(new ma1(22, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        j6 j6Var = this.h;
        float f13 = L / 2.0f;
        u6 u6Var = this.f42850i;
        u6Var.setTranslationX((f10 - j6Var.getLeft()) - f13);
        u6Var.setTranslationY((f11 - j6Var.getTop()) - f13);
        float f14 = f12 / L;
        u6Var.setScaleX(f14);
        u6Var.setScaleY(f14);
        float translationX = u6Var.getTranslationX();
        k6 k6Var = this.f42858q;
        k6Var.setTranslationX(translationX);
        k6Var.setTranslationY(u6Var.getTranslationY());
        k6Var.setScaleX(f14);
        k6Var.setScaleY(f14);
    }

    public final RectF c(a4 a4Var) {
        bi biVar = this.f42846c;
        ViewGroup viewGroup = this.f42844a;
        if (biVar == null) {
            return aa.a(a4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) a4Var.getRootView();
        RectF a10 = aa.a(a4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        k6 k6Var = this.f42858q;
        if (k6Var == null) {
            return;
        }
        u6 u6Var = this.f42850i;
        float flightYaw = u6Var.getFlightYaw();
        float flightPitch = u6Var.getFlightPitch();
        if (this.f42857p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f42859r - 0.55f) / 0.45f));
            float B = com.google.android.recaptcha.internal.a.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f42857p.J0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f42857p.J0.f42250k.F * 0.14f) - flightPitch) * B;
        }
        k6Var.f57751r = flightYaw;
        k6Var.f57752s = flightPitch;
        k6Var.f57753w = true;
        k6Var.f57754x = true;
    }

    public final void e() {
        u6 u6Var = this.d;
        if (u6Var.isAttachedToWindow()) {
            View rootView = u6Var.getRootView();
            ViewGroup viewGroup = this.f42844a;
            if (rootView == viewGroup.getRootView()) {
                bi biVar = this.f42846c;
                RectF rectF = this.f42855n;
                if (biVar == null) {
                    aa.f(u6Var, this.f42845b, viewGroup, rectF);
                    return;
                }
                rectF.set(aa.a(u6Var, viewGroup));
                rectF.offset(0.0f, biVar.f32231g4 - biVar.f32263q2);
            }
        }
    }
}
