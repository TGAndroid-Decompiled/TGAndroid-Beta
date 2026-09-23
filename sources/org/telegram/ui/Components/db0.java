package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class db0 extends g.p {
    public final ob0 f23366c;

    public db0(ob0 ob0Var) {
        this.f23366c = ob0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            ob0 ob0Var = this.f23366c;
            if (i10 < ob0Var.f26711r.previewMessages.size() && (a2 = ob0.a(ob0Var, (messageObject = ob0Var.f26711r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
