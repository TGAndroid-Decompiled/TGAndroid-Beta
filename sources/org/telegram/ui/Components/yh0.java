package org.telegram.ui.Components;

import android.graphics.Paint;
public final class yh0 {
    public Paint f32922a;
    public Paint f32923b;
    public float f32924c;
    public int d;
    public int f32925e;
    public float f32926f;

    public final void a(float f7) {
        this.f32924c = f7;
        if (f7 < 0.0f) {
            this.f32924c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f32924c = 1.0f;
        }
    }
}
