package org.telegram.ui.Components;

import android.graphics.Paint;
public final class ii0 {
    public Paint f24031a;
    public Paint f24032b;
    public float f24033c;
    public int d;
    public int e;
    public float f24034f;

    public final void a(float f7) {
        this.f24033c = f7;
        if (f7 < 0.0f) {
            this.f24033c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f24033c = 1.0f;
        }
    }
}
