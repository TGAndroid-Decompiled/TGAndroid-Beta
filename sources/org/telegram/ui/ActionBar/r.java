package org.telegram.ui.ActionBar;

import org.telegram.ui.dz;
public final class r extends dz {
    public final ActionBarLayout f19703a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f19703a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f19703a.invalidate();
    }
}
