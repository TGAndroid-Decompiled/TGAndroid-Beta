package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final View f30838a;
    public final boolean f30839b;
    public Layout f30840c;
    public z5 d;
    public Rect f30841e;
    public q5 f30842f;
    public Emoji.EmojiDrawable h;
    public boolean f30843n;
    public float f30844r;
    public float f30845s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f30838a = view;
        this.f30839b = z10;
    }

    @Override
    public final void invalidate() {
        View view = this.f30838a;
        if (view != null) {
            if (this.f30839b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
