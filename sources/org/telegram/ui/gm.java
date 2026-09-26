package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class gm extends org.telegram.ui.Components.r6 {
    public final im f33961b;

    public gm(im imVar) {
        super("progress", 0);
        this.f33961b = imVar;
    }

    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f33961b.f34542b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
