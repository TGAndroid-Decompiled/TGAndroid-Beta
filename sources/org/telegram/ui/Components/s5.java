package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class s5 implements u5 {
    public final View f27771a;
    public final boolean f27772b;
    public Layout f27773c;
    public x5 d;
    public Rect e;
    public o5 f27774f;
    public Emoji.EmojiDrawable h;
    public boolean f27775n;
    public float f27776r;
    public float f27777s;
    public boolean v;

    public s5(View view, boolean z10) {
        this.f27771a = view;
        this.f27772b = z10;
    }

    @Override
    public final void invalidate() {
        View view = this.f27771a;
        if (view != null) {
            if (this.f27772b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
