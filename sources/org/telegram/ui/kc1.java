package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kc1 implements org.telegram.ui.ActionBar.q1, u71 {
    public final WallpapersListActivity f49402a;

    public kc1(WallpapersListActivity wallpapersListActivity) {
        this.f49402a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.f49402a.removeSelfFromStack();
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        WallpapersListActivity.a0(this.f49402a);
    }
}
