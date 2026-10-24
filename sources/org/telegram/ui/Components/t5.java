package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class t5 implements v5 {
    public final WeakReference f30724a;
    public final boolean f30725b;
    public Layout f30726c;
    public y5 d;
    public Rect e;
    public p5 f30727f;
    public Emoji.EmojiDrawable h;
    public boolean f30728n;
    public float f30729r;
    public float f30730s;
    public boolean v;

    public t5(View view, boolean z10) {
        this.f30724a = new WeakReference(view);
        this.f30725b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f30724a.get();
        if (view == null) {
            return;
        }
        if (this.f30725b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
