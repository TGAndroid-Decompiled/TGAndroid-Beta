package org.telegram.ui.Components;

import android.graphics.Paint;
public final class yh0 {
    public Paint f30256a;
    public Paint f30257b;
    public float f30258c;
    public int d;
    public int e;
    public float f30259f;

    public final void a(float f7) {
        this.f30258c = f7;
        if (f7 < 0.0f) {
            this.f30258c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f30258c = 1.0f;
        }
    }
}
