package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class hm extends org.telegram.ui.Components.m6 {
    public final im f37412b;

    public hm(im imVar) {
        super("alpha", 0);
        this.f37412b = imVar;
    }

    @Override
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f10;
        View view = this.f37412b.f37743b.N.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
