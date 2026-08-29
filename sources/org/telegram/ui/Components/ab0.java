package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class ab0 extends f2.v {
    public final lb0 f26734c;

    public ab0(lb0 lb0Var) {
        this.f26734c = lb0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            lb0 lb0Var = this.f26734c;
            if (i10 < lb0Var.f30279r.previewMessages.size() && (a2 = lb0.a(lb0Var, (messageObject = lb0Var.f30279r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
