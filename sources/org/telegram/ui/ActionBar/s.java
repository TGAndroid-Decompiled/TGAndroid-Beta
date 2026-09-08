package org.telegram.ui.ActionBar;

import org.telegram.ui.hz;
public final class s extends hz {
    public final ActionBarLayout f21350a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f21350a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f21350a.invalidate();
    }
}
