package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class aj0 {
    public Canvas f24525a;
    public Bitmap f24526b;
    public boolean f24527c;
    public boolean d;
    public boolean f24528e;
    public boolean f24529f;

    public final void a() {
        this.f24527c = true;
        if (!this.f24528e) {
            this.d = true;
            this.f24526b.recycle();
        }
    }
}
