package org.telegram.ui.Components;

import android.graphics.Paint;
public final class eg0 {
    public Paint f34310a;
    public Paint f34311b;
    public float f34312c;
    public int d;
    public int f34313e;
    public float f34314f;

    public final void a(float f10) {
        this.f34312c = f10;
        if (f10 < 0.0f) {
            this.f34312c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f34312c = 1.0f;
        }
    }
}
