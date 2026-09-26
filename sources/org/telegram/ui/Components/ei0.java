package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ei0 {
    public Canvas f23960a;
    public Bitmap f23961b;
    public boolean f23962c;
    public boolean d;
    public boolean e;
    public boolean f23963f;

    public final void a() {
        this.f23962c = true;
        if (!this.e) {
            this.d = true;
            this.f23961b.recycle();
        }
    }
}
