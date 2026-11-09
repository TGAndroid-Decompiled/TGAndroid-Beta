package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
public final class mt extends org.telegram.ui.ActionBar.f2 {
    public static final int[][] f47986r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f47987s = {org.telegram.ui.ActionBar.l6.Vj, org.telegram.ui.ActionBar.l6.Wj, org.telegram.ui.ActionBar.l6.Zj, org.telegram.ui.ActionBar.l6.Yj, org.telegram.ui.ActionBar.l6.Xj, org.telegram.ui.ActionBar.l6.dk, org.telegram.ui.ActionBar.l6.ek};
    public static final int[] f47988w = {2131232141, 2131232135, 2131232138, 2131232136, 2131232137, 2131232142, 2131232134};
    public static final int[] f47989x = {2131748759, 2131748768, 2131748763, 2131748449, 2131748765, 2131748775, 2131752595};
    public static final int[] f47990y = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.w61 f47991a;
    public org.telegram.ui.Components.v61 f47992b;
    public FrameLayout f47993c;
    public View d;
    public final xe.b f47994e;
    public boolean f47995f;
    public int h;
    public int f47996n;

    public mt() {
        super(null);
        this.f47994e = new xe.b();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131748298, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 25));
        di.b4 b4Var = new di.b4(context, 25);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27809a7, b4Var, null);
        org.telegram.ui.Components.w61 w61Var = new org.telegram.ui.Components.w61(context, null);
        this.f47991a = w61Var;
        w61Var.setAdapter(new ii.x(this, 1));
        this.f47993c = new FrameLayout(context);
        this.f47992b = this.f47991a.n(-2, true);
        b4Var.addView(this.f47991a, c8.ha.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        b4Var.addView(view, c8.ha.e(-1, 0, 48));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.f47993c.setTranslationY(oi.a.d(this.h) - org.telegram.messenger.g0.L(9.66f));
        this.f47993c.addView(this.f47992b, c8.ha.c(48.0f, -1));
        this.f47993c.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        FrameLayout frameLayout = this.f47993c;
        fh.g c10 = getBaseSimpleGlass().f21021c.c(this.f47993c, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.w61 w61Var2 = this.f47991a;
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.g6 g6Var = this.resourceProvider;
        baseSimpleGlass.f21029m = b4Var;
        baseSimpleGlass.f21030n = w61Var2;
        baseSimpleGlass.f21019a.c(w61Var2);
        baseSimpleGlass.g(b4Var, y4Var, g6Var);
        getBaseSimpleGlass().f21031o = new bi.g(8, this, b4Var);
        getBaseSimpleGlass().f21030n = null;
        b4Var.addView(this.f47993c, c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = b4Var;
        return b4Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f47995f) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28221w8, false)) <= 0.721f) {
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
        if (this.f47991a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.h = i10;
        this.f47996n = i12;
        this.f47993c.setTranslationY(oi.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        this.d.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.f47994e.iterator();
        while (it.hasNext()) {
            jt jtVar = (jt) it.next();
            mt mtVar = jtVar.f47096v3;
            oi.a.e(jtVar, mtVar.h, mtVar.f47996n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        if (f10 > 0.5f && !this.f47995f) {
            this.f47995f = true;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25068r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z9, f10);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.f47991a.getCurrentView();
        if (!(currentView instanceof jt)) {
            return;
        }
        jt jtVar = (jt) currentView;
        jtVar.e1(new ft(jtVar), 700, true);
    }
}
