package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class gi0 {
    public Canvas f26924a;
    public Bitmap f26925b;
    public boolean f26926c;
    public boolean d;
    public boolean f26927e;
    public boolean f26928f;

    public final void a() {
        this.f26926c = true;
        if (!this.f26927e) {
            this.d = true;
            this.f26925b.recycle();
        }
    }
}
