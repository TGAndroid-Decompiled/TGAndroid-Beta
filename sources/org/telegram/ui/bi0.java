package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bi0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.na0 f32487a;

    public bi0(long j3) {
        super(null);
        this.f32487a = new org.telegram.ui.Components.na0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.na0 na0Var = this.f32487a;
        if (na0Var.f45427a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 14);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = na0Var.f45431g;
        if (na0Var.f45436m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            na0Var.f45436m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19053a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.t00 b10 = na0Var.b();
            na0Var.f45440q = b10;
            na0Var.f45436m.addView(b10, -1, -1);
            org.telegram.ui.Components.lx0 c10 = na0Var.c();
            na0Var.f45438o = c10;
            na0Var.f45436m.addView(c10, -1, -1);
            org.telegram.ui.Components.lx0 a10 = na0Var.a();
            na0Var.f45437n = a10;
            na0Var.f45436m.addView(a10, w7.y5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(n2Var.getParentActivity(), null);
            na0Var.f45439p = yl0Var;
            yl0Var.setAdapter(na0Var.f45430f);
            na0Var.f45439p.q1();
            na0Var.f45439p.setLayoutManager(c0Var);
            na0Var.f45439p.setOnItemClickListener(new ai.g(na0Var, 19));
            na0Var.f45439p.setOnScrollListener(na0Var.D);
            na0Var.f45439p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19199i6, n2Var.getResourceProvider()));
            na0Var.f45436m.addView(na0Var.f45439p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.qr.h);
            jVar.C = false;
            jVar.f43030m = false;
            na0Var.f45439p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = na0Var.f45436m;
        this.actionBar.z(na0Var.f45439p, false);
        na0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.f32487a.f45442s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
