package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class xf0 {
    public Canvas f40298a;
    public Bitmap f40299b;
    public boolean f40300c;
    public boolean d;
    public boolean f40301e;
    public boolean f40302f;

    public final void a() {
        this.f40300c = true;
        if (!this.f40301e) {
            this.d = true;
            this.f40299b.recycle();
        }
    }
}
