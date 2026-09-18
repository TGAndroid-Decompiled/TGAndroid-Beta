package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class s5 implements u5 {
    public final WeakReference f27769a;
    public final boolean f27770b;
    public Layout f27771c;
    public x5 d;
    public Rect e;
    public o5 f27772f;
    public Emoji.EmojiDrawable h;
    public boolean f27773n;
    public float f27774r;
    public float f27775s;
    public boolean v;

    public s5(View view, boolean z10) {
        this.f27769a = new WeakReference(view);
        this.f27770b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f27769a.get();
        if (view == null) {
            return;
        }
        if (this.f27770b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
