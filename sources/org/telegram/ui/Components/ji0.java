package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ji0 {
    public Paint f25432a;
    public Paint f25433b;
    public float f25434c;
    public int d;
    public int e;
    public float f25435f;

    public final void a(float f7) {
        this.f25434c = f7;
        if (f7 < 0.0f) {
            this.f25434c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f25434c = 1.0f;
        }
    }
}
