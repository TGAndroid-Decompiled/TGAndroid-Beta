package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class mi0 extends g.o {
    public final pi0 f41450c;

    public mi0(pi0 pi0Var) {
        this.f41450c = pi0Var;
    }

    @Override
    public final int i(int i10) {
        pi0 pi0Var = this.f41450c;
        ArrayList arrayList = pi0Var.M;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages k10 = pi0Var.k(messageObject);
        if (k10 != null) {
            return k10.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
