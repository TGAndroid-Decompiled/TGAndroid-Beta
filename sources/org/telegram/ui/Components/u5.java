package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final View f30810a;
    public final boolean f30811b;
    public Layout f30812c;
    public z5 d;
    public Rect f30813e;
    public q5 f30814f;
    public Emoji.EmojiDrawable h;
    public boolean f30815n;
    public float f30816r;
    public float f30817s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f30810a = view;
        this.f30811b = z10;
    }

    @Override
    public final void invalidate() {
        View view = this.f30810a;
        if (view != null) {
            if (this.f30811b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
