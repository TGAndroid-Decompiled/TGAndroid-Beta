package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class cm extends org.telegram.ui.Components.u6 {
    public final em f38498b;

    public cm(em emVar) {
        super("progress", 0);
        this.f38498b = emVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f38498b.f39137b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
