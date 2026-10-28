package org.telegram.ui.Components;

import android.graphics.Paint;
public final class yi0 {
    public Paint f35060a;
    public Paint f35061b;
    public float f35062c;
    public int d;
    public int e;
    public float f35063f;

    public final void a(float f7) {
        this.f35062c = f7;
        if (f7 < 0.0f) {
            this.f35062c = 0.0f;
        } else if (f7 > 1.0f) {
            this.f35062c = 1.0f;
        }
    }
}
