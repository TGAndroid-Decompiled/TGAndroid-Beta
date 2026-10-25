package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class si0 {
    public Canvas f32569a;
    public Bitmap f32570b;
    public boolean f32571c;
    public boolean d;
    public boolean e;
    public boolean f32572f;

    public final void a() {
        this.f32571c = true;
        if (!this.e) {
            this.d = true;
            this.f32570b.recycle();
        }
    }
}
