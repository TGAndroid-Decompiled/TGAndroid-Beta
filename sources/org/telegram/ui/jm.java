package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class jm extends org.telegram.ui.Components.m6 {
    public final km f35321b;

    public jm(km kmVar) {
        super("alpha", 0);
        this.f35321b = kmVar;
    }

    @Override
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f10;
        View view = this.f35321b.f35557b.N.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
