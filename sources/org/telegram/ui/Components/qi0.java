package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class qi0 {
    public Canvas f29608a;
    public Bitmap f29609b;
    public boolean f29610c;
    public boolean d;
    public boolean e;
    public boolean f29611f;

    public final void a() {
        this.f29610c = true;
        if (!this.e) {
            this.d = true;
            this.f29609b.recycle();
        }
    }
}
