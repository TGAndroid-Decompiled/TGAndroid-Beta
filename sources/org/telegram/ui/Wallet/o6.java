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
    public final ViewGroup f42883a;
    public final View f42884b;
    public final di f42885c;
    public final w6 d;
    public final an f42886e;
    public final TL_wallet.walletTransaction f42887f;
    public final Runnable f42888g;
    public final l6 h;
    public final w6 f42889i;
    public final p9 f42890j = new p9();
    public final PathInterpolator f42891k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f42892l;
    public final AnimatorSet f42893m;
    public final RectF f42894n;
    public final RectF f42895o;
    public org.telegram.ui.Cells.t0 f42896p;
    public final m6 f42897q;
    public float f42898r;
    public boolean f42899s;
    public boolean f42900t;
    public boolean f42901u;
    public boolean v;
    public final long f42902w;
    public final k6 f42903x;

    public o6(ViewGroup viewGroup, View view, w6 w6Var, an anVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, di diVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42893m = animatorSet;
        this.f42895o = new RectF();
        this.f42902w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final o6 f42683b;

            {
                this.f42683b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o6 o6Var = this.f42683b;
                        w6 w6Var2 = o6Var.d;
                        float f10 = o6Var.f42892l;
                        ViewGroup viewGroup2 = o6Var.f42883a;
                        m6 m6Var = o6Var.f42897q;
                        AnimatorSet animatorSet2 = o6Var.f42893m;
                        w6 w6Var3 = o6Var.f42889i;
                        RectF rectF = o6Var.f42895o;
                        RectF rectF2 = o6Var.f42894n;
                        if (!o6Var.v && !o6Var.f42901u) {
                            o6Var.e();
                            o6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = o6Var.f42886e.I8(o6Var.f42887f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = o6Var.f42896p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    o6Var.f42896p = I8;
                                }
                                c4 c4Var = o6Var.f42896p.I0.f42335m;
                                if (o6Var.f42900t && m6Var.f57378n && c4Var != null && c4Var.f57378n && c4Var.getWidth() > 0 && !o6Var.f42896p.isLayoutRequested()) {
                                    rectF.set(o6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        o6Var.f42901u = true;
                                        o6Var.f42896p.I0.i(true);
                                        w6Var3.f(w6Var2);
                                        w6Var3.setAlpha(f10);
                                        w6Var2.setAlpha(0.0f);
                                        o6Var.f42890j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - o6Var.f42902w <= 700 && !o6Var.f42899s && viewGroup2.isAttachedToWindow()) {
                                o6Var.h.postOnAnimation(o6Var.f42903x);
                                return;
                            }
                            o6Var.f42901u = true;
                            w6Var3.setAlpha(0.0f);
                            m6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42683b.d();
                        return;
                    default:
                        this.f42683b.f42900t = true;
                        return;
                }
            }
        };
        this.f42903x = r12;
        this.f42885c = diVar;
        this.f42883a = viewGroup;
        this.f42884b = view;
        this.d = w6Var;
        this.f42892l = w6Var.getAlpha();
        this.f42886e = anVar;
        this.f42887f = wallettransaction;
        this.f42888g = runnable;
        RectF a10 = ba.a(w6Var, viewGroup);
        this.f42894n = a10;
        e();
        l6 l6Var = new l6(this, viewGroup.getContext());
        this.h = l6Var;
        l6Var.setClipChildren(false);
        l6Var.setClipToPadding(false);
        l6Var.setClickable(true);
        w6 w6Var2 = new w6(60, viewGroup.getContext(), true);
        this.f42889i = w6Var2;
        w6Var2.setContinuousRotation(540.0f);
        w6Var2.f(w6Var);
        w6Var2.setAlpha(0.0f);
        l6Var.addView(w6Var2, c8.ha.e(60, 60, 51));
        m6 m6Var = new m6(this, viewGroup.getContext(), new Runnable(this) {
            public final o6 f42683b;

            {
                this.f42683b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o6 o6Var = this.f42683b;
                        w6 w6Var22 = o6Var.d;
                        float f10 = o6Var.f42892l;
                        ViewGroup viewGroup2 = o6Var.f42883a;
                        m6 m6Var2 = o6Var.f42897q;
                        AnimatorSet animatorSet2 = o6Var.f42893m;
                        w6 w6Var3 = o6Var.f42889i;
                        RectF rectF = o6Var.f42895o;
                        RectF rectF2 = o6Var.f42894n;
                        if (!o6Var.v && !o6Var.f42901u) {
                            o6Var.e();
                            o6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = o6Var.f42886e.I8(o6Var.f42887f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = o6Var.f42896p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    o6Var.f42896p = I8;
                                }
                                c4 c4Var = o6Var.f42896p.I0.f42335m;
                                if (o6Var.f42900t && m6Var2.f57378n && c4Var != null && c4Var.f57378n && c4Var.getWidth() > 0 && !o6Var.f42896p.isLayoutRequested()) {
                                    rectF.set(o6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        o6Var.f42901u = true;
                                        o6Var.f42896p.I0.i(true);
                                        w6Var3.f(w6Var22);
                                        w6Var3.setAlpha(f10);
                                        w6Var22.setAlpha(0.0f);
                                        o6Var.f42890j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - o6Var.f42902w <= 700 && !o6Var.f42899s && viewGroup2.isAttachedToWindow()) {
                                o6Var.h.postOnAnimation(o6Var.f42903x);
                                return;
                            }
                            o6Var.f42901u = true;
                            w6Var3.setAlpha(0.0f);
                            m6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42683b.d();
                        return;
                    default:
                        this.f42683b.f42900t = true;
                        return;
                }
            }
        });
        this.f42897q = m6Var;
        m6Var.setAlpha(0.001f);
        m6Var.setPaused(false);
        l6Var.addView(m6Var, c8.ha.e(60, 60, 51));
        viewGroup.addView(l6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        w6Var2.l(new Runnable(this) {
            public final o6 f42683b;

            {
                this.f42683b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o6 o6Var = this.f42683b;
                        w6 w6Var22 = o6Var.d;
                        float f10 = o6Var.f42892l;
                        ViewGroup viewGroup2 = o6Var.f42883a;
                        m6 m6Var2 = o6Var.f42897q;
                        AnimatorSet animatorSet2 = o6Var.f42893m;
                        w6 w6Var3 = o6Var.f42889i;
                        RectF rectF = o6Var.f42895o;
                        RectF rectF2 = o6Var.f42894n;
                        if (!o6Var.v && !o6Var.f42901u) {
                            o6Var.e();
                            o6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = o6Var.f42886e.I8(o6Var.f42887f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = o6Var.f42896p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    o6Var.f42896p = I8;
                                }
                                c4 c4Var = o6Var.f42896p.I0.f42335m;
                                if (o6Var.f42900t && m6Var2.f57378n && c4Var != null && c4Var.f57378n && c4Var.getWidth() > 0 && !o6Var.f42896p.isLayoutRequested()) {
                                    rectF.set(o6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        o6Var.f42901u = true;
                                        o6Var.f42896p.I0.i(true);
                                        w6Var3.f(w6Var22);
                                        w6Var3.setAlpha(f10);
                                        w6Var22.setAlpha(0.0f);
                                        o6Var.f42890j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - o6Var.f42902w <= 700 && !o6Var.f42899s && viewGroup2.isAttachedToWindow()) {
                                o6Var.h.postOnAnimation(o6Var.f42903x);
                                return;
                            }
                            o6Var.f42901u = true;
                            w6Var3.setAlpha(0.0f);
                            m6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42683b.d();
                        return;
                    default:
                        this.f42683b.f42900t = true;
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
        k6 k6Var = this.f42903x;
        l6 l6Var = this.h;
        l6Var.removeCallbacks(k6Var);
        w6 w6Var = this.f42889i;
        w6Var.l(null);
        org.telegram.ui.Cells.t0 t0Var = this.f42896p;
        if (t0Var != null) {
            t0Var.I0.i(false);
            if (z9 && this.f42898r >= 1.0f) {
                RectF rectF = this.f42895o;
                if (!rectF.isEmpty() && this.f42896p.isAttachedToWindow() && n0.I(this.f42896p.getMessageObject(), this.f42887f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f42894n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f22536p;
                    d4 d4Var = this.f42896p.I0;
                    d4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    d4Var.f42316b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.f54150m = hVar;
                    d4Var.f42316b0.f(0.001f);
                    d4Var.f42316b0.f54140a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    d4Var.f42316b0.b(new x3(d4Var, 1));
                    d4Var.f42316b0.h();
                }
            }
        }
        m6 m6Var = this.f42897q;
        m6Var.setPaused(true);
        l6Var.removeView(m6Var);
        w6Var.setPaused(true);
        l6Var.removeView(w6Var);
        l6Var.setClickable(false);
        this.d.setAlpha(this.f42892l);
        di diVar = this.f42885c;
        if (diVar == null) {
            this.f42884b.setTranslationY(0.0f);
        } else {
            diVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f42883a;
        if (diVar != null && z9 && this.f42890j.d()) {
            an anVar = this.f42886e;
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
        this.f42888g.run();
        org.telegram.messenger.g0.i3(new n(17, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        l6 l6Var = this.h;
        float f13 = L / 2.0f;
        w6 w6Var = this.f42889i;
        w6Var.setTranslationX((f10 - l6Var.getLeft()) - f13);
        w6Var.setTranslationY((f11 - l6Var.getTop()) - f13);
        float f14 = f12 / L;
        w6Var.setScaleX(f14);
        w6Var.setScaleY(f14);
        float translationX = w6Var.getTranslationX();
        m6 m6Var = this.f42897q;
        m6Var.setTranslationX(translationX);
        m6Var.setTranslationY(w6Var.getTranslationY());
        m6Var.setScaleX(f14);
        m6Var.setScaleY(f14);
    }

    public final RectF c(c4 c4Var) {
        di diVar = this.f42885c;
        ViewGroup viewGroup = this.f42883a;
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
        m6 m6Var = this.f42897q;
        if (m6Var == null) {
            return;
        }
        w6 w6Var = this.f42889i;
        float flightYaw = w6Var.getFlightYaw();
        float flightPitch = w6Var.getFlightPitch();
        if (this.f42896p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f42898r - 0.55f) / 0.45f));
            float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f42896p.I0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.f42896p.I0.f42331k.E * 0.14f) - flightPitch) * C;
        }
        m6Var.f57379r = flightYaw;
        m6Var.f57380s = flightPitch;
        m6Var.f57381w = true;
        m6Var.f57382x = true;
    }

    public final void e() {
        w6 w6Var = this.d;
        if (w6Var.isAttachedToWindow()) {
            View rootView = w6Var.getRootView();
            ViewGroup viewGroup = this.f42883a;
            if (rootView == viewGroup.getRootView()) {
                di diVar = this.f42885c;
                RectF rectF = this.f42894n;
                if (diVar == null) {
                    ba.f(w6Var, this.f42884b, viewGroup, rectF);
                    return;
                }
                rectF.set(ba.a(w6Var, viewGroup));
                rectF.offset(0.0f, diVar.f32898f4 - diVar.f32930p2);
            }
        }
    }
}
