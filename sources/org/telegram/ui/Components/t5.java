package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class t5 implements v5 {
    public final WeakReference f39765a;
    public final boolean f39766b;
    public Layout f39767c;
    public y5 d;
    public Rect f39768e;
    public p5 f39769f;
    public org.telegram.messenger.f6 h;
    public boolean f39770n;
    public float f39771r;
    public float f39772s;
    public boolean f39773w;

    public t5(View view, boolean z10) {
        this.f39765a = new WeakReference(view);
        this.f39766b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f39765a.get();
        if (view == null) {
            return;
        }
        if (this.f39766b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
