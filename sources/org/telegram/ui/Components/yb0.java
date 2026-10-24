package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class yb0 extends g.o {
    public final jc0 f32876c;

    public yb0(jc0 jc0Var) {
        this.f32876c = jc0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            jc0 jc0Var = this.f32876c;
            if (i10 < jc0Var.f27677r.previewMessages.size() && (a2 = jc0.a(jc0Var, (messageObject = jc0Var.f27677r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
