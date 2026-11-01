package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ah0 {
    public Canvas f24399a;
    public Bitmap f24400b;
    public boolean f24401c;
    public boolean d;
    public boolean e;
    public boolean f24402f;

    public final void a() {
        this.f24401c = true;
        if (!this.e) {
            this.d = true;
            this.f24400b.recycle();
        }
    }
}
