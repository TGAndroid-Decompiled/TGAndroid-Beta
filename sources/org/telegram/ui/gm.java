package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class gm extends org.telegram.ui.Components.r6 {
    public final im f34103b;

    public gm(im imVar) {
        super("progress", 0);
        this.f34103b = imVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f34103b.f34638b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
