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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.vi;
import org.telegram.ui.wg1;
public final class w8 {
    public final vi f33559a;
    public final ViewGroup f33560b;
    public final View f33561c;
    public final c6 d;
    public final a5 e;
    public final TL_wallet.walletTransaction f33562f;
    public final Runnable f33563g;
    public final u8 h;
    public final c6 f33564i;
    public final l8 f33565j = new l8();
    public final PathInterpolator f33566k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f33567l;
    public final AnimatorSet f33568m;
    public final RectF f33569n;
    public final RectF f33570o;
    public y2 f33571p;
    public boolean f33572q;
    public boolean f33573r;
    public boolean f33574s;
    public final long f33575t;
    public final t8 f33576u;

    public w8(ViewGroup viewGroup, View view, c6 c6Var, a5 a5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, vi viVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33568m = animatorSet;
        this.f33570o = new RectF();
        this.f33575t = SystemClock.uptimeMillis();
        this.f33576u = new Runnable(this) {
            public final w8 f33463b;

            {
                this.f33463b = this;
            }

            @Override
            public final void run() {
                y2 y2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f33463b;
                        c6 c6Var2 = w8Var.d;
                        ViewGroup viewGroup2 = w8Var.f33560b;
                        AnimatorSet animatorSet2 = w8Var.f33568m;
                        c6 c6Var3 = w8Var.f33564i;
                        RectF rectF = w8Var.f33570o;
                        RectF rectF2 = w8Var.f33569n;
                        if (!w8Var.f33574s && !w8Var.f33573r) {
                            w8Var.e();
                            w8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            a5 a5Var2 = w8Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = w8Var.f33562f;
                            i71 i71Var = a5Var2.f32652p0[0];
                            y2 y2Var2 = null;
                            if (i71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < i71Var.getChildCount()) {
                                        View childAt = i71Var.getChildAt(i10);
                                        if ((childAt instanceof y2) && (wallettransaction2 = (y2Var = (y2) childAt).R) != null && w2.a(wallettransaction2, wallettransaction3)) {
                                            y2Var2 = y2Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (y2Var2 != null && y2Var2.getWidth() > 0) {
                                y2 y2Var3 = w8Var.f33571p;
                                if (y2Var3 != y2Var2) {
                                    if (y2Var3 != null) {
                                        y2Var3.g(false);
                                    }
                                    w8Var.f33571p = y2Var2;
                                    y2Var2.g(true);
                                }
                                c6 pendingDiamond = w8Var.f33571p.getPendingDiamond();
                                if (w8Var.f33572q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !w8Var.f33571p.isLayoutRequested()) {
                                    rectF.set(w8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        w8Var.f33573r = true;
                                        c6Var3.f(c6Var2);
                                        c6Var3.setAlpha(1.0f);
                                        c6Var2.setAlpha(0.0f);
                                        w8Var.f33565j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - w8Var.f33575t <= 450 && viewGroup2.isAttachedToWindow()) {
                                w8Var.h.postOnAnimation(w8Var.f33576u);
                                return;
                            }
                            w8Var.f33573r = true;
                            c6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f33463b.f33572q = true;
                        return;
                }
            }
        };
        this.f33559a = viVar;
        this.f33560b = viewGroup;
        this.f33561c = view;
        this.d = c6Var;
        this.f33567l = c6Var.getAlpha();
        this.e = a5Var;
        this.f33562f = wallettransaction;
        this.f33563g = runnable;
        RectF a2 = a(viewGroup, c6Var);
        this.f33569n = a2;
        u8 u8Var = new u8(this, viewGroup.getContext());
        this.h = u8Var;
        u8Var.setClipChildren(false);
        u8Var.setClipToPadding(false);
        u8Var.setClickable(true);
        c6 c6Var2 = new c6(60, viewGroup.getContext(), false);
        this.f33564i = c6Var2;
        c6Var2.setContinuousRotation(540.0f);
        c6Var2.f(c6Var);
        c6Var2.setAlpha(0.0f);
        u8Var.addView(c6Var2, w7.z5.e(60, 60, 51));
        viewGroup.addView(u8Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        c6Var2.l(new Runnable(this) {
            public final w8 f33463b;

            {
                this.f33463b = this;
            }

            @Override
            public final void run() {
                y2 y2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f33463b;
                        c6 c6Var22 = w8Var.d;
                        ViewGroup viewGroup2 = w8Var.f33560b;
                        AnimatorSet animatorSet2 = w8Var.f33568m;
                        c6 c6Var3 = w8Var.f33564i;
                        RectF rectF = w8Var.f33570o;
                        RectF rectF2 = w8Var.f33569n;
                        if (!w8Var.f33574s && !w8Var.f33573r) {
                            w8Var.e();
                            w8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            a5 a5Var2 = w8Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = w8Var.f33562f;
                            i71 i71Var = a5Var2.f32652p0[0];
                            y2 y2Var2 = null;
                            if (i71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < i71Var.getChildCount()) {
                                        View childAt = i71Var.getChildAt(i10);
                                        if ((childAt instanceof y2) && (wallettransaction2 = (y2Var = (y2) childAt).R) != null && w2.a(wallettransaction2, wallettransaction3)) {
                                            y2Var2 = y2Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (y2Var2 != null && y2Var2.getWidth() > 0) {
                                y2 y2Var3 = w8Var.f33571p;
                                if (y2Var3 != y2Var2) {
                                    if (y2Var3 != null) {
                                        y2Var3.g(false);
                                    }
                                    w8Var.f33571p = y2Var2;
                                    y2Var2.g(true);
                                }
                                c6 pendingDiamond = w8Var.f33571p.getPendingDiamond();
                                if (w8Var.f33572q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !w8Var.f33571p.isLayoutRequested()) {
                                    rectF.set(w8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        w8Var.f33573r = true;
                                        c6Var3.f(c6Var22);
                                        c6Var3.setAlpha(1.0f);
                                        c6Var22.setAlpha(0.0f);
                                        w8Var.f33565j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - w8Var.f33575t <= 450 && viewGroup2.isAttachedToWindow()) {
                                w8Var.h.postOnAnimation(w8Var.f33576u);
                                return;
                            }
                            w8Var.f33573r = true;
                            c6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f33463b.f33572q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new t2(this, 9));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new v8(this, viVar, c6Var));
        a5Var.f32642f0 = 0;
        di.h1 h1Var = a5Var.f32650n0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
        a5Var.F0(false);
        c71 c71Var = a5Var.f24003a;
        if (c71Var != null) {
            c71Var.B0();
            a5Var.f24003a.V2.h1(0, 0);
            i71 i71Var = a5Var.f32652p0[0];
            if (i71Var != null) {
                a71 a71Var = i71Var.W2;
                i71Var.B0();
                a71Var.N(false);
                for (int i10 = 0; i10 < a71Var.f23148x.size(); i10++) {
                    m61 G = a71Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = w2.f33545a;
                            if ((wallettransaction2 instanceof v2 ? ((v2) wallettransaction2).f33499a : wallettransaction2) == wallettransaction || k0.d0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                i71Var.V2.h1(i10, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f33576u);
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
        if (this.f33574s) {
            return;
        }
        this.f33574s = true;
        t8 t8Var = this.f33576u;
        u8 u8Var = this.h;
        u8Var.removeCallbacks(t8Var);
        c6 c6Var = this.f33564i;
        c6Var.l(null);
        y2 y2Var = this.f33571p;
        if (y2Var != null && (wallettransaction = y2Var.R) != null && w2.a(wallettransaction, this.f33562f)) {
            c6 pendingDiamond = this.f33571p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(c6Var);
            }
            this.f33571p.g(false);
            RectF rectF = this.f33570o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f33569n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                y2 y2Var2 = this.f33571p;
                y2Var2.e();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                y2Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.f16161u = lVar;
                y2Var2.H.e(0.001f);
                y2Var2.H.f16151a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                y2Var2.H.b(new s2(y2Var2, 0));
                y2Var2.H.h();
            }
        }
        c6Var.setPaused(true);
        u8Var.removeView(c6Var);
        u8Var.setClickable(false);
        this.d.setAlpha(this.f33567l);
        vi viVar = this.f33559a;
        if (viVar == null) {
            this.f33561c.setTranslationY(0.0f);
        } else {
            viVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f33560b;
        if (viVar != null && this.f33565j.d()) {
            a5 a5Var = this.e;
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
        this.f33563g.run();
        AndroidUtilities.runOnUIThread(new wg1(25, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        u8 u8Var = this.h;
        float f12 = dp / 2.0f;
        c6 c6Var = this.f33564i;
        c6Var.setTranslationX((f7 - u8Var.getLeft()) - f12);
        c6Var.setTranslationY((f10 - u8Var.getTop()) - f12);
        float f13 = f11 / dp;
        c6Var.setScaleX(f13);
        c6Var.setScaleY(f13);
    }

    public final RectF d(c6 c6Var) {
        vi viVar = this.f33559a;
        ViewGroup viewGroup = this.f33560b;
        if (viVar == null) {
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
        RectF rectF = this.f33569n;
        ViewGroup viewGroup = this.f33560b;
        c6 c6Var = this.d;
        vi viVar = this.f33559a;
        if (viVar == null) {
            f(c6Var, this.f33561c, viewGroup, rectF);
        } else if (c6Var.isAttachedToWindow() && c6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, c6Var));
            rectF.offset(0.0f, viVar.f29700o2 - viVar.f29733y0);
        }
    }
}
