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
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ti;
public final class sa {
    public final ti f45117a;
    public final ViewGroup f45118b;
    public final View f45119c;
    public final n7 d;
    public final o6 f45120e;
    public final TL_wallet.walletTransaction f45121f;
    public final Runnable f45122g;
    public final qa h;
    public final n7 f45123i;
    public final ga f45124j = new ga();
    public final PathInterpolator f45125k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f45126l;
    public final AnimatorSet f45127m;
    public final RectF f45128n;
    public final RectF f45129o;
    public g4 f45130p;
    public boolean f45131q;
    public boolean f45132r;
    public boolean f45133s;
    public final long f45134t;
    public final pa f45135u;

    public sa(ViewGroup viewGroup, View view, n7 n7Var, o6 o6Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f45127m = animatorSet;
        this.f45129o = new RectF();
        this.f45134t = SystemClock.uptimeMillis();
        this.f45135u = new Runnable(this) {
            public final sa f44899b;

            {
                this.f44899b = this;
            }

            @Override
            public final void run() {
                g4 g4Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        sa saVar = this.f44899b;
                        n7 n7Var2 = saVar.d;
                        ViewGroup viewGroup2 = saVar.f45118b;
                        AnimatorSet animatorSet2 = saVar.f45127m;
                        n7 n7Var3 = saVar.f45123i;
                        RectF rectF = saVar.f45129o;
                        RectF rectF2 = saVar.f45128n;
                        if (!saVar.f45133s && !saVar.f45132r) {
                            saVar.e();
                            saVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            o6 o6Var2 = saVar.f45120e;
                            TL_wallet.walletTransaction wallettransaction3 = saVar.f45121f;
                            g51 g51Var = o6Var2.f44817u0[0];
                            g4 g4Var2 = null;
                            if (g51Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < g51Var.getChildCount()) {
                                        View childAt = g51Var.getChildAt(i7);
                                        if ((childAt instanceof g4) && (wallettransaction2 = (g4Var = (g4) childAt).S) != null && e4.j(wallettransaction2, wallettransaction3)) {
                                            g4Var2 = g4Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (g4Var2 != null && g4Var2.getWidth() > 0) {
                                g4 g4Var3 = saVar.f45130p;
                                if (g4Var3 != g4Var2) {
                                    if (g4Var3 != null) {
                                        g4Var3.g(false);
                                    }
                                    saVar.f45130p = g4Var2;
                                    g4Var2.g(true);
                                }
                                n7 pendingDiamond = saVar.f45130p.getPendingDiamond();
                                if (saVar.f45131q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !saVar.f45130p.isLayoutRequested()) {
                                    rectF.set(saVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        saVar.f45132r = true;
                                        n7Var3.f(n7Var2);
                                        n7Var3.setAlpha(1.0f);
                                        n7Var2.setAlpha(0.0f);
                                        saVar.f45124j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - saVar.f45134t <= 450 && viewGroup2.isAttachedToWindow()) {
                                saVar.h.postOnAnimation(saVar.f45135u);
                                return;
                            }
                            saVar.f45132r = true;
                            n7Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f44899b.f45131q = true;
                        return;
                }
            }
        };
        this.f45117a = tiVar;
        this.f45118b = viewGroup;
        this.f45119c = view;
        this.d = n7Var;
        this.f45126l = n7Var.getAlpha();
        this.f45120e = o6Var;
        this.f45121f = wallettransaction;
        this.f45122g = runnable;
        RectF a10 = a(n7Var, viewGroup);
        this.f45128n = a10;
        qa qaVar = new qa(this, viewGroup.getContext());
        this.h = qaVar;
        qaVar.setClipChildren(false);
        qaVar.setClipToPadding(false);
        qaVar.setClickable(true);
        n7 n7Var2 = new n7(60, viewGroup.getContext(), true);
        this.f45123i = n7Var2;
        n7Var2.setContinuousRotation(540.0f);
        n7Var2.f(n7Var);
        n7Var2.setAlpha(0.0f);
        qaVar.addView(n7Var2, c8.na.e(60, 60, 51));
        viewGroup.addView(qaVar, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        n7Var2.l(new Runnable(this) {
            public final sa f44899b;

            {
                this.f44899b = this;
            }

            @Override
            public final void run() {
                g4 g4Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        sa saVar = this.f44899b;
                        n7 n7Var22 = saVar.d;
                        ViewGroup viewGroup2 = saVar.f45118b;
                        AnimatorSet animatorSet2 = saVar.f45127m;
                        n7 n7Var3 = saVar.f45123i;
                        RectF rectF = saVar.f45129o;
                        RectF rectF2 = saVar.f45128n;
                        if (!saVar.f45133s && !saVar.f45132r) {
                            saVar.e();
                            saVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            o6 o6Var2 = saVar.f45120e;
                            TL_wallet.walletTransaction wallettransaction3 = saVar.f45121f;
                            g51 g51Var = o6Var2.f44817u0[0];
                            g4 g4Var2 = null;
                            if (g51Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < g51Var.getChildCount()) {
                                        View childAt = g51Var.getChildAt(i7);
                                        if ((childAt instanceof g4) && (wallettransaction2 = (g4Var = (g4) childAt).S) != null && e4.j(wallettransaction2, wallettransaction3)) {
                                            g4Var2 = g4Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (g4Var2 != null && g4Var2.getWidth() > 0) {
                                g4 g4Var3 = saVar.f45130p;
                                if (g4Var3 != g4Var2) {
                                    if (g4Var3 != null) {
                                        g4Var3.g(false);
                                    }
                                    saVar.f45130p = g4Var2;
                                    g4Var2.g(true);
                                }
                                n7 pendingDiamond = saVar.f45130p.getPendingDiamond();
                                if (saVar.f45131q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !saVar.f45130p.isLayoutRequested()) {
                                    rectF.set(saVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        saVar.f45132r = true;
                                        n7Var3.f(n7Var22);
                                        n7Var3.setAlpha(1.0f);
                                        n7Var22.setAlpha(0.0f);
                                        saVar.f45124j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - saVar.f45134t <= 450 && viewGroup2.isAttachedToWindow()) {
                                saVar.h.postOnAnimation(saVar.f45135u);
                                return;
                            }
                            saVar.f45132r = true;
                            n7Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f44899b.f45131q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new a4(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new ra(this, tiVar, n7Var));
        o6Var.T0();
        o6Var.c1(false);
        bi.i6 i6Var = o6Var.f34213a;
        if (i6Var != null) {
            i6Var.C0();
            o6Var.f34213a.f35322f3.h1(0, 0);
            g51 g51Var = o6Var.f44817u0[0];
            if (g51Var != null) {
                b51 b51Var = g51Var.f35323g3;
                g51Var.C0();
                b51Var.O(false);
                for (int i7 = 0; i7 < b51Var.E.size(); i7++) {
                    n41 G = b51Var.G(i7);
                    if (G != null) {
                        Object obj = G.H;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i10 = e4.f44204b;
                            if ((wallettransaction2 instanceof d4 ? ((d4) wallettransaction2).f44164a : wallettransaction2) == wallettransaction || v0.t0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                g51Var.f35322f3.h1(i7, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f45135u);
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
        if (this.f45133s) {
            return;
        }
        this.f45133s = true;
        pa paVar = this.f45135u;
        qa qaVar = this.h;
        qaVar.removeCallbacks(paVar);
        n7 n7Var = this.f45123i;
        n7Var.l(null);
        g4 g4Var = this.f45130p;
        if (g4Var != null && (wallettransaction = g4Var.S) != null && e4.j(wallettransaction, this.f45121f)) {
            n7 pendingDiamond = this.f45130p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(n7Var);
            }
            this.f45130p.g(false);
            RectF rectF = this.f45129o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f45128n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f24225p;
                g4 g4Var2 = this.f45130p;
                g4Var2.e();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                g4Var2.I = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.f56446m = hVar;
                g4Var2.I.f(0.001f);
                g4Var2.I.f56436a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                g4Var2.I.b(new z3(g4Var2, 0));
                g4Var2.I.h();
            }
        }
        n7Var.setPaused(true);
        qaVar.removeView(n7Var);
        qaVar.setClickable(false);
        this.d.setAlpha(this.f45126l);
        ti tiVar = this.f45117a;
        if (tiVar == null) {
            this.f45119c.setTranslationY(0.0f);
        } else {
            tiVar.y1(1.0f);
        }
        ViewGroup viewGroup = this.f45118b;
        if (tiVar != null && this.f45124j.d()) {
            o6 o6Var = this.f45120e;
            if (o6Var.getParentLayout() != null) {
                ViewGroup view = o6Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(qaVar);
                    qaVar.setTranslationX(iArr[0] - iArr2[0]);
                    qaVar.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(qaVar, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f45122g.run();
        org.telegram.messenger.g0.h3(new r(18, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        qa qaVar = this.h;
        float f13 = L / 2.0f;
        n7 n7Var = this.f45123i;
        n7Var.setTranslationX((f10 - qaVar.getLeft()) - f13);
        n7Var.setTranslationY((f11 - qaVar.getTop()) - f13);
        float f14 = f12 / L;
        n7Var.setScaleX(f14);
        n7Var.setScaleY(f14);
    }

    public final RectF d(n7 n7Var) {
        ti tiVar = this.f45117a;
        ViewGroup viewGroup = this.f45118b;
        if (tiVar == null) {
            return a(n7Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) n7Var.getRootView();
        RectF a10 = a(n7Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void e() {
        RectF rectF = this.f45128n;
        ViewGroup viewGroup = this.f45118b;
        n7 n7Var = this.d;
        ti tiVar = this.f45117a;
        if (tiVar == null) {
            f(n7Var, this.f45119c, viewGroup, rectF);
        } else if (n7Var.isAttachedToWindow() && n7Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(n7Var, viewGroup));
            rectF.offset(0.0f, tiVar.f39983j4 - tiVar.f40017t2);
        }
    }
}
