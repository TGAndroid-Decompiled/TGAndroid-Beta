package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class v5 implements x5 {
    public final WeakReference f31181a;
    public final boolean f31182b;
    public Layout f31183c;
    public a6 d;
    public Rect e;
    public r5 f31184f;
    public Emoji.EmojiDrawable h;
    public boolean f31185n;
    public float f31186r;
    public float f31187s;
    public boolean v;

    public v5(View view, boolean z10) {
        this.f31181a = new WeakReference(view);
        this.f31182b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f31181a.get();
        if (view == null) {
            return;
        }
        if (this.f31182b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
