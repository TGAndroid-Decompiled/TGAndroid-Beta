package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
public final class kt extends org.telegram.ui.ActionBar.f2 {
    public static final int[][] f47297r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f47298s = {org.telegram.ui.ActionBar.k6.Vj, org.telegram.ui.ActionBar.k6.Wj, org.telegram.ui.ActionBar.k6.Zj, org.telegram.ui.ActionBar.k6.Yj, org.telegram.ui.ActionBar.k6.Xj, org.telegram.ui.ActionBar.k6.dk, org.telegram.ui.ActionBar.k6.ek};
    public static final int[] f47299w = {2131232141, 2131232135, 2131232138, 2131232136, 2131232137, 2131232142, 2131232134};
    public static final int[] f47300x = {2131748758, 2131748767, 2131748762, 2131748448, 2131748764, 2131748774, 2131752595};
    public static final int[] f47301y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.v61 f47302a;
    public org.telegram.ui.Components.u61 f47303b;
    public FrameLayout f47304c;
    public View d;
    public final xe.b f47305e;
    public boolean f47306f;
    public int h;
    public int f47307n;

    public kt() {
        super(null);
        this.f47305e = new xe.b();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748297, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 25));
        di.a4 a4Var = new di.a4(context, 25);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27793a7, a4Var, null);
        org.telegram.ui.Components.v61 v61Var = new org.telegram.ui.Components.v61(context, null);
        this.f47302a = v61Var;
        v61Var.setAdapter(new ii.x(this, 1));
        this.f47304c = new FrameLayout(context);
        this.f47303b = this.f47302a.n(-2, true);
        a4Var.addView(this.f47302a, c8.ha.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        a4Var.addView(view, c8.ha.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.f47304c.setTranslationY(oi.a.d(this.h) - org.telegram.messenger.g0.L(9.66f));
        this.f47304c.addView(this.f47303b, c8.ha.c(48.0f, -1));
        this.f47304c.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        FrameLayout frameLayout = this.f47304c;
        fh.g c10 = getBaseSimpleGlass().f21018c.c(this.f47304c, null, false);
        c10.p(c8.g0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.v61 v61Var2 = this.f47302a;
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        baseSimpleGlass.f21026m = a4Var;
        baseSimpleGlass.f21027n = v61Var2;
        baseSimpleGlass.f21016a.c(v61Var2);
        baseSimpleGlass.g(a4Var, y4Var, f6Var);
        getBaseSimpleGlass().f21028o = new bi.g(8, this, a4Var);
        getBaseSimpleGlass().f21027n = null;
        a4Var.addView(this.f47304c, c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = a4Var;
        return a4Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f47306f) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28205w8, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= org.telegram.messenger.g0.L(48.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                return true;
            }
        }
        if (this.f47302a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.h = i10;
        this.f47307n = i12;
        this.f47304c.setTranslationY(oi.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.f47305e.iterator();
        while (it.hasNext()) {
            gt gtVar = (gt) it.next();
            kt ktVar = gtVar.f46107v3;
            oi.a.e(gtVar, ktVar.h, ktVar.f47307n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        if (f10 > 0.5f && !this.f47306f) {
            this.f47306f = true;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25059r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z9, f10);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.f47302a.getCurrentView();
        if (!(currentView instanceof gt)) {
            return;
        }
        gt gtVar = (gt) currentView;
        gtVar.e1(new dt(gtVar), 700, true);
    }
}
