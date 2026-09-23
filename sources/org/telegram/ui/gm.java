package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class gm extends org.telegram.ui.Components.r6 {
    public final jm f33589b;

    public gm(jm jmVar) {
        super("p2", 0);
        this.f33589b = jmVar;
    }

    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f33589b.f34476b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
