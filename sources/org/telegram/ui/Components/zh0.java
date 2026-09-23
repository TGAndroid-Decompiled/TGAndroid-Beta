package org.telegram.ui.Components;

import android.graphics.Paint;
public final class zh0 {
    public Paint f30599a;
    public Paint f30600b;
    public float f30601c;
    public int d;
    public int e;
    public float f30602f;

    public final void a(float f7) {
        this.f30601c = f7;
        if (f7 < 0.0f) {
            this.f30601c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f30601c = 1.0f;
        }
    }
}
