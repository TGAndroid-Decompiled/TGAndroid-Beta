package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class fm extends org.telegram.ui.Components.r6 {
    @Override
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentScale = f7;
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentScale);
    }
}
