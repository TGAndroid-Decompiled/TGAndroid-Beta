package org.telegram.ui.Components;

import android.graphics.Paint;
public final class li0 {
    public Paint f28382a;
    public Paint f28383b;
    public float f28384c;
    public int d;
    public int f28385e;
    public float f28386f;

    public final void a(float f7) {
        this.f28384c = f7;
        if (f7 < 0.0f) {
            this.f28384c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f28384c = 1.0f;
        }
    }
}
