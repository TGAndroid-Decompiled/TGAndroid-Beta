package org.telegram.ui.ActionBar;

import android.view.MenuItem;
import android.view.View;
public final class o4 implements View.OnClickListener {
    public final t4 f23720a;

    public o4(t4 t4Var) {
        this.f23720a = t4Var;
    }

    @Override
    public final void onClick(View view) {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        if ((view.getTag() instanceof MenuItem) && (onMenuItemClickListener = this.f23720a.K) != null) {
            onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
        }
    }
}
