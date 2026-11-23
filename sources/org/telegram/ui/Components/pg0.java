package org.telegram.ui.Components;

import android.graphics.Paint;
public final class pg0 {
    public Paint f38484a;
    public Paint f38485b;
    public float f38486c;
    public int d;
    public int f38487e;
    public float f38488f;

    public final void a(float f10) {
        this.f38486c = f10;
        if (f10 < 0.0f) {
            this.f38486c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f38486c = 1.0f;
        }
    }
}
