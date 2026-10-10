package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class zi0 {
    public Canvas f33612a;
    public Bitmap f33613b;
    public boolean f33614c;
    public boolean d;
    public boolean f33615e;
    public boolean f33616f;

    public final void a() {
        this.f33614c = true;
        if (!this.f33615e) {
            this.d = true;
            this.f33613b.recycle();
        }
    }
}
