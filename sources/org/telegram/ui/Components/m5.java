package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class m5 implements o5 {
    public final WeakReference f35950a;
    public final boolean f35951b;
    public Layout f35952c;
    public r5 d;
    public Rect f35953e;
    public i5 f35954f;
    public org.telegram.messenger.e6 h;
    public boolean f35955n;
    public float f35956r;
    public float f35957s;
    public boolean f35958w;

    public m5(View view, boolean z9) {
        this.f35950a = new WeakReference(view);
        this.f35951b = z9;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f35950a.get();
        if (view == null) {
            return;
        }
        if (this.f35951b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
