package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;
public final class v5 implements x5 {
    public final WeakReference f31174a;
    public final boolean f31175b;
    public Layout f31176c;
    public a6 d;
    public Rect e;
    public r5 f31177f;
    public Emoji.EmojiDrawable h;
    public boolean f31178n;
    public float f31179r;
    public float f31180s;
    public boolean v;

    public v5(View view, boolean z10) {
        this.f31174a = new WeakReference(view);
        this.f31175b = z10;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.f31174a.get();
        if (view == null) {
            return;
        }
        if (this.f31175b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
