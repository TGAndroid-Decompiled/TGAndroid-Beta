package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nh0 extends org.telegram.ui.ActionBar.o2 {
    public final org.telegram.ui.Components.ya0 f39873a;

    public nh0(long j10) {
        super(null);
        this.f39873a = new org.telegram.ui.Components.ya0(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 11));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ya0 ya0Var = this.f39873a;
        if (ya0Var.f50307a) {
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
        org.telegram.ui.ActionBar.o2 o2Var = ya0Var.f50311g;
        if (ya0Var.f50316m == null) {
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            ya0Var.f50316m = frameLayout;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, frameLayout, o2Var.getResourceProvider());
            org.telegram.ui.Components.b10 b10 = ya0Var.b();
            ya0Var.f50320q = b10;
            ya0Var.f50316m.addView(b10, -1, -1);
            org.telegram.ui.Components.wx0 c10 = ya0Var.c();
            ya0Var.f50318o = c10;
            ya0Var.f50316m.addView(c10, -1, -1);
            org.telegram.ui.Components.wx0 a10 = ya0Var.a();
            ya0Var.f50317n = a10;
            ya0Var.f50316m.addView(a10, w7.z5.c(-1.0f, -1));
            o2Var.getParentActivity();
            s4.b0 b0Var = new s4.b0();
            org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(o2Var.getParentActivity(), null);
            ya0Var.f50319p = mm0Var;
            mm0Var.setAdapter(ya0Var.f50310f);
            ya0Var.f50319p.t1();
            ya0Var.f50319p.setLayoutManager(b0Var);
            ya0Var.f50319p.setOnItemClickListener(new ai.xa(ya0Var, 23));
            ya0Var.f50319p.setOnScrollListener(ya0Var.D);
            org.telegram.ui.ActionBar.r6.L(ya0Var.f50319p, org.telegram.ui.ActionBar.k6.f21272i6, o2Var.getResourceProvider());
            ya0Var.f50316m.addView(ya0Var.f50319p, -1, -1);
            s4.k kVar2 = new s4.k();
            kVar2.n(350L);
            kVar2.o(org.telegram.ui.Components.bs.h);
            kVar2.C = false;
            kVar2.f46377m = false;
            ya0Var.f50319p.setItemAnimator(kVar2);
        }
        FrameLayout frameLayout2 = ya0Var.f50316m;
        this.actionBar.z(ya0Var.f50319p, false);
        ya0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        xh.j jVar = this.f39873a.f50322s;
        if (jVar != null) {
            if (z10) {
                jVar.e(false);
            }
            return false;
        }
        return true;
    }
}
