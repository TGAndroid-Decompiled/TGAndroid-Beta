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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.ti;
public final class v9 {
    public final ti f37384a;
    public final ViewGroup f37385b;
    public final View f37386c;
    public final l6 d;
    public final m5 e;
    public final TL_wallet.walletTransaction f37387f;
    public final Runnable f37388g;
    public final t9 h;
    public final l6 f37389i;
    public final k9 f37390j = new k9();
    public final PathInterpolator f37391k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f37392l;
    public final AnimatorSet f37393m;
    public final RectF f37394n;
    public final RectF f37395o;
    public f3 f37396p;
    public boolean f37397q;
    public boolean f37398r;
    public boolean f37399s;
    public final long f37400t;
    public final s9 f37401u;

    public v9(ViewGroup viewGroup, View view, l6 l6Var, m5 m5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f37393m = animatorSet;
        this.f37395o = new RectF();
        this.f37400t = SystemClock.uptimeMillis();
        this.f37401u = new Runnable(this) {
            public final v9 f37249b;

            {
                this.f37249b = this;
            }

            @Override
            public final void run() {
                f3 f3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        v9 v9Var = this.f37249b;
                        l6 l6Var2 = v9Var.d;
                        ViewGroup viewGroup2 = v9Var.f37385b;
                        AnimatorSet animatorSet2 = v9Var.f37393m;
                        l6 l6Var3 = v9Var.f37389i;
                        RectF rectF = v9Var.f37395o;
                        RectF rectF2 = v9Var.f37394n;
                        if (!v9Var.f37399s && !v9Var.f37398r) {
                            v9Var.e();
                            v9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            m5 m5Var2 = v9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = v9Var.f37387f;
                            r71 r71Var = m5Var2.f36952r0[0];
                            f3 f3Var2 = null;
                            if (r71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < r71Var.getChildCount()) {
                                        View childAt = r71Var.getChildAt(i10);
                                        if ((childAt instanceof f3) && (wallettransaction2 = (f3Var = (f3) childAt).R) != null && d3.a(wallettransaction2, wallettransaction3)) {
                                            f3Var2 = f3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (f3Var2 != null && f3Var2.getWidth() > 0) {
                                f3 f3Var3 = v9Var.f37396p;
                                if (f3Var3 != f3Var2) {
                                    if (f3Var3 != null) {
                                        f3Var3.f(false);
                                    }
                                    v9Var.f37396p = f3Var2;
                                    f3Var2.f(true);
                                }
                                l6 pendingDiamond = v9Var.f37396p.getPendingDiamond();
                                if (v9Var.f37397q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v9Var.f37396p.isLayoutRequested()) {
                                    rectF.set(v9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v9Var.f37398r = true;
                                        l6Var3.f(l6Var2);
                                        l6Var3.setAlpha(1.0f);
                                        l6Var2.setAlpha(0.0f);
                                        v9Var.f37390j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v9Var.f37400t <= 450 && viewGroup2.isAttachedToWindow()) {
                                v9Var.h.postOnAnimation(v9Var.f37401u);
                                return;
                            }
                            v9Var.f37398r = true;
                            l6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f37249b.f37397q = true;
                        return;
                }
            }
        };
        this.f37384a = tiVar;
        this.f37385b = viewGroup;
        this.f37386c = view;
        this.d = l6Var;
        this.f37392l = l6Var.getAlpha();
        this.e = m5Var;
        this.f37387f = wallettransaction;
        this.f37388g = runnable;
        RectF a2 = a(viewGroup, l6Var);
        this.f37394n = a2;
        t9 t9Var = new t9(this, viewGroup.getContext());
        this.h = t9Var;
        t9Var.setClipChildren(false);
        t9Var.setClipToPadding(false);
        t9Var.setClickable(true);
        l6 l6Var2 = new l6(60, viewGroup.getContext(), true);
        this.f37389i = l6Var2;
        l6Var2.setContinuousRotation(540.0f);
        l6Var2.f(l6Var);
        l6Var2.setAlpha(0.0f);
        t9Var.addView(l6Var2, gb1.i(60, 60, 51));
        viewGroup.addView(t9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        l6Var2.l(new Runnable(this) {
            public final v9 f37249b;

            {
                this.f37249b = this;
            }

            @Override
            public final void run() {
                f3 f3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        v9 v9Var = this.f37249b;
                        l6 l6Var22 = v9Var.d;
                        ViewGroup viewGroup2 = v9Var.f37385b;
                        AnimatorSet animatorSet2 = v9Var.f37393m;
                        l6 l6Var3 = v9Var.f37389i;
                        RectF rectF = v9Var.f37395o;
                        RectF rectF2 = v9Var.f37394n;
                        if (!v9Var.f37399s && !v9Var.f37398r) {
                            v9Var.e();
                            v9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            m5 m5Var2 = v9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = v9Var.f37387f;
                            r71 r71Var = m5Var2.f36952r0[0];
                            f3 f3Var2 = null;
                            if (r71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < r71Var.getChildCount()) {
                                        View childAt = r71Var.getChildAt(i10);
                                        if ((childAt instanceof f3) && (wallettransaction2 = (f3Var = (f3) childAt).R) != null && d3.a(wallettransaction2, wallettransaction3)) {
                                            f3Var2 = f3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (f3Var2 != null && f3Var2.getWidth() > 0) {
                                f3 f3Var3 = v9Var.f37396p;
                                if (f3Var3 != f3Var2) {
                                    if (f3Var3 != null) {
                                        f3Var3.f(false);
                                    }
                                    v9Var.f37396p = f3Var2;
                                    f3Var2.f(true);
                                }
                                l6 pendingDiamond = v9Var.f37396p.getPendingDiamond();
                                if (v9Var.f37397q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v9Var.f37396p.isLayoutRequested()) {
                                    rectF.set(v9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v9Var.f37398r = true;
                                        l6Var3.f(l6Var22);
                                        l6Var3.setAlpha(1.0f);
                                        l6Var22.setAlpha(0.0f);
                                        v9Var.f37390j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v9Var.f37400t <= 450 && viewGroup2.isAttachedToWindow()) {
                                v9Var.h.postOnAnimation(v9Var.f37401u);
                                return;
                            }
                            v9Var.f37398r = true;
                            l6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f37249b.f37397q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new a3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new u9(this, tiVar, l6Var));
        m5Var.K0();
        m5Var.T0(false);
        l71 l71Var = m5Var.f30417a;
        if (l71Var != null) {
            l71Var.C0();
            m5Var.f30417a.f32149f3.h1(0, 0);
            r71 r71Var = m5Var.f36952r0[0];
            if (r71Var != null) {
                j71 j71Var = r71Var.f32150g3;
                r71Var.C0();
                j71Var.O(false);
                for (int i10 = 0; i10 < j71Var.f29509y.size(); i10++) {
                    t61 G = j71Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = d3.f36455a;
                            if ((wallettransaction2 instanceof c3 ? ((c3) wallettransaction2).f36421a : wallettransaction2) == wallettransaction || l0.f0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                r71Var.f32149f3.h1(i10, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f37401u);
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
        if (this.f37399s) {
            return;
        }
        this.f37399s = true;
        s9 s9Var = this.f37401u;
        t9 t9Var = this.h;
        t9Var.removeCallbacks(s9Var);
        l6 l6Var = this.f37389i;
        l6Var.l(null);
        f3 f3Var = this.f37396p;
        if (f3Var != null && (wallettransaction = f3Var.R) != null && d3.a(wallettransaction, this.f37387f)) {
            l6 pendingDiamond = this.f37396p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(l6Var);
            }
            this.f37396p.f(false);
            RectF rectF = this.f37395o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f37394n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                f3 f3Var2 = this.f37396p;
                f3Var2.d();
                o1.j jVar = new o1.j(new ac.a(0.0f));
                f3Var2.H = jVar;
                o1.k kVar = new o1.k(0.0f);
                kVar.a(0.65f);
                kVar.b(200.0f);
                jVar.f18969u = kVar;
                f3Var2.H.e(0.001f);
                f3Var2.H.f18960a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                f3Var2.H.b(new z2(f3Var2, 0));
                f3Var2.H.h();
            }
        }
        l6Var.setPaused(true);
        t9Var.removeView(l6Var);
        t9Var.setClickable(false);
        this.d.setAlpha(this.f37392l);
        ti tiVar = this.f37384a;
        if (tiVar == null) {
            this.f37386c.setTranslationY(0.0f);
        } else {
            tiVar.P1(1.0f);
        }
        ViewGroup viewGroup = this.f37385b;
        if (tiVar != null && this.f37390j.d()) {
            m5 m5Var = this.e;
            if (m5Var.getParentLayout() != null) {
                ViewGroup view = m5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(t9Var);
                    t9Var.setTranslationX(iArr[0] - iArr2[0]);
                    t9Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(t9Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f37388g.run();
        AndroidUtilities.runOnUIThread(new q6(6, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        t9 t9Var = this.h;
        float f12 = dp / 2.0f;
        l6 l6Var = this.f37389i;
        l6Var.setTranslationX((f7 - t9Var.getLeft()) - f12);
        l6Var.setTranslationY((f10 - t9Var.getTop()) - f12);
        float f13 = f11 / dp;
        l6Var.setScaleX(f13);
        l6Var.setScaleY(f13);
    }

    public final RectF d(l6 l6Var) {
        ti tiVar = this.f37384a;
        ViewGroup viewGroup = this.f37385b;
        if (tiVar == null) {
            return a(viewGroup, l6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) l6Var.getRootView();
        RectF a2 = a(viewGroup2, l6Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void e() {
        RectF rectF = this.f37394n;
        ViewGroup viewGroup = this.f37385b;
        l6 l6Var = this.d;
        ti tiVar = this.f37384a;
        if (tiVar == null) {
            f(l6Var, this.f37386c, viewGroup, rectF);
        } else if (l6Var.isAttachedToWindow() && l6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, l6Var));
            rectF.offset(0.0f, tiVar.f33046o2 - tiVar.f33079y0);
        }
    }
}
