package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class s5 implements u5 {
    public final View f27766a;
    public final boolean f27767b;
    public Layout f27768c;
    public x5 d;
    public Rect e;
    public o5 f27769f;
    public Emoji.EmojiDrawable h;
    public boolean f27770n;
    public float f27771r;
    public float f27772s;
    public boolean v;

    public s5(View view, boolean z10) {
        this.f27766a = view;
        this.f27767b = z10;
    }

    @Override
    public final void invalidate() {
        View view = this.f27766a;
        if (view != null) {
            if (this.f27767b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
