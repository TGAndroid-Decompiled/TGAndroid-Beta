package org.telegram.ui.Components;

import android.graphics.Paint;
public final class eg0 {
    public Paint f34311a;
    public Paint f34312b;
    public float f34313c;
    public int d;
    public int f34314e;
    public float f34315f;

    public final void a(float f10) {
        this.f34313c = f10;
        if (f10 < 0.0f) {
            this.f34313c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f34313c = 1.0f;
        }
    }
}
