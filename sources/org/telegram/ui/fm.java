package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class fm extends org.telegram.ui.Components.u6 {
    public final gm f39398b;

    public fm(gm gmVar) {
        super("alpha", 0);
        this.f39398b = gmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.f39398b.f39647b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
