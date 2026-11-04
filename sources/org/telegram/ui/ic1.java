package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ic1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f46240a;

    public ic1(WallpapersListActivity wallpapersListActivity) {
        this.f46240a = wallpapersListActivity;
    }

    @Override
    public final void b(int i3) {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        WallpapersListActivity wallpapersListActivity = this.f46240a;
        LongSparseArray longSparseArray = wallpapersListActivity.f43534f0;
        if (i3 == -1) {
            y4Var = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).simpleActionBar;
            if (y4Var.s()) {
                longSparseArray.clear();
                y4Var2 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).simpleActionBar;
                y4Var2.r();
                wallpapersListActivity.I0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i3 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String G = org.telegram.messenger.bd.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = G;
                s1Var.U = org.telegram.messenger.bd.a0("DeleteChatBackgroundsAlert", null, 2131751555, new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new gc1(this));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                wallpapersListActivity.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                }
            }
        } else if (i3 == 3) {
            uw uwVar = new uw(org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true));
            uwVar.D2 = new gc1(this);
            wallpapersListActivity.presentFragment(uwVar);
        }
    }
}
