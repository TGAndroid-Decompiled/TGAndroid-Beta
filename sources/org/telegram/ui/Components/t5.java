package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class t5 implements v5 {
    public final WeakReference f39764a;
    public final boolean f39765b;
    public Layout f39766c;
    public y5 d;
    public Rect f39767e;
    public p5 f39768f;
    public org.telegram.messenger.f6 h;
    public boolean f39769n;
    public float f39770r;
    public float f39771s;
    public boolean f39772w;

    public t5(View view, boolean z10) {
        this.f39764a = new WeakReference(view);
        this.f39765b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f39764a.get();
        if (view == null) {
            return;
        }
        if (this.f39765b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
