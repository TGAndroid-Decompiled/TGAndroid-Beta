package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

public final class pa0 extends f2.w {

    public final ab0 f31574c;

    public pa0(ab0 ab0Var) {
        this.f31574c = ab0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages groupedMessagesA;
        if (i10 < 0) {
            return 1000;
        }
        ab0 ab0Var = this.f31574c;
        if (i10 >= ab0Var.f26718r.previewMessages.size() || (groupedMessagesA = ab0.a(ab0Var, (messageObject = ab0Var.f26718r.previewMessages.get(i10)))) == null) {
            return 1000;
        }
        return groupedMessagesA.getPosition(messageObject).spanSize;
    }
}
