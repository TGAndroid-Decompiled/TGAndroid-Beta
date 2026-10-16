package org.telegram.ui.Components;

import android.graphics.Paint;
public final class zi0 {
    public Paint f31573a;
    public Paint f31574b;
    public float f31575c;
    public int d;
    public int e;
    public float f31576f;

    public final void a(float f7) {
        this.f31575c = f7;
        if (f7 < 0.0f) {
            this.f31575c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f31575c = 1.0f;
        }
    }
}
