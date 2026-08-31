package org.telegram.ui.Components;

import android.graphics.Paint;
public final class hi0 {
    public Paint f27493a;
    public Paint f27494b;
    public float f27495c;
    public int d;
    public int f27496e;
    public float f27497f;

    public final void a(float f10) {
        this.f27495c = f10;
        if (f10 < 0.0f) {
            this.f27495c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f27495c = 1.0f;
        }
    }
}
