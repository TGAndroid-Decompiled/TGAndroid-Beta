package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ai0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.la0 f32077a;

    public ai0(long j3) {
        super(null);
        this.f32077a = new org.telegram.ui.Components.la0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.la0 la0Var = this.f32077a;
        if (la0Var.f45362a) {
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
        org.telegram.ui.ActionBar.n2 n2Var = la0Var.f45366g;
        if (la0Var.f45371m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            la0Var.f45371m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19006a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.t00 b10 = la0Var.b();
            la0Var.f45375q = b10;
            la0Var.f45371m.addView(b10, -1, -1);
            org.telegram.ui.Components.kx0 c10 = la0Var.c();
            la0Var.f45373o = c10;
            la0Var.f45371m.addView(c10, -1, -1);
            org.telegram.ui.Components.kx0 a10 = la0Var.a();
            la0Var.f45372n = a10;
            la0Var.f45371m.addView(a10, w7.y5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(n2Var.getParentActivity(), null);
            la0Var.f45374p = wl0Var;
            wl0Var.setAdapter(la0Var.f45365f);
            la0Var.f45374p.q1();
            la0Var.f45374p.setLayoutManager(c0Var);
            la0Var.f45374p.setOnItemClickListener(new ai.g(la0Var, 19));
            la0Var.f45374p.setOnScrollListener(la0Var.D);
            la0Var.f45374p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19152i6, n2Var.getResourceProvider()));
            la0Var.f45371m.addView(la0Var.f45374p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.qr.h);
            jVar.C = false;
            jVar.f42964m = false;
            la0Var.f45374p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = la0Var.f45371m;
        this.actionBar.z(la0Var.f45374p, false);
        la0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.f32077a.f45377s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
