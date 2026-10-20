package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class v5 implements x5 {
    public final WeakReference f31150a;
    public final boolean f31151b;
    public Layout f31152c;
    public a6 d;
    public Rect e;
    public r5 f31153f;
    public Emoji.EmojiDrawable h;
    public boolean f31154n;
    public float f31155r;
    public float f31156s;
    public boolean v;

    public v5(View view, boolean z10) {
        this.f31150a = new WeakReference(view);
        this.f31151b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f31150a.get();
        if (view == null) {
            return;
        }
        if (this.f31151b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
