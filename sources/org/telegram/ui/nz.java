package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class nz extends org.telegram.ui.ActionBar.m2 {
    public long f40507a;
    public TLRPC.Chat f40508b;
    public boolean f40509c;
    public boolean d;
    public kz f40510e;
    public ai.m0 f40511f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.m2 m2Var : getParentLayout().getFragmentStack()) {
                if (m2Var instanceof vy) {
                    px pxVar = ((vy) m2Var).F3;
                    if (pxVar.c()) {
                        pxVar.a();
                    }
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new lc(this, 22));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? p71Var = new org.telegram.ui.Components.p71(this, new e5(this, 13), new ju(this, 6), null);
        this.f40510e = p71Var;
        p71Var.p1();
        this.f40510e.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20503a7, this.resourceProvider));
        frameLayout.addView(this.f40510e, w7.w5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.f40510e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f40508b = getMessagesController().getChat(Long.valueOf(-this.f40507a));
        return super.onFragmentCreate();
    }
}
