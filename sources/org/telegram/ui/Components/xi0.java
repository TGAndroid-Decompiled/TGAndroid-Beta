package org.telegram.ui.Components;

import android.graphics.Paint;
public final class xi0 {
    public Paint f34722a;
    public Paint f34723b;
    public float f34724c;
    public int d;
    public int e;
    public float f34725f;

    public final void a(float f7) {
        this.f34724c = f7;
        if (f7 < 0.0f) {
            this.f34724c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f34724c = 1.0f;
        }
    }
}
