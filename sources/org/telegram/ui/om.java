package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class om extends org.telegram.ui.Components.u6 {
    public final qm f38702b;

    public om(qm qmVar) {
        super("progress", 0);
        this.f38702b = qmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f38702b.f39186b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
