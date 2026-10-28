package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class em extends org.telegram.ui.Components.u6 {
    public final gm f38909b;

    public em(gm gmVar) {
        super("progress", 0);
        this.f38909b = gmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f38909b.f39647b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
