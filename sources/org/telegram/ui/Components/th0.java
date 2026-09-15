package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class th0 {
    public Canvas f28134a;
    public Bitmap f28135b;
    public boolean f28136c;
    public boolean d;
    public boolean e;
    public boolean f28137f;

    public final void a() {
        this.f28136c = true;
        if (!this.e) {
            this.d = true;
            this.f28135b.recycle();
        }
    }
}
