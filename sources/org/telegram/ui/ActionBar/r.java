package org.telegram.ui.ActionBar;

import org.telegram.ui.ox;
public final class r extends ox {
    public final ActionBarLayout f29948a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f29948a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f29948a.invalidate();
    }
}
