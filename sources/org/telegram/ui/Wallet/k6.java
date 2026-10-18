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
public final class k6 {
    public final ViewGroup f34394a;
    public final View f34395b;
    public final ti f34396c;
    public final s6 d;
    public final sn e;
    public final TL_wallet.walletTransaction f34397f;
    public final Runnable f34398g;
    public final h6 h;
    public final s6 f34399i;
    public final q9 f34400j = new q9();
    public final PathInterpolator f34401k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f34402l;
    public final AnimatorSet f34403m;
    public final RectF f34404n;
    public final RectF f34405o;
    public org.telegram.ui.Cells.w0 f34406p;
    public final i6 f34407q;
    public float f34408r;
    public boolean f34409s;
    public boolean f34410t;
    public boolean f34411u;
    public boolean v;
    public final long f34412w;
    public final g6 f34413x;

    public k6(ViewGroup viewGroup, View view, s6 s6Var, sn snVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34403m = animatorSet;
        this.f34405o = new RectF();
        this.f34412w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final k6 f34275b;

            {
                this.f34275b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k6 k6Var = this.f34275b;
                        s6 s6Var2 = k6Var.d;
                        float f7 = k6Var.f34402l;
                        ViewGroup viewGroup2 = k6Var.f34394a;
                        i6 i6Var = k6Var.f34407q;
                        AnimatorSet animatorSet2 = k6Var.f34403m;
                        s6 s6Var3 = k6Var.f34399i;
                        RectF rectF = k6Var.f34405o;
                        RectF rectF2 = k6Var.f34404n;
                        if (!k6Var.v && !k6Var.f34411u) {
                            k6Var.e();
                            k6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = k6Var.e.u8(k6Var.f34397f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = k6Var.f34406p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.k(false);
                                    }
                                    k6Var.f34406p = u82;
                                }
                                k3 k3Var = k6Var.f34406p.I0.f34467m;
                                if (k6Var.f34410t && i6Var.f47229n && k3Var != null && k3Var.f47229n && k3Var.getWidth() > 0 && !k6Var.f34406p.isLayoutRequested()) {
                                    rectF.set(k6Var.c(k3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        k6Var.f34411u = true;
                                        k6Var.f34406p.I0.k(true);
                                        s6Var3.f(s6Var2);
                                        s6Var3.setAlpha(f7);
                                        s6Var2.setAlpha(0.0f);
                                        k6Var.f34400j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - k6Var.f34412w <= 700 && !k6Var.f34409s && viewGroup2.isAttachedToWindow()) {
                                k6Var.h.postOnAnimation(k6Var.f34413x);
                                return;
                            }
                            k6Var.f34411u = true;
                            s6Var3.setAlpha(0.0f);
                            i6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34275b.d();
                        return;
                    default:
                        this.f34275b.f34410t = true;
                        return;
                }
            }
        };
        this.f34413x = r12;
        this.f34396c = tiVar;
        this.f34394a = viewGroup;
        this.f34395b = view;
        this.d = s6Var;
        this.f34402l = s6Var.getAlpha();
        this.e = snVar;
        this.f34397f = wallettransaction;
        this.f34398g = runnable;
        RectF a2 = aa.a(viewGroup, s6Var);
        this.f34404n = a2;
        e();
        h6 h6Var = new h6(this, viewGroup.getContext());
        this.h = h6Var;
        h6Var.setClipChildren(false);
        h6Var.setClipToPadding(false);
        h6Var.setClickable(true);
        s6 s6Var2 = new s6(60, viewGroup.getContext(), true);
        this.f34399i = s6Var2;
        s6Var2.setContinuousRotation(540.0f);
        s6Var2.f(s6Var);
        s6Var2.setAlpha(0.0f);
        h6Var.addView(s6Var2, w7.z5.e(60, 60, 51));
        i6 i6Var = new i6(this, viewGroup.getContext(), new Runnable(this) {
            public final k6 f34275b;

            {
                this.f34275b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k6 k6Var = this.f34275b;
                        s6 s6Var22 = k6Var.d;
                        float f7 = k6Var.f34402l;
                        ViewGroup viewGroup2 = k6Var.f34394a;
                        i6 i6Var2 = k6Var.f34407q;
                        AnimatorSet animatorSet2 = k6Var.f34403m;
                        s6 s6Var3 = k6Var.f34399i;
                        RectF rectF = k6Var.f34405o;
                        RectF rectF2 = k6Var.f34404n;
                        if (!k6Var.v && !k6Var.f34411u) {
                            k6Var.e();
                            k6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = k6Var.e.u8(k6Var.f34397f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = k6Var.f34406p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.k(false);
                                    }
                                    k6Var.f34406p = u82;
                                }
                                k3 k3Var = k6Var.f34406p.I0.f34467m;
                                if (k6Var.f34410t && i6Var2.f47229n && k3Var != null && k3Var.f47229n && k3Var.getWidth() > 0 && !k6Var.f34406p.isLayoutRequested()) {
                                    rectF.set(k6Var.c(k3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        k6Var.f34411u = true;
                                        k6Var.f34406p.I0.k(true);
                                        s6Var3.f(s6Var22);
                                        s6Var3.setAlpha(f7);
                                        s6Var22.setAlpha(0.0f);
                                        k6Var.f34400j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - k6Var.f34412w <= 700 && !k6Var.f34409s && viewGroup2.isAttachedToWindow()) {
                                k6Var.h.postOnAnimation(k6Var.f34413x);
                                return;
                            }
                            k6Var.f34411u = true;
                            s6Var3.setAlpha(0.0f);
                            i6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34275b.d();
                        return;
                    default:
                        this.f34275b.f34410t = true;
                        return;
                }
            }
        });
        this.f34407q = i6Var;
        i6Var.setAlpha(0.001f);
        i6Var.setPaused(false);
        h6Var.addView(i6Var, w7.z5.e(60, 60, 51));
        viewGroup.addView(h6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        s6Var2.l(new Runnable(this) {
            public final k6 f34275b;

            {
                this.f34275b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k6 k6Var = this.f34275b;
                        s6 s6Var22 = k6Var.d;
                        float f7 = k6Var.f34402l;
                        ViewGroup viewGroup2 = k6Var.f34394a;
                        i6 i6Var2 = k6Var.f34407q;
                        AnimatorSet animatorSet2 = k6Var.f34403m;
                        s6 s6Var3 = k6Var.f34399i;
                        RectF rectF = k6Var.f34405o;
                        RectF rectF2 = k6Var.f34404n;
                        if (!k6Var.v && !k6Var.f34411u) {
                            k6Var.e();
                            k6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = k6Var.e.u8(k6Var.f34397f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = k6Var.f34406p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.k(false);
                                    }
                                    k6Var.f34406p = u82;
                                }
                                k3 k3Var = k6Var.f34406p.I0.f34467m;
                                if (k6Var.f34410t && i6Var2.f47229n && k3Var != null && k3Var.f47229n && k3Var.getWidth() > 0 && !k6Var.f34406p.isLayoutRequested()) {
                                    rectF.set(k6Var.c(k3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        k6Var.f34411u = true;
                                        k6Var.f34406p.I0.k(true);
                                        s6Var3.f(s6Var22);
                                        s6Var3.setAlpha(f7);
                                        s6Var22.setAlpha(0.0f);
                                        k6Var.f34400j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - k6Var.f34412w <= 700 && !k6Var.f34409s && viewGroup2.isAttachedToWindow()) {
                                k6Var.h.postOnAnimation(k6Var.f34413x);
                                return;
                            }
                            k6Var.f34411u = true;
                            s6Var3.setAlpha(0.0f);
                            i6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34275b.d();
                        return;
                    default:
                        this.f34275b.f34410t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new u2(this, 4));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new j6(this, tiVar, s6Var));
        h6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        g6 g6Var = this.f34413x;
        h6 h6Var = this.h;
        h6Var.removeCallbacks(g6Var);
        s6 s6Var = this.f34399i;
        s6Var.l(null);
        org.telegram.ui.Cells.w0 w0Var = this.f34406p;
        if (w0Var != null) {
            w0Var.I0.k(false);
            if (z10 && this.f34408r >= 1.0f) {
                RectF rectF = this.f34405o;
                if (!rectF.isEmpty() && this.f34406p.isAttachedToWindow() && m0.G(this.f34406p.getMessageObject(), this.f34397f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f34404n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    l3 l3Var = this.f34406p.I0;
                    l3Var.n();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    l3Var.f34449b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.f17562u = lVar;
                    l3Var.f34449b0.e(0.001f);
                    l3Var.f34449b0.f17552a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    l3Var.f34449b0.b(new f3(l3Var, 1));
                    l3Var.f34449b0.h();
                }
            }
        }
        i6 i6Var = this.f34407q;
        i6Var.setPaused(true);
        h6Var.removeView(i6Var);
        s6Var.setPaused(true);
        h6Var.removeView(s6Var);
        h6Var.setClickable(false);
        this.d.setAlpha(this.f34402l);
        ti tiVar = this.f34396c;
        if (tiVar == null) {
            this.f34395b.setTranslationY(0.0f);
        } else {
            tiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f34394a;
        if (tiVar != null && z10 && this.f34400j.d()) {
            sn snVar = this.e;
            if (snVar.getParentLayout() != null) {
                ViewGroup view = snVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(h6Var);
                    h6Var.setTranslationX(iArr[0] - iArr2[0]);
                    h6Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(h6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f34398g.run();
        AndroidUtilities.runOnUIThread(new u3(9, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        h6 h6Var = this.h;
        float f12 = dp / 2.0f;
        s6 s6Var = this.f34399i;
        s6Var.setTranslationX((f7 - h6Var.getLeft()) - f12);
        s6Var.setTranslationY((f10 - h6Var.getTop()) - f12);
        float f13 = f11 / dp;
        s6Var.setScaleX(f13);
        s6Var.setScaleY(f13);
        float translationX = s6Var.getTranslationX();
        i6 i6Var = this.f34407q;
        i6Var.setTranslationX(translationX);
        i6Var.setTranslationY(s6Var.getTranslationY());
        i6Var.setScaleX(f13);
        i6Var.setScaleY(f13);
    }

    public final RectF c(k3 k3Var) {
        ti tiVar = this.f34396c;
        ViewGroup viewGroup = this.f34394a;
        if (tiVar == null) {
            return aa.a(viewGroup, k3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) k3Var.getRootView();
        RectF a2 = aa.a(viewGroup2, k3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        i6 i6Var = this.f34407q;
        if (i6Var == null) {
            return;
        }
        s6 s6Var = this.f34399i;
        float flightYaw = s6Var.getFlightYaw();
        float flightPitch = s6Var.getFlightPitch();
        if (this.f34406p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f34408r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f34406p.I0.i() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f34406p.I0.f34463k.E * 0.14f) - flightPitch) * B;
        }
        i6Var.f47230r = flightYaw;
        i6Var.f47231s = flightPitch;
        i6Var.v = true;
        i6Var.f47232w = true;
    }

    public final void e() {
        s6 s6Var = this.d;
        if (s6Var.isAttachedToWindow()) {
            View rootView = s6Var.getRootView();
            ViewGroup viewGroup = this.f34394a;
            if (rootView == viewGroup.getRootView()) {
                ti tiVar = this.f34396c;
                RectF rectF = this.f34404n;
                if (tiVar == null) {
                    aa.f(s6Var, this.f34395b, viewGroup, rectF);
                    return;
                }
                rectF.set(aa.a(viewGroup, s6Var));
                rectF.offset(0.0f, tiVar.f30609o2 - tiVar.f30642y0);
            }
        }
    }
}
