package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class si0 {
    public Canvas f32571a;
    public Bitmap f32572b;
    public boolean f32573c;
    public boolean d;
    public boolean e;
    public boolean f32574f;

    public final void a() {
        this.f32573c = true;
        if (!this.e) {
            this.d = true;
            this.f32572b.recycle();
        }
    }
}
