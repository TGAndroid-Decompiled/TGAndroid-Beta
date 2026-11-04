package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ec1 implements org.telegram.ui.ActionBar.p1, k71 {
    public final WallpapersListActivity f44964a;

    public ec1(WallpapersListActivity wallpapersListActivity) {
        this.f44964a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.f44964a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        WallpapersListActivity.a0(this.f44964a);
    }
}
