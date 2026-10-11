package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class zi0 {
    public Canvas f33636a;
    public Bitmap f33637b;
    public boolean f33638c;
    public boolean d;
    public boolean f33639e;
    public boolean f33640f;

    public final void a() {
        this.f33638c = true;
        if (!this.f33639e) {
            this.d = true;
            this.f33637b.recycle();
        }
    }
}
