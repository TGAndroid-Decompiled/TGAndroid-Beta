package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class t5 implements v5 {
    public final View f27327a;
    public final boolean f27328b;
    public Layout f27329c;
    public y5 d;
    public Rect e;
    public p5 f27330f;
    public Emoji.EmojiDrawable h;
    public boolean f27331n;
    public float f27332r;
    public float f27333s;
    public boolean v;

    public t5(View view, boolean z10) {
        this.f27327a = view;
        this.f27328b = z10;
    }

    @Override
    public final void invalidate() {
        View view = this.f27327a;
        if (view != null) {
            if (this.f27328b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
