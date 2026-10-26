package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class dm extends org.telegram.ui.Components.u6 {
    public final em f38907b;

    public dm(em emVar) {
        super("alpha", 0);
        this.f38907b = emVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f38907b.f39137b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
