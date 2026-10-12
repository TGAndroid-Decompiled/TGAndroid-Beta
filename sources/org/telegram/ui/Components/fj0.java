package org.telegram.ui.Components;

import android.graphics.Paint;
public final class fj0 {
    public Paint f26093a;
    public Paint f26094b;
    public float f26095c;
    public int d;
    public int f26096e;
    public float f26097f;

    public final void a(float f7) {
        this.f26095c = f7;
        if (f7 < 0.0f) {
            this.f26095c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f26095c = 1.0f;
        }
    }
}
