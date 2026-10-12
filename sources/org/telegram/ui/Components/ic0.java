package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class ic0 extends g.o {
    public final tc0 f27141c;

    public ic0(tc0 tc0Var) {
        this.f27141c = tc0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            tc0 tc0Var = this.f27141c;
            if (i10 < tc0Var.f30860r.previewMessages.size() && (a2 = tc0.a(tc0Var, (messageObject = tc0Var.f30860r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
