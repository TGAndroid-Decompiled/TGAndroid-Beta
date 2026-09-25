package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class fm extends org.telegram.ui.Components.r6 {
    public final im f33699b;

    public fm(im imVar) {
        super("p2", 0);
        this.f33699b = imVar;
    }

    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f33699b.f34544b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
