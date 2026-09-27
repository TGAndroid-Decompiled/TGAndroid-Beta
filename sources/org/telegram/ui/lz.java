package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lz extends org.telegram.ui.ActionBar.o2 {
    public long f35478a;
    public TLRPC.Chat f35479b;
    public boolean f35480c;
    public boolean d;
    public iz e;
    public ai.m0 f35481f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.o2 o2Var : getParentLayout().getFragmentStack()) {
                if (o2Var instanceof ty) {
                    kx kxVar = ((ty) o2Var).F3;
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
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? t61Var = new org.telegram.ui.Components.t61(this, new d5(this, 13), new au(this, 8), null);
        this.e = t61Var;
        t61Var.q1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19001a7, this.resourceProvider));
        frameLayout.addView(this.e, w7.y5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f35479b = getMessagesController().getChat(Long.valueOf(-this.f35478a));
        return super.onFragmentCreate();
    }
}
