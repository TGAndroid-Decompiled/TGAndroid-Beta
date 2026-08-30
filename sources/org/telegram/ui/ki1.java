package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ki1 extends org.telegram.ui.ActionBar.h5 {
    public final WallpapersListActivity f35741f;

    public ki1(WallpapersListActivity wallpapersListActivity) {
        this.f35741f = wallpapersListActivity;
    }

    @Override
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f35741f;
        pi1 pi1Var = wallpapersListActivity.G;
        pi1Var.f37347n = null;
        pi1Var.E(null, true);
        wallpapersListActivity.I.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f35741f;
        wallpapersListActivity.E.setAdapter(wallpapersListActivity.F);
        wallpapersListActivity.E.invalidate();
        wallpapersListActivity.G.E(null, true);
        wallpapersListActivity.I.setSearchFieldCaption(null);
        k();
    }

    @Override
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f35741f;
        wallpapersListActivity.E.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.E.invalidate();
    }

    @Override
    public final void q(EditText editText) {
        this.f35741f.G.E(editText.getText().toString(), false);
    }
}
