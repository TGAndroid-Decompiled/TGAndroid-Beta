package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ke1 extends org.telegram.ui.ActionBar.k {
    public final WallpapersListActivity f38786a;

    public ke1(WallpapersListActivity wallpapersListActivity) {
        this.f38786a = wallpapersListActivity;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.i5 i5Var2;
        WallpapersListActivity wallpapersListActivity = this.f38786a;
        LongSparseArray longSparseArray = wallpapersListActivity.f35481e0;
        if (i10 == -1) {
            i5Var = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).simpleActionBar;
            if (i5Var.s()) {
                longSparseArray.clear();
                i5Var2 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).simpleActionBar;
                i5Var2.r();
                wallpapersListActivity.H0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i10 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String G = org.telegram.messenger.cd.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = G;
                x1Var.T = org.telegram.messenger.cd.a0("DeleteChatBackgroundsAlert", null, 2131751555, new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new je1(this));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                wallpapersListActivity.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                }
            }
        } else if (i10 == 3) {
            ay ayVar = new ay(org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true));
            ayVar.C2 = new je1(this);
            wallpapersListActivity.presentFragment(ayVar);
        }
    }
}
