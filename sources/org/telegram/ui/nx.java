package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class nx extends org.telegram.ui.ActionBar.f2 {
    public long f48153a;
    public TLRPC.Chat f48154b;
    public boolean f48155c;
    public boolean d;
    public boolean f48156e;
    public kx f48157f;
    public di.b0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 29));
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131743984, null));
        FrameLayout frameLayout = new FrameLayout(context);
        kx kxVar = new kx(this, new a5(this, 13), new wr(this, 9), null, 0);
        this.f48157f = kxVar;
        kxVar.r1();
        this.f48157f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f48157f, c8.ha.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f48157f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f48154b = getMessagesController().M0(Long.valueOf(-this.f48153a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
