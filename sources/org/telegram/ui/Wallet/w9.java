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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ri;
public final class w9 {
    public final ri f35361a;
    public final ViewGroup f35362b;
    public final View f35363c;
    public final m6 d;
    public final o5 e;
    public final TL_wallet.walletTransaction f35364f;
    public final Runnable f35365g;
    public final u9 h;
    public final m6 f35366i;
    public final l9 f35367j = new l9();
    public final PathInterpolator f35368k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35369l;
    public final AnimatorSet f35370m;
    public final RectF f35371n;
    public final RectF f35372o;
    public f3 f35373p;
    public boolean f35374q;
    public boolean f35375r;
    public boolean f35376s;
    public final long f35377t;
    public final t9 f35378u;

    public w9(ViewGroup viewGroup, View view, m6 m6Var, o5 o5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ri riVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35370m = animatorSet;
        this.f35372o = new RectF();
        this.f35377t = SystemClock.uptimeMillis();
        this.f35378u = new Runnable(this) {
            public final w9 f35282b;

            {
                this.f35282b = this;
            }

            @Override
            public final void run() {
                f3 f3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        w9 w9Var = this.f35282b;
                        m6 m6Var2 = w9Var.d;
                        ViewGroup viewGroup2 = w9Var.f35362b;
                        AnimatorSet animatorSet2 = w9Var.f35370m;
                        m6 m6Var3 = w9Var.f35366i;
                        RectF rectF = w9Var.f35372o;
                        RectF rectF2 = w9Var.f35371n;
                        if (!w9Var.f35376s && !w9Var.f35375r) {
                            w9Var.e();
                            w9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            o5 o5Var2 = w9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = w9Var.f35364f;
                            i71 i71Var = o5Var2.f34952q0[0];
                            f3 f3Var2 = null;
                            if (i71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < i71Var.getChildCount()) {
                                        View childAt = i71Var.getChildAt(i10);
                                        if ((childAt instanceof f3) && (wallettransaction2 = (f3Var = (f3) childAt).R) != null && d3.a(wallettransaction2, wallettransaction3)) {
                                            f3Var2 = f3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (f3Var2 != null && f3Var2.getWidth() > 0) {
                                f3 f3Var3 = w9Var.f35373p;
                                if (f3Var3 != f3Var2) {
                                    if (f3Var3 != null) {
                                        f3Var3.f(false);
                                    }
                                    w9Var.f35373p = f3Var2;
                                    f3Var2.f(true);
                                }
                                m6 pendingDiamond = w9Var.f35373p.getPendingDiamond();
                                if (w9Var.f35374q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !w9Var.f35373p.isLayoutRequested()) {
                                    rectF.set(w9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        w9Var.f35375r = true;
                                        m6Var3.f(m6Var2);
                                        m6Var3.setAlpha(1.0f);
                                        m6Var2.setAlpha(0.0f);
                                        w9Var.f35367j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - w9Var.f35377t <= 450 && viewGroup2.isAttachedToWindow()) {
                                w9Var.h.postOnAnimation(w9Var.f35378u);
                                return;
                            }
                            w9Var.f35375r = true;
                            m6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35282b.f35374q = true;
                        return;
                }
            }
        };
        this.f35361a = riVar;
        this.f35362b = viewGroup;
        this.f35363c = view;
        this.d = m6Var;
        this.f35369l = m6Var.getAlpha();
        this.e = o5Var;
        this.f35364f = wallettransaction;
        this.f35365g = runnable;
        RectF a2 = a(viewGroup, m6Var);
        this.f35371n = a2;
        u9 u9Var = new u9(this, viewGroup.getContext());
        this.h = u9Var;
        u9Var.setClipChildren(false);
        u9Var.setClipToPadding(false);
        u9Var.setClickable(true);
        m6 m6Var2 = new m6(60, viewGroup.getContext(), true);
        this.f35366i = m6Var2;
        m6Var2.setContinuousRotation(540.0f);
        m6Var2.f(m6Var);
        m6Var2.setAlpha(0.0f);
        u9Var.addView(m6Var2, w7.z5.e(60, 60, 51));
        viewGroup.addView(u9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        m6Var2.l(new Runnable(this) {
            public final w9 f35282b;

            {
                this.f35282b = this;
            }

            @Override
            public final void run() {
                f3 f3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        w9 w9Var = this.f35282b;
                        m6 m6Var22 = w9Var.d;
                        ViewGroup viewGroup2 = w9Var.f35362b;
                        AnimatorSet animatorSet2 = w9Var.f35370m;
                        m6 m6Var3 = w9Var.f35366i;
                        RectF rectF = w9Var.f35372o;
                        RectF rectF2 = w9Var.f35371n;
                        if (!w9Var.f35376s && !w9Var.f35375r) {
                            w9Var.e();
                            w9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            o5 o5Var2 = w9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = w9Var.f35364f;
                            i71 i71Var = o5Var2.f34952q0[0];
                            f3 f3Var2 = null;
                            if (i71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < i71Var.getChildCount()) {
                                        View childAt = i71Var.getChildAt(i10);
                                        if ((childAt instanceof f3) && (wallettransaction2 = (f3Var = (f3) childAt).R) != null && d3.a(wallettransaction2, wallettransaction3)) {
                                            f3Var2 = f3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (f3Var2 != null && f3Var2.getWidth() > 0) {
                                f3 f3Var3 = w9Var.f35373p;
                                if (f3Var3 != f3Var2) {
                                    if (f3Var3 != null) {
                                        f3Var3.f(false);
                                    }
                                    w9Var.f35373p = f3Var2;
                                    f3Var2.f(true);
                                }
                                m6 pendingDiamond = w9Var.f35373p.getPendingDiamond();
                                if (w9Var.f35374q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !w9Var.f35373p.isLayoutRequested()) {
                                    rectF.set(w9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        w9Var.f35375r = true;
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(1.0f);
                                        m6Var22.setAlpha(0.0f);
                                        w9Var.f35367j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - w9Var.f35377t <= 450 && viewGroup2.isAttachedToWindow()) {
                                w9Var.h.postOnAnimation(w9Var.f35378u);
                                return;
                            }
                            w9Var.f35375r = true;
                            m6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35282b.f35374q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new a3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new v9(this, riVar, m6Var));
        o5Var.J0();
        o5Var.S0(false);
        c71 c71Var = o5Var.f25615a;
        if (c71Var != null) {
            c71Var.B0();
            o5Var.f25615a.Y2.h1(0, 0);
            i71 i71Var = o5Var.f34952q0[0];
            if (i71Var != null) {
                a71 a71Var = i71Var.Z2;
                i71Var.B0();
                a71Var.N(false);
                for (int i10 = 0; i10 < a71Var.f24650y.size(); i10++) {
                    l61 G = a71Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = d3.f34403a;
                            if ((wallettransaction2 instanceof c3 ? ((c3) wallettransaction2).f34362a : wallettransaction2) == wallettransaction || l0.f0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                i71Var.Y2.h1(i10, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f35378u);
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
        if (this.f35376s) {
            return;
        }
        this.f35376s = true;
        t9 t9Var = this.f35378u;
        u9 u9Var = this.h;
        u9Var.removeCallbacks(t9Var);
        m6 m6Var = this.f35366i;
        m6Var.l(null);
        f3 f3Var = this.f35373p;
        if (f3Var != null && (wallettransaction = f3Var.R) != null && d3.a(wallettransaction, this.f35364f)) {
            m6 pendingDiamond = this.f35373p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(m6Var);
            }
            this.f35373p.f(false);
            RectF rectF = this.f35372o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f35371n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                f3 f3Var2 = this.f35373p;
                f3Var2.d();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                f3Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.f17622u = lVar;
                f3Var2.H.e(0.001f);
                f3Var2.H.f17612a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                f3Var2.H.b(new z2(f3Var2, 0));
                f3Var2.H.h();
            }
        }
        m6Var.setPaused(true);
        u9Var.removeView(m6Var);
        u9Var.setClickable(false);
        this.d.setAlpha(this.f35369l);
        ri riVar = this.f35361a;
        if (riVar == null) {
            this.f35363c.setTranslationY(0.0f);
        } else {
            riVar.Q1(1.0f);
        }
        ViewGroup viewGroup = this.f35362b;
        if (riVar != null && this.f35367j.d()) {
            o5 o5Var = this.e;
            if (o5Var.getParentLayout() != null) {
                ViewGroup view = o5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(u9Var);
                    u9Var.setTranslationX(iArr[0] - iArr2[0]);
                    u9Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(u9Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f35365g.run();
        AndroidUtilities.runOnUIThread(new y3(16, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        u9 u9Var = this.h;
        float f12 = dp / 2.0f;
        m6 m6Var = this.f35366i;
        m6Var.setTranslationX((f7 - u9Var.getLeft()) - f12);
        m6Var.setTranslationY((f10 - u9Var.getTop()) - f12);
        float f13 = f11 / dp;
        m6Var.setScaleX(f13);
        m6Var.setScaleY(f13);
    }

    public final RectF d(m6 m6Var) {
        ri riVar = this.f35361a;
        ViewGroup viewGroup = this.f35362b;
        if (riVar == null) {
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
        RectF rectF = this.f35371n;
        ViewGroup viewGroup = this.f35362b;
        m6 m6Var = this.d;
        ri riVar = this.f35361a;
        if (riVar == null) {
            f(m6Var, this.f35363c, viewGroup, rectF);
        } else if (m6Var.isAttachedToWindow() && m6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, m6Var));
            rectF.offset(0.0f, riVar.f30174o2 - riVar.f30207y0);
        }
    }
}
