package org.telegram.ui.ActionBar;

import org.telegram.ui.py;
public final class r extends py {
    public final ActionBarLayout f21686a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f21686a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f21686a.invalidate();
    }
}
