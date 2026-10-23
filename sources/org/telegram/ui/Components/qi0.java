package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class qi0 {
    public Canvas f29613a;
    public Bitmap f29614b;
    public boolean f29615c;
    public boolean d;
    public boolean e;
    public boolean f29616f;

    public final void a() {
        this.f29615c = true;
        if (!this.e) {
            this.d = true;
            this.f29614b.recycle();
        }
    }
}
