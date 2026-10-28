package org.telegram.ui.ActionBar;

import android.view.MenuItem;
import android.view.View;
public final class v4 implements View.OnClickListener {
    public final a5 f23160a;

    public v4(a5 a5Var) {
        this.f23160a = a5Var;
    }

    @Override
    public final void onClick(View view) {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        if ((view.getTag() instanceof MenuItem) && (onMenuItemClickListener = this.f23160a.K) != null) {
            onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
        }
    }
}
