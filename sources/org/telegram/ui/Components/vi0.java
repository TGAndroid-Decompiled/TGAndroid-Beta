package org.telegram.ui.Components;

import android.graphics.Paint;
public final class vi0 {
    public Paint f31264a;
    public Paint f31265b;
    public float f31266c;
    public int d;
    public int e;
    public float f31267f;

    public final void a(float f7) {
        this.f31266c = f7;
        if (f7 < 0.0f) {
            this.f31266c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f31266c = 1.0f;
        }
    }
}
