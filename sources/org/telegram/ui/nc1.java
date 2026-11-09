package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class nc1 implements org.telegram.ui.ActionBar.r1, v71 {
    public final WallpapersListActivity f48161a;

    public nc1(WallpapersListActivity wallpapersListActivity) {
        this.f48161a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.f48161a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        WallpapersListActivity.a0(this.f48161a);
    }
}
