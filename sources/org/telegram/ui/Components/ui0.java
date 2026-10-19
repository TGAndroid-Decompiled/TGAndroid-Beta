package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ui0 {
    public Paint f30967a;
    public Paint f30968b;
    public float f30969c;
    public int d;
    public int e;
    public float f30970f;

    public final void a(float f7) {
        this.f30969c = f7;
        if (f7 < 0.0f) {
            this.f30969c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f30969c = 1.0f;
        }
    }
}
