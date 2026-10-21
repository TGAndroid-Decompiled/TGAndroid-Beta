package org.telegram.ui.Components;

import android.graphics.Paint;
public final class vi0 {
    public Paint f31260a;
    public Paint f31261b;
    public float f31262c;
    public int d;
    public int e;
    public float f31263f;

    public final void a(float f7) {
        this.f31262c = f7;
        if (f7 < 0.0f) {
            this.f31262c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f31262c = 1.0f;
        }
    }
}
