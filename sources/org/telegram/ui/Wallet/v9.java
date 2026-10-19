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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.v61;
public final class v9 {
    public final ti f35023a;
    public final ViewGroup f35024b;
    public final View f35025c;
    public final m6 d;
    public final o5 e;
    public final TL_wallet.walletTransaction f35026f;
    public final Runnable f35027g;
    public final t9 h;
    public final m6 f35028i;
    public final k9 f35029j = new k9();
    public final PathInterpolator f35030k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35031l;
    public final AnimatorSet f35032m;
    public final RectF f35033n;
    public final RectF f35034o;
    public g3 f35035p;
    public boolean f35036q;
    public boolean f35037r;
    public boolean f35038s;
    public final long f35039t;
    public final s9 f35040u;

    public v9(ViewGroup viewGroup, View view, m6 m6Var, o5 o5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35032m = animatorSet;
        this.f35034o = new RectF();
        this.f35039t = SystemClock.uptimeMillis();
        this.f35040u = new Runnable(this) {
            public final v9 f34886b;

            {
                this.f34886b = this;
            }

            @Override
            public final void run() {
                g3 g3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        v9 v9Var = this.f34886b;
                        m6 m6Var2 = v9Var.d;
                        ViewGroup viewGroup2 = v9Var.f35024b;
                        AnimatorSet animatorSet2 = v9Var.f35032m;
                        m6 m6Var3 = v9Var.f35028i;
                        RectF rectF = v9Var.f35034o;
                        RectF rectF2 = v9Var.f35033n;
                        if (!v9Var.f35038s && !v9Var.f35037r) {
                            v9Var.e();
                            v9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            o5 o5Var2 = v9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = v9Var.f35026f;
                            b71 b71Var = o5Var2.f34652q0[0];
                            g3 g3Var2 = null;
                            if (b71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < b71Var.getChildCount()) {
                                        View childAt = b71Var.getChildAt(i10);
                                        if ((childAt instanceof g3) && (wallettransaction2 = (g3Var = (g3) childAt).R) != null && e3.a(wallettransaction2, wallettransaction3)) {
                                            g3Var2 = g3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (g3Var2 != null && g3Var2.getWidth() > 0) {
                                g3 g3Var3 = v9Var.f35035p;
                                if (g3Var3 != g3Var2) {
                                    if (g3Var3 != null) {
                                        g3Var3.g(false);
                                    }
                                    v9Var.f35035p = g3Var2;
                                    g3Var2.g(true);
                                }
                                m6 pendingDiamond = v9Var.f35035p.getPendingDiamond();
                                if (v9Var.f35036q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v9Var.f35035p.isLayoutRequested()) {
                                    rectF.set(v9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v9Var.f35037r = true;
                                        m6Var3.f(m6Var2);
                                        m6Var3.setAlpha(1.0f);
                                        m6Var2.setAlpha(0.0f);
                                        v9Var.f35029j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v9Var.f35039t <= 450 && viewGroup2.isAttachedToWindow()) {
                                v9Var.h.postOnAnimation(v9Var.f35040u);
                                return;
                            }
                            v9Var.f35037r = true;
                            m6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f34886b.f35036q = true;
                        return;
                }
            }
        };
        this.f35023a = tiVar;
        this.f35024b = viewGroup;
        this.f35025c = view;
        this.d = m6Var;
        this.f35031l = m6Var.getAlpha();
        this.e = o5Var;
        this.f35026f = wallettransaction;
        this.f35027g = runnable;
        RectF a2 = a(viewGroup, m6Var);
        this.f35033n = a2;
        t9 t9Var = new t9(this, viewGroup.getContext());
        this.h = t9Var;
        t9Var.setClipChildren(false);
        t9Var.setClipToPadding(false);
        t9Var.setClickable(true);
        m6 m6Var2 = new m6(60, viewGroup.getContext(), true);
        this.f35028i = m6Var2;
        m6Var2.setContinuousRotation(540.0f);
        m6Var2.f(m6Var);
        m6Var2.setAlpha(0.0f);
        t9Var.addView(m6Var2, w7.z5.e(60, 60, 51));
        viewGroup.addView(t9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        m6Var2.l(new Runnable(this) {
            public final v9 f34886b;

            {
                this.f34886b = this;
            }

            @Override
            public final void run() {
                g3 g3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        v9 v9Var = this.f34886b;
                        m6 m6Var22 = v9Var.d;
                        ViewGroup viewGroup2 = v9Var.f35024b;
                        AnimatorSet animatorSet2 = v9Var.f35032m;
                        m6 m6Var3 = v9Var.f35028i;
                        RectF rectF = v9Var.f35034o;
                        RectF rectF2 = v9Var.f35033n;
                        if (!v9Var.f35038s && !v9Var.f35037r) {
                            v9Var.e();
                            v9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            o5 o5Var2 = v9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = v9Var.f35026f;
                            b71 b71Var = o5Var2.f34652q0[0];
                            g3 g3Var2 = null;
                            if (b71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < b71Var.getChildCount()) {
                                        View childAt = b71Var.getChildAt(i10);
                                        if ((childAt instanceof g3) && (wallettransaction2 = (g3Var = (g3) childAt).R) != null && e3.a(wallettransaction2, wallettransaction3)) {
                                            g3Var2 = g3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (g3Var2 != null && g3Var2.getWidth() > 0) {
                                g3 g3Var3 = v9Var.f35035p;
                                if (g3Var3 != g3Var2) {
                                    if (g3Var3 != null) {
                                        g3Var3.g(false);
                                    }
                                    v9Var.f35035p = g3Var2;
                                    g3Var2.g(true);
                                }
                                m6 pendingDiamond = v9Var.f35035p.getPendingDiamond();
                                if (v9Var.f35036q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v9Var.f35035p.isLayoutRequested()) {
                                    rectF.set(v9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v9Var.f35037r = true;
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(1.0f);
                                        m6Var22.setAlpha(0.0f);
                                        v9Var.f35029j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v9Var.f35039t <= 450 && viewGroup2.isAttachedToWindow()) {
                                v9Var.h.postOnAnimation(v9Var.f35040u);
                                return;
                            }
                            v9Var.f35037r = true;
                            m6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f34886b.f35036q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new b3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new u9(this, tiVar, m6Var));
        o5Var.J0();
        o5Var.R0(false);
        v61 v61Var = o5Var.f32025a;
        if (v61Var != null) {
            v61Var.B0();
            o5Var.f32025a.V2.h1(0, 0);
            b71 b71Var = o5Var.f34652q0[0];
            if (b71Var != null) {
                t61 t61Var = b71Var.W2;
                b71Var.B0();
                t61Var.N(false);
                for (int i10 = 0; i10 < t61Var.f30439x.size(); i10++) {
                    g61 G = t61Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = e3.f34142a;
                            if ((wallettransaction2 instanceof d3 ? ((d3) wallettransaction2).f34093a : wallettransaction2) == wallettransaction || m0.f0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                b71Var.V2.h1(i10, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f35040u);
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
        if (this.f35038s) {
            return;
        }
        this.f35038s = true;
        s9 s9Var = this.f35040u;
        t9 t9Var = this.h;
        t9Var.removeCallbacks(s9Var);
        m6 m6Var = this.f35028i;
        m6Var.l(null);
        g3 g3Var = this.f35035p;
        if (g3Var != null && (wallettransaction = g3Var.R) != null && e3.a(wallettransaction, this.f35026f)) {
            m6 pendingDiamond = this.f35035p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(m6Var);
            }
            this.f35035p.g(false);
            RectF rectF = this.f35034o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f35033n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                g3 g3Var2 = this.f35035p;
                g3Var2.e();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                g3Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.f17559u = lVar;
                g3Var2.H.e(0.001f);
                g3Var2.H.f17549a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                g3Var2.H.b(new a3(g3Var2, 0));
                g3Var2.H.h();
            }
        }
        m6Var.setPaused(true);
        t9Var.removeView(m6Var);
        t9Var.setClickable(false);
        this.d.setAlpha(this.f35031l);
        ti tiVar = this.f35023a;
        if (tiVar == null) {
            this.f35025c.setTranslationY(0.0f);
        } else {
            tiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35024b;
        if (tiVar != null && this.f35029j.d()) {
            o5 o5Var = this.e;
            if (o5Var.getParentLayout() != null) {
                ViewGroup view = o5Var.getParentLayout().getView();
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
        this.f35027g.run();
        AndroidUtilities.runOnUIThread(new z3(16, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        t9 t9Var = this.h;
        float f12 = dp / 2.0f;
        m6 m6Var = this.f35028i;
        m6Var.setTranslationX((f7 - t9Var.getLeft()) - f12);
        m6Var.setTranslationY((f10 - t9Var.getTop()) - f12);
        float f13 = f11 / dp;
        m6Var.setScaleX(f13);
        m6Var.setScaleY(f13);
    }

    public final RectF d(m6 m6Var) {
        ti tiVar = this.f35023a;
        ViewGroup viewGroup = this.f35024b;
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
        RectF rectF = this.f35033n;
        ViewGroup viewGroup = this.f35024b;
        m6 m6Var = this.d;
        ti tiVar = this.f35023a;
        if (tiVar == null) {
            f(m6Var, this.f35025c, viewGroup, rectF);
        } else if (m6Var.isAttachedToWindow() && m6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, m6Var));
            rectF.offset(0.0f, tiVar.f30562o2 - tiVar.f30595y0);
        }
    }
}
