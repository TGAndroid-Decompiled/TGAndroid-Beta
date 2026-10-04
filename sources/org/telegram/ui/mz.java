package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mz extends org.telegram.ui.ActionBar.n2 {
    public long f38781a;
    public TLRPC.Chat f38782b;
    public boolean f38783c;
    public boolean d;
    public jz f38784e;
    public ai.m0 f38785f;

    public final void S() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
                if (n2Var instanceof uy) {
                    mx mxVar = ((uy) n2Var).F3;
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
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? c71Var = new org.telegram.ui.Components.c71(this, new c5(this, 13), new bu(this, 8), null);
        this.f38784e = c71Var;
        c71Var.s1();
        this.f38784e.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20762a7, this.resourceProvider));
        frameLayout.addView(this.f38784e, w7.z5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.f38784e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f38782b = getMessagesController().getChat(Long.valueOf(-this.f38781a));
        return super.onFragmentCreate();
    }
}
