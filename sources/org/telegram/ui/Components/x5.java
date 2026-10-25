package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class x5 implements z5 {
    public final WeakReference f34620a;
    public final boolean f34621b;
    public Layout f34622c;
    public c6 d;
    public Rect e;
    public t5 f34623f;
    public Emoji.EmojiDrawable h;
    public boolean f34624n;
    public float f34625r;
    public float f34626s;
    public boolean v;

    public x5(View view, boolean z10) {
        this.f34620a = new WeakReference(view);
        this.f34621b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f34620a.get();
        if (view == null) {
            return;
        }
        if (this.f34621b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
