package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
public final class ot extends org.telegram.ui.ActionBar.g2 {
    public static final int[][] f50752r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f50753s = {org.telegram.ui.ActionBar.n6.Yj, org.telegram.ui.ActionBar.n6.Zj, org.telegram.ui.ActionBar.n6.ck, org.telegram.ui.ActionBar.n6.bk, org.telegram.ui.ActionBar.n6.ak, org.telegram.ui.ActionBar.n6.gk, org.telegram.ui.ActionBar.n6.hk};
    public static final int[] f50754w = {2131232146, 2131232140, 2131232143, 2131232141, 2131232142, 2131232147, 2131232139};
    public static final int[] f50755x = {2131748566, 2131748575, 2131748570, 2131748256, 2131748572, 2131748582, 2131752583};
    public static final int[] f50756y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.k71 f50757a;
    public org.telegram.ui.Components.j71 f50758b;
    public FrameLayout f50759c;
    public View d;
    public final xe.b f50760e;
    public boolean f50761f;
    public int h;
    public int f50762n;

    public ot() {
        super(null);
        this.f50760e = new xe.b();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748105, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new y7(this, 28));
        bi.v2 v2Var = new bi.v2(context, 27);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394a7, v2Var, null);
        org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(context, null);
        this.f50757a = k71Var;
        k71Var.setAdapter(new li.w(this, 1));
        this.f50759c = new FrameLayout(context);
        this.f50758b = this.f50757a.k(-2, true);
        v2Var.addView(this.f50757a, c8.na.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        v2Var.addView(view, c8.na.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.f50759c.setTranslationY(ri.a.d(this.h) - org.telegram.messenger.g0.L(9.66f));
        this.f50759c.addView(this.f50758b, c8.na.c(48.0f, -1));
        this.f50759c.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        FrameLayout frameLayout = this.f50759c;
        fh.g c10 = getBaseSimpleGlass().f56739c.c(this.f50759c, null, false);
        c10.p(c8.j0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.k71 k71Var2 = this.f50757a;
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.i6 i6Var = this.resourceProvider;
        baseSimpleGlass.f56747m = v2Var;
        baseSimpleGlass.f56748n = k71Var2;
        baseSimpleGlass.f56737a.c(k71Var2);
        baseSimpleGlass.g(v2Var, z4Var, i6Var);
        getBaseSimpleGlass().f56749o = new di.f(6, this, v2Var);
        getBaseSimpleGlass().f56748n = null;
        v2Var.addView(this.f50759c, c8.na.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = v2Var;
        return v2Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f50761f) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29807w8, false)) <= 0.721f) {
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
        if (this.f50757a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.h = i10;
        this.f50762n = i12;
        this.f50759c.setTranslationY(ri.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.f50760e.iterator();
        while (it.hasNext()) {
            lt ltVar = (lt) it.next();
            ot otVar = ltVar.f49839w3;
            ri.a.e(ltVar, otVar.h, otVar.f50762n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.f50761f) {
            this.f50761f = true;
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25301u4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.f50757a.getCurrentView();
        if (!(currentView instanceof lt)) {
            return;
        }
        lt ltVar = (lt) currentView;
        ltVar.e1(new ht(ltVar), 700, true);
    }
}
