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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ii1;
public final class x8 {
    public final yi f35710a;
    public final ViewGroup f35711b;
    public final View f35712c;
    public final d6 d;
    public final b5 f35713e;
    public final TL_wallet.walletTransaction f35714f;
    public final Runnable f35715g;
    public final v8 h;
    public final d6 f35716i;
    public final m8 f35717j = new m8();
    public final PathInterpolator f35718k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35719l;
    public final AnimatorSet f35720m;
    public final RectF f35721n;
    public final RectF f35722o;
    public y2 f35723p;
    public boolean f35724q;
    public boolean f35725r;
    public boolean f35726s;
    public final long f35727t;
    public final u8 f35728u;

    public x8(ViewGroup viewGroup, View view, d6 d6Var, b5 b5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, yi yiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35720m = animatorSet;
        this.f35722o = new RectF();
        this.f35727t = SystemClock.uptimeMillis();
        this.f35728u = new Runnable(this) {
            public final x8 f35613b;

            {
                this.f35613b = this;
            }

            @Override
            public final void run() {
                y2 y2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        x8 x8Var = this.f35613b;
                        d6 d6Var2 = x8Var.d;
                        ViewGroup viewGroup2 = x8Var.f35711b;
                        AnimatorSet animatorSet2 = x8Var.f35720m;
                        d6 d6Var3 = x8Var.f35716i;
                        RectF rectF = x8Var.f35722o;
                        RectF rectF2 = x8Var.f35721n;
                        if (!x8Var.f35726s && !x8Var.f35725r) {
                            x8Var.e();
                            x8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            b5 b5Var2 = x8Var.f35713e;
                            TL_wallet.walletTransaction wallettransaction3 = x8Var.f35714f;
                            l71 l71Var = b5Var2.f34725p0[0];
                            y2 y2Var2 = null;
                            if (l71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < l71Var.getChildCount()) {
                                        View childAt = l71Var.getChildAt(i10);
                                        if ((childAt instanceof y2) && (wallettransaction2 = (y2Var = (y2) childAt).R) != null && w2.a(wallettransaction2, wallettransaction3)) {
                                            y2Var2 = y2Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (y2Var2 != null && y2Var2.getWidth() > 0) {
                                y2 y2Var3 = x8Var.f35723p;
                                if (y2Var3 != y2Var2) {
                                    if (y2Var3 != null) {
                                        y2Var3.g(false);
                                    }
                                    x8Var.f35723p = y2Var2;
                                    y2Var2.g(true);
                                }
                                d6 pendingDiamond = x8Var.f35723p.getPendingDiamond();
                                if (x8Var.f35724q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !x8Var.f35723p.isLayoutRequested()) {
                                    rectF.set(x8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        x8Var.f35725r = true;
                                        d6Var3.f(d6Var2);
                                        d6Var3.setAlpha(1.0f);
                                        d6Var2.setAlpha(0.0f);
                                        x8Var.f35717j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - x8Var.f35727t <= 450 && viewGroup2.isAttachedToWindow()) {
                                x8Var.h.postOnAnimation(x8Var.f35728u);
                                return;
                            }
                            x8Var.f35725r = true;
                            d6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35613b.f35724q = true;
                        return;
                }
            }
        };
        this.f35710a = yiVar;
        this.f35711b = viewGroup;
        this.f35712c = view;
        this.d = d6Var;
        this.f35719l = d6Var.getAlpha();
        this.f35713e = b5Var;
        this.f35714f = wallettransaction;
        this.f35715g = runnable;
        RectF a2 = a(viewGroup, d6Var);
        this.f35721n = a2;
        v8 v8Var = new v8(this, viewGroup.getContext());
        this.h = v8Var;
        v8Var.setClipChildren(false);
        v8Var.setClipToPadding(false);
        v8Var.setClickable(true);
        d6 d6Var2 = new d6(60, viewGroup.getContext(), false);
        this.f35716i = d6Var2;
        d6Var2.setContinuousRotation(540.0f);
        d6Var2.f(d6Var);
        d6Var2.setAlpha(0.0f);
        v8Var.addView(d6Var2, w7.x5.e(60, 60, 51));
        viewGroup.addView(v8Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        d6Var2.l(new Runnable(this) {
            public final x8 f35613b;

            {
                this.f35613b = this;
            }

            @Override
            public final void run() {
                y2 y2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        x8 x8Var = this.f35613b;
                        d6 d6Var22 = x8Var.d;
                        ViewGroup viewGroup2 = x8Var.f35711b;
                        AnimatorSet animatorSet2 = x8Var.f35720m;
                        d6 d6Var3 = x8Var.f35716i;
                        RectF rectF = x8Var.f35722o;
                        RectF rectF2 = x8Var.f35721n;
                        if (!x8Var.f35726s && !x8Var.f35725r) {
                            x8Var.e();
                            x8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            b5 b5Var2 = x8Var.f35713e;
                            TL_wallet.walletTransaction wallettransaction3 = x8Var.f35714f;
                            l71 l71Var = b5Var2.f34725p0[0];
                            y2 y2Var2 = null;
                            if (l71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < l71Var.getChildCount()) {
                                        View childAt = l71Var.getChildAt(i10);
                                        if ((childAt instanceof y2) && (wallettransaction2 = (y2Var = (y2) childAt).R) != null && w2.a(wallettransaction2, wallettransaction3)) {
                                            y2Var2 = y2Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (y2Var2 != null && y2Var2.getWidth() > 0) {
                                y2 y2Var3 = x8Var.f35723p;
                                if (y2Var3 != y2Var2) {
                                    if (y2Var3 != null) {
                                        y2Var3.g(false);
                                    }
                                    x8Var.f35723p = y2Var2;
                                    y2Var2.g(true);
                                }
                                d6 pendingDiamond = x8Var.f35723p.getPendingDiamond();
                                if (x8Var.f35724q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !x8Var.f35723p.isLayoutRequested()) {
                                    rectF.set(x8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        x8Var.f35725r = true;
                                        d6Var3.f(d6Var22);
                                        d6Var3.setAlpha(1.0f);
                                        d6Var22.setAlpha(0.0f);
                                        x8Var.f35717j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - x8Var.f35727t <= 450 && viewGroup2.isAttachedToWindow()) {
                                x8Var.h.postOnAnimation(x8Var.f35728u);
                                return;
                            }
                            x8Var.f35725r = true;
                            d6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35613b.f35724q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new t2(this, 9));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new w8(this, yiVar, d6Var));
        b5Var.f34715f0 = 0;
        ci.h1 h1Var = b5Var.f34723n0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
        b5Var.F0(false);
        f71 f71Var = b5Var.f26629a;
        if (f71Var != null) {
            f71Var.B0();
            b5Var.f26629a.V2.h1(0, 0);
            l71 l71Var = b5Var.f34725p0[0];
            if (l71Var != null) {
                d71 d71Var = l71Var.W2;
                l71Var.B0();
                d71Var.N(false);
                for (int i10 = 0; i10 < d71Var.f25590x.size(); i10++) {
                    q61 G = d71Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = w2.f35659a;
                            if ((wallettransaction2 instanceof v2 ? ((v2) wallettransaction2).f35628a : wallettransaction2) == wallettransaction || k0.d0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                l71Var.V2.h1(i10, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f35728u);
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
        if (this.f35726s) {
            return;
        }
        this.f35726s = true;
        u8 u8Var = this.f35728u;
        v8 v8Var = this.h;
        v8Var.removeCallbacks(u8Var);
        d6 d6Var = this.f35716i;
        d6Var.l(null);
        y2 y2Var = this.f35723p;
        if (y2Var != null && (wallettransaction = y2Var.R) != null && w2.a(wallettransaction, this.f35714f)) {
            d6 pendingDiamond = this.f35723p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(d6Var);
            }
            this.f35723p.g(false);
            RectF rectF = this.f35722o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f35721n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                y2 y2Var2 = this.f35723p;
                y2Var2.d();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                y2Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.f16942u = lVar;
                y2Var2.H.e(0.001f);
                y2Var2.H.f16931a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                y2Var2.H.b(new s2(y2Var2, 0));
                y2Var2.H.h();
            }
        }
        d6Var.setPaused(true);
        v8Var.removeView(d6Var);
        v8Var.setClickable(false);
        this.d.setAlpha(this.f35719l);
        yi yiVar = this.f35710a;
        if (yiVar == null) {
            this.f35712c.setTranslationY(0.0f);
        } else {
            yiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35711b;
        if (yiVar != null && this.f35717j.d()) {
            b5 b5Var = this.f35713e;
            if (b5Var.getParentLayout() != null) {
                ViewGroup view = b5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(v8Var);
                    v8Var.setTranslationX(iArr[0] - iArr2[0]);
                    v8Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(v8Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f35715g.run();
        AndroidUtilities.runOnUIThread(new ii1(19, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        v8 v8Var = this.h;
        float f12 = dp / 2.0f;
        d6 d6Var = this.f35716i;
        d6Var.setTranslationX((f7 - v8Var.getLeft()) - f12);
        d6Var.setTranslationY((f10 - v8Var.getTop()) - f12);
        float f13 = f11 / dp;
        d6Var.setScaleX(f13);
        d6Var.setScaleY(f13);
    }

    public final RectF d(d6 d6Var) {
        yi yiVar = this.f35710a;
        ViewGroup viewGroup = this.f35711b;
        if (yiVar == null) {
            return a(viewGroup, d6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) d6Var.getRootView();
        RectF a2 = a(viewGroup2, d6Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void e() {
        RectF rectF = this.f35721n;
        ViewGroup viewGroup = this.f35711b;
        d6 d6Var = this.d;
        yi yiVar = this.f35710a;
        if (yiVar == null) {
            f(d6Var, this.f35712c, viewGroup, rectF);
        } else if (d6Var.isAttachedToWindow() && d6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, d6Var));
            rectF.offset(0.0f, yiVar.f33263o2 - yiVar.f33296y0);
        }
    }
}
