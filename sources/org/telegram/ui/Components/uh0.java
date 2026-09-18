package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class uh0 {
    public Canvas f28390a;
    public Bitmap f28391b;
    public boolean f28392c;
    public boolean d;
    public boolean e;
    public boolean f28393f;

    public final void a() {
        this.f28392c = true;
        if (!this.e) {
            this.d = true;
            this.f28391b.recycle();
        }
    }
}
