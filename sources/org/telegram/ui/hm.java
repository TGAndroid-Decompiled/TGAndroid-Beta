package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class hm extends org.telegram.ui.Components.m6 {
    public final im f34914b;

    public hm(im imVar) {
        super("alpha", 0);
        this.f34914b = imVar;
    }

    @Override
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f10;
        View view = this.f34914b.f35139b.N.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
