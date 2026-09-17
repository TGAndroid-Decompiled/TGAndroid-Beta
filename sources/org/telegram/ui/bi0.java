package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bi0 extends org.telegram.ui.ActionBar.o2 {
    public final org.telegram.ui.Components.ca0 f32186a;

    public bi0(long j3) {
        super(null);
        this.f32186a = new org.telegram.ui.Components.ca0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new x70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ca0 ca0Var = this.f32186a;
        if (ca0Var.f45134a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 14);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.o2 o2Var = ca0Var.f45138g;
        if (ca0Var.f45143m == null) {
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            ca0Var.f45143m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18806a7, o2Var.getResourceProvider()));
            org.telegram.ui.Components.t00 b10 = ca0Var.b();
            ca0Var.f45147q = b10;
            ca0Var.f45143m.addView(b10, -1, -1);
            org.telegram.ui.Components.zw0 c10 = ca0Var.c();
            ca0Var.f45145o = c10;
            ca0Var.f45143m.addView(c10, -1, -1);
            org.telegram.ui.Components.zw0 a10 = ca0Var.a();
            ca0Var.f45144n = a10;
            ca0Var.f45143m.addView(a10, w7.x5.c(-1.0f, -1));
            o2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(o2Var.getParentActivity(), null);
            ca0Var.f45146p = ml0Var;
            ml0Var.setAdapter(ca0Var.f45137f);
            ca0Var.f45146p.q1();
            ca0Var.f45146p.setLayoutManager(c0Var);
            ca0Var.f45146p.setOnItemClickListener(new ai.g(ca0Var, 19));
            ca0Var.f45146p.setOnScrollListener(ca0Var.D);
            ca0Var.f45146p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18952i6, o2Var.getResourceProvider()));
            ca0Var.f45143m.addView(ca0Var.f45146p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.qr.h);
            jVar.C = false;
            jVar.f42732m = false;
            ca0Var.f45146p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = ca0Var.f45143m;
        this.actionBar.z(ca0Var.f45146p, false);
        ca0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.f32186a.f45149s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
