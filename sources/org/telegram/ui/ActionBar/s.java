package org.telegram.ui.ActionBar;

import org.telegram.ui.my;
public final class s extends my {
    public final ActionBarLayout f20752a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f20752a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f20752a.invalidate();
    }
}
