package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class gi0 {
    public Canvas f26875a;
    public Bitmap f26876b;
    public boolean f26877c;
    public boolean d;
    public boolean f26878e;
    public boolean f26879f;

    public final void a() {
        this.f26877c = true;
        if (!this.f26878e) {
            this.d = true;
            this.f26876b.recycle();
        }
    }
}
