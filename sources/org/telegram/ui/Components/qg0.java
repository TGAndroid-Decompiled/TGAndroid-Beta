package org.telegram.ui.Components;

import android.graphics.Paint;
public final class qg0 {
    public Paint f38920a;
    public Paint f38921b;
    public float f38922c;
    public int d;
    public int f38923e;
    public float f38924f;

    public final void a(float f10) {
        this.f38922c = f10;
        if (f10 < 0.0f) {
            this.f38922c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f38922c = 1.0f;
        }
    }
}
