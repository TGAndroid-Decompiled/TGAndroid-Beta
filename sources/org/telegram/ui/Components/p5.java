package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class p5 implements r5 {
    public final View f27739a;
    public final boolean f27740b;
    public Layout f27741c;
    public u5 d;
    public Rect e;
    public l5 f27742f;
    public Emoji.EmojiDrawable h;
    public boolean f27743n;
    public float f27744r;
    public float f27745s;
    public boolean v;

    public p5(View view, boolean z4) {
        this.f27739a = view;
        this.f27740b = z4;
    }

    @Override
    public final void invalidate() {
        View view = this.f27739a;
        if (view != null) {
            if (this.f27740b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
