package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class im extends org.telegram.ui.Components.t6 {
    public final lm f38698b;

    public im(lm lmVar) {
        super("p2", 0);
        this.f38698b = lmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f38698b.f39630b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
