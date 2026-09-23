package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class uh0 {
    public Canvas f28505a;
    public Bitmap f28506b;
    public boolean f28507c;
    public boolean d;
    public boolean e;
    public boolean f28508f;

    public final void a() {
        this.f28507c = true;
        if (!this.e) {
            this.d = true;
            this.f28506b.recycle();
        }
    }
}
