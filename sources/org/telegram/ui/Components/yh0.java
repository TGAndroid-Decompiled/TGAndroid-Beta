package org.telegram.ui.Components;

import android.graphics.Paint;
public final class yh0 {
    public Paint f32949a;
    public Paint f32950b;
    public float f32951c;
    public int d;
    public int f32952e;
    public float f32953f;

    public final void a(float f7) {
        this.f32951c = f7;
        if (f7 < 0.0f) {
            this.f32951c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f32951c = 1.0f;
        }
    }
}
