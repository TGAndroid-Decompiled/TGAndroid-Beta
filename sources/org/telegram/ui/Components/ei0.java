package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ei0 {
    public Canvas f23944a;
    public Bitmap f23945b;
    public boolean f23946c;
    public boolean d;
    public boolean e;
    public boolean f23947f;

    public final void a() {
        this.f23946c = true;
        if (!this.e) {
            this.d = true;
            this.f23945b.recycle();
        }
    }
}
