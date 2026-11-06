package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class xf0 {
    public Canvas f40284a;
    public Bitmap f40285b;
    public boolean f40286c;
    public boolean d;
    public boolean f40287e;
    public boolean f40288f;

    public final void a() {
        this.f40286c = true;
        if (!this.f40287e) {
            this.d = true;
            this.f40285b.recycle();
        }
    }
}
