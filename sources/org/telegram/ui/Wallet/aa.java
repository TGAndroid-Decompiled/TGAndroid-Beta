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
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.x31;
public final class aa {
    public final di f42152a;
    public final ViewGroup f42153b;
    public final View f42154c;
    public final v6 d;
    public final x5 f42155e;
    public final TL_wallet.walletTransaction f42156f;
    public final Runnable f42157g;
    public final y9 h;
    public final v6 f42158i;
    public final o9 f42159j = new o9();
    public final PathInterpolator f42160k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f42161l;
    public final AnimatorSet f42162m;
    public final RectF f42163n;
    public final RectF f42164o;
    public v3 f42165p;
    public boolean f42166q;
    public boolean f42167r;
    public boolean f42168s;
    public final long f42169t;
    public final x9 f42170u;

    public aa(ViewGroup viewGroup, View view, v6 v6Var, x5 x5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, di diVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42162m = animatorSet;
        this.f42164o = new RectF();
        this.f42169t = SystemClock.uptimeMillis();
        this.f42170u = new Runnable(this) {
            public final aa f43371b;

            {
                this.f43371b = this;
            }

            @Override
            public final void run() {
                v3 v3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        aa aaVar = this.f43371b;
                        v6 v6Var2 = aaVar.d;
                        ViewGroup viewGroup2 = aaVar.f42153b;
                        AnimatorSet animatorSet2 = aaVar.f42162m;
                        v6 v6Var3 = aaVar.f42158i;
                        RectF rectF = aaVar.f42164o;
                        RectF rectF2 = aaVar.f42163n;
                        if (!aaVar.f42168s && !aaVar.f42167r) {
                            aaVar.e();
                            aaVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            x5 x5Var2 = aaVar.f42155e;
                            TL_wallet.walletTransaction wallettransaction3 = aaVar.f42156f;
                            q41 q41Var = x5Var2.f43351r0[0];
                            v3 v3Var2 = null;
                            if (q41Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < q41Var.getChildCount()) {
                                        View childAt = q41Var.getChildAt(i7);
                                        if ((childAt instanceof v3) && (wallettransaction2 = (v3Var = (v3) childAt).R) != null && t3.i(wallettransaction2, wallettransaction3)) {
                                            v3Var2 = v3Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (v3Var2 != null && v3Var2.getWidth() > 0) {
                                v3 v3Var3 = aaVar.f42165p;
                                if (v3Var3 != v3Var2) {
                                    if (v3Var3 != null) {
                                        v3Var3.f(false);
                                    }
                                    aaVar.f42165p = v3Var2;
                                    v3Var2.f(true);
                                }
                                v6 pendingDiamond = aaVar.f42165p.getPendingDiamond();
                                if (aaVar.f42166q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !aaVar.f42165p.isLayoutRequested()) {
                                    rectF.set(aaVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        aaVar.f42167r = true;
                                        v6Var3.f(v6Var2);
                                        v6Var3.setAlpha(1.0f);
                                        v6Var2.setAlpha(0.0f);
                                        aaVar.f42159j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - aaVar.f42169t <= 450 && viewGroup2.isAttachedToWindow()) {
                                aaVar.h.postOnAnimation(aaVar.f42170u);
                                return;
                            }
                            aaVar.f42167r = true;
                            v6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f43371b.f42166q = true;
                        return;
                }
            }
        };
        this.f42152a = diVar;
        this.f42153b = viewGroup;
        this.f42154c = view;
        this.d = v6Var;
        this.f42161l = v6Var.getAlpha();
        this.f42155e = x5Var;
        this.f42156f = wallettransaction;
        this.f42157g = runnable;
        RectF a10 = a(v6Var, viewGroup);
        this.f42163n = a10;
        y9 y9Var = new y9(this, viewGroup.getContext());
        this.h = y9Var;
        y9Var.setClipChildren(false);
        y9Var.setClipToPadding(false);
        y9Var.setClickable(true);
        v6 v6Var2 = new v6(60, viewGroup.getContext(), true);
        this.f42158i = v6Var2;
        v6Var2.setContinuousRotation(540.0f);
        v6Var2.f(v6Var);
        v6Var2.setAlpha(0.0f);
        y9Var.addView(v6Var2, c8.ha.e(60, 60, 51));
        viewGroup.addView(y9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        v6Var2.l(new Runnable(this) {
            public final aa f43371b;

            {
                this.f43371b = this;
            }

            @Override
            public final void run() {
                v3 v3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        aa aaVar = this.f43371b;
                        v6 v6Var22 = aaVar.d;
                        ViewGroup viewGroup2 = aaVar.f42153b;
                        AnimatorSet animatorSet2 = aaVar.f42162m;
                        v6 v6Var3 = aaVar.f42158i;
                        RectF rectF = aaVar.f42164o;
                        RectF rectF2 = aaVar.f42163n;
                        if (!aaVar.f42168s && !aaVar.f42167r) {
                            aaVar.e();
                            aaVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            x5 x5Var2 = aaVar.f42155e;
                            TL_wallet.walletTransaction wallettransaction3 = aaVar.f42156f;
                            q41 q41Var = x5Var2.f43351r0[0];
                            v3 v3Var2 = null;
                            if (q41Var != null) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 < q41Var.getChildCount()) {
                                        View childAt = q41Var.getChildAt(i7);
                                        if ((childAt instanceof v3) && (wallettransaction2 = (v3Var = (v3) childAt).R) != null && t3.i(wallettransaction2, wallettransaction3)) {
                                            v3Var2 = v3Var;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (v3Var2 != null && v3Var2.getWidth() > 0) {
                                v3 v3Var3 = aaVar.f42165p;
                                if (v3Var3 != v3Var2) {
                                    if (v3Var3 != null) {
                                        v3Var3.f(false);
                                    }
                                    aaVar.f42165p = v3Var2;
                                    v3Var2.f(true);
                                }
                                v6 pendingDiamond = aaVar.f42165p.getPendingDiamond();
                                if (aaVar.f42166q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !aaVar.f42165p.isLayoutRequested()) {
                                    rectF.set(aaVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        aaVar.f42167r = true;
                                        v6Var3.f(v6Var22);
                                        v6Var3.setAlpha(1.0f);
                                        v6Var22.setAlpha(0.0f);
                                        aaVar.f42159j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - aaVar.f42169t <= 450 && viewGroup2.isAttachedToWindow()) {
                                aaVar.h.postOnAnimation(aaVar.f42170u);
                                return;
                            }
                            aaVar.f42167r = true;
                            v6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f43371b.f42166q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new q3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new z9(this, diVar, v6Var));
        x5Var.O0();
        x5Var.X0(false);
        fi.w3 w3Var = x5Var.f36243a;
        if (w3Var != null) {
            w3Var.C0();
            x5Var.f36243a.f37189e3.h1(0, 0);
            q41 q41Var = x5Var.f43351r0[0];
            if (q41Var != null) {
                l41 l41Var = q41Var.f37190f3;
                q41Var.C0();
                l41Var.O(false);
                for (int i7 = 0; i7 < l41Var.D.size(); i7++) {
                    x31 G = l41Var.G(i7);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i10 = t3.f43169b;
                            if ((wallettransaction2 instanceof s3 ? ((s3) wallettransaction2).f43127a : wallettransaction2) == wallettransaction || m0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                q41Var.f37189e3.h1(i7, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f42170u);
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
        if (this.f42168s) {
            return;
        }
        this.f42168s = true;
        x9 x9Var = this.f42170u;
        y9 y9Var = this.h;
        y9Var.removeCallbacks(x9Var);
        v6 v6Var = this.f42158i;
        v6Var.l(null);
        v3 v3Var = this.f42165p;
        if (v3Var != null && (wallettransaction = v3Var.R) != null && t3.i(wallettransaction, this.f42156f)) {
            v6 pendingDiamond = this.f42165p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(v6Var);
            }
            this.f42165p.f(false);
            RectF rectF = this.f42164o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f42163n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f22562p;
                v3 v3Var2 = this.f42165p;
                v3Var2.d();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                v3Var2.H = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.f54268m = hVar;
                v3Var2.H.f(0.001f);
                v3Var2.H.f54258a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                v3Var2.H.b(new p3(v3Var2, 0));
                v3Var2.H.h();
            }
        }
        v6Var.setPaused(true);
        y9Var.removeView(v6Var);
        y9Var.setClickable(false);
        this.d.setAlpha(this.f42161l);
        di diVar = this.f42152a;
        if (diVar == null) {
            this.f42154c.setTranslationY(0.0f);
        } else {
            diVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.f42153b;
        if (diVar != null && this.f42159j.d()) {
            x5 x5Var = this.f42155e;
            if (x5Var.getParentLayout() != null) {
                ViewGroup view = x5Var.getParentLayout().getView();
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
        this.f42157g.run();
        org.telegram.messenger.g0.i3(new n(24, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        y9 y9Var = this.h;
        float f13 = L / 2.0f;
        v6 v6Var = this.f42158i;
        v6Var.setTranslationX((f10 - y9Var.getLeft()) - f13);
        v6Var.setTranslationY((f11 - y9Var.getTop()) - f13);
        float f14 = f12 / L;
        v6Var.setScaleX(f14);
        v6Var.setScaleY(f14);
    }

    public final RectF d(v6 v6Var) {
        di diVar = this.f42152a;
        ViewGroup viewGroup = this.f42153b;
        if (diVar == null) {
            return a(v6Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) v6Var.getRootView();
        RectF a10 = a(v6Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void e() {
        RectF rectF = this.f42163n;
        ViewGroup viewGroup = this.f42153b;
        v6 v6Var = this.d;
        di diVar = this.f42152a;
        if (diVar == null) {
            f(v6Var, this.f42154c, viewGroup, rectF);
        } else if (v6Var.isAttachedToWindow() && v6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(v6Var, viewGroup));
            rectF.offset(0.0f, diVar.f32948f4 - diVar.f32980p2);
        }
    }
}
