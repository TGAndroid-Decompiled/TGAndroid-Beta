package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class l5 implements n5 {
    public final WeakReference f35536a;
    public final boolean f35537b;
    public Layout f35538c;
    public q5 d;
    public Rect f35539e;
    public h5 f35540f;
    public org.telegram.messenger.e6 h;
    public boolean f35541n;
    public float f35542r;
    public float f35543s;
    public boolean f35544w;

    public l5(View view, boolean z9) {
        this.f35536a = new WeakReference(view);
        this.f35537b = z9;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f35536a.get();
        if (view == null) {
            return;
        }
        if (this.f35537b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
