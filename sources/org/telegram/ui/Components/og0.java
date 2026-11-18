package org.telegram.ui.Components;

import android.graphics.Paint;
public final class og0 {
    public Paint f38100a;
    public Paint f38101b;
    public float f38102c;
    public int d;
    public int f38103e;
    public float f38104f;

    public final void a(float f10) {
        this.f38102c = f10;
        if (f10 < 0.0f) {
            this.f38102c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f38102c = 1.0f;
        }
    }
}
