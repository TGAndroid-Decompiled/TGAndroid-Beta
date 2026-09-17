package org.telegram.ui.Components;

import android.graphics.Paint;
public final class yh0 {
    public Paint f32950a;
    public Paint f32951b;
    public float f32952c;
    public int d;
    public int f32953e;
    public float f32954f;

    public final void a(float f7) {
        this.f32952c = f7;
        if (f7 < 0.0f) {
            this.f32952c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f32952c = 1.0f;
        }
    }
}
