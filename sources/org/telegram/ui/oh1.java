package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class oh1 implements org.telegram.ui.ActionBar.a2, lc1 {
    public final WallpapersListActivity f39795a;

    public oh1(WallpapersListActivity wallpapersListActivity) {
        this.f39795a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f35195k0;
        this.f39795a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f39795a);
    }
}
