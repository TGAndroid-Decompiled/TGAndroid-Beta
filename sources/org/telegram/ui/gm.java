package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class gm extends org.telegram.ui.Components.r6 {
    public final im f36701b;

    public gm(im imVar) {
        super("progress", 0);
        this.f36701b = imVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f36701b.f37452b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
