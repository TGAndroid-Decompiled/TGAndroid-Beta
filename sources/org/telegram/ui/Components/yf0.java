package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class yf0 {
    public Canvas f40711a;
    public Bitmap f40712b;
    public boolean f40713c;
    public boolean d;
    public boolean f40714e;
    public boolean f40715f;

    public final void a() {
        this.f40713c = true;
        if (!this.f40714e) {
            this.d = true;
            this.f40712b.recycle();
        }
    }
}
