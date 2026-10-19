package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class v5 implements x5 {
    public final WeakReference f31155a;
    public final boolean f31156b;
    public Layout f31157c;
    public a6 d;
    public Rect e;
    public r5 f31158f;
    public Emoji.EmojiDrawable h;
    public boolean f31159n;
    public float f31160r;
    public float f31161s;
    public boolean v;

    public v5(View view, boolean z10) {
        this.f31155a = new WeakReference(view);
        this.f31156b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f31155a.get();
        if (view == null) {
            return;
        }
        if (this.f31156b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
