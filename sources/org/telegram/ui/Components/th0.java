package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class th0 {
    public Canvas f30603a;
    public Bitmap f30604b;
    public boolean f30605c;
    public boolean d;
    public boolean f30606e;
    public boolean f30607f;

    public final void a() {
        this.f30605c = true;
        if (!this.f30606e) {
            this.d = true;
            this.f30604b.recycle();
        }
    }
}
