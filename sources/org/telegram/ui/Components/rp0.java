package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.FileLog;
public final class rp0 extends cc {
    public int f32281c;

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.Hi);
            y9 y9Var = this.f27113a;
            if (y9Var != null && themedColor != this.f32281c) {
                this.f32281c = themedColor;
                y9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
