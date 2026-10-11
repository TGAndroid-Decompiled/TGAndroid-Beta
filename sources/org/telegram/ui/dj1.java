package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dj1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f37071a;

    public dj1(WallpapersListActivity wallpapersListActivity) {
        this.f37071a = wallpapersListActivity;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        WallpapersListActivity wallpapersListActivity = this.f37071a;
        LongSparseArray longSparseArray = wallpapersListActivity.f35849i0;
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
                alertDialog$Builder.f20404a.R = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
                alertDialog$Builder.f20404a.T = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bj1(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                wallpapersListActivity.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false));
                }
            }
        } else if (i10 == 3) {
            sy syVar = new sy(org.telegram.messenger.ai.d(3, "onlySelect", "dialogsType", true));
            syVar.C2 = new bj1(this);
            wallpapersListActivity.presentFragment(syVar);
        }
    }
}
