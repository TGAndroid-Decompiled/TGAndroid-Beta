package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
public final class pt extends org.telegram.ui.ActionBar.h2 {
    public static final int[][] f50925r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f50926s = {org.telegram.ui.ActionBar.n6.Yj, org.telegram.ui.ActionBar.n6.Zj, org.telegram.ui.ActionBar.n6.ck, org.telegram.ui.ActionBar.n6.bk, org.telegram.ui.ActionBar.n6.ak, org.telegram.ui.ActionBar.n6.gk, org.telegram.ui.ActionBar.n6.hk};
    public static final int[] f50927w = {2131232143, 2131232137, 2131232140, 2131232138, 2131232139, 2131232144, 2131232136};
    public static final int[] f50928x = {2131748567, 2131748576, 2131748571, 2131748257, 2131748573, 2131748583, 2131752584};
    public static final int[] f50929y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.g71 f50930a;
    public org.telegram.ui.Components.f71 f50931b;
    public FrameLayout f50932c;
    public View d;
    public final xe.b f50933e;
    public boolean f50934f;
    public int h;
    public int f50935n;

    public pt() {
        super(null);
        this.f50933e = new xe.b();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131748106, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 28));
        bi.p2 p2Var = new bi.p2(context, 27);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29337a7, p2Var, null);
        org.telegram.ui.Components.g71 g71Var = new org.telegram.ui.Components.g71(context, null);
        this.f50930a = g71Var;
        g71Var.setAdapter(new li.x(this, 1));
        this.f50932c = new FrameLayout(context);
        this.f50931b = this.f50930a.i(-2, true);
        p2Var.addView(this.f50930a, c8.ma.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        p2Var.addView(view, c8.ma.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.f50932c.setTranslationY(ri.a.d(this.h) - org.telegram.messenger.g0.L(9.66f));
        this.f50932c.addView(this.f50931b, c8.ma.c(48.0f, -1));
        this.f50932c.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        FrameLayout frameLayout = this.f50932c;
        fh.g c10 = getBaseSimpleGlass().f56616c.c(this.f50932c, null, false);
        c10.p(c8.i0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.g71 g71Var2 = this.f50930a;
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.i6 i6Var = this.resourceProvider;
        baseSimpleGlass.f56624m = p2Var;
        baseSimpleGlass.f56625n = g71Var2;
        baseSimpleGlass.f56614a.c(g71Var2);
        baseSimpleGlass.g(p2Var, a5Var, i6Var);
        getBaseSimpleGlass().f56626o = new di.f(6, this, p2Var);
        getBaseSimpleGlass().f56625n = null;
        p2Var.addView(this.f50932c, c8.ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = p2Var;
        return p2Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f50934f) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29750w8, false)) <= 0.721f) {
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
        if (this.f50930a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.h = i10;
        this.f50935n = i12;
        this.f50932c.setTranslationY(ri.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.f50933e.iterator();
        while (it.hasNext()) {
            mt mtVar = (mt) it.next();
            pt ptVar = mtVar.f49943w3;
            ri.a.e(mtVar, ptVar.h, ptVar.f50935n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.f50934f) {
            this.f50934f = true;
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25202u4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.f50930a.getCurrentView();
        if (!(currentView instanceof mt)) {
            return;
        }
        mt mtVar = (mt) currentView;
        mtVar.e1(new jt(mtVar), 700, true);
    }
}
