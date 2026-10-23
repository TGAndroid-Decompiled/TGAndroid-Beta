package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mh1 implements org.telegram.ui.ActionBar.a2, jc1 {
    public final WallpapersListActivity f39253a;

    public mh1(WallpapersListActivity wallpapersListActivity) {
        this.f39253a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f35211k0;
        this.f39253a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f39253a);
    }
}
