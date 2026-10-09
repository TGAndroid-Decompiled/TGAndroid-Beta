package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class yi0 {
    public Canvas f33295a;
    public Bitmap f33296b;
    public boolean f33297c;
    public boolean d;
    public boolean f33298e;
    public boolean f33299f;

    public final void a() {
        this.f33297c = true;
        if (!this.f33298e) {
            this.d = true;
            this.f33296b.recycle();
        }
    }
}
