package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class fb0 extends f2.v {
    public final rb0 f24857c;

    public fb0(rb0 rb0Var) {
        this.f24857c = rb0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            rb0 rb0Var = this.f24857c;
            if (i10 < rb0Var.f28445r.previewMessages.size() && (a2 = rb0.a(rb0Var, (messageObject = rb0Var.f28445r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
