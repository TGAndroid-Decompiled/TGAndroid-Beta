package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

public final class bm extends org.telegram.ui.Components.l6 {

    public final cm f36851b;

    public bm(cm cmVar) {
        super("alpha", 0);
        this.f36851b = cmVar;
    }

    @Override
    public final void c(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f10;
        View view = this.f36851b.f37115b.M.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
