package org.telegram.ui.ActionBar;

import org.telegram.ui.iz;
public final class r extends iz {
    public final ActionBarLayout f21231a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f21231a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f21231a.invalidate();
    }
}
