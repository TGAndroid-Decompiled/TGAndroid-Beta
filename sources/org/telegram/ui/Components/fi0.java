package org.telegram.ui.Components;

import android.graphics.Paint;
public final class fi0 {
    public Paint f24883a;
    public Paint f24884b;
    public float f24885c;
    public int d;
    public int e;
    public float f24886f;

    public final void a(float f10) {
        this.f24885c = f10;
        if (f10 < 0.0f) {
            this.f24885c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f24885c = 1.0f;
        }
    }
}
