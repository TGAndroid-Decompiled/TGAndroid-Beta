package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f31295a;
    public final boolean f31296b;
    public Layout f31297c;
    public z5 d;
    public Rect f31298e;
    public q5 f31299f;
    public Emoji.EmojiDrawable h;
    public boolean f31300n;
    public float f31301r;
    public float f31302s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f31295a = new WeakReference(view);
        this.f31296b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f31295a.get();
        if (view == null) {
            return;
        }
        if (this.f31296b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
