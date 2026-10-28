package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class dm extends org.telegram.ui.Components.u6 {
    public final gm f38639b;

    public dm(gm gmVar) {
        super("p2", 0);
        this.f38639b = gmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f38639b.f39647b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
