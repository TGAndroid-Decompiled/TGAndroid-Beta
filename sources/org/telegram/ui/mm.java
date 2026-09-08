package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class mm extends org.telegram.ui.Components.s6 {
    public final nm f38760b;

    public mm(nm nmVar) {
        super("alpha", 0);
        this.f38760b = nmVar;
    }

    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f38760b.f39011b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
