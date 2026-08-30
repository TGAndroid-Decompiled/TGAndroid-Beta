package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class pi0 extends f2.v {
    public final si0 f37344c;

    public pi0(si0 si0Var) {
        this.f37344c = si0Var;
    }

    @Override
    public final int i(int i10) {
        si0 si0Var = this.f37344c;
        ArrayList arrayList = si0Var.K;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l10 = si0Var.l(messageObject);
        if (l10 != null) {
            return l10.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
