package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class u5 implements w5 {
    public final WeakReference f28754a;
    public final boolean f28755b;
    public Layout f28756c;
    public z5 d;
    public Rect e;
    public q5 f28757f;
    public Emoji.EmojiDrawable h;
    public boolean f28758n;
    public float f28759r;
    public float f28760s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.f28754a = new WeakReference(view);
        this.f28755b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f28754a.get();
        if (view == null) {
            return;
        }
        if (this.f28755b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
