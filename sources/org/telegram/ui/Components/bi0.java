package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class bi0 {
    public Canvas f23698a;
    public Bitmap f23699b;
    public boolean f23700c;
    public boolean d;
    public boolean e;
    public boolean f23701f;

    public final void a() {
        this.f23700c = true;
        if (!this.e) {
            this.d = true;
            this.f23699b.recycle();
        }
    }
}
