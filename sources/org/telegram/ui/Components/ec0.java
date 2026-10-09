package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class ec0 extends g.o {
    public final pc0 f26034c;

    public ec0(pc0 pc0Var) {
        this.f26034c = pc0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            pc0 pc0Var = this.f26034c;
            if (i10 < pc0Var.f29849r.previewMessages.size() && (a2 = pc0.a(pc0Var, (messageObject = pc0Var.f29849r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
