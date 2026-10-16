package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class dj0 extends g.o {
    public final gj0 f35064c;

    public dj0(gj0 gj0Var) {
        this.f35064c = gj0Var;
    }

    @Override
    public final int i(int i10) {
        gj0 gj0Var = this.f35064c;
        ArrayList arrayList = gj0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = gj0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
