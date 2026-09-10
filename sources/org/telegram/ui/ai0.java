package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ai0 extends org.telegram.ui.ActionBar.p2 {
    public final org.telegram.ui.Components.ma0 f31012a;

    public ai0(long j3) {
        super(null);
        this.f31012a = new org.telegram.ui.Components.ma0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.Components.ma0 ma0Var = this.f31012a;
        if (ma0Var.f43398a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        lVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.p2 p2Var = ma0Var.f43402g;
        if (ma0Var.f43407m == null) {
            FrameLayout frameLayout = new FrameLayout(p2Var.getParentActivity());
            ma0Var.f43407m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, p2Var.getResourceProvider()));
            org.telegram.ui.Components.a10 b10 = ma0Var.b();
            ma0Var.f43411q = b10;
            ma0Var.f43407m.addView(b10, -1, -1);
            org.telegram.ui.Components.jx0 c10 = ma0Var.c();
            ma0Var.f43409o = c10;
            ma0Var.f43407m.addView(c10, -1, -1);
            org.telegram.ui.Components.jx0 a10 = ma0Var.a();
            ma0Var.f43408n = a10;
            ma0Var.f43407m.addView(a10, w7.a6.c(-1.0f, -1));
            p2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(p2Var.getParentActivity(), null);
            ma0Var.f43410p = vl0Var;
            vl0Var.setAdapter(ma0Var.f43401f);
            ma0Var.f43410p.o1();
            ma0Var.f43410p.setLayoutManager(c0Var);
            ma0Var.f43410p.setOnItemClickListener(new ai.g(ma0Var, 18));
            ma0Var.f43410p.setOnScrollListener(ma0Var.D);
            ma0Var.f43410p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, p2Var.getResourceProvider()));
            ma0Var.f43407m.addView(ma0Var.f43410p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.wr.h);
            jVar.C = false;
            jVar.f41645m = false;
            ma0Var.f43410p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = ma0Var.f43407m;
        this.actionBar.z(ma0Var.f43410p, false);
        ma0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        vh.o oVar = this.f31012a.f43413s;
        if (oVar != null) {
            if (z10) {
                oVar.e(false);
            }
            return false;
        }
        return true;
    }
}
