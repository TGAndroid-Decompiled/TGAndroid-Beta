package org.telegram.ui.Components;

import android.graphics.Paint;
public final class qg0 {
    public Paint f38919a;
    public Paint f38920b;
    public float f38921c;
    public int d;
    public int f38922e;
    public float f38923f;

    public final void a(float f10) {
        this.f38921c = f10;
        if (f10 < 0.0f) {
            this.f38921c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f38921c = 1.0f;
        }
    }
}
