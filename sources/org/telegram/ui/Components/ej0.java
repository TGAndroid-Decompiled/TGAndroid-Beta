package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ej0 {
    public Paint f26066a;
    public Paint f26067b;
    public float f26068c;
    public int d;
    public int f26069e;
    public float f26070f;

    public final void a(float f7) {
        this.f26068c = f7;
        if (f7 < 0.0f) {
            this.f26068c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f26068c = 1.0f;
        }
    }
}
