package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class k5 implements m5 {
    public final WeakReference f36269a;
    public final boolean f36270b;
    public Layout f36271c;
    public p5 d;
    public Rect f36272e;
    public g5 f36273f;
    public org.telegram.messenger.f6 h;
    public boolean f36274n;
    public float f36275r;
    public float f36276s;
    public boolean f36277w;

    public k5(View view, boolean z10) {
        this.f36269a = new WeakReference(view);
        this.f36270b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f36269a.get();
        if (view == null) {
            return;
        }
        if (this.f36270b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
