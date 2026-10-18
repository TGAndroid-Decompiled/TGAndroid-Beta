package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class cm extends org.telegram.ui.Components.s6 {
    public final em f35941b;

    public cm(em emVar) {
        super("progress", 0);
        this.f35941b = emVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f35941b.f36555b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
