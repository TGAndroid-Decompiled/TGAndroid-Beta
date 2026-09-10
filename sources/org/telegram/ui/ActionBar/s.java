package org.telegram.ui.ActionBar;

import org.telegram.ui.jz;
public final class s extends jz {
    public final ActionBarLayout f18616a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f18616a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f18616a.invalidate();
    }
}
