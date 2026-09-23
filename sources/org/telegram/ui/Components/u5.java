package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f28410a;
    public final boolean f28411b;
    public Layout f28412c;
    public z5 d;
    public Rect e;
    public q5 f28413f;
    public Emoji.EmojiDrawable h;
    public boolean f28414n;
    public float f28415r;
    public float f28416s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f28410a = new WeakReference(view);
        this.f28411b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f28410a.get();
        if (view == null) {
            return;
        }
        if (this.f28411b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
