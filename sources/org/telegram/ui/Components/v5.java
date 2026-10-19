package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class v5 implements x5 {
    public final WeakReference f31153a;
    public final boolean f31154b;
    public Layout f31155c;
    public a6 d;
    public Rect e;
    public r5 f31156f;
    public Emoji.EmojiDrawable h;
    public boolean f31157n;
    public float f31158r;
    public float f31159s;
    public boolean v;

    public v5(View view, boolean z10) {
        this.f31153a = new WeakReference(view);
        this.f31154b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f31153a.get();
        if (view == null) {
            return;
        }
        if (this.f31154b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
