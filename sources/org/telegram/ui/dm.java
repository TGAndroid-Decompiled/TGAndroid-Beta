package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class dm extends org.telegram.ui.Components.s6 {
    public final em f36218b;

    public dm(em emVar) {
        super("alpha", 0);
        this.f36218b = emVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f36218b.f36555b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
