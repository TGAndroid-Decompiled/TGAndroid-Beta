package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class ac0 extends g.o {
    public final lc0 f24687c;

    public ac0(lc0 lc0Var) {
        this.f24687c = lc0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            lc0 lc0Var = this.f24687c;
            if (i10 < lc0Var.f28343r.previewMessages.size() && (a2 = lc0.a(lc0Var, (messageObject = lc0Var.f28343r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
