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
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.sb1;
public final class ca {
    public final ci f42248a;
    public final ViewGroup f42249b;
    public final View f42250c;
    public final x6 d;
    public final z5 f42251e;
    public final TL_wallet.walletTransaction f42252f;
    public final Runnable f42253g;
    public final aa h;
    public final x6 f42254i;
    public final q9 f42255j = new q9();
    public final PathInterpolator f42256k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f42257l;
    public final AnimatorSet f42258m;
    public final RectF f42259n;
    public final RectF f42260o;
    public w3 f42261p;
    public boolean f42262q;
    public boolean f42263r;
    public boolean f42264s;
    public final long f42265t;
    public final z9 f42266u;

    public ca(ViewGroup viewGroup, View view, x6 x6Var, z5 z5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ci ciVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42258m = animatorSet;
        this.f42260o = new RectF();
        this.f42265t = SystemClock.uptimeMillis();
        this.f42266u = new Runnable(this) {
            public final ca f43484b;

            {
                this.f43484b = this;
            }

            @Override
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        ca caVar = this.f43484b;
                        x6 x6Var2 = caVar.d;
                        ViewGroup viewGroup2 = caVar.f42249b;
                        AnimatorSet animatorSet2 = caVar.f42258m;
                        x6 x6Var3 = caVar.f42254i;
                        RectF rectF = caVar.f42260o;
                        RectF rectF2 = caVar.f42259n;
                        if (!caVar.f42264s && !caVar.f42263r) {
                            caVar.e();
                            caVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            z5 z5Var2 = caVar.f42251e;
                            TL_wallet.walletTransaction wallettransaction3 = caVar.f42252f;
                            r41 r41Var = z5Var2.f43464r0[0];
                            w3 w3Var2 = null;
                            if (r41Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < r41Var.getChildCount()) {
                                        View childAt = r41Var.getChildAt(i7);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = caVar.f42261p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    caVar.f42261p = w3Var2;
                                    w3Var2.f(true);
                                }
                                x6 pendingDiamond = caVar.f42261p.getPendingDiamond();
                                if (caVar.f42262q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !caVar.f42261p.isLayoutRequested()) {
                                    rectF.set(caVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        caVar.f42263r = true;
                                        x6Var3.f(x6Var2);
                                        x6Var3.setAlpha(1.0f);
                                        x6Var2.setAlpha(0.0f);
                                        caVar.f42255j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - caVar.f42265t <= 450 && viewGroup2.isAttachedToWindow()) {
                                caVar.h.postOnAnimation(caVar.f42266u);
                                return;
                            }
                            caVar.f42263r = true;
                            x6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f43484b.f42262q = true;
                        return;
                }
            }
        };
        this.f42248a = ciVar;
        this.f42249b = viewGroup;
        this.f42250c = view;
        this.d = x6Var;
        this.f42257l = x6Var.getAlpha();
        this.f42251e = z5Var;
        this.f42252f = wallettransaction;
        this.f42253g = runnable;
        RectF a10 = a(x6Var, viewGroup);
        this.f42259n = a10;
        aa aaVar = new aa(this, viewGroup.getContext());
        this.h = aaVar;
        aaVar.setClipChildren(false);
        aaVar.setClipToPadding(false);
        aaVar.setClickable(true);
        x6 x6Var2 = new x6(60, viewGroup.getContext(), true);
        this.f42254i = x6Var2;
        x6Var2.setContinuousRotation(540.0f);
        x6Var2.f(x6Var);
        x6Var2.setAlpha(0.0f);
        aaVar.addView(x6Var2, c8.ha.e(60, 60, 51));
        viewGroup.addView(aaVar, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        x6Var2.l(new Runnable(this) {
            public final ca f43484b;

            {
                this.f43484b = this;
            }

            @Override
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        ca caVar = this.f43484b;
                        x6 x6Var22 = caVar.d;
                        ViewGroup viewGroup2 = caVar.f42249b;
                        AnimatorSet animatorSet2 = caVar.f42258m;
                        x6 x6Var3 = caVar.f42254i;
                        RectF rectF = caVar.f42260o;
                        RectF rectF2 = caVar.f42259n;
                        if (!caVar.f42264s && !caVar.f42263r) {
                            caVar.e();
                            caVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            z5 z5Var2 = caVar.f42251e;
                            TL_wallet.walletTransaction wallettransaction3 = caVar.f42252f;
                            r41 r41Var = z5Var2.f43464r0[0];
                            w3 w3Var2 = null;
                            if (r41Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < r41Var.getChildCount()) {
                                        View childAt = r41Var.getChildAt(i7);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = caVar.f42261p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    caVar.f42261p = w3Var2;
                                    w3Var2.f(true);
                                }
                                x6 pendingDiamond = caVar.f42261p.getPendingDiamond();
                                if (caVar.f42262q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !caVar.f42261p.isLayoutRequested()) {
                                    rectF.set(caVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        caVar.f42263r = true;
                                        x6Var3.f(x6Var22);
                                        x6Var3.setAlpha(1.0f);
                                        x6Var22.setAlpha(0.0f);
                                        caVar.f42255j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - caVar.f42265t <= 450 && viewGroup2.isAttachedToWindow()) {
                                caVar.h.postOnAnimation(caVar.f42266u);
                                return;
                            }
                            caVar.f42263r = true;
                            x6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f43484b.f42262q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new r3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new ba(this, ciVar, x6Var));
        z5Var.P0();
        z5Var.Y0(false);
        fi.w3 w3Var = z5Var.f36518a;
        if (w3Var != null) {
            w3Var.C0();
            z5Var.f36518a.f37495e3.h1(0, 0);
            r41 r41Var = z5Var.f43464r0[0];
            if (r41Var != null) {
                m41 m41Var = r41Var.f37496f3;
                r41Var.C0();
                m41Var.O(false);
                for (int i7 = 0; i7 < m41Var.D.size(); i7++) {
                    x31 G = m41Var.G(i7);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i10 = u3.f43219b;
                            if ((wallettransaction2 instanceof t3 ? ((t3) wallettransaction2).f43181a : wallettransaction2) == wallettransaction || l0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                r41Var.f37495e3.h1(i7, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f42266u);
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
        if (this.f42264s) {
            return;
        }
        this.f42264s = true;
        z9 z9Var = this.f42266u;
        aa aaVar = this.h;
        aaVar.removeCallbacks(z9Var);
        x6 x6Var = this.f42254i;
        x6Var.l(null);
        w3 w3Var = this.f42261p;
        if (w3Var != null && (wallettransaction = w3Var.R) != null && u3.i(wallettransaction, this.f42252f)) {
            x6 pendingDiamond = this.f42261p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(x6Var);
            }
            this.f42261p.f(false);
            RectF rectF = this.f42260o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f42259n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f22566p;
                w3 w3Var2 = this.f42261p;
                w3Var2.d();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                w3Var2.H = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.f54279m = hVar;
                w3Var2.H.f(0.001f);
                w3Var2.H.f54269a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                w3Var2.H.b(new q3(w3Var2, 0));
                w3Var2.H.h();
            }
        }
        x6Var.setPaused(true);
        aaVar.removeView(x6Var);
        aaVar.setClickable(false);
        this.d.setAlpha(this.f42257l);
        ci ciVar = this.f42248a;
        if (ciVar == null) {
            this.f42250c.setTranslationY(0.0f);
        } else {
            ciVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f42249b;
        if (ciVar != null && this.f42255j.d()) {
            z5 z5Var = this.f42251e;
            if (z5Var.getParentLayout() != null) {
                ViewGroup view = z5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(aaVar);
                    aaVar.setTranslationX(iArr[0] - iArr2[0]);
                    aaVar.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(aaVar, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f42253g.run();
        org.telegram.messenger.g0.i3(new sb1(25, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        aa aaVar = this.h;
        float f13 = L / 2.0f;
        x6 x6Var = this.f42254i;
        x6Var.setTranslationX((f10 - aaVar.getLeft()) - f13);
        x6Var.setTranslationY((f11 - aaVar.getTop()) - f13);
        float f14 = f12 / L;
        x6Var.setScaleX(f14);
        x6Var.setScaleY(f14);
    }

    public final RectF d(x6 x6Var) {
        ci ciVar = this.f42248a;
        ViewGroup viewGroup = this.f42249b;
        if (ciVar == null) {
            return a(x6Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) x6Var.getRootView();
        RectF a10 = a(x6Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void e() {
        RectF rectF = this.f42259n;
        ViewGroup viewGroup = this.f42249b;
        x6 x6Var = this.d;
        ci ciVar = this.f42248a;
        if (ciVar == null) {
            f(x6Var, this.f42250c, viewGroup, rectF);
        } else if (x6Var.isAttachedToWindow() && x6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(x6Var, viewGroup));
            rectF.offset(0.0f, ciVar.f32616i4 - ciVar.f32648s2);
        }
    }
}
