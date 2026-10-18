package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ui0 {
    public Paint f30994a;
    public Paint f30995b;
    public float f30996c;
    public int d;
    public int e;
    public float f30997f;

    public final void a(float f7) {
        this.f30996c = f7;
        if (f7 < 0.0f) {
            this.f30996c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f30996c = 1.0f;
        }
    }
}
