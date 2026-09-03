package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class im extends org.telegram.ui.Components.m6 {
    public final km f34998b;

    public im(km kmVar) {
        super("progress", 0);
        this.f34998b = kmVar;
    }

    @Override
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).progress = f10;
        View view = this.f34998b.f35557b.N.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
