package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ji0 {
    public Paint f25431a;
    public Paint f25432b;
    public float f25433c;
    public int d;
    public int e;
    public float f25434f;

    public final void a(float f7) {
        this.f25433c = f7;
        if (f7 < 0.0f) {
            this.f25433c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f25433c = 1.0f;
        }
    }
}
