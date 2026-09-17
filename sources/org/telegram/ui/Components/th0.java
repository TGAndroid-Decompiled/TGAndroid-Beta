package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class th0 {
    public Canvas f30631a;
    public Bitmap f30632b;
    public boolean f30633c;
    public boolean d;
    public boolean f30634e;
    public boolean f30635f;

    public final void a() {
        this.f30633c = true;
        if (!this.f30634e) {
            this.d = true;
            this.f30632b.recycle();
        }
    }
}
