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
public final class aa {
    public final ti f33992a;
    public final ViewGroup f33993b;
    public final View f33994c;
    public final s6 d;
    public final m5 e;
    public final TL_wallet.walletTransaction f33995f;
    public final Runnable f33996g;
    public final y9 h;
    public final s6 f33997i;
    public final q9 f33998j = new q9();
    public final PathInterpolator f33999k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f34000l;
    public final AnimatorSet f34001m;
    public final RectF f34002n;
    public final RectF f34003o;
    public e3 f34004p;
    public boolean f34005q;
    public boolean f34006r;
    public boolean f34007s;
    public final long f34008t;
    public final x9 f34009u;

    public aa(ViewGroup viewGroup, View view, s6 s6Var, m5 m5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34001m = animatorSet;
        this.f34003o = new RectF();
        this.f34008t = SystemClock.uptimeMillis();
        this.f34009u = new Runnable(this) {
            public final aa f35102b;

            {
                this.f35102b = this;
            }

            @Override
            public final void run() {
                e3 e3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        aa aaVar = this.f35102b;
                        s6 s6Var2 = aaVar.d;
                        ViewGroup viewGroup2 = aaVar.f33993b;
                        AnimatorSet animatorSet2 = aaVar.f34001m;
                        s6 s6Var3 = aaVar.f33997i;
                        RectF rectF = aaVar.f34003o;
                        RectF rectF2 = aaVar.f34002n;
                        if (!aaVar.f34007s && !aaVar.f34006r) {
                            aaVar.e();
                            aaVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            m5 m5Var2 = aaVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = aaVar.f33995f;
                            a71 a71Var = m5Var2.f34588s0[0];
                            e3 e3Var2 = null;
                            if (a71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < a71Var.getChildCount()) {
                                        View childAt = a71Var.getChildAt(i10);
                                        if ((childAt instanceof e3) && (wallettransaction2 = (e3Var = (e3) childAt).R) != null && c3.a(wallettransaction2, wallettransaction3)) {
                                            e3Var2 = e3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (e3Var2 != null && e3Var2.getWidth() > 0) {
                                e3 e3Var3 = aaVar.f34004p;
                                if (e3Var3 != e3Var2) {
                                    if (e3Var3 != null) {
                                        e3Var3.g(false);
                                    }
                                    aaVar.f34004p = e3Var2;
                                    e3Var2.g(true);
                                }
                                s6 pendingDiamond = aaVar.f34004p.getPendingDiamond();
                                if (aaVar.f34005q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !aaVar.f34004p.isLayoutRequested()) {
                                    rectF.set(aaVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        aaVar.f34006r = true;
                                        s6Var3.f(s6Var2);
                                        s6Var3.setAlpha(1.0f);
                                        s6Var2.setAlpha(0.0f);
                                        aaVar.f33998j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - aaVar.f34008t <= 450 && viewGroup2.isAttachedToWindow()) {
                                aaVar.h.postOnAnimation(aaVar.f34009u);
                                return;
                            }
                            aaVar.f34006r = true;
                            s6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35102b.f34005q = true;
                        return;
                }
            }
        };
        this.f33992a = tiVar;
        this.f33993b = viewGroup;
        this.f33994c = view;
        this.d = s6Var;
        this.f34000l = s6Var.getAlpha();
        this.e = m5Var;
        this.f33995f = wallettransaction;
        this.f33996g = runnable;
        RectF a2 = a(viewGroup, s6Var);
        this.f34002n = a2;
        y9 y9Var = new y9(this, viewGroup.getContext());
        this.h = y9Var;
        y9Var.setClipChildren(false);
        y9Var.setClipToPadding(false);
        y9Var.setClickable(true);
        s6 s6Var2 = new s6(60, viewGroup.getContext(), false);
        this.f33997i = s6Var2;
        s6Var2.setContinuousRotation(540.0f);
        s6Var2.f(s6Var);
        s6Var2.setAlpha(0.0f);
        y9Var.addView(s6Var2, w7.z5.e(60, 60, 51));
        viewGroup.addView(y9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        s6Var2.l(new Runnable(this) {
            public final aa f35102b;

            {
                this.f35102b = this;
            }

            @Override
            public final void run() {
                e3 e3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        aa aaVar = this.f35102b;
                        s6 s6Var22 = aaVar.d;
                        ViewGroup viewGroup2 = aaVar.f33993b;
                        AnimatorSet animatorSet2 = aaVar.f34001m;
                        s6 s6Var3 = aaVar.f33997i;
                        RectF rectF = aaVar.f34003o;
                        RectF rectF2 = aaVar.f34002n;
                        if (!aaVar.f34007s && !aaVar.f34006r) {
                            aaVar.e();
                            aaVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            m5 m5Var2 = aaVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = aaVar.f33995f;
                            a71 a71Var = m5Var2.f34588s0[0];
                            e3 e3Var2 = null;
                            if (a71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < a71Var.getChildCount()) {
                                        View childAt = a71Var.getChildAt(i10);
                                        if ((childAt instanceof e3) && (wallettransaction2 = (e3Var = (e3) childAt).R) != null && c3.a(wallettransaction2, wallettransaction3)) {
                                            e3Var2 = e3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (e3Var2 != null && e3Var2.getWidth() > 0) {
                                e3 e3Var3 = aaVar.f34004p;
                                if (e3Var3 != e3Var2) {
                                    if (e3Var3 != null) {
                                        e3Var3.g(false);
                                    }
                                    aaVar.f34004p = e3Var2;
                                    e3Var2.g(true);
                                }
                                s6 pendingDiamond = aaVar.f34004p.getPendingDiamond();
                                if (aaVar.f34005q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !aaVar.f34004p.isLayoutRequested()) {
                                    rectF.set(aaVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        aaVar.f34006r = true;
                                        s6Var3.f(s6Var22);
                                        s6Var3.setAlpha(1.0f);
                                        s6Var22.setAlpha(0.0f);
                                        aaVar.f33998j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - aaVar.f34008t <= 450 && viewGroup2.isAttachedToWindow()) {
                                aaVar.h.postOnAnimation(aaVar.f34009u);
                                return;
                            }
                            aaVar.f34006r = true;
                            s6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35102b.f34005q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new u2(this, 11));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new z9(this, tiVar, s6Var));
        m5Var.I0();
        m5Var.Q0(false);
        u61 u61Var = m5Var.f31197a;
        if (u61Var != null) {
            u61Var.B0();
            m5Var.f31197a.V2.h1(0, 0);
            a71 a71Var = m5Var.f34588s0[0];
            if (a71Var != null) {
                s61 s61Var = a71Var.W2;
                a71Var.B0();
                s61Var.N(false);
                for (int i10 = 0; i10 < s61Var.f30210x.size(); i10++) {
                    f61 G = s61Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = c3.f34082a;
                            if ((wallettransaction2 instanceof b3 ? ((b3) wallettransaction2).f34031a : wallettransaction2) == wallettransaction || m0.f0((TL_wallet.walletTransaction) obj, wallettransaction)) {
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
        this.h.post(this.f34009u);
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
        if (this.f34007s) {
            return;
        }
        this.f34007s = true;
        x9 x9Var = this.f34009u;
        y9 y9Var = this.h;
        y9Var.removeCallbacks(x9Var);
        s6 s6Var = this.f33997i;
        s6Var.l(null);
        e3 e3Var = this.f34004p;
        if (e3Var != null && (wallettransaction = e3Var.R) != null && c3.a(wallettransaction, this.f33995f)) {
            s6 pendingDiamond = this.f34004p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(s6Var);
            }
            this.f34004p.g(false);
            RectF rectF = this.f34003o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f34002n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                e3 e3Var2 = this.f34004p;
                e3Var2.e();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                e3Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.f17562u = lVar;
                e3Var2.H.e(0.001f);
                e3Var2.H.f17552a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                e3Var2.H.b(new z2(e3Var2, 0));
                e3Var2.H.h();
            }
        }
        s6Var.setPaused(true);
        y9Var.removeView(s6Var);
        y9Var.setClickable(false);
        this.d.setAlpha(this.f34000l);
        ti tiVar = this.f33992a;
        if (tiVar == null) {
            this.f33994c.setTranslationY(0.0f);
        } else {
            tiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f33993b;
        if (tiVar != null && this.f33998j.d()) {
            m5 m5Var = this.e;
            if (m5Var.getParentLayout() != null) {
                ViewGroup view = m5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(y9Var);
                    y9Var.setTranslationX(iArr[0] - iArr2[0]);
                    y9Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(y9Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f33996g.run();
        AndroidUtilities.runOnUIThread(new u3(16, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        y9 y9Var = this.h;
        float f12 = dp / 2.0f;
        s6 s6Var = this.f33997i;
        s6Var.setTranslationX((f7 - y9Var.getLeft()) - f12);
        s6Var.setTranslationY((f10 - y9Var.getTop()) - f12);
        float f13 = f11 / dp;
        s6Var.setScaleX(f13);
        s6Var.setScaleY(f13);
    }

    public final RectF d(s6 s6Var) {
        ti tiVar = this.f33992a;
        ViewGroup viewGroup = this.f33993b;
        if (tiVar == null) {
            return a(viewGroup, s6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) s6Var.getRootView();
        RectF a2 = a(viewGroup2, s6Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void e() {
        RectF rectF = this.f34002n;
        ViewGroup viewGroup = this.f33993b;
        s6 s6Var = this.d;
        ti tiVar = this.f33992a;
        if (tiVar == null) {
            f(s6Var, this.f33994c, viewGroup, rectF);
        } else if (s6Var.isAttachedToWindow() && s6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, s6Var));
            rectF.offset(0.0f, tiVar.f30609o2 - tiVar.f30642y0);
        }
    }
}
