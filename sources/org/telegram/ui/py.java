package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class py extends org.telegram.ui.ActionBar.k2 {
    public long f40633a;
    public TLRPC.Chat f40634b;
    public boolean f40635c;
    public boolean d;
    public boolean e;
    public my f40636f;
    public jo h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 20));
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131744006, null));
        FrameLayout frameLayout = new FrameLayout(context);
        my myVar = new my(this, new z4(this, 13), new st(this, 8), null, 0);
        this.f40636f = myVar;
        myVar.r1();
        this.f40636f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f40636f, w7.b6.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f40636f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f40634b = getMessagesController().L0(Long.valueOf(-this.f40633a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
