package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class t5 implements v5 {
    public final View f32869a;
    public final boolean f32870b;
    public Layout f32871c;
    public y5 d;
    public Rect f32872e;
    public p5 f32873f;
    public Emoji.EmojiDrawable h;
    public boolean f32874n;
    public float f32875r;
    public float f32876s;
    public boolean v;

    public t5(View view, boolean z10) {
        this.f32869a = view;
        this.f32870b = z10;
    }

    @Override
    public final void invalidate() {
        View view = this.f32869a;
        if (view != null) {
            if (this.f32870b && view.getParent() != null) {
                ((View) view.getParent()).invalidate();
            } else {
                view.invalidate();
            }
        }
    }
}
