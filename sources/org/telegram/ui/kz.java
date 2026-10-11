package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class kz extends org.telegram.ui.ActionBar.m2 {
    public long f39450a;
    public TLRPC.Chat f39451b;
    public boolean f39452c;
    public boolean d;
    public hz f39453e;
    public ai.m0 f39454f;

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
        ?? m71Var = new org.telegram.ui.Components.m71(this, new a5(this, 13), new fu(this, 6), null);
        this.f39453e = m71Var;
        m71Var.p1();
        this.f39453e.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20730a7, this.resourceProvider));
        frameLayout.addView(this.f39453e, w7.x5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.f39453e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f39451b = getMessagesController().getChat(Long.valueOf(-this.f39450a));
        return super.onFragmentCreate();
    }
}
