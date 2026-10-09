package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ai0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.eb0 f35937a;

    public ai0(long j3) {
        super(null);
        this.f35937a = new org.telegram.ui.Components.eb0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.eb0 eb0Var = this.f35937a;
        if (eb0Var.f50428a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = eb0Var.f50433g;
        if (eb0Var.f50438m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            eb0Var.f50438m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20741a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.j10 b10 = eb0Var.b();
            eb0Var.f50442q = b10;
            eb0Var.f50438m.addView(b10, -1, -1);
            org.telegram.ui.Components.ay0 c10 = eb0Var.c();
            eb0Var.f50440o = c10;
            eb0Var.f50438m.addView(c10, -1, -1);
            org.telegram.ui.Components.ay0 a10 = eb0Var.a();
            eb0Var.f50439n = a10;
            eb0Var.f50438m.addView(a10, w7.x5.d(-1.0f, -1));
            n2Var.getParentActivity();
            s4.d0 d0Var = new s4.d0();
            org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(n2Var.getParentActivity(), null);
            eb0Var.f50441p = qm0Var;
            qm0Var.setAdapter(eb0Var.f50432f);
            eb0Var.f50441p.p1();
            eb0Var.f50441p.setLayoutManager(d0Var);
            eb0Var.f50441p.setOnItemClickListener(new ai.g(eb0Var, 19));
            eb0Var.f50441p.setOnScrollListener(eb0Var.D);
            eb0Var.f50441p.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, n2Var.getResourceProvider()));
            eb0Var.f50438m.addView(eb0Var.f50441p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.hs.h);
            jVar.C = false;
            jVar.f47698m = false;
            eb0Var.f50441p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = eb0Var.f50438m;
        this.actionBar.B(eb0Var.f50441p, false);
        eb0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.k kVar = this.f35937a.f50444s;
        if (kVar != null) {
            if (z10) {
                kVar.e(false);
            }
            return false;
        }
        return true;
    }
}
