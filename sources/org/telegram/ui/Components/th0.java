package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class th0 {
    public Canvas f30630a;
    public Bitmap f30631b;
    public boolean f30632c;
    public boolean d;
    public boolean f30633e;
    public boolean f30634f;

    public final void a() {
        this.f30632c = true;
        if (!this.f30633e) {
            this.d = true;
            this.f30631b.recycle();
        }
    }
}
