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
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
public final class da {
    public final ki f43761a;
    public final ViewGroup f43762b;
    public final View f43763c;
    public final w6 d;
    public final y5 f43764e;
    public final TL_wallet.walletTransaction f43765f;
    public final Runnable f43766g;
    public final ba h;
    public final w6 f43767i;
    public final r9 f43768j = new r9();
    public final PathInterpolator f43769k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f43770l;
    public final AnimatorSet f43771m;
    public final RectF f43772n;
    public final RectF f43773o;
    public v3 f43774p;
    public boolean f43775q;
    public boolean f43776r;
    public boolean f43777s;
    public final long f43778t;
    public final aa f43779u;

    public da(ViewGroup viewGroup, View view, w6 w6Var, y5 y5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ki kiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43771m = animatorSet;
        this.f43773o = new RectF();
        this.f43778t = SystemClock.uptimeMillis();
        this.f43779u = new Runnable(this) {
            public final da f43489b;

            {
                this.f43489b = this;
            }

            @Override
            public final void run() {
                v3 v3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        da daVar = this.f43489b;
                        w6 w6Var2 = daVar.d;
                        ViewGroup viewGroup2 = daVar.f43762b;
                        AnimatorSet animatorSet2 = daVar.f43771m;
                        w6 w6Var3 = daVar.f43767i;
                        RectF rectF = daVar.f43773o;
                        RectF rectF2 = daVar.f43772n;
                        if (!daVar.f43777s && !daVar.f43776r) {
                            daVar.e();
                            daVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            y5 y5Var2 = daVar.f43764e;
                            TL_wallet.walletTransaction wallettransaction3 = daVar.f43765f;
                            u41 u41Var = y5Var2.f44749s0[0];
                            v3 v3Var2 = null;
                            if (u41Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < u41Var.getChildCount()) {
                                        View childAt = u41Var.getChildAt(i7);
                                        if ((childAt instanceof v3) && (wallettransaction2 = (v3Var = (v3) childAt).S) != null && t3.i(wallettransaction2, wallettransaction3)) {
                                            v3Var2 = v3Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (v3Var2 != null && v3Var2.getWidth() > 0) {
                                v3 v3Var3 = daVar.f43774p;
                                if (v3Var3 != v3Var2) {
                                    if (v3Var3 != null) {
                                        v3Var3.f(false);
                                    }
                                    daVar.f43774p = v3Var2;
                                    v3Var2.f(true);
                                }
                                w6 pendingDiamond = daVar.f43774p.getPendingDiamond();
                                if (daVar.f43775q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !daVar.f43774p.isLayoutRequested()) {
                                    rectF.set(daVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        daVar.f43776r = true;
                                        w6Var3.f(w6Var2);
                                        w6Var3.setAlpha(1.0f);
                                        w6Var2.setAlpha(0.0f);
                                        daVar.f43768j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - daVar.f43778t <= 450 && viewGroup2.isAttachedToWindow()) {
                                daVar.h.postOnAnimation(daVar.f43779u);
                                return;
                            }
                            daVar.f43776r = true;
                            w6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f43489b.f43775q = true;
                        return;
                }
            }
        };
        this.f43761a = kiVar;
        this.f43762b = viewGroup;
        this.f43763c = view;
        this.d = w6Var;
        this.f43770l = w6Var.getAlpha();
        this.f43764e = y5Var;
        this.f43765f = wallettransaction;
        this.f43766g = runnable;
        RectF a10 = a(w6Var, viewGroup);
        this.f43772n = a10;
        ba baVar = new ba(this, viewGroup.getContext());
        this.h = baVar;
        baVar.setClipChildren(false);
        baVar.setClipToPadding(false);
        baVar.setClickable(true);
        w6 w6Var2 = new w6(60, viewGroup.getContext(), true);
        this.f43767i = w6Var2;
        w6Var2.setContinuousRotation(540.0f);
        w6Var2.f(w6Var);
        w6Var2.setAlpha(0.0f);
        baVar.addView(w6Var2, c8.ja.e(60, 60, 51));
        viewGroup.addView(baVar, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        w6Var2.l(new Runnable(this) {
            public final da f43489b;

            {
                this.f43489b = this;
            }

            @Override
            public final void run() {
                v3 v3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        da daVar = this.f43489b;
                        w6 w6Var22 = daVar.d;
                        ViewGroup viewGroup2 = daVar.f43762b;
                        AnimatorSet animatorSet2 = daVar.f43771m;
                        w6 w6Var3 = daVar.f43767i;
                        RectF rectF = daVar.f43773o;
                        RectF rectF2 = daVar.f43772n;
                        if (!daVar.f43777s && !daVar.f43776r) {
                            daVar.e();
                            daVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            y5 y5Var2 = daVar.f43764e;
                            TL_wallet.walletTransaction wallettransaction3 = daVar.f43765f;
                            u41 u41Var = y5Var2.f44749s0[0];
                            v3 v3Var2 = null;
                            if (u41Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < u41Var.getChildCount()) {
                                        View childAt = u41Var.getChildAt(i7);
                                        if ((childAt instanceof v3) && (wallettransaction2 = (v3Var = (v3) childAt).S) != null && t3.i(wallettransaction2, wallettransaction3)) {
                                            v3Var2 = v3Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (v3Var2 != null && v3Var2.getWidth() > 0) {
                                v3 v3Var3 = daVar.f43774p;
                                if (v3Var3 != v3Var2) {
                                    if (v3Var3 != null) {
                                        v3Var3.f(false);
                                    }
                                    daVar.f43774p = v3Var2;
                                    v3Var2.f(true);
                                }
                                w6 pendingDiamond = daVar.f43774p.getPendingDiamond();
                                if (daVar.f43775q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !daVar.f43774p.isLayoutRequested()) {
                                    rectF.set(daVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        daVar.f43776r = true;
                                        w6Var3.f(w6Var22);
                                        w6Var3.setAlpha(1.0f);
                                        w6Var22.setAlpha(0.0f);
                                        daVar.f43768j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - daVar.f43778t <= 450 && viewGroup2.isAttachedToWindow()) {
                                daVar.h.postOnAnimation(daVar.f43779u);
                                return;
                            }
                            daVar.f43776r = true;
                            w6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f43489b.f43775q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new q3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new ca(this, kiVar, w6Var));
        y5Var.P0();
        y5Var.Y0(false);
        bi.v3 v3Var = y5Var.f38880a;
        if (v3Var != null) {
            v3Var.C0();
            y5Var.f38880a.f39891f3.h1(0, 0);
            u41 u41Var = y5Var.f44749s0[0];
            if (u41Var != null) {
                p41 p41Var = u41Var.f39892g3;
                u41Var.C0();
                p41Var.O(false);
                for (int i7 = 0; i7 < p41Var.E.size(); i7++) {
                    b41 G = p41Var.G(i7);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i10 = t3.f44512b;
                            if ((wallettransaction2 instanceof s3 ? ((s3) wallettransaction2).f44480a : wallettransaction2) == wallettransaction || l0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                u41Var.f39891f3.h1(i7, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f43779u);
    }

    public static RectF a(View view, ViewGroup viewGroup) {
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
        if (this.f43777s) {
            return;
        }
        this.f43777s = true;
        aa aaVar = this.f43779u;
        ba baVar = this.h;
        baVar.removeCallbacks(aaVar);
        w6 w6Var = this.f43767i;
        w6Var.l(null);
        v3 v3Var = this.f43774p;
        if (v3Var != null && (wallettransaction = v3Var.S) != null && t3.i(wallettransaction, this.f43765f)) {
            w6 pendingDiamond = this.f43774p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(w6Var);
            }
            this.f43774p.f(false);
            RectF rectF = this.f43773o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f43772n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f23610p;
                v3 v3Var2 = this.f43774p;
                v3Var2.d();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                v3Var2.I = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.f55748m = hVar;
                v3Var2.I.f(0.001f);
                v3Var2.I.f55738a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                v3Var2.I.b(new p3(v3Var2, 0));
                v3Var2.I.h();
            }
        }
        w6Var.setPaused(true);
        baVar.removeView(w6Var);
        baVar.setClickable(false);
        this.d.setAlpha(this.f43770l);
        ki kiVar = this.f43761a;
        if (kiVar == null) {
            this.f43763c.setTranslationY(0.0f);
        } else {
            kiVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f43762b;
        if (kiVar != null && this.f43768j.d()) {
            y5 y5Var = this.f43764e;
            if (y5Var.getParentLayout() != null) {
                ViewGroup view = y5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(baVar);
                    baVar.setTranslationX(iArr[0] - iArr2[0]);
                    baVar.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(baVar, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f43766g.run();
        org.telegram.messenger.g0.i3(new r(20, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        ba baVar = this.h;
        float f13 = L / 2.0f;
        w6 w6Var = this.f43767i;
        w6Var.setTranslationX((f10 - baVar.getLeft()) - f13);
        w6Var.setTranslationY((f11 - baVar.getTop()) - f13);
        float f14 = f12 / L;
        w6Var.setScaleX(f14);
        w6Var.setScaleY(f14);
    }

    public final RectF d(w6 w6Var) {
        ki kiVar = this.f43761a;
        ViewGroup viewGroup = this.f43762b;
        if (kiVar == null) {
            return a(w6Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) w6Var.getRootView();
        RectF a10 = a(w6Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void e() {
        RectF rectF = this.f43772n;
        ViewGroup viewGroup = this.f43762b;
        w6 w6Var = this.d;
        ki kiVar = this.f43761a;
        if (kiVar == null) {
            f(w6Var, this.f43763c, viewGroup, rectF);
        } else if (w6Var.isAttachedToWindow() && w6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(w6Var, viewGroup));
            rectF.offset(0.0f, kiVar.f36451j4 - kiVar.f36485t2);
        }
    }
}
