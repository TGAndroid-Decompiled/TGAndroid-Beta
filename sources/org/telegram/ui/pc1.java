package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pc1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f50814a;

    public pc1(WallpapersListActivity wallpapersListActivity) {
        this.f50814a = wallpapersListActivity;
    }

    @Override
    public final void b(int i7) {
        org.telegram.ui.ActionBar.a5 a5Var;
        org.telegram.ui.ActionBar.a5 a5Var2;
        WallpapersListActivity wallpapersListActivity = this.f50814a;
        LongSparseArray longSparseArray = wallpapersListActivity.f45388f0;
        if (i7 == -1) {
            a5Var = ((org.telegram.ui.ActionBar.h2) wallpapersListActivity).simpleActionBar;
            if (a5Var.x()) {
                longSparseArray.clear();
                a5Var2 = ((org.telegram.ui.ActionBar.h2) wallpapersListActivity).simpleActionBar;
                a5Var2.w();
                wallpapersListActivity.I0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i7 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String G = org.telegram.messenger.gd.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = G;
                u1Var.U = org.telegram.messenger.gd.a0("DeleteChatBackgroundsAlert", null, 2131751543, new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new oc1(this));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                wallpapersListActivity.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
                }
            }
        } else if (i7 == 3) {
            cx cxVar = new cx(org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true));
            cxVar.E2 = new oc1(this);
            wallpapersListActivity.presentFragment(cxVar);
        }
    }
}
