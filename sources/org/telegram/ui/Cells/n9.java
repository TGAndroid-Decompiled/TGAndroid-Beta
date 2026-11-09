package org.telegram.ui.Cells;

import android.graphics.Path;
public final class n9 extends Path {
    public float f29629a;

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f29629a) {
            this.f29629a = f13;
        }
    }

    @Override
    public final void reset() {
        super.reset();
        this.f29629a = 0.0f;
    }
}
