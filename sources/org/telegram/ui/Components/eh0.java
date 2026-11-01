package org.telegram.ui.Components;

import android.graphics.Paint;
public final class eh0 {
    public Paint f25836a;
    public Paint f25837b;
    public float f25838c;
    public int d;
    public int e;
    public float f25839f;

    public final void a(float f7) {
        this.f25838c = f7;
        if (f7 < 0.0f) {
            this.f25838c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f25838c = 1.0f;
        }
    }
}
