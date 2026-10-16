package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class pm extends org.telegram.ui.Components.u6 {
    public final qm f38974b;

    public pm(qm qmVar) {
        super("alpha", 0);
        this.f38974b = qmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f38974b.f39186b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
