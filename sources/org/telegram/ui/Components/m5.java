package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class m5 implements o5 {
    public final WeakReference f35895a;
    public final boolean f35896b;
    public Layout f35897c;
    public r5 d;
    public Rect f35898e;
    public i5 f35899f;
    public org.telegram.messenger.e6 h;
    public boolean f35900n;
    public float f35901r;
    public float f35902s;
    public boolean f35903w;

    public m5(View view, boolean z9) {
        this.f35895a = new WeakReference(view);
        this.f35896b = z9;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f35895a.get();
        if (view == null) {
            return;
        }
        if (this.f35896b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
