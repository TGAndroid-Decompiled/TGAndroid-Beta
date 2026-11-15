package org.telegram.ui.ActionBar;

import org.telegram.ui.kx;
public final class r extends kx {
    public final ActionBarLayout f29537a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f29537a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f29537a.invalidate();
    }
}
