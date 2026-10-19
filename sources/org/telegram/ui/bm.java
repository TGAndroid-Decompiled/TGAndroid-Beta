package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class bm extends org.telegram.ui.Components.s6 {
    public final cm f35664b;

    public bm(cm cmVar) {
        super("alpha", 0);
        this.f35664b = cmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f35664b.f36002b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
