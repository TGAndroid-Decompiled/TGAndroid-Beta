package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ag0 {
    public Canvas f31839a;
    public Bitmap f31840b;
    public boolean f31841c;
    public boolean d;
    public boolean f31842e;
    public boolean f31843f;

    public final void a() {
        this.f31841c = true;
        if (!this.f31842e) {
            this.d = true;
            this.f31840b.recycle();
        }
    }
}
