package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class lh0 extends org.telegram.ui.ActionBar.n2 {

    public final org.telegram.ui.Components.p90 f40087a;

    public lh0(long j10) {
        super(null);
        this.f40087a = new org.telegram.ui.Components.p90(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 4));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.p90 p90Var = this.f40087a;
        kVar.setTitle(LocaleController.getString(p90Var.f6173a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new db(this, 12);
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.Search));
        v0VarA.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = p90Var.f6178g;
        if (p90Var.f6183m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            p90Var.f6183m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.h00 h00VarB = p90Var.b();
            p90Var.f6187q = h00VarB;
            p90Var.f6183m.addView(h00VarB, -1, -1);
            org.telegram.ui.Components.iw0 iw0VarC = p90Var.c();
            p90Var.f6185o = iw0VarC;
            p90Var.f6183m.addView(iw0VarC, -1, -1);
            org.telegram.ui.Components.iw0 iw0VarA = p90Var.a();
            p90Var.f6184n = iw0VarA;
            p90Var.f6183m.addView(iw0VarA, h7.z5.c(-1.0f, -1));
            n2Var.getParentActivity();
            f2.k0 k0Var = new f2.k0();
            org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(n2Var.getParentActivity(), null);
            p90Var.f6186p = zk0Var;
            zk0Var.setAdapter(p90Var.f6177f);
            p90Var.f6186p.p1();
            p90Var.f6186p.setLayoutManager(k0Var);
            p90Var.f6186p.setOnItemClickListener(new ag.p0(p90Var, 3));
            p90Var.f6186p.setOnScrollListener(p90Var.D);
            p90Var.f6186p.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, n2Var.getResourceProvider()));
            p90Var.f6183m.addView(p90Var.f6186p, -1, -1);
            f2.l lVar = new f2.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.er.h);
            lVar.C = false;
            lVar.f5819m = false;
            p90Var.f6186p.setItemAnimator(lVar);
        }
        FrameLayout frameLayout2 = p90Var.f6183m;
        this.actionBar.B(p90Var.f6186p, false);
        p90Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        fh.u uVar = this.f40087a.f6189s;
        if (uVar == null) {
            return true;
        }
        if (z10) {
            uVar.e(false);
        }
        return false;
    }
}
