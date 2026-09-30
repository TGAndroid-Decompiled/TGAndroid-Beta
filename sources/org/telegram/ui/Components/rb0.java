package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class rb0 extends g.p {
    public final cc0 f27938c;

    public rb0(cc0 cc0Var) {
        this.f27938c = cc0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            cc0 cc0Var = this.f27938c;
            if (i10 < cc0Var.f23267r.previewMessages.size() && (a2 = cc0.a(cc0Var, (messageObject = cc0Var.f23267r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
