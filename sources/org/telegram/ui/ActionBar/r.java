package org.telegram.ui.ActionBar;

import org.telegram.ui.ty;

public final class r extends ty {

    public final ActionBarLayout f23747a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f23747a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f23747a.invalidate();
    }
}
