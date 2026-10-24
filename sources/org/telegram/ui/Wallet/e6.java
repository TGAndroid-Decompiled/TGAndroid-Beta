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
import org.telegram.ui.Components.ri;
import org.telegram.ui.sn;
public final class e6 {
    public final ViewGroup f34441a;
    public final View f34442b;
    public final ri f34443c;
    public final m6 d;
    public final sn e;
    public final TL_wallet.walletTransaction f34444f;
    public final Runnable f34445g;
    public final b6 h;
    public final m6 f34446i;
    public final l9 f34447j = new l9();
    public final PathInterpolator f34448k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f34449l;
    public final AnimatorSet f34450m;
    public final RectF f34451n;
    public final RectF f34452o;
    public org.telegram.ui.Cells.v0 f34453p;
    public final c6 f34454q;
    public float f34455r;
    public boolean f34456s;
    public boolean f34457t;
    public boolean f34458u;
    public boolean v;
    public final long f34459w;
    public final a6 f34460x;

    public e6(ViewGroup viewGroup, View view, m6 m6Var, sn snVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ri riVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34450m = animatorSet;
        this.f34452o = new RectF();
        this.f34459w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final e6 f34296b;

            {
                this.f34296b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f34296b;
                        m6 m6Var2 = e6Var.d;
                        float f7 = e6Var.f34449l;
                        ViewGroup viewGroup2 = e6Var.f34441a;
                        c6 c6Var = e6Var.f34454q;
                        AnimatorSet animatorSet2 = e6Var.f34450m;
                        m6 m6Var3 = e6Var.f34446i;
                        RectF rectF = e6Var.f34452o;
                        RectF rectF2 = e6Var.f34451n;
                        if (!e6Var.v && !e6Var.f34458u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 u82 = e6Var.e.u8(e6Var.f34444f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e6Var.f34453p;
                                if (v0Var != u82) {
                                    if (v0Var != null) {
                                        v0Var.I0.i(false);
                                    }
                                    e6Var.f34453p = u82;
                                }
                                l3 l3Var = e6Var.f34453p.I0.f34827m;
                                if (e6Var.f34457t && c6Var.f47626n && l3Var != null && l3Var.f47626n && l3Var.getWidth() > 0 && !e6Var.f34453p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(l3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.f34458u = true;
                                        e6Var.f34453p.I0.i(true);
                                        m6Var3.f(m6Var2);
                                        m6Var3.setAlpha(f7);
                                        m6Var2.setAlpha(0.0f);
                                        e6Var.f34447j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.f34459w <= 700 && !e6Var.f34456s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.f34460x);
                                return;
                            }
                            e6Var.f34458u = true;
                            m6Var3.setAlpha(0.0f);
                            c6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34296b.d();
                        return;
                    default:
                        this.f34296b.f34457t = true;
                        return;
                }
            }
        };
        this.f34460x = r12;
        this.f34443c = riVar;
        this.f34441a = viewGroup;
        this.f34442b = view;
        this.d = m6Var;
        this.f34449l = m6Var.getAlpha();
        this.e = snVar;
        this.f34444f = wallettransaction;
        this.f34445g = runnable;
        RectF a2 = w9.a(viewGroup, m6Var);
        this.f34451n = a2;
        e();
        b6 b6Var = new b6(this, viewGroup.getContext());
        this.h = b6Var;
        b6Var.setClipChildren(false);
        b6Var.setClipToPadding(false);
        b6Var.setClickable(true);
        m6 m6Var2 = new m6(60, viewGroup.getContext(), true);
        this.f34446i = m6Var2;
        m6Var2.setContinuousRotation(540.0f);
        m6Var2.f(m6Var);
        m6Var2.setAlpha(0.0f);
        b6Var.addView(m6Var2, w7.z5.e(60, 60, 51));
        c6 c6Var = new c6(this, viewGroup.getContext(), new Runnable(this) {
            public final e6 f34296b;

            {
                this.f34296b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f34296b;
                        m6 m6Var22 = e6Var.d;
                        float f7 = e6Var.f34449l;
                        ViewGroup viewGroup2 = e6Var.f34441a;
                        c6 c6Var2 = e6Var.f34454q;
                        AnimatorSet animatorSet2 = e6Var.f34450m;
                        m6 m6Var3 = e6Var.f34446i;
                        RectF rectF = e6Var.f34452o;
                        RectF rectF2 = e6Var.f34451n;
                        if (!e6Var.v && !e6Var.f34458u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 u82 = e6Var.e.u8(e6Var.f34444f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e6Var.f34453p;
                                if (v0Var != u82) {
                                    if (v0Var != null) {
                                        v0Var.I0.i(false);
                                    }
                                    e6Var.f34453p = u82;
                                }
                                l3 l3Var = e6Var.f34453p.I0.f34827m;
                                if (e6Var.f34457t && c6Var2.f47626n && l3Var != null && l3Var.f47626n && l3Var.getWidth() > 0 && !e6Var.f34453p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(l3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.f34458u = true;
                                        e6Var.f34453p.I0.i(true);
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(f7);
                                        m6Var22.setAlpha(0.0f);
                                        e6Var.f34447j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.f34459w <= 700 && !e6Var.f34456s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.f34460x);
                                return;
                            }
                            e6Var.f34458u = true;
                            m6Var3.setAlpha(0.0f);
                            c6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34296b.d();
                        return;
                    default:
                        this.f34296b.f34457t = true;
                        return;
                }
            }
        });
        this.f34454q = c6Var;
        c6Var.setAlpha(0.001f);
        c6Var.setPaused(false);
        b6Var.addView(c6Var, w7.z5.e(60, 60, 51));
        viewGroup.addView(b6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        m6Var2.l(new Runnable(this) {
            public final e6 f34296b;

            {
                this.f34296b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f34296b;
                        m6 m6Var22 = e6Var.d;
                        float f7 = e6Var.f34449l;
                        ViewGroup viewGroup2 = e6Var.f34441a;
                        c6 c6Var2 = e6Var.f34454q;
                        AnimatorSet animatorSet2 = e6Var.f34450m;
                        m6 m6Var3 = e6Var.f34446i;
                        RectF rectF = e6Var.f34452o;
                        RectF rectF2 = e6Var.f34451n;
                        if (!e6Var.v && !e6Var.f34458u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 u82 = e6Var.e.u8(e6Var.f34444f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e6Var.f34453p;
                                if (v0Var != u82) {
                                    if (v0Var != null) {
                                        v0Var.I0.i(false);
                                    }
                                    e6Var.f34453p = u82;
                                }
                                l3 l3Var = e6Var.f34453p.I0.f34827m;
                                if (e6Var.f34457t && c6Var2.f47626n && l3Var != null && l3Var.f47626n && l3Var.getWidth() > 0 && !e6Var.f34453p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(l3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.f34458u = true;
                                        e6Var.f34453p.I0.i(true);
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(f7);
                                        m6Var22.setAlpha(0.0f);
                                        e6Var.f34447j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.f34459w <= 700 && !e6Var.f34456s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.f34460x);
                                return;
                            }
                            e6Var.f34458u = true;
                            m6Var3.setAlpha(0.0f);
                            c6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34296b.d();
                        return;
                    default:
                        this.f34296b.f34457t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new a3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new d6(this, riVar, m6Var));
        b6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        a6 a6Var = this.f34460x;
        b6 b6Var = this.h;
        b6Var.removeCallbacks(a6Var);
        m6 m6Var = this.f34446i;
        m6Var.l(null);
        org.telegram.ui.Cells.v0 v0Var = this.f34453p;
        if (v0Var != null) {
            v0Var.I0.i(false);
            if (z10 && this.f34455r >= 1.0f) {
                RectF rectF = this.f34452o;
                if (!rectF.isEmpty() && this.f34453p.isAttachedToWindow() && l0.G(this.f34453p.getMessageObject(), this.f34444f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f34451n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    m3 m3Var = this.f34453p.I0;
                    m3Var.l();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    m3Var.f34809b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.f17622u = lVar;
                    m3Var.f34809b0.e(0.001f);
                    m3Var.f34809b0.f17612a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    m3Var.f34809b0.b(new g3(m3Var, 1));
                    m3Var.f34809b0.h();
                }
            }
        }
        c6 c6Var = this.f34454q;
        c6Var.setPaused(true);
        b6Var.removeView(c6Var);
        m6Var.setPaused(true);
        b6Var.removeView(m6Var);
        b6Var.setClickable(false);
        this.d.setAlpha(this.f34449l);
        ri riVar = this.f34443c;
        if (riVar == null) {
            this.f34442b.setTranslationY(0.0f);
        } else {
            riVar.Q1(1.0f);
        }
        ViewGroup viewGroup = this.f34441a;
        if (riVar != null && z10 && this.f34447j.d()) {
            sn snVar = this.e;
            if (snVar.getParentLayout() != null) {
                ViewGroup view = snVar.getParentLayout().getView();
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
        this.f34445g.run();
        AndroidUtilities.runOnUIThread(new y3(9, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        b6 b6Var = this.h;
        float f12 = dp / 2.0f;
        m6 m6Var = this.f34446i;
        m6Var.setTranslationX((f7 - b6Var.getLeft()) - f12);
        m6Var.setTranslationY((f10 - b6Var.getTop()) - f12);
        float f13 = f11 / dp;
        m6Var.setScaleX(f13);
        m6Var.setScaleY(f13);
        float translationX = m6Var.getTranslationX();
        c6 c6Var = this.f34454q;
        c6Var.setTranslationX(translationX);
        c6Var.setTranslationY(m6Var.getTranslationY());
        c6Var.setScaleX(f13);
        c6Var.setScaleY(f13);
    }

    public final RectF c(l3 l3Var) {
        ri riVar = this.f34443c;
        ViewGroup viewGroup = this.f34441a;
        if (riVar == null) {
            return w9.a(viewGroup, l3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) l3Var.getRootView();
        RectF a2 = w9.a(viewGroup2, l3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        c6 c6Var = this.f34454q;
        if (c6Var == null) {
            return;
        }
        m6 m6Var = this.f34446i;
        float flightYaw = m6Var.getFlightYaw();
        float flightPitch = m6Var.getFlightPitch();
        if (this.f34453p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f34455r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f34453p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f34453p.I0.f34823k.E * 0.14f) - flightPitch) * B;
        }
        c6Var.f47627r = flightYaw;
        c6Var.f47628s = flightPitch;
        c6Var.v = true;
        c6Var.f47629w = true;
    }

    public final void e() {
        m6 m6Var = this.d;
        if (m6Var.isAttachedToWindow()) {
            View rootView = m6Var.getRootView();
            ViewGroup viewGroup = this.f34441a;
            if (rootView == viewGroup.getRootView()) {
                ri riVar = this.f34443c;
                RectF rectF = this.f34451n;
                if (riVar == null) {
                    w9.f(m6Var, this.f34442b, viewGroup, rectF);
                    return;
                }
                rectF.set(w9.a(viewGroup, m6Var));
                rectF.offset(0.0f, riVar.f30174o2 - riVar.f30207y0);
            }
        }
    }
}
