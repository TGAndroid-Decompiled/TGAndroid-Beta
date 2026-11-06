package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class xf0 {
    public Canvas f40268a;
    public Bitmap f40269b;
    public boolean f40270c;
    public boolean d;
    public boolean f40271e;
    public boolean f40272f;

    public final void a() {
        this.f40270c = true;
        if (!this.f40271e) {
            this.d = true;
            this.f40269b.recycle();
        }
    }
}
