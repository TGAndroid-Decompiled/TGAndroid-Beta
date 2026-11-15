package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ag0 {
    public Canvas f32984a;
    public Bitmap f32985b;
    public boolean f32986c;
    public boolean d;
    public boolean f32987e;
    public boolean f32988f;

    public final void a() {
        this.f32986c = true;
        if (!this.f32987e) {
            this.d = true;
            this.f32985b.recycle();
        }
    }
}
