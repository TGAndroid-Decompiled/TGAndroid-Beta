package org.telegram.ui.Components;

import android.graphics.Paint;
public final class bg0 {
    public Paint f32145a;
    public Paint f32146b;
    public float f32147c;
    public int d;
    public int f32148e;
    public float f32149f;

    public final void a(float f10) {
        this.f32147c = f10;
        if (f10 < 0.0f) {
            this.f32147c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f32147c = 1.0f;
        }
    }
}
