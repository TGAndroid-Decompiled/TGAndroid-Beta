package org.telegram.ui.Components;

import android.graphics.Paint;
public final class zi0 {
    public Paint f31879a;
    public Paint f31880b;
    public float f31881c;
    public int d;
    public int e;
    public float f31882f;

    public final void a(float f7) {
        this.f31881c = f7;
        if (f7 < 0.0f) {
            this.f31881c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f31881c = 1.0f;
        }
    }
}
