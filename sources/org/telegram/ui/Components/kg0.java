package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class kg0 {
    public Canvas f36756a;
    public Bitmap f36757b;
    public boolean f36758c;
    public boolean d;
    public boolean f36759e;
    public boolean f36760f;

    public final void a() {
        this.f36758c = true;
        if (!this.f36759e) {
            this.d = true;
            this.f36757b.recycle();
        }
    }
}
