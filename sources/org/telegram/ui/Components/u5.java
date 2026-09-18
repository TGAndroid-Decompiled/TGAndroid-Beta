package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f28571a;
    public final boolean f28572b;
    public Layout f28573c;
    public z5 d;
    public Rect e;
    public q5 f28574f;
    public Emoji.EmojiDrawable h;
    public boolean f28575n;
    public float f28576r;
    public float f28577s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f28571a = new WeakReference(view);
        this.f28572b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f28571a.get();
        if (view == null) {
            return;
        }
        if (this.f28572b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
