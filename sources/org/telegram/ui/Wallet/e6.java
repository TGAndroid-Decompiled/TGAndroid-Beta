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
import org.telegram.ui.sn;
public final class e6 {
    public final ViewGroup f34439a;
    public final View f34440b;
    public final ti f34441c;
    public final m6 d;
    public final sn e;
    public final TL_wallet.walletTransaction f34442f;
    public final Runnable f34443g;
    public final b6 h;
    public final m6 f34444i;
    public final l9 f34445j = new l9();
    public final PathInterpolator f34446k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f34447l;
    public final AnimatorSet f34448m;
    public final RectF f34449n;
    public final RectF f34450o;
    public org.telegram.ui.Cells.v0 f34451p;
    public final c6 f34452q;
    public float f34453r;
    public boolean f34454s;
    public boolean f34455t;
    public boolean f34456u;
    public boolean v;
    public final long f34457w;
    public final a6 f34458x;

    public e6(ViewGroup viewGroup, View view, m6 m6Var, sn snVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34448m = animatorSet;
        this.f34450o = new RectF();
        this.f34457w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final e6 f34294b;

            {
                this.f34294b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f34294b;
                        m6 m6Var2 = e6Var.d;
                        float f7 = e6Var.f34447l;
                        ViewGroup viewGroup2 = e6Var.f34439a;
                        c6 c6Var = e6Var.f34452q;
                        AnimatorSet animatorSet2 = e6Var.f34448m;
                        m6 m6Var3 = e6Var.f34444i;
                        RectF rectF = e6Var.f34450o;
                        RectF rectF2 = e6Var.f34449n;
                        if (!e6Var.v && !e6Var.f34456u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 u82 = e6Var.e.u8(e6Var.f34442f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e6Var.f34451p;
                                if (v0Var != u82) {
                                    if (v0Var != null) {
                                        v0Var.I0.i(false);
                                    }
                                    e6Var.f34451p = u82;
                                }
                                l3 l3Var = e6Var.f34451p.I0.f34825m;
                                if (e6Var.f34455t && c6Var.f47627n && l3Var != null && l3Var.f47627n && l3Var.getWidth() > 0 && !e6Var.f34451p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(l3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.f34456u = true;
                                        e6Var.f34451p.I0.i(true);
                                        m6Var3.f(m6Var2);
                                        m6Var3.setAlpha(f7);
                                        m6Var2.setAlpha(0.0f);
                                        e6Var.f34445j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.f34457w <= 700 && !e6Var.f34454s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.f34458x);
                                return;
                            }
                            e6Var.f34456u = true;
                            m6Var3.setAlpha(0.0f);
                            c6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34294b.d();
                        return;
                    default:
                        this.f34294b.f34455t = true;
                        return;
                }
            }
        };
        this.f34458x = r12;
        this.f34441c = tiVar;
        this.f34439a = viewGroup;
        this.f34440b = view;
        this.d = m6Var;
        this.f34447l = m6Var.getAlpha();
        this.e = snVar;
        this.f34442f = wallettransaction;
        this.f34443g = runnable;
        RectF a2 = w9.a(viewGroup, m6Var);
        this.f34449n = a2;
        e();
        b6 b6Var = new b6(this, viewGroup.getContext());
        this.h = b6Var;
        b6Var.setClipChildren(false);
        b6Var.setClipToPadding(false);
        b6Var.setClickable(true);
        m6 m6Var2 = new m6(60, viewGroup.getContext(), true);
        this.f34444i = m6Var2;
        m6Var2.setContinuousRotation(540.0f);
        m6Var2.f(m6Var);
        m6Var2.setAlpha(0.0f);
        b6Var.addView(m6Var2, w7.z5.e(60, 60, 51));
        c6 c6Var = new c6(this, viewGroup.getContext(), new Runnable(this) {
            public final e6 f34294b;

            {
                this.f34294b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f34294b;
                        m6 m6Var22 = e6Var.d;
                        float f7 = e6Var.f34447l;
                        ViewGroup viewGroup2 = e6Var.f34439a;
                        c6 c6Var2 = e6Var.f34452q;
                        AnimatorSet animatorSet2 = e6Var.f34448m;
                        m6 m6Var3 = e6Var.f34444i;
                        RectF rectF = e6Var.f34450o;
                        RectF rectF2 = e6Var.f34449n;
                        if (!e6Var.v && !e6Var.f34456u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 u82 = e6Var.e.u8(e6Var.f34442f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e6Var.f34451p;
                                if (v0Var != u82) {
                                    if (v0Var != null) {
                                        v0Var.I0.i(false);
                                    }
                                    e6Var.f34451p = u82;
                                }
                                l3 l3Var = e6Var.f34451p.I0.f34825m;
                                if (e6Var.f34455t && c6Var2.f47627n && l3Var != null && l3Var.f47627n && l3Var.getWidth() > 0 && !e6Var.f34451p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(l3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.f34456u = true;
                                        e6Var.f34451p.I0.i(true);
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(f7);
                                        m6Var22.setAlpha(0.0f);
                                        e6Var.f34445j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.f34457w <= 700 && !e6Var.f34454s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.f34458x);
                                return;
                            }
                            e6Var.f34456u = true;
                            m6Var3.setAlpha(0.0f);
                            c6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34294b.d();
                        return;
                    default:
                        this.f34294b.f34455t = true;
                        return;
                }
            }
        });
        this.f34452q = c6Var;
        c6Var.setAlpha(0.001f);
        c6Var.setPaused(false);
        b6Var.addView(c6Var, w7.z5.e(60, 60, 51));
        viewGroup.addView(b6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        m6Var2.l(new Runnable(this) {
            public final e6 f34294b;

            {
                this.f34294b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f34294b;
                        m6 m6Var22 = e6Var.d;
                        float f7 = e6Var.f34447l;
                        ViewGroup viewGroup2 = e6Var.f34439a;
                        c6 c6Var2 = e6Var.f34452q;
                        AnimatorSet animatorSet2 = e6Var.f34448m;
                        m6 m6Var3 = e6Var.f34444i;
                        RectF rectF = e6Var.f34450o;
                        RectF rectF2 = e6Var.f34449n;
                        if (!e6Var.v && !e6Var.f34456u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 u82 = e6Var.e.u8(e6Var.f34442f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e6Var.f34451p;
                                if (v0Var != u82) {
                                    if (v0Var != null) {
                                        v0Var.I0.i(false);
                                    }
                                    e6Var.f34451p = u82;
                                }
                                l3 l3Var = e6Var.f34451p.I0.f34825m;
                                if (e6Var.f34455t && c6Var2.f47627n && l3Var != null && l3Var.f47627n && l3Var.getWidth() > 0 && !e6Var.f34451p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(l3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.f34456u = true;
                                        e6Var.f34451p.I0.i(true);
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(f7);
                                        m6Var22.setAlpha(0.0f);
                                        e6Var.f34445j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.f34457w <= 700 && !e6Var.f34454s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.f34458x);
                                return;
                            }
                            e6Var.f34456u = true;
                            m6Var3.setAlpha(0.0f);
                            c6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34294b.d();
                        return;
                    default:
                        this.f34294b.f34455t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new a3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new d6(this, tiVar, m6Var));
        b6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        a6 a6Var = this.f34458x;
        b6 b6Var = this.h;
        b6Var.removeCallbacks(a6Var);
        m6 m6Var = this.f34444i;
        m6Var.l(null);
        org.telegram.ui.Cells.v0 v0Var = this.f34451p;
        if (v0Var != null) {
            v0Var.I0.i(false);
            if (z10 && this.f34453r >= 1.0f) {
                RectF rectF = this.f34450o;
                if (!rectF.isEmpty() && this.f34451p.isAttachedToWindow() && l0.G(this.f34451p.getMessageObject(), this.f34442f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f34449n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    m3 m3Var = this.f34451p.I0;
                    m3Var.l();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    m3Var.f34807b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.f17622u = lVar;
                    m3Var.f34807b0.e(0.001f);
                    m3Var.f34807b0.f17612a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    m3Var.f34807b0.b(new g3(m3Var, 1));
                    m3Var.f34807b0.h();
                }
            }
        }
        c6 c6Var = this.f34452q;
        c6Var.setPaused(true);
        b6Var.removeView(c6Var);
        m6Var.setPaused(true);
        b6Var.removeView(m6Var);
        b6Var.setClickable(false);
        this.d.setAlpha(this.f34447l);
        ti tiVar = this.f34441c;
        if (tiVar == null) {
            this.f34440b.setTranslationY(0.0f);
        } else {
            tiVar.Q1(1.0f);
        }
        ViewGroup viewGroup = this.f34439a;
        if (tiVar != null && z10 && this.f34445j.d()) {
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
        this.f34443g.run();
        AndroidUtilities.runOnUIThread(new y3(9, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        b6 b6Var = this.h;
        float f12 = dp / 2.0f;
        m6 m6Var = this.f34444i;
        m6Var.setTranslationX((f7 - b6Var.getLeft()) - f12);
        m6Var.setTranslationY((f10 - b6Var.getTop()) - f12);
        float f13 = f11 / dp;
        m6Var.setScaleX(f13);
        m6Var.setScaleY(f13);
        float translationX = m6Var.getTranslationX();
        c6 c6Var = this.f34452q;
        c6Var.setTranslationX(translationX);
        c6Var.setTranslationY(m6Var.getTranslationY());
        c6Var.setScaleX(f13);
        c6Var.setScaleY(f13);
    }

    public final RectF c(l3 l3Var) {
        ti tiVar = this.f34441c;
        ViewGroup viewGroup = this.f34439a;
        if (tiVar == null) {
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
        c6 c6Var = this.f34452q;
        if (c6Var == null) {
            return;
        }
        m6 m6Var = this.f34444i;
        float flightYaw = m6Var.getFlightYaw();
        float flightPitch = m6Var.getFlightPitch();
        if (this.f34451p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f34453r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f34451p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f34451p.I0.f34821k.E * 0.14f) - flightPitch) * B;
        }
        c6Var.f47628r = flightYaw;
        c6Var.f47629s = flightPitch;
        c6Var.v = true;
        c6Var.f47630w = true;
    }

    public final void e() {
        m6 m6Var = this.d;
        if (m6Var.isAttachedToWindow()) {
            View rootView = m6Var.getRootView();
            ViewGroup viewGroup = this.f34439a;
            if (rootView == viewGroup.getRootView()) {
                ti tiVar = this.f34441c;
                RectF rectF = this.f34449n;
                if (tiVar == null) {
                    w9.f(m6Var, this.f34440b, viewGroup, rectF);
                    return;
                }
                rectF.set(w9.a(viewGroup, m6Var));
                rectF.offset(0.0f, tiVar.f30758o2 - tiVar.f30791y0);
            }
        }
    }
}
