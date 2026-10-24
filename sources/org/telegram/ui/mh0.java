package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mh0 extends org.telegram.ui.ActionBar.o2 {
    public final org.telegram.ui.Components.wa0 f39593a;

    public mh0(long j10) {
        super(null);
        this.f39593a = new org.telegram.ui.Components.wa0(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 11));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.wa0 wa0Var = this.f39593a;
        if (wa0Var.f50306a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.o2 o2Var = wa0Var.f50310g;
        if (wa0Var.f50315m == null) {
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            wa0Var.f50315m = frameLayout;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, o2Var.getResourceProvider());
            org.telegram.ui.Components.z00 b10 = wa0Var.b();
            wa0Var.f50319q = b10;
            wa0Var.f50315m.addView(b10, -1, -1);
            org.telegram.ui.Components.vx0 c10 = wa0Var.c();
            wa0Var.f50317o = c10;
            wa0Var.f50315m.addView(c10, -1, -1);
            org.telegram.ui.Components.vx0 a10 = wa0Var.a();
            wa0Var.f50316n = a10;
            wa0Var.f50315m.addView(a10, w7.z5.c(-1.0f, -1));
            o2Var.getParentActivity();
            s4.b0 b0Var = new s4.b0();
            org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(o2Var.getParentActivity(), null);
            wa0Var.f50318p = lm0Var;
            lm0Var.setAdapter(wa0Var.f50309f);
            wa0Var.f50318p.t1();
            wa0Var.f50318p.setLayoutManager(b0Var);
            wa0Var.f50318p.setOnItemClickListener(new ai.xa(wa0Var, 23));
            wa0Var.f50318p.setOnScrollListener(wa0Var.D);
            org.telegram.ui.ActionBar.r6.L(wa0Var.f50318p, org.telegram.ui.ActionBar.k6.f21273i6, o2Var.getResourceProvider());
            wa0Var.f50315m.addView(wa0Var.f50318p, -1, -1);
            s4.k kVar2 = new s4.k();
            kVar2.n(350L);
            kVar2.o(org.telegram.ui.Components.zr.h);
            kVar2.C = false;
            kVar2.f46376m = false;
            wa0Var.f50318p.setItemAnimator(kVar2);
        }
        FrameLayout frameLayout2 = wa0Var.f50315m;
        this.actionBar.z(wa0Var.f50318p, false);
        wa0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        xh.j jVar = this.f39593a.f50321s;
        if (jVar != null) {
            if (z10) {
                jVar.e(false);
            }
            return false;
        }
        return true;
    }
}
