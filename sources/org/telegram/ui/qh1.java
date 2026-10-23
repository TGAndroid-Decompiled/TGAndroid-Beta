package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qh1 extends org.telegram.ui.ActionBar.g5 {
    public final WallpapersListActivity f40588r;

    public qh1(WallpapersListActivity wallpapersListActivity) {
        this.f40588r = wallpapersListActivity;
    }

    @Override
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f40588r;
        vh1 vh1Var = wallpapersListActivity.J;
        vh1Var.f42266n = null;
        vh1Var.E(null, true);
        wallpapersListActivity.L.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f40588r;
        wallpapersListActivity.H.setAdapter(wallpapersListActivity.I);
        wallpapersListActivity.H.invalidate();
        wallpapersListActivity.J.E(null, true);
        wallpapersListActivity.L.setSearchFieldCaption(null);
        k();
    }

    @Override
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f40588r;
        wallpapersListActivity.H.setAdapter(wallpapersListActivity.J);
        wallpapersListActivity.H.invalidate();
    }

    @Override
    public final void q(EditText editText) {
        this.f40588r.J.E(editText.getText().toString(), false);
    }
}
