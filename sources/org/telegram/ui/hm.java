package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class hm extends org.telegram.ui.Components.r6 {
    public final jm f33885b;

    public hm(jm jmVar) {
        super("progress", 0);
        this.f33885b = jmVar;
    }

    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f33885b.f34476b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
