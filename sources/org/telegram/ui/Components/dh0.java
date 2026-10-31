package org.telegram.ui.Components;

import android.graphics.Paint;
public final class dh0 {
    public Paint f25414a;
    public Paint f25415b;
    public float f25416c;
    public int d;
    public int e;
    public float f25417f;

    public final void a(float f7) {
        this.f25416c = f7;
        if (f7 < 0.0f) {
            this.f25416c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f25416c = 1.0f;
        }
    }
}
