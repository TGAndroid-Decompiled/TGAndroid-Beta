package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qh0 extends org.telegram.ui.ActionBar.p2 {
    public final org.telegram.ui.Components.ea0 f37759a;

    public qh0(long j10) {
        super(null);
        this.f37759a = new org.telegram.ui.Components.ea0(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 25));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ea0 ea0Var = this.f37759a;
        if (ea0Var.f9479a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 12);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.p2 p2Var = ea0Var.f9483g;
        if (ea0Var.f9488m == null) {
            FrameLayout frameLayout = new FrameLayout(p2Var.getParentActivity());
            ea0Var.f9488m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, p2Var.getResourceProvider()));
            org.telegram.ui.Components.t00 b10 = ea0Var.b();
            ea0Var.f9492q = b10;
            ea0Var.f9488m.addView(b10, -1, -1);
            org.telegram.ui.Components.zw0 c3 = ea0Var.c();
            ea0Var.f9490o = c3;
            ea0Var.f9488m.addView(c3, -1, -1);
            org.telegram.ui.Components.zw0 a10 = ea0Var.a();
            ea0Var.f9489n = a10;
            ea0Var.f9488m.addView(a10, k7.b6.c(-1.0f, -1));
            p2Var.getParentActivity();
            f2.i0 i0Var = new f2.i0();
            org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(p2Var.getParentActivity(), null);
            ea0Var.f9491p = sl0Var;
            sl0Var.setAdapter(ea0Var.f9482f);
            ea0Var.f9491p.p1();
            ea0Var.f9491p.setLayoutManager(i0Var);
            ea0Var.f9491p.setOnItemClickListener(new dg.n(ea0Var, 5));
            ea0Var.f9491p.setOnScrollListener(ea0Var.D);
            ea0Var.f9491p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, p2Var.getResourceProvider()));
            ea0Var.f9488m.addView(ea0Var.f9491p, -1, -1);
            f2.l lVar = new f2.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.nr.h);
            lVar.C = false;
            lVar.f5818m = false;
            ea0Var.f9491p.setItemAnimator(lVar);
        }
        FrameLayout frameLayout2 = ea0Var.f9488m;
        this.actionBar.A(ea0Var.f9491p, false);
        ea0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        jh.u uVar = this.f37759a.f9494s;
        if (uVar != null) {
            if (z4) {
                uVar.e(false);
            }
            return false;
        }
        return true;
    }
}
