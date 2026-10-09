package org.telegram.ui.ActionBar;

import org.telegram.ui.gz;
public final class s extends gz {
    public final ActionBarLayout f21505a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f21505a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f21505a.invalidate();
    }
}
