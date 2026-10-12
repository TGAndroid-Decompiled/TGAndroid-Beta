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
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.z61;
public final class w8 {
    public final vi f33804a;
    public final ViewGroup f33805b;
    public final View f33806c;
    public final b6 d;
    public final z4 e;
    public final TL_wallet.walletTransaction f33807f;
    public final Runnable f33808g;
    public final u8 h;
    public final b6 f33809i;
    public final k8 f33810j = new k8();
    public final PathInterpolator f33811k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f33812l;
    public final AnimatorSet f33813m;
    public final RectF f33814n;
    public final RectF f33815o;
    public x2 f33816p;
    public boolean f33817q;
    public boolean f33818r;
    public boolean f33819s;
    public final long f33820t;
    public final s8 f33821u;

    public w8(ViewGroup viewGroup, View view, b6 b6Var, z4 z4Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, vi viVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33813m = animatorSet;
        this.f33815o = new RectF();
        this.f33820t = SystemClock.uptimeMillis();
        this.f33821u = new Runnable(this) {
            public final w8 f33689b;

            {
                this.f33689b = this;
            }

            @Override
            public final void run() {
                x2 x2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f33689b;
                        b6 b6Var2 = w8Var.d;
                        ViewGroup viewGroup2 = w8Var.f33805b;
                        AnimatorSet animatorSet2 = w8Var.f33813m;
                        b6 b6Var3 = w8Var.f33809i;
                        RectF rectF = w8Var.f33815o;
                        RectF rectF2 = w8Var.f33814n;
                        if (!w8Var.f33819s && !w8Var.f33818r) {
                            w8Var.e();
                            w8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            z4 z4Var2 = w8Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = w8Var.f33807f;
                            h71 h71Var = z4Var2.f33935p0[0];
                            x2 x2Var2 = null;
                            if (h71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < h71Var.getChildCount()) {
                                        View childAt = h71Var.getChildAt(i10);
                                        if ((childAt instanceof x2) && (wallettransaction2 = (x2Var = (x2) childAt).R) != null && v2.a(wallettransaction2, wallettransaction3)) {
                                            x2Var2 = x2Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (x2Var2 != null && x2Var2.getWidth() > 0) {
                                x2 x2Var3 = w8Var.f33816p;
                                if (x2Var3 != x2Var2) {
                                    if (x2Var3 != null) {
                                        x2Var3.g(false);
                                    }
                                    w8Var.f33816p = x2Var2;
                                    x2Var2.g(true);
                                }
                                b6 pendingDiamond = w8Var.f33816p.getPendingDiamond();
                                if (w8Var.f33817q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !w8Var.f33816p.isLayoutRequested()) {
                                    rectF.set(w8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        w8Var.f33818r = true;
                                        b6Var3.f(b6Var2);
                                        b6Var3.setAlpha(1.0f);
                                        b6Var2.setAlpha(0.0f);
                                        w8Var.f33810j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - w8Var.f33820t <= 450 && viewGroup2.isAttachedToWindow()) {
                                w8Var.h.postOnAnimation(w8Var.f33821u);
                                return;
                            }
                            w8Var.f33818r = true;
                            b6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f33689b.f33817q = true;
                        return;
                }
            }
        };
        this.f33804a = viVar;
        this.f33805b = viewGroup;
        this.f33806c = view;
        this.d = b6Var;
        this.f33812l = b6Var.getAlpha();
        this.e = z4Var;
        this.f33807f = wallettransaction;
        this.f33808g = runnable;
        RectF a2 = a(viewGroup, b6Var);
        this.f33814n = a2;
        u8 u8Var = new u8(this, viewGroup.getContext());
        this.h = u8Var;
        u8Var.setClipChildren(false);
        u8Var.setClipToPadding(false);
        u8Var.setClickable(true);
        b6 b6Var2 = new b6(60, viewGroup.getContext(), false);
        this.f33809i = b6Var2;
        b6Var2.setContinuousRotation(540.0f);
        b6Var2.f(b6Var);
        b6Var2.setAlpha(0.0f);
        u8Var.addView(b6Var2, w7.a6.e(60, 60, 51));
        viewGroup.addView(u8Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        b6Var2.l(new Runnable(this) {
            public final w8 f33689b;

            {
                this.f33689b = this;
            }

            @Override
            public final void run() {
                x2 x2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f33689b;
                        b6 b6Var22 = w8Var.d;
                        ViewGroup viewGroup2 = w8Var.f33805b;
                        AnimatorSet animatorSet2 = w8Var.f33813m;
                        b6 b6Var3 = w8Var.f33809i;
                        RectF rectF = w8Var.f33815o;
                        RectF rectF2 = w8Var.f33814n;
                        if (!w8Var.f33819s && !w8Var.f33818r) {
                            w8Var.e();
                            w8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            z4 z4Var2 = w8Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = w8Var.f33807f;
                            h71 h71Var = z4Var2.f33935p0[0];
                            x2 x2Var2 = null;
                            if (h71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < h71Var.getChildCount()) {
                                        View childAt = h71Var.getChildAt(i10);
                                        if ((childAt instanceof x2) && (wallettransaction2 = (x2Var = (x2) childAt).R) != null && v2.a(wallettransaction2, wallettransaction3)) {
                                            x2Var2 = x2Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (x2Var2 != null && x2Var2.getWidth() > 0) {
                                x2 x2Var3 = w8Var.f33816p;
                                if (x2Var3 != x2Var2) {
                                    if (x2Var3 != null) {
                                        x2Var3.g(false);
                                    }
                                    w8Var.f33816p = x2Var2;
                                    x2Var2.g(true);
                                }
                                b6 pendingDiamond = w8Var.f33816p.getPendingDiamond();
                                if (w8Var.f33817q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !w8Var.f33816p.isLayoutRequested()) {
                                    rectF.set(w8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        w8Var.f33818r = true;
                                        b6Var3.f(b6Var22);
                                        b6Var3.setAlpha(1.0f);
                                        b6Var22.setAlpha(0.0f);
                                        w8Var.f33810j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - w8Var.f33820t <= 450 && viewGroup2.isAttachedToWindow()) {
                                w8Var.h.postOnAnimation(w8Var.f33821u);
                                return;
                            }
                            w8Var.f33818r = true;
                            b6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f33689b.f33817q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new s2(this, 9));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new v8(this, viVar, b6Var));
        z4Var.f33925f0 = 0;
        di.h1 h1Var = z4Var.f33933n0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
        z4Var.F0(false);
        b71 b71Var = z4Var.f23964a;
        if (b71Var != null) {
            b71Var.B0();
            z4Var.f23964a.V2.h1(0, 0);
            h71 h71Var = z4Var.f33935p0[0];
            if (h71Var != null) {
                z61 z61Var = h71Var.W2;
                h71Var.B0();
                z61Var.N(false);
                for (int i10 = 0; i10 < z61Var.f31783x.size(); i10++) {
                    l61 G = z61Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = v2.f33771a;
                            if ((wallettransaction2 instanceof u2 ? ((u2) wallettransaction2).f33727a : wallettransaction2) == wallettransaction || j0.d0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                h71Var.V2.h1(i10, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f33821u);
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
        if (this.f33819s) {
            return;
        }
        this.f33819s = true;
        s8 s8Var = this.f33821u;
        u8 u8Var = this.h;
        u8Var.removeCallbacks(s8Var);
        b6 b6Var = this.f33809i;
        b6Var.l(null);
        x2 x2Var = this.f33816p;
        if (x2Var != null && (wallettransaction = x2Var.R) != null && v2.a(wallettransaction, this.f33807f)) {
            b6 pendingDiamond = this.f33816p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(b6Var);
            }
            this.f33816p.g(false);
            RectF rectF = this.f33815o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f33814n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                x2 x2Var2 = this.f33816p;
                x2Var2.e();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                x2Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.f16468u = lVar;
                x2Var2.H.e(0.001f);
                x2Var2.H.f16458a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                x2Var2.H.b(new r2(x2Var2, 0));
                x2Var2.H.h();
            }
        }
        b6Var.setPaused(true);
        u8Var.removeView(b6Var);
        u8Var.setClickable(false);
        this.d.setAlpha(this.f33812l);
        vi viVar = this.f33804a;
        if (viVar == null) {
            this.f33806c.setTranslationY(0.0f);
        } else {
            viVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f33805b;
        if (viVar != null && this.f33810j.d()) {
            z4 z4Var = this.e;
            if (z4Var.getParentLayout() != null) {
                ViewGroup view = z4Var.getParentLayout().getView();
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
        this.f33808g.run();
        AndroidUtilities.runOnUIThread(new t8(0, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        u8 u8Var = this.h;
        float f12 = dp / 2.0f;
        b6 b6Var = this.f33809i;
        b6Var.setTranslationX((f7 - u8Var.getLeft()) - f12);
        b6Var.setTranslationY((f10 - u8Var.getTop()) - f12);
        float f13 = f11 / dp;
        b6Var.setScaleX(f13);
        b6Var.setScaleY(f13);
    }

    public final RectF d(b6 b6Var) {
        vi viVar = this.f33804a;
        ViewGroup viewGroup = this.f33805b;
        if (viVar == null) {
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
        RectF rectF = this.f33814n;
        ViewGroup viewGroup = this.f33805b;
        b6 b6Var = this.d;
        vi viVar = this.f33804a;
        if (viVar == null) {
            f(b6Var, this.f33806c, viewGroup, rectF);
        } else if (b6Var.isAttachedToWindow() && b6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, b6Var));
            rectF.offset(0.0f, viVar.f30029o2 - viVar.f30062y0);
        }
    }
}
