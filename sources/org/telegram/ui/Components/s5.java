package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class s5 implements u5 {
    public final WeakReference f39491a;
    public final boolean f39492b;
    public Layout f39493c;
    public x5 d;
    public Rect f39494e;
    public o5 f39495f;
    public org.telegram.messenger.f6 h;
    public boolean f39496n;
    public float f39497r;
    public float f39498s;
    public boolean f39499w;

    public s5(View view, boolean z10) {
        this.f39491a = new WeakReference(view);
        this.f39492b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f39491a.get();
        if (view == null) {
            return;
        }
        if (this.f39492b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
