package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class am extends org.telegram.ui.Components.s6 {
    public final cm f35386b;

    public am(cm cmVar) {
        super("progress", 0);
        this.f35386b = cmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f35386b.f36008b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
