package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class wb0 extends g.o {
    public final hc0 f34399c;

    public wb0(hc0 hc0Var) {
        this.f34399c = hc0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            hc0 hc0Var = this.f34399c;
            if (i10 < hc0Var.f28920r.previewMessages.size() && (a2 = hc0.a(hc0Var, (messageObject = hc0Var.f28920r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
