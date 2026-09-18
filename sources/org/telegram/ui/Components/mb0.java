package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class mb0 extends g.p {
    public final yb0 f26395c;

    public mb0(yb0 yb0Var) {
        this.f26395c = yb0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            yb0 yb0Var = this.f26395c;
            if (i10 < yb0Var.f30540r.previewMessages.size() && (a2 = yb0.a(yb0Var, (messageObject = yb0Var.f30540r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
