package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class v5 implements x5 {
    public final WeakReference f31355a;
    public final boolean f31356b;
    public Layout f31357c;
    public a6 d;
    public Rect e;
    public r5 f31358f;
    public Emoji.EmojiDrawable h;
    public boolean f31359n;
    public float f31360r;
    public float f31361s;
    public boolean v;

    public v5(View view, boolean z10) {
        this.f31355a = new WeakReference(view);
        this.f31356b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f31355a.get();
        if (view == null) {
            return;
        }
        if (this.f31356b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
