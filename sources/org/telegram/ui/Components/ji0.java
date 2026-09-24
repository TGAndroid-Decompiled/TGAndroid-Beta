package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ji0 {
    public Paint f25425a;
    public Paint f25426b;
    public float f25427c;
    public int d;
    public int e;
    public float f25428f;

    public final void a(float f7) {
        this.f25427c = f7;
        if (f7 < 0.0f) {
            this.f25427c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f25427c = 1.0f;
        }
    }
}
