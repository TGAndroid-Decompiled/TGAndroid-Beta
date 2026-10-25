package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kh0 extends org.telegram.ui.ActionBar.r2 {
    public final org.telegram.ui.Components.ua0 f40944a;

    public kh0(long j10) {
        super(null);
        this.f40944a = new org.telegram.ui.Components.ua0(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new a20(this, 13));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ua0 ua0Var = this.f40944a;
        if (ua0Var.f52607a) {
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
        org.telegram.ui.ActionBar.r2 r2Var = ua0Var.f52611g;
        if (ua0Var.f52616m == null) {
            FrameLayout frameLayout = new FrameLayout(r2Var.getParentActivity());
            ua0Var.f52616m = frameLayout;
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23297a7, frameLayout, r2Var.getResourceProvider());
            org.telegram.ui.Components.c10 b10 = ua0Var.b();
            ua0Var.f52620q = b10;
            ua0Var.f52616m.addView(b10, -1, -1);
            org.telegram.ui.Components.ey0 c10 = ua0Var.c();
            ua0Var.f52618o = c10;
            ua0Var.f52616m.addView(c10, -1, -1);
            org.telegram.ui.Components.ey0 a10 = ua0Var.a();
            ua0Var.f52617n = a10;
            ua0Var.f52616m.addView(a10, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            r2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(r2Var.getParentActivity(), null);
            ua0Var.f52619p = mm0Var;
            mm0Var.setAdapter(ua0Var.f52610f);
            ua0Var.f52619p.u1();
            ua0Var.f52619p.setLayoutManager(c0Var);
            ua0Var.f52619p.setOnItemClickListener(new ai.k(ua0Var, 24));
            ua0Var.f52619p.setOnScrollListener(ua0Var.D);
            org.telegram.ui.ActionBar.f7.K(ua0Var.f52619p, org.telegram.ui.ActionBar.y6.f23446i6, r2Var.getResourceProvider());
            ua0Var.f52616m.addView(ua0Var.f52619p, -1, -1);
            s4.l lVar = new s4.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.ds.h);
            lVar.C = false;
            lVar.f47760m = false;
            ua0Var.f52619p.setItemAnimator(lVar);
        }
        FrameLayout frameLayout2 = ua0Var.f52616m;
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.mm0 mm0Var2 = ua0Var.f52619p;
        kVar2.getClass();
        kVar2.w(mm0Var2, org.telegram.ui.ActionBar.y6.f23297a7, org.telegram.ui.ActionBar.y6.f23634s8);
        ua0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        yh.j jVar = this.f40944a.f52622s;
        if (jVar != null) {
            if (z10) {
                jVar.e(false);
            }
            return false;
        }
        return true;
    }
}
