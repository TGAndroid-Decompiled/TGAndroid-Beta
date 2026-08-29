package org.telegram.ui.Cells;

import android.graphics.Path;
public final class p9 extends Path {
    public float f25017a;

    @Override
    public final void addRect(float f9, float f10, float f11, float f12, Path.Direction direction) {
        super.addRect(f9, f10, f11, f12, direction);
        if (f12 > this.f25017a) {
            this.f25017a = f12;
        }
    }

    @Override
    public final void reset() {
        super.reset();
        this.f25017a = 0.0f;
    }
}
