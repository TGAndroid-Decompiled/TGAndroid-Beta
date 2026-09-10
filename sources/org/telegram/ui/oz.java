package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class oz extends org.telegram.ui.ActionBar.p2 {
    public long f35646a;
    public TLRPC.Chat f35647b;
    public boolean f35648c;
    public boolean d;
    public lz e;
    public bi.k6 f35649f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.p2 p2Var : getParentLayout().getFragmentStack()) {
                if (p2Var instanceof wy) {
                    qx qxVar = ((wy) p2Var).F3;
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
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? r61Var = new org.telegram.ui.Components.r61(this, new b5(this, 13), new iu(this, 6), null);
        this.e = r61Var;
        r61Var.o1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, this.resourceProvider));
        frameLayout.addView(this.e, w7.a6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f35647b = getMessagesController().getChat(Long.valueOf(-this.f35646a));
        return super.onFragmentCreate();
    }
}
