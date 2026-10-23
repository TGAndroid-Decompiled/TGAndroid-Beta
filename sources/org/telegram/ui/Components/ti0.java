package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ti0 {
    public Canvas f30797a;
    public Bitmap f30798b;
    public boolean f30799c;
    public boolean d;
    public boolean e;
    public boolean f30800f;

    public final void a() {
        this.f30799c = true;
        if (!this.e) {
            this.d = true;
            this.f30798b.recycle();
        }
    }
}
