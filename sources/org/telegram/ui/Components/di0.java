package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class di0 {
    public Canvas f23596a;
    public Bitmap f23597b;
    public boolean f23598c;
    public boolean d;
    public boolean e;
    public boolean f23599f;

    public final void a() {
        this.f23598c = true;
        if (!this.e) {
            this.d = true;
            this.f23597b.recycle();
        }
    }
}
