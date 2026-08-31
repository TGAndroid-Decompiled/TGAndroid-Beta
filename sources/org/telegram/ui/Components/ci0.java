package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ci0 {
    public Canvas f25980a;
    public Bitmap f25981b;
    public boolean f25982c;
    public boolean d;
    public boolean f25983e;
    public boolean f25984f;

    public final void a() {
        this.f25982c = true;
        if (!this.f25983e) {
            this.d = true;
            this.f25981b.recycle();
        }
    }
}
