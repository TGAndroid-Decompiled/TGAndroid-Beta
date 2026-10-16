package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ei0 extends org.telegram.ui.ActionBar.m2 {
    public final org.telegram.ui.Components.db0 f35308a;

    public ei0(long j10) {
        super(null);
        this.f35308a = new org.telegram.ui.Components.db0(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 10));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.db0 db0Var = this.f35308a;
        if (db0Var.f48474a) {
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
        org.telegram.ui.ActionBar.m2 m2Var = db0Var.f48478g;
        if (db0Var.f48483m == null) {
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            db0Var.f48483m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19543a7, m2Var.getResourceProvider()));
            org.telegram.ui.Components.f10 b10 = db0Var.b();
            db0Var.f48487q = b10;
            db0Var.f48483m.addView(b10, -1, -1);
            org.telegram.ui.Components.wx0 c10 = db0Var.c();
            db0Var.f48485o = c10;
            db0Var.f48483m.addView(c10, -1, -1);
            org.telegram.ui.Components.wx0 a10 = db0Var.a();
            db0Var.f48484n = a10;
            db0Var.f48483m.addView(a10, w7.z5.d(-1.0f, -1));
            m2Var.getParentActivity();
            s4.b0 b0Var = new s4.b0();
            org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(m2Var.getParentActivity(), null);
            db0Var.f48486p = mm0Var;
            mm0Var.setAdapter(db0Var.f48477f);
            db0Var.f48486p.p1();
            db0Var.f48486p.setLayoutManager(b0Var);
            db0Var.f48486p.setOnItemClickListener(new bi.d(db0Var, 19));
            db0Var.f48486p.setOnScrollListener(db0Var.D);
            db0Var.f48486p.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, m2Var.getResourceProvider()));
            db0Var.f48483m.addView(db0Var.f48486p, -1, -1);
            s4.k kVar2 = new s4.k();
            kVar2.n(350L);
            kVar2.o(org.telegram.ui.Components.es.h);
            kVar2.C = false;
            kVar2.f44872m = false;
            db0Var.f48486p.setItemAnimator(kVar2);
        }
        FrameLayout frameLayout2 = db0Var.f48483m;
        this.actionBar.B(db0Var.f48486p, false);
        db0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        xh.k kVar = this.f35308a.f48489s;
        if (kVar != null) {
            if (z10) {
                kVar.e(false);
            }
            return false;
        }
        return true;
    }
}
