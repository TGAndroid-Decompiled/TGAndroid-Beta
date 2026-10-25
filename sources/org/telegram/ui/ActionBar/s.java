package org.telegram.ui.ActionBar;

import org.telegram.ui.py;
public final class s extends py {
    public final ActionBarLayout f23065a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f23065a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f23065a.invalidate();
    }
}
