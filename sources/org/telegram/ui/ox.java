package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class ox extends org.telegram.ui.ActionBar.e2 {
    public long f50050a;
    public TLRPC.Chat f50051b;
    public boolean f50052c;
    public boolean d;
    public boolean f50053e;
    public bi.y4 f50054f;
    public fi.b0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 0));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131743981, null));
        FrameLayout frameLayout = new FrameLayout(context);
        bi.y4 y4Var = new bi.y4(this, new a5(this, 13), new zr(this, 9), null, 7);
        this.f50054f = y4Var;
        y4Var.r1();
        this.f50054f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f50054f, c8.ja.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f50054f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f50051b = getMessagesController().M0(Long.valueOf(-this.f50050a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
