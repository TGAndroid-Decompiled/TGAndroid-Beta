package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class w5 implements y5 {
    public final WeakReference f30798a;
    public final boolean f30799b;
    public Layout f30800c;
    public b6 d;
    public Rect e;
    public s5 f30801f;
    public Emoji.EmojiDrawable h;
    public boolean f30802n;
    public float f30803r;
    public float f30804s;
    public boolean v;

    public w5(View view, boolean z10) {
        this.f30798a = new WeakReference(view);
        this.f30799b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f30798a.get();
        if (view == null) {
            return;
        }
        if (this.f30799b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
