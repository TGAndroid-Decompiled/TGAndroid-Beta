package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ki0 {
    public Paint f25738a;
    public Paint f25739b;
    public float f25740c;
    public int d;
    public int e;
    public float f25741f;

    public final void a(float f7) {
        this.f25740c = f7;
        if (f7 < 0.0f) {
            this.f25740c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f25740c = 1.0f;
        }
    }
}
