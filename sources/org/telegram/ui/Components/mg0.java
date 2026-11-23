package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class mg0 {
    public Canvas f37509a;
    public Bitmap f37510b;
    public boolean f37511c;
    public boolean d;
    public boolean f37512e;
    public boolean f37513f;

    public final void a() {
        this.f37511c = true;
        if (!this.f37512e) {
            this.d = true;
            this.f37510b.recycle();
        }
    }
}
