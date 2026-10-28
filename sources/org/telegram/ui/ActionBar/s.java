package org.telegram.ui.ActionBar;

import org.telegram.ui.ry;
public final class s extends ry {
    public final ActionBarLayout f23068a;

    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.f23068a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.f23068a.invalidate();
    }
}
