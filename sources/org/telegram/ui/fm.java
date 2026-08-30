package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class fm extends org.telegram.ui.Components.m6 {
    public final im f34276b;

    public fm(im imVar) {
        super("p2", 0);
        this.f34276b = imVar;
    }

    @Override
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).currentX = f10;
        View view = this.f34276b.f35139b.N.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
