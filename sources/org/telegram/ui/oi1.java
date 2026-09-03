package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class oi1 implements org.telegram.ui.ActionBar.c2, id1 {
    public final WallpapersListActivity f39746a;

    public oi1(WallpapersListActivity wallpapersListActivity) {
        this.f39746a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f34941h0;
        this.f39746a.removeSelfFromStack();
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        WallpapersListActivity.U(this.f39746a);
    }
}
