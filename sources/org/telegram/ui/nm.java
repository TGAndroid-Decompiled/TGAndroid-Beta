package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class nm extends org.telegram.ui.Components.t6 {
    public final pm f40434b;

    public nm(pm pmVar) {
        super("progress", 0);
        this.f40434b = pmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f40434b.f40996b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
