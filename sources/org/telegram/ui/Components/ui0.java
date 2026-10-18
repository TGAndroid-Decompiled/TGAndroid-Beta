package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ui0 {
    public Paint f31001a;
    public Paint f31002b;
    public float f31003c;
    public int d;
    public int e;
    public float f31004f;

    public final void a(float f7) {
        this.f31003c = f7;
        if (f7 < 0.0f) {
            this.f31003c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f31003c = 1.0f;
        }
    }
}
