package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
public final class ht extends org.telegram.ui.ActionBar.d2 {
    public static final int[][] f45975r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f45976s = {org.telegram.ui.ActionBar.k6.Vj, org.telegram.ui.ActionBar.k6.Wj, org.telegram.ui.ActionBar.k6.Zj, org.telegram.ui.ActionBar.k6.Yj, org.telegram.ui.ActionBar.k6.Xj, org.telegram.ui.ActionBar.k6.dk, org.telegram.ui.ActionBar.k6.ek};
    public static final int[] f45977w = {2131232141, 2131232135, 2131232138, 2131232136, 2131232137, 2131232142, 2131232134};
    public static final int[] f45978x = {2131748767, 2131748776, 2131748771, 2131748457, 2131748773, 2131748783, 2131752595};
    public static final int[] f45979y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.n61 f45980a;
    public org.telegram.ui.Components.m61 f45981b;
    public FrameLayout f45982c;
    public View d;
    public final ue.b f45983e;
    public boolean f45984f;
    public int h;
    public int f45985n;

    public ht() {
        super(null);
        this.f45983e = new ue.b();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131748306, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 26));
        ai.d2 d2Var = new ai.d2(context, 27);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, d2Var, null);
        org.telegram.ui.Components.n61 n61Var = new org.telegram.ui.Components.n61(context, null);
        this.f45980a = n61Var;
        n61Var.setAdapter(new ji.v(this, 1));
        this.f45982c = new FrameLayout(context);
        this.f45981b = this.f45980a.j(-2, true);
        d2Var.addView(this.f45980a, b8.mf.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        d2Var.addView(view, b8.mf.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.f45982c.setTranslationY(pi.a.d(this.h) - org.telegram.messenger.g0.L(9.66f));
        this.f45982c.addView(this.f45981b, b8.mf.c(48.0f, -1));
        this.f45982c.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        FrameLayout frameLayout = this.f45982c;
        gh.g c2 = getBaseSimpleGlass().f53525c.c(this.f45982c, null, false);
        c2.p(b8.cd.m(this.resourceProvider));
        c2.q(org.telegram.messenger.g0.L(9.66f));
        c2.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c2);
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.n61 n61Var2 = this.f45980a;
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        baseSimpleGlass.f53532l = d2Var;
        baseSimpleGlass.f53533m = n61Var2;
        baseSimpleGlass.f53523a.c(n61Var2);
        baseSimpleGlass.g(d2Var, y4Var, e6Var);
        getBaseSimpleGlass().f53534n = new ci.g(6, this, d2Var);
        getBaseSimpleGlass().f53533m = null;
        d2Var.addView(this.f45982c, b8.mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = d2Var;
        return d2Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f45984f) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28236w8, false)) <= 0.721f) {
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
        if (this.f45980a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.h = i10;
        this.f45985n = i12;
        this.f45982c.setTranslationY(pi.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.f45983e.iterator();
        while (it.hasNext()) {
            et etVar = (et) it.next();
            ht htVar = etVar.f45045w3;
            pi.a.e(etVar, htVar.h, htVar.f45985n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.f45984f) {
            this.f45984f = true;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23297r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.f45980a.getCurrentView();
        if (!(currentView instanceof et)) {
            return;
        }
        et etVar = (et) currentView;
        etVar.e1(new bt(etVar), 700, true);
    }
}
