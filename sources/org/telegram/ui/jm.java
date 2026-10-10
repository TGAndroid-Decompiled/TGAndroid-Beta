package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class jm extends org.telegram.ui.Components.t6 {
    public final lm f39025b;

    public jm(lm lmVar) {
        super("progress", 0);
        this.f39025b = lmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f39025b.f39676b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
