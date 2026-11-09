package org.telegram.ui.ActionBar;

import org.telegram.ui.lx;
public final class s extends lx {
    public final ActionBarLayout f28483a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f28483a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f28483a.invalidate();
    }
}
