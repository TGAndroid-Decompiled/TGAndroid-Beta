package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class fi0 {
    public Canvas f24281a;
    public Bitmap f24282b;
    public boolean f24283c;
    public boolean d;
    public boolean e;
    public boolean f24284f;

    public final void a() {
        this.f24283c = true;
        if (!this.e) {
            this.d = true;
            this.f24282b.recycle();
        }
    }
}
