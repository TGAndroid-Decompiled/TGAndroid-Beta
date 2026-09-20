package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class jm extends org.telegram.ui.Components.q6 {
    public final km f34957b;

    public jm(km kmVar) {
        super("alpha", 0);
        this.f34957b = kmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f34957b.f35210b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
