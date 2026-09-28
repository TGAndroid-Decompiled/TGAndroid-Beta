package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f28739a;
    public final boolean f28740b;
    public Layout f28741c;
    public z5 d;
    public Rect e;
    public q5 f28742f;
    public Emoji.EmojiDrawable h;
    public boolean f28743n;
    public float f28744r;
    public float f28745s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f28739a = new WeakReference(view);
        this.f28740b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f28739a.get();
        if (view == null) {
            return;
        }
        if (this.f28740b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
