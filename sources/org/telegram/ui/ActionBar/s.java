package org.telegram.ui.ActionBar;

import org.telegram.ui.mx;
public final class s extends mx {
    public final ActionBarLayout f28478a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f28478a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f28478a.invalidate();
    }
}
