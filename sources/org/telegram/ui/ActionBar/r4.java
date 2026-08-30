package org.telegram.ui.ActionBar;

import android.view.MenuItem;
import android.view.View;
public final class r4 implements View.OnClickListener {
    public final w4 f20567a;

    public r4(w4 w4Var) {
        this.f20567a = w4Var;
    }

    @Override
    public final void onClick(View view) {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        if ((view.getTag() instanceof MenuItem) && (onMenuItemClickListener = this.f20567a.K) != null) {
            onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
        }
    }
}
