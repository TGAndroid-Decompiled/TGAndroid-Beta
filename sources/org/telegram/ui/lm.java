package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class lm extends org.telegram.ui.Components.s6 {
    public final nm f38404b;

    public lm(nm nmVar) {
        super("progress", 0);
        this.f38404b = nmVar;
    }

    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.f38404b.f38984b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
