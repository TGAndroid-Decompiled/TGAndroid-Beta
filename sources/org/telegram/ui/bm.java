package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class bm extends org.telegram.ui.Components.s6 {
    public final em f35708b;

    public bm(em emVar) {
        super("p2", 0);
        this.f35708b = emVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f35708b.f36567b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
