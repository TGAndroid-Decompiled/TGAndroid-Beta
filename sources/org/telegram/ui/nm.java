package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class nm extends org.telegram.ui.Components.u6 {
    public final qm f38424b;

    public nm(qm qmVar) {
        super("p2", 0);
        this.f38424b = qmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f38424b.f39186b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
