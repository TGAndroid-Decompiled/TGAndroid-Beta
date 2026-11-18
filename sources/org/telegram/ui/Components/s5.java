package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class s5 implements u5 {
    public final WeakReference f39485a;
    public final boolean f39486b;
    public Layout f39487c;
    public x5 d;
    public Rect f39488e;
    public o5 f39489f;
    public org.telegram.messenger.f6 h;
    public boolean f39490n;
    public float f39491r;
    public float f39492s;
    public boolean f39493w;

    public s5(View view, boolean z10) {
        this.f39485a = new WeakReference(view);
        this.f39486b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f39485a.get();
        if (view == null) {
            return;
        }
        if (this.f39486b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
