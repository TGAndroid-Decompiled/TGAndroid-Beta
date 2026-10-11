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
public final class y8 {
    public final yi f35774a;
    public final ViewGroup f35775b;
    public final View f35776c;
    public final e6 d;
    public final c5 f35777e;
    public final TL_wallet.walletTransaction f35778f;
    public final Runnable f35779g;
    public final w8 h;
    public final e6 f35780i;
    public final n8 f35781j = new n8();
    public final PathInterpolator f35782k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35783l;
    public final AnimatorSet f35784m;
    public final RectF f35785n;
    public final RectF f35786o;
    public z2 f35787p;
    public boolean f35788q;
    public boolean f35789r;
    public boolean f35790s;
    public final long f35791t;
    public final v8 f35792u;

    public y8(ViewGroup viewGroup, View view, e6 e6Var, c5 c5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, yi yiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35784m = animatorSet;
        this.f35786o = new RectF();
        this.f35791t = SystemClock.uptimeMillis();
        this.f35792u = new Runnable(this) {
            public final y8 f35677b;

            {
                this.f35677b = this;
            }

            @Override
            public final void run() {
                z2 z2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        y8 y8Var = this.f35677b;
                        e6 e6Var2 = y8Var.d;
                        ViewGroup viewGroup2 = y8Var.f35775b;
                        AnimatorSet animatorSet2 = y8Var.f35784m;
                        e6 e6Var3 = y8Var.f35780i;
                        RectF rectF = y8Var.f35786o;
                        RectF rectF2 = y8Var.f35785n;
                        if (!y8Var.f35790s && !y8Var.f35789r) {
                            y8Var.e();
                            y8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            c5 c5Var2 = y8Var.f35777e;
                            TL_wallet.walletTransaction wallettransaction3 = y8Var.f35778f;
                            l71 l71Var = c5Var2.f34790p0[0];
                            z2 z2Var2 = null;
                            if (l71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < l71Var.getChildCount()) {
                                        View childAt = l71Var.getChildAt(i10);
                                        if ((childAt instanceof z2) && (wallettransaction2 = (z2Var = (z2) childAt).R) != null && x2.a(wallettransaction2, wallettransaction3)) {
                                            z2Var2 = z2Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (z2Var2 != null && z2Var2.getWidth() > 0) {
                                z2 z2Var3 = y8Var.f35787p;
                                if (z2Var3 != z2Var2) {
                                    if (z2Var3 != null) {
                                        z2Var3.g(false);
                                    }
                                    y8Var.f35787p = z2Var2;
                                    z2Var2.g(true);
                                }
                                e6 pendingDiamond = y8Var.f35787p.getPendingDiamond();
                                if (y8Var.f35788q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !y8Var.f35787p.isLayoutRequested()) {
                                    rectF.set(y8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        y8Var.f35789r = true;
                                        e6Var3.f(e6Var2);
                                        e6Var3.setAlpha(1.0f);
                                        e6Var2.setAlpha(0.0f);
                                        y8Var.f35781j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - y8Var.f35791t <= 450 && viewGroup2.isAttachedToWindow()) {
                                y8Var.h.postOnAnimation(y8Var.f35792u);
                                return;
                            }
                            y8Var.f35789r = true;
                            e6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35677b.f35788q = true;
                        return;
                }
            }
        };
        this.f35774a = yiVar;
        this.f35775b = viewGroup;
        this.f35776c = view;
        this.d = e6Var;
        this.f35783l = e6Var.getAlpha();
        this.f35777e = c5Var;
        this.f35778f = wallettransaction;
        this.f35779g = runnable;
        RectF a2 = a(viewGroup, e6Var);
        this.f35785n = a2;
        w8 w8Var = new w8(this, viewGroup.getContext());
        this.h = w8Var;
        w8Var.setClipChildren(false);
        w8Var.setClipToPadding(false);
        w8Var.setClickable(true);
        e6 e6Var2 = new e6(60, viewGroup.getContext(), false);
        this.f35780i = e6Var2;
        e6Var2.setContinuousRotation(540.0f);
        e6Var2.f(e6Var);
        e6Var2.setAlpha(0.0f);
        w8Var.addView(e6Var2, w7.x5.e(60, 60, 51));
        viewGroup.addView(w8Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        e6Var2.l(new Runnable(this) {
            public final y8 f35677b;

            {
                this.f35677b = this;
            }

            @Override
            public final void run() {
                z2 z2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        y8 y8Var = this.f35677b;
                        e6 e6Var22 = y8Var.d;
                        ViewGroup viewGroup2 = y8Var.f35775b;
                        AnimatorSet animatorSet2 = y8Var.f35784m;
                        e6 e6Var3 = y8Var.f35780i;
                        RectF rectF = y8Var.f35786o;
                        RectF rectF2 = y8Var.f35785n;
                        if (!y8Var.f35790s && !y8Var.f35789r) {
                            y8Var.e();
                            y8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            c5 c5Var2 = y8Var.f35777e;
                            TL_wallet.walletTransaction wallettransaction3 = y8Var.f35778f;
                            l71 l71Var = c5Var2.f34790p0[0];
                            z2 z2Var2 = null;
                            if (l71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < l71Var.getChildCount()) {
                                        View childAt = l71Var.getChildAt(i10);
                                        if ((childAt instanceof z2) && (wallettransaction2 = (z2Var = (z2) childAt).R) != null && x2.a(wallettransaction2, wallettransaction3)) {
                                            z2Var2 = z2Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (z2Var2 != null && z2Var2.getWidth() > 0) {
                                z2 z2Var3 = y8Var.f35787p;
                                if (z2Var3 != z2Var2) {
                                    if (z2Var3 != null) {
                                        z2Var3.g(false);
                                    }
                                    y8Var.f35787p = z2Var2;
                                    z2Var2.g(true);
                                }
                                e6 pendingDiamond = y8Var.f35787p.getPendingDiamond();
                                if (y8Var.f35788q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !y8Var.f35787p.isLayoutRequested()) {
                                    rectF.set(y8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        y8Var.f35789r = true;
                                        e6Var3.f(e6Var22);
                                        e6Var3.setAlpha(1.0f);
                                        e6Var22.setAlpha(0.0f);
                                        y8Var.f35781j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - y8Var.f35791t <= 450 && viewGroup2.isAttachedToWindow()) {
                                y8Var.h.postOnAnimation(y8Var.f35792u);
                                return;
                            }
                            y8Var.f35789r = true;
                            e6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f35677b.f35788q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new u2(this, 9));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new x8(this, yiVar, e6Var));
        c5Var.f34780f0 = 0;
        ci.h1 h1Var = c5Var.f34788n0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
        c5Var.F0(false);
        f71 f71Var = c5Var.f26675a;
        if (f71Var != null) {
            f71Var.B0();
            c5Var.f26675a.V2.h1(0, 0);
            l71 l71Var = c5Var.f34790p0[0];
            if (l71Var != null) {
                d71 d71Var = l71Var.W2;
                l71Var.B0();
                d71Var.N(false);
                for (int i10 = 0; i10 < d71Var.f25652x.size(); i10++) {
                    q61 G = d71Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = x2.f35723a;
                            if ((wallettransaction2 instanceof w2 ? ((w2) wallettransaction2).f35692a : wallettransaction2) == wallettransaction || l0.d0((TL_wallet.walletTransaction) obj, wallettransaction)) {
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
        this.h.post(this.f35792u);
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
        if (this.f35790s) {
            return;
        }
        this.f35790s = true;
        v8 v8Var = this.f35792u;
        w8 w8Var = this.h;
        w8Var.removeCallbacks(v8Var);
        e6 e6Var = this.f35780i;
        e6Var.l(null);
        z2 z2Var = this.f35787p;
        if (z2Var != null && (wallettransaction = z2Var.R) != null && x2.a(wallettransaction, this.f35778f)) {
            e6 pendingDiamond = this.f35787p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(e6Var);
            }
            this.f35787p.g(false);
            RectF rectF = this.f35786o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f35785n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                z2 z2Var2 = this.f35787p;
                z2Var2.d();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                z2Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.f17024u = lVar;
                z2Var2.H.e(0.001f);
                z2Var2.H.f17013a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                z2Var2.H.b(new t2(z2Var2, 0));
                z2Var2.H.h();
            }
        }
        e6Var.setPaused(true);
        w8Var.removeView(e6Var);
        w8Var.setClickable(false);
        this.d.setAlpha(this.f35783l);
        yi yiVar = this.f35774a;
        if (yiVar == null) {
            this.f35776c.setTranslationY(0.0f);
        } else {
            yiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35775b;
        if (yiVar != null && this.f35781j.d()) {
            c5 c5Var = this.f35777e;
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
        this.f35779g.run();
        AndroidUtilities.runOnUIThread(new i(18, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        w8 w8Var = this.h;
        float f12 = dp / 2.0f;
        e6 e6Var = this.f35780i;
        e6Var.setTranslationX((f7 - w8Var.getLeft()) - f12);
        e6Var.setTranslationY((f10 - w8Var.getTop()) - f12);
        float f13 = f11 / dp;
        e6Var.setScaleX(f13);
        e6Var.setScaleY(f13);
    }

    public final RectF d(e6 e6Var) {
        yi yiVar = this.f35774a;
        ViewGroup viewGroup = this.f35775b;
        if (yiVar == null) {
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
        RectF rectF = this.f35785n;
        ViewGroup viewGroup = this.f35775b;
        e6 e6Var = this.d;
        yi yiVar = this.f35774a;
        if (yiVar == null) {
            f(e6Var, this.f35776c, viewGroup, rectF);
        } else if (e6Var.isAttachedToWindow() && e6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, e6Var));
            rectF.offset(0.0f, yiVar.f33317o2 - yiVar.f33350y0);
        }
    }
}
