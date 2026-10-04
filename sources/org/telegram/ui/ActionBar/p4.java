package org.telegram.ui.ActionBar;

import android.view.MenuItem;
import android.view.View;
public final class p4 implements View.OnClickListener {
    public final u4 f21473a;

    public p4(u4 u4Var) {
        this.f21473a = u4Var;
    }

    @Override
    public final void onClick(View view) {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        if ((view.getTag() instanceof MenuItem) && (onMenuItemClickListener = this.f21473a.K) != null) {
            onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
        }
    }
}
