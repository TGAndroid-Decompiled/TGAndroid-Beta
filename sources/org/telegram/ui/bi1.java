package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bi1 extends org.telegram.ui.ActionBar.s0 {
    public final WallpapersListActivity f38046a;

    public bi1(WallpapersListActivity wallpapersListActivity) {
        this.f38046a = wallpapersListActivity;
    }

    @Override
    public final void f() {
        WallpapersListActivity wallpapersListActivity = this.f38046a;
        gi1 gi1Var = wallpapersListActivity.H;
        gi1Var.f39630n = null;
        gi1Var.E(null, true);
        wallpapersListActivity.J.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override
    public final void h() {
        WallpapersListActivity wallpapersListActivity = this.f38046a;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.F.invalidate();
        wallpapersListActivity.H.E(null, true);
        wallpapersListActivity.J.setSearchFieldCaption(null);
        f();
    }

    @Override
    public final void i() {
        WallpapersListActivity wallpapersListActivity = this.f38046a;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.H);
        wallpapersListActivity.F.invalidate();
    }

    @Override
    public final void l(EditText editText) {
        this.f38046a.H.E(editText.getText().toString(), false);
    }
}
