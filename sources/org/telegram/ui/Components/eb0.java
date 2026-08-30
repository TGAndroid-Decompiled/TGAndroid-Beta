package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class eb0 extends f2.v {
    public final qb0 f24548c;

    public eb0(qb0 qb0Var) {
        this.f24548c = qb0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            qb0 qb0Var = this.f24548c;
            if (i10 < qb0Var.f28107r.previewMessages.size() && (a2 = qb0.a(qb0Var, (messageObject = qb0Var.f28107r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
