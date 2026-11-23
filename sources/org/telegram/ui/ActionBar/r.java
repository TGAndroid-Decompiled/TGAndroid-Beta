package org.telegram.ui.ActionBar;

import org.telegram.ui.nx;
public final class r extends nx {
    public final ActionBarLayout f30013a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f30013a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f30013a.invalidate();
    }
}
