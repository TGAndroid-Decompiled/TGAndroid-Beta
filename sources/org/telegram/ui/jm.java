package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class jm extends org.telegram.ui.Components.t6 {
    public final lm f38979b;

    public jm(lm lmVar) {
        super("progress", 0);
        this.f38979b = lmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f38979b.f39630b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
