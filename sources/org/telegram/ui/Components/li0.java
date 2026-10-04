package org.telegram.ui.Components;

import android.graphics.Paint;
public final class li0 {
    public Paint f28377a;
    public Paint f28378b;
    public float f28379c;
    public int d;
    public int f28380e;
    public float f28381f;

    public final void a(float f7) {
        this.f28379c = f7;
        if (f7 < 0.0f) {
            this.f28379c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f28379c = 1.0f;
        }
    }
}
