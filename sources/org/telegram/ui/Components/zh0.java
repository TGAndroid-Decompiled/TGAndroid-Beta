package org.telegram.ui.Components;

import android.graphics.Paint;
public final class zh0 {
    public Paint f30527a;
    public Paint f30528b;
    public float f30529c;
    public int d;
    public int e;
    public float f30530f;

    public final void a(float f7) {
        this.f30529c = f7;
        if (f7 < 0.0f) {
            this.f30529c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f30529c = 1.0f;
        }
    }
}
