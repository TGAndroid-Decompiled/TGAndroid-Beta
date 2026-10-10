package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class w5 implements y5 {
    public final WeakReference f32593a;
    public final boolean f32594b;
    public Layout f32595c;
    public b6 d;
    public Rect f32596e;
    public s5 f32597f;
    public Emoji.EmojiDrawable h;
    public boolean f32598n;
    public float f32599r;
    public float f32600s;
    public boolean v;

    public w5(View view, boolean z10) {
        this.f32593a = new WeakReference(view);
        this.f32594b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f32593a.get();
        if (view == null) {
            return;
        }
        if (this.f32594b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
