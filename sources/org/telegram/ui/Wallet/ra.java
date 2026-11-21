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
    public final ui f44985a;
    public final ViewGroup f44986b;
    public final View f44987c;
    public final m7 d;
    public final n6 f44988e;
    public final TL_wallet.walletTransaction f44989f;
    public final Runnable f44990g;
    public final pa h;
    public final m7 f44991i;
    public final fa f44992j = new fa();
    public final PathInterpolator f44993k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f44994l;
    public final AnimatorSet f44995m;
    public final RectF f44996n;
    public final RectF f44997o;
    public f4 f44998p;
    public boolean f44999q;
    public boolean f45000r;
    public boolean f45001s;
    public final long f45002t;
    public final oa f45003u;

    public ra(ViewGroup viewGroup, View view, m7 m7Var, n6 n6Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ui uiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f44995m = animatorSet;
        this.f44997o = new RectF();
        this.f45002t = SystemClock.uptimeMillis();
        this.f45003u = new Runnable(this) {
            public final ra f44767b;

            {
                this.f44767b = this;
            }

            @Override
            public final void run() {
                f4 f4Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        ra raVar = this.f44767b;
                        m7 m7Var2 = raVar.d;
                        ViewGroup viewGroup2 = raVar.f44986b;
                        AnimatorSet animatorSet2 = raVar.f44995m;
                        m7 m7Var3 = raVar.f44991i;
                        RectF rectF = raVar.f44997o;
                        RectF rectF2 = raVar.f44996n;
                        if (!raVar.f45001s && !raVar.f45000r) {
                            raVar.e();
                            raVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            n6 n6Var2 = raVar.f44988e;
                            TL_wallet.walletTransaction wallettransaction3 = raVar.f44989f;
                            h51 h51Var = n6Var2.f44685u0[0];
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
                                f4 f4Var3 = raVar.f44998p;
                                if (f4Var3 != f4Var2) {
                                    if (f4Var3 != null) {
                                        f4Var3.g(false);
                                    }
                                    raVar.f44998p = f4Var2;
                                    f4Var2.g(true);
                                }
                                m7 pendingDiamond = raVar.f44998p.getPendingDiamond();
                                if (raVar.f44999q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !raVar.f44998p.isLayoutRequested()) {
                                    rectF.set(raVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        raVar.f45000r = true;
                                        m7Var3.f(m7Var2);
                                        m7Var3.setAlpha(1.0f);
                                        m7Var2.setAlpha(0.0f);
                                        raVar.f44992j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - raVar.f45002t <= 450 && viewGroup2.isAttachedToWindow()) {
                                raVar.h.postOnAnimation(raVar.f45003u);
                                return;
                            }
                            raVar.f45000r = true;
                            m7Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f44767b.f44999q = true;
                        return;
                }
            }
        };
        this.f44985a = uiVar;
        this.f44986b = viewGroup;
        this.f44987c = view;
        this.d = m7Var;
        this.f44994l = m7Var.getAlpha();
        this.f44988e = n6Var;
        this.f44989f = wallettransaction;
        this.f44990g = runnable;
        RectF a10 = a(m7Var, viewGroup);
        this.f44996n = a10;
        pa paVar = new pa(this, viewGroup.getContext());
        this.h = paVar;
        paVar.setClipChildren(false);
        paVar.setClipToPadding(false);
        paVar.setClickable(true);
        m7 m7Var2 = new m7(60, viewGroup.getContext(), true);
        this.f44991i = m7Var2;
        m7Var2.setContinuousRotation(540.0f);
        m7Var2.f(m7Var);
        m7Var2.setAlpha(0.0f);
        paVar.addView(m7Var2, c8.ma.e(60, 60, 51));
        viewGroup.addView(paVar, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        m7Var2.l(new Runnable(this) {
            public final ra f44767b;

            {
                this.f44767b = this;
            }

            @Override
            public final void run() {
                f4 f4Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        ra raVar = this.f44767b;
                        m7 m7Var22 = raVar.d;
                        ViewGroup viewGroup2 = raVar.f44986b;
                        AnimatorSet animatorSet2 = raVar.f44995m;
                        m7 m7Var3 = raVar.f44991i;
                        RectF rectF = raVar.f44997o;
                        RectF rectF2 = raVar.f44996n;
                        if (!raVar.f45001s && !raVar.f45000r) {
                            raVar.e();
                            raVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            n6 n6Var2 = raVar.f44988e;
                            TL_wallet.walletTransaction wallettransaction3 = raVar.f44989f;
                            h51 h51Var = n6Var2.f44685u0[0];
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
                                f4 f4Var3 = raVar.f44998p;
                                if (f4Var3 != f4Var2) {
                                    if (f4Var3 != null) {
                                        f4Var3.g(false);
                                    }
                                    raVar.f44998p = f4Var2;
                                    f4Var2.g(true);
                                }
                                m7 pendingDiamond = raVar.f44998p.getPendingDiamond();
                                if (raVar.f44999q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !raVar.f44998p.isLayoutRequested()) {
                                    rectF.set(raVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        raVar.f45000r = true;
                                        m7Var3.f(m7Var22);
                                        m7Var3.setAlpha(1.0f);
                                        m7Var22.setAlpha(0.0f);
                                        raVar.f44992j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - raVar.f45002t <= 450 && viewGroup2.isAttachedToWindow()) {
                                raVar.h.postOnAnimation(raVar.f45003u);
                                return;
                            }
                            raVar.f45000r = true;
                            m7Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f44767b.f44999q = true;
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
        bi.g6 g6Var = n6Var.f34683a;
        if (g6Var != null) {
            g6Var.C0();
            n6Var.f34683a.f35795f3.h1(0, 0);
            h51 h51Var = n6Var.f44685u0[0];
            if (h51Var != null) {
                c51 c51Var = h51Var.f35796g3;
                h51Var.C0();
                c51Var.O(false);
                for (int i7 = 0; i7 < c51Var.E.size(); i7++) {
                    o41 G = c51Var.G(i7);
                    if (G != null) {
                        Object obj = G.H;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i10 = d4.f44073b;
                            if ((wallettransaction2 instanceof c4 ? ((c4) wallettransaction2).f44027a : wallettransaction2) == wallettransaction || u0.t0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                h51Var.f35795f3.h1(i7, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f45003u);
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
        if (this.f45001s) {
            return;
        }
        this.f45001s = true;
        oa oaVar = this.f45003u;
        pa paVar = this.h;
        paVar.removeCallbacks(oaVar);
        m7 m7Var = this.f44991i;
        m7Var.l(null);
        f4 f4Var = this.f44998p;
        if (f4Var != null && (wallettransaction = f4Var.S) != null && d4.j(wallettransaction, this.f44989f)) {
            m7 pendingDiamond = this.f44998p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(m7Var);
            }
            this.f44998p.g(false);
            RectF rectF = this.f44997o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f44996n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f24145p;
                f4 f4Var2 = this.f44998p;
                f4Var2.e();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                f4Var2.I = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.f56364m = hVar;
                f4Var2.I.f(0.001f);
                f4Var2.I.f56354a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                f4Var2.I.b(new y3(f4Var2, 0));
                f4Var2.I.h();
            }
        }
        m7Var.setPaused(true);
        paVar.removeView(m7Var);
        paVar.setClickable(false);
        this.d.setAlpha(this.f44994l);
        ui uiVar = this.f44985a;
        if (uiVar == null) {
            this.f44987c.setTranslationY(0.0f);
        } else {
            uiVar.y1(1.0f);
        }
        ViewGroup viewGroup = this.f44986b;
        if (uiVar != null && this.f44992j.d()) {
            n6 n6Var = this.f44988e;
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
        this.f44990g.run();
        org.telegram.messenger.g0.h3(new u4(14, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        pa paVar = this.h;
        float f13 = L / 2.0f;
        m7 m7Var = this.f44991i;
        m7Var.setTranslationX((f10 - paVar.getLeft()) - f13);
        m7Var.setTranslationY((f11 - paVar.getTop()) - f13);
        float f14 = f12 / L;
        m7Var.setScaleX(f14);
        m7Var.setScaleY(f14);
    }

    public final RectF d(m7 m7Var) {
        ui uiVar = this.f44985a;
        ViewGroup viewGroup = this.f44986b;
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
        RectF rectF = this.f44996n;
        ViewGroup viewGroup = this.f44986b;
        m7 m7Var = this.d;
        ui uiVar = this.f44985a;
        if (uiVar == null) {
            f(m7Var, this.f44987c, viewGroup, rectF);
        } else if (m7Var.isAttachedToWindow() && m7Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(m7Var, viewGroup));
            rectF.offset(0.0f, uiVar.f40402j4 - uiVar.f40436t2);
        }
    }
}
