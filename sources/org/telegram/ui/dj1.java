package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dj1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f35809a;

    public dj1(WallpapersListActivity wallpapersListActivity) {
        this.f35809a = wallpapersListActivity;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        WallpapersListActivity wallpapersListActivity = this.f35809a;
        LongSparseArray longSparseArray = wallpapersListActivity.f34265i0;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar;
            if (kVar.s()) {
                longSparseArray.clear();
                kVar2 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar;
                kVar2.r();
                wallpapersListActivity.D0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i10 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f20198a.R = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
                alertDialog$Builder.f20198a.T = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bj1(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                wallpapersListActivity.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false));
                }
            }
        } else if (i10 == 3) {
            uy uyVar = new uy(org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true));
            uyVar.C2 = new bj1(this);
            wallpapersListActivity.presentFragment(uyVar);
        }
    }
}
