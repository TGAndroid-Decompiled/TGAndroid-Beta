package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class km extends org.telegram.ui.Components.t6 {
    public final lm f39314b;

    public km(lm lmVar) {
        super("alpha", 0);
        this.f39314b = lmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f39314b.f39630b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
