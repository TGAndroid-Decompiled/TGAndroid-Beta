package org.telegram.ui.Components;

import android.graphics.Paint;
public final class mi0 {
    public Paint f26300a;
    public Paint f26301b;
    public float f26302c;
    public int d;
    public int e;
    public float f26303f;

    public final void a(float f7) {
        this.f26302c = f7;
        if (f7 < 0.0f) {
            this.f26302c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f26302c = 1.0f;
        }
    }
}
