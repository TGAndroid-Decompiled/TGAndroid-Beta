package org.telegram.ui.Cells;

import android.graphics.Path;
public final class m9 extends Path {
    public float f30696a;

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f30696a) {
            this.f30696a = f13;
        }
    }

    @Override
    public final void reset() {
        super.reset();
        this.f30696a = 0.0f;
    }
}
