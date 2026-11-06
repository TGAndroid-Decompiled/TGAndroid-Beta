package org.telegram.ui.Components;

import android.graphics.Paint;
public final class bg0 {
    public Paint f32139a;
    public Paint f32140b;
    public float f32141c;
    public int d;
    public int f32142e;
    public float f32143f;

    public final void a(float f10) {
        this.f32141c = f10;
        if (f10 < 0.0f) {
            this.f32141c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f32141c = 1.0f;
        }
    }
}
