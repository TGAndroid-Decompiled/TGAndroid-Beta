package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class p5 implements r5 {
    public final View f29961a;
    public final boolean f29962b;
    public Layout f29963c;
    public u5 d;
    public Rect f29964e;
    public l5 f29965f;
    public Emoji.EmojiDrawable h;
    public boolean f29966n;
    public float f29967r;
    public float f29968s;
    public boolean v;

    public p5(View view, boolean z4) {
        this.f29961a = view;
        this.f29962b = z4;
    }

    @Override
    public final void invalidate() {
        View view = this.f29961a;
        if (view != null) {
            if (this.f29962b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
