package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class hm extends org.telegram.ui.Components.q6 {
    public final km f34238b;

    public hm(km kmVar) {
        super("p2", 0);
        this.f34238b = kmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f34238b.f35210b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
