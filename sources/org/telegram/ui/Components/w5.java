package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class w5 implements y5 {
    public final WeakReference f32250a;
    public final boolean f32251b;
    public Layout f32252c;
    public b6 d;
    public Rect f32253e;
    public s5 f32254f;
    public Emoji.EmojiDrawable h;
    public boolean f32255n;
    public float f32256r;
    public float f32257s;
    public boolean v;

    public w5(View view, boolean z10) {
        this.f32250a = new WeakReference(view);
        this.f32251b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f32250a.get();
        if (view == null) {
            return;
        }
        if (this.f32251b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
