package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class km extends org.telegram.ui.Components.p6 {
    public final mm f35192b;

    public km(mm mmVar) {
        super("progress", 0);
        this.f35192b = mmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f35192b.f35772b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
