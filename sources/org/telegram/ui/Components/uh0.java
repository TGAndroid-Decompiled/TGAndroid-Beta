package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class uh0 {
    public Canvas f28387a;
    public Bitmap f28388b;
    public boolean f28389c;
    public boolean d;
    public boolean e;
    public boolean f28390f;

    public final void a() {
        this.f28389c = true;
        if (!this.e) {
            this.d = true;
            this.f28388b.recycle();
        }
    }
}
