package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fe1 implements org.telegram.ui.ActionBar.u1, j91 {
    public final WallpapersListActivity f37119a;

    public fe1(WallpapersListActivity wallpapersListActivity) {
        this.f37119a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.f37119a.removeSelfFromStack();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        WallpapersListActivity.a0(this.f37119a);
    }
}
