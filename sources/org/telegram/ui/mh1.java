package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mh1 implements org.telegram.ui.ActionBar.a2, jc1 {
    public final WallpapersListActivity f39278a;

    public mh1(WallpapersListActivity wallpapersListActivity) {
        this.f39278a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f35198k0;
        this.f39278a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f39278a);
    }
}
