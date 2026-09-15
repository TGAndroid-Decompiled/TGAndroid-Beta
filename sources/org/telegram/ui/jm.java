package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class jm extends org.telegram.ui.Components.p6 {
    public final mm f34938b;

    public jm(mm mmVar) {
        super("p2", 0);
        this.f34938b = mmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f34938b.f35772b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
