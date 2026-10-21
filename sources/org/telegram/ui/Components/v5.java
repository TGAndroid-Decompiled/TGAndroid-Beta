package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class v5 implements x5 {
    public final WeakReference f31151a;
    public final boolean f31152b;
    public Layout f31153c;
    public a6 d;
    public Rect e;
    public r5 f31154f;
    public Emoji.EmojiDrawable h;
    public boolean f31155n;
    public float f31156r;
    public float f31157s;
    public boolean v;

    public v5(View view, boolean z10) {
        this.f31151a = new WeakReference(view);
        this.f31152b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f31151a.get();
        if (view == null) {
            return;
        }
        if (this.f31152b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
