package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class w5 implements y5 {
    public final WeakReference f32264a;
    public final boolean f32265b;
    public Layout f32266c;
    public b6 d;
    public Rect f32267e;
    public s5 f32268f;
    public Emoji.EmojiDrawable h;
    public boolean f32269n;
    public float f32270r;
    public float f32271s;
    public boolean v;

    public w5(View view, boolean z10) {
        this.f32264a = new WeakReference(view);
        this.f32265b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f32264a.get();
        if (view == null) {
            return;
        }
        if (this.f32265b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
