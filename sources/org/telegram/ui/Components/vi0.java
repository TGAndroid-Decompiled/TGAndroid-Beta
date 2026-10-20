package org.telegram.ui.Components;

import android.graphics.Paint;
public final class vi0 {
    public Paint f31259a;
    public Paint f31260b;
    public float f31261c;
    public int d;
    public int e;
    public float f31262f;

    public final void a(float f7) {
        this.f31261c = f7;
        if (f7 < 0.0f) {
            this.f31261c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f31261c = 1.0f;
        }
    }
}
