package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class qi0 {
    public Canvas f29612a;
    public Bitmap f29613b;
    public boolean f29614c;
    public boolean d;
    public boolean e;
    public boolean f29615f;

    public final void a() {
        this.f29614c = true;
        if (!this.e) {
            this.d = true;
            this.f29613b.recycle();
        }
    }
}
