package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class li0 extends g.o {
    public final oi0 f38880c;

    public li0(oi0 oi0Var) {
        this.f38880c = oi0Var;
    }

    @Override
    public final int i(int i10) {
        oi0 oi0Var = this.f38880c;
        ArrayList arrayList = oi0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = oi0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
