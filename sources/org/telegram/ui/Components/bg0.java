package org.telegram.ui.Components;

import android.graphics.Paint;
public final class bg0 {
    public Paint f32259a;
    public Paint f32260b;
    public float f32261c;
    public int d;
    public int f32262e;
    public float f32263f;

    public final void a(float f10) {
        this.f32261c = f10;
        if (f10 < 0.0f) {
            this.f32261c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f32261c = 1.0f;
        }
    }
}
