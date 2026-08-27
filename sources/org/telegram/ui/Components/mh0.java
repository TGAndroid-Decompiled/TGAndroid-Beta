package org.telegram.ui.Components;

import android.graphics.Paint;

public final class mh0 {

    public Paint f30686a;

    public Paint f30687b;

    public float f30688c;
    public int d;

    public int f30689e;

    public float f30690f;

    public final void a(float f10) {
        this.f30688c = f10;
        if (f10 < 0.0f) {
            this.f30688c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f30688c = 1.0f;
        }
    }
}
