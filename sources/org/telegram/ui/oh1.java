package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class oh1 implements org.telegram.ui.ActionBar.a2, lc1 {
    public final WallpapersListActivity f39781a;

    public oh1(WallpapersListActivity wallpapersListActivity) {
        this.f39781a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f35223k0;
        this.f39781a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f39781a);
    }
}
