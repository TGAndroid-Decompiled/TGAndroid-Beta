package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class lg0 {
    public Canvas f37125a;
    public Bitmap f37126b;
    public boolean f37127c;
    public boolean d;
    public boolean f37128e;
    public boolean f37129f;

    public final void a() {
        this.f37127c = true;
        if (!this.f37128e) {
            this.d = true;
            this.f37126b.recycle();
        }
    }
}
