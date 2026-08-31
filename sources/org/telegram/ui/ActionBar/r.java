package org.telegram.ui.ActionBar;

import org.telegram.ui.dz;
public final class r extends dz {
    public final ActionBarLayout f22245a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f22245a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f22245a.invalidate();
    }
}
