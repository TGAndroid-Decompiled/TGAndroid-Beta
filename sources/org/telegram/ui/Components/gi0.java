package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class gi0 {
    public Canvas f26870a;
    public Bitmap f26871b;
    public boolean f26872c;
    public boolean d;
    public boolean f26873e;
    public boolean f26874f;

    public final void a() {
        this.f26872c = true;
        if (!this.f26873e) {
            this.d = true;
            this.f26871b.recycle();
        }
    }
}
