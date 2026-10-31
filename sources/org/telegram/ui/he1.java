package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class he1 implements org.telegram.ui.ActionBar.u1, l91 {
    public final WallpapersListActivity f37913a;

    public he1(WallpapersListActivity wallpapersListActivity) {
        this.f37913a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.f37913a.removeSelfFromStack();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        WallpapersListActivity.Z(this.f37913a);
    }
}
