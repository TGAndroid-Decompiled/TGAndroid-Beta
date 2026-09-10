package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ej1 implements org.telegram.ui.ActionBar.c2, zd1 {
    public final WallpapersListActivity f32226a;

    public ej1(WallpapersListActivity wallpapersListActivity) {
        this.f32226a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f30730k0;
        this.f32226a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        WallpapersListActivity.U(this.f32226a);
    }
}
