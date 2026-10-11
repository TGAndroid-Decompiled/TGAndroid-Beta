package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ej0 {
    public Paint f26104a;
    public Paint f26105b;
    public float f26106c;
    public int d;
    public int f26107e;
    public float f26108f;

    public final void a(float f7) {
        this.f26106c = f7;
        if (f7 < 0.0f) {
            this.f26106c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f26106c = 1.0f;
        }
    }
}
