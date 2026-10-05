package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mz extends org.telegram.ui.ActionBar.n2 {
    public long f38772a;
    public TLRPC.Chat f38773b;
    public boolean f38774c;
    public boolean d;
    public jz f38775e;
    public ai.m0 f38776f;

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
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? e71Var = new org.telegram.ui.Components.e71(this, new c5(this, 13), new bu(this, 8), null);
        this.f38775e = e71Var;
        e71Var.r1();
        this.f38775e.setSectionsDrawBackground(true);
        frameLayout.addView(this.f38775e, w7.z5.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f38775e;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f38773b = getMessagesController().getChat(Long.valueOf(-this.f38772a));
        return super.onFragmentCreate();
    }
}
