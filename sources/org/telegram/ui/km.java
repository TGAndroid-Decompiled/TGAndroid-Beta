package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class km extends org.telegram.ui.Components.p6 {
    public final mm f35185b;

    public km(mm mmVar) {
        super("progress", 0);
        this.f35185b = mmVar;
    }

    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f35185b.f35774b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
