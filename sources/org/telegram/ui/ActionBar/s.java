package org.telegram.ui.ActionBar;

import org.telegram.ui.ox;
public final class s extends ox {
    public final ActionBarLayout f29967a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f29967a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f29967a.invalidate();
    }
}
