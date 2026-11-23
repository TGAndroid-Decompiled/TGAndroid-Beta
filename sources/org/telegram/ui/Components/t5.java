package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class t5 implements v5 {
    public final WeakReference f39719a;
    public final boolean f39720b;
    public Layout f39721c;
    public y5 d;
    public Rect f39722e;
    public p5 f39723f;
    public org.telegram.messenger.f6 h;
    public boolean f39724n;
    public float f39725r;
    public float f39726s;
    public boolean f39727w;

    public t5(View view, boolean z10) {
        this.f39719a = new WeakReference(view);
        this.f39720b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f39719a.get();
        if (view == null) {
            return;
        }
        if (this.f39720b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
