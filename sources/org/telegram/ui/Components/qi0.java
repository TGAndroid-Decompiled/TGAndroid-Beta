package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class qi0 {
    public Canvas f29609a;
    public Bitmap f29610b;
    public boolean f29611c;
    public boolean d;
    public boolean e;
    public boolean f29612f;

    public final void a() {
        this.f29611c = true;
        if (!this.e) {
            this.d = true;
            this.f29610b.recycle();
        }
    }
}
