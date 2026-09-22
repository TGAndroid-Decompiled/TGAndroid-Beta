package org.telegram.ui.ActionBar;

import org.telegram.ui.hz;
public final class s extends hz {
    public final ActionBarLayout f19523a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f19523a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f19523a.invalidate();
    }
}
