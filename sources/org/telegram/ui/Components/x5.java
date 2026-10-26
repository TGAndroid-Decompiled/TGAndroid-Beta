package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class x5 implements z5 {
    public final WeakReference f34623a;
    public final boolean f34624b;
    public Layout f34625c;
    public c6 d;
    public Rect e;
    public t5 f34626f;
    public Emoji.EmojiDrawable h;
    public boolean f34627n;
    public float f34628r;
    public float f34629s;
    public boolean v;

    public x5(View view, boolean z10) {
        this.f34623a = new WeakReference(view);
        this.f34624b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f34623a.get();
        if (view == null) {
            return;
        }
        if (this.f34624b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
