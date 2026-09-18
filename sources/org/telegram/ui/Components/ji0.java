package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ji0 {
    public Paint f25344a;
    public Paint f25345b;
    public float f25346c;
    public int d;
    public int e;
    public float f25347f;

    public final void a(float f7) {
        this.f25346c = f7;
        if (f7 < 0.0f) {
            this.f25346c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f25346c = 1.0f;
        }
    }
}
