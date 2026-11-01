package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class tn0 extends ib {
    public int f30683c;

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.vj);
            g9 g9Var = this.f27062a;
            if (g9Var != null && themedColor != this.f30683c) {
                this.f30683c = themedColor;
                g9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
