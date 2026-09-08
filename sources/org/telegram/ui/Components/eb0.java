package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class eb0 extends g.p {
    public final qb0 f25665c;

    public eb0(qb0 qb0Var) {
        this.f25665c = qb0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            qb0 qb0Var = this.f25665c;
            if (i10 < qb0Var.f29693r.previewMessages.size() && (a2 = qb0.a(qb0Var, (messageObject = qb0Var.f29693r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
