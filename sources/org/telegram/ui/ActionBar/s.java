package org.telegram.ui.ActionBar;

import org.telegram.ui.ly;
public final class s extends ly {
    public final ActionBarLayout f20753a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f20753a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f20753a.invalidate();
    }
}
