package org.telegram.ui.Components;

import android.graphics.Paint;
public final class kh0 {
    public Paint f30091a;
    public Paint f30092b;
    public float f30093c;
    public int d;
    public int f30094e;
    public float f30095f;

    public final void a(float f10) {
        this.f30093c = f10;
        if (f10 < 0.0f) {
            this.f30093c = 0.0f;
        } else if (f10 > 1.0f) {
            this.f30093c = 1.0f;
        }
    }
}
