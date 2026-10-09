package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bj1 implements org.telegram.ui.ActionBar.a2, wd1 {
    public final WallpapersListActivity f36346a;

    public bj1(WallpapersListActivity wallpapersListActivity) {
        this.f36346a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f35759k0;
        this.f36346a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f36346a);
    }
}
