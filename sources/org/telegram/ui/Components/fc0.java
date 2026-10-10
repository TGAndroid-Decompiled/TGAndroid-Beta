package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class fc0 extends g.o {
    public final qc0 f26387c;

    public fc0(qc0 qc0Var) {
        this.f26387c = qc0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            qc0 qc0Var = this.f26387c;
            if (i10 < qc0Var.f30187r.previewMessages.size() && (a2 = qc0.a(qc0Var, (messageObject = qc0Var.f30187r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
