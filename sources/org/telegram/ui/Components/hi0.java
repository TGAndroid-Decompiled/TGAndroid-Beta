package org.telegram.ui.Components;

import android.graphics.Paint;
public final class hi0 {
    public Paint f27510a;
    public Paint f27511b;
    public float f27512c;
    public int d;
    public int f27513e;
    public float f27514f;

    public final void a(float f10) {
        this.f27512c = f10;
        if (f10 < 0.0f) {
            this.f27512c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f27512c = 1.0f;
        }
    }
}
