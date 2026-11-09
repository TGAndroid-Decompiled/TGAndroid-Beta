package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class px extends org.telegram.ui.ActionBar.f2 {
    public long f48824a;
    public TLRPC.Chat f48825b;
    public boolean f48826c;
    public boolean d;
    public boolean f48827e;
    public mx f48828f;
    public di.b0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 29));
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131743981, null));
        FrameLayout frameLayout = new FrameLayout(context);
        mx mxVar = new mx(this, new a5(this, 13), new yr(this, 9), null, 0);
        this.f48828f = mxVar;
        mxVar.r1();
        this.f48828f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f48828f, c8.ha.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f48828f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f48825b = getMessagesController().M0(Long.valueOf(-this.f48824a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
