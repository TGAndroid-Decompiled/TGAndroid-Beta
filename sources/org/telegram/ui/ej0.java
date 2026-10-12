package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ej0 extends g.o {
    public final hj0 f35620c;

    public ej0(hj0 hj0Var) {
        this.f35620c = hj0Var;
    }

    @Override
    public final int i(int i10) {
        hj0 hj0Var = this.f35620c;
        ArrayList arrayList = hj0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = hj0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
