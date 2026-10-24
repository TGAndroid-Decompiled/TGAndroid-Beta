package org.telegram.ui.ActionBar;

import android.view.MenuItem;
import android.view.View;
public final class t4 implements View.OnClickListener {
    public final y4 f21858a;

    public t4(y4 y4Var) {
        this.f21858a = y4Var;
    }

    @Override
    public final void onClick(View view) {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        if ((view.getTag() instanceof MenuItem) && (onMenuItemClickListener = this.f21858a.K) != null) {
            onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
        }
    }
}
