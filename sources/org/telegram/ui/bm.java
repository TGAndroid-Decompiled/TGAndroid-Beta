package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class bm extends org.telegram.ui.Components.u6 {
    public final em f38116b;

    public bm(em emVar) {
        super("p2", 0);
        this.f38116b = emVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f38116b.f39134b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
