package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class om extends org.telegram.ui.Components.u6 {
    public final qm f39006b;

    public om(qm qmVar) {
        super("progress", 0);
        this.f39006b = qmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f39006b.f39495b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
