package org.telegram.ui.Components;

import android.graphics.Paint;
public final class eg0 {
    public Paint f33388a;
    public Paint f33389b;
    public float f33390c;
    public int d;
    public int f33391e;
    public float f33392f;

    public final void a(float f10) {
        this.f33390c = f10;
        if (f10 < 0.0f) {
            this.f33390c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f33390c = 1.0f;
        }
    }
}
