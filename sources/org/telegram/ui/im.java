package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class im extends org.telegram.ui.Components.r6 {
    public final jm f34502b;

    public im(jm jmVar) {
        super("alpha", 0);
        this.f34502b = jmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f34502b.f34762b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
