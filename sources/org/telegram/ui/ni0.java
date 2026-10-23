package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ni0 extends g.o {
    public final qi0 f39884c;

    public ni0(qi0 qi0Var) {
        this.f39884c = qi0Var;
    }

    @Override
    public final int i(int i10) {
        qi0 qi0Var = this.f39884c;
        ArrayList arrayList = qi0Var.M;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages k10 = qi0Var.k(messageObject);
        if (k10 != null) {
            return k10.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
