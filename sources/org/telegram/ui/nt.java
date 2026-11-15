package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
public final class nt extends org.telegram.ui.ActionBar.e2 {
    public static final int[][] f49683r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f49684s = {org.telegram.ui.ActionBar.j6.Yj, org.telegram.ui.ActionBar.j6.Zj, org.telegram.ui.ActionBar.j6.ck, org.telegram.ui.ActionBar.j6.bk, org.telegram.ui.ActionBar.j6.ak, org.telegram.ui.ActionBar.j6.gk, org.telegram.ui.ActionBar.j6.hk};
    public static final int[] f49685w = {2131232142, 2131232136, 2131232139, 2131232137, 2131232138, 2131232143, 2131232135};
    public static final int[] f49686x = {2131748759, 2131748768, 2131748763, 2131748449, 2131748765, 2131748775, 2131752595};
    public static final int[] f49687y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.w61 f49688a;
    public org.telegram.ui.Components.v61 f49689b;
    public FrameLayout f49690c;
    public View d;
    public final xe.b f49691e;
    public boolean f49692f;
    public int h;
    public int f49693n;

    public nt() {
        super(null);
        this.f49691e = new xe.b();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748298, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new p9(this, 26));
        bi.v1 v1Var = new bi.v1(context, 27);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, v1Var, null);
        org.telegram.ui.Components.w61 w61Var = new org.telegram.ui.Components.w61(context, null);
        this.f49688a = w61Var;
        w61Var.setAdapter(new li.x(this, 1));
        this.f49690c = new FrameLayout(context);
        this.f49689b = this.f49688a.i(-2, true);
        v1Var.addView(this.f49688a, c8.ja.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        v1Var.addView(view, c8.ja.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.f49690c.setTranslationY(ri.a.d(this.h) - org.telegram.messenger.g0.L(9.66f));
        this.f49690c.addView(this.f49689b, c8.ja.c(48.0f, -1));
        this.f49690c.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        FrameLayout frameLayout = this.f49690c;
        fh.g c10 = getBaseSimpleGlass().f56042c.c(this.f49690c, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.w61 w61Var2 = this.f49688a;
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        baseSimpleGlass.f56050m = v1Var;
        baseSimpleGlass.f56051n = w61Var2;
        baseSimpleGlass.f56040a.c(w61Var2);
        baseSimpleGlass.g(v1Var, w4Var, e6Var);
        getBaseSimpleGlass().f56052o = new di.f(6, this, v1Var);
        getBaseSimpleGlass().f56051n = null;
        v1Var.addView(this.f49690c, c8.ja.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = v1Var;
        return v1Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f49692f) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29205w8, false)) <= 0.721f) {
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
        if (this.f49688a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.h = i10;
        this.f49693n = i12;
        this.f49690c.setTranslationY(ri.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.f49691e.iterator();
        while (it.hasNext()) {
            kt ktVar = (kt) it.next();
            nt ntVar = ktVar.f48773w3;
            ri.a.e(ktVar, ntVar.h, ntVar.f49693n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.f49692f) {
            this.f49692f = true;
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25564r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.f49688a.getCurrentView();
        if (!(currentView instanceof kt)) {
            return;
        }
        kt ktVar = (kt) currentView;
        ktVar.e1(new gt(ktVar), 700, true);
    }
}
