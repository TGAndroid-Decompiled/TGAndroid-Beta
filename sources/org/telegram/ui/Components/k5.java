package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class k5 implements m5 {
    public final WeakReference f36279a;
    public final boolean f36280b;
    public Layout f36281c;
    public p5 d;
    public Rect f36282e;
    public g5 f36283f;
    public org.telegram.messenger.f6 h;
    public boolean f36284n;
    public float f36285r;
    public float f36286s;
    public boolean f36287w;

    public k5(View view, boolean z10) {
        this.f36279a = new WeakReference(view);
        this.f36280b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f36279a.get();
        if (view == null) {
            return;
        }
        if (this.f36280b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
