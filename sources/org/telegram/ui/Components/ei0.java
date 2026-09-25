package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ei0 {
    public Canvas f23961a;
    public Bitmap f23962b;
    public boolean f23963c;
    public boolean d;
    public boolean e;
    public boolean f23964f;

    public final void a() {
        this.f23963c = true;
        if (!this.e) {
            this.d = true;
            this.f23962b.recycle();
        }
    }
}
