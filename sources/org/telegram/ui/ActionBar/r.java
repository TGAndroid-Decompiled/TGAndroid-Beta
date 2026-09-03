package org.telegram.ui.ActionBar;

import org.telegram.ui.ez;
public final class r extends ez {
    public final ActionBarLayout f20514a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f20514a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f20514a.invalidate();
    }
}
