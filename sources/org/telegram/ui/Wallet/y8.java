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
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.u61;
public final class y8 {
    public final aj f35550a;
    public final ViewGroup f35551b;
    public final View f35552c;
    public final e6 d;
    public final c5 f35553e;
    public final TL_wallet.walletTransaction f35554f;
    public final Runnable f35555g;
    public final w8 h;
    public final e6 f35556i;
    public final n8 f35557j = new n8();
    public final PathInterpolator f35558k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35559l;
    public final AnimatorSet f35560m;
    public final RectF f35561n;
    public final RectF f35562o;
    public z2 f35563p;
    public boolean f35564q;
    public boolean f35565r;
    public boolean f35566s;
    public final long f35567t;
    public final v8 f35568u;

    public y8(ViewGroup viewGroup, View view, e6 e6Var, c5 c5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, aj ajVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35560m = animatorSet;
        this.f35562o = new RectF();
        this.f35567t = SystemClock.uptimeMillis();
        this.f35568u = new Runnable(this) {
            public final y8 f35453b;

            {
                this.f35453b = this;
            }

            @Override
            public final void run() {
                z2 z2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        y8 y8Var = this.f35453b;
                        e6 e6Var2 = y8Var.d;
                        ViewGroup viewGroup2 = y8Var.f35551b;
                        AnimatorSet animatorSet2 = y8Var.f35560m;
                        e6 e6Var3 = y8Var.f35556i;
                        RectF rectF = y8Var.f35562o;
                        RectF rectF2 = y8Var.f35561n;
                        if (!y8Var.f35566s && !y8Var.f35565r) {
                            y8Var.e();
                            y8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            c5 c5Var2 = y8Var.f35553e;
                            TL_wallet.walletTransaction wallettransaction3 = y8Var.f35554f;
                            p71 p71Var = c5Var2.f34565p0[0];
                            z2 z2Var2 = null;
                            if (p71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < p71Var.getChildCount()) {
                                        View childAt = p71Var.getChildAt(i10);
                                        if ((childAt instanceof z2) && (wallettransaction2 = (z2Var = (z2) childAt).R) != null && x2.a(wallettransaction2, wallettransaction3)) {
                                            z2Var2 = z2Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (z2Var2 != null && z2Var2.getWidth() > 0) {
                                z2 z2Var3 = y8Var.f35563p;
                                if (z2Var3 != z2Var2) {
                                    if (z2Var3 != null) {
                                        z2Var3.g(false);
                                    }
                                    y8Var.f35563p = z2Var2;
                                    z2Var2.g(true);
                                }
                                e6 pendingDiamond = y8Var.f35563p.getPendingDiamond();
                                if (y8Var.f35564q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !y8Var.f35563p.isLayoutRequested()) {
                                    rectF.set(y8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        y8Var.f35565r = true;
                                        e6Var3.f(e6Var2);
                                        e6Var3.setAlpha(1.0f);
                                        e6Var2.setAlpha(0.0f);
                                        y8Var.f35557j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - y8Var.f35567t <= 450 && viewGroup2.isAttachedToWindow()) {
                                y8Var.h.postOnAnimation(y8Var.f35568u);
                                return;
                            }
                            y8Var.f35565r = true;
                            e6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35453b.f35564q = true;
                        return;
                }
            }
        };
        this.f35550a = ajVar;
        this.f35551b = viewGroup;
        this.f35552c = view;
        this.d = e6Var;
        this.f35559l = e6Var.getAlpha();
        this.f35553e = c5Var;
        this.f35554f = wallettransaction;
        this.f35555g = runnable;
        RectF a2 = a(viewGroup, e6Var);
        this.f35561n = a2;
        w8 w8Var = new w8(this, viewGroup.getContext());
        this.h = w8Var;
        w8Var.setClipChildren(false);
        w8Var.setClipToPadding(false);
        w8Var.setClickable(true);
        e6 e6Var2 = new e6(60, viewGroup.getContext(), false);
        this.f35556i = e6Var2;
        e6Var2.setContinuousRotation(540.0f);
        e6Var2.f(e6Var);
        e6Var2.setAlpha(0.0f);
        w8Var.addView(e6Var2, w7.w5.e(60, 60, 51));
        viewGroup.addView(w8Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        e6Var2.l(new Runnable(this) {
            public final y8 f35453b;

            {
                this.f35453b = this;
            }

            @Override
            public final void run() {
                z2 z2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        y8 y8Var = this.f35453b;
                        e6 e6Var22 = y8Var.d;
                        ViewGroup viewGroup2 = y8Var.f35551b;
                        AnimatorSet animatorSet2 = y8Var.f35560m;
                        e6 e6Var3 = y8Var.f35556i;
                        RectF rectF = y8Var.f35562o;
                        RectF rectF2 = y8Var.f35561n;
                        if (!y8Var.f35566s && !y8Var.f35565r) {
                            y8Var.e();
                            y8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            c5 c5Var2 = y8Var.f35553e;
                            TL_wallet.walletTransaction wallettransaction3 = y8Var.f35554f;
                            p71 p71Var = c5Var2.f34565p0[0];
                            z2 z2Var2 = null;
                            if (p71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < p71Var.getChildCount()) {
                                        View childAt = p71Var.getChildAt(i10);
                                        if ((childAt instanceof z2) && (wallettransaction2 = (z2Var = (z2) childAt).R) != null && x2.a(wallettransaction2, wallettransaction3)) {
                                            z2Var2 = z2Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (z2Var2 != null && z2Var2.getWidth() > 0) {
                                z2 z2Var3 = y8Var.f35563p;
                                if (z2Var3 != z2Var2) {
                                    if (z2Var3 != null) {
                                        z2Var3.g(false);
                                    }
                                    y8Var.f35563p = z2Var2;
                                    z2Var2.g(true);
                                }
                                e6 pendingDiamond = y8Var.f35563p.getPendingDiamond();
                                if (y8Var.f35564q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !y8Var.f35563p.isLayoutRequested()) {
                                    rectF.set(y8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        y8Var.f35565r = true;
                                        e6Var3.f(e6Var22);
                                        e6Var3.setAlpha(1.0f);
                                        e6Var22.setAlpha(0.0f);
                                        y8Var.f35557j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - y8Var.f35567t <= 450 && viewGroup2.isAttachedToWindow()) {
                                y8Var.h.postOnAnimation(y8Var.f35568u);
                                return;
                            }
                            y8Var.f35565r = true;
                            e6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35453b.f35564q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new u2(this, 9));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new x8(this, ajVar, e6Var));
        c5Var.f34555f0 = 0;
        ci.h1 h1Var = c5Var.f34563n0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
        c5Var.F0(false);
        j71 j71Var = c5Var.f27773a;
        if (j71Var != null) {
            j71Var.B0();
            c5Var.f27773a.V2.h1(0, 0);
            p71 p71Var = c5Var.f34565p0[0];
            if (p71Var != null) {
                h71 h71Var = p71Var.W2;
                p71Var.B0();
                h71Var.N(false);
                for (int i10 = 0; i10 < h71Var.f26678x.size(); i10++) {
                    u61 G = h71Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = x2.f35499a;
                            if ((wallettransaction2 instanceof w2 ? ((w2) wallettransaction2).f35468a : wallettransaction2) == wallettransaction || l0.d0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                p71Var.V2.h1(i10, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f35568u);
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
        if (this.f35566s) {
            return;
        }
        this.f35566s = true;
        v8 v8Var = this.f35568u;
        w8 w8Var = this.h;
        w8Var.removeCallbacks(v8Var);
        e6 e6Var = this.f35556i;
        e6Var.l(null);
        z2 z2Var = this.f35563p;
        if (z2Var != null && (wallettransaction = z2Var.R) != null && x2.a(wallettransaction, this.f35554f)) {
            e6 pendingDiamond = this.f35563p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(e6Var);
            }
            this.f35563p.g(false);
            RectF rectF = this.f35562o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f35561n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                z2 z2Var2 = this.f35563p;
                z2Var2.d();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                z2Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.f16690u = lVar;
                z2Var2.H.e(0.001f);
                z2Var2.H.f16679a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                z2Var2.H.b(new t2(z2Var2, 0));
                z2Var2.H.h();
            }
        }
        e6Var.setPaused(true);
        w8Var.removeView(e6Var);
        w8Var.setClickable(false);
        this.d.setAlpha(this.f35559l);
        aj ajVar = this.f35550a;
        if (ajVar == null) {
            this.f35552c.setTranslationY(0.0f);
        } else {
            ajVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35551b;
        if (ajVar != null && this.f35557j.d()) {
            c5 c5Var = this.f35553e;
            if (c5Var.getParentLayout() != null) {
                ViewGroup view = c5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(w8Var);
                    w8Var.setTranslationX(iArr[0] - iArr2[0]);
                    w8Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(w8Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f35555g.run();
        AndroidUtilities.runOnUIThread(new s(16, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        w8 w8Var = this.h;
        float f12 = dp / 2.0f;
        e6 e6Var = this.f35556i;
        e6Var.setTranslationX((f7 - w8Var.getLeft()) - f12);
        e6Var.setTranslationY((f10 - w8Var.getTop()) - f12);
        float f13 = f11 / dp;
        e6Var.setScaleX(f13);
        e6Var.setScaleY(f13);
    }

    public final RectF d(e6 e6Var) {
        aj ajVar = this.f35550a;
        ViewGroup viewGroup = this.f35551b;
        if (ajVar == null) {
            return a(viewGroup, e6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) e6Var.getRootView();
        RectF a2 = a(viewGroup2, e6Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void e() {
        RectF rectF = this.f35561n;
        ViewGroup viewGroup = this.f35551b;
        e6 e6Var = this.d;
        aj ajVar = this.f35550a;
        if (ajVar == null) {
            f(e6Var, this.f35552c, viewGroup, rectF);
        } else if (e6Var.isAttachedToWindow() && e6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, e6Var));
            rectF.offset(0.0f, ajVar.f24370o2 - ajVar.f24403y0);
        }
    }
}
