package org.telegram.ui.Components;

import android.graphics.Paint;
public final class li0 {
    public Paint f28376a;
    public Paint f28377b;
    public float f28378c;
    public int d;
    public int f28379e;
    public float f28380f;

    public final void a(float f7) {
        this.f28378c = f7;
        if (f7 < 0.0f) {
            this.f28378c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f28378c = 1.0f;
        }
    }
}
