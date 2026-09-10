package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class mm extends org.telegram.ui.Components.q6 {
    public final om f35001b;

    public mm(om omVar) {
        super("progress", 0);
        this.f35001b = omVar;
    }

    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f35001b.f35513b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
