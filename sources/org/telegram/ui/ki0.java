package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ki0 extends g.o {
    public final ni0 f40948c;

    public ki0(ni0 ni0Var) {
        this.f40948c = ni0Var;
    }

    @Override
    public final int i(int i10) {
        ni0 ni0Var = this.f40948c;
        ArrayList arrayList = ni0Var.M;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages k10 = ni0Var.k(messageObject);
        if (k10 != null) {
            return k10.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
