package org.telegram.ui.Components;

import android.graphics.Paint;
public final class gj0 {
    public Paint f26442a;
    public Paint f26443b;
    public float f26444c;
    public int d;
    public int f26445e;
    public float f26446f;

    public final void a(float f7) {
        this.f26444c = f7;
        if (f7 < 0.0f) {
            this.f26444c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f26444c = 1.0f;
        }
    }
}
