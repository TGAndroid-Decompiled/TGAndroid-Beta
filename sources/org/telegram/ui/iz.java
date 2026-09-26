package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iz extends org.telegram.ui.ActionBar.m2 {
    public long f34602a;
    public TLRPC.Chat f34603b;
    public boolean f34604c;
    public boolean d;
    public fz e;
    public ai.m0 f34605f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.m2 m2Var : getParentLayout().getFragmentStack()) {
                if (m2Var instanceof qy) {
                    kx kxVar = ((qy) m2Var).F3;
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
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? r61Var = new org.telegram.ui.Components.r61(this, new b5(this, 13), new du(this, 6), null);
        this.e = r61Var;
        r61Var.p1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19003a7, this.resourceProvider));
        frameLayout.addView(this.e, w7.y5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f34603b = getMessagesController().getChat(Long.valueOf(-this.f34602a));
        return super.onFragmentCreate();
    }
}
