package org.telegram.ui.Components;

import android.graphics.Paint;
public final class bg0 {
    public Paint f32194a;
    public Paint f32195b;
    public float f32196c;
    public int d;
    public int f32197e;
    public float f32198f;

    public final void a(float f10) {
        this.f32196c = f10;
        if (f10 < 0.0f) {
            this.f32196c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f32196c = 1.0f;
        }
    }
}
