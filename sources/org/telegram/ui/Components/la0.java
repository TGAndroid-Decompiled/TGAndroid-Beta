package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class la0 extends f2.x {
    public final wa0 f30409c;

    public la0(wa0 wa0Var) {
        this.f30409c = wa0Var;
    }

    @Override
    public final int i(int i9) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i9 >= 0) {
            wa0 wa0Var = this.f30409c;
            if (i9 < wa0Var.f34174r.previewMessages.size() && (a2 = wa0.a(wa0Var, (messageObject = wa0Var.f34174r.previewMessages.get(i9)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
