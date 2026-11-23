package org.telegram.ui.ActionBar;

import org.telegram.ui.ox;
public final class r extends ox {
    public final ActionBarLayout f29951a;

    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.f29951a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f29951a.invalidate();
    }
}
