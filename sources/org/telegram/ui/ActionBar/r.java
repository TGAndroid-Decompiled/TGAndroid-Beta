package org.telegram.ui.ActionBar;

import org.telegram.ui.fz;
public final class r extends fz {
    public final ActionBarLayout f21457a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f21457a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f21457a.invalidate();
    }
}
