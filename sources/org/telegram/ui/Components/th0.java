package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class th0 {
    public Canvas f28131a;
    public Bitmap f28132b;
    public boolean f28133c;
    public boolean d;
    public boolean e;
    public boolean f28134f;

    public final void a() {
        this.f28133c = true;
        if (!this.e) {
            this.d = true;
            this.f28132b.recycle();
        }
    }
}
