package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class t5 implements v5 {
    public final WeakReference f28290a;
    public final boolean f28291b;
    public Layout f28292c;
    public y5 d;
    public Rect e;
    public p5 f28293f;
    public Emoji.EmojiDrawable h;
    public boolean f28294n;
    public float f28295r;
    public float f28296s;
    public boolean v;

    public t5(View view, boolean z10) {
        this.f28290a = new WeakReference(view);
        this.f28291b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f28290a.get();
        if (view == null) {
            return;
        }
        if (this.f28291b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
