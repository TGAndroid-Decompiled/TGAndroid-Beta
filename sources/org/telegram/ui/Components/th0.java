package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class th0 {
    public Canvas f30604a;
    public Bitmap f30605b;
    public boolean f30606c;
    public boolean d;
    public boolean f30607e;
    public boolean f30608f;

    public final void a() {
        this.f30606c = true;
        if (!this.f30607e) {
            this.d = true;
            this.f30605b.recycle();
        }
    }
}
