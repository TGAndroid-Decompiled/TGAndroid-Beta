package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f28799a;
    public final boolean f28800b;
    public Layout f28801c;
    public z5 d;
    public Rect e;
    public q5 f28802f;
    public Emoji.EmojiDrawable h;
    public boolean f28803n;
    public float f28804r;
    public float f28805s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f28799a = new WeakReference(view);
        this.f28800b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f28799a.get();
        if (view == null) {
            return;
        }
        if (this.f28800b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
