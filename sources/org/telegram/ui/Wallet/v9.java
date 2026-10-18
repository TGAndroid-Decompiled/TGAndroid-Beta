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
public final class v9 {
    public final ti f35004a;
    public final ViewGroup f35005b;
    public final View f35006c;
    public final m6 d;
    public final n5 e;
    public final TL_wallet.walletTransaction f35007f;
    public final Runnable f35008g;
    public final t9 h;
    public final m6 f35009i;
    public final k9 f35010j = new k9();
    public final PathInterpolator f35011k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35012l;
    public final AnimatorSet f35013m;
    public final RectF f35014n;
    public final RectF f35015o;
    public f3 f35016p;
    public boolean f35017q;
    public boolean f35018r;
    public boolean f35019s;
    public final long f35020t;
    public final s9 f35021u;

    public v9(ViewGroup viewGroup, View view, m6 m6Var, n5 n5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35013m = animatorSet;
        this.f35015o = new RectF();
        this.f35020t = SystemClock.uptimeMillis();
        this.f35021u = new Runnable(this) {
            public final v9 f34866b;

            {
                this.f34866b = this;
            }

            @Override
            public final void run() {
                f3 f3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        v9 v9Var = this.f34866b;
                        m6 m6Var2 = v9Var.d;
                        ViewGroup viewGroup2 = v9Var.f35005b;
                        AnimatorSet animatorSet2 = v9Var.f35013m;
                        m6 m6Var3 = v9Var.f35009i;
                        RectF rectF = v9Var.f35015o;
                        RectF rectF2 = v9Var.f35014n;
                        if (!v9Var.f35019s && !v9Var.f35018r) {
                            v9Var.e();
                            v9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            n5 n5Var2 = v9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = v9Var.f35007f;
                            a71 a71Var = n5Var2.f34596q0[0];
                            f3 f3Var2 = null;
                            if (a71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < a71Var.getChildCount()) {
                                        View childAt = a71Var.getChildAt(i10);
                                        if ((childAt instanceof f3) && (wallettransaction2 = (f3Var = (f3) childAt).R) != null && d3.a(wallettransaction2, wallettransaction3)) {
                                            f3Var2 = f3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (f3Var2 != null && f3Var2.getWidth() > 0) {
                                f3 f3Var3 = v9Var.f35016p;
                                if (f3Var3 != f3Var2) {
                                    if (f3Var3 != null) {
                                        f3Var3.g(false);
                                    }
                                    v9Var.f35016p = f3Var2;
                                    f3Var2.g(true);
                                }
                                m6 pendingDiamond = v9Var.f35016p.getPendingDiamond();
                                if (v9Var.f35017q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v9Var.f35016p.isLayoutRequested()) {
                                    rectF.set(v9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v9Var.f35018r = true;
                                        m6Var3.f(m6Var2);
                                        m6Var3.setAlpha(1.0f);
                                        m6Var2.setAlpha(0.0f);
                                        v9Var.f35010j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v9Var.f35020t <= 450 && viewGroup2.isAttachedToWindow()) {
                                v9Var.h.postOnAnimation(v9Var.f35021u);
                                return;
                            }
                            v9Var.f35018r = true;
                            m6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f34866b.f35017q = true;
                        return;
                }
            }
        };
        this.f35004a = tiVar;
        this.f35005b = viewGroup;
        this.f35006c = view;
        this.d = m6Var;
        this.f35012l = m6Var.getAlpha();
        this.e = n5Var;
        this.f35007f = wallettransaction;
        this.f35008g = runnable;
        RectF a2 = a(viewGroup, m6Var);
        this.f35014n = a2;
        t9 t9Var = new t9(this, viewGroup.getContext());
        this.h = t9Var;
        t9Var.setClipChildren(false);
        t9Var.setClipToPadding(false);
        t9Var.setClickable(true);
        m6 m6Var2 = new m6(60, viewGroup.getContext(), true);
        this.f35009i = m6Var2;
        m6Var2.setContinuousRotation(540.0f);
        m6Var2.f(m6Var);
        m6Var2.setAlpha(0.0f);
        t9Var.addView(m6Var2, w7.z5.e(60, 60, 51));
        viewGroup.addView(t9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        m6Var2.l(new Runnable(this) {
            public final v9 f34866b;

            {
                this.f34866b = this;
            }

            @Override
            public final void run() {
                f3 f3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        v9 v9Var = this.f34866b;
                        m6 m6Var22 = v9Var.d;
                        ViewGroup viewGroup2 = v9Var.f35005b;
                        AnimatorSet animatorSet2 = v9Var.f35013m;
                        m6 m6Var3 = v9Var.f35009i;
                        RectF rectF = v9Var.f35015o;
                        RectF rectF2 = v9Var.f35014n;
                        if (!v9Var.f35019s && !v9Var.f35018r) {
                            v9Var.e();
                            v9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            n5 n5Var2 = v9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = v9Var.f35007f;
                            a71 a71Var = n5Var2.f34596q0[0];
                            f3 f3Var2 = null;
                            if (a71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < a71Var.getChildCount()) {
                                        View childAt = a71Var.getChildAt(i10);
                                        if ((childAt instanceof f3) && (wallettransaction2 = (f3Var = (f3) childAt).R) != null && d3.a(wallettransaction2, wallettransaction3)) {
                                            f3Var2 = f3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (f3Var2 != null && f3Var2.getWidth() > 0) {
                                f3 f3Var3 = v9Var.f35016p;
                                if (f3Var3 != f3Var2) {
                                    if (f3Var3 != null) {
                                        f3Var3.g(false);
                                    }
                                    v9Var.f35016p = f3Var2;
                                    f3Var2.g(true);
                                }
                                m6 pendingDiamond = v9Var.f35016p.getPendingDiamond();
                                if (v9Var.f35017q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v9Var.f35016p.isLayoutRequested()) {
                                    rectF.set(v9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v9Var.f35018r = true;
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(1.0f);
                                        m6Var22.setAlpha(0.0f);
                                        v9Var.f35010j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v9Var.f35020t <= 450 && viewGroup2.isAttachedToWindow()) {
                                v9Var.h.postOnAnimation(v9Var.f35021u);
                                return;
                            }
                            v9Var.f35018r = true;
                            m6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f34866b.f35017q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new v2(this, 11));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new u9(this, tiVar, m6Var));
        n5Var.I0();
        n5Var.Q0(false);
        u61 u61Var = n5Var.f31190a;
        if (u61Var != null) {
            u61Var.B0();
            n5Var.f31190a.V2.h1(0, 0);
            a71 a71Var = n5Var.f34596q0[0];
            if (a71Var != null) {
                s61 s61Var = a71Var.W2;
                a71Var.B0();
                s61Var.N(false);
                for (int i10 = 0; i10 < s61Var.f30204x.size(); i10++) {
                    f61 G = s61Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = d3.f34083a;
                            if ((wallettransaction2 instanceof c3 ? ((c3) wallettransaction2).f34043a : wallettransaction2) == wallettransaction || m0.f0((TL_wallet.walletTransaction) obj, wallettransaction)) {
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
        this.h.post(this.f35021u);
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
        if (this.f35019s) {
            return;
        }
        this.f35019s = true;
        s9 s9Var = this.f35021u;
        t9 t9Var = this.h;
        t9Var.removeCallbacks(s9Var);
        m6 m6Var = this.f35009i;
        m6Var.l(null);
        f3 f3Var = this.f35016p;
        if (f3Var != null && (wallettransaction = f3Var.R) != null && d3.a(wallettransaction, this.f35007f)) {
            m6 pendingDiamond = this.f35016p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(m6Var);
            }
            this.f35016p.g(false);
            RectF rectF = this.f35015o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f35014n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                f3 f3Var2 = this.f35016p;
                f3Var2.e();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                f3Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.f17558u = lVar;
                f3Var2.H.e(0.001f);
                f3Var2.H.f17548a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                f3Var2.H.b(new a3(f3Var2, 0));
                f3Var2.H.h();
            }
        }
        m6Var.setPaused(true);
        t9Var.removeView(m6Var);
        t9Var.setClickable(false);
        this.d.setAlpha(this.f35012l);
        ti tiVar = this.f35004a;
        if (tiVar == null) {
            this.f35006c.setTranslationY(0.0f);
        } else {
            tiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35005b;
        if (tiVar != null && this.f35010j.d()) {
            n5 n5Var = this.e;
            if (n5Var.getParentLayout() != null) {
                ViewGroup view = n5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(t9Var);
                    t9Var.setTranslationX(iArr[0] - iArr2[0]);
                    t9Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(t9Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f35008g.run();
        AndroidUtilities.runOnUIThread(new v3(17, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        t9 t9Var = this.h;
        float f12 = dp / 2.0f;
        m6 m6Var = this.f35009i;
        m6Var.setTranslationX((f7 - t9Var.getLeft()) - f12);
        m6Var.setTranslationY((f10 - t9Var.getTop()) - f12);
        float f13 = f11 / dp;
        m6Var.setScaleX(f13);
        m6Var.setScaleY(f13);
    }

    public final RectF d(m6 m6Var) {
        ti tiVar = this.f35004a;
        ViewGroup viewGroup = this.f35005b;
        if (tiVar == null) {
            return a(viewGroup, m6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) m6Var.getRootView();
        RectF a2 = a(viewGroup2, m6Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void e() {
        RectF rectF = this.f35014n;
        ViewGroup viewGroup = this.f35005b;
        m6 m6Var = this.d;
        ti tiVar = this.f35004a;
        if (tiVar == null) {
            f(m6Var, this.f35006c, viewGroup, rectF);
        } else if (m6Var.isAttachedToWindow() && m6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, m6Var));
            rectF.offset(0.0f, tiVar.f30602o2 - tiVar.f30635y0);
        }
    }
}
