package org.telegram.ui.ActionBar;

import android.view.MenuItem;
import android.view.View;
public final class q4 implements View.OnClickListener {
    public final v4 f21313a;

    public q4(v4 v4Var) {
        this.f21313a = v4Var;
    }

    @Override
    public final void onClick(View view) {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        if ((view.getTag() instanceof MenuItem) && (onMenuItemClickListener = this.f21313a.K) != null) {
            onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
        }
    }
}
