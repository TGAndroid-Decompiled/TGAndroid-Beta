package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class m5 implements o5 {
    public final WeakReference f35888a;
    public final boolean f35889b;
    public Layout f35890c;
    public r5 d;
    public Rect f35891e;
    public i5 f35892f;
    public org.telegram.messenger.e6 h;
    public boolean f35893n;
    public float f35894r;
    public float f35895s;
    public boolean f35896w;

    public m5(View view, boolean z9) {
        this.f35888a = new WeakReference(view);
        this.f35889b = z9;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f35888a.get();
        if (view == null) {
            return;
        }
        if (this.f35889b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
