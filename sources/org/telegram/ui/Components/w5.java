package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class w5 implements y5 {
    public final WeakReference f30473a;
    public final boolean f30474b;
    public Layout f30475c;
    public b6 d;
    public Rect e;
    public s5 f30476f;
    public Emoji.EmojiDrawable h;
    public boolean f30477n;
    public float f30478r;
    public float f30479s;
    public boolean v;

    public w5(View view, boolean z10) {
        this.f30473a = new WeakReference(view);
        this.f30474b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f30473a.get();
        if (view == null) {
            return;
        }
        if (this.f30474b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
