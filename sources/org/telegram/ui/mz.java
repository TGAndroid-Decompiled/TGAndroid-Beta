package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mz extends org.telegram.ui.ActionBar.n2 {
    public long f38786a;
    public TLRPC.Chat f38787b;
    public boolean f38788c;
    public boolean d;
    public jz f38789e;
    public bi.f0 f38790f;

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
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 22));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? d61Var = new org.telegram.ui.Components.d61(this, new b5(this, 13), new iu(this, 6), null);
        this.f38789e = d61Var;
        d61Var.o1();
        this.f38789e.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20607a7, this.resourceProvider));
        frameLayout.addView(this.f38789e, w7.x5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.f38789e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f38787b = getMessagesController().getChat(Long.valueOf(-this.f38786a));
        return super.onFragmentCreate();
    }
}
