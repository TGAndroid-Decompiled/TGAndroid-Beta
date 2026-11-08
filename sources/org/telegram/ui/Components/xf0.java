package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class xf0 {
    public Canvas f40305a;
    public Bitmap f40306b;
    public boolean f40307c;
    public boolean d;
    public boolean f40308e;
    public boolean f40309f;

    public final void a() {
        this.f40307c = true;
        if (!this.f40308e) {
            this.d = true;
            this.f40306b.recycle();
        }
    }
}
