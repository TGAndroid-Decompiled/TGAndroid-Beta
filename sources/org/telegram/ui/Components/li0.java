package org.telegram.ui.Components;

import android.graphics.Paint;
public final class li0 {
    public Paint f25998a;
    public Paint f25999b;
    public float f26000c;
    public int d;
    public int e;
    public float f26001f;

    public final void a(float f7) {
        this.f26000c = f7;
        if (f7 < 0.0f) {
            this.f26000c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f26000c = 1.0f;
        }
    }
}
