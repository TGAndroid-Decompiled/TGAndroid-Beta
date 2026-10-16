package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mj1 extends org.telegram.ui.ActionBar.e5 {
    public final WallpapersListActivity f38023f;

    public mj1(WallpapersListActivity wallpapersListActivity) {
        this.f38023f = wallpapersListActivity;
    }

    @Override
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f38023f;
        rj1 rj1Var = wallpapersListActivity.J;
        rj1Var.f39536n = null;
        rj1Var.E(null, true);
        wallpapersListActivity.L.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f38023f;
        wallpapersListActivity.H.setAdapter(wallpapersListActivity.I);
        wallpapersListActivity.H.invalidate();
        wallpapersListActivity.J.E(null, true);
        wallpapersListActivity.L.setSearchFieldCaption(null);
        k();
    }

    @Override
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f38023f;
        wallpapersListActivity.H.setAdapter(wallpapersListActivity.J);
        wallpapersListActivity.H.invalidate();
    }

    @Override
    public final void q(EditText editText) {
        this.f38023f.J.E(editText.getText().toString(), false);
    }
}
