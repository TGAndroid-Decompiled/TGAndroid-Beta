package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ii1 implements org.telegram.ui.ActionBar.c2, dd1 {
    public final WallpapersListActivity f37866a;

    public ii1(WallpapersListActivity wallpapersListActivity) {
        this.f37866a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f34941h0;
        this.f37866a.removeSelfFromStack();
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        WallpapersListActivity.U(this.f37866a);
    }
}
