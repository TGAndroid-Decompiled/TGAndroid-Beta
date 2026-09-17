package org.telegram.ui.ActionBar;

import org.telegram.ui.hz;
public final class s extends hz {
    public final ActionBarLayout f21351a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f21351a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f21351a.invalidate();
    }
}
