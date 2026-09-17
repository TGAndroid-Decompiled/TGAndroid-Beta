package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class oz extends org.telegram.ui.ActionBar.o2 {
    public long f36459a;
    public TLRPC.Chat f36460b;
    public boolean f36461c;
    public boolean d;
    public lz e;
    public ai.m0 f36462f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.o2 o2Var : getParentLayout().getFragmentStack()) {
                if (o2Var instanceof wy) {
                    qx qxVar = ((wy) o2Var).F3;
                    if (qxVar.c()) {
                        qxVar.a();
                    }
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new to(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? f61Var = new org.telegram.ui.Components.f61(this, new b5(this, 13), new gu(this, 7), null);
        this.e = f61Var;
        f61Var.q1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18806a7, this.resourceProvider));
        frameLayout.addView(this.e, w7.x5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36460b = getMessagesController().getChat(Long.valueOf(-this.f36459a));
        return super.onFragmentCreate();
    }
}
