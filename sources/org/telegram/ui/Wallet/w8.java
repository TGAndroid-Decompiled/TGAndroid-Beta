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
public final class w8 {
    public final yi f35622a;
    public final ViewGroup f35623b;
    public final View f35624c;
    public final c6 d;
    public final a5 f35625e;
    public final TL_wallet.walletTransaction f35626f;
    public final Runnable f35627g;
    public final u8 h;
    public final c6 f35628i;
    public final l8 f35629j = new l8();
    public final PathInterpolator f35630k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35631l;
    public final AnimatorSet f35632m;
    public final RectF f35633n;
    public final RectF f35634o;
    public x2 f35635p;
    public boolean f35636q;
    public boolean f35637r;
    public boolean f35638s;
    public final long f35639t;
    public final t8 f35640u;

    public w8(ViewGroup viewGroup, View view, c6 c6Var, a5 a5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, yi yiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35632m = animatorSet;
        this.f35634o = new RectF();
        this.f35639t = SystemClock.uptimeMillis();
        this.f35640u = new Runnable(this) {
            public final w8 f35523b;

            {
                this.f35523b = this;
            }

            @Override
            public final void run() {
                x2 x2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f35523b;
                        c6 c6Var2 = w8Var.d;
                        ViewGroup viewGroup2 = w8Var.f35623b;
                        AnimatorSet animatorSet2 = w8Var.f35632m;
                        c6 c6Var3 = w8Var.f35628i;
                        RectF rectF = w8Var.f35634o;
                        RectF rectF2 = w8Var.f35633n;
                        if (!w8Var.f35638s && !w8Var.f35637r) {
                            w8Var.e();
                            w8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            a5 a5Var2 = w8Var.f35625e;
                            TL_wallet.walletTransaction wallettransaction3 = w8Var.f35626f;
                            k71 k71Var = a5Var2.f34634p0[0];
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
                                x2 x2Var3 = w8Var.f35635p;
                                if (x2Var3 != x2Var2) {
                                    if (x2Var3 != null) {
                                        x2Var3.g(false);
                                    }
                                    w8Var.f35635p = x2Var2;
                                    x2Var2.g(true);
                                }
                                c6 pendingDiamond = w8Var.f35635p.getPendingDiamond();
                                if (w8Var.f35636q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !w8Var.f35635p.isLayoutRequested()) {
                                    rectF.set(w8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        w8Var.f35637r = true;
                                        c6Var3.f(c6Var2);
                                        c6Var3.setAlpha(1.0f);
                                        c6Var2.setAlpha(0.0f);
                                        w8Var.f35629j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - w8Var.f35639t <= 450 && viewGroup2.isAttachedToWindow()) {
                                w8Var.h.postOnAnimation(w8Var.f35640u);
                                return;
                            }
                            w8Var.f35637r = true;
                            c6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35523b.f35636q = true;
                        return;
                }
            }
        };
        this.f35622a = yiVar;
        this.f35623b = viewGroup;
        this.f35624c = view;
        this.d = c6Var;
        this.f35631l = c6Var.getAlpha();
        this.f35625e = a5Var;
        this.f35626f = wallettransaction;
        this.f35627g = runnable;
        RectF a2 = a(viewGroup, c6Var);
        this.f35633n = a2;
        u8 u8Var = new u8(this, viewGroup.getContext());
        this.h = u8Var;
        u8Var.setClipChildren(false);
        u8Var.setClipToPadding(false);
        u8Var.setClickable(true);
        c6 c6Var2 = new c6(60, viewGroup.getContext(), false);
        this.f35628i = c6Var2;
        c6Var2.setContinuousRotation(540.0f);
        c6Var2.f(c6Var);
        c6Var2.setAlpha(0.0f);
        u8Var.addView(c6Var2, w7.x5.e(60, 60, 51));
        viewGroup.addView(u8Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        c6Var2.l(new Runnable(this) {
            public final w8 f35523b;

            {
                this.f35523b = this;
            }

            @Override
            public final void run() {
                x2 x2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f35523b;
                        c6 c6Var22 = w8Var.d;
                        ViewGroup viewGroup2 = w8Var.f35623b;
                        AnimatorSet animatorSet2 = w8Var.f35632m;
                        c6 c6Var3 = w8Var.f35628i;
                        RectF rectF = w8Var.f35634o;
                        RectF rectF2 = w8Var.f35633n;
                        if (!w8Var.f35638s && !w8Var.f35637r) {
                            w8Var.e();
                            w8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            a5 a5Var2 = w8Var.f35625e;
                            TL_wallet.walletTransaction wallettransaction3 = w8Var.f35626f;
                            k71 k71Var = a5Var2.f34634p0[0];
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
                                x2 x2Var3 = w8Var.f35635p;
                                if (x2Var3 != x2Var2) {
                                    if (x2Var3 != null) {
                                        x2Var3.g(false);
                                    }
                                    w8Var.f35635p = x2Var2;
                                    x2Var2.g(true);
                                }
                                c6 pendingDiamond = w8Var.f35635p.getPendingDiamond();
                                if (w8Var.f35636q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !w8Var.f35635p.isLayoutRequested()) {
                                    rectF.set(w8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        w8Var.f35637r = true;
                                        c6Var3.f(c6Var22);
                                        c6Var3.setAlpha(1.0f);
                                        c6Var22.setAlpha(0.0f);
                                        w8Var.f35629j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - w8Var.f35639t <= 450 && viewGroup2.isAttachedToWindow()) {
                                w8Var.h.postOnAnimation(w8Var.f35640u);
                                return;
                            }
                            w8Var.f35637r = true;
                            c6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35523b.f35636q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new s2(this, 9));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new v8(this, yiVar, c6Var));
        a5Var.f34624f0 = 0;
        ci.h1 h1Var = a5Var.f34632n0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
        a5Var.F0(false);
        e71 e71Var = a5Var.f26290a;
        if (e71Var != null) {
            e71Var.B0();
            a5Var.f26290a.V2.h1(0, 0);
            k71 k71Var = a5Var.f34634p0[0];
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
                            int i11 = v2.f35565a;
                            if ((wallettransaction2 instanceof u2 ? ((u2) wallettransaction2).f35532a : wallettransaction2) == wallettransaction || k0.d0((TL_wallet.walletTransaction) obj, wallettransaction)) {
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
        this.h.post(this.f35640u);
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
        if (this.f35638s) {
            return;
        }
        this.f35638s = true;
        t8 t8Var = this.f35640u;
        u8 u8Var = this.h;
        u8Var.removeCallbacks(t8Var);
        c6 c6Var = this.f35628i;
        c6Var.l(null);
        x2 x2Var = this.f35635p;
        if (x2Var != null && (wallettransaction = x2Var.R) != null && v2.a(wallettransaction, this.f35626f)) {
            c6 pendingDiamond = this.f35635p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(c6Var);
            }
            this.f35635p.g(false);
            RectF rectF = this.f35634o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f35633n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                x2 x2Var2 = this.f35635p;
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
        c6Var.setPaused(true);
        u8Var.removeView(c6Var);
        u8Var.setClickable(false);
        this.d.setAlpha(this.f35631l);
        yi yiVar = this.f35622a;
        if (yiVar == null) {
            this.f35624c.setTranslationY(0.0f);
        } else {
            yiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35623b;
        if (yiVar != null && this.f35629j.d()) {
            a5 a5Var = this.f35625e;
            if (a5Var.getParentLayout() != null) {
                ViewGroup view = a5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(u8Var);
                    u8Var.setTranslationX(iArr[0] - iArr2[0]);
                    u8Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(u8Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f35627g.run();
        AndroidUtilities.runOnUIThread(new ii1(19, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        u8 u8Var = this.h;
        float f12 = dp / 2.0f;
        c6 c6Var = this.f35628i;
        c6Var.setTranslationX((f7 - u8Var.getLeft()) - f12);
        c6Var.setTranslationY((f10 - u8Var.getTop()) - f12);
        float f13 = f11 / dp;
        c6Var.setScaleX(f13);
        c6Var.setScaleY(f13);
    }

    public final RectF d(c6 c6Var) {
        yi yiVar = this.f35622a;
        ViewGroup viewGroup = this.f35623b;
        if (yiVar == null) {
            return a(viewGroup, c6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) c6Var.getRootView();
        RectF a2 = a(viewGroup2, c6Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void e() {
        RectF rectF = this.f35633n;
        ViewGroup viewGroup = this.f35623b;
        c6 c6Var = this.d;
        yi yiVar = this.f35622a;
        if (yiVar == null) {
            f(c6Var, this.f35624c, viewGroup, rectF);
        } else if (c6Var.isAttachedToWindow() && c6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, c6Var));
            rectF.offset(0.0f, yiVar.f33256o2 - yiVar.f33289y0);
        }
    }
}
