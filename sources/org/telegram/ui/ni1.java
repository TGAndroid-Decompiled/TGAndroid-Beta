package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ni1 implements org.telegram.ui.ActionBar.c2, id1 {
    public final WallpapersListActivity f36525a;

    public ni1(WallpapersListActivity wallpapersListActivity) {
        this.f36525a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f32371h0;
        this.f36525a.removeSelfFromStack();
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        WallpapersListActivity.U(this.f36525a);
    }
}
