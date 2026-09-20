package org.telegram.ui.ActionBar;

import org.telegram.ui.hz;
public final class s extends hz {
    public final ActionBarLayout f19746a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f19746a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f19746a.invalidate();
    }
}
