package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u51;
public final class fa {
    public final bi f34512a;
    public final ViewGroup f34513b;
    public final View f34514c;
    public final a7 d;
    public final b6 e;
    public final TL_wallet.walletTransaction f34515f;
    public final Runnable f34516g;
    public final da h;
    public final a7 f34517i;
    public final t9 f34518j = new t9();
    public final PathInterpolator f34519k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f34520l;
    public final AnimatorSet f34521m;
    public final RectF f34522n;
    public final RectF f34523o;
    public w3 f34524p;
    public boolean f34525q;
    public boolean f34526r;
    public boolean f34527s;
    public final long f34528t;
    public final ca f34529u;

    public fa(ViewGroup viewGroup, View view, a7 a7Var, b6 b6Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, bi biVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34521m = animatorSet;
        this.f34523o = new RectF();
        this.f34528t = SystemClock.uptimeMillis();
        this.f34529u = new Runnable(this) {
            public final fa f34362b;

            {
                this.f34362b = this;
            }

            @Override
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        fa faVar = this.f34362b;
                        a7 a7Var2 = faVar.d;
                        ViewGroup viewGroup2 = faVar.f34513b;
                        AnimatorSet animatorSet2 = faVar.f34521m;
                        a7 a7Var3 = faVar.f34517i;
                        RectF rectF = faVar.f34523o;
                        RectF rectF2 = faVar.f34522n;
                        if (!faVar.f34527s && !faVar.f34526r) {
                            faVar.e();
                            faVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            b6 b6Var2 = faVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = faVar.f34515f;
                            u51 u51Var = b6Var2.f34260r0[0];
                            w3 w3Var2 = null;
                            if (u51Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < u51Var.getChildCount()) {
                                        View childAt = u51Var.getChildAt(i10);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = faVar.f34524p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    faVar.f34524p = w3Var2;
                                    w3Var2.f(true);
                                }
                                a7 pendingDiamond = faVar.f34524p.getPendingDiamond();
                                if (faVar.f34525q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !faVar.f34524p.isLayoutRequested()) {
                                    rectF.set(faVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        faVar.f34526r = true;
                                        a7Var3.f(a7Var2);
                                        a7Var3.setAlpha(1.0f);
                                        a7Var2.setAlpha(0.0f);
                                        faVar.f34518j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - faVar.f34528t <= 450 && viewGroup2.isAttachedToWindow()) {
                                faVar.h.postOnAnimation(faVar.f34529u);
                                return;
                            }
                            faVar.f34526r = true;
                            a7Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f34362b.f34525q = true;
                        return;
                }
            }
        };
        this.f34512a = biVar;
        this.f34513b = viewGroup;
        this.f34514c = view;
        this.d = a7Var;
        this.f34520l = a7Var.getAlpha();
        this.e = b6Var;
        this.f34515f = wallettransaction;
        this.f34516g = runnable;
        RectF a2 = a(a7Var, viewGroup);
        this.f34522n = a2;
        da daVar = new da(this, viewGroup.getContext());
        this.h = daVar;
        daVar.setClipChildren(false);
        daVar.setClipToPadding(false);
        daVar.setClickable(true);
        a7 a7Var2 = new a7(60, viewGroup.getContext(), true);
        this.f34517i = a7Var2;
        a7Var2.setContinuousRotation(540.0f);
        a7Var2.f(a7Var);
        a7Var2.setAlpha(0.0f);
        daVar.addView(a7Var2, w7.b6.e(60, 60, 51));
        viewGroup.addView(daVar, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        a7Var2.l(new Runnable(this) {
            public final fa f34362b;

            {
                this.f34362b = this;
            }

            @Override
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        fa faVar = this.f34362b;
                        a7 a7Var22 = faVar.d;
                        ViewGroup viewGroup2 = faVar.f34513b;
                        AnimatorSet animatorSet2 = faVar.f34521m;
                        a7 a7Var3 = faVar.f34517i;
                        RectF rectF = faVar.f34523o;
                        RectF rectF2 = faVar.f34522n;
                        if (!faVar.f34527s && !faVar.f34526r) {
                            faVar.e();
                            faVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            b6 b6Var2 = faVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = faVar.f34515f;
                            u51 u51Var = b6Var2.f34260r0[0];
                            w3 w3Var2 = null;
                            if (u51Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < u51Var.getChildCount()) {
                                        View childAt = u51Var.getChildAt(i10);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = faVar.f34524p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    faVar.f34524p = w3Var2;
                                    w3Var2.f(true);
                                }
                                a7 pendingDiamond = faVar.f34524p.getPendingDiamond();
                                if (faVar.f34525q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !faVar.f34524p.isLayoutRequested()) {
                                    rectF.set(faVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        faVar.f34526r = true;
                                        a7Var3.f(a7Var22);
                                        a7Var3.setAlpha(1.0f);
                                        a7Var22.setAlpha(0.0f);
                                        faVar.f34518j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - faVar.f34528t <= 450 && viewGroup2.isAttachedToWindow()) {
                                faVar.h.postOnAnimation(faVar.f34529u);
                                return;
                            }
                            faVar.f34526r = true;
                            a7Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f34362b.f34525q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new r3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new ea(this, biVar, a7Var));
        b6Var.N0();
        b6Var.W0(false);
        ii iiVar = b6Var.f29837a;
        if (iiVar != null) {
            iiVar.C0();
            b6Var.f29837a.f30818e3.h1(0, 0);
            u51 u51Var = b6Var.f34260r0[0];
            if (u51Var != null) {
                p51 p51Var = u51Var.f30819f3;
                u51Var.C0();
                p51Var.O(false);
                for (int i10 = 0; i10 < p51Var.D.size(); i10++) {
                    a51 G = p51Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = u3.f35269b;
                            if ((wallettransaction2 instanceof t3 ? ((t3) wallettransaction2).f35231a : wallettransaction2) == wallettransaction || k0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                u51Var.f30818e3.h1(i10, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f34529u);
    }

    public static RectF a(View view, ViewGroup viewGroup) {
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        while (view != viewGroup) {
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            rectF.offset(-view.getScrollX(), -view.getScrollY());
        }
        return rectF;
    }

    public static void f(View view, View view2, ViewGroup viewGroup, RectF rectF) {
        if (view.isAttachedToWindow() && view.getWidth() > 0 && view.getHeight() > 0) {
            RectF rectF2 = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
            while (view != viewGroup) {
                view.getMatrix().mapRect(rectF2);
                if (view == view2) {
                    rectF2.offset(0.0f, -view2.getTranslationY());
                }
                rectF2.offset(view.getLeft(), view.getTop());
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    rectF2.offset(-view.getScrollX(), -view.getScrollY());
                } else {
                    return;
                }
            }
            rectF.set(rectF2);
        }
    }

    public final void b() {
        TL_wallet.walletTransaction wallettransaction;
        if (this.f34527s) {
            return;
        }
        this.f34527s = true;
        ca caVar = this.f34529u;
        da daVar = this.h;
        daVar.removeCallbacks(caVar);
        a7 a7Var = this.f34517i;
        a7Var.l(null);
        w3 w3Var = this.f34524p;
        if (w3Var != null && (wallettransaction = w3Var.R) != null && u3.i(wallettransaction, this.f34515f)) {
            a7 pendingDiamond = this.f34524p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(a7Var);
            }
            this.f34524p.f(false);
            RectF rectF = this.f34523o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f34522n.centerY(), rectF.centerY()) - org.telegram.messenger.i0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.i0.f16025p;
                w3 w3Var2 = this.f34524p;
                w3Var2.d();
                o1.j jVar = new o1.j(new o1.i(0.0f));
                w3Var2.H = jVar;
                o1.k kVar = new o1.k(0.0f);
                kVar.a(0.65f);
                kVar.b(200.0f);
                jVar.f13957m = kVar;
                w3Var2.H.f(0.001f);
                w3Var2.H.f13948a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                w3Var2.H.b(new q3(w3Var2, 0));
                w3Var2.H.h();
            }
        }
        a7Var.setPaused(true);
        daVar.removeView(a7Var);
        daVar.setClickable(false);
        this.d.setAlpha(this.f34520l);
        bi biVar = this.f34512a;
        if (biVar == null) {
            this.f34514c.setTranslationY(0.0f);
        } else {
            biVar.w1(1.0f);
        }
        ViewGroup viewGroup = this.f34513b;
        if (biVar != null && this.f34518j.d()) {
            b6 b6Var = this.e;
            if (b6Var.getParentLayout() != null) {
                ViewGroup view = b6Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(daVar);
                    daVar.setTranslationX(iArr[0] - iArr2[0]);
                    daVar.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(daVar, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f34516g.run();
        org.telegram.messenger.i0.h3(new k3(17, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float L = org.telegram.messenger.i0.L(60.0f);
        da daVar = this.h;
        float f12 = L / 2.0f;
        a7 a7Var = this.f34517i;
        a7Var.setTranslationX((f7 - daVar.getLeft()) - f12);
        a7Var.setTranslationY((f10 - daVar.getTop()) - f12);
        float f13 = f11 / L;
        a7Var.setScaleX(f13);
        a7Var.setScaleY(f13);
    }

    public final RectF d(a7 a7Var) {
        bi biVar = this.f34512a;
        ViewGroup viewGroup = this.f34513b;
        if (biVar == null) {
            return a(a7Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) a7Var.getRootView();
        RectF a2 = a(a7Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void e() {
        RectF rectF = this.f34522n;
        ViewGroup viewGroup = this.f34513b;
        a7 a7Var = this.d;
        bi biVar = this.f34512a;
        if (biVar == null) {
            f(a7Var, this.f34514c, viewGroup, rectF);
        } else if (a7Var.isAttachedToWindow() && a7Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(a7Var, viewGroup));
            rectF.offset(0.0f, biVar.f24675f4 - biVar.f24709p2);
        }
    }
}
