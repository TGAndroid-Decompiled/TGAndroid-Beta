package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qc1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f49024a;

    public qc1(WallpapersListActivity wallpapersListActivity) {
        this.f49024a = wallpapersListActivity;
    }

    @Override
    public final void b(int i7) {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        WallpapersListActivity wallpapersListActivity = this.f49024a;
        LongSparseArray longSparseArray = wallpapersListActivity.f43496e0;
        if (i7 == -1) {
            y4Var = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
            if (y4Var.t()) {
                longSparseArray.clear();
                y4Var2 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
                y4Var2.s();
                wallpapersListActivity.I0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i7 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String G = org.telegram.messenger.id.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = G;
                u1Var.T = org.telegram.messenger.id.a0("DeleteChatBackgroundsAlert", null, 2131751554, new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new pc1(this));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                wallpapersListActivity.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                }
            }
        } else if (i7 == 3) {
            yw ywVar = new yw(org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true));
            ywVar.D2 = new pc1(this);
            wallpapersListActivity.presentFragment(ywVar);
        }
    }
}
