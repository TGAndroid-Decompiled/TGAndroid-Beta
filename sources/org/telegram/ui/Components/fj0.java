package org.telegram.ui.Components;

import android.graphics.Paint;
public final class fj0 {
    public Paint f26361a;
    public Paint f26362b;
    public float f26363c;
    public int d;
    public int f26364e;
    public float f26365f;

    public final void a(float f7) {
        this.f26363c = f7;
        if (f7 < 0.0f) {
            this.f26363c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f26363c = 1.0f;
        }
    }
}
