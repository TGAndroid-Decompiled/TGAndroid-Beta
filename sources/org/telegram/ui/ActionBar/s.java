package org.telegram.ui.ActionBar;

import org.telegram.ui.hz;
public final class s extends hz {
    public final ActionBarLayout f19761a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f19761a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f19761a.invalidate();
    }
}
