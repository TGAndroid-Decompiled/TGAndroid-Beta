package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f28701a;
    public final boolean f28702b;
    public Layout f28703c;
    public z5 d;
    public Rect e;
    public q5 f28704f;
    public Emoji.EmojiDrawable h;
    public boolean f28705n;
    public float f28706r;
    public float f28707s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f28701a = new WeakReference(view);
        this.f28702b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f28701a.get();
        if (view == null) {
            return;
        }
        if (this.f28702b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
