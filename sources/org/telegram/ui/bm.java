package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class bm extends org.telegram.ui.Components.u6 {
    public final em f38119b;

    public bm(em emVar) {
        super("p2", 0);
        this.f38119b = emVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f38119b.f39137b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
