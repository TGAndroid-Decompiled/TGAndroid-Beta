package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iz extends org.telegram.ui.ActionBar.p2 {
    public long f37958a;
    public TLRPC.Chat f37959b;
    public boolean f37960c;
    public boolean d;
    public fz f37961e;
    public eh.w f37962f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.p2 p2Var : getParentLayout().getFragmentStack()) {
                if (p2Var instanceof py) {
                    kx kxVar = ((py) p2Var).C3;
                    if (kxVar.c()) {
                        kxVar.a();
                    }
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? i61Var = new org.telegram.ui.Components.i61(this, new d5(this, 13), new gu(this, 6), null);
        this.f37961e = i61Var;
        i61Var.p1();
        this.f37961e.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21605a7, this.resourceProvider));
        frameLayout.addView(this.f37961e, k7.c6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.f37961e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f37959b = getMessagesController().getChat(Long.valueOf(-this.f37958a));
        return super.onFragmentCreate();
    }
}
