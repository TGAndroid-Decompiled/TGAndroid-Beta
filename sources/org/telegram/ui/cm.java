package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class cm extends org.telegram.ui.Components.q6 {
    public final dm f36370b;

    public cm(dm dmVar) {
        super("alpha", 0);
        this.f36370b = dmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f36370b.f36647b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
