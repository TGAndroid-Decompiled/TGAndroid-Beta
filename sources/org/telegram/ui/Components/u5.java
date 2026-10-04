package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f31289a;
    public final boolean f31290b;
    public Layout f31291c;
    public z5 d;
    public Rect f31292e;
    public q5 f31293f;
    public Emoji.EmojiDrawable h;
    public boolean f31294n;
    public float f31295r;
    public float f31296s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f31289a = new WeakReference(view);
        this.f31290b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f31289a.get();
        if (view == null) {
            return;
        }
        if (this.f31290b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
