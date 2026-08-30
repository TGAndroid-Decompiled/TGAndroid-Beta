package org.telegram.ui.ActionBar;

import org.telegram.ui.cz;
public final class r extends cz {
    public final ActionBarLayout f20539a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f20539a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f20539a.invalidate();
    }
}
