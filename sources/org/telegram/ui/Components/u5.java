package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f28707a;
    public final boolean f28708b;
    public Layout f28709c;
    public z5 d;
    public Rect e;
    public q5 f28710f;
    public Emoji.EmojiDrawable h;
    public boolean f28711n;
    public float f28712r;
    public float f28713s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f28707a = new WeakReference(view);
        this.f28708b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f28707a.get();
        if (view == null) {
            return;
        }
        if (this.f28708b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
