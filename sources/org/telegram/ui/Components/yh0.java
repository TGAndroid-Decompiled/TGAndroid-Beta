package org.telegram.ui.Components;

import android.graphics.Paint;
public final class yh0 {
    public Paint f30259a;
    public Paint f30260b;
    public float f30261c;
    public int d;
    public int e;
    public float f30262f;

    public final void a(float f7) {
        this.f30261c = f7;
        if (f7 < 0.0f) {
            this.f30261c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f30261c = 1.0f;
        }
    }
}
