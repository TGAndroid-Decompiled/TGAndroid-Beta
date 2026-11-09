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
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.y31;
import org.telegram.ui.wb1;
public final class z9 {
    public final di f43464a;
    public final ViewGroup f43465b;
    public final View f43466c;
    public final u6 d;
    public final w5 f43467e;
    public final TL_wallet.walletTransaction f43468f;
    public final Runnable f43469g;
    public final x9 h;
    public final u6 f43470i;
    public final n9 f43471j = new n9();
    public final PathInterpolator f43472k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f43473l;
    public final AnimatorSet f43474m;
    public final RectF f43475n;
    public final RectF f43476o;
    public u3 f43477p;
    public boolean f43478q;
    public boolean f43479r;
    public boolean f43480s;
    public final long f43481t;
    public final w9 f43482u;

    public z9(ViewGroup viewGroup, View view, u6 u6Var, w5 w5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, di diVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43474m = animatorSet;
        this.f43476o = new RectF();
        this.f43481t = SystemClock.uptimeMillis();
        this.f43482u = new Runnable(this) {
            public final z9 f43289b;

            {
                this.f43289b = this;
            }

            @Override
            public final void run() {
                u3 u3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        z9 z9Var = this.f43289b;
                        u6 u6Var2 = z9Var.d;
                        ViewGroup viewGroup2 = z9Var.f43465b;
                        AnimatorSet animatorSet2 = z9Var.f43474m;
                        u6 u6Var3 = z9Var.f43470i;
                        RectF rectF = z9Var.f43476o;
                        RectF rectF2 = z9Var.f43475n;
                        if (!z9Var.f43480s && !z9Var.f43479r) {
                            z9Var.e();
                            z9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            w5 w5Var2 = z9Var.f43467e;
                            TL_wallet.walletTransaction wallettransaction3 = z9Var.f43468f;
                            r41 r41Var = w5Var2.f43269r0[0];
                            u3 u3Var2 = null;
                            if (r41Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < r41Var.getChildCount()) {
                                        View childAt = r41Var.getChildAt(i7);
                                        if ((childAt instanceof u3) && (wallettransaction2 = (u3Var = (u3) childAt).R) != null && s3.i(wallettransaction2, wallettransaction3)) {
                                            u3Var2 = u3Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (u3Var2 != null && u3Var2.getWidth() > 0) {
                                u3 u3Var3 = z9Var.f43477p;
                                if (u3Var3 != u3Var2) {
                                    if (u3Var3 != null) {
                                        u3Var3.f(false);
                                    }
                                    z9Var.f43477p = u3Var2;
                                    u3Var2.f(true);
                                }
                                u6 pendingDiamond = z9Var.f43477p.getPendingDiamond();
                                if (z9Var.f43478q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !z9Var.f43477p.isLayoutRequested()) {
                                    rectF.set(z9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        z9Var.f43479r = true;
                                        u6Var3.f(u6Var2);
                                        u6Var3.setAlpha(1.0f);
                                        u6Var2.setAlpha(0.0f);
                                        z9Var.f43471j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - z9Var.f43481t <= 450 && viewGroup2.isAttachedToWindow()) {
                                z9Var.h.postOnAnimation(z9Var.f43482u);
                                return;
                            }
                            z9Var.f43479r = true;
                            u6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f43289b.f43478q = true;
                        return;
                }
            }
        };
        this.f43464a = diVar;
        this.f43465b = viewGroup;
        this.f43466c = view;
        this.d = u6Var;
        this.f43473l = u6Var.getAlpha();
        this.f43467e = w5Var;
        this.f43468f = wallettransaction;
        this.f43469g = runnable;
        RectF a10 = a(u6Var, viewGroup);
        this.f43475n = a10;
        x9 x9Var = new x9(this, viewGroup.getContext());
        this.h = x9Var;
        x9Var.setClipChildren(false);
        x9Var.setClipToPadding(false);
        x9Var.setClickable(true);
        u6 u6Var2 = new u6(60, viewGroup.getContext(), true);
        this.f43470i = u6Var2;
        u6Var2.setContinuousRotation(540.0f);
        u6Var2.f(u6Var);
        u6Var2.setAlpha(0.0f);
        x9Var.addView(u6Var2, c8.ha.e(60, 60, 51));
        viewGroup.addView(x9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        u6Var2.l(new Runnable(this) {
            public final z9 f43289b;

            {
                this.f43289b = this;
            }

            @Override
            public final void run() {
                u3 u3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        z9 z9Var = this.f43289b;
                        u6 u6Var22 = z9Var.d;
                        ViewGroup viewGroup2 = z9Var.f43465b;
                        AnimatorSet animatorSet2 = z9Var.f43474m;
                        u6 u6Var3 = z9Var.f43470i;
                        RectF rectF = z9Var.f43476o;
                        RectF rectF2 = z9Var.f43475n;
                        if (!z9Var.f43480s && !z9Var.f43479r) {
                            z9Var.e();
                            z9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            w5 w5Var2 = z9Var.f43467e;
                            TL_wallet.walletTransaction wallettransaction3 = z9Var.f43468f;
                            r41 r41Var = w5Var2.f43269r0[0];
                            u3 u3Var2 = null;
                            if (r41Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < r41Var.getChildCount()) {
                                        View childAt = r41Var.getChildAt(i7);
                                        if ((childAt instanceof u3) && (wallettransaction2 = (u3Var = (u3) childAt).R) != null && s3.i(wallettransaction2, wallettransaction3)) {
                                            u3Var2 = u3Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (u3Var2 != null && u3Var2.getWidth() > 0) {
                                u3 u3Var3 = z9Var.f43477p;
                                if (u3Var3 != u3Var2) {
                                    if (u3Var3 != null) {
                                        u3Var3.f(false);
                                    }
                                    z9Var.f43477p = u3Var2;
                                    u3Var2.f(true);
                                }
                                u6 pendingDiamond = z9Var.f43477p.getPendingDiamond();
                                if (z9Var.f43478q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !z9Var.f43477p.isLayoutRequested()) {
                                    rectF.set(z9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        z9Var.f43479r = true;
                                        u6Var3.f(u6Var22);
                                        u6Var3.setAlpha(1.0f);
                                        u6Var22.setAlpha(0.0f);
                                        z9Var.f43471j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - z9Var.f43481t <= 450 && viewGroup2.isAttachedToWindow()) {
                                z9Var.h.postOnAnimation(z9Var.f43482u);
                                return;
                            }
                            z9Var.f43479r = true;
                            u6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f43289b.f43478q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new p3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new y9(this, diVar, u6Var));
        w5Var.O0();
        w5Var.X0(false);
        fi.w3 w3Var = w5Var.f36649a;
        if (w3Var != null) {
            w3Var.C0();
            w5Var.f36649a.f37555e3.h1(0, 0);
            r41 r41Var = w5Var.f43269r0[0];
            if (r41Var != null) {
                m41 m41Var = r41Var.f37556f3;
                r41Var.C0();
                m41Var.O(false);
                for (int i7 = 0; i7 < m41Var.D.size(); i7++) {
                    y31 G = m41Var.G(i7);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i10 = s3.f43087b;
                            if ((wallettransaction2 instanceof r3 ? ((r3) wallettransaction2).f43045a : wallettransaction2) == wallettransaction || l0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                r41Var.f37555e3.h1(i7, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f43482u);
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
        if (this.f43480s) {
            return;
        }
        this.f43480s = true;
        w9 w9Var = this.f43482u;
        x9 x9Var = this.h;
        x9Var.removeCallbacks(w9Var);
        u6 u6Var = this.f43470i;
        u6Var.l(null);
        u3 u3Var = this.f43477p;
        if (u3Var != null && (wallettransaction = u3Var.R) != null && s3.i(wallettransaction, this.f43468f)) {
            u6 pendingDiamond = this.f43477p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(u6Var);
            }
            this.f43477p.f(false);
            RectF rectF = this.f43476o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f43475n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f22562p;
                u3 u3Var2 = this.f43477p;
                u3Var2.d();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                u3Var2.H = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.f54280m = hVar;
                u3Var2.H.f(0.001f);
                u3Var2.H.f54270a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                u3Var2.H.b(new o3(u3Var2, 0));
                u3Var2.H.h();
            }
        }
        u6Var.setPaused(true);
        x9Var.removeView(u6Var);
        x9Var.setClickable(false);
        this.d.setAlpha(this.f43473l);
        di diVar = this.f43464a;
        if (diVar == null) {
            this.f43466c.setTranslationY(0.0f);
        } else {
            diVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f43465b;
        if (diVar != null && this.f43471j.d()) {
            w5 w5Var = this.f43467e;
            if (w5Var.getParentLayout() != null) {
                ViewGroup view = w5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(x9Var);
                    x9Var.setTranslationX(iArr[0] - iArr2[0]);
                    x9Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(x9Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f43469g.run();
        org.telegram.messenger.g0.i3(new wb1(25, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        x9 x9Var = this.h;
        float f13 = L / 2.0f;
        u6 u6Var = this.f43470i;
        u6Var.setTranslationX((f10 - x9Var.getLeft()) - f13);
        u6Var.setTranslationY((f11 - x9Var.getTop()) - f13);
        float f14 = f12 / L;
        u6Var.setScaleX(f14);
        u6Var.setScaleY(f14);
    }

    public final RectF d(u6 u6Var) {
        di diVar = this.f43464a;
        ViewGroup viewGroup = this.f43465b;
        if (diVar == null) {
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
        RectF rectF = this.f43475n;
        ViewGroup viewGroup = this.f43465b;
        u6 u6Var = this.d;
        di diVar = this.f43464a;
        if (diVar == null) {
            f(u6Var, this.f43466c, viewGroup, rectF);
        } else if (u6Var.isAttachedToWindow() && u6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(u6Var, viewGroup));
            rectF.offset(0.0f, diVar.f33003f4 - diVar.f33035p2);
        }
    }
}
