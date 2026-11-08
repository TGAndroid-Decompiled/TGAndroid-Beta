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
public final class n6 {
    public final ViewGroup f42877a;
    public final View f42878b;
    public final di f42879c;
    public final v6 d;
    public final an f42880e;
    public final TL_wallet.walletTransaction f42881f;
    public final Runnable f42882g;
    public final k6 h;
    public final v6 f42883i;
    public final o9 f42884j = new o9();
    public final PathInterpolator f42885k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f42886l;
    public final AnimatorSet f42887m;
    public final RectF f42888n;
    public final RectF f42889o;
    public org.telegram.ui.Cells.t0 f42890p;
    public final l6 f42891q;
    public float f42892r;
    public boolean f42893s;
    public boolean f42894t;
    public boolean f42895u;
    public boolean v;
    public final long f42896w;
    public final j6 f42897x;

    public n6(ViewGroup viewGroup, View view, v6 v6Var, an anVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, di diVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42887m = animatorSet;
        this.f42889o = new RectF();
        this.f42896w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final n6 f42678b;

            {
                this.f42678b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n6 n6Var = this.f42678b;
                        v6 v6Var2 = n6Var.d;
                        float f10 = n6Var.f42886l;
                        ViewGroup viewGroup2 = n6Var.f42877a;
                        l6 l6Var = n6Var.f42891q;
                        AnimatorSet animatorSet2 = n6Var.f42887m;
                        v6 v6Var3 = n6Var.f42883i;
                        RectF rectF = n6Var.f42889o;
                        RectF rectF2 = n6Var.f42888n;
                        if (!n6Var.v && !n6Var.f42895u) {
                            n6Var.e();
                            n6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = n6Var.f42880e.I8(n6Var.f42881f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = n6Var.f42890p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    n6Var.f42890p = I8;
                                }
                                b4 b4Var = n6Var.f42890p.I0.f42330m;
                                if (n6Var.f42894t && l6Var.f57494n && b4Var != null && b4Var.f57494n && b4Var.getWidth() > 0 && !n6Var.f42890p.isLayoutRequested()) {
                                    rectF.set(n6Var.c(b4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        n6Var.f42895u = true;
                                        n6Var.f42890p.I0.i(true);
                                        v6Var3.f(v6Var2);
                                        v6Var3.setAlpha(f10);
                                        v6Var2.setAlpha(0.0f);
                                        n6Var.f42884j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - n6Var.f42896w <= 700 && !n6Var.f42893s && viewGroup2.isAttachedToWindow()) {
                                n6Var.h.postOnAnimation(n6Var.f42897x);
                                return;
                            }
                            n6Var.f42895u = true;
                            v6Var3.setAlpha(0.0f);
                            l6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42678b.d();
                        return;
                    default:
                        this.f42678b.f42894t = true;
                        return;
                }
            }
        };
        this.f42897x = r12;
        this.f42879c = diVar;
        this.f42877a = viewGroup;
        this.f42878b = view;
        this.d = v6Var;
        this.f42886l = v6Var.getAlpha();
        this.f42880e = anVar;
        this.f42881f = wallettransaction;
        this.f42882g = runnable;
        RectF a10 = aa.a(v6Var, viewGroup);
        this.f42888n = a10;
        e();
        k6 k6Var = new k6(this, viewGroup.getContext());
        this.h = k6Var;
        k6Var.setClipChildren(false);
        k6Var.setClipToPadding(false);
        k6Var.setClickable(true);
        v6 v6Var2 = new v6(60, viewGroup.getContext(), true);
        this.f42883i = v6Var2;
        v6Var2.setContinuousRotation(540.0f);
        v6Var2.f(v6Var);
        v6Var2.setAlpha(0.0f);
        k6Var.addView(v6Var2, c8.ha.e(60, 60, 51));
        l6 l6Var = new l6(this, viewGroup.getContext(), new Runnable(this) {
            public final n6 f42678b;

            {
                this.f42678b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n6 n6Var = this.f42678b;
                        v6 v6Var22 = n6Var.d;
                        float f10 = n6Var.f42886l;
                        ViewGroup viewGroup2 = n6Var.f42877a;
                        l6 l6Var2 = n6Var.f42891q;
                        AnimatorSet animatorSet2 = n6Var.f42887m;
                        v6 v6Var3 = n6Var.f42883i;
                        RectF rectF = n6Var.f42889o;
                        RectF rectF2 = n6Var.f42888n;
                        if (!n6Var.v && !n6Var.f42895u) {
                            n6Var.e();
                            n6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = n6Var.f42880e.I8(n6Var.f42881f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = n6Var.f42890p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    n6Var.f42890p = I8;
                                }
                                b4 b4Var = n6Var.f42890p.I0.f42330m;
                                if (n6Var.f42894t && l6Var2.f57494n && b4Var != null && b4Var.f57494n && b4Var.getWidth() > 0 && !n6Var.f42890p.isLayoutRequested()) {
                                    rectF.set(n6Var.c(b4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        n6Var.f42895u = true;
                                        n6Var.f42890p.I0.i(true);
                                        v6Var3.f(v6Var22);
                                        v6Var3.setAlpha(f10);
                                        v6Var22.setAlpha(0.0f);
                                        n6Var.f42884j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - n6Var.f42896w <= 700 && !n6Var.f42893s && viewGroup2.isAttachedToWindow()) {
                                n6Var.h.postOnAnimation(n6Var.f42897x);
                                return;
                            }
                            n6Var.f42895u = true;
                            v6Var3.setAlpha(0.0f);
                            l6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42678b.d();
                        return;
                    default:
                        this.f42678b.f42894t = true;
                        return;
                }
            }
        });
        this.f42891q = l6Var;
        l6Var.setAlpha(0.001f);
        l6Var.setPaused(false);
        k6Var.addView(l6Var, c8.ha.e(60, 60, 51));
        viewGroup.addView(k6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        v6Var2.l(new Runnable(this) {
            public final n6 f42678b;

            {
                this.f42678b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n6 n6Var = this.f42678b;
                        v6 v6Var22 = n6Var.d;
                        float f10 = n6Var.f42886l;
                        ViewGroup viewGroup2 = n6Var.f42877a;
                        l6 l6Var2 = n6Var.f42891q;
                        AnimatorSet animatorSet2 = n6Var.f42887m;
                        v6 v6Var3 = n6Var.f42883i;
                        RectF rectF = n6Var.f42889o;
                        RectF rectF2 = n6Var.f42888n;
                        if (!n6Var.v && !n6Var.f42895u) {
                            n6Var.e();
                            n6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = n6Var.f42880e.I8(n6Var.f42881f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = n6Var.f42890p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    n6Var.f42890p = I8;
                                }
                                b4 b4Var = n6Var.f42890p.I0.f42330m;
                                if (n6Var.f42894t && l6Var2.f57494n && b4Var != null && b4Var.f57494n && b4Var.getWidth() > 0 && !n6Var.f42890p.isLayoutRequested()) {
                                    rectF.set(n6Var.c(b4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        n6Var.f42895u = true;
                                        n6Var.f42890p.I0.i(true);
                                        v6Var3.f(v6Var22);
                                        v6Var3.setAlpha(f10);
                                        v6Var22.setAlpha(0.0f);
                                        n6Var.f42884j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - n6Var.f42896w <= 700 && !n6Var.f42893s && viewGroup2.isAttachedToWindow()) {
                                n6Var.h.postOnAnimation(n6Var.f42897x);
                                return;
                            }
                            n6Var.f42895u = true;
                            v6Var3.setAlpha(0.0f);
                            l6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f42678b.d();
                        return;
                    default:
                        this.f42678b.f42894t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new q3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new m6(this, diVar, v6Var));
        k6Var.post(r12);
    }

    public final void a(boolean z9) {
        if (this.v) {
            return;
        }
        this.v = true;
        j6 j6Var = this.f42897x;
        k6 k6Var = this.h;
        k6Var.removeCallbacks(j6Var);
        v6 v6Var = this.f42883i;
        v6Var.l(null);
        org.telegram.ui.Cells.t0 t0Var = this.f42890p;
        if (t0Var != null) {
            t0Var.I0.i(false);
            if (z9 && this.f42892r >= 1.0f) {
                RectF rectF = this.f42889o;
                if (!rectF.isEmpty() && this.f42890p.isAttachedToWindow() && m0.I(this.f42890p.getMessageObject(), this.f42881f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f42888n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f22562p;
                    c4 c4Var = this.f42890p.I0;
                    c4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    c4Var.f42311b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.f54267m = hVar;
                    c4Var.f42311b0.f(0.001f);
                    c4Var.f42311b0.f54257a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    c4Var.f42311b0.b(new w3(c4Var, 1));
                    c4Var.f42311b0.h();
                }
            }
        }
        l6 l6Var = this.f42891q;
        l6Var.setPaused(true);
        k6Var.removeView(l6Var);
        v6Var.setPaused(true);
        k6Var.removeView(v6Var);
        k6Var.setClickable(false);
        this.d.setAlpha(this.f42886l);
        di diVar = this.f42879c;
        if (diVar == null) {
            this.f42878b.setTranslationY(0.0f);
        } else {
            diVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f42877a;
        if (diVar != null && z9 && this.f42884j.d()) {
            an anVar = this.f42880e;
            if (anVar.getParentLayout() != null) {
                ViewGroup view = anVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(k6Var);
                    k6Var.setTranslationX(iArr[0] - iArr2[0]);
                    k6Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(k6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f42882g.run();
        org.telegram.messenger.g0.i3(new n(17, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        k6 k6Var = this.h;
        float f13 = L / 2.0f;
        v6 v6Var = this.f42883i;
        v6Var.setTranslationX((f10 - k6Var.getLeft()) - f13);
        v6Var.setTranslationY((f11 - k6Var.getTop()) - f13);
        float f14 = f12 / L;
        v6Var.setScaleX(f14);
        v6Var.setScaleY(f14);
        float translationX = v6Var.getTranslationX();
        l6 l6Var = this.f42891q;
        l6Var.setTranslationX(translationX);
        l6Var.setTranslationY(v6Var.getTranslationY());
        l6Var.setScaleX(f14);
        l6Var.setScaleY(f14);
    }

    public final RectF c(b4 b4Var) {
        di diVar = this.f42879c;
        ViewGroup viewGroup = this.f42877a;
        if (diVar == null) {
            return aa.a(b4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) b4Var.getRootView();
        RectF a10 = aa.a(b4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        l6 l6Var = this.f42891q;
        if (l6Var == null) {
            return;
        }
        v6 v6Var = this.f42883i;
        float flightYaw = v6Var.getFlightYaw();
        float flightPitch = v6Var.getFlightPitch();
        if (this.f42890p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f42892r - 0.55f) / 0.45f));
            float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f42890p.I0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.f42890p.I0.f42326k.E * 0.14f) - flightPitch) * C;
        }
        l6Var.f57495r = flightYaw;
        l6Var.f57496s = flightPitch;
        l6Var.f57497w = true;
        l6Var.f57498x = true;
    }

    public final void e() {
        v6 v6Var = this.d;
        if (v6Var.isAttachedToWindow()) {
            View rootView = v6Var.getRootView();
            ViewGroup viewGroup = this.f42877a;
            if (rootView == viewGroup.getRootView()) {
                di diVar = this.f42879c;
                RectF rectF = this.f42888n;
                if (diVar == null) {
                    aa.f(v6Var, this.f42878b, viewGroup, rectF);
                    return;
                }
                rectF.set(aa.a(v6Var, viewGroup));
                rectF.offset(0.0f, diVar.f32948f4 - diVar.f32980p2);
            }
        }
    }
}
