package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class jc1 implements org.telegram.ui.ActionBar.q1, s71 {
    public final WallpapersListActivity f48291a;

    public jc1(WallpapersListActivity wallpapersListActivity) {
        this.f48291a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.f48291a.removeSelfFromStack();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        WallpapersListActivity.a0(this.f48291a);
    }
}
