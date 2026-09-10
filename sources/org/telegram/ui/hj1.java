package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hj1 extends org.telegram.ui.ActionBar.k {
    public final WallpapersListActivity f33403a;

    public hj1(WallpapersListActivity wallpapersListActivity) {
        this.f33403a = wallpapersListActivity;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        WallpapersListActivity wallpapersListActivity = this.f33403a;
        LongSparseArray longSparseArray = wallpapersListActivity.f30746i0;
        if (i10 == -1) {
            lVar = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).actionBar;
            if (lVar.s()) {
                longSparseArray.clear();
                lVar2 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).actionBar;
                lVar2.r();
                wallpapersListActivity.D0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i10 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f17528a.R = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
                alertDialog$Builder.f17528a.T = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gj1(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                wallpapersListActivity.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                }
            }
        } else if (i10 == 3) {
            wy wyVar = new wy(org.telegram.messenger.a2.e(3, "onlySelect", "dialogsType", true));
            wyVar.C2 = new gj1(this);
            wallpapersListActivity.presentFragment(wyVar);
        }
    }
}
