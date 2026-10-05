package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pi1 implements org.telegram.ui.ActionBar.a2, od1 {
    public final WallpapersListActivity f39597a;

    public pi1(WallpapersListActivity wallpapersListActivity) {
        this.f39597a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f34613i0;
        this.f39597a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.S(this.f39597a);
    }
}
