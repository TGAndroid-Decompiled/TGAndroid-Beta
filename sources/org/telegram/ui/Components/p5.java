package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class p5 implements r5 {
    public final View f27733a;
    public final boolean f27734b;
    public Layout f27735c;
    public u5 d;
    public Rect e;
    public l5 f27736f;
    public Emoji.EmojiDrawable h;
    public boolean f27737n;
    public float f27738r;
    public float f27739s;
    public boolean v;

    public p5(View view, boolean z4) {
        this.f27733a = view;
        this.f27734b = z4;
    }

    @Override
    public final void invalidate() {
        View view = this.f27733a;
        if (view != null) {
            if (this.f27734b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
