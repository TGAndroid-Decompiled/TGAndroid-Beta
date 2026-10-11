package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class kz extends org.telegram.ui.ActionBar.m2 {
    public long f39484a;
    public TLRPC.Chat f39485b;
    public boolean f39486c;
    public boolean d;
    public hz f39487e;
    public ai.m0 f39488f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.m2 m2Var : getParentLayout().getFragmentStack()) {
                if (m2Var instanceof sy) {
                    mx mxVar = ((sy) m2Var).F3;
                    if (mxVar.c()) {
                        mxVar.a();
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
        ?? l71Var = new org.telegram.ui.Components.l71(this, new a5(this, 13), new fu(this, 6), null);
        this.f39487e = l71Var;
        l71Var.p1();
        this.f39487e.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20766a7, this.resourceProvider));
        frameLayout.addView(this.f39487e, w7.x5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.f39487e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f39485b = getMessagesController().getChat(Long.valueOf(-this.f39484a));
        return super.onFragmentCreate();
    }
}
