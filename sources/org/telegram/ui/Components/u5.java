package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f31288a;
    public final boolean f31289b;
    public Layout f31290c;
    public z5 d;
    public Rect f31291e;
    public q5 f31292f;
    public Emoji.EmojiDrawable h;
    public boolean f31293n;
    public float f31294r;
    public float f31295s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f31288a = new WeakReference(view);
        this.f31289b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f31288a.get();
        if (view == null) {
            return;
        }
        if (this.f31289b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
