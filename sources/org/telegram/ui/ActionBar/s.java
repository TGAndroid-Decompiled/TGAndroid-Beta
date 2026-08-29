package org.telegram.ui.ActionBar;

import org.telegram.ui.sy;
public final class s extends sy {
    public final ActionBarLayout f23775a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f23775a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f23775a.invalidate();
    }
}
