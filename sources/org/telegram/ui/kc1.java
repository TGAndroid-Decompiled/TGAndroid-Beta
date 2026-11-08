package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kc1 implements org.telegram.ui.ActionBar.r1, u71 {
    public final WallpapersListActivity f47173a;

    public kc1(WallpapersListActivity wallpapersListActivity) {
        this.f47173a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.f47173a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        WallpapersListActivity.a0(this.f47173a);
    }
}
