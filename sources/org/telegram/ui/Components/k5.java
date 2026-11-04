package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class k5 implements m5 {
    public final WeakReference f35308a;
    public final boolean f35309b;
    public Layout f35310c;
    public p5 d;
    public Rect f35311e;
    public g5 f35312f;
    public org.telegram.messenger.e6 h;
    public boolean f35313n;
    public float f35314r;
    public float f35315s;
    public boolean f35316w;

    public k5(View view, boolean z10) {
        this.f35308a = new WeakReference(view);
        this.f35309b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f35308a.get();
        if (view == null) {
            return;
        }
        if (this.f35309b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
