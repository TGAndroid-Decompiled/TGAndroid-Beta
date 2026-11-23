package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nc1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f50294a;

    public nc1(WallpapersListActivity wallpapersListActivity) {
        this.f50294a = wallpapersListActivity;
    }

    @Override
    public final void b(int i7) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        WallpapersListActivity wallpapersListActivity = this.f50294a;
        LongSparseArray longSparseArray = wallpapersListActivity.f45516f0;
        if (i7 == -1) {
            z4Var = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).simpleActionBar;
            if (z4Var.x()) {
                longSparseArray.clear();
                z4Var2 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).simpleActionBar;
                z4Var2.w();
                wallpapersListActivity.I0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i7 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String G = org.telegram.messenger.gd.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = G;
                t1Var.U = org.telegram.messenger.gd.a0("DeleteChatBackgroundsAlert", null, 2131751542, new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new mc1(this));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                wallpapersListActivity.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                }
            }
        } else if (i7 == 3) {
            bx bxVar = new bx(org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true));
            bxVar.E2 = new mc1(this);
            wallpapersListActivity.presentFragment(bxVar);
        }
    }
}
