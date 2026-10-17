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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u61;
public final class x9 {
    public final ti f35139a;
    public final ViewGroup f35140b;
    public final View f35141c;
    public final p6 d;
    public final l5 e;
    public final TL_wallet.walletTransaction f35142f;
    public final Runnable f35143g;
    public final v9 h;
    public final p6 f35144i;
    public final n9 f35145j = new n9();
    public final PathInterpolator f35146k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35147l;
    public final AnimatorSet f35148m;
    public final RectF f35149n;
    public final RectF f35150o;
    public d3 f35151p;
    public boolean f35152q;
    public boolean f35153r;
    public boolean f35154s;
    public final long f35155t;
    public final u9 f35156u;

    public x9(ViewGroup viewGroup, View view, p6 p6Var, l5 l5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35148m = animatorSet;
        this.f35150o = new RectF();
        this.f35155t = SystemClock.uptimeMillis();
        this.f35156u = new Runnable(this) {
            public final x9 f34943b;

            {
                this.f34943b = this;
            }

            @Override
            public final void run() {
                d3 d3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        x9 x9Var = this.f34943b;
                        p6 p6Var2 = x9Var.d;
                        ViewGroup viewGroup2 = x9Var.f35140b;
                        AnimatorSet animatorSet2 = x9Var.f35148m;
                        p6 p6Var3 = x9Var.f35144i;
                        RectF rectF = x9Var.f35150o;
                        RectF rectF2 = x9Var.f35149n;
                        if (!x9Var.f35154s && !x9Var.f35153r) {
                            x9Var.e();
                            x9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            l5 l5Var2 = x9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = x9Var.f35142f;
                            a71 a71Var = l5Var2.f34501s0[0];
                            d3 d3Var2 = null;
                            if (a71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < a71Var.getChildCount()) {
                                        View childAt = a71Var.getChildAt(i10);
                                        if ((childAt instanceof d3) && (wallettransaction2 = (d3Var = (d3) childAt).R) != null && b3.a(wallettransaction2, wallettransaction3)) {
                                            d3Var2 = d3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (d3Var2 != null && d3Var2.getWidth() > 0) {
                                d3 d3Var3 = x9Var.f35151p;
                                if (d3Var3 != d3Var2) {
                                    if (d3Var3 != null) {
                                        d3Var3.g(false);
                                    }
                                    x9Var.f35151p = d3Var2;
                                    d3Var2.g(true);
                                }
                                p6 pendingDiamond = x9Var.f35151p.getPendingDiamond();
                                if (x9Var.f35152q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !x9Var.f35151p.isLayoutRequested()) {
                                    rectF.set(x9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        x9Var.f35153r = true;
                                        p6Var3.f(p6Var2);
                                        p6Var3.setAlpha(1.0f);
                                        p6Var2.setAlpha(0.0f);
                                        x9Var.f35145j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - x9Var.f35155t <= 450 && viewGroup2.isAttachedToWindow()) {
                                x9Var.h.postOnAnimation(x9Var.f35156u);
                                return;
                            }
                            x9Var.f35153r = true;
                            p6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f34943b.f35152q = true;
                        return;
                }
            }
        };
        this.f35139a = tiVar;
        this.f35140b = viewGroup;
        this.f35141c = view;
        this.d = p6Var;
        this.f35147l = p6Var.getAlpha();
        this.e = l5Var;
        this.f35142f = wallettransaction;
        this.f35143g = runnable;
        RectF a2 = a(viewGroup, p6Var);
        this.f35149n = a2;
        v9 v9Var = new v9(this, viewGroup.getContext());
        this.h = v9Var;
        v9Var.setClipChildren(false);
        v9Var.setClipToPadding(false);
        v9Var.setClickable(true);
        p6 p6Var2 = new p6(60, viewGroup.getContext(), false);
        this.f35144i = p6Var2;
        p6Var2.setContinuousRotation(540.0f);
        p6Var2.f(p6Var);
        p6Var2.setAlpha(0.0f);
        v9Var.addView(p6Var2, w7.z5.e(60, 60, 51));
        viewGroup.addView(v9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        p6Var2.l(new Runnable(this) {
            public final x9 f34943b;

            {
                this.f34943b = this;
            }

            @Override
            public final void run() {
                d3 d3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        x9 x9Var = this.f34943b;
                        p6 p6Var22 = x9Var.d;
                        ViewGroup viewGroup2 = x9Var.f35140b;
                        AnimatorSet animatorSet2 = x9Var.f35148m;
                        p6 p6Var3 = x9Var.f35144i;
                        RectF rectF = x9Var.f35150o;
                        RectF rectF2 = x9Var.f35149n;
                        if (!x9Var.f35154s && !x9Var.f35153r) {
                            x9Var.e();
                            x9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            l5 l5Var2 = x9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = x9Var.f35142f;
                            a71 a71Var = l5Var2.f34501s0[0];
                            d3 d3Var2 = null;
                            if (a71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < a71Var.getChildCount()) {
                                        View childAt = a71Var.getChildAt(i10);
                                        if ((childAt instanceof d3) && (wallettransaction2 = (d3Var = (d3) childAt).R) != null && b3.a(wallettransaction2, wallettransaction3)) {
                                            d3Var2 = d3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (d3Var2 != null && d3Var2.getWidth() > 0) {
                                d3 d3Var3 = x9Var.f35151p;
                                if (d3Var3 != d3Var2) {
                                    if (d3Var3 != null) {
                                        d3Var3.g(false);
                                    }
                                    x9Var.f35151p = d3Var2;
                                    d3Var2.g(true);
                                }
                                p6 pendingDiamond = x9Var.f35151p.getPendingDiamond();
                                if (x9Var.f35152q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !x9Var.f35151p.isLayoutRequested()) {
                                    rectF.set(x9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        x9Var.f35153r = true;
                                        p6Var3.f(p6Var22);
                                        p6Var3.setAlpha(1.0f);
                                        p6Var22.setAlpha(0.0f);
                                        x9Var.f35145j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - x9Var.f35155t <= 450 && viewGroup2.isAttachedToWindow()) {
                                x9Var.h.postOnAnimation(x9Var.f35156u);
                                return;
                            }
                            x9Var.f35153r = true;
                            p6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f34943b.f35152q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new u2(this, 11));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new w9(this, tiVar, p6Var));
        l5Var.I0();
        l5Var.Q0(false);
        u61 u61Var = l5Var.f31190a;
        if (u61Var != null) {
            u61Var.B0();
            l5Var.f31190a.V2.h1(0, 0);
            a71 a71Var = l5Var.f34501s0[0];
            if (a71Var != null) {
                s61 s61Var = a71Var.W2;
                a71Var.B0();
                s61Var.N(false);
                for (int i10 = 0; i10 < s61Var.f30203x.size(); i10++) {
                    f61 G = s61Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = b3.f34034a;
                            if ((wallettransaction2 instanceof a3 ? ((a3) wallettransaction2).f33973a : wallettransaction2) == wallettransaction || m0.f0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                a71Var.V2.h1(i10, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f35156u);
    }

    public static RectF a(ViewGroup viewGroup, View view) {
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
        if (this.f35154s) {
            return;
        }
        this.f35154s = true;
        u9 u9Var = this.f35156u;
        v9 v9Var = this.h;
        v9Var.removeCallbacks(u9Var);
        p6 p6Var = this.f35144i;
        p6Var.l(null);
        d3 d3Var = this.f35151p;
        if (d3Var != null && (wallettransaction = d3Var.R) != null && b3.a(wallettransaction, this.f35142f)) {
            p6 pendingDiamond = this.f35151p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(p6Var);
            }
            this.f35151p.g(false);
            RectF rectF = this.f35150o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f35149n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                d3 d3Var2 = this.f35151p;
                d3Var2.e();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                d3Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.f17555u = lVar;
                d3Var2.H.e(0.001f);
                d3Var2.H.f17545a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                d3Var2.H.b(new y2(d3Var2, 0));
                d3Var2.H.h();
            }
        }
        p6Var.setPaused(true);
        v9Var.removeView(p6Var);
        v9Var.setClickable(false);
        this.d.setAlpha(this.f35147l);
        ti tiVar = this.f35139a;
        if (tiVar == null) {
            this.f35141c.setTranslationY(0.0f);
        } else {
            tiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35140b;
        if (tiVar != null && this.f35145j.d()) {
            l5 l5Var = this.e;
            if (l5Var.getParentLayout() != null) {
                ViewGroup view = l5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(v9Var);
                    v9Var.setTranslationX(iArr[0] - iArr2[0]);
                    v9Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(v9Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f35143g.run();
        AndroidUtilities.runOnUIThread(new t3(16, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        v9 v9Var = this.h;
        float f12 = dp / 2.0f;
        p6 p6Var = this.f35144i;
        p6Var.setTranslationX((f7 - v9Var.getLeft()) - f12);
        p6Var.setTranslationY((f10 - v9Var.getTop()) - f12);
        float f13 = f11 / dp;
        p6Var.setScaleX(f13);
        p6Var.setScaleY(f13);
    }

    public final RectF d(p6 p6Var) {
        ti tiVar = this.f35139a;
        ViewGroup viewGroup = this.f35140b;
        if (tiVar == null) {
            return a(viewGroup, p6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) p6Var.getRootView();
        RectF a2 = a(viewGroup2, p6Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void e() {
        RectF rectF = this.f35149n;
        ViewGroup viewGroup = this.f35140b;
        p6 p6Var = this.d;
        ti tiVar = this.f35139a;
        if (tiVar == null) {
            f(p6Var, this.f35141c, viewGroup, rectF);
        } else if (p6Var.isAttachedToWindow() && p6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, p6Var));
            rectF.offset(0.0f, tiVar.f30602o2 - tiVar.f30635y0);
        }
    }
}
