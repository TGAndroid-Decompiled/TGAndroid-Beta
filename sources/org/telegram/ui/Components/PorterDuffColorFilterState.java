package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

public class PorterDuffColorFilterState {
    private ColorFilter colorFilter;
    private int lastColor;
    private PorterDuff.Mode lastMode;

    public ColorFilter get(int i, PorterDuff.Mode mode) {
        if (this.colorFilter == null || this.lastColor != i || this.lastMode != mode) {
            this.colorFilter = new PorterDuffColorFilter(i, mode);
            this.lastColor = i;
            this.lastMode = mode;
        }
        return this.colorFilter;
    }
}
