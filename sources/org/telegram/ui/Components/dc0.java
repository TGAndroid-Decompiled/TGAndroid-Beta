package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class dc0 extends g.o {
    public final pc0 f24353c;

    public dc0(pc0 pc0Var) {
        this.f24353c = pc0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            pc0 pc0Var = this.f24353c;
            if (i10 < pc0Var.f28289r.previewMessages.size() && (a2 = pc0.a(pc0Var, (messageObject = pc0Var.f28289r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
