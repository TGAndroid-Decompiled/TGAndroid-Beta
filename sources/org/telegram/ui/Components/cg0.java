package org.telegram.ui.Components;

import android.graphics.Paint;
public final class cg0 {
    public Paint f32683a;
    public Paint f32684b;
    public float f32685c;
    public int d;
    public int f32686e;
    public float f32687f;

    public final void a(float f10) {
        this.f32685c = f10;
        if (f10 < 0.0f) {
            this.f32685c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f32685c = 1.0f;
        }
    }
}
