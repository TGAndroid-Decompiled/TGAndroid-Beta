package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class jc1 implements org.telegram.ui.ActionBar.r1, t71 {
    public final WallpapersListActivity f46932a;

    public jc1(WallpapersListActivity wallpapersListActivity) {
        this.f46932a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.f46932a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        WallpapersListActivity.a0(this.f46932a);
    }
}
