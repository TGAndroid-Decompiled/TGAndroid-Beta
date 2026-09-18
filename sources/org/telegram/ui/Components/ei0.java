package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ei0 {
    public Canvas f23884a;
    public Bitmap f23885b;
    public boolean f23886c;
    public boolean d;
    public boolean e;
    public boolean f23887f;

    public final void a() {
        this.f23886c = true;
        if (!this.e) {
            this.d = true;
            this.f23885b.recycle();
        }
    }
}
