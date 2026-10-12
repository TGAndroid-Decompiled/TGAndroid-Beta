package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class aj0 {
    public Canvas f24409a;
    public Bitmap f24410b;
    public boolean f24411c;
    public boolean d;
    public boolean f24412e;
    public boolean f24413f;

    public final void a() {
        this.f24411c = true;
        if (!this.f24412e) {
            this.d = true;
            this.f24410b.recycle();
        }
    }
}
