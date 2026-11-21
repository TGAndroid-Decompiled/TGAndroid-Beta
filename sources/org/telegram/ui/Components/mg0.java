package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class mg0 {
    public Canvas f37511a;
    public Bitmap f37512b;
    public boolean f37513c;
    public boolean d;
    public boolean f37514e;
    public boolean f37515f;

    public final void a() {
        this.f37513c = true;
        if (!this.f37514e) {
            this.d = true;
            this.f37512b.recycle();
        }
    }
}
