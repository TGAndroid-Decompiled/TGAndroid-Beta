package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ih0 extends org.telegram.ui.ActionBar.o2 {
    public final org.telegram.ui.Components.l90 f39163a;

    public ih0(long j10) {
        super(null);
        this.f39163a = new org.telegram.ui.Components.l90(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        int i9;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 3));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.l90 l90Var = this.f39163a;
        if (l90Var.f5246a) {
            i9 = R.string.SubscribeRequests;
        } else {
            i9 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i9));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 12);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.o2 o2Var = l90Var.f5251g;
        if (l90Var.f5256m == null) {
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            l90Var.f5256m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, o2Var.getResourceProvider()));
            org.telegram.ui.Components.e00 b10 = l90Var.b();
            l90Var.f5260q = b10;
            l90Var.f5256m.addView(b10, -1, -1);
            org.telegram.ui.Components.gw0 c10 = l90Var.c();
            l90Var.f5258o = c10;
            l90Var.f5256m.addView(c10, -1, -1);
            org.telegram.ui.Components.gw0 a3 = l90Var.a();
            l90Var.f5257n = a3;
            l90Var.f5256m.addView(a3, g7.e6.c(-1.0f, -1));
            o2Var.getParentActivity();
            f2.m0 m0Var = new f2.m0();
            org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(o2Var.getParentActivity(), null);
            l90Var.f5259p = wk0Var;
            wk0Var.setAdapter(l90Var.f5250f);
            l90Var.f5259p.p1();
            l90Var.f5259p.setLayoutManager(m0Var);
            l90Var.f5259p.setOnItemClickListener(new eh.j(l90Var, 1));
            l90Var.f5259p.setOnScrollListener(l90Var.D);
            l90Var.f5259p.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, o2Var.getResourceProvider()));
            l90Var.f5256m.addView(l90Var.f5259p, -1, -1);
            f2.n nVar = new f2.n();
            nVar.n(350L);
            nVar.o(org.telegram.ui.Components.gr.h);
            nVar.C = false;
            nVar.f5532m = false;
            l90Var.f5259p.setItemAnimator(nVar);
        }
        FrameLayout frameLayout2 = l90Var.f5256m;
        this.actionBar.z(l90Var.f5259p, false);
        l90Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        eh.w wVar = this.f39163a.f5262s;
        if (wVar != null) {
            if (z10) {
                wVar.e(false);
            }
            return false;
        }
        return true;
    }
}
