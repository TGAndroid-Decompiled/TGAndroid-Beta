package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mh0 extends org.telegram.ui.ActionBar.r2 {
    public final org.telegram.ui.Components.va0 f41444a;

    public mh0(long j10) {
        super(null);
        this.f41444a = new org.telegram.ui.Components.va0(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new c20(this, 13));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.va0 va0Var = this.f41444a;
        if (va0Var.f52668a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 14);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.r2 r2Var = va0Var.f52672g;
        if (va0Var.f52677m == null) {
            FrameLayout frameLayout = new FrameLayout(r2Var.getParentActivity());
            va0Var.f52677m = frameLayout;
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23300a7, frameLayout, r2Var.getResourceProvider());
            org.telegram.ui.Components.c10 b10 = va0Var.b();
            va0Var.f52681q = b10;
            va0Var.f52677m.addView(b10, -1, -1);
            org.telegram.ui.Components.fy0 c10 = va0Var.c();
            va0Var.f52679o = c10;
            va0Var.f52677m.addView(c10, -1, -1);
            org.telegram.ui.Components.fy0 a10 = va0Var.a();
            va0Var.f52678n = a10;
            va0Var.f52677m.addView(a10, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            r2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(r2Var.getParentActivity(), null);
            va0Var.f52680p = nm0Var;
            nm0Var.setAdapter(va0Var.f52671f);
            va0Var.f52680p.u1();
            va0Var.f52680p.setLayoutManager(c0Var);
            va0Var.f52680p.setOnItemClickListener(new ai.k(va0Var, 24));
            va0Var.f52680p.setOnScrollListener(va0Var.D);
            org.telegram.ui.ActionBar.f7.K(va0Var.f52680p, org.telegram.ui.ActionBar.y6.f23449i6, r2Var.getResourceProvider());
            va0Var.f52677m.addView(va0Var.f52680p, -1, -1);
            s4.l lVar = new s4.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.ds.h);
            lVar.C = false;
            lVar.f47798m = false;
            va0Var.f52680p.setItemAnimator(lVar);
        }
        FrameLayout frameLayout2 = va0Var.f52677m;
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.nm0 nm0Var2 = va0Var.f52680p;
        kVar2.getClass();
        kVar2.w(nm0Var2, org.telegram.ui.ActionBar.y6.f23300a7, org.telegram.ui.ActionBar.y6.f23637s8);
        va0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        yh.j jVar = this.f41444a.f52683s;
        if (jVar != null) {
            if (z10) {
                jVar.e(false);
            }
            return false;
        }
        return true;
    }
}
