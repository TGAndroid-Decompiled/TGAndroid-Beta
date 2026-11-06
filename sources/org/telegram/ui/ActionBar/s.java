package org.telegram.ui.ActionBar;

import org.telegram.ui.jx;
public final class s extends jx {
    public final ActionBarLayout f28477a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f28477a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f28477a.invalidate();
    }
}
