package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jz extends org.telegram.ui.ActionBar.n2 {
    public long f34531a;
    public TLRPC.Chat f34532b;
    public boolean f34533c;
    public boolean d;
    public gz e;
    public ai.m0 f34534f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
                if (n2Var instanceof ry) {
                    lx lxVar = ((ry) n2Var).F3;
                    if (lxVar.c()) {
                        lxVar.a();
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
        ?? d61Var = new org.telegram.ui.Components.d61(this, new c5(this, 13), new eu(this, 6), null);
        this.e = d61Var;
        d61Var.p1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18733a7, this.resourceProvider));
        frameLayout.addView(this.e, w7.x5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f34532b = getMessagesController().getChat(Long.valueOf(-this.f34531a));
        return super.onFragmentCreate();
    }
}
