package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ph1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f40232a;

    public ph1(WallpapersListActivity wallpapersListActivity) {
        this.f40232a = wallpapersListActivity;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        WallpapersListActivity wallpapersListActivity = this.f40232a;
        LongSparseArray longSparseArray = wallpapersListActivity.f35216i0;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar;
            if (kVar.t()) {
                longSparseArray.clear();
                kVar2 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar;
                kVar2.s();
                wallpapersListActivity.D0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i10 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f20602a.R = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
                alertDialog$Builder.f20602a.T = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new oh1(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20602a;
                wallpapersListActivity.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21225q7, false));
                }
            }
        } else if (i10 == 3) {
            cy cyVar = new cy(org.telegram.messenger.kk.d(3, "onlySelect", "dialogsType", true));
            cyVar.C2 = new oh1(this);
            wallpapersListActivity.presentFragment(cyVar);
        }
    }
}
