package org.telegram.ui.ActionBar;

import org.telegram.ui.py;
public final class s extends py {
    public final ActionBarLayout f23067a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f23067a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f23067a.invalidate();
    }
}
