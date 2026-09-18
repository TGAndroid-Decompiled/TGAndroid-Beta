package org.telegram.ui.ActionBar;

import org.telegram.ui.jz;
public final class t extends jz {
    public final ActionBarLayout f19555a;

    public t(ActionBarLayout actionBarLayout) {
        super(null);
        this.f19555a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f19555a.invalidate();
    }
}
