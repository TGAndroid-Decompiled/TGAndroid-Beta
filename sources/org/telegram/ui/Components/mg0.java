package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class mg0 {
    public Canvas f37467a;
    public Bitmap f37468b;
    public boolean f37469c;
    public boolean d;
    public boolean f37470e;
    public boolean f37471f;

    public final void a() {
        this.f37469c = true;
        if (!this.f37470e) {
            this.d = true;
            this.f37468b.recycle();
        }
    }
}
