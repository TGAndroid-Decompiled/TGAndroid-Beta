package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class lb0 extends g.p {
    public final xb0 f26095c;

    public lb0(xb0 xb0Var) {
        this.f26095c = xb0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            xb0 xb0Var = this.f26095c;
            if (i10 < xb0Var.f30232r.previewMessages.size() && (a2 = xb0.a(xb0Var, (messageObject = xb0Var.f30232r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
