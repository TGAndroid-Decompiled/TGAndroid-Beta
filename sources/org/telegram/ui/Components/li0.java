package org.telegram.ui.Components;

import android.graphics.Paint;
public final class li0 {
    public Paint f28485a;
    public Paint f28486b;
    public float f28487c;
    public int d;
    public int f28488e;
    public float f28489f;

    public final void a(float f7) {
        this.f28487c = f7;
        if (f7 < 0.0f) {
            this.f28487c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f28487c = 1.0f;
        }
    }
}
