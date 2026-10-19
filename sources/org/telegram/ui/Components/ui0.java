package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ui0 {
    public Paint f30969a;
    public Paint f30970b;
    public float f30971c;
    public int d;
    public int e;
    public float f30972f;

    public final void a(float f7) {
        this.f30971c = f7;
        if (f7 < 0.0f) {
            this.f30971c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f30971c = 1.0f;
        }
    }
}
