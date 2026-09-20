package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mz extends org.telegram.ui.ActionBar.n2 {
    public long f35851a;
    public TLRPC.Chat f35852b;
    public boolean f35853c;
    public boolean d;
    public jz e;
    public ai.m0 f35854f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
                if (n2Var instanceof uy) {
                    ox oxVar = ((uy) n2Var).F3;
                    if (oxVar.c()) {
                        oxVar.a();
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
        ?? s61Var = new org.telegram.ui.Components.s61(this, new b5(this, 13), new fu(this, 7), null);
        this.e = s61Var;
        s61Var.q1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19038a7, this.resourceProvider));
        frameLayout.addView(this.e, w7.y5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f35852b = getMessagesController().getChat(Long.valueOf(-this.f35851a));
        return super.onFragmentCreate();
    }
}
