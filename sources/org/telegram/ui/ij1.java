package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ij1 implements org.telegram.ui.ActionBar.z1, be1 {
    public final WallpapersListActivity f37150a;

    public ij1(WallpapersListActivity wallpapersListActivity) {
        this.f37150a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f33971k0;
        this.f37150a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        WallpapersListActivity.U(this.f37150a);
    }
}
