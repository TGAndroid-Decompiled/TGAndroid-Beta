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
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.w31;
public final class ba {
    public final di f42181a;
    public final ViewGroup f42182b;
    public final View f42183c;
    public final w6 d;
    public final y5 f42184e;
    public final TL_wallet.walletTransaction f42185f;
    public final Runnable f42186g;
    public final z9 h;
    public final w6 f42187i;
    public final p9 f42188j = new p9();
    public final PathInterpolator f42189k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f42190l;
    public final AnimatorSet f42191m;
    public final RectF f42192n;
    public final RectF f42193o;
    public w3 f42194p;
    public boolean f42195q;
    public boolean f42196r;
    public boolean f42197s;
    public final long f42198t;
    public final y9 f42199u;

    public ba(ViewGroup viewGroup, View view, w6 w6Var, y5 y5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, di diVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42191m = animatorSet;
        this.f42193o = new RectF();
        this.f42198t = SystemClock.uptimeMillis();
        this.f42199u = new Runnable(this) {
            public final ba f43406b;

            {
                this.f43406b = this;
            }

            @Override
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        ba baVar = this.f43406b;
                        w6 w6Var2 = baVar.d;
                        ViewGroup viewGroup2 = baVar.f42182b;
                        AnimatorSet animatorSet2 = baVar.f42191m;
                        w6 w6Var3 = baVar.f42187i;
                        RectF rectF = baVar.f42193o;
                        RectF rectF2 = baVar.f42192n;
                        if (!baVar.f42197s && !baVar.f42196r) {
                            baVar.e();
                            baVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            y5 y5Var2 = baVar.f42184e;
                            TL_wallet.walletTransaction wallettransaction3 = baVar.f42185f;
                            p41 p41Var = y5Var2.f43386r0[0];
                            w3 w3Var2 = null;
                            if (p41Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < p41Var.getChildCount()) {
                                        View childAt = p41Var.getChildAt(i7);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = baVar.f42194p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    baVar.f42194p = w3Var2;
                                    w3Var2.f(true);
                                }
                                w6 pendingDiamond = baVar.f42194p.getPendingDiamond();
                                if (baVar.f42195q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !baVar.f42194p.isLayoutRequested()) {
                                    rectF.set(baVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        baVar.f42196r = true;
                                        w6Var3.f(w6Var2);
                                        w6Var3.setAlpha(1.0f);
                                        w6Var2.setAlpha(0.0f);
                                        baVar.f42188j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - baVar.f42198t <= 450 && viewGroup2.isAttachedToWindow()) {
                                baVar.h.postOnAnimation(baVar.f42199u);
                                return;
                            }
                            baVar.f42196r = true;
                            w6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f43406b.f42195q = true;
                        return;
                }
            }
        };
        this.f42181a = diVar;
        this.f42182b = viewGroup;
        this.f42183c = view;
        this.d = w6Var;
        this.f42190l = w6Var.getAlpha();
        this.f42184e = y5Var;
        this.f42185f = wallettransaction;
        this.f42186g = runnable;
        RectF a10 = a(w6Var, viewGroup);
        this.f42192n = a10;
        z9 z9Var = new z9(this, viewGroup.getContext());
        this.h = z9Var;
        z9Var.setClipChildren(false);
        z9Var.setClipToPadding(false);
        z9Var.setClickable(true);
        w6 w6Var2 = new w6(60, viewGroup.getContext(), true);
        this.f42187i = w6Var2;
        w6Var2.setContinuousRotation(540.0f);
        w6Var2.f(w6Var);
        w6Var2.setAlpha(0.0f);
        z9Var.addView(w6Var2, c8.ha.e(60, 60, 51));
        viewGroup.addView(z9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        w6Var2.l(new Runnable(this) {
            public final ba f43406b;

            {
                this.f43406b = this;
            }

            @Override
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        ba baVar = this.f43406b;
                        w6 w6Var22 = baVar.d;
                        ViewGroup viewGroup2 = baVar.f42182b;
                        AnimatorSet animatorSet2 = baVar.f42191m;
                        w6 w6Var3 = baVar.f42187i;
                        RectF rectF = baVar.f42193o;
                        RectF rectF2 = baVar.f42192n;
                        if (!baVar.f42197s && !baVar.f42196r) {
                            baVar.e();
                            baVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            y5 y5Var2 = baVar.f42184e;
                            TL_wallet.walletTransaction wallettransaction3 = baVar.f42185f;
                            p41 p41Var = y5Var2.f43386r0[0];
                            w3 w3Var2 = null;
                            if (p41Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < p41Var.getChildCount()) {
                                        View childAt = p41Var.getChildAt(i7);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = baVar.f42194p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    baVar.f42194p = w3Var2;
                                    w3Var2.f(true);
                                }
                                w6 pendingDiamond = baVar.f42194p.getPendingDiamond();
                                if (baVar.f42195q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !baVar.f42194p.isLayoutRequested()) {
                                    rectF.set(baVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        baVar.f42196r = true;
                                        w6Var3.f(w6Var22);
                                        w6Var3.setAlpha(1.0f);
                                        w6Var22.setAlpha(0.0f);
                                        baVar.f42188j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - baVar.f42198t <= 450 && viewGroup2.isAttachedToWindow()) {
                                baVar.h.postOnAnimation(baVar.f42199u);
                                return;
                            }
                            baVar.f42196r = true;
                            w6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f43406b.f42195q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new r3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new aa(this, diVar, w6Var));
        y5Var.O0();
        y5Var.X0(false);
        fi.w3 w3Var = y5Var.f35844a;
        if (w3Var != null) {
            w3Var.C0();
            y5Var.f35844a.f36780e3.h1(0, 0);
            p41 p41Var = y5Var.f43386r0[0];
            if (p41Var != null) {
                k41 k41Var = p41Var.f36781f3;
                p41Var.C0();
                k41Var.O(false);
                for (int i7 = 0; i7 < k41Var.D.size(); i7++) {
                    w31 G = k41Var.G(i7);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i10 = u3.f43201b;
                            if ((wallettransaction2 instanceof t3 ? ((t3) wallettransaction2).f43158a : wallettransaction2) == wallettransaction || n0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                p41Var.f36780e3.h1(i7, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f42199u);
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
        if (this.f42197s) {
            return;
        }
        this.f42197s = true;
        y9 y9Var = this.f42199u;
        z9 z9Var = this.h;
        z9Var.removeCallbacks(y9Var);
        w6 w6Var = this.f42187i;
        w6Var.l(null);
        w3 w3Var = this.f42194p;
        if (w3Var != null && (wallettransaction = w3Var.R) != null && u3.i(wallettransaction, this.f42185f)) {
            w6 pendingDiamond = this.f42194p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(w6Var);
            }
            this.f42194p.f(false);
            RectF rectF = this.f42193o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f42192n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f22536p;
                w3 w3Var2 = this.f42194p;
                w3Var2.d();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                w3Var2.H = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.f54175m = hVar;
                w3Var2.H.f(0.001f);
                w3Var2.H.f54165a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                w3Var2.H.b(new q3(w3Var2, 0));
                w3Var2.H.h();
            }
        }
        w6Var.setPaused(true);
        z9Var.removeView(w6Var);
        z9Var.setClickable(false);
        this.d.setAlpha(this.f42190l);
        di diVar = this.f42181a;
        if (diVar == null) {
            this.f42183c.setTranslationY(0.0f);
        } else {
            diVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f42182b;
        if (diVar != null && this.f42188j.d()) {
            y5 y5Var = this.f42184e;
            if (y5Var.getParentLayout() != null) {
                ViewGroup view = y5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(z9Var);
                    z9Var.setTranslationX(iArr[0] - iArr2[0]);
                    z9Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(z9Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f42186g.run();
        org.telegram.messenger.g0.i3(new n(24, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        z9 z9Var = this.h;
        float f13 = L / 2.0f;
        w6 w6Var = this.f42187i;
        w6Var.setTranslationX((f10 - z9Var.getLeft()) - f13);
        w6Var.setTranslationY((f11 - z9Var.getTop()) - f13);
        float f14 = f12 / L;
        w6Var.setScaleX(f14);
        w6Var.setScaleY(f14);
    }

    public final RectF d(w6 w6Var) {
        di diVar = this.f42181a;
        ViewGroup viewGroup = this.f42182b;
        if (diVar == null) {
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
        RectF rectF = this.f42192n;
        ViewGroup viewGroup = this.f42182b;
        w6 w6Var = this.d;
        di diVar = this.f42181a;
        if (diVar == null) {
            f(w6Var, this.f42183c, viewGroup, rectF);
        } else if (w6Var.isAttachedToWindow() && w6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(w6Var, viewGroup));
            rectF.offset(0.0f, diVar.f32911f4 - diVar.f32943p2);
        }
    }
}
