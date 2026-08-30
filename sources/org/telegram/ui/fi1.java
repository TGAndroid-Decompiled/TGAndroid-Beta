package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fi1 implements org.telegram.ui.ActionBar.c2, bd1 {
    public final WallpapersListActivity f34267a;

    public fi1(WallpapersListActivity wallpapersListActivity) {
        this.f34267a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f32397h0;
        this.f34267a.removeSelfFromStack();
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        WallpapersListActivity.U(this.f34267a);
    }
}
