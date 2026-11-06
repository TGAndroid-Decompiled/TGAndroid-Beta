package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class m5 implements o5 {
    public final WeakReference f35847a;
    public final boolean f35848b;
    public Layout f35849c;
    public r5 d;
    public Rect f35850e;
    public i5 f35851f;
    public org.telegram.messenger.e6 h;
    public boolean f35852n;
    public float f35853r;
    public float f35854s;
    public boolean f35855w;

    public m5(View view, boolean z9) {
        this.f35847a = new WeakReference(view);
        this.f35848b = z9;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f35847a.get();
        if (view == null) {
            return;
        }
        if (this.f35848b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
