package org.telegram.ui.Components;

import android.graphics.Paint;
public final class dj0 {
    public Paint f25729a;
    public Paint f25730b;
    public float f25731c;
    public int d;
    public int f25732e;
    public float f25733f;

    public final void a(float f7) {
        this.f25731c = f7;
        if (f7 < 0.0f) {
            this.f25731c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f25731c = 1.0f;
        }
    }
}
