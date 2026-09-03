package org.telegram.ui.Components;

import android.graphics.Paint;
public final class gi0 {
    public Paint f25148a;
    public Paint f25149b;
    public float f25150c;
    public int d;
    public int e;
    public float f25151f;

    public final void a(float f10) {
        this.f25150c = f10;
        if (f10 < 0.0f) {
            this.f25150c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f25150c = 1.0f;
        }
    }
}
