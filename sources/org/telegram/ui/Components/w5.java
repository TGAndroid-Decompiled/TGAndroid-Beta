package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class w5 implements y5 {
    public final WeakReference f32545a;
    public final boolean f32546b;
    public Layout f32547c;
    public b6 d;
    public Rect f32548e;
    public s5 f32549f;
    public Emoji.EmojiDrawable h;
    public boolean f32550n;
    public float f32551r;
    public float f32552s;
    public boolean v;

    public w5(View view, boolean z10) {
        this.f32545a = new WeakReference(view);
        this.f32546b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f32545a.get();
        if (view == null) {
            return;
        }
        if (this.f32546b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
