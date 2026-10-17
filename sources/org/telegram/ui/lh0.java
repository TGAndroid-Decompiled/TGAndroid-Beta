package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lh0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.xa0 f38885a;

    public lh0(long j10) {
        super(null);
        this.f38885a = new org.telegram.ui.Components.xa0(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q60(this, 11));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.xa0 xa0Var = this.f38885a;
        if (xa0Var.f49879a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.a2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = xa0Var.f49883g;
        if (xa0Var.f49888m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            xa0Var.f49888m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20928a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.b10 b10 = xa0Var.b();
            xa0Var.f49892q = b10;
            xa0Var.f49888m.addView(b10, -1, -1);
            org.telegram.ui.Components.rx0 c10 = xa0Var.c();
            xa0Var.f49890o = c10;
            xa0Var.f49888m.addView(c10, -1, -1);
            org.telegram.ui.Components.rx0 a10 = xa0Var.a();
            xa0Var.f49889n = a10;
            xa0Var.f49888m.addView(a10, w7.z5.d(-1.0f, -1));
            n2Var.getParentActivity();
            s4.b0 b0Var = new s4.b0();
            org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(n2Var.getParentActivity(), null);
            xa0Var.f49891p = im0Var;
            im0Var.setAdapter(xa0Var.f49882f);
            xa0Var.f49891p.p1();
            xa0Var.f49891p.setLayoutManager(b0Var);
            xa0Var.f49891p.setOnItemClickListener(new ai.va(xa0Var, 23));
            xa0Var.f49891p.setOnScrollListener(xa0Var.D);
            xa0Var.f49891p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, n2Var.getResourceProvider()));
            xa0Var.f49888m.addView(xa0Var.f49891p, -1, -1);
            s4.k kVar2 = new s4.k();
            kVar2.n(350L);
            kVar2.o(org.telegram.ui.Components.bs.h);
            kVar2.C = false;
            kVar2.f45972m = false;
            xa0Var.f49891p.setItemAnimator(kVar2);
        }
        FrameLayout frameLayout2 = xa0Var.f49888m;
        this.actionBar.A(xa0Var.f49891p, false);
        xa0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        xh.j jVar = this.f38885a.f49894s;
        if (jVar != null) {
            if (z10) {
                jVar.e(false);
            }
            return false;
        }
        return true;
    }
}
