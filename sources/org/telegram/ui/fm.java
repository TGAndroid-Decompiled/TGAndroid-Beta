package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class fm extends org.telegram.ui.Components.m6 {
    public final im f36815b;

    public fm(im imVar) {
        super("p2", 0);
        this.f36815b = imVar;
    }

    @Override
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).currentX = f10;
        View view = this.f36815b.f37743b.N.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
