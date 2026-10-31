package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class j5 implements l5 {
    public final WeakReference f27224a;
    public final boolean f27225b;
    public Layout f27226c;
    public o5 d;
    public Rect e;
    public f5 f27227f;
    public org.telegram.messenger.g6 h;
    public boolean f27228n;
    public float f27229r;
    public float f27230s;
    public boolean f27231w;

    public j5(View view, boolean z10) {
        this.f27224a = new WeakReference(view);
        this.f27225b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f27224a.get();
        if (view == null) {
            return;
        }
        if (this.f27225b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
