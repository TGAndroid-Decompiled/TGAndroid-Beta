package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class nb0 extends g.p {
    public final yb0 f25482c;

    public nb0(yb0 yb0Var) {
        this.f25482c = yb0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            yb0 yb0Var = this.f25482c;
            if (i10 < yb0Var.f29298r.previewMessages.size() && (a2 = yb0.a(yb0Var, (messageObject = yb0Var.f29298r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
