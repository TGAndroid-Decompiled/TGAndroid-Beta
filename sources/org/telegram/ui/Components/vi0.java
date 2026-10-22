package org.telegram.ui.Components;

import android.graphics.Paint;
public final class vi0 {
    public Paint f31263a;
    public Paint f31264b;
    public float f31265c;
    public int d;
    public int e;
    public float f31266f;

    public final void a(float f7) {
        this.f31265c = f7;
        if (f7 < 0.0f) {
            this.f31265c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f31265c = 1.0f;
        }
    }
}
