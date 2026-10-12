package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class pm extends org.telegram.ui.Components.u6 {
    public final qm f39262b;

    public pm(qm qmVar) {
        super("alpha", 0);
        this.f39262b = qmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f39262b.f39495b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
