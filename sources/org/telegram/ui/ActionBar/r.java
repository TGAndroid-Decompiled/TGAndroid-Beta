package org.telegram.ui.ActionBar;

import org.telegram.ui.lz;
public final class r extends lz {
    public final ActionBarLayout f20603a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f20603a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f20603a.invalidate();
    }
}
