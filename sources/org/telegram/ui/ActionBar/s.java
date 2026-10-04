package org.telegram.ui.ActionBar;

import org.telegram.ui.hz;
public final class s extends hz {
    public final ActionBarLayout f21498a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f21498a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f21498a.invalidate();
    }
}
