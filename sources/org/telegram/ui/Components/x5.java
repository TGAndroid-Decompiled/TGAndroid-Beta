package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class x5 implements z5 {
    public final WeakReference f34670a;
    public final boolean f34671b;
    public Layout f34672c;
    public c6 d;
    public Rect e;
    public t5 f34673f;
    public Emoji.EmojiDrawable h;
    public boolean f34674n;
    public float f34675r;
    public float f34676s;
    public boolean v;

    public x5(View view, boolean z10) {
        this.f34670a = new WeakReference(view);
        this.f34671b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f34670a.get();
        if (view == null) {
            return;
        }
        if (this.f34671b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
