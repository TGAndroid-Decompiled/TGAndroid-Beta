package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class km extends org.telegram.ui.Components.s6 {
    public final nm f38090b;

    public km(nm nmVar) {
        super("p2", 0);
        this.f38090b = nmVar;
    }

    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f38090b.f38984b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
