package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class v5 implements x5 {
    public final WeakReference f31154a;
    public final boolean f31155b;
    public Layout f31156c;
    public a6 d;
    public Rect e;
    public r5 f31157f;
    public Emoji.EmojiDrawable h;
    public boolean f31158n;
    public float f31159r;
    public float f31160s;
    public boolean v;

    public v5(View view, boolean z10) {
        this.f31154a = new WeakReference(view);
        this.f31155b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f31154a.get();
        if (view == null) {
            return;
        }
        if (this.f31155b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
