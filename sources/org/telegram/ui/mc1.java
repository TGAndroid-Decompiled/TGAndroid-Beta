package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mc1 implements org.telegram.ui.ActionBar.r1, w71 {
    public final WallpapersListActivity f49835a;

    public mc1(WallpapersListActivity wallpapersListActivity) {
        this.f49835a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.f49835a.removeSelfFromStack();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        WallpapersListActivity.a0(this.f49835a);
    }
}
