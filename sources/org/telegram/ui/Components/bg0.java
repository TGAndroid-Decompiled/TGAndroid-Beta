package org.telegram.ui.Components;

import android.graphics.Paint;
public final class bg0 {
    public Paint f32173a;
    public Paint f32174b;
    public float f32175c;
    public int d;
    public int f32176e;
    public float f32177f;

    public final void a(float f10) {
        this.f32175c = f10;
        if (f10 < 0.0f) {
            this.f32175c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f32175c = 1.0f;
        }
    }
}
