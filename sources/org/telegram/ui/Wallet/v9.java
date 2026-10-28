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
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u61;
public final class v9 {
    public final ti f37411a;
    public final ViewGroup f37412b;
    public final View f37413c;
    public final m6 d;
    public final m5 e;
    public final TL_wallet.walletTransaction f37414f;
    public final Runnable f37415g;
    public final t9 h;
    public final m6 f37416i;
    public final k9 f37417j = new k9();
    public final PathInterpolator f37418k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f37419l;
    public final AnimatorSet f37420m;
    public final RectF f37421n;
    public final RectF f37422o;
    public f3 f37423p;
    public boolean f37424q;
    public boolean f37425r;
    public boolean f37426s;
    public final long f37427t;
    public final s9 f37428u;

    public v9(ViewGroup viewGroup, View view, m6 m6Var, m5 m5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f37420m = animatorSet;
        this.f37422o = new RectF();
        this.f37427t = SystemClock.uptimeMillis();
        this.f37428u = new Runnable(this) {
            public final v9 f37276b;

            {
                this.f37276b = this;
            }

            @Override
            public final void run() {
                f3 f3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        v9 v9Var = this.f37276b;
                        m6 m6Var2 = v9Var.d;
                        ViewGroup viewGroup2 = v9Var.f37412b;
                        AnimatorSet animatorSet2 = v9Var.f37420m;
                        m6 m6Var3 = v9Var.f37416i;
                        RectF rectF = v9Var.f37422o;
                        RectF rectF2 = v9Var.f37421n;
                        if (!v9Var.f37426s && !v9Var.f37425r) {
                            v9Var.e();
                            v9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            m5 m5Var2 = v9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = v9Var.f37414f;
                            s71 s71Var = m5Var2.f36960r0[0];
                            f3 f3Var2 = null;
                            if (s71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < s71Var.getChildCount()) {
                                        View childAt = s71Var.getChildAt(i10);
                                        if ((childAt instanceof f3) && (wallettransaction2 = (f3Var = (f3) childAt).R) != null && d3.a(wallettransaction2, wallettransaction3)) {
                                            f3Var2 = f3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (f3Var2 != null && f3Var2.getWidth() > 0) {
                                f3 f3Var3 = v9Var.f37423p;
                                if (f3Var3 != f3Var2) {
                                    if (f3Var3 != null) {
                                        f3Var3.f(false);
                                    }
                                    v9Var.f37423p = f3Var2;
                                    f3Var2.f(true);
                                }
                                m6 pendingDiamond = v9Var.f37423p.getPendingDiamond();
                                if (v9Var.f37424q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v9Var.f37423p.isLayoutRequested()) {
                                    rectF.set(v9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v9Var.f37425r = true;
                                        m6Var3.f(m6Var2);
                                        m6Var3.setAlpha(1.0f);
                                        m6Var2.setAlpha(0.0f);
                                        v9Var.f37417j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v9Var.f37427t <= 450 && viewGroup2.isAttachedToWindow()) {
                                v9Var.h.postOnAnimation(v9Var.f37428u);
                                return;
                            }
                            v9Var.f37425r = true;
                            m6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f37276b.f37424q = true;
                        return;
                }
            }
        };
        this.f37411a = tiVar;
        this.f37412b = viewGroup;
        this.f37413c = view;
        this.d = m6Var;
        this.f37419l = m6Var.getAlpha();
        this.e = m5Var;
        this.f37414f = wallettransaction;
        this.f37415g = runnable;
        RectF a2 = a(viewGroup, m6Var);
        this.f37421n = a2;
        t9 t9Var = new t9(this, viewGroup.getContext());
        this.h = t9Var;
        t9Var.setClipChildren(false);
        t9Var.setClipToPadding(false);
        t9Var.setClickable(true);
        m6 m6Var2 = new m6(60, viewGroup.getContext(), true);
        this.f37416i = m6Var2;
        m6Var2.setContinuousRotation(540.0f);
        m6Var2.f(m6Var);
        m6Var2.setAlpha(0.0f);
        t9Var.addView(m6Var2, kb1.i(60, 60, 51));
        viewGroup.addView(t9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        m6Var2.l(new Runnable(this) {
            public final v9 f37276b;

            {
                this.f37276b = this;
            }

            @Override
            public final void run() {
                f3 f3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (r2) {
                    case 0:
                        v9 v9Var = this.f37276b;
                        m6 m6Var22 = v9Var.d;
                        ViewGroup viewGroup2 = v9Var.f37412b;
                        AnimatorSet animatorSet2 = v9Var.f37420m;
                        m6 m6Var3 = v9Var.f37416i;
                        RectF rectF = v9Var.f37422o;
                        RectF rectF2 = v9Var.f37421n;
                        if (!v9Var.f37426s && !v9Var.f37425r) {
                            v9Var.e();
                            v9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            m5 m5Var2 = v9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = v9Var.f37414f;
                            s71 s71Var = m5Var2.f36960r0[0];
                            f3 f3Var2 = null;
                            if (s71Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < s71Var.getChildCount()) {
                                        View childAt = s71Var.getChildAt(i10);
                                        if ((childAt instanceof f3) && (wallettransaction2 = (f3Var = (f3) childAt).R) != null && d3.a(wallettransaction2, wallettransaction3)) {
                                            f3Var2 = f3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (f3Var2 != null && f3Var2.getWidth() > 0) {
                                f3 f3Var3 = v9Var.f37423p;
                                if (f3Var3 != f3Var2) {
                                    if (f3Var3 != null) {
                                        f3Var3.f(false);
                                    }
                                    v9Var.f37423p = f3Var2;
                                    f3Var2.f(true);
                                }
                                m6 pendingDiamond = v9Var.f37423p.getPendingDiamond();
                                if (v9Var.f37424q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v9Var.f37423p.isLayoutRequested()) {
                                    rectF.set(v9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v9Var.f37425r = true;
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(1.0f);
                                        m6Var22.setAlpha(0.0f);
                                        v9Var.f37417j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v9Var.f37427t <= 450 && viewGroup2.isAttachedToWindow()) {
                                v9Var.h.postOnAnimation(v9Var.f37428u);
                                return;
                            }
                            v9Var.f37425r = true;
                            m6Var3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        this.f37276b.f37424q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new a3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new u9(this, tiVar, m6Var));
        m5Var.K0();
        m5Var.T0(false);
        m71 m71Var = m5Var.f30764a;
        if (m71Var != null) {
            m71Var.C0();
            m5Var.f30764a.f32503f3.h1(0, 0);
            s71 s71Var = m5Var.f36960r0[0];
            if (s71Var != null) {
                k71 k71Var = s71Var.f32504g3;
                s71Var.C0();
                k71Var.O(false);
                for (int i10 = 0; i10 < k71Var.f29882y.size(); i10++) {
                    u61 G = k71Var.G(i10);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i11 = d3.f36482a;
                            if ((wallettransaction2 instanceof c3 ? ((c3) wallettransaction2).f36450a : wallettransaction2) == wallettransaction || l0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                s71Var.f32503f3.h1(i10, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.f37428u);
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
        if (this.f37426s) {
            return;
        }
        this.f37426s = true;
        s9 s9Var = this.f37428u;
        t9 t9Var = this.h;
        t9Var.removeCallbacks(s9Var);
        m6 m6Var = this.f37416i;
        m6Var.l(null);
        f3 f3Var = this.f37423p;
        if (f3Var != null && (wallettransaction = f3Var.R) != null && d3.a(wallettransaction, this.f37414f)) {
            m6 pendingDiamond = this.f37423p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(m6Var);
            }
            this.f37423p.f(false);
            RectF rectF = this.f37422o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.f37421n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                f3 f3Var2 = this.f37423p;
                f3Var2.d();
                o1.j jVar = new o1.j(new ac.a(0.0f));
                f3Var2.H = jVar;
                o1.k kVar = new o1.k(0.0f);
                kVar.a(0.65f);
                kVar.b(200.0f);
                jVar.f18968u = kVar;
                f3Var2.H.e(0.001f);
                f3Var2.H.f18959a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                f3Var2.H.b(new z2(f3Var2, 0));
                f3Var2.H.h();
            }
        }
        m6Var.setPaused(true);
        t9Var.removeView(m6Var);
        t9Var.setClickable(false);
        this.d.setAlpha(this.f37419l);
        ti tiVar = this.f37411a;
        if (tiVar == null) {
            this.f37413c.setTranslationY(0.0f);
        } else {
            tiVar.Q1(1.0f);
        }
        ViewGroup viewGroup = this.f37412b;
        if (tiVar != null && this.f37417j.d()) {
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
        this.f37415g.run();
        AndroidUtilities.runOnUIThread(new a6(7, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        t9 t9Var = this.h;
        float f12 = dp / 2.0f;
        m6 m6Var = this.f37416i;
        m6Var.setTranslationX((f7 - t9Var.getLeft()) - f12);
        m6Var.setTranslationY((f10 - t9Var.getTop()) - f12);
        float f13 = f11 / dp;
        m6Var.setScaleX(f13);
        m6Var.setScaleY(f13);
    }

    public final RectF d(m6 m6Var) {
        ti tiVar = this.f37411a;
        ViewGroup viewGroup = this.f37412b;
        if (tiVar == null) {
            return a(viewGroup, m6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) m6Var.getRootView();
        RectF a2 = a(viewGroup2, m6Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void e() {
        RectF rectF = this.f37421n;
        ViewGroup viewGroup = this.f37412b;
        m6 m6Var = this.d;
        ti tiVar = this.f37411a;
        if (tiVar == null) {
            f(m6Var, this.f37413c, viewGroup, rectF);
        } else if (m6Var.isAttachedToWindow() && m6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, m6Var));
            rectF.offset(0.0f, tiVar.f33018o2 - tiVar.f33051y0);
        }
    }
}
