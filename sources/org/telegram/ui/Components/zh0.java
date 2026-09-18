package org.telegram.ui.Components;

import android.graphics.Paint;
public final class zh0 {
    public Paint f30530a;
    public Paint f30531b;
    public float f30532c;
    public int d;
    public int e;
    public float f30533f;

    public final void a(float f7) {
        this.f30532c = f7;
        if (f7 < 0.0f) {
            this.f30532c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f30532c = 1.0f;
        }
    }
}
