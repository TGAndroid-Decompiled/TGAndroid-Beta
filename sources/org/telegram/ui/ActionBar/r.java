package org.telegram.ui.ActionBar;

import org.telegram.ui.dz;
public final class r extends dz {
    public final ActionBarLayout f22247a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f22247a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f22247a.invalidate();
    }
}
