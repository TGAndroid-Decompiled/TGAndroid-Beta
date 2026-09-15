package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class lm extends org.telegram.ui.Components.p6 {
    public final mm f35531b;

    public lm(mm mmVar) {
        super("alpha", 0);
        this.f35531b = mmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f35531b.f35772b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
