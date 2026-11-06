package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class xf0 {
    public Canvas f40249a;
    public Bitmap f40250b;
    public boolean f40251c;
    public boolean d;
    public boolean f40252e;
    public boolean f40253f;

    public final void a() {
        this.f40251c = true;
        if (!this.f40252e) {
            this.d = true;
            this.f40250b.recycle();
        }
    }
}
