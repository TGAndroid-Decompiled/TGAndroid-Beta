package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ti0 {
    public Canvas f33057a;
    public Bitmap f33058b;
    public boolean f33059c;
    public boolean d;
    public boolean e;
    public boolean f33060f;

    public final void a() {
        this.f33059c = true;
        if (!this.e) {
            this.d = true;
            this.f33058b.recycle();
        }
    }
}
