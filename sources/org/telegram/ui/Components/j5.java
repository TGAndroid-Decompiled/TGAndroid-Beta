package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class j5 implements l5 {
    public final WeakReference f27274a;
    public final boolean f27275b;
    public Layout f27276c;
    public o5 d;
    public Rect e;
    public f5 f27277f;
    public org.telegram.messenger.g6 h;
    public boolean f27278n;
    public float f27279r;
    public float f27280s;
    public boolean f27281w;

    public j5(View view, boolean z10) {
        this.f27274a = new WeakReference(view);
        this.f27275b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f27274a.get();
        if (view == null) {
            return;
        }
        if (this.f27275b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
