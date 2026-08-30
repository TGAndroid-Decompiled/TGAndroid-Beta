package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ji1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f35361a;

    public ji1(WallpapersListActivity wallpapersListActivity) {
        this.f35361a = wallpapersListActivity;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        WallpapersListActivity wallpapersListActivity = this.f35361a;
        LongSparseArray longSparseArray = wallpapersListActivity.f32411f0;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).actionBar;
            if (kVar.s()) {
                longSparseArray.clear();
                kVar2 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).actionBar;
                kVar2.r();
                wallpapersListActivity.D0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i10 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f19503a.O = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
                alertDialog$Builder.f19503a.Q = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hi1(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                wallpapersListActivity.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                }
            }
        } else if (i10 == 3) {
            oy oyVar = new oy(org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true));
            oyVar.f37131z2 = new hi1(this);
            wallpapersListActivity.presentFragment(oyVar);
        }
    }
}
