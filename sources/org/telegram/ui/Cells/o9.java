package org.telegram.ui.Cells;

import android.graphics.Path;
public final class o9 extends Path {
    public float f22409a;

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        super.addRect(f7, f10, f11, f12, direction);
        if (f12 > this.f22409a) {
            this.f22409a = f12;
        }
    }

    @Override
    public final void reset() {
        super.reset();
        this.f22409a = 0.0f;
    }
}
