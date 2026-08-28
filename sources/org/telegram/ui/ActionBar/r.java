package org.telegram.ui.ActionBar;

import org.telegram.ui.qy;
public final class r extends qy {
    public final ActionBarLayout f23742a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f23742a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f23742a.invalidate();
    }
}
