package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class hm extends org.telegram.ui.Components.m6 {
    public final km f34692b;

    public hm(km kmVar) {
        super("p2", 0);
        this.f34692b = kmVar;
    }

    @Override
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).currentX = f10;
        View view = this.f34692b.f35557b.N.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
