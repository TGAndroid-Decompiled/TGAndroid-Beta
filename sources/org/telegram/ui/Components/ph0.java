package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ph0 {
    public Canvas f31676a;
    public Bitmap f31677b;
    public boolean f31678c;
    public boolean d;
    public boolean f31679e;
    public boolean f31680f;

    public final void a() {
        this.f31678c = true;
        if (!this.f31679e) {
            this.d = true;
            this.f31677b.recycle();
        }
    }
}
