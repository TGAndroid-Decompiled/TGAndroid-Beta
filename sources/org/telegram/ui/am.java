package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class am extends org.telegram.ui.Components.q6 {
    public final dm f36569b;

    public am(dm dmVar) {
        super("progress", 0);
        this.f36569b = dmVar;
    }

    @Override
    public final void b(Object obj, float f9) {
        ((MessageObject.SendAnimationData) obj).progress = f9;
        View view = this.f36569b.f37560b.M.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
