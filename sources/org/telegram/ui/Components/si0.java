package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class si0 {
    public Canvas f30519a;
    public Bitmap f30520b;
    public boolean f30521c;
    public boolean d;
    public boolean e;
    public boolean f30522f;

    public final void a() {
        this.f30521c = true;
        if (!this.e) {
            this.d = true;
            this.f30520b.recycle();
        }
    }
}
