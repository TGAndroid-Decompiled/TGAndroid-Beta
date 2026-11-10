package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
public final class nt extends org.telegram.ui.ActionBar.f2 {
    public static final int[][] f48283r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f48284s = {org.telegram.ui.ActionBar.m6.Vj, org.telegram.ui.ActionBar.m6.Wj, org.telegram.ui.ActionBar.m6.Zj, org.telegram.ui.ActionBar.m6.Yj, org.telegram.ui.ActionBar.m6.Xj, org.telegram.ui.ActionBar.m6.dk, org.telegram.ui.ActionBar.m6.ek};
    public static final int[] f48285w = {2131232141, 2131232135, 2131232138, 2131232136, 2131232137, 2131232142, 2131232134};
    public static final int[] f48286x = {2131748759, 2131748768, 2131748763, 2131748449, 2131748765, 2131748775, 2131752595};
    public static final int[] f48287y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.v61 f48288a;
    public org.telegram.ui.Components.u61 f48289b;
    public FrameLayout f48290c;
    public View d;
    public final xe.b f48291e;
    public boolean f48292f;
    public int h;
    public int f48293n;

    public nt() {
        super(null);
        this.f48291e = new xe.b();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131748298, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 25));
        di.b4 b4Var = new di.b4(context, 25);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27834a7, b4Var, null);
        org.telegram.ui.Components.v61 v61Var = new org.telegram.ui.Components.v61(context, null);
        this.f48288a = v61Var;
        v61Var.setAdapter(new ii.x(this, 1));
        this.f48290c = new FrameLayout(context);
        this.f48289b = this.f48288a.n(-2, true);
        b4Var.addView(this.f48288a, c8.ha.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        b4Var.addView(view, c8.ha.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.h;
        this.f48290c.setTranslationY(oi.a.d(this.h) - org.telegram.messenger.g0.L(9.66f));
        this.f48290c.addView(this.f48289b, c8.ha.c(48.0f, -1));
        this.f48290c.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        FrameLayout frameLayout = this.f48290c;
        fh.g c10 = getBaseSimpleGlass().f21026c.c(this.f48290c, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.v61 v61Var2 = this.f48288a;
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.h6 h6Var = this.resourceProvider;
        baseSimpleGlass.f21034m = b4Var;
        baseSimpleGlass.f21035n = v61Var2;
        baseSimpleGlass.f21024a.c(v61Var2);
        baseSimpleGlass.g(b4Var, z4Var, h6Var);
        getBaseSimpleGlass().f21036o = new bi.g(8, this, b4Var);
        getBaseSimpleGlass().f21035n = null;
        b4Var.addView(this.f48290c, c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = b4Var;
        return b4Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f48292f) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28246w8, false)) <= 0.721f) {
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
            if (motionEvent.getY() <= org.telegram.messenger.g0.L(48.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                return true;
            }
        }
        if (this.f48288a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.h = i10;
        this.f48293n = i12;
        this.f48290c.setTranslationY(oi.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.h;
        Iterator it = this.f48291e.iterator();
        while (it.hasNext()) {
            kt ktVar = (kt) it.next();
            nt ntVar = ktVar.f47430v3;
            oi.a.e(ktVar, ntVar.h, ntVar.f48293n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        if (f10 > 0.5f && !this.f48292f) {
            this.f48292f = true;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25072r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z9, f10);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.f48288a.getCurrentView();
        if (!(currentView instanceof kt)) {
            return;
        }
        kt ktVar = (kt) currentView;
        ktVar.e1(new gt(ktVar), 700, true);
    }
}
