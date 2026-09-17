package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final View f30811a;
    public final boolean f30812b;
    public Layout f30813c;
    public z5 d;
    public Rect f30814e;
    public q5 f30815f;
    public Emoji.EmojiDrawable h;
    public boolean f30816n;
    public float f30817r;
    public float f30818s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f30811a = view;
        this.f30812b = z10;
    }

    @Override
    public final void invalidate() {
        View view = this.f30811a;
        if (view != null) {
            if (this.f30812b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
