package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class kx extends org.telegram.ui.ActionBar.d2 {
    public long f47043a;
    public TLRPC.Chat f47044b;
    public boolean f47045c;
    public boolean d;
    public boolean f47046e;
    public ai.i5 f47047f;
    public ei.d0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 0));
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131743991, null));
        FrameLayout frameLayout = new FrameLayout(context);
        ai.i5 i5Var = new ai.i5(this, new c5(this, 13), new ur(this, 9), null, 7);
        this.f47047f = i5Var;
        i5Var.r1();
        this.f47047f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f47047f, b8.mf.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f47047f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f47044b = getMessagesController().M0(Long.valueOf(-this.f47043a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
