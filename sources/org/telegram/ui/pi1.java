package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pi1 implements org.telegram.ui.ActionBar.b2, od1 {
    public final WallpapersListActivity f36495a;

    public pi1(WallpapersListActivity wallpapersListActivity) {
        this.f36495a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f31906i0;
        this.f36495a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        WallpapersListActivity.U(this.f36495a);
    }
}
