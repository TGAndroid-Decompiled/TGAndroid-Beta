package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mc1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f49215a;

    public mc1(WallpapersListActivity wallpapersListActivity) {
        this.f49215a = wallpapersListActivity;
    }

    @Override
    public final void b(int i7) {
        org.telegram.ui.ActionBar.w4 w4Var;
        org.telegram.ui.ActionBar.w4 w4Var2;
        WallpapersListActivity wallpapersListActivity = this.f49215a;
        LongSparseArray longSparseArray = wallpapersListActivity.f44881f0;
        if (i7 == -1) {
            w4Var = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).simpleActionBar;
            if (w4Var.v()) {
                longSparseArray.clear();
                w4Var2 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).simpleActionBar;
                w4Var2.u();
                wallpapersListActivity.I0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i7 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String G = org.telegram.messenger.hd.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = G;
                t1Var.U = org.telegram.messenger.hd.a0("DeleteChatBackgroundsAlert", null, 2131751554, new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new lc1(this));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                wallpapersListActivity.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                }
            }
        } else if (i7 == 3) {
            yw ywVar = new yw(org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true));
            ywVar.E2 = new lc1(this);
            wallpapersListActivity.presentFragment(ywVar);
        }
    }
}
