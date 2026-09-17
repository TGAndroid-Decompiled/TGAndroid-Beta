package org.telegram.ui.Cells;

import android.graphics.Path;
public final class v9 extends Path {
    public float f23386a;

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        super.addRect(f7, f10, f11, f12, direction);
        if (f12 > this.f23386a) {
            this.f23386a = f12;
        }
    }

    @Override
    public final void reset() {
        super.reset();
        this.f23386a = 0.0f;
    }
}
