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
import b8.mf;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.ma1;
public final class aa {
    public final bi f42191a;
    public final ViewGroup f42192b;
    public final View f42193c;
    public final u6 d;
    public final w5 f42194e;
    public final TL_wallet.walletTransaction f42195f;
    public final Runnable f42196g;
    public final y9 h;
    public final u6 f42197i;
    public final o9 f42198j = new o9();
    public final PathInterpolator f42199k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f42200l;
    public final AnimatorSet f42201m;
    public final RectF f42202n;
    public final RectF f42203o;
    public u3 f42204p;
    public boolean f42205q;
    public boolean f42206r;
    public boolean f42207s;
    public final long f42208t;
    public final x9 f42209u;

    public aa(ViewGroup viewGroup, View view, u6 u6Var, w5 w5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, bi biVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42201m = animatorSet;
        this.f42203o = new RectF();
        this.f42208t = SystemClock.uptimeMillis();
        this.f42209u = new Runnable(this) {
            public final aa f43447b;

            {
                this.f43447b = this;
            }

            @Override
            public final void run() {
                u3 u3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        aa aaVar = this.f43447b;
                        u6 u6Var2 = aaVar.d;
                        ViewGroup viewGroup2 = aaVar.f42192b;
                        AnimatorSet animatorSet2 = aaVar.f42201m;
                        u6 u6Var3 = aaVar.f42197i;
                        RectF rectF = aaVar.f42203o;
                        RectF rectF2 = aaVar.f42202n;
                        if (!aaVar.f42207s && !aaVar.f42206r) {
                            aaVar.e();
                            aaVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            w5 w5Var2 = aaVar.f42194e;
                            TL_wallet.walletTransaction wallettransaction3 = aaVar.f42195f;
                            l41 l41Var = w5Var2.f43341s0[0];
                            u3 u3Var2 = null;
                            if (l41Var != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 < l41Var.getChildCount()) {
                                        View childAt = l41Var.getChildAt(i3);
                                        if ((childAt instanceof u3) && (wallettransaction2 = (u3Var = (u3) childAt).S) != null && s3.i(wallettransaction2, wallettransaction3)) {
                                            u3Var2 = u3Var;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                            }
                            if (u3Var2 != null && u3Var2.getWidth() > 0) {
                                u3 u3Var3 = aaVar.f42204p;
                                if (u3Var3 != u3Var2) {
                                    if (u3Var3 != null) {
                                        u3Var3.f(false);
                                    }
                                    aaVar.f42204p = u3Var2;
                                    u3Var2.f(true);
                                }
                                u6 pendingDiamond = aaVar.f42204p.getPendingDiamond();
                                if (aaVar.f42205q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !aaVar.f42204p.isLayoutRequested()) {
                                    rectF.set(aaVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        aaVar.f42206r = true;
                                        u6Var3.f(u6Var2);
                                        u6Var3.setAlpha(1.0f);
                                        u6Var2.setAlpha(0.0f);
                                        aaVar.f42198j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - aaVar.f42208t <= 450 && viewGroup2.isAttachedToWindow()) {
                                aaVar.h.postOnAnimation(aaVar.f42209u);
                                return;
                            }
                            aaVar.f42206r = true;
                            u6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f43447b.f42205q = true;
                        return;
                }
            }
        };
        this.f42191a = biVar;
        this.f42192b = viewGroup;
        this.f42193c = view;
        this.d = u6Var;
        this.f42200l = u6Var.getAlpha();
        this.f42194e = w5Var;
        this.f42195f = wallettransaction;
        this.f42196g = runnable;
        RectF a10 = a(u6Var, viewGroup);
        this.f42202n = a10;
        y9 y9Var = new y9(this, viewGroup.getContext());
        this.h = y9Var;
        y9Var.setClipChildren(false);
        y9Var.setClipToPadding(false);
        y9Var.setClickable(true);
        u6 u6Var2 = new u6(60, viewGroup.getContext(), true);
        this.f42197i = u6Var2;
        u6Var2.setContinuousRotation(540.0f);
        u6Var2.f(u6Var);
        u6Var2.setAlpha(0.0f);
        y9Var.addView(u6Var2, mf.e(60, 60, 51));
        viewGroup.addView(y9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        u6Var2.l(new Runnable(this) {
            public final aa f43447b;

            {
                this.f43447b = this;
            }

            @Override
            public final void run() {
                u3 u3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        aa aaVar = this.f43447b;
                        u6 u6Var22 = aaVar.d;
                        ViewGroup viewGroup2 = aaVar.f42192b;
                        AnimatorSet animatorSet2 = aaVar.f42201m;
                        u6 u6Var3 = aaVar.f42197i;
                        RectF rectF = aaVar.f42203o;
                        RectF rectF2 = aaVar.f42202n;
                        if (!aaVar.f42207s && !aaVar.f42206r) {
                            aaVar.e();
                            aaVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            w5 w5Var2 = aaVar.f42194e;
                            TL_wallet.walletTransaction wallettransaction3 = aaVar.f42195f;
                            l41 l41Var = w5Var2.f43341s0[0];
                            u3 u3Var2 = null;
                            if (l41Var != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 < l41Var.getChildCount()) {
                                        View childAt = l41Var.getChildAt(i3);
                                        if ((childAt instanceof u3) && (wallettransaction2 = (u3Var = (u3) childAt).S) != null && s3.i(wallettransaction2, wallettransaction3)) {
                                            u3Var2 = u3Var;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                            }
                            if (u3Var2 != null && u3Var2.getWidth() > 0) {
                                u3 u3Var3 = aaVar.f42204p;
                                if (u3Var3 != u3Var2) {
                                    if (u3Var3 != null) {
                                        u3Var3.f(false);
                                    }
                                    aaVar.f42204p = u3Var2;
                                    u3Var2.f(true);
                                }
                                u6 pendingDiamond = aaVar.f42204p.getPendingDiamond();
                                if (aaVar.f42205q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !aaVar.f42204p.isLayoutRequested()) {
                                    rectF.set(aaVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        aaVar.f42206r = true;
                                        u6Var3.f(u6Var22);
                                        u6Var3.setAlpha(1.0f);
                                        u6Var22.setAlpha(0.0f);
                                        aaVar.f42198j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - aaVar.f42208t <= 450 && viewGroup2.isAttachedToWindow()) {
                                aaVar.h.postOnAnimation(aaVar.f42209u);
                                return;
                            }
                            aaVar.f42206r = true;
                            u6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f43447b.f42205q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new p3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new z9(this, biVar, u6Var));
        w5Var.O0();
        w5Var.X0(false);
        ai.h4 h4Var = w5Var.f34298a;
        if (h4Var != null) {
            h4Var.C0();
            w5Var.f34298a.f35593f3.h1(0, 0);
            l41 l41Var = w5Var.f43341s0[0];
            if (l41Var != null) {
                f41 f41Var = l41Var.f35594g3;
                l41Var.C0();
                f41Var.O(false);
                for (int i3 = 0; i3 < f41Var.E.size(); i3++) {
                    r31 G = f41Var.G(i3);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i10 = s3.f43150b;
                            if ((wallettransaction2 instanceof r3 ? ((r3) wallettransaction2).f43119a : wallettransaction2) == wallettransaction || k0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                l41Var.f35593f3.h1(i3, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f42209u);
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
        if (this.f42207s) {
            return;
        }
        this.f42207s = true;
        x9 x9Var = this.f42209u;
        y9 y9Var = this.h;
        y9Var.removeCallbacks(x9Var);
        u6 u6Var = this.f42197i;
        u6Var.l(null);
        u3 u3Var = this.f42204p;
        if (u3Var != null && (wallettransaction = u3Var.S) != null && s3.i(wallettransaction, this.f42195f)) {
            u6 pendingDiamond = this.f42204p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(u6Var);
            }
            this.f42204p.f(false);
            RectF rectF = this.f42203o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f42202n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f22607p;
                u3 u3Var2 = this.f42204p;
                u3Var2.d();
                q1.g gVar = new q1.g(new q1.f(0.0f));
                u3Var2.I = gVar;
                q1.h hVar = new q1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.f53653m = hVar;
                u3Var2.I.f(0.001f);
                u3Var2.I.f53643a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                u3Var2.I.b(new o3(u3Var2, 0));
                u3Var2.I.h();
            }
        }
        u6Var.setPaused(true);
        y9Var.removeView(u6Var);
        y9Var.setClickable(false);
        this.d.setAlpha(this.f42200l);
        bi biVar = this.f42191a;
        if (biVar == null) {
            this.f42193c.setTranslationY(0.0f);
        } else {
            biVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f42192b;
        if (biVar != null && this.f42198j.d()) {
            w5 w5Var = this.f42194e;
            if (w5Var.getParentLayout() != null) {
                ViewGroup view = w5Var.getParentLayout().getView();
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
        this.f42196g.run();
        org.telegram.messenger.g0.i3(new ma1(29, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        y9 y9Var = this.h;
        float f13 = L / 2.0f;
        u6 u6Var = this.f42197i;
        u6Var.setTranslationX((f10 - y9Var.getLeft()) - f13);
        u6Var.setTranslationY((f11 - y9Var.getTop()) - f13);
        float f14 = f12 / L;
        u6Var.setScaleX(f14);
        u6Var.setScaleY(f14);
    }

    public final RectF d(u6 u6Var) {
        bi biVar = this.f42191a;
        ViewGroup viewGroup = this.f42192b;
        if (biVar == null) {
            return a(u6Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) u6Var.getRootView();
        RectF a10 = a(u6Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void e() {
        RectF rectF = this.f42202n;
        ViewGroup viewGroup = this.f42192b;
        u6 u6Var = this.d;
        bi biVar = this.f42191a;
        if (biVar == null) {
            f(u6Var, this.f42193c, viewGroup, rectF);
        } else if (u6Var.isAttachedToWindow() && u6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(u6Var, viewGroup));
            rectF.offset(0.0f, biVar.f32231g4 - biVar.f32263q2);
        }
    }
}
