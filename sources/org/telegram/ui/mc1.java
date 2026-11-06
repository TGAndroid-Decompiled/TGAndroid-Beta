package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mc1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f47784a;

    public mc1(WallpapersListActivity wallpapersListActivity) {
        this.f47784a = wallpapersListActivity;
    }

    @Override
    public final void b(int i7) {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        WallpapersListActivity wallpapersListActivity = this.f47784a;
        LongSparseArray longSparseArray = wallpapersListActivity.f43489e0;
        if (i7 == -1) {
            y4Var = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
            if (y4Var.s()) {
                longSparseArray.clear();
                y4Var2 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
                y4Var2.r();
                wallpapersListActivity.I0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i7 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String G = org.telegram.messenger.hd.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.R = G;
                u1Var.T = org.telegram.messenger.hd.a0("DeleteChatBackgroundsAlert", null, 2131751555, new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new lc1(this));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                wallpapersListActivity.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28090q7, null);
                }
            }
        } else if (i7 == 3) {
            ww wwVar = new ww(org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true));
            wwVar.C2 = new lc1(this);
            wallpapersListActivity.presentFragment(wwVar);
        }
    }
}
