package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class qb0 extends g.p {
    public final cc0 f29991c;

    public qb0(cc0 cc0Var) {
        this.f29991c = cc0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            cc0 cc0Var = this.f29991c;
            if (i10 < cc0Var.f25325r.previewMessages.size() && (a2 = cc0.a(cc0Var, (messageObject = cc0Var.f25325r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
