package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class bj0 {
    public Canvas f24662a;
    public Bitmap f24663b;
    public boolean f24664c;
    public boolean d;
    public boolean f24665e;
    public boolean f24666f;

    public final void a() {
        this.f24664c = true;
        if (!this.f24665e) {
            this.d = true;
            this.f24663b.recycle();
        }
    }
}
