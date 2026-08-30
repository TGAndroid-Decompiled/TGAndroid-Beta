package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class hz extends org.telegram.ui.ActionBar.p2 {
    public long f34974a;
    public TLRPC.Chat f34975b;
    public boolean f34976c;
    public boolean d;
    public ez e;
    public dh.v f34977f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.p2 p2Var : getParentLayout().getFragmentStack()) {
                if (p2Var instanceof oy) {
                    jx jxVar = ((oy) p2Var).C3;
                    if (jxVar.c()) {
                        jxVar.a();
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
        ?? g61Var = new org.telegram.ui.Components.g61(this, new d5(this, 13), new fu(this, 6), null);
        this.e = g61Var;
        g61Var.p1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, this.resourceProvider));
        frameLayout.addView(this.e, k7.b6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f34975b = getMessagesController().getChat(Long.valueOf(-this.f34974a));
        return super.onFragmentCreate();
    }
}
