package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class di0 {
    public Canvas f22426a;
    public Bitmap f22427b;
    public boolean f22428c;
    public boolean d;
    public boolean e;
    public boolean f22429f;

    public final void a() {
        this.f22428c = true;
        if (!this.e) {
            this.d = true;
            this.f22427b.recycle();
        }
    }
}
