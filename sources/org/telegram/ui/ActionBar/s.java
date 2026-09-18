package org.telegram.ui.ActionBar;

import org.telegram.ui.hz;
public final class s extends hz {
    public final ActionBarLayout f19714a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f19714a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f19714a.invalidate();
    }
}
