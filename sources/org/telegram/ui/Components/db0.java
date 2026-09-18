package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class db0 extends g.p {
    public final pb0 f23311c;

    public db0(pb0 pb0Var) {
        this.f23311c = pb0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            pb0 pb0Var = this.f23311c;
            if (i10 < pb0Var.f26994r.previewMessages.size() && (a2 = pb0.a(pb0Var, (messageObject = pb0Var.f26994r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
