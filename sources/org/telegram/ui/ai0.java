package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ai0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.fb0 f35981a;

    public ai0(long j3) {
        super(null);
        this.f35981a = new org.telegram.ui.Components.fb0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.fb0 fb0Var = this.f35981a;
        if (fb0Var.f50472a) {
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
        org.telegram.ui.ActionBar.n2 n2Var = fb0Var.f50477g;
        if (fb0Var.f50482m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            fb0Var.f50482m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20745a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.k10 b10 = fb0Var.b();
            fb0Var.f50486q = b10;
            fb0Var.f50482m.addView(b10, -1, -1);
            org.telegram.ui.Components.by0 c10 = fb0Var.c();
            fb0Var.f50484o = c10;
            fb0Var.f50482m.addView(c10, -1, -1);
            org.telegram.ui.Components.by0 a10 = fb0Var.a();
            fb0Var.f50483n = a10;
            fb0Var.f50482m.addView(a10, w7.x5.d(-1.0f, -1));
            n2Var.getParentActivity();
            s4.d0 d0Var = new s4.d0();
            org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(n2Var.getParentActivity(), null);
            fb0Var.f50485p = rm0Var;
            rm0Var.setAdapter(fb0Var.f50476f);
            fb0Var.f50485p.p1();
            fb0Var.f50485p.setLayoutManager(d0Var);
            fb0Var.f50485p.setOnItemClickListener(new ai.g(fb0Var, 19));
            fb0Var.f50485p.setOnScrollListener(fb0Var.D);
            fb0Var.f50485p.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, n2Var.getResourceProvider()));
            fb0Var.f50482m.addView(fb0Var.f50485p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.is.h);
            jVar.C = false;
            jVar.f47742m = false;
            fb0Var.f50485p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = fb0Var.f50482m;
        this.actionBar.B(fb0Var.f50485p, false);
        fb0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.k kVar = this.f35981a.f50488s;
        if (kVar != null) {
            if (z10) {
                kVar.e(false);
            }
            return false;
        }
        return true;
    }
}
