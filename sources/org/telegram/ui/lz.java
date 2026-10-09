package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lz extends org.telegram.ui.ActionBar.n2 {
    public long f39707a;
    public TLRPC.Chat f39708b;
    public boolean f39709c;
    public boolean d;
    public iz f39710e;
    public ai.m0 f39711f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
                if (n2Var instanceof ty) {
                    nx nxVar = ((ty) n2Var).F3;
                    if (nxVar.c()) {
                        nxVar.a();
                    }
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? k71Var = new org.telegram.ui.Components.k71(this, new b5(this, 13), new gu(this, 6), null);
        this.f39710e = k71Var;
        k71Var.p1();
        this.f39710e.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20741a7, this.resourceProvider));
        frameLayout.addView(this.f39710e, w7.x5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.f39710e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f39708b = getMessagesController().getChat(Long.valueOf(-this.f39707a));
        return super.onFragmentCreate();
    }
}
