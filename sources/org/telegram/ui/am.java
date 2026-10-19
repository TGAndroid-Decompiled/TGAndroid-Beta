package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class am extends org.telegram.ui.Components.s6 {
    public final cm f35380b;

    public am(cm cmVar) {
        super("progress", 0);
        this.f35380b = cmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f35380b.f36002b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
