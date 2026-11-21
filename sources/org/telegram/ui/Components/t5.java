package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class t5 implements v5 {
    public final WeakReference f39772a;
    public final boolean f39773b;
    public Layout f39774c;
    public y5 d;
    public Rect f39775e;
    public p5 f39776f;
    public org.telegram.messenger.f6 h;
    public boolean f39777n;
    public float f39778r;
    public float f39779s;
    public boolean f39780w;

    public t5(View view, boolean z10) {
        this.f39772a = new WeakReference(view);
        this.f39773b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f39772a.get();
        if (view == null) {
            return;
        }
        if (this.f39773b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
