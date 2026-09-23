package org.telegram.ui.ActionBar;

import org.telegram.ui.ez;
public final class s extends ez {
    public final ActionBarLayout f19490a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f19490a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f19490a.invalidate();
    }
}
