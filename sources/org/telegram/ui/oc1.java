package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class oc1 implements org.telegram.ui.ActionBar.r1, w71 {
    public final WallpapersListActivity f48499a;

    public oc1(WallpapersListActivity wallpapersListActivity) {
        this.f48499a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.f48499a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        WallpapersListActivity.a0(this.f48499a);
    }
}
