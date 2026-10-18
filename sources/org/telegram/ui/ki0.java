package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ki0 extends g.o {
    public final ni0 f38529c;

    public ki0(ni0 ni0Var) {
        this.f38529c = ni0Var;
    }

    @Override
    public final int i(int i10) {
        ni0 ni0Var = this.f38529c;
        ArrayList arrayList = ni0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = ni0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
