package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class xb0 extends g.o {
    public final ic0 f34718c;

    public xb0(ic0 ic0Var) {
        this.f34718c = ic0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            ic0 ic0Var = this.f34718c;
            if (i10 < ic0Var.f29309r.previewMessages.size() && (a2 = ic0.a(ic0Var, (messageObject = ic0Var.f29309r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
