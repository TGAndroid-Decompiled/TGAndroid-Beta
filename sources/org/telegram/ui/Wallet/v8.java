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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ii1;
public final class v8 {
    public final yi f35560a;
    public final ViewGroup f35561b;
    public final View f35562c;
    public final b6 d;
    public final z4 f35563e;
    public final TL_wallet.walletTransaction f35564f;
    public final Runnable f35565g;
    public final t8 h;
    public final b6 f35566i;
    public final k8 f35567j = new k8();
    public final PathInterpolator f35568k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35569l;
    public final AnimatorSet f35570m;
    public final RectF f35571n;
    public final RectF f35572o;
    public x2 f35573p;
    public boolean f35574q;
    public boolean f35575r;
    public boolean f35576s;
    public final long f35577t;
    public final s8 f35578u;

    public v8(ViewGroup viewGroup, View view, b6 b6Var, z4 z4Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, yi yiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35570m = animatorSet;
        this.f35572o = new RectF();
        this.f35577t = SystemClock.uptimeMillis();
        this.f35578u = new Runnable(this) {
            public final v8 f35459b;

            {
                this.f35459b = this;
            }

            @Override
            public final void run() {
                x2 x2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        v8 v8Var = this.f35459b;
                        b6 b6Var2 = v8Var.d;
                        ViewGroup viewGroup2 = v8Var.f35561b;
                        AnimatorSet animatorSet2 = v8Var.f35570m;
                        b6 b6Var3 = v8Var.f35566i;
                        RectF rectF = v8Var.f35572o;
                        RectF rectF2 = v8Var.f35571n;
                        if (!v8Var.f35576s && !v8Var.f35575r) {
                            v8Var.e();
                            v8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            z4 z4Var2 = v8Var.f35563e;
                            TL_wallet.walletTransaction wallettransaction3 = v8Var.f35564f;
                            k71 k71Var = z4Var2.f35730p0[0];
                            x2 x2Var2 = null;
                            if (k71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < k71Var.getChildCount()) {
                                        View childAt = k71Var.getChildAt(i10);
                                        if ((childAt instanceof x2) && (wallettransaction2 = (x2Var = (x2) childAt).R) != null && v2.a(wallettransaction2, wallettransaction3)) {
                                            x2Var2 = x2Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (x2Var2 != null && x2Var2.getWidth() > 0) {
                                x2 x2Var3 = v8Var.f35573p;
                                if (x2Var3 != x2Var2) {
                                    if (x2Var3 != null) {
                                        x2Var3.g(false);
                                    }
                                    v8Var.f35573p = x2Var2;
                                    x2Var2.g(true);
                                }
                                b6 pendingDiamond = v8Var.f35573p.getPendingDiamond();
                                if (v8Var.f35574q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v8Var.f35573p.isLayoutRequested()) {
                                    rectF.set(v8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v8Var.f35575r = true;
                                        b6Var3.f(b6Var2);
                                        b6Var3.setAlpha(1.0f);
                                        b6Var2.setAlpha(0.0f);
                                        v8Var.f35567j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v8Var.f35577t <= 450 && viewGroup2.isAttachedToWindow()) {
                                v8Var.h.postOnAnimation(v8Var.f35578u);
                                return;
                            }
                            v8Var.f35575r = true;
                            b6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35459b.f35574q = true;
                        return;
                }
            }
        };
        this.f35560a = yiVar;
        this.f35561b = viewGroup;
        this.f35562c = view;
        this.d = b6Var;
        this.f35569l = b6Var.getAlpha();
        this.f35563e = z4Var;
        this.f35564f = wallettransaction;
        this.f35565g = runnable;
        RectF a2 = a(viewGroup, b6Var);
        this.f35571n = a2;
        t8 t8Var = new t8(this, viewGroup.getContext());
        this.h = t8Var;
        t8Var.setClipChildren(false);
        t8Var.setClipToPadding(false);
        t8Var.setClickable(true);
        b6 b6Var2 = new b6(60, viewGroup.getContext(), false);
        this.f35566i = b6Var2;
        b6Var2.setContinuousRotation(540.0f);
        b6Var2.f(b6Var);
        b6Var2.setAlpha(0.0f);
        t8Var.addView(b6Var2, w7.x5.e(60, 60, 51));
        viewGroup.addView(t8Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        b6Var2.l(new Runnable(this) {
            public final v8 f35459b;

            {
                this.f35459b = this;
            }

            @Override
            public final void run() {
                x2 x2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        v8 v8Var = this.f35459b;
                        b6 b6Var22 = v8Var.d;
                        ViewGroup viewGroup2 = v8Var.f35561b;
                        AnimatorSet animatorSet2 = v8Var.f35570m;
                        b6 b6Var3 = v8Var.f35566i;
                        RectF rectF = v8Var.f35572o;
                        RectF rectF2 = v8Var.f35571n;
                        if (!v8Var.f35576s && !v8Var.f35575r) {
                            v8Var.e();
                            v8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            z4 z4Var2 = v8Var.f35563e;
                            TL_wallet.walletTransaction wallettransaction3 = v8Var.f35564f;
                            k71 k71Var = z4Var2.f35730p0[0];
                            x2 x2Var2 = null;
                            if (k71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < k71Var.getChildCount()) {
                                        View childAt = k71Var.getChildAt(i10);
                                        if ((childAt instanceof x2) && (wallettransaction2 = (x2Var = (x2) childAt).R) != null && v2.a(wallettransaction2, wallettransaction3)) {
                                            x2Var2 = x2Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (x2Var2 != null && x2Var2.getWidth() > 0) {
                                x2 x2Var3 = v8Var.f35573p;
                                if (x2Var3 != x2Var2) {
                                    if (x2Var3 != null) {
                                        x2Var3.g(false);
                                    }
                                    v8Var.f35573p = x2Var2;
                                    x2Var2.g(true);
                                }
                                b6 pendingDiamond = v8Var.f35573p.getPendingDiamond();
                                if (v8Var.f35574q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v8Var.f35573p.isLayoutRequested()) {
                                    rectF.set(v8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v8Var.f35575r = true;
                                        b6Var3.f(b6Var22);
                                        b6Var3.setAlpha(1.0f);
                                        b6Var22.setAlpha(0.0f);
                                        v8Var.f35567j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v8Var.f35577t <= 450 && viewGroup2.isAttachedToWindow()) {
                                v8Var.h.postOnAnimation(v8Var.f35578u);
                                return;
                            }
                            v8Var.f35575r = true;
                            b6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35459b.f35574q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new s2(this, 9));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new u8(this, yiVar, b6Var));
        z4Var.f35720f0 = 0;
        ci.h1 h1Var = z4Var.f35728n0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
        z4Var.F0(false);
        e71 e71Var = z4Var.f26290a;
        if (e71Var != null) {
            e71Var.B0();
            z4Var.f26290a.V2.h1(0, 0);
            k71 k71Var = z4Var.f35730p0[0];
            if (k71Var != null) {
                c71 c71Var = k71Var.W2;
                k71Var.B0();
                c71Var.N(false);
                for (int i10 = 0; i10 < c71Var.f25283x.size(); i10++) {
                    p61 G = c71Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = v2.f35550a;
                            if ((wallettransaction2 instanceof u2 ? ((u2) wallettransaction2).f35497a : wallettransaction2) == wallettransaction || k0.d0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                k71Var.V2.h1(i10, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f35578u);
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
        if (this.f35576s) {
            return;
        }
        this.f35576s = true;
        s8 s8Var = this.f35578u;
        t8 t8Var = this.h;
        t8Var.removeCallbacks(s8Var);
        b6 b6Var = this.f35566i;
        b6Var.l(null);
        x2 x2Var = this.f35573p;
        if (x2Var != null && (wallettransaction = x2Var.R) != null && v2.a(wallettransaction, this.f35564f)) {
            b6 pendingDiamond = this.f35573p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(b6Var);
            }
            this.f35573p.g(false);
            RectF rectF = this.f35572o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f35571n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                x2 x2Var2 = this.f35573p;
                x2Var2.d();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                x2Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.f16938u = lVar;
                x2Var2.H.e(0.001f);
                x2Var2.H.f16927a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                x2Var2.H.b(new r2(x2Var2, 0));
                x2Var2.H.h();
            }
        }
        b6Var.setPaused(true);
        t8Var.removeView(b6Var);
        t8Var.setClickable(false);
        this.d.setAlpha(this.f35569l);
        yi yiVar = this.f35560a;
        if (yiVar == null) {
            this.f35562c.setTranslationY(0.0f);
        } else {
            yiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35561b;
        if (yiVar != null && this.f35567j.d()) {
            z4 z4Var = this.f35563e;
            if (z4Var.getParentLayout() != null) {
                ViewGroup view = z4Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(t8Var);
                    t8Var.setTranslationX(iArr[0] - iArr2[0]);
                    t8Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(t8Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f35565g.run();
        AndroidUtilities.runOnUIThread(new ii1(19, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        t8 t8Var = this.h;
        float f12 = dp / 2.0f;
        b6 b6Var = this.f35566i;
        b6Var.setTranslationX((f7 - t8Var.getLeft()) - f12);
        b6Var.setTranslationY((f10 - t8Var.getTop()) - f12);
        float f13 = f11 / dp;
        b6Var.setScaleX(f13);
        b6Var.setScaleY(f13);
    }

    public final RectF d(b6 b6Var) {
        yi yiVar = this.f35560a;
        ViewGroup viewGroup = this.f35561b;
        if (yiVar == null) {
            return a(viewGroup, b6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) b6Var.getRootView();
        RectF a2 = a(viewGroup2, b6Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void e() {
        RectF rectF = this.f35571n;
        ViewGroup viewGroup = this.f35561b;
        b6 b6Var = this.d;
        yi yiVar = this.f35560a;
        if (yiVar == null) {
            f(b6Var, this.f35562c, viewGroup, rectF);
        } else if (b6Var.isAttachedToWindow() && b6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, b6Var));
            rectF.offset(0.0f, yiVar.f33256o2 - yiVar.f33289y0);
        }
    }
}
