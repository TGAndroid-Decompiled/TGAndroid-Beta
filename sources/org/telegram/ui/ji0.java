package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ji0 extends g.o {
    public final mi0 f38273c;

    public ji0(mi0 mi0Var) {
        this.f38273c = mi0Var;
    }

    @Override
    public final int i(int i10) {
        mi0 mi0Var = this.f38273c;
        ArrayList arrayList = mi0Var.M;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages k10 = mi0Var.k(messageObject);
        if (k10 != null) {
            return k10.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
