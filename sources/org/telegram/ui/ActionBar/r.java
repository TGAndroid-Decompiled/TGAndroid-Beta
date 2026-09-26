package org.telegram.ui.ActionBar;

import org.telegram.ui.dz;
public final class r extends dz {
    public final ActionBarLayout f19717a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f19717a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f19717a.invalidate();
    }
}
