package org.telegram.ui.ActionBar;

import android.view.MenuItem;
import android.view.View;
public final class s4 implements View.OnClickListener {
    public final x4 f22286a;

    public s4(x4 x4Var) {
        this.f22286a = x4Var;
    }

    @Override
    public final void onClick(View view) {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        if ((view.getTag() instanceof MenuItem) && (onMenuItemClickListener = this.f22286a.K) != null) {
            onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
        }
    }
}
