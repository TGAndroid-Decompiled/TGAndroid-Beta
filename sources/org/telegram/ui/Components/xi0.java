package org.telegram.ui.Components;

import android.graphics.Paint;
public final class xi0 {
    public Paint f34725a;
    public Paint f34726b;
    public float f34727c;
    public int d;
    public int e;
    public float f34728f;

    public final void a(float f7) {
        this.f34727c = f7;
        if (f7 < 0.0f) {
            this.f34727c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f34727c = 1.0f;
        }
    }
}
