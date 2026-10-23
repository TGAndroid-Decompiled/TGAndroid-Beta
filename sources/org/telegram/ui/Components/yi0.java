package org.telegram.ui.Components;

import android.graphics.Paint;
public final class yi0 {
    public Paint f32926a;
    public Paint f32927b;
    public float f32928c;
    public int d;
    public int e;
    public float f32929f;

    public final void a(float f7) {
        this.f32928c = f7;
        if (f7 < 0.0f) {
            this.f32928c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f32928c = 1.0f;
        }
    }
}
