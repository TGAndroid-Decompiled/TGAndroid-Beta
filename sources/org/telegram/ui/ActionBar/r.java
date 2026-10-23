package org.telegram.ui.ActionBar;

import org.telegram.ui.ry;
public final class r extends ry {
    public final ActionBarLayout f21805a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f21805a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f21805a.invalidate();
    }
}
