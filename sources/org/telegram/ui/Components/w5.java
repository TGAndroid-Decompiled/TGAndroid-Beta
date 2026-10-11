package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class w5 implements y5 {
    public final WeakReference f32576a;
    public final boolean f32577b;
    public Layout f32578c;
    public b6 d;
    public Rect f32579e;
    public s5 f32580f;
    public Emoji.EmojiDrawable h;
    public boolean f32581n;
    public float f32582r;
    public float f32583s;
    public boolean v;

    public w5(View view, boolean z10) {
        this.f32576a = new WeakReference(view);
        this.f32577b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f32576a.get();
        if (view == null) {
            return;
        }
        if (this.f32577b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
