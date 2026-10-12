package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class mm extends org.telegram.ui.Components.t6 {
    public final pm f40092b;

    public mm(pm pmVar) {
        super("p2", 0);
        this.f40092b = pmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f40092b.f40994b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
