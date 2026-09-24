package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f28687a;
    public final boolean f28688b;
    public Layout f28689c;
    public z5 d;
    public Rect e;
    public q5 f28690f;
    public Emoji.EmojiDrawable h;
    public boolean f28691n;
    public float f28692r;
    public float f28693s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f28687a = new WeakReference(view);
        this.f28688b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f28687a.get();
        if (view == null) {
            return;
        }
        if (this.f28688b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
