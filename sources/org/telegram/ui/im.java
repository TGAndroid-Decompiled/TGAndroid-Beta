package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class im extends org.telegram.ui.Components.q6 {
    public final km f34617b;

    public im(km kmVar) {
        super("progress", 0);
        this.f34617b = kmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f34617b.f35210b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
