package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class rm0 extends nb {
    public int f37709c;

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.vj);
            k9 k9Var = this.f36275a;
            if (k9Var != null && themedColor != this.f37709c) {
                this.f37709c = themedColor;
                k9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
