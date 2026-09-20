package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bi0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.ka0 f32469a;

    public bi0(long j3) {
        super(null);
        this.f32469a = new org.telegram.ui.Components.ka0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ka0 ka0Var = this.f32469a;
        if (ka0Var.f45406a) {
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
        org.telegram.ui.ActionBar.n2 n2Var = ka0Var.f45410g;
        if (ka0Var.f45415m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            ka0Var.f45415m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19038a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.t00 b10 = ka0Var.b();
            ka0Var.f45419q = b10;
            ka0Var.f45415m.addView(b10, -1, -1);
            org.telegram.ui.Components.jx0 c10 = ka0Var.c();
            ka0Var.f45417o = c10;
            ka0Var.f45415m.addView(c10, -1, -1);
            org.telegram.ui.Components.jx0 a10 = ka0Var.a();
            ka0Var.f45416n = a10;
            ka0Var.f45415m.addView(a10, w7.y5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(n2Var.getParentActivity(), null);
            ka0Var.f45418p = vl0Var;
            vl0Var.setAdapter(ka0Var.f45409f);
            ka0Var.f45418p.q1();
            ka0Var.f45418p.setLayoutManager(c0Var);
            ka0Var.f45418p.setOnItemClickListener(new ai.g(ka0Var, 19));
            ka0Var.f45418p.setOnScrollListener(ka0Var.D);
            ka0Var.f45418p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19184i6, n2Var.getResourceProvider()));
            ka0Var.f45415m.addView(ka0Var.f45418p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.qr.h);
            jVar.C = false;
            jVar.f43009m = false;
            ka0Var.f45418p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = ka0Var.f45415m;
        this.actionBar.z(ka0Var.f45418p, false);
        ka0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.f32469a.f45421s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
