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
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.ui;
public final class ra {
    public final ui f44989a;
    public final ViewGroup f44990b;
    public final View f44991c;
    public final m7 d;
    public final n6 f44992e;
    public final TL_wallet.walletTransaction f44993f;
    public final Runnable f44994g;
    public final pa h;
    public final m7 f44995i;
    public final fa f44996j = new fa();
    public final PathInterpolator f44997k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f44998l;
    public final AnimatorSet f44999m;
    public final RectF f45000n;
    public final RectF f45001o;
    public f4 f45002p;
    public boolean f45003q;
    public boolean f45004r;
    public boolean f45005s;
    public final long f45006t;
    public final oa f45007u;

    public ra(ViewGroup viewGroup, View view, m7 m7Var, n6 n6Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ui uiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f44999m = animatorSet;
        this.f45001o = new RectF();
        this.f45006t = SystemClock.uptimeMillis();
        this.f45007u = new Runnable(this) {
            public final ra f44771b;

            {
                this.f44771b = this;
            }

            @Override
            public final void run() {
                f4 f4Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        ra raVar = this.f44771b;
                        m7 m7Var2 = raVar.d;
                        ViewGroup viewGroup2 = raVar.f44990b;
                        AnimatorSet animatorSet2 = raVar.f44999m;
                        m7 m7Var3 = raVar.f44995i;
                        RectF rectF = raVar.f45001o;
                        RectF rectF2 = raVar.f45000n;
                        if (!raVar.f45005s && !raVar.f45004r) {
                            raVar.e();
                            raVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            n6 n6Var2 = raVar.f44992e;
                            TL_wallet.walletTransaction wallettransaction3 = raVar.f44993f;
                            h51 h51Var = n6Var2.f44689u0[0];
                            f4 f4Var2 = null;
                            if (h51Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < h51Var.getChildCount()) {
                                        View childAt = h51Var.getChildAt(i7);
                                        if ((childAt instanceof f4) && (wallettransaction2 = (f4Var = (f4) childAt).S) != null && d4.j(wallettransaction2, wallettransaction3)) {
                                            f4Var2 = f4Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (f4Var2 != null && f4Var2.getWidth() > 0) {
                                f4 f4Var3 = raVar.f45002p;
                                if (f4Var3 != f4Var2) {
                                    if (f4Var3 != null) {
                                        f4Var3.g(false);
                                    }
                                    raVar.f45002p = f4Var2;
                                    f4Var2.g(true);
                                }
                                m7 pendingDiamond = raVar.f45002p.getPendingDiamond();
                                if (raVar.f45003q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !raVar.f45002p.isLayoutRequested()) {
                                    rectF.set(raVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        raVar.f45004r = true;
                                        m7Var3.f(m7Var2);
                                        m7Var3.setAlpha(1.0f);
                                        m7Var2.setAlpha(0.0f);
                                        raVar.f44996j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - raVar.f45006t <= 450 && viewGroup2.isAttachedToWindow()) {
                                raVar.h.postOnAnimation(raVar.f45007u);
                                return;
                            }
                            raVar.f45004r = true;
                            m7Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f44771b.f45003q = true;
                        return;
                }
            }
        };
        this.f44989a = uiVar;
        this.f44990b = viewGroup;
        this.f44991c = view;
        this.d = m7Var;
        this.f44998l = m7Var.getAlpha();
        this.f44992e = n6Var;
        this.f44993f = wallettransaction;
        this.f44994g = runnable;
        RectF a10 = a(m7Var, viewGroup);
        this.f45000n = a10;
        pa paVar = new pa(this, viewGroup.getContext());
        this.h = paVar;
        paVar.setClipChildren(false);
        paVar.setClipToPadding(false);
        paVar.setClickable(true);
        m7 m7Var2 = new m7(60, viewGroup.getContext(), true);
        this.f44995i = m7Var2;
        m7Var2.setContinuousRotation(540.0f);
        m7Var2.f(m7Var);
        m7Var2.setAlpha(0.0f);
        paVar.addView(m7Var2, c8.ma.e(60, 60, 51));
        viewGroup.addView(paVar, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        m7Var2.l(new Runnable(this) {
            public final ra f44771b;

            {
                this.f44771b = this;
            }

            @Override
            public final void run() {
                f4 f4Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        ra raVar = this.f44771b;
                        m7 m7Var22 = raVar.d;
                        ViewGroup viewGroup2 = raVar.f44990b;
                        AnimatorSet animatorSet2 = raVar.f44999m;
                        m7 m7Var3 = raVar.f44995i;
                        RectF rectF = raVar.f45001o;
                        RectF rectF2 = raVar.f45000n;
                        if (!raVar.f45005s && !raVar.f45004r) {
                            raVar.e();
                            raVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            n6 n6Var2 = raVar.f44992e;
                            TL_wallet.walletTransaction wallettransaction3 = raVar.f44993f;
                            h51 h51Var = n6Var2.f44689u0[0];
                            f4 f4Var2 = null;
                            if (h51Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < h51Var.getChildCount()) {
                                        View childAt = h51Var.getChildAt(i7);
                                        if ((childAt instanceof f4) && (wallettransaction2 = (f4Var = (f4) childAt).S) != null && d4.j(wallettransaction2, wallettransaction3)) {
                                            f4Var2 = f4Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (f4Var2 != null && f4Var2.getWidth() > 0) {
                                f4 f4Var3 = raVar.f45002p;
                                if (f4Var3 != f4Var2) {
                                    if (f4Var3 != null) {
                                        f4Var3.g(false);
                                    }
                                    raVar.f45002p = f4Var2;
                                    f4Var2.g(true);
                                }
                                m7 pendingDiamond = raVar.f45002p.getPendingDiamond();
                                if (raVar.f45003q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !raVar.f45002p.isLayoutRequested()) {
                                    rectF.set(raVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        raVar.f45004r = true;
                                        m7Var3.f(m7Var22);
                                        m7Var3.setAlpha(1.0f);
                                        m7Var22.setAlpha(0.0f);
                                        raVar.f44996j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - raVar.f45006t <= 450 && viewGroup2.isAttachedToWindow()) {
                                raVar.h.postOnAnimation(raVar.f45007u);
                                return;
                            }
                            raVar.f45004r = true;
                            m7Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f44771b.f45003q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new z3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new qa(this, uiVar, m7Var));
        n6Var.T0();
        n6Var.c1(false);
        bi.f6 f6Var = n6Var.f34681a;
        if (f6Var != null) {
            f6Var.C0();
            n6Var.f34681a.f35789f3.h1(0, 0);
            h51 h51Var = n6Var.f44689u0[0];
            if (h51Var != null) {
                c51 c51Var = h51Var.f35790g3;
                h51Var.C0();
                c51Var.O(false);
                for (int i7 = 0; i7 < c51Var.E.size(); i7++) {
                    o41 G = c51Var.G(i7);
                    if (G != null) {
                        Object obj = G.H;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i10 = d4.f44077b;
                            if ((wallettransaction2 instanceof c4 ? ((c4) wallettransaction2).f44031a : wallettransaction2) == wallettransaction || u0.t0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                h51Var.f35789f3.h1(i7, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f45007u);
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
        if (this.f45005s) {
            return;
        }
        this.f45005s = true;
        oa oaVar = this.f45007u;
        pa paVar = this.h;
        paVar.removeCallbacks(oaVar);
        m7 m7Var = this.f44995i;
        m7Var.l(null);
        f4 f4Var = this.f45002p;
        if (f4Var != null && (wallettransaction = f4Var.S) != null && d4.j(wallettransaction, this.f44993f)) {
            m7 pendingDiamond = this.f45002p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(m7Var);
            }
            this.f45002p.g(false);
            RectF rectF = this.f45001o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f45000n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f24045p;
                f4 f4Var2 = this.f45002p;
                f4Var2.e();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                f4Var2.I = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.f56368m = hVar;
                f4Var2.I.f(0.001f);
                f4Var2.I.f56358a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                f4Var2.I.b(new y3(f4Var2, 0));
                f4Var2.I.h();
            }
        }
        m7Var.setPaused(true);
        paVar.removeView(m7Var);
        paVar.setClickable(false);
        this.d.setAlpha(this.f44998l);
        ui uiVar = this.f44989a;
        if (uiVar == null) {
            this.f44991c.setTranslationY(0.0f);
        } else {
            uiVar.y1(1.0f);
        }
        ViewGroup viewGroup = this.f44990b;
        if (uiVar != null && this.f44996j.d()) {
            n6 n6Var = this.f44992e;
            if (n6Var.getParentLayout() != null) {
                ViewGroup view = n6Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(paVar);
                    paVar.setTranslationX(iArr[0] - iArr2[0]);
                    paVar.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(paVar, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f44994g.run();
        org.telegram.messenger.g0.h3(new u4(14, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        pa paVar = this.h;
        float f13 = L / 2.0f;
        m7 m7Var = this.f44995i;
        m7Var.setTranslationX((f10 - paVar.getLeft()) - f13);
        m7Var.setTranslationY((f11 - paVar.getTop()) - f13);
        float f14 = f12 / L;
        m7Var.setScaleX(f14);
        m7Var.setScaleY(f14);
    }

    public final RectF d(m7 m7Var) {
        ui uiVar = this.f44989a;
        ViewGroup viewGroup = this.f44990b;
        if (uiVar == null) {
            return a(m7Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) m7Var.getRootView();
        RectF a10 = a(m7Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void e() {
        RectF rectF = this.f45000n;
        ViewGroup viewGroup = this.f44990b;
        m7 m7Var = this.d;
        ui uiVar = this.f44989a;
        if (uiVar == null) {
            f(m7Var, this.f44991c, viewGroup, rectF);
        } else if (m7Var.isAttachedToWindow() && m7Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(m7Var, viewGroup));
            rectF.offset(0.0f, uiVar.f40395j4 - uiVar.f40429t2);
        }
    }
}
