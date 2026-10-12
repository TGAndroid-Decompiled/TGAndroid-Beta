package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bi0 extends org.telegram.ui.ActionBar.m2 {
    public final org.telegram.ui.Components.ib0 f36180a;

    public bi0(long j3) {
        super(null);
        this.f36180a = new org.telegram.ui.Components.ib0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 9));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ib0 ib0Var = this.f36180a;
        if (ib0Var.f50665a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.p().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.m2 m2Var = ib0Var.f50670g;
        if (ib0Var.f50675m == null) {
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            ib0Var.f50675m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20504a7, m2Var.getResourceProvider()));
            org.telegram.ui.Components.m10 b10 = ib0Var.b();
            ib0Var.f50679q = b10;
            ib0Var.f50675m.addView(b10, -1, -1);
            org.telegram.ui.Components.gy0 c10 = ib0Var.c();
            ib0Var.f50677o = c10;
            ib0Var.f50675m.addView(c10, -1, -1);
            org.telegram.ui.Components.gy0 a10 = ib0Var.a();
            ib0Var.f50676n = a10;
            ib0Var.f50675m.addView(a10, w7.w5.d(-1.0f, -1));
            m2Var.getParentActivity();
            s4.d0 d0Var = new s4.d0();
            org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(m2Var.getParentActivity(), null);
            ib0Var.f50678p = wm0Var;
            wm0Var.setAdapter(ib0Var.f50669f);
            ib0Var.f50678p.p1();
            ib0Var.f50678p.setLayoutManager(d0Var);
            ib0Var.f50678p.setOnItemClickListener(new ai.g(ib0Var, 19));
            ib0Var.f50678p.setOnScrollListener(ib0Var.D);
            ib0Var.f50678p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, m2Var.getResourceProvider()));
            ib0Var.f50675m.addView(ib0Var.f50678p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.js.h);
            jVar.C = false;
            jVar.f47937m = false;
            ib0Var.f50678p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = ib0Var.f50675m;
        this.actionBar.B(ib0Var.f50678p, false);
        ib0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.k kVar = this.f36180a.f50681s;
        if (kVar != null) {
            if (z10) {
                kVar.e(false);
            }
            return false;
        }
        return true;
    }
}
