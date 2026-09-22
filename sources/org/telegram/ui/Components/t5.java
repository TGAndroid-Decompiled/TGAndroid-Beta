package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class t5 implements v5 {
    public final WeakReference f28390a;
    public final boolean f28391b;
    public Layout f28392c;
    public y5 d;
    public Rect e;
    public p5 f28393f;
    public Emoji.EmojiDrawable h;
    public boolean f28394n;
    public float f28395r;
    public float f28396s;
    public boolean v;

    public t5(View view, boolean z10) {
        this.f28390a = new WeakReference(view);
        this.f28391b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f28390a.get();
        if (view == null) {
            return;
        }
        if (this.f28391b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
