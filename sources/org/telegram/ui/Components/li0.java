package org.telegram.ui.Components;

import android.graphics.Paint;
public final class li0 {
    public Paint f26122a;
    public Paint f26123b;
    public float f26124c;
    public int d;
    public int e;
    public float f26125f;

    public final void a(float f7) {
        this.f26124c = f7;
        if (f7 < 0.0f) {
            this.f26124c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f26124c = 1.0f;
        }
    }
}
