package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class fh0 {
    public Canvas f28430a;
    public Bitmap f28431b;
    public boolean f28432c;
    public boolean d;
    public boolean f28433e;
    public boolean f28434f;

    public final void a() {
        this.f28432c = true;
        if (!this.f28433e) {
            this.d = true;
            this.f28431b.recycle();
        }
    }
}
