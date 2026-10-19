package org.telegram.ui.ActionBar;

import org.telegram.ui.py;
public final class r extends py {
    public final ActionBarLayout f21681a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f21681a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f21681a.invalidate();
    }
}
