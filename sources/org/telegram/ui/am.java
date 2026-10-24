package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class am extends org.telegram.ui.Components.q6 {
    public final dm f35801b;

    public am(dm dmVar) {
        super("p2", 0);
        this.f35801b = dmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f35801b.f36647b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
