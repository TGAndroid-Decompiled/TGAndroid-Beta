package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class bj0 extends g.o {
    public final ej0 f36186c;

    public bj0(ej0 ej0Var) {
        this.f36186c = ej0Var;
    }

    @Override
    public final int i(int i10) {
        ej0 ej0Var = this.f36186c;
        ArrayList arrayList = ej0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = ej0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
