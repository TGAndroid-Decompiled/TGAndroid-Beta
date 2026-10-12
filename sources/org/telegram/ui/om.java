package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class om extends org.telegram.ui.Components.t6 {
    public final pm f40744b;

    public om(pm pmVar) {
        super("alpha", 0);
        this.f40744b = pmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f40744b.f40996b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
