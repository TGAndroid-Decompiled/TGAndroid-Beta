package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class s5 implements u5 {
    public final WeakReference f27768a;
    public final boolean f27769b;
    public Layout f27770c;
    public x5 d;
    public Rect e;
    public o5 f27771f;
    public Emoji.EmojiDrawable h;
    public boolean f27772n;
    public float f27773r;
    public float f27774s;
    public boolean v;

    public s5(View view, boolean z10) {
        this.f27768a = new WeakReference(view);
        this.f27769b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f27768a.get();
        if (view == null) {
            return;
        }
        if (this.f27769b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
