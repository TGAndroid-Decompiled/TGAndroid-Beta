package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f28700a;
    public final boolean f28701b;
    public Layout f28702c;
    public z5 d;
    public Rect e;
    public q5 f28703f;
    public Emoji.EmojiDrawable h;
    public boolean f28704n;
    public float f28705r;
    public float f28706s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f28700a = new WeakReference(view);
        this.f28701b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f28700a.get();
        if (view == null) {
            return;
        }
        if (this.f28701b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
