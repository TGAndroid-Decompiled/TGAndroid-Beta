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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.v51;
public final class fa {
    public final bi f34510a;
    public final ViewGroup f34511b;
    public final View f34512c;
    public final a7 d;
    public final b6 e;
    public final TL_wallet.walletTransaction f34513f;
    public final Runnable f34514g;
    public final da h;
    public final a7 f34515i;
    public final t9 f34516j = new t9();
    public final PathInterpolator f34517k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f34518l;
    public final AnimatorSet f34519m;
    public final RectF f34520n;
    public final RectF f34521o;
    public w3 f34522p;
    public boolean f34523q;
    public boolean f34524r;
    public boolean f34525s;
    public final long f34526t;
    public final ca f34527u;

    public fa(ViewGroup viewGroup, View view, a7 a7Var, b6 b6Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, bi biVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34519m = animatorSet;
        this.f34521o = new RectF();
        this.f34526t = SystemClock.uptimeMillis();
        this.f34527u = new Runnable(this) {
            public final fa f34363b;

            {
                this.f34363b = this;
            }

            @Override
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        fa faVar = this.f34363b;
                        a7 a7Var2 = faVar.d;
                        ViewGroup viewGroup2 = faVar.f34511b;
                        AnimatorSet animatorSet2 = faVar.f34519m;
                        a7 a7Var3 = faVar.f34515i;
                        RectF rectF = faVar.f34521o;
                        RectF rectF2 = faVar.f34520n;
                        if (!faVar.f34525s && !faVar.f34524r) {
                            faVar.e();
                            faVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            b6 b6Var2 = faVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = faVar.f34513f;
                            v51 v51Var = b6Var2.f34262r0[0];
                            w3 w3Var2 = null;
                            if (v51Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < v51Var.getChildCount()) {
                                        View childAt = v51Var.getChildAt(i10);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = faVar.f34522p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    faVar.f34522p = w3Var2;
                                    w3Var2.f(true);
                                }
                                a7 pendingDiamond = faVar.f34522p.getPendingDiamond();
                                if (faVar.f34523q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !faVar.f34522p.isLayoutRequested()) {
                                    rectF.set(faVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        faVar.f34524r = true;
                                        a7Var3.f(a7Var2);
                                        a7Var3.setAlpha(1.0f);
                                        a7Var2.setAlpha(0.0f);
                                        faVar.f34516j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - faVar.f34526t <= 450 && viewGroup2.isAttachedToWindow()) {
                                faVar.h.postOnAnimation(faVar.f34527u);
                                return;
                            }
                            faVar.f34524r = true;
                            a7Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f34363b.f34523q = true;
                        return;
                }
            }
        };
        this.f34510a = biVar;
        this.f34511b = viewGroup;
        this.f34512c = view;
        this.d = a7Var;
        this.f34518l = a7Var.getAlpha();
        this.e = b6Var;
        this.f34513f = wallettransaction;
        this.f34514g = runnable;
        RectF a2 = a(a7Var, viewGroup);
        this.f34520n = a2;
        da daVar = new da(this, viewGroup.getContext());
        this.h = daVar;
        daVar.setClipChildren(false);
        daVar.setClipToPadding(false);
        daVar.setClickable(true);
        a7 a7Var2 = new a7(60, viewGroup.getContext(), true);
        this.f34515i = a7Var2;
        a7Var2.setContinuousRotation(540.0f);
        a7Var2.f(a7Var);
        a7Var2.setAlpha(0.0f);
        daVar.addView(a7Var2, w7.b6.e(60, 60, 51));
        viewGroup.addView(daVar, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        a7Var2.l(new Runnable(this) {
            public final fa f34363b;

            {
                this.f34363b = this;
            }

            @Override
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        fa faVar = this.f34363b;
                        a7 a7Var22 = faVar.d;
                        ViewGroup viewGroup2 = faVar.f34511b;
                        AnimatorSet animatorSet2 = faVar.f34519m;
                        a7 a7Var3 = faVar.f34515i;
                        RectF rectF = faVar.f34521o;
                        RectF rectF2 = faVar.f34520n;
                        if (!faVar.f34525s && !faVar.f34524r) {
                            faVar.e();
                            faVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            b6 b6Var2 = faVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = faVar.f34513f;
                            v51 v51Var = b6Var2.f34262r0[0];
                            w3 w3Var2 = null;
                            if (v51Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < v51Var.getChildCount()) {
                                        View childAt = v51Var.getChildAt(i10);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = faVar.f34522p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    faVar.f34522p = w3Var2;
                                    w3Var2.f(true);
                                }
                                a7 pendingDiamond = faVar.f34522p.getPendingDiamond();
                                if (faVar.f34523q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !faVar.f34522p.isLayoutRequested()) {
                                    rectF.set(faVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        faVar.f34524r = true;
                                        a7Var3.f(a7Var22);
                                        a7Var3.setAlpha(1.0f);
                                        a7Var22.setAlpha(0.0f);
                                        faVar.f34516j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - faVar.f34526t <= 450 && viewGroup2.isAttachedToWindow()) {
                                faVar.h.postOnAnimation(faVar.f34527u);
                                return;
                            }
                            faVar.f34524r = true;
                            a7Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f34363b.f34523q = true;
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
        b6Var.O0();
        b6Var.X0(false);
        ii iiVar = b6Var.f30217a;
        if (iiVar != null) {
            iiVar.C0();
            b6Var.f30217a.f31182e3.h1(0, 0);
            v51 v51Var = b6Var.f34262r0[0];
            if (v51Var != null) {
                q51 q51Var = v51Var.f31183f3;
                v51Var.C0();
                q51Var.O(false);
                for (int i10 = 0; i10 < q51Var.D.size(); i10++) {
                    b51 G = q51Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = u3.f35275b;
                            if ((wallettransaction2 instanceof t3 ? ((t3) wallettransaction2).f35233a : wallettransaction2) == wallettransaction || k0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                v51Var.f31182e3.h1(i10, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f34527u);
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
        if (this.f34525s) {
            return;
        }
        this.f34525s = true;
        ca caVar = this.f34527u;
        da daVar = this.h;
        daVar.removeCallbacks(caVar);
        a7 a7Var = this.f34515i;
        a7Var.l(null);
        w3 w3Var = this.f34522p;
        if (w3Var != null && (wallettransaction = w3Var.R) != null && u3.i(wallettransaction, this.f34513f)) {
            a7 pendingDiamond = this.f34522p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(a7Var);
            }
            this.f34522p.f(false);
            RectF rectF = this.f34521o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f34520n.centerY(), rectF.centerY()) - org.telegram.messenger.i0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.i0.f16171p;
                w3 w3Var2 = this.f34522p;
                w3Var2.d();
                o1.j jVar = new o1.j(new o1.i(0.0f));
                w3Var2.H = jVar;
                o1.k kVar = new o1.k(0.0f);
                kVar.a(0.65f);
                kVar.b(200.0f);
                jVar.f13958m = kVar;
                w3Var2.H.f(0.001f);
                w3Var2.H.f13949a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                w3Var2.H.b(new q3(w3Var2, 0));
                w3Var2.H.h();
            }
        }
        a7Var.setPaused(true);
        daVar.removeView(a7Var);
        daVar.setClickable(false);
        this.d.setAlpha(this.f34518l);
        bi biVar = this.f34510a;
        if (biVar == null) {
            this.f34512c.setTranslationY(0.0f);
        } else {
            biVar.w1(1.0f);
        }
        ViewGroup viewGroup = this.f34511b;
        if (biVar != null && this.f34516j.d()) {
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
        this.f34514g.run();
        org.telegram.messenger.i0.h3(new m2(18, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float L = org.telegram.messenger.i0.L(60.0f);
        da daVar = this.h;
        float f12 = L / 2.0f;
        a7 a7Var = this.f34515i;
        a7Var.setTranslationX((f7 - daVar.getLeft()) - f12);
        a7Var.setTranslationY((f10 - daVar.getTop()) - f12);
        float f13 = f11 / L;
        a7Var.setScaleX(f13);
        a7Var.setScaleY(f13);
    }

    public final RectF d(a7 a7Var) {
        bi biVar = this.f34510a;
        ViewGroup viewGroup = this.f34511b;
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
        RectF rectF = this.f34520n;
        ViewGroup viewGroup = this.f34511b;
        a7 a7Var = this.d;
        bi biVar = this.f34510a;
        if (biVar == null) {
            f(a7Var, this.f34512c, viewGroup, rectF);
        } else if (a7Var.isAttachedToWindow() && a7Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(a7Var, viewGroup));
            rectF.offset(0.0f, biVar.f24766f4 - biVar.f24800p2);
        }
    }
}
