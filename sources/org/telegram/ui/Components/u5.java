package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final View f30837a;
    public final boolean f30838b;
    public Layout f30839c;
    public z5 d;
    public Rect f30840e;
    public q5 f30841f;
    public Emoji.EmojiDrawable h;
    public boolean f30842n;
    public float f30843r;
    public float f30844s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f30837a = view;
        this.f30838b = z10;
    }

    @Override
    public final void invalidate() {
        View view = this.f30837a;
        if (view != null) {
            if (this.f30838b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
