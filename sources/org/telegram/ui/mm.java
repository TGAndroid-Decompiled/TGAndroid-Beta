package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class mm extends org.telegram.ui.Components.s6 {
    public final nm f38733b;

    public mm(nm nmVar) {
        super("alpha", 0);
        this.f38733b = nmVar;
    }

    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f38733b.f38984b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
