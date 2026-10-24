package org.telegram.ui.Components;

import android.graphics.Paint;
public final class xi0 {
    public Paint f32586a;
    public Paint f32587b;
    public float f32588c;
    public int d;
    public int e;
    public float f32589f;

    public final void a(float f7) {
        this.f32588c = f7;
        if (f7 < 0.0f) {
            this.f32588c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f32588c = 1.0f;
        }
    }
}
