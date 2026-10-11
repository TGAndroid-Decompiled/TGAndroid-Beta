package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class w5 implements y5 {
    public final WeakReference f32630a;
    public final boolean f32631b;
    public Layout f32632c;
    public b6 d;
    public Rect f32633e;
    public s5 f32634f;
    public Emoji.EmojiDrawable h;
    public boolean f32635n;
    public float f32636r;
    public float f32637s;
    public boolean v;

    public w5(View view, boolean z10) {
        this.f32630a = new WeakReference(view);
        this.f32631b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f32630a.get();
        if (view == null) {
            return;
        }
        if (this.f32631b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
