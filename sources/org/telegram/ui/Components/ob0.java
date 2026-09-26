package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class ob0 extends g.p {
    public final zb0 f27020c;

    public ob0(zb0 zb0Var) {
        this.f27020c = zb0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            zb0 zb0Var = this.f27020c;
            if (i10 < zb0Var.f30842r.previewMessages.size() && (a2 = zb0.a(zb0Var, (messageObject = zb0Var.f30842r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
