package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;

public final class o5 implements q5 {

    public final View f31156a;

    public final boolean f31157b;

    public Layout f31158c;
    public t5 d;

    public Rect f31159e;

    public k5 f31160f;
    public Emoji.EmojiDrawable h;

    public boolean f31161n;

    public float f31162r;

    public float f31163s;
    public boolean v;

    public o5(View view, boolean z10) {
        this.f31156a = view;
        this.f31157b = z10;
    }

    @Override
    public final void invalidate() {
        View view = this.f31156a;
        if (view != null) {
            if (!this.f31157b || view.getParent() == null) {
                view.invalidate();
            } else {
                ((View) view.getParent()).invalidate();
            }
        }
    }
}
