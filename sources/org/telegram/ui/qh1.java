package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class qh1 implements org.telegram.ui.ActionBar.a2, mc1 {

    public final WallpapersListActivity f41674a;

    public qh1(WallpapersListActivity wallpapersListActivity) {
        this.f41674a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f36299g0;
        this.f41674a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f41674a);
    }
}
