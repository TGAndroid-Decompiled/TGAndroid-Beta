package org.telegram.ui.ActionBar;

import org.telegram.ui.iz;
public final class r extends iz {
    public final ActionBarLayout f21232a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f21232a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f21232a.invalidate();
    }
}
