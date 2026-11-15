package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ag0 {
    public Canvas f32987a;
    public Bitmap f32988b;
    public boolean f32989c;
    public boolean d;
    public boolean f32990e;
    public boolean f32991f;

    public final void a() {
        this.f32989c = true;
        if (!this.f32990e) {
            this.d = true;
            this.f32988b.recycle();
        }
    }
}
