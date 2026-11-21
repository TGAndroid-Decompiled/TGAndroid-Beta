package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
public final class pt extends org.telegram.ui.ActionBar.g2 {
    public static final int[][] f50970r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f50971s = {org.telegram.ui.ActionBar.m6.Yj, org.telegram.ui.ActionBar.m6.Zj, org.telegram.ui.ActionBar.m6.ck, org.telegram.ui.ActionBar.m6.bk, org.telegram.ui.ActionBar.m6.ak, org.telegram.ui.ActionBar.m6.gk, org.telegram.ui.ActionBar.m6.hk};
    public static final int[] f50972w = {2131232143, 2131232137, 2131232140, 2131232138, 2131232139, 2131232144, 2131232136};
    public static final int[] f50973x = {2131748566, 2131748575, 2131748570, 2131748256, 2131748572, 2131748582, 2131752583};
    public static final int[] f50974y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.j71 f50975a;
    public org.telegram.ui.Components.i71 f50976b;
    public FrameLayout f50977c;
    public View d;
    public final xe.b f50978e;
    public boolean f50979f;
    public int h;
    public int f50980n;

    public pt() {
        super(null);
        this.f50978e = new xe.b();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748105, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 28));
        bi.t2 t2Var = new bi.t2(context, 27);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29321a7, t2Var, null);
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(context, null);
        this.f50975a = j71Var;
        j71Var.setAdapter(new li.x(this, 1));
        this.f50977c = new FrameLayout(context);
        this.f50976b = this.f50975a.i(-2, true);
        t2Var.addView(this.f50975a, c8.ma.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        t2Var.addView(view, c8.ma.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.f50977c.setTranslationY(ri.a.d(this.h) - org.telegram.messenger.g0.L(9.66f));
        this.f50977c.addView(this.f50976b, c8.ma.c(48.0f, -1));
        this.f50977c.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        FrameLayout frameLayout = this.f50977c;
        fh.g c10 = getBaseSimpleGlass().f56657c.c(this.f50977c, null, false);
        c10.p(c8.i0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.j71 j71Var2 = this.f50975a;
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.h6 h6Var = this.resourceProvider;
        baseSimpleGlass.f56665m = t2Var;
        baseSimpleGlass.f56666n = j71Var2;
        baseSimpleGlass.f56655a.c(j71Var2);
        baseSimpleGlass.g(t2Var, z4Var, h6Var);
        getBaseSimpleGlass().f56667o = new di.f(6, this, t2Var);
        getBaseSimpleGlass().f56666n = null;
        t2Var.addView(this.f50977c, c8.ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = t2Var;
        return t2Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f50979f) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29734w8, false)) <= 0.721f) {
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
        if (this.f50975a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.h = i10;
        this.f50980n = i12;
        this.f50977c.setTranslationY(ri.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.f50978e.iterator();
        while (it.hasNext()) {
            mt mtVar = (mt) it.next();
            pt ptVar = mtVar.f49984w3;
            ri.a.e(mtVar, ptVar.h, ptVar.f50980n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.f50979f) {
            this.f50979f = true;
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25230u4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.f50975a.getCurrentView();
        if (!(currentView instanceof mt)) {
            return;
        }
        mt mtVar = (mt) currentView;
        mtVar.e1(new jt(mtVar), 700, true);
    }
}
