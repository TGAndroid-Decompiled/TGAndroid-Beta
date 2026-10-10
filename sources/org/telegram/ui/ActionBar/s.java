package org.telegram.ui.ActionBar;

import org.telegram.ui.gz;
public final class s extends gz {
    public final ActionBarLayout f21509a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f21509a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f21509a.invalidate();
    }
}
