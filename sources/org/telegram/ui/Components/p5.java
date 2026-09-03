package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class p5 implements r5 {
    public final View f29979a;
    public final boolean f29980b;
    public Layout f29981c;
    public u5 d;
    public Rect f29982e;
    public l5 f29983f;
    public Emoji.EmojiDrawable h;
    public boolean f29984n;
    public float f29985r;
    public float f29986s;
    public boolean v;

    public p5(View view, boolean z4) {
        this.f29979a = view;
        this.f29980b = z4;
    }

    @Override
    public final void invalidate() {
        View view = this.f29979a;
        if (view != null) {
            if (this.f29980b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
