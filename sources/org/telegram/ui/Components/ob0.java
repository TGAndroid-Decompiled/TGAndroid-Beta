package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class ob0 extends g.p {
    public final ac0 f27050c;

    public ob0(ac0 ac0Var) {
        this.f27050c = ac0Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 >= 0) {
            ac0 ac0Var = this.f27050c;
            if (i10 < ac0Var.f22628r.previewMessages.size() && (a2 = ac0.a(ac0Var, (messageObject = ac0Var.f22628r.previewMessages.get(i10)))) != null) {
                return a2.getPosition(messageObject).spanSize;
            }
            return 1000;
        }
        return 1000;
    }
}
