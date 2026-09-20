package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ii0 {
    public Paint f25058a;
    public Paint f25059b;
    public float f25060c;
    public int d;
    public int e;
    public float f25061f;

    public final void a(float f7) {
        this.f25060c = f7;
        if (f7 < 0.0f) {
            this.f25060c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f25060c = 1.0f;
        }
    }
}
