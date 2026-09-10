package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class nm extends org.telegram.ui.Components.q6 {
    public final om f35305b;

    public nm(om omVar) {
        super("alpha", 0);
        this.f35305b = omVar;
    }

    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f35305b.f35513b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
