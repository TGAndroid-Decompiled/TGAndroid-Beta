package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class gb0 extends f2.v {
    public final sb0 f27160c;

    public gb0(sb0 sb0Var) {
        this.f27160c = sb0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            sb0 sb0Var = this.f27160c;
            if (i10 < sb0Var.f31033r.previewMessages.size() && (a2 = sb0.a(sb0Var, (messageObject = sb0Var.f31033r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
