package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f31347a;
    public final boolean f31348b;
    public Layout f31349c;
    public z5 d;
    public Rect f31350e;
    public q5 f31351f;
    public Emoji.EmojiDrawable h;
    public boolean f31352n;
    public float f31353r;
    public float f31354s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f31347a = new WeakReference(view);
        this.f31348b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f31347a.get();
        if (view == null) {
            return;
        }
        if (this.f31348b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
