package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fi0 extends org.telegram.ui.ActionBar.m2 {
    public final org.telegram.ui.Components.db0 f35842a;

    public fi0(long j10) {
        super(null);
        this.f35842a = new org.telegram.ui.Components.db0(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 10));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.db0 db0Var = this.f35842a;
        if (db0Var.f48475a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.m2 m2Var = db0Var.f48479g;
        if (db0Var.f48484m == null) {
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            db0Var.f48484m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, m2Var.getResourceProvider()));
            org.telegram.ui.Components.f10 b10 = db0Var.b();
            db0Var.f48488q = b10;
            db0Var.f48484m.addView(b10, -1, -1);
            org.telegram.ui.Components.wx0 c10 = db0Var.c();
            db0Var.f48486o = c10;
            db0Var.f48484m.addView(c10, -1, -1);
            org.telegram.ui.Components.wx0 a10 = db0Var.a();
            db0Var.f48485n = a10;
            db0Var.f48484m.addView(a10, w7.a6.d(-1.0f, -1));
            m2Var.getParentActivity();
            s4.b0 b0Var = new s4.b0();
            org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(m2Var.getParentActivity(), null);
            db0Var.f48487p = mm0Var;
            mm0Var.setAdapter(db0Var.f48478f);
            db0Var.f48487p.p1();
            db0Var.f48487p.setLayoutManager(b0Var);
            db0Var.f48487p.setOnItemClickListener(new bi.d(db0Var, 19));
            db0Var.f48487p.setOnScrollListener(db0Var.D);
            db0Var.f48487p.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, m2Var.getResourceProvider()));
            db0Var.f48484m.addView(db0Var.f48487p, -1, -1);
            s4.k kVar2 = new s4.k();
            kVar2.n(350L);
            kVar2.o(org.telegram.ui.Components.es.h);
            kVar2.C = false;
            kVar2.f44872m = false;
            db0Var.f48487p.setItemAnimator(kVar2);
        }
        FrameLayout frameLayout2 = db0Var.f48484m;
        this.actionBar.A(db0Var.f48487p, false);
        db0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        xh.k kVar = this.f35842a.f48490s;
        if (kVar != null) {
            if (z10) {
                kVar.e(false);
            }
            return false;
        }
        return true;
    }
}
