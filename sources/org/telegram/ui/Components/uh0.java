package org.telegram.ui.Components;

import android.graphics.Paint;
public final class uh0 {
    public Paint f33237a;
    public Paint f33238b;
    public float f33239c;
    public int d;
    public int f33240e;
    public float f33241f;

    public final void a(float f9) {
        this.f33239c = f9;
        if (f9 < 0.0f) {
            this.f33239c = 0.0f;
        } else if (f9 > 1.0f) {
            this.f33239c = 1.0f;
        }
    }
}
