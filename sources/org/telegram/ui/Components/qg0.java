package org.telegram.ui.Components;

import android.graphics.Paint;
public final class qg0 {
    public Paint f38926a;
    public Paint f38927b;
    public float f38928c;
    public int d;
    public int f38929e;
    public float f38930f;

    public final void a(float f10) {
        this.f38928c = f10;
        if (f10 < 0.0f) {
            this.f38928c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f38928c = 1.0f;
        }
    }
}
