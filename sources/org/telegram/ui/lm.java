package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class lm extends org.telegram.ui.Components.q6 {
    public final om f34739b;

    public lm(om omVar) {
        super("p2", 0);
        this.f34739b = omVar;
    }

    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f34739b.f35513b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
