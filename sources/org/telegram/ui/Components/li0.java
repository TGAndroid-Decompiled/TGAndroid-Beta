package org.telegram.ui.Components;

import android.graphics.Paint;
public final class li0 {
    public Paint f26062a;
    public Paint f26063b;
    public float f26064c;
    public int d;
    public int e;
    public float f26065f;

    public final void a(float f7) {
        this.f26064c = f7;
        if (f7 < 0.0f) {
            this.f26064c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f26064c = 1.0f;
        }
    }
}
