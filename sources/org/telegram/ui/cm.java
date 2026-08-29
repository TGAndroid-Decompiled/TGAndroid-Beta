package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class cm extends org.telegram.ui.Components.q6 {
    public final dm f37177b;

    public cm(dm dmVar) {
        super("alpha", 0);
        this.f37177b = dmVar;
    }

    @Override
    public final void b(Object obj, float f9) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f9;
        View view = this.f37177b.f37560b.M.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
