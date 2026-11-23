package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mc1 implements org.telegram.ui.ActionBar.q1, w71 {
    public final WallpapersListActivity f49827a;

    public mc1(WallpapersListActivity wallpapersListActivity) {
        this.f49827a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.f49827a.removeSelfFromStack();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        WallpapersListActivity.a0(this.f49827a);
    }
}
