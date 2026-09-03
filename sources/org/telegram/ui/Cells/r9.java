package org.telegram.ui.Cells;

import android.graphics.Path;
public final class r9 extends Path {
    public float f23602a;

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f23602a) {
            this.f23602a = f13;
        }
    }

    @Override
    public final void reset() {
        super.reset();
        this.f23602a = 0.0f;
    }
}
