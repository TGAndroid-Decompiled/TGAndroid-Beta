package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cj1 implements org.telegram.ui.ActionBar.z1, yd1 {
    public final WallpapersListActivity f36449a;

    public cj1(WallpapersListActivity wallpapersListActivity) {
        this.f36449a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f35608k0;
        this.f36449a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        WallpapersListActivity.U(this.f36449a);
    }
}
