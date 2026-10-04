package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class gi0 {
    public Canvas f26869a;
    public Bitmap f26870b;
    public boolean f26871c;
    public boolean d;
    public boolean f26872e;
    public boolean f26873f;

    public final void a() {
        this.f26871c = true;
        if (!this.f26872e) {
            this.d = true;
            this.f26870b.recycle();
        }
    }
}
