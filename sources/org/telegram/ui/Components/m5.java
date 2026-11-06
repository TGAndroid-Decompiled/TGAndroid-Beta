package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class m5 implements o5 {
    public final WeakReference f35860a;
    public final boolean f35861b;
    public Layout f35862c;
    public r5 d;
    public Rect f35863e;
    public i5 f35864f;
    public org.telegram.messenger.e6 h;
    public boolean f35865n;
    public float f35866r;
    public float f35867s;
    public boolean f35868w;

    public m5(View view, boolean z9) {
        this.f35860a = new WeakReference(view);
        this.f35861b = z9;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f35860a.get();
        if (view == null) {
            return;
        }
        if (this.f35861b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
