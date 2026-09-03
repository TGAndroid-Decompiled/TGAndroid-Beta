package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ci0 {
    public Canvas f25957a;
    public Bitmap f25958b;
    public boolean f25959c;
    public boolean d;
    public boolean f25960e;
    public boolean f25961f;

    public final void a() {
        this.f25959c = true;
        if (!this.f25960e) {
            this.d = true;
            this.f25958b.recycle();
        }
    }
}
