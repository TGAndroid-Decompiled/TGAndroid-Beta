package org.telegram.ui.Cells;

import android.graphics.Path;
public final class s9 extends Path {
    public float f25295a;

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f25295a) {
            this.f25295a = f13;
        }
    }

    @Override
    public final void reset() {
        super.reset();
        this.f25295a = 0.0f;
    }
}
