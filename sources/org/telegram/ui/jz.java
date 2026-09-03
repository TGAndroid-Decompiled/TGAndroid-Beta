package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jz extends org.telegram.ui.ActionBar.p2 {
    public long f35390a;
    public TLRPC.Chat f35391b;
    public boolean f35392c;
    public boolean d;
    public gz e;
    public dh.v f35393f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.p2 p2Var : getParentLayout().getFragmentStack()) {
                if (p2Var instanceof qy) {
                    lx lxVar = ((qy) p2Var).C3;
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
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? g61Var = new org.telegram.ui.Components.g61(this, new f5(this, 13), new hu(this, 6), null);
        this.e = g61Var;
        g61Var.o1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, this.resourceProvider));
        frameLayout.addView(this.e, k7.b6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f35391b = getMessagesController().getChat(Long.valueOf(-this.f35390a));
        return super.onFragmentCreate();
    }
}
