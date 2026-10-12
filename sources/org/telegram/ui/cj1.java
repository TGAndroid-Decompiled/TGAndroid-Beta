package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cj1 implements org.telegram.ui.ActionBar.z1, yd1 {
    public final WallpapersListActivity f36451a;

    public cj1(WallpapersListActivity wallpapersListActivity) {
        this.f36451a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f35610k0;
        this.f36451a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        WallpapersListActivity.U(this.f36451a);
    }
}
