package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class mg0 {
    public Canvas f37510a;
    public Bitmap f37511b;
    public boolean f37512c;
    public boolean d;
    public boolean f37513e;
    public boolean f37514f;

    public final void a() {
        this.f37512c = true;
        if (!this.f37513e) {
            this.d = true;
            this.f37511b.recycle();
        }
    }
}
