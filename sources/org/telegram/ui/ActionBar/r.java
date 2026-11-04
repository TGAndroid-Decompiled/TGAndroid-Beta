package org.telegram.ui.ActionBar;

import org.telegram.ui.gx;
public final class r extends gx {
    public final ActionBarLayout f28492a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f28492a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f28492a.invalidate();
    }
}
