package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class qb0 extends g.p {
    public final bc0 f27641c;

    public qb0(bc0 bc0Var) {
        this.f27641c = bc0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            bc0 bc0Var = this.f27641c;
            if (i10 < bc0Var.f22953r.previewMessages.size() && (a2 = bc0.a(bc0Var, (messageObject = bc0Var.f22953r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
