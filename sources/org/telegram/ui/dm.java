package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class dm extends org.telegram.ui.Components.s6 {
    public final em f36234b;

    public dm(em emVar) {
        super("alpha", 0);
        this.f36234b = emVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f36234b.f36567b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
