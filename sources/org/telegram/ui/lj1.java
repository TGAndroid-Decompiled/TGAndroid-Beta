package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lj1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f37773a;

    public lj1(WallpapersListActivity wallpapersListActivity) {
        this.f37773a = wallpapersListActivity;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        WallpapersListActivity wallpapersListActivity = this.f37773a;
        LongSparseArray longSparseArray = wallpapersListActivity.f33690i0;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).actionBar;
            if (kVar.t()) {
                longSparseArray.clear();
                kVar2 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).actionBar;
                kVar2.s();
                wallpapersListActivity.D0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i10 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f19248a.R = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
                alertDialog$Builder.f19248a.T = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jj1(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                wallpapersListActivity.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
                }
            }
        } else if (i10 == 3) {
            yy yyVar = new yy(org.telegram.messenger.sk.d(3, "onlySelect", "dialogsType", true));
            yyVar.C2 = new jj1(this);
            wallpapersListActivity.presentFragment(yyVar);
        }
    }
}
