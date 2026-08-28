package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class o5 implements q5 {
    public final View f31287a;
    public final boolean f31288b;
    public Layout f31289c;
    public t5 d;
    public Rect f31290e;
    public k5 f31291f;
    public Emoji.EmojiDrawable h;
    public boolean f31292n;
    public float f31293r;
    public float f31294s;
    public boolean v;

    public o5(View view, boolean z10) {
        this.f31287a = view;
        this.f31288b = z10;
    }

    @Override
    public final void invalidate() {
        View view = this.f31287a;
        if (view != null) {
            if (this.f31288b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
