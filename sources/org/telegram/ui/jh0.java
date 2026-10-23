package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jh0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.xa0 f38270a;

    public jh0(long j10) {
        super(null);
        this.f38270a = new org.telegram.ui.Components.xa0(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 11));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.xa0 xa0Var = this.f38270a;
        if (xa0Var.f49867a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.c2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = xa0Var.f49871g;
        if (xa0Var.f49876m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            xa0Var.f49876m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20936a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.b10 b10 = xa0Var.b();
            xa0Var.f49880q = b10;
            xa0Var.f49876m.addView(b10, -1, -1);
            org.telegram.ui.Components.tx0 c10 = xa0Var.c();
            xa0Var.f49878o = c10;
            xa0Var.f49876m.addView(c10, -1, -1);
            org.telegram.ui.Components.tx0 a10 = xa0Var.a();
            xa0Var.f49877n = a10;
            xa0Var.f49876m.addView(a10, w7.z5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.b0 b0Var = new s4.b0();
            org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(n2Var.getParentActivity(), null);
            xa0Var.f49879p = jm0Var;
            jm0Var.setAdapter(xa0Var.f49870f);
            xa0Var.f49879p.p1();
            xa0Var.f49879p.setLayoutManager(b0Var);
            xa0Var.f49879p.setOnItemClickListener(new ai.wa(xa0Var, 23));
            xa0Var.f49879p.setOnScrollListener(xa0Var.D);
            xa0Var.f49879p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21083i6, n2Var.getResourceProvider()));
            xa0Var.f49876m.addView(xa0Var.f49879p, -1, -1);
            s4.k kVar2 = new s4.k();
            kVar2.n(350L);
            kVar2.o(org.telegram.ui.Components.bs.h);
            kVar2.C = false;
            kVar2.f45955m = false;
            xa0Var.f49879p.setItemAnimator(kVar2);
        }
        FrameLayout frameLayout2 = xa0Var.f49876m;
        this.actionBar.A(xa0Var.f49879p, false);
        xa0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        xh.j jVar = this.f38270a.f49882s;
        if (jVar != null) {
            if (z10) {
                jVar.e(false);
            }
            return false;
        }
        return true;
    }
}
