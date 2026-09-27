package org.telegram.ui.ActionBar;

import org.telegram.ui.gz;
public final class t extends gz {
    public final ActionBarLayout f19767a;

    public t(ActionBarLayout actionBarLayout) {
        super(null);
        this.f19767a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f19767a.invalidate();
    }
}
