package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iz extends org.telegram.ui.ActionBar.p2 {
    public long f37804a;
    public TLRPC.Chat f37805b;
    public boolean f37806c;
    public boolean d;
    public fz f37807e;
    public eh.w f37808f;

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
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? h61Var = new org.telegram.ui.Components.h61(this, new d5(this, 13), new gu(this, 6), null);
        this.f37807e = h61Var;
        h61Var.o1();
        this.f37807e.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21607a7, this.resourceProvider));
        frameLayout.addView(this.f37807e, k7.c6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.f37807e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f37805b = getMessagesController().getChat(Long.valueOf(-this.f37804a));
        return super.onFragmentCreate();
    }
}
