package org.telegram.ui.Components;

import android.graphics.Paint;
public final class yh0 {
    public Paint f32923a;
    public Paint f32924b;
    public float f32925c;
    public int d;
    public int f32926e;
    public float f32927f;

    public final void a(float f7) {
        this.f32925c = f7;
        if (f7 < 0.0f) {
            this.f32925c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f32925c = 1.0f;
        }
    }
}
