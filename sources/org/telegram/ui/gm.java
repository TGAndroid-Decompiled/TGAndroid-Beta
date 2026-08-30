package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class gm extends org.telegram.ui.Components.m6 {
    public final im f34641b;

    public gm(im imVar) {
        super("progress", 0);
        this.f34641b = imVar;
    }

    @Override
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).progress = f10;
        View view = this.f34641b.f35139b.N.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
